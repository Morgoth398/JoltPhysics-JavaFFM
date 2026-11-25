/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Jolt {

	private static final LazyConstant<MethodHandle> JPH_REGISTER_DEFAULT_ALLOCATOR;
	private static final LazyConstant<MethodHandle> JPH_VERIFY_JOLT_VERSION_ID;
	private static final LazyConstant<MethodHandle> JPH_REGISTER_TYPES;
	private static final LazyConstant<MethodHandle> JPH_UNREGISTER_TYPES;
	private static final LazyConstant<MethodHandle> JPH_GET_PROCESSOR_TICK_COUNT;
	private static final LazyConstant<MethodHandle> JPH_GET_DEFAULT_COLLISION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_GET_DEFAULT_PENETRATION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_GET_DEFAULT_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_GET_CAPSULE_PROJECTION_SLOP;
	private static final LazyConstant<MethodHandle> JPH_GET_DEFAULT_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_GET_MAX_PHYSICS_JOBS;
	private static final LazyConstant<MethodHandle> JPH_GET_MAX_PHYSICS_BARRIERS;
	private static final LazyConstant<MethodHandle> JPH_SET_TRACE_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_SET_ASSERT_FAILURE_FUNCTION;

	static {
		//@formatter:off
		JPH_REGISTER_DEFAULT_ALLOCATOR = downcallHandleVoid("JPH_RegisterDefaultAllocator");
		JPH_VERIFY_JOLT_VERSION_ID = downcallHandle("JPH_VerifyJoltVersionID", JAVA_BOOLEAN);
		JPH_REGISTER_TYPES = downcallHandleVoid("JPH_RegisterTypes");
		JPH_UNREGISTER_TYPES = downcallHandleVoid("JPH_UnregisterTypes");
		JPH_GET_PROCESSOR_TICK_COUNT = downcallHandle("JPH_GetProcessorTickCount", JAVA_LONG);
		JPH_GET_DEFAULT_COLLISION_TOLERANCE = downcallHandle("JPH_GetDefaultCollisionTolerance", JAVA_FLOAT);
		JPH_GET_DEFAULT_PENETRATION_TOLERANCE = downcallHandle("JPH_GetDefaultPenetrationTolerance", JAVA_FLOAT);
		JPH_GET_DEFAULT_CONVEX_RADIUS = downcallHandle("JPH_GetDefaultConvexRadius", JAVA_FLOAT);
		JPH_GET_CAPSULE_PROJECTION_SLOP = downcallHandle("JPH_GetCapsuleProjectionSlop", JAVA_FLOAT);
		JPH_GET_DEFAULT_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ = downcallHandle("JPH_GetDefaultInternalEdgeRemovalVertexToleranceSq", JAVA_FLOAT);
		JPH_GET_MAX_PHYSICS_JOBS = downcallHandle("JPH_GetMaxPhysicsJobs", JAVA_INT);
		JPH_GET_MAX_PHYSICS_BARRIERS = downcallHandle("JPH_GetMaxPhysicsBarriers", JAVA_INT);
		JPH_SET_TRACE_FUNCTION = downcallHandleVoid("JPH_SetTraceFunction", UNBOUNDED_ADDRESS);
		JPH_SET_ASSERT_FAILURE_FUNCTION = downcallHandleVoid("JPH_SetAssertFailureFunction", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private Jolt() {
	}

    /// ```
    /// Register platform default allocation / free functions
    /// ```
    public static void registerDefaultAllocator() {
    	MethodHandle method = JPH_REGISTER_DEFAULT_ALLOCATOR.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This function can be used to verify the library ABI is compatible with your
    /// application.
    /// Use it in this way: `assert(VerifyJoltVersionID());`.
    /// Returns `false` if the library used is not compatible with your app.
    /// ```
    public static boolean verifyJoltVersionID() {
    	MethodHandle method = JPH_VERIFY_JOLT_VERSION_ID.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Register all physics types with the factory and install their collision handlers with the CollisionDispatch class.
    /// If you have your own custom shape types you probably need to register their handlers with the CollisionDispatch before calling this function.
    /// If you implement your own default material (PhysicsMaterial::sDefault) make sure to initialize it before this function or else this function will create one for you.
    /// ```
    public static void registerTypes() {
    	MethodHandle method = JPH_REGISTER_TYPES.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Unregisters all types with the factory and cleans up the default material
    /// ```
    public static void unregisterTypes() {
    	MethodHandle method = JPH_UNREGISTER_TYPES.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Functionality to get the processors cycle counter
    /// ```
    public static long getProcessorTickCount() {
    	MethodHandle method = JPH_GET_PROCESSOR_TICK_COUNT.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// If objects are closer than this distance, they are considered to be colliding (used for GJK) (unit: meter)
    /// ```
    public static float getDefaultCollisionTolerance() {
    	MethodHandle method = JPH_GET_DEFAULT_COLLISION_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Stop when there's less than 1% change
    /// ```
    public static float getDefaultPenetrationTolerance() {
    	MethodHandle method = JPH_GET_DEFAULT_PENETRATION_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How much padding to add around objects
    /// ```
    public static float getDefaultConvexRadius() {
    	MethodHandle method = JPH_GET_DEFAULT_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Used by (Tapered)CapsuleShape to determine when supporting face is an edge rather than a point (unit: meter)
    /// ```
    public static float getCapsuleProjectionSlop() {
    	MethodHandle method = JPH_GET_CAPSULE_PROJECTION_SLOP.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Max squared distance to consider a vertex to be the same as another vertex, used by the internal edge removal algorithm to determine if two edges are shared (unit: meter^2)
    /// ```
    public static float getDefaultInternalEdgeRemovalVertexToleranceSq() {
    	MethodHandle method = JPH_GET_DEFAULT_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maximum amount of jobs to allow
    /// ```
    public static int getMaxPhysicsJobs() {
    	MethodHandle method = JPH_GET_MAX_PHYSICS_JOBS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maximum amount of barriers to allow
    /// ```
    public static int getMaxPhysicsBarriers() {
    	MethodHandle method = JPH_GET_MAX_PHYSICS_BARRIERS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setTraceFunction(
    	MemorySegment traceFunction
    ) {
    	MethodHandle method = JPH_SET_TRACE_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			traceFunction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTraceFunction].
    public static void setTraceFunction(
    	TraceFunction traceFunction
    ) {
    	setTraceFunction(
    		traceFunction.memorySegment()
    	);
    }
    
    public static void setAssertFailureFunction(
    	MemorySegment function
    ) {
    	MethodHandle method = JPH_SET_ASSERT_FAILURE_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			function
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAssertFailureFunction].
    public static void setAssertFailureFunction(
    	AssertFailureFunction function
    ) {
    	setAssertFailureFunction(
    		function.memorySegment()
    	);
    }

}