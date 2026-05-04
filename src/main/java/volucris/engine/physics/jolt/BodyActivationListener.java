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

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A listener class that receives events when a body activates or deactivates.
 * It can be registered with the BodyManager (or PhysicsSystem).
 */
public abstract class BodyActivationListener {

	private static final ArrayList<WeakReference<BodyActivationListener>> BODY_ACTIVATION_LISTENERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_BODY_ACTIVATION_LISTENER_SET_PROCS;
	private static final MethodHandle JPH_BODY_ACTIVATION_LISTENER_CREATE;
	private static final MethodHandle JPH_BODY_ACTIVATION_LISTENER_DESTROY;

	private static final VarHandle ON_BODY_ACTIVATED;
	private static final VarHandle ON_BODY_DEACTIVATED;

	private static final MemorySegment JPH_BODY_ACTIVATION_LISTENER_PROCS;

	private static MemorySegment ON_BODY_ACTIVATED_ADDR;
	private static MemorySegment ON_BODY_DEACTIVATED_ADDR;

	private static int count;

	private final MemorySegment jphActivationListener;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("OnBodyActivated"),
				ADDRESS.withName("OnBodyDeactivated")
			).withName("JPH_BodyActivationListener_Procs");
		//@formatter:on

		ON_BODY_ACTIVATED = varHandle(LAYOUT, "OnBodyActivated");
		ON_BODY_DEACTIVATED = varHandle(LAYOUT, "OnBodyDeactivated");

		JPH_BODY_ACTIVATION_LISTENER_SET_PROCS = downcallHandleVoid("JPH_BodyActivationListener_SetProcs", ADDRESS);
		JPH_BODY_ACTIVATION_LISTENER_CREATE = downcallHandle("JPH_BodyActivationListener_Create", ADDRESS, ADDRESS);
		JPH_BODY_ACTIVATION_LISTENER_DESTROY = downcallHandleVoid("JPH_BodyActivationListener_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_BODY_ACTIVATION_LISTENER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		BODY_ACTIVATION_LISTENERS = new ArrayList<WeakReference<BodyActivationListener>>();
	}

	public BodyActivationListener() {
		this(Arena.ofAuto());
	}
	
	public BodyActivationListener(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphActivationListener = segment.reinterpret(arena, s -> destroy(s));

			BODY_ACTIVATION_LISTENERS.add(index, new WeakReference<BodyActivationListener>(this));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create body activation listener.");
		}
	}

	/**
	 * Called whenever a body activates, note this can be called from any thread so
	 * make sure your code is thread safe. At the time of the callback the body
	 * bodyID will be locked and no bodies can be written/activated/deactivated from
	 * the callback.
	 */
	protected abstract void onBodyActivated(int bodyId, long bodyUserData);

	/**
	 * Called whenever a body deactivates, note this can be called from any thread
	 * so make sure your code is thread safe. At the time of the callback the body
	 * bodyID will be locked and no bodies can be written/activated/deactivated
	 * from the callback.
	 */
	protected abstract void onBodyDeactivated(int bodyId, long bodyUserData);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_SET_PROCS;
			method.invokeExact(JPH_BODY_ACTIVATION_LISTENER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set body activation listener procs.");
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(BodyActivationListener.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor onBodyActivated = functionDescrVoid(INT_ADDRESS, JAVA_INT, JAVA_LONG);
		FunctionDescriptor onBodyDeactivated = functionDescrVoid(INT_ADDRESS, JAVA_INT, JAVA_LONG);
		
		MethodHandle onBodyActivatedHandle = upcallHandleStatic(lookup, BodyActivationListener.class, "onBodyActivated", onBodyActivated);
		MethodHandle onBodyDeactivatedHandle = upcallHandleStatic(lookup, BodyActivationListener.class, "onBodyDeactivated", onBodyDeactivated);
	
		ON_BODY_ACTIVATED_ADDR = upcallStub(onBodyActivatedHandle, onBodyActivated, arena);
		ON_BODY_DEACTIVATED_ADDR = upcallStub(onBodyDeactivatedHandle, onBodyDeactivated, arena);
		
		ON_BODY_ACTIVATED.set(JPH_BODY_ACTIVATION_LISTENER_PROCS, ON_BODY_ACTIVATED_ADDR);
		ON_BODY_DEACTIVATED.set(JPH_BODY_ACTIVATION_LISTENER_PROCS, ON_BODY_DEACTIVATED_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy body activation listener.");
		}
	}

	@SuppressWarnings("unused")
	private static void onBodyActivated(MemorySegment userData, int bodyId, long bodyUserData) {
		BodyActivationListener listener = BODY_ACTIVATION_LISTENERS.get(userData.get(JAVA_INT, 0)).get();
		listener.onBodyActivated(bodyId, bodyUserData);
	}

	@SuppressWarnings("unused")
	private static void onBodyDeactivated(MemorySegment userData, int bodyId, long bodyUserData) {
		BodyActivationListener listener = BODY_ACTIVATION_LISTENERS.get(userData.get(JAVA_INT, 0)).get();
		listener.onBodyDeactivated(bodyId, bodyUserData);
	}

	public MemorySegment memorySegment() {
		return jphActivationListener;
	}

}
