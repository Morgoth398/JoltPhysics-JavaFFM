package volucris.engine.physics.jolt;

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

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A listener class that receives a callback before every physics simulation
 * step.
 */
public abstract class PhysicsStepListener {

	private static final ArrayList<WeakReference<PhysicsStepListener>> STEP_LISTENERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_STEP_LISTENER_SET_PROCS;
	private static final MethodHandle JPH_STEP_LISTENER_CREATE;
	private static final MethodHandle JPH_STEP_LISTENER_DESTROY;

	private static final VarHandle ON_STEP;

	private static final MemorySegment JPH_STEP_LISTENER_PROCS;

	private static MemorySegment ON_STEP_ADDR;

	private static int count;

	private final MemorySegment jphStepListener;
	private final MemorySegment userData;

	private PhysicsStepListenerContext context;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("OnStep")
			).withName("JPH_PhysicsStepListener_Procs");
		//@formatter:on

		ON_STEP = varHandle(LAYOUT, "OnStep");

		JPH_STEP_LISTENER_SET_PROCS = downcallHandleVoid("JPH_PhysicsStepListener_SetProcs", ADDRESS);
		JPH_STEP_LISTENER_CREATE = downcallHandle("JPH_PhysicsStepListener_Create", ADDRESS, ADDRESS);
		JPH_STEP_LISTENER_DESTROY = downcallHandleVoid("JPH_PhysicsStepListener_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_STEP_LISTENER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		STEP_LISTENERS = new ArrayList<WeakReference<PhysicsStepListener>>();
	}

	public PhysicsStepListener() {
		this(Arena.ofAuto());
	}

	public PhysicsStepListener(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_STEP_LISTENER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphStepListener = segment.reinterpret(arena, s -> destroy(s));

			STEP_LISTENERS.add(index, new WeakReference<PhysicsStepListener>(this));

			context = new PhysicsStepListenerContext(arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create physics step listener: " + className);
		}
	}

	/**
	 * Called before every simulation step (received inCollisionSteps times for
	 * every PhysicsSystem::Update(...) call) This is called while all body and
	 * constraint mutexes are locked. You can read/write bodies and constraints but
	 * not add/remove them. Multiple listeners can be executed in parallel and it is
	 * the responsibility of the listener to avoid race conditions. The best way to
	 * do this is to have each step listener operate on a subset of the bodies and
	 * constraints and making sure that these bodies and constraints are not touched
	 * by any other step listener. Note that this function is not called if there
	 * aren't any active bodies or when the physics system is updated with 0 delta
	 * time.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void onStep(PhysicsStepListenerContext context);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_STEP_LISTENER_SET_PROCS;
			method.invokeExact(JPH_STEP_LISTENER_PROCS);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shape filter procs: " + className);
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(PhysicsStepListener.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		FunctionDescriptor onStep = functionDescrVoid(
				ADDRESS.withTargetLayout(JAVA_INT), 
				ADDRESS.withTargetLayout(PhysicsStepListenerContext.LAYOUT()));
		
		MethodHandle onStepHandle = upcallHandleStatic(lookup, PhysicsStepListener.class, "onStep", onStep);
	
		ON_STEP_ADDR = upcallStub(onStepHandle, onStep, arena);
		
		ON_STEP.set(JPH_STEP_LISTENER_PROCS, ON_STEP_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_STEP_LISTENER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy shape filter: " + className);
		}
	}

	@SuppressWarnings("unused")
	private static void onStep(MemorySegment userData, MemorySegment context) {
		PhysicsStepListener listener = STEP_LISTENERS.get(userData.get(JAVA_INT, 0)).get();

		listener.context.set(context);

		listener.onStep(listener.context);
	}

	public MemorySegment memorySegment() {
		return jphStepListener;
	}

}
