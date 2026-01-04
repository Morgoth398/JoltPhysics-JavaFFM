package volucris.engine.physics.jolt;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.ValidateResult;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.body.BodyEnums.MotionQuality;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.raycast.CollideShapeResult;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A listener class that receives collision contact events. It can be registered
 * through {@link PhysicsSystem#setContactListener(ContactListener)}. Only a
 * single contact listener can be registered. A common pattern is to create a
 * contact listener that casts {@link Body#getUserData()} to a game object and
 * then forwards the call to a handler specific for that game object. Typically
 * this is done on both objects involved in a collision event.
 * <p>
 * Note that contact listener callbacks are called from multiple threads at the
 * same time when all bodies are locked, this means you cannot use
 * PhysicsSystem::GetBodyInterface / PhysicsSystem::GetBodyLockInterface but
 * must use PhysicsSystem::GetBodyInterfaceNoLock /
 * PhysicsSystem::GetBodyLockInterfaceNoLock instead. If you use a locking
 * interface, the simulation will deadlock. You're only allowed to read from the
 * bodies and you can't change physics state. During OnContactRemoved you cannot
 * access the bodies at all, see the comments at that function.
 * <p>
 * While a callback can come from multiple threads, all callbacks relating to a
 * single body pair are serialized. For {@link MotionQuality#DISCRETE} bodies,
 * during every 'collision step' in a PhysicsSystem::Update, you will receive at
 * most one OnContactAdded/Persisted/Removed call per body/sub shape pair. For
 * {@link MotionQuality#LINEAR_CAST} bodies, you may get an OnContactAdded
 * followed by an OnContactPersisted for the same body/sub shape pair. This
 * happens when a body collides both in the discrete and the continuous
 * collision detection stage.
 */
public abstract class ContactListener {

	private static final ArrayList<WeakReference<ContactListener>> CONTACT_LISTENERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CONTACT_LISTENER_SET_PROCS;
	private static final MethodHandle JPH_CONTACT_LISTENER_CREATE;
	private static final MethodHandle JPH_CONTACT_LISTENER_DESTROY;

	private static final VarHandle ON_CONTACT_VALIDATE;
	private static final VarHandle ON_CONTACT_ADDED;
	private static final VarHandle ON_CONTACT_PERSISTED;
	private static final VarHandle ON_CONTACT_REMOVED;

	private static final MemorySegment JPH_CONTACT_LISTENER_PROCS;

	private static MemorySegment ON_CONTACT_VALIDATE_ADDR;
	private static MemorySegment ON_CONTACT_ADDED_ADDR;
	private static MemorySegment ON_CONTACT_PERSISTED_ADDR;
	private static MemorySegment ON_CONTACT_REMOVED_ADDR;

	private static int count;

	private final MemorySegment jphContactListener;
	private final MemorySegment userData;

	private ContactManifold manifold;
	private CollideShapeResult result;
	private ContactSettings settings;
	private SubShapeIDPair pair;

	private Vector3f vector;

	private Vec3 vecTmp;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("OnContactValidate"),
				ADDRESS.withName("OnContactAdded"),
				ADDRESS.withName("OnContactPersisted"),
				ADDRESS.withName("OnContactRemoved")
			).withName("JPH_ShapeFilter_Procs");
		//@formatter:on

		ON_CONTACT_VALIDATE = varHandle(LAYOUT, "OnContactValidate");
		ON_CONTACT_ADDED = varHandle(LAYOUT, "OnContactAdded");
		ON_CONTACT_PERSISTED = varHandle(LAYOUT, "OnContactPersisted");
		ON_CONTACT_REMOVED = varHandle(LAYOUT, "OnContactRemoved");

		JPH_CONTACT_LISTENER_SET_PROCS = downcallHandleVoid("JPH_ContactListener_SetProcs", ADDRESS);
		JPH_CONTACT_LISTENER_CREATE = downcallHandle("JPH_ContactListener_Create", ADDRESS, ADDRESS);
		JPH_CONTACT_LISTENER_DESTROY = downcallHandleVoid("JPH_ContactListener_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_CONTACT_LISTENER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		CONTACT_LISTENERS = new ArrayList<WeakReference<ContactListener>>();
	}

	public ContactListener() {
		this(Arena.ofAuto());
	}
	
	public ContactListener(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_CONTACT_LISTENER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphContactListener = segment.reinterpret(arena, s -> destroy(s));

			CONTACT_LISTENERS.add(index, new WeakReference<ContactListener>(this));

			manifold = new ContactManifold(arena);
			result = new CollideShapeResult(arena);
			settings = new ContactSettings(arena);
			pair = new SubShapeIDPair(arena);

			vecTmp = new Vec3(arena);

			vector = new Vector3f();

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create contact listener.");
		}
	}

	//@formatter:off
	/**
	 * Called after detecting a collision between a body pair, but before calling
	 * OnContactAdded and before adding the contact constraint. If the function
	 * rejects the contact, the contact will not be processed by the simulation.
	 * This is a rather expensive time to reject a contact point since a lot of the
	 * collision detection has happened already, make sure you filter out the
	 * majority of undesired body pairs through the ObjectLayerPairFilter that is
	 * registered on the PhysicsSystem.
	 * <p>
	 * This function may not be called again the next update if a contact persists
	 * and no new contact pairs between sub shapes are found.
	 * <p>
	 * Note that this callback is called when all bodies are locked, so don't use
	 * any locking functions! See detailed class description of ContactListener.
	 * <p>
	 * Body 1 will have a motion type that is larger or equal than body 2's motion
	 * type (order from large to small: dynamic -> kinematic -> static). When motion
	 * types are equal, they are ordered by BodyID.
	 * <p>
	 * The collision result (inCollisionResult) is reported relative to
	 * inBaseOffset.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract ValidateResult onContactValidate(Body body1, Body body2, Vector3f baseOffset, CollideShapeResult result);

	/**
	 * Called whenever a new contact point is detected.
	 * <p>
	 * Note that this callback is called when all bodies are locked, so don't use
	 * any locking functions! See detailed class description of ContactListener.
	 * <p>
	 * Body 1 and 2 will be sorted such that body {@code 1 ID < body 2 ID} so body 1 may
	 * not be dynamic.
	 * <p>
	 * Note that only active bodies will report contacts, as soon as a body goes to
	 * sleep the contacts between that body and all other bodies will receive an
	 * OnContactRemoved callback, if this is the case then Body::IsActive() will
	 * return false during the callback.
	 * <p>
	 * When contacts are added, the constraint solver has not run yet, so the
	 * collision impulse is unknown at that point. The velocities of inBody1 and
	 * inBody2 are the velocities before the contact has been resolved, so you can
	 * use this to estimate the collision impulse to e.g. determine the volume of
	 * the impact sound to play (see: EstimateCollisionResponse).
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract void onContactAdded(Body body1, Body body2, ContactManifold manifold, ContactSettings settings);

	/**
	 * Called whenever a contact is detected that was also detected last update.
	 * <p>
	 * Note that this callback is called when all bodies are locked, so don't use
	 * any locking functions! See detailed class description of ContactListener.
	 * <p>
	 * Body 1 and 2 will be sorted such that body {@code 1 ID < body 2 ID} so body 1 may
	 * not be dynamic.
	 * <p>
	 * If the structure of the shape of a body changes between simulation steps
	 * (e.g. by adding/removing a child shape of a compound shape), it is possible
	 * that the same sub shape ID used to identify the removed child shape is now
	 * reused for a different child shape. The physics system cannot detect this, so
	 * may send a 'contact persisted' callback even though the contact is now on a
	 * different child shape. You can detect this by keeping the old shape (before
	 * adding/removing a part) around until the next PhysicsSystem::Update (when the
	 * OnContactPersisted callbacks are triggered) and resolving the sub shape ID
	 * against both the old and new shape to see if they still refer to the same
	 * child shape.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 */
	public abstract void onContactPersisted(Body body1, Body body2, ContactManifold manifold, ContactSettings settings);

	/**
	 * Called whenever a contact was detected last update but is not detected
	 * anymore.
	 * <p>
	 * You cannot access the bodies at the time of this callback because:
	 * <ul>
	 * <li>All bodies are locked at the time of this callback.
	 * <li>Some properties of the bodies are being modified from another thread at
	 * the same time.
	 * <li>The body may have been removed and destroyed (you'll receive an
	 * OnContactRemoved callback in the PhysicsSystem::Update after the body has
	 * been removed).
	 * </ul>
	 * Cache what you need in the OnContactAdded and OnContactPersisted callbacks
	 * and store it in a separate structure to use during this callback.
	 * Alternatively, you could just record that the contact was removed and process
	 * it after PhysicsSystem::Update.
	 * <p>
	 * Body 1 and 2 will be sorted such that body {@code 1 ID < body 2 ID} so body 1 may
	 * not be dynamic.
	 * <p>
	 * The sub shape IDs were created in the previous simulation step, so if the
	 * structure of a shape changes (e.g. by adding/removing a child shape of a
	 * compound shape), the sub shape ID may not be valid / may not point to the
	 * same sub shape anymore. If you want to know if this is the last contact
	 * between the two bodies, use PhysicsSystem::WereBodiesInContact.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 */
	public abstract void onContactRemoved(SubShapeIDPair subShapePair);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_CONTACT_LISTENER_SET_PROCS;
			method.invokeExact(JPH_CONTACT_LISTENER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set contact listener procs.");
		}
	}

	private static void fillProcs(Arena arena) {
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(ContactListener.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		AddressLayout VEC3_ADDRESS = ADDRESS.withTargetLayout(Vec3.LAYOUT());
		
		FunctionDescriptor onContactValidate = functionDescr(JAVA_INT, INT_ADDRESS, ADDRESS, ADDRESS, VEC3_ADDRESS,	ADDRESS.withTargetLayout(CollideShapeResult.LAYOUT()));
		FunctionDescriptor onContactAdded = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS.withTargetLayout(ContactSettings.LAYOUT()));
		FunctionDescriptor onContactPersisted = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS.withTargetLayout(ContactSettings.LAYOUT()));
		FunctionDescriptor onContactRemoved = functionDescrVoid(INT_ADDRESS, ADDRESS.withTargetLayout(SubShapeIDPair.LAYOUT()));
		
		MethodHandle onContactValidateHandle = upcallHandleStatic(lookup, ContactListener.class, "onContactValidate", onContactValidate);
		MethodHandle onContactAddedHandle = upcallHandleStatic(lookup, ContactListener.class, "onContactAdded", onContactAdded);
		MethodHandle onContactPersistedHandle = upcallHandleStatic(lookup, ContactListener.class, "onContactPersisted", onContactPersisted);
		MethodHandle onContactRemovedHandle = upcallHandleStatic(lookup, ContactListener.class, "onContactRemoved", onContactRemoved);
		
		ON_CONTACT_VALIDATE_ADDR = upcallStub(onContactValidateHandle, onContactValidate, arena);
		ON_CONTACT_ADDED_ADDR = upcallStub(onContactAddedHandle, onContactAdded, arena);
		ON_CONTACT_PERSISTED_ADDR = upcallStub(onContactPersistedHandle, onContactPersisted, arena);
		ON_CONTACT_REMOVED_ADDR = upcallStub(onContactRemovedHandle, onContactRemoved, arena);
		
		ON_CONTACT_VALIDATE.set(JPH_CONTACT_LISTENER_PROCS, ON_CONTACT_VALIDATE_ADDR);
		ON_CONTACT_ADDED.set(JPH_CONTACT_LISTENER_PROCS, ON_CONTACT_ADDED_ADDR);
		ON_CONTACT_PERSISTED.set(JPH_CONTACT_LISTENER_PROCS, ON_CONTACT_PERSISTED_ADDR);
		ON_CONTACT_REMOVED.set(JPH_CONTACT_LISTENER_PROCS, ON_CONTACT_REMOVED_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_CONTACT_LISTENER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy contact listener.");
		}
	}

	@SuppressWarnings("unused")
	private static int onContactValidate(MemorySegment userData, MemorySegment body1, MemorySegment body2,
			MemorySegment baseOffset, MemorySegment collisionResult) {

		ContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		Body firstBody = Jolt.getBody(body1.address());
		if (firstBody == null && !body1.equals(MemorySegment.NULL))
			firstBody = new Body(body1);

		Body secondBody = Jolt.getBody(body2.address());
		if (secondBody == null && !body2.equals(MemorySegment.NULL))
			firstBody = new Body(body2);

		listener.vecTmp.set(baseOffset);
		Vector3f offset = listener.vecTmp.get(listener.vector);

		listener.result.set(collisionResult);

		ValidateResult result = listener.onContactValidate(firstBody, secondBody, offset, listener.result);

		return result.id();
	}

	@SuppressWarnings("unused")
	private static void onContactAdded(MemorySegment userData, MemorySegment body1, MemorySegment body2,
			MemorySegment manifold, MemorySegment settings) {

		ContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		Body firstBody = Jolt.getBody(body1.address());
		if (firstBody == null && !body1.equals(MemorySegment.NULL))
			firstBody = new Body(body1);

		Body secondBody = Jolt.getBody(body2.address());
		if (secondBody == null && !body2.equals(MemorySegment.NULL))
			firstBody = new Body(body2);

		listener.manifold.set(manifold);
		listener.settings.set(settings);

		listener.onContactAdded(firstBody, secondBody, listener.manifold, listener.settings);
	}

	@SuppressWarnings("unused")
	private static void onContactPersisted(MemorySegment userData, MemorySegment body1, MemorySegment body2,
			MemorySegment manifold, MemorySegment settings) {

		ContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		Body firstBody = Jolt.getBody(body1.address());
		if (firstBody == null && !body1.equals(MemorySegment.NULL))
			firstBody = new Body(body1);

		Body secondBody = Jolt.getBody(body2.address());
		if (secondBody == null && !body2.equals(MemorySegment.NULL))
			firstBody = new Body(body2);

		listener.manifold.set(manifold);
		listener.settings.set(settings);

		listener.onContactPersisted(firstBody, secondBody, listener.manifold, listener.settings);
	}

	@SuppressWarnings("unused")
	private static void onContactRemoved(MemorySegment userData, MemorySegment subShapePair) {

		ContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		listener.pair.set(subShapePair);

		listener.onContactRemoved(listener.pair);
	}

	public MemorySegment memorySegment() {
		return jphContactListener;
	}

}
