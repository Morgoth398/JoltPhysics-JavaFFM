/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Skinned {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_VERTEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_VERTEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_NORMAL_INFO;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_NORMAL_INFO;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_SKIN_WEIGHTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_NORMALIZE_WEIGHTS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE = downcallHandle("JPH_SoftBodySharedSettingsSkinned_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsSkinned_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_VERTEX = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetVertex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_VERTEX = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_SetVertex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_DISTANCE = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetMaxDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_MAX_DISTANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_SetMaxDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_DISTANCE = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetBackStopDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_DISTANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_SetBackStopDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_RADIUS = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetBackStopRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_RADIUS = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_SetBackStopRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_NORMAL_INFO = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetNormalInfo", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_NORMAL_INFO = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_SetNormalInfo", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_SKIN_WEIGHTS = downcallHandle("JPH_SoftBodySharedSettingsSkinned_GetMaxSkinWeights", JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_NORMALIZE_WEIGHTS = downcallHandleVoid("JPH_SoftBodySharedSettingsSkinned_NormalizeWeights", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Skinned() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Skinned(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Skinned(
	    int inVertex,
	    float inMaxDistance,
	    float inBackStopDistance,
	    float inBackStopRadius
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex,
	        inMaxDistance,
	        inBackStopDistance,
	        inBackStopRadius
	    );
	}
	
	/// Typed method of [#create1].
	public Skinned(
		Arena arena,
		int inVertex,
		float inMaxDistance,
		float inBackStopDistance,
		float inBackStopRadius
	) {
		MemorySegment segment = create1(
			inVertex,
			inMaxDistance,
			inBackStopDistance,
			inBackStopRadius
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Skinned(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex,
    	float inMaxDistance,
    	float inBackStopDistance,
    	float inBackStopRadius
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex,
    			inMaxDistance,
    			inBackStopDistance,
    			inBackStopRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index in mVertices which indicates which vertex is being skinned
    /// ```
    public static int getVertex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_VERTEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex].
    public final int getVertex() {
    	return getVertex(
    		this.segment
    	);
    }
    
    /// ```
    /// Index in mVertices which indicates which vertex is being skinned
    /// ```
    public static void setVertex(
    	MemorySegment self,
    	int mVertex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_VERTEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVertex].
    public final void setVertex(
    	int mVertex
    ) {
    	setVertex(
    		this.segment,
    		mVertex
    	);
    }
    
    /// ```
    /// Maximum distance that this vertex can reach from the skinned vertex, disabled when FLT_MAX. 0 when you want to hard skin the vertex to the skinned vertex.
    /// ```
    public static float getMaxDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxDistance].
    public final float getMaxDistance() {
    	return getMaxDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum distance that this vertex can reach from the skinned vertex, disabled when FLT_MAX. 0 when you want to hard skin the vertex to the skinned vertex.
    /// ```
    public static void setMaxDistance(
    	MemorySegment self,
    	float mMaxDistance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_MAX_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxDistance].
    public final void setMaxDistance(
    	float mMaxDistance
    ) {
    	setMaxDistance(
    		this.segment,
    		mMaxDistance
    	);
    }
    
    /// ```
    /// Disabled if mBackStopDistance >= mMaxDistance. The faces surrounding mVertex determine an average normal. mBackStopDistance behind the vertex in the opposite direction of this normal, the back stop sphere starts. The simulated vertex will be pushed out of this sphere and it can be used to approximate the volume of the skinned mesh behind the skinned vertex.
    /// ```
    public static float getBackStopDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackStopDistance].
    public final float getBackStopDistance() {
    	return getBackStopDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Disabled if mBackStopDistance >= mMaxDistance. The faces surrounding mVertex determine an average normal. mBackStopDistance behind the vertex in the opposite direction of this normal, the back stop sphere starts. The simulated vertex will be pushed out of this sphere and it can be used to approximate the volume of the skinned mesh behind the skinned vertex.
    /// ```
    public static void setBackStopDistance(
    	MemorySegment self,
    	float mBackStopDistance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackStopDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackStopDistance].
    public final void setBackStopDistance(
    	float mBackStopDistance
    ) {
    	setBackStopDistance(
    		this.segment,
    		mBackStopDistance
    	);
    }
    
    /// ```
    /// Radius of the backstop sphere. By default this is a fairly large radius so the sphere approximates a plane.
    /// ```
    public static float getBackStopRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_BACK_STOP_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackStopRadius].
    public final float getBackStopRadius() {
    	return getBackStopRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Radius of the backstop sphere. By default this is a fairly large radius so the sphere approximates a plane.
    /// ```
    public static void setBackStopRadius(
    	MemorySegment self,
    	float mBackStopRadius
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_BACK_STOP_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackStopRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackStopRadius].
    public final void setBackStopRadius(
    	float mBackStopRadius
    ) {
    	setBackStopRadius(
    		this.segment,
    		mBackStopRadius
    	);
    }
    
    /// ```
    /// Information needed to calculate the normal of this vertex, lowest 24 bit is start index in mSkinnedConstraintNormals, highest 8 bit is number of faces (generated by CalculateSkinnedConstraintNormals)
    /// ```
    public static int getNormalInfo(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_NORMAL_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalInfo].
    public final int getNormalInfo() {
    	return getNormalInfo(
    		this.segment
    	);
    }
    
    /// ```
    /// Information needed to calculate the normal of this vertex, lowest 24 bit is start index in mSkinnedConstraintNormals, highest 8 bit is number of faces (generated by CalculateSkinnedConstraintNormals)
    /// ```
    public static void setNormalInfo(
    	MemorySegment self,
    	int mNormalInfo
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_SET_NORMAL_INFO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalInfo].
    public final void setNormalInfo(
    	int mNormalInfo
    ) {
    	setNormalInfo(
    		this.segment,
    		mNormalInfo
    	);
    }
    
    /// ```
    /// Maximum number of skin weights
    /// ```
    public static int getMaxSkinWeights() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_GET_MAX_SKIN_WEIGHTS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Normalize the weights so that they add up to 1
    /// ```
    public static void normalizeWeights(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SKINNED_NORMALIZE_WEIGHTS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#normalizeWeights].
    public final void normalizeWeights() {
    	normalizeWeights(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}