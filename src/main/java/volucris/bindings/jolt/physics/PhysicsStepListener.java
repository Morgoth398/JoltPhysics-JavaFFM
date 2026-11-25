/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsStepListener {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_STEP_LISTENER_CREATE = downcallHandle("JPH_PhysicsStepListener_Create", UNBOUNDED_ADDRESS, PhysicsStepListenerFunctions.LAYOUT);
		JPH_PHYSICS_STEP_LISTENER_DESTROY = downcallHandleVoid("JPH_PhysicsStepListener_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsStepListener(
	    PhysicsStepListenerFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public PhysicsStepListener(
		Arena arena,
		PhysicsStepListenerFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsStepListener(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}