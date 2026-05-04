package volucris.engine.physics.jolt.character;

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

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * This class receives callbacks when a virtual character hits something. Once
 * created, register it on a CharacterVirtual by using the character's
 * SetListener method.
 */
public abstract class CharacterContactListener {

	private static final ArrayList<WeakReference<CharacterContactListener>> CONTACT_LISTENERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS;
	private static final MethodHandle JPH_CHARACTER_CONTACT_LISTENER_CREATE;
	private static final MethodHandle JPH_CHARACTER_CONTACT_LISTENER_DESTROY;

	private static final VarHandle ON_ADJUST_BODY_VELOCITY;
	private static final VarHandle ON_CONTACT_VALIDATE;
	private static final VarHandle ON_CHARACTER_CONTACT_VALIDATE;
	private static final VarHandle ON_CONTACT_ADDED;
	private static final VarHandle ON_CONTACT_PERSISTED;
	private static final VarHandle ON_CONTACT_REMOVED;
	private static final VarHandle ON_CHARACTER_CONTACT_ADDED;
	private static final VarHandle ON_CHARACTER_CONTACT_PERSISTED;
	private static final VarHandle ON_CHARACTER_CONTACT_REMOVED;
	private static final VarHandle ON_CONTACT_SOLVE;
	private static final VarHandle ON_CHARACTER_CONTACT_SOLVE;

	private static final MemorySegment JPH_CHARACTER_CONTACT_LISTENER_PROCS;

	private static MemorySegment ON_ADJUST_BODY_VELOCITY_ADDR;
	private static MemorySegment ON_CONTACT_VALIDATE_ADDR;
	private static MemorySegment ON_CHARACTER_CONTACT_VALIDATE_ADDR;
	private static MemorySegment ON_CONTACT_ADDED_ADDR;
	private static MemorySegment ON_CONTACT_PERSISTED_ADDR;
	private static MemorySegment ON_CONTACT_REMOVED_ADDR;
	private static MemorySegment ON_CHARACTER_CONTACT_ADDED_ADDR;
	private static MemorySegment ON_CHARACTER_CONTACT_PERSISTED_ADDR;
	private static MemorySegment ON_CHARACTER_CONTACT_REMOVED_ADDR;
	private static MemorySegment ON_CONTACT_SOLVE_ADDR;
	private static MemorySegment ON_CHARACTER_CONTACT_SOLVE_ADDR;

	private static int count;

	private final MemorySegment jphCharacterContactListener;
	private final MemorySegment userData;

	private CharacterContactSettings settings;

