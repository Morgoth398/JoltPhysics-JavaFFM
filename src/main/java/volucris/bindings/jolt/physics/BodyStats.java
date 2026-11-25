/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BodyStats {

	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_MAX_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_MAX_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_STATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_STATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_SOFT_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_SOFT_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_SOFT_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_SOFT_BODIES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_MANAGER_BODY_STATS_CREATE = downcallHandle("JPH_BodyManagerBodyStats_Create", UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_DESTROY = downcallHandleVoid("JPH_BodyManagerBodyStats_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES = downcallHandle("JPH_BodyManagerBodyStats_GetNumBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumBodies", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_MAX_BODIES = downcallHandle("JPH_BodyManagerBodyStats_GetMaxBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_MAX_BODIES = downcallHandleVoid("JPH_BodyManagerBodyStats_SetMaxBodies", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_STATIC = downcallHandle("JPH_BodyManagerBodyStats_GetNumBodiesStatic", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_STATIC = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumBodiesStatic", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_DYNAMIC = downcallHandle("JPH_BodyManagerBodyStats_GetNumBodiesDynamic", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_DYNAMIC = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumBodiesDynamic", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_DYNAMIC = downcallHandle("JPH_BodyManagerBodyStats_GetNumActiveBodiesDynamic", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_DYNAMIC = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumActiveBodiesDynamic", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_KINEMATIC = downcallHandle("JPH_BodyManagerBodyStats_GetNumBodiesKinematic", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_KINEMATIC = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumBodiesKinematic", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_KINEMATIC = downcallHandle("JPH_BodyManagerBodyStats_GetNumActiveBodiesKinematic", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_KINEMATIC = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumActiveBodiesKinematic", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_SOFT_BODIES = downcallHandle("JPH_BodyManagerBodyStats_GetNumSoftBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_SOFT_BODIES = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumSoftBodies", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_SOFT_BODIES = downcallHandle("JPH_BodyManagerBodyStats_GetNumActiveSoftBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_SOFT_BODIES = downcallHandleVoid("JPH_BodyManagerBodyStats_SetNumActiveSoftBodies", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public BodyStats(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment ncreate() {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate].
    public final @Nullable BodyStats create() {
    	MemorySegment segment = ncreate();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new BodyStats(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
    	);
    }
    
    /// ```
    /// Total number of bodies in the body manager
    /// ```
    public static int getNumBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodies].
    public final int getNumBodies() {
    	return getNumBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Total number of bodies in the body manager
    /// ```
    public static void setNumBodies(
    	MemorySegment self,
    	int mNumBodies
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumBodies].
    public final void setNumBodies(
    	int mNumBodies
    ) {
    	setNumBodies(
    		this.segment,
    		mNumBodies
    	);
    }
    
    /// ```
    /// Max allowed number of bodies in the body manager (as configured in Init(...))
    /// ```
    public static int getMaxBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_MAX_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxBodies].
    public final int getMaxBodies() {
    	return getMaxBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Max allowed number of bodies in the body manager (as configured in Init(...))
    /// ```
    public static void setMaxBodies(
    	MemorySegment self,
    	int mMaxBodies
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_MAX_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxBodies].
    public final void setMaxBodies(
    	int mMaxBodies
    ) {
    	setMaxBodies(
    		this.segment,
    		mMaxBodies
    	);
    }
    
    /// ```
    /// Number of static bodies
    /// ```
    public static int getNumBodiesStatic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_STATIC.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodiesStatic].
    public final int getNumBodiesStatic() {
    	return getNumBodiesStatic(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of static bodies
    /// ```
    public static void setNumBodiesStatic(
    	MemorySegment self,
    	int mNumBodiesStatic
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_STATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumBodiesStatic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumBodiesStatic].
    public final void setNumBodiesStatic(
    	int mNumBodiesStatic
    ) {
    	setNumBodiesStatic(
    		this.segment,
    		mNumBodiesStatic
    	);
    }
    
    /// ```
    /// Number of dynamic bodies
    /// ```
    public static int getNumBodiesDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_DYNAMIC.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodiesDynamic].
    public final int getNumBodiesDynamic() {
    	return getNumBodiesDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of dynamic bodies
    /// ```
    public static void setNumBodiesDynamic(
    	MemorySegment self,
    	int mNumBodiesDynamic
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_DYNAMIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumBodiesDynamic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumBodiesDynamic].
    public final void setNumBodiesDynamic(
    	int mNumBodiesDynamic
    ) {
    	setNumBodiesDynamic(
    		this.segment,
    		mNumBodiesDynamic
    	);
    }
    
    /// ```
    /// Number of dynamic bodies that are currently active
    /// ```
    public static int getNumActiveBodiesDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_DYNAMIC.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumActiveBodiesDynamic].
    public final int getNumActiveBodiesDynamic() {
    	return getNumActiveBodiesDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of dynamic bodies that are currently active
    /// ```
    public static void setNumActiveBodiesDynamic(
    	MemorySegment self,
    	int mNumActiveBodiesDynamic
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_DYNAMIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumActiveBodiesDynamic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumActiveBodiesDynamic].
    public final void setNumActiveBodiesDynamic(
    	int mNumActiveBodiesDynamic
    ) {
    	setNumActiveBodiesDynamic(
    		this.segment,
    		mNumActiveBodiesDynamic
    	);
    }
    
    /// ```
    /// Number of kinematic bodies
    /// ```
    public static int getNumBodiesKinematic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_BODIES_KINEMATIC.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodiesKinematic].
    public final int getNumBodiesKinematic() {
    	return getNumBodiesKinematic(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of kinematic bodies
    /// ```
    public static void setNumBodiesKinematic(
    	MemorySegment self,
    	int mNumBodiesKinematic
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_BODIES_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumBodiesKinematic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumBodiesKinematic].
    public final void setNumBodiesKinematic(
    	int mNumBodiesKinematic
    ) {
    	setNumBodiesKinematic(
    		this.segment,
    		mNumBodiesKinematic
    	);
    }
    
    /// ```
    /// Number of kinematic bodies that are currently active
    /// ```
    public static int getNumActiveBodiesKinematic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_BODIES_KINEMATIC.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumActiveBodiesKinematic].
    public final int getNumActiveBodiesKinematic() {
    	return getNumActiveBodiesKinematic(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of kinematic bodies that are currently active
    /// ```
    public static void setNumActiveBodiesKinematic(
    	MemorySegment self,
    	int mNumActiveBodiesKinematic
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_BODIES_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumActiveBodiesKinematic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumActiveBodiesKinematic].
    public final void setNumActiveBodiesKinematic(
    	int mNumActiveBodiesKinematic
    ) {
    	setNumActiveBodiesKinematic(
    		this.segment,
    		mNumActiveBodiesKinematic
    	);
    }
    
    /// ```
    /// Number of soft bodies
    /// ```
    public static int getNumSoftBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_SOFT_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumSoftBodies].
    public final int getNumSoftBodies() {
    	return getNumSoftBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of soft bodies
    /// ```
    public static void setNumSoftBodies(
    	MemorySegment self,
    	int mNumSoftBodies
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_SOFT_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumSoftBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumSoftBodies].
    public final void setNumSoftBodies(
    	int mNumSoftBodies
    ) {
    	setNumSoftBodies(
    		this.segment,
    		mNumSoftBodies
    	);
    }
    
    /// ```
    /// Number of soft bodies that are currently active
    /// ```
    public static int getNumActiveSoftBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_GET_NUM_ACTIVE_SOFT_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumActiveSoftBodies].
    public final int getNumActiveSoftBodies() {
    	return getNumActiveSoftBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of soft bodies that are currently active
    /// ```
    public static void setNumActiveSoftBodies(
    	MemorySegment self,
    	int mNumActiveSoftBodies
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_BODY_STATS_SET_NUM_ACTIVE_SOFT_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumActiveSoftBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumActiveSoftBodies].
    public final void setNumActiveSoftBodies(
    	int mNumActiveSoftBodies
    ) {
    	setNumActiveSoftBodies(
    		this.segment,
    		mNumActiveSoftBodies
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}