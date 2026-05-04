package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Context information for the step listener.
 */
public final class PhysicsStepListenerContext {

	private static final StructLayout LAYOUT;

	private static final VarHandle DELTA_TIME;
	private static final VarHandle IS_FIRST_STEP;
	private static final VarHandle IS_LAST_STEP;
	private static final VarHandle PHYSICS_SYSTEM;

	private final MemorySegment jphPhysicsStepListenerContext;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_FLOAT.withName("deltaTime"),
		        JAVA_INT.withName("isFirstStep"),
		        JAVA_INT.withName("isLastStep"),
		        MemoryLayout.paddingLayout(4),
		        ADDRESS.withName("physicsSystem")
			).withName("JPH_PhysicsStepListenerContext");
		//@formatter:on

		DELTA_TIME = varHandle(LAYOUT, "deltaTime");
		IS_FIRST_STEP = varHandle(LAYOUT, "isFirstStep");
		IS_LAST_STEP = varHandle(LAYOUT, "isLastStep");
		PHYSICS_SYSTEM = varHandle(LAYOUT, "physicsSystem");
	}

	public PhysicsStepListenerContext() {
		this(Arena.ofAuto());
	}

	public PhysicsStepListenerContext(Arena arena) {
		jphPhysicsStepListenerContext = arena.allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphPhysicsStepListenerContext, 0, LAYOUT.byteSize());
	}

	/**
	 * Delta time of the current step.
	 */
	public float getDeltaTime() {
		return (float) DELTA_TIME.get(jphPhysicsStepListenerContext);
	}

	/**
	 * True if this is the first step.
	 */
	public boolean isFirstStep() {
		int value = (int) IS_FIRST_STEP.get(jphPhysicsStepListenerContext);
		return value == 1;
	}

	/**
	 * True if this is the last step.
	 */
	public boolean isLastStep() {
		int value = (int) IS_LAST_STEP.get(jphPhysicsStepListenerContext);
		return value == 1;
	}

	/**
	 * The physics system that is being stepped.
	 */
	public PhysicsSystem getPhysicsSystem() {
		MemorySegment segment = (MemorySegment) PHYSICS_SYSTEM.get(jphPhysicsStepListenerContext);

		if (segment.equals(MemorySegment.NULL))
			return null;

		PhysicsSystem system = Jolt.getPhysicsSystem(segment.address());
		if (system != null)
			return system;

		return new PhysicsSystem(segment);
	}

	public MemorySegment memorySegment() {
		return jphPhysicsStepListenerContext;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