	private Vector3f vectorTmp;
	private Vector3f vectorTmp2;
	private Vector3f vectorTmp3;
	private Vector3f vectorTmp4;
	private Vector3f vectorTmp5;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ADDRESS.withName("OnAdjustBodyVelocity"),
		        ADDRESS.withName("OnContactValidate"),
		        ADDRESS.withName("OnCharacterContactValidate"),
		        ADDRESS.withName("OnContactAdded"),
		        ADDRESS.withName("OnContactPersisted"),
		        ADDRESS.withName("OnContactRemoved"),
		        ADDRESS.withName("OnCharacterContactAdded"),
		        ADDRESS.withName("OnCharacterContactPersisted"),
		        ADDRESS.withName("OnCharacterContactRemoved"),
		        ADDRESS.withName("OnContactSolve"),
		        ADDRESS.withName("OnCharacterContactSolve")
			).withName("JPH_CharacterContactListener_Procs");
		
		JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS = downcallHandleVoid("JPH_CharacterContactListener_SetProcs", ADDRESS);
		JPH_CHARACTER_CONTACT_LISTENER_CREATE = downcallHandle("JPH_CharacterContactListener_Create", ADDRESS, ADDRESS);
		JPH_CHARACTER_CONTACT_LISTENER_DESTROY = downcallHandleVoid("JPH_CharacterContactListener_Destroy", ADDRESS);
		//@formatter:on

		ON_ADJUST_BODY_VELOCITY = varHandle(LAYOUT, "OnAdjustBodyVelocity");
		ON_CONTACT_VALIDATE = varHandle(LAYOUT, "OnContactValidate");
		ON_CHARACTER_CONTACT_VALIDATE = varHandle(LAYOUT, "OnCharacterContactValidate");
		ON_CONTACT_ADDED = varHandle(LAYOUT, "OnContactAdded");
		ON_CONTACT_PERSISTED = varHandle(LAYOUT, "OnContactPersisted");
		ON_CONTACT_REMOVED = varHandle(LAYOUT, "OnContactRemoved");
		ON_CHARACTER_CONTACT_ADDED = varHandle(LAYOUT, "OnCharacterContactAdded");
		ON_CHARACTER_CONTACT_PERSISTED = varHandle(LAYOUT, "OnCharacterContactPersisted");
		ON_CHARACTER_CONTACT_REMOVED = varHandle(LAYOUT, "OnCharacterContactRemoved");
		ON_CONTACT_SOLVE = varHandle(LAYOUT, "OnContactSolve");
		ON_CHARACTER_CONTACT_SOLVE = varHandle(LAYOUT, "OnCharacterContactSolve");

		Arena arena = Arena.ofAuto();

		JPH_CHARACTER_CONTACT_LISTENER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		CONTACT_LISTENERS = new ArrayList<WeakReference<CharacterContactListener>>();
	}

	public CharacterContactListener() {
		this(Arena.ofAuto());
	}
	
	public CharacterContactListener(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphCharacterContactListener = segment.reinterpret(arena, s -> destroy(s));

			CONTACT_LISTENERS.add(index, new WeakReference<CharacterContactListener>(this));

			vecTmp = new Vec3(arena);

			vectorTmp = new Vector3f();
			vectorTmp2 = new Vector3f();
			vectorTmp3 = new Vector3f();
			vectorTmp4 = new Vector3f();
			vectorTmp5 = new Vector3f();

			settings = new CharacterContactSettings(arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create character contact listener.");
		}

	}

	/**
	 * Callback to adjust the velocity of a body as seen by the character. Can be
	 * adjusted to e.g. implement a conveyor belt or an inertial dampener system of
	 * a sci-fi space ship. Note that body2 is locked during the callback so you can
	 * read its properties freely.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void onAdjustBodyVelocity(CharacterVirtual character, Body body2, Vector3f linearVelocity,
			Vector3f angularVelocity);

	/**
	 * Checks if a character can collide with specified body. Return true if the
	 * contact is valid.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract boolean onContactValidate(CharacterVirtual character, int bodyId2, int subShapeId2);

	/**
	 * Same as {@link #onContactValidate(CharacterVirtual, int, int)
	 * onContactValidate} but when colliding with a CharacterVirtual.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract boolean onCharacterContactValidate(CharacterVirtual character, CharacterVirtual otherCharacter,
			int subShapeId);

	/**
	 * Called whenever the character collides with a body for the first time.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character       Character that is being solved
	 * @param bodyId2         ID of body that is being hit
	 * @param subShapeId      Sub shape ID of shape that is being hit
	 * @param contactPosition World space contact position
	 * @param contactNormal   World space contact normal
	 * @param settings        Settings returned by the contact callback to indicate
	 *                        how the character should behave
	 */
	protected abstract void onContactAdded(CharacterVirtual character, int bodyId2, int subShapeId,
			Vector3f contactPosition, Vector3f contactNormal, CharacterContactSettings settings);

	/**
	 * Called whenever the character persists colliding with a body.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character       Character that is being solved
	 * @param bodyId2         ID of body that is being hit
	 * @param subShapeId      Sub shape ID of shape that is being hit
	 * @param contactPosition World space contact position
	 * @param contactNormal   World space contact normal
	 * @param settings        Settings returned by the contact callback to indicate
	 *                        how the character should behave
	 */
	protected abstract void onContactPersisted(CharacterVirtual character, int bodyId2, int subShapeId,
			Vector3f contactPosition, Vector3f contactNormal, CharacterContactSettings settings);

	/**
	 * Called whenever the character loses contact with a body. Note that there is
	 * no guarantee that the body or its sub shape still exists at this point. The
	 * body may have been deleted since the last update.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character  Character that is being solved
	 * @param bodyId2    Id of the body that is being hit
	 * @param subShapeId Sub shape ID of shape that is being hit
	 */
	protected abstract void onContactRemoved(CharacterVirtual character, int bodyId2, int subShapeId);

	/**
	 * Same as
	 * {@link #onContactAdded(CharacterVirtual, int, int, Vector3f, Vector3f, CharacterContactSettings)
	 * OnContactAdded} but when colliding with a CharacterVirtual.
	 */
	protected abstract void onCharacterContactAdded(CharacterVirtual character, CharacterVirtual otherCharacter,
			int subShapeId2, Vector3f contactPosition, Vector3f contactNormal, CharacterContactSettings settings);

	/**
	 * Same as
	 * {@link #onContactPersisted(CharacterVirtual, int, int, Vector3f, Vector3f, CharacterContactSettings)
	 * OnContactPersisted} but when colliding with a CharacterVirtual.
	 */
	protected abstract void onCharacterContactPersisted(CharacterVirtual character, CharacterVirtual otherCharacter,
			int subShapeId2, Vector3f contactPosition, Vector3f contactNormal, CharacterContactSettings settings);

	/**
	 * Same as {@link #onContactRemoved(CharacterVirtual, int, int)
	 * OnContactRemoved} but when colliding with a CharacterVirtual. Note that
	 * otherCharacterID can be the ID of a character that has been deleted. This
	 * happens if the character was in contact with this character during the last
	 * update, but has been deleted since.
	 */
	protected abstract void onCharacterContactRemoved(CharacterVirtual character, int otherCharacterId, int subShapeId);

	/**
	 * Called whenever a contact is being used by the solver. Allows the listener to
	 * override the resulting character velocity (e.g. by preventing sliding along
	 * certain surfaces).
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character            Character that is being solved
	 * @param bodyId2              ID of body that is being hit
	 * @param subShapeId2          Sub shape ID of shape that is being hit
	 * @param contactPosition      World space contact position
	 * @param contactNormal        World space contact normal
	 * @param contactVelocity      World space velocity of contact point (e.g. for a
	 *                             moving platform)
	 * @param contactMaterial      Material of contact point
	 * @param characterVelocity    World space velocity of the character prior to
	 *                             hitting this contact
	 * @param newCharacterVelocity Contains the calculated world space velocity of
	 *                             the character after hitting this contact, this
	 *                             velocity slides along the surface of the contact.
	 *                             Can be modified by the listener to provide an
	 *                             alternative velocity.
	 */
	protected abstract void onContactSolve(CharacterVirtual character, int bodyId2, int subShapeId2,
			Vector3f contactPosition, Vector3f contactNormal, Vector3f contactVelocity, PhysicsMaterial contactMaterial,
			Vector3f characterVelocity, Vector3f newCharacterVelocity);

	/**
	 * Same as
	 * {@link #onContactSolve(CharacterVirtual, int, int, Vector3f, Vector3f, Vector3f, PhysicsMaterial, Vector3f, Vector3f)
	 * OnContactSolve} but when colliding with a CharacterVirtual.
	 */
	protected abstract void onCharacterContactSolve(CharacterVirtual character, CharacterVirtual otherCharacter,
			int subShapeId, Vector3f contactPosition, Vector3f contactNormal, Vector3f contactVelocity,
			PhysicsMaterial contactMaterial, Vector3f characterVelocity, Vector3f newCharacterVelocity);

	//@formatter:off	
	private static void fillProcs(Arena arena) {
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(CharacterContactListener.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		AddressLayout VEC3_ADDRESS = ADDRESS.withTargetLayout(Vec3.LAYOUT());
		AddressLayout SETTINGS_ADDRESS = ADDRESS.withTargetLayout(CharacterContactSettings.LAYOUT());
		
		FunctionDescriptor onAdjustBodyVelocity = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS);
		FunctionDescriptor onContactValidate = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		FunctionDescriptor onCharacterContactValidate = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		FunctionDescriptor onContactAdded = functionDescrVoid(INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, SETTINGS_ADDRESS);
		FunctionDescriptor onContactPersisted = functionDescrVoid(INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, SETTINGS_ADDRESS);
		FunctionDescriptor onContactRemoved = functionDescrVoid(INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		FunctionDescriptor onCharacterContactAdded = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, SETTINGS_ADDRESS);
		FunctionDescriptor onCharacterContactPersisted = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, SETTINGS_ADDRESS);
		FunctionDescriptor onCharacterContactRemoved = functionDescrVoid(INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		FunctionDescriptor onContactSolve = functionDescrVoid(INT_ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS, ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS);
		FunctionDescriptor onCharacterContactSolve = functionDescrVoid(INT_ADDRESS, ADDRESS, ADDRESS, JAVA_INT, VEC3_ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS, ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS);
	
		Class<CharacterContactListener> clazz = CharacterContactListener.class;
		MethodHandle onAdjustBodyVelocityHandle = upcallHandleStatic(lookup, clazz, "onAdjustBodyVelocity", onAdjustBodyVelocity);
		MethodHandle onContactValidateHandle = upcallHandleStatic(lookup, clazz, "onContactValidate", onContactValidate);
		MethodHandle onCharacterContactValidateHandle = upcallHandleStatic(lookup, clazz, "onCharacterContactValidate", onCharacterContactValidate);
		MethodHandle onContactAddedHandle = upcallHandleStatic(lookup, clazz, "onContactAdded", onContactAdded);
		MethodHandle onContactPersistedHandle = upcallHandleStatic(lookup, clazz, "onContactPersisted", onContactPersisted);
		MethodHandle onContactRemovedHandle = upcallHandleStatic(lookup, clazz, "onContactRemoved", onContactRemoved);
		MethodHandle onCharacterContactAddedHandle = upcallHandleStatic(lookup, clazz, "onCharacterContactAdded", onCharacterContactAdded);
		MethodHandle onCharacterContactPersistedHandle = upcallHandleStatic(lookup, clazz, "onCharacterContactPersisted", onCharacterContactPersisted);
		MethodHandle onCharacterContactRemovedHandle = upcallHandleStatic(lookup, clazz, "onCharacterContactRemoved", onCharacterContactRemoved);
		MethodHandle onContactSolveHandle = upcallHandleStatic(lookup, clazz, "onContactSolve", onContactSolve);
		MethodHandle onCharacterContactSolveHandle = upcallHandleStatic(lookup, clazz, "onCharacterContactSolve", onCharacterContactSolve);
		
		ON_ADJUST_BODY_VELOCITY_ADDR = upcallStub(onAdjustBodyVelocityHandle, onAdjustBodyVelocity, arena);
		ON_CONTACT_VALIDATE_ADDR = upcallStub(onContactValidateHandle, onContactValidate, arena);
		ON_CHARACTER_CONTACT_VALIDATE_ADDR = upcallStub(onCharacterContactValidateHandle, onCharacterContactValidate, arena);
		ON_CONTACT_ADDED_ADDR = upcallStub(onContactAddedHandle, onContactAdded, arena);
		ON_CONTACT_PERSISTED_ADDR = upcallStub(onContactPersistedHandle, onContactPersisted, arena);
		ON_CONTACT_REMOVED_ADDR = upcallStub(onContactRemovedHandle, onContactRemoved, arena);
		ON_CHARACTER_CONTACT_ADDED_ADDR = upcallStub(onCharacterContactAddedHandle, onCharacterContactAdded, arena);
		ON_CHARACTER_CONTACT_PERSISTED_ADDR = upcallStub(onCharacterContactPersistedHandle, onCharacterContactPersisted, arena);
		ON_CHARACTER_CONTACT_REMOVED_ADDR = upcallStub(onCharacterContactRemovedHandle, onCharacterContactRemoved, arena);
		ON_CONTACT_SOLVE_ADDR = upcallStub(onContactSolveHandle, onContactSolve, arena);
		ON_CHARACTER_CONTACT_SOLVE_ADDR = upcallStub(onCharacterContactSolveHandle, onCharacterContactSolve, arena);
		
		ON_ADJUST_BODY_VELOCITY.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_ADJUST_BODY_VELOCITY_ADDR);
		ON_CONTACT_VALIDATE.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CONTACT_VALIDATE_ADDR);
		ON_CHARACTER_CONTACT_VALIDATE.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CHARACTER_CONTACT_VALIDATE_ADDR);
		ON_CONTACT_ADDED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CONTACT_ADDED_ADDR);
		ON_CONTACT_PERSISTED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CONTACT_PERSISTED_ADDR);
		ON_CONTACT_REMOVED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CONTACT_REMOVED_ADDR);
		ON_CHARACTER_CONTACT_ADDED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CHARACTER_CONTACT_ADDED_ADDR);
		ON_CHARACTER_CONTACT_PERSISTED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CHARACTER_CONTACT_PERSISTED_ADDR);
		ON_CHARACTER_CONTACT_REMOVED.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CHARACTER_CONTACT_REMOVED_ADDR);
		ON_CONTACT_SOLVE.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CONTACT_SOLVE_ADDR);
		ON_CHARACTER_CONTACT_SOLVE.set(JPH_CHARACTER_CONTACT_LISTENER_PROCS, ON_CHARACTER_CONTACT_SOLVE_ADDR);
	}
	//@formatter:on

	private static void setProcs() {
		try {
			MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS;
			method.invokeExact(JPH_CHARACTER_CONTACT_LISTENER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set procs.");
		}
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy character contact listener.");
		}
	}

	@SuppressWarnings("unused")
	private static void onAdjustBodyVelocity(MemorySegment userData, MemorySegment character, MemorySegment body2,
			MemorySegment linearVelocity, MemorySegment angularVelocity) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		Body body = Jolt.getBody(body2.address());
		if (body == null && !body2.equals(MemorySegment.NULL))
			body = new Body(body2);

		listener.vecTmp.set(linearVelocity);
		Vector3f linearVelocityVector = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(angularVelocity);
		Vector3f angularVelocityVector = listener.vecTmp.get(listener.vectorTmp2);

		listener.onAdjustBodyVelocity(characterVirtual, body, linearVelocityVector, angularVelocityVector);
	}

	@SuppressWarnings("unused")
	private static boolean onContactValidate(MemorySegment userData, MemorySegment character, int bodyId2,
			int subShapeId2) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		return listener.onContactValidate(characterVirtual, bodyId2, subShapeId2);
	}

	@SuppressWarnings("unused")
	private static boolean onCharacterContactValidate(MemorySegment userData, MemorySegment character,
			MemorySegment otherCharacter, int subShapeId2) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		CharacterVirtual otherCharacterVirtual = Jolt.getCharacterVirtual(otherCharacter.address());
		if (otherCharacterVirtual == null && !otherCharacter.equals(MemorySegment.NULL))
			otherCharacterVirtual = new CharacterVirtual(otherCharacter);

		return listener.onCharacterContactValidate(characterVirtual, otherCharacterVirtual, subShapeId2);
	}

	@SuppressWarnings("unused")
	private static void onContactAdded(MemorySegment userData, MemorySegment character, int bodyId2, int subShapeId2,
			MemorySegment contactPosition, MemorySegment contactNormal, MemorySegment ioSettings) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		listener.vecTmp.set(contactPosition);
		Vector3f position = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normal = listener.vecTmp.get(listener.vectorTmp2);

		listener.settings.set(ioSettings);
		CharacterContactSettings settings = listener.settings;

		listener.onContactAdded(characterVirtual, bodyId2, subShapeId2, position, normal, settings);

		long size = CharacterContactSettings.LAYOUT().byteSize();
		MemorySegment.copy(listener.settings.memorySegment(), 0, ioSettings, 0, size);
	}

	@SuppressWarnings("unused")
	private static void onContactPersisted(MemorySegment userData, MemorySegment character, int bodyId2,
			int subShapeId2, MemorySegment contactPosition, MemorySegment contactNormal, MemorySegment ioSettings) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		listener.vecTmp.set(contactPosition);
		Vector3f positionVector = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normalVector = listener.vecTmp.get(listener.vectorTmp2);

		listener.settings.set(ioSettings);
		CharacterContactSettings settings = listener.settings;

		listener.onContactPersisted(characterVirtual, bodyId2, subShapeId2, positionVector, normalVector, settings);

		long size = CharacterContactSettings.LAYOUT().byteSize();
		MemorySegment.copy(listener.settings.memorySegment(), 0, ioSettings, 0, size);
	}

	@SuppressWarnings("unused")
	private static void onContactRemoved(MemorySegment userData, MemorySegment character, int bodyId2,
			int subShapeId2) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		listener.onContactRemoved(characterVirtual, bodyId2, subShapeId2);
	}

	@SuppressWarnings("unused")
	private static void onCharacterContactAdded(MemorySegment userData, MemorySegment character,
			MemorySegment otherCharacter, int subShapeId2, MemorySegment contactPosition, MemorySegment contactNormal,
			MemorySegment ioSettings) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual character1 = Jolt.getCharacterVirtual(character.address());
		if (character1 == null && !character.equals(MemorySegment.NULL))
			character1 = new CharacterVirtual(character);

		CharacterVirtual character2 = Jolt.getCharacterVirtual(otherCharacter.address());
		if (character2 == null && !otherCharacter.equals(MemorySegment.NULL))
			character2 = new CharacterVirtual(otherCharacter);

		listener.vecTmp.set(contactPosition);
		Vector3f position = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normal = listener.vecTmp.get(listener.vectorTmp2);

		listener.settings.set(ioSettings);
		CharacterContactSettings settings = listener.settings;

		listener.onCharacterContactAdded(character1, character2, subShapeId2, position, normal, settings);

		long size = CharacterContactSettings.LAYOUT().byteSize();
		MemorySegment.copy(listener.settings.memorySegment(), 0, ioSettings, 0, size);
	}

	@SuppressWarnings("unused")
	private static void onCharacterContactPersisted(MemorySegment userData, MemorySegment character,
			MemorySegment otherCharacter, int subShapeId2, MemorySegment contactPosition, MemorySegment contactNormal,
			MemorySegment ioSettings) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual character1 = Jolt.getCharacterVirtual(character.address());
		if (character1 == null && !character.equals(MemorySegment.NULL))
			character1 = new CharacterVirtual(character);

		CharacterVirtual character2 = Jolt.getCharacterVirtual(otherCharacter.address());
		if (character2 == null && !otherCharacter.equals(MemorySegment.NULL))
			character2 = new CharacterVirtual(otherCharacter);

		listener.vecTmp.set(contactPosition);
		Vector3f position = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normal = listener.vecTmp.get(listener.vectorTmp2);

		listener.settings.set(ioSettings);
		CharacterContactSettings settings = listener.settings;

		listener.onCharacterContactPersisted(character1, character2, subShapeId2, position, normal, settings);

		long size = CharacterContactSettings.LAYOUT().byteSize();
		MemorySegment.copy(listener.settings.memorySegment(), 0, ioSettings, 0, size);
	}

	@SuppressWarnings("unused")
	private static void onCharacterContactRemoved(MemorySegment userData, MemorySegment character, int otherCharacterId,
			int subShapeId2) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		listener.onCharacterContactRemoved(characterVirtual, otherCharacterId, subShapeId2);
	}

	@SuppressWarnings("unused")
	private static void onContactSolve(MemorySegment userData, MemorySegment character, int bodyId2, int subShapeId2,
			MemorySegment contactPosition, MemorySegment contactNormal, MemorySegment contactVelocity,
			MemorySegment contactMaterial, MemorySegment characterVelocity, MemorySegment newCharacterVelocity) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		PhysicsMaterial material = Jolt.getMaterial(contactMaterial.address());
		if (material == null && !contactMaterial.equals(MemorySegment.NULL))
			material = new PhysicsMaterial(contactMaterial);

		listener.vecTmp.set(contactPosition);
		Vector3f position = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normal = listener.vecTmp.get(listener.vectorTmp2);
		listener.vecTmp.set(contactVelocity);
		Vector3f velocityContact = listener.vecTmp.get(listener.vectorTmp3);
		listener.vecTmp.set(characterVelocity);
		Vector3f velocityCharacter = listener.vecTmp.get(listener.vectorTmp4);
		listener.vecTmp.set(newCharacterVelocity);
		Vector3f velocityNew = listener.vecTmp.get(listener.vectorTmp5);

		listener.onContactSolve(characterVirtual, bodyId2, subShapeId2, position, normal, velocityContact, material,
				velocityCharacter, velocityNew);

		listener.vecTmp.set(velocityNew);
		MemorySegment.copy(listener.vecTmp.memorySegment(), 0, newCharacterVelocity, 0, Vec3.LAYOUT().byteSize());
	}

	@SuppressWarnings("unused")
	private static void onCharacterContactSolve(MemorySegment userData, MemorySegment character,
			MemorySegment otherCharacter, int subShapeId2, MemorySegment contactPosition, MemorySegment contactNormal,
			MemorySegment contactVelocity, MemorySegment contactMaterial, MemorySegment characterVelocity,
			MemorySegment newCharacterVelocity) {

		CharacterContactListener listener = CONTACT_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		CharacterVirtual otherCharacterVirtual = Jolt.getCharacterVirtual(otherCharacter.address());
		if (otherCharacterVirtual == null && !otherCharacter.equals(MemorySegment.NULL))
			otherCharacterVirtual = new CharacterVirtual(otherCharacter);

		PhysicsMaterial material = Jolt.getMaterial(contactMaterial.address());
		if (material == null && !contactMaterial.equals(MemorySegment.NULL))
			material = new PhysicsMaterial(contactMaterial);

		listener.vecTmp.set(contactPosition);
		Vector3f position = listener.vecTmp.get(listener.vectorTmp);
		listener.vecTmp.set(contactNormal);
		Vector3f normal = listener.vecTmp.get(listener.vectorTmp2);
		listener.vecTmp.set(contactVelocity);
		Vector3f velocityContact = listener.vecTmp.get(listener.vectorTmp3);
		listener.vecTmp.set(characterVelocity);
		Vector3f velocityCharacter = listener.vecTmp.get(listener.vectorTmp4);
		listener.vecTmp.set(newCharacterVelocity);
		Vector3f velocityNew = listener.vecTmp.get(listener.vectorTmp5);

		listener.onCharacterContactSolve(characterVirtual, otherCharacterVirtual, subShapeId2, position, normal,
				velocityContact, material, velocityCharacter, velocityNew);

		listener.vecTmp.set(velocityNew);
		MemorySegment.copy(listener.vecTmp.memorySegment(), 0, newCharacterVelocity, 0, Vec3.LAYOUT().byteSize());
	}

	public MemorySegment memorySegment() {
		return jphCharacterContactListener;
	}

}