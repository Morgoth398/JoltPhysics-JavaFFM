/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VertexAttributes {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_SHEAR_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_SHEAR_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_BEND_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_BEND_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRATYPE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRATYPE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRAMAX_DISTANCE_MULTIPLIER;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRAMAX_DISTANCE_MULTIPLIER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_SHEAR_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_GetShearCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_SHEAR_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_SetShearCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_BEND_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_GetBendCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_BEND_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_SetBendCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRATYPE = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_GetLRAType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRATYPE = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_SetLRAType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRAMAX_DISTANCE_MULTIPLIER = downcallHandle("JPH_SoftBodySharedSettingsVertexAttributes_GetLRAMaxDistanceMultiplier", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRAMAX_DISTANCE_MULTIPLIER = downcallHandleVoid("JPH_SoftBodySharedSettingsVertexAttributes_SetLRAMaxDistanceMultiplier", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public VertexAttributes() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VertexAttributes(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VertexAttributes(
	    float inCompliance,
	    float inShearCompliance,
	    float inBendCompliance,
	    int inLRAType,
	    float inLRAMaxDistanceMultiplier
	) {
	    this(
	        Arena.ofAuto(),
	        inCompliance,
	        inShearCompliance,
	        inBendCompliance,
	        inLRAType,
	        inLRAMaxDistanceMultiplier
	    );
	}
	
	/// Typed method of [#create1].
	public VertexAttributes(
		Arena arena,
		float inCompliance,
		float inShearCompliance,
		float inBendCompliance,
		int inLRAType,
		float inLRAMaxDistanceMultiplier
	) {
		MemorySegment segment = create1(
			inCompliance,
			inShearCompliance,
			inBendCompliance,
			inLRAType,
			inLRAMaxDistanceMultiplier
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VertexAttributes(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	float inCompliance,
    	float inShearCompliance,
    	float inBendCompliance,
    	int inLRAType,
    	float inLRAMaxDistanceMultiplier
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCompliance,
    			inShearCompliance,
    			inBendCompliance,
    			inLRAType,
    			inLRAMaxDistanceMultiplier
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The compliance of the normal edges. Set to FLT_MAX to disable regular edges for any edge involving this vertex.
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_COMPLIANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompliance].
    public final float getCompliance() {
    	return getCompliance(
    		this.segment
    	);
    }
    
    /// ```
    /// The compliance of the normal edges. Set to FLT_MAX to disable regular edges for any edge involving this vertex.
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_COMPLIANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCompliance].
    public final void setCompliance(
    	float mCompliance
    ) {
    	setCompliance(
    		this.segment,
    		mCompliance
    	);
    }
    
    /// ```
    /// The compliance of the shear edges. Set to FLT_MAX to disable shear edges for any edge involving this vertex.
    /// ```
    public static float getShearCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_SHEAR_COMPLIANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShearCompliance].
    public final float getShearCompliance() {
    	return getShearCompliance(
    		this.segment
    	);
    }
    
    /// ```
    /// The compliance of the shear edges. Set to FLT_MAX to disable shear edges for any edge involving this vertex.
    /// ```
    public static void setShearCompliance(
    	MemorySegment self,
    	float mShearCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_SHEAR_COMPLIANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShearCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShearCompliance].
    public final void setShearCompliance(
    	float mShearCompliance
    ) {
    	setShearCompliance(
    		this.segment,
    		mShearCompliance
    	);
    }
    
    /// ```
    /// The compliance of the bend edges. Set to FLT_MAX to disable bend edges for any bend constraint involving this vertex.
    /// ```
    public static float getBendCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_BEND_COMPLIANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBendCompliance].
    public final float getBendCompliance() {
    	return getBendCompliance(
    		this.segment
    	);
    }
    
    /// ```
    /// The compliance of the bend edges. Set to FLT_MAX to disable bend edges for any bend constraint involving this vertex.
    /// ```
    public static void setBendCompliance(
    	MemorySegment self,
    	float mBendCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_BEND_COMPLIANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBendCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBendCompliance].
    public final void setBendCompliance(
    	float mBendCompliance
    ) {
    	setBendCompliance(
    		this.segment,
    		mBendCompliance
    	);
    }
    
    /// ```
    /// The type of long range attachment constraint to create.
    /// ```
    public static int getLRAType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRATYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLRAType].
    public final int getLRAType() {
    	return getLRAType(
    		this.segment
    	);
    }
    
    /// ```
    /// The type of long range attachment constraint to create.
    /// ```
    public static void setLRAType(
    	MemorySegment self,
    	int mLRAType
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRATYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLRAType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLRAType].
    public final void setLRAType(
    	int mLRAType
    ) {
    	setLRAType(
    		this.segment,
    		mLRAType
    	);
    }
    
    /// ```
    /// Multiplier for the max distance of the LRA constraint, e.g. 1.01 means the max distance is 1% longer than the calculated distance in the rest pose.
    /// ```
    public static float getLRAMaxDistanceMultiplier(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_GET_LRAMAX_DISTANCE_MULTIPLIER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLRAMaxDistanceMultiplier].
    public final float getLRAMaxDistanceMultiplier() {
    	return getLRAMaxDistanceMultiplier(
    		this.segment
    	);
    }
    
    /// ```
    /// Multiplier for the max distance of the LRA constraint, e.g. 1.01 means the max distance is 1% longer than the calculated distance in the rest pose.
    /// ```
    public static void setLRAMaxDistanceMultiplier(
    	MemorySegment self,
    	float mLRAMaxDistanceMultiplier
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VERTEX_ATTRIBUTES_SET_LRAMAX_DISTANCE_MULTIPLIER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLRAMaxDistanceMultiplier
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLRAMaxDistanceMultiplier].
    public final void setLRAMaxDistanceMultiplier(
    	float mLRAMaxDistanceMultiplier
    ) {
    	setLRAMaxDistanceMultiplier(
    		this.segment,
    		mLRAMaxDistanceMultiplier
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}