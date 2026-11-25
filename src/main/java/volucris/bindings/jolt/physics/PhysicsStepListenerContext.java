/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsStepListenerContext {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_DELTA_TIME;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_DELTA_TIME;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_FIRST_STEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_FIRST_STEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_LAST_STEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_LAST_STEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_PHYSICS_SYSTEM;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_CREATE = downcallHandle("JPH_PhysicsStepListenerContext_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_DESTROY = downcallHandleVoid("JPH_PhysicsStepListenerContext_Destroy", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_DELTA_TIME = downcallHandle("JPH_PhysicsStepListenerContext_GetDeltaTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_DELTA_TIME = downcallHandleVoid("JPH_PhysicsStepListenerContext_SetDeltaTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_FIRST_STEP = downcallHandle("JPH_PhysicsStepListenerContext_GetIsFirstStep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_FIRST_STEP = downcallHandleVoid("JPH_PhysicsStepListenerContext_SetIsFirstStep", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_LAST_STEP = downcallHandle("JPH_PhysicsStepListenerContext_GetIsLastStep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_LAST_STEP = downcallHandleVoid("JPH_PhysicsStepListenerContext_SetIsLastStep", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_PHYSICS_SYSTEM = downcallHandle("JPH_PhysicsStepListenerContext_GetPhysicsSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_PHYSICS_SYSTEM = downcallHandleVoid("JPH_PhysicsStepListenerContext_SetPhysicsSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsStepListenerContext() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsStepListenerContext(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsStepListenerContext(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Delta time of the current step
    /// ```
    public static float getDeltaTime(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_DELTA_TIME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDeltaTime].
    public final float getDeltaTime() {
    	return getDeltaTime(
    		this.segment
    	);
    }
    
    /// ```
    /// Delta time of the current step
    /// ```
    public static void setDeltaTime(
    	MemorySegment self,
    	float mDeltaTime
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_DELTA_TIME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDeltaTime].
    public final void setDeltaTime(
    	float mDeltaTime
    ) {
    	setDeltaTime(
    		this.segment,
    		mDeltaTime
    	);
    }
    
    /// ```
    /// True if this is the first step
    /// ```
    public static boolean getIsFirstStep(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_FIRST_STEP.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsFirstStep].
    public final boolean getIsFirstStep() {
    	return getIsFirstStep(
    		this.segment
    	);
    }
    
    /// ```
    /// True if this is the first step
    /// ```
    public static void setIsFirstStep(
    	MemorySegment self,
    	boolean mIsFirstStep
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_FIRST_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsFirstStep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsFirstStep].
    public final void setIsFirstStep(
    	boolean mIsFirstStep
    ) {
    	setIsFirstStep(
    		this.segment,
    		mIsFirstStep
    	);
    }
    
    /// ```
    /// True if this is the last step
    /// ```
    public static boolean getIsLastStep(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_IS_LAST_STEP.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsLastStep].
    public final boolean getIsLastStep() {
    	return getIsLastStep(
    		this.segment
    	);
    }
    
    /// ```
    /// True if this is the last step
    /// ```
    public static void setIsLastStep(
    	MemorySegment self,
    	boolean mIsLastStep
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_IS_LAST_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsLastStep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsLastStep].
    public final void setIsLastStep(
    	boolean mIsLastStep
    ) {
    	setIsLastStep(
    		this.segment,
    		mIsLastStep
    	);
    }
    
    /// ```
    /// The physics system that is being stepped
    /// ```
    public static MemorySegment getPhysicsSystem(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_GET_PHYSICS_SYSTEM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPhysicsSystem].
    public final @Nullable PhysicsSystem getPhysicsSystem() {
    	MemorySegment segment = getPhysicsSystem(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsSystem(segment);
    }
    
    /// ```
    /// The physics system that is being stepped
    /// ```
    public static void setPhysicsSystem(
    	MemorySegment self,
    	MemorySegment mPhysicsSystem
    ) {
    	MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CONTEXT_SET_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPhysicsSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPhysicsSystem].
    public final void setPhysicsSystem(
    	PhysicsSystem mPhysicsSystem
    ) {
    	setPhysicsSystem(
    		this.segment,
    		mPhysicsSystem.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}