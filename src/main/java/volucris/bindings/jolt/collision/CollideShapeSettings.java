/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollideShapeSettings extends CollideSettingsBase {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_AS_COLLIDE_SETTINGS_BASE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_GET_MAX_SEPARATION_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_SET_MAX_SEPARATION_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_GET_BACK_FACE_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_SET_BACK_FACE_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CollideShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_SETTINGS_AS_COLLIDE_SETTINGS_BASE = downcallHandle("JPH_CollideShapeSettings_AsCollideSettingsBase", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_SETTINGS_GET_MAX_SEPARATION_DISTANCE = downcallHandle("JPH_CollideShapeSettings_GetMaxSeparationDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_SETTINGS_SET_MAX_SEPARATION_DISTANCE = downcallHandleVoid("JPH_CollideShapeSettings_SetMaxSeparationDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SHAPE_SETTINGS_GET_BACK_FACE_MODE = downcallHandle("JPH_CollideShapeSettings_GetBackFaceMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_SETTINGS_SET_BACK_FACE_MODE = downcallHandleVoid("JPH_CollideShapeSettings_SetBackFaceMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLIDE_SHAPE_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ = downcallHandle("JPH_CollideShapeSettings_GetInternalEdgeRemovalVertexToleranceSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ = downcallHandleVoid("JPH_CollideShapeSettings_SetInternalEdgeRemovalVertexToleranceSq", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public CollideShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CollideShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCollideSettingsBase(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CollideShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCollideSettingsBase(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCollideSettingsBase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_AS_COLLIDE_SETTINGS_BASE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// When > 0 contacts in the vicinity of the query shape can be found. All nearest contacts that are not further away than this distance will be found.
    /// Note that in this case CollideShapeResult::mPenetrationDepth can become negative to indicate that objects are not overlapping. (unit: meter)
    /// ```
    public static float getMaxSeparationDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_GET_MAX_SEPARATION_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxSeparationDistance].
    public final float getMaxSeparationDistance() {
    	return getMaxSeparationDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// When > 0 contacts in the vicinity of the query shape can be found. All nearest contacts that are not further away than this distance will be found.
    /// Note that in this case CollideShapeResult::mPenetrationDepth can become negative to indicate that objects are not overlapping. (unit: meter)
    /// ```
    public static void setMaxSeparationDistance(
    	MemorySegment self,
    	float mMaxSeparationDistance
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_SET_MAX_SEPARATION_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxSeparationDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSeparationDistance].
    public final void setMaxSeparationDistance(
    	float mMaxSeparationDistance
    ) {
    	setMaxSeparationDistance(
    		this.segment,
    		mMaxSeparationDistance
    	);
    }
    
    /// ```
    /// How backfacing triangles should be treated
    /// ```
    public static int getBackFaceMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_GET_BACK_FACE_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackFaceMode].
    public final int getBackFaceMode() {
    	return getBackFaceMode(
    		this.segment
    	);
    }
    
    /// ```
    /// How backfacing triangles should be treated
    /// ```
    public static void setBackFaceMode(
    	MemorySegment self,
    	int mBackFaceMode
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_SET_BACK_FACE_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackFaceMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackFaceMode].
    public final void setBackFaceMode(
    	int mBackFaceMode
    ) {
    	setBackFaceMode(
    		this.segment,
    		mBackFaceMode
    	);
    }
    
    /// ```
    /// Max squared distance to consider a vertex to be the same as another vertex, used by the internal edge removal algorithm to determine if two edges are shared. (unit: meter^2)
    /// ```
    public static float getInternalEdgeRemovalVertexToleranceSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInternalEdgeRemovalVertexToleranceSq].
    public final float getInternalEdgeRemovalVertexToleranceSq() {
    	return getInternalEdgeRemovalVertexToleranceSq(
    		this.segment
    	);
    }
    
    /// ```
    /// Max squared distance to consider a vertex to be the same as another vertex, used by the internal edge removal algorithm to determine if two edges are shared. (unit: meter^2)
    /// ```
    public static void setInternalEdgeRemovalVertexToleranceSq(
    	MemorySegment self,
    	float mInternalEdgeRemovalVertexToleranceSq
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInternalEdgeRemovalVertexToleranceSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInternalEdgeRemovalVertexToleranceSq].
    public final void setInternalEdgeRemovalVertexToleranceSq(
    	float mInternalEdgeRemovalVertexToleranceSq
    ) {
    	setInternalEdgeRemovalVertexToleranceSq(
    		this.segment,
    		mInternalEdgeRemovalVertexToleranceSq
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}