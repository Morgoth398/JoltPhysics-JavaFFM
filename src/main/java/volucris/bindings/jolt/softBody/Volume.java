/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Volume {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_SIX_REST_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_SIX_REST_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_MIN_VERTEX_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE = downcallHandle("JPH_SoftBodySharedSettingsVolume_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsVolume_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsVolume_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_SIX_REST_VOLUME = downcallHandle("JPH_SoftBodySharedSettingsVolume_GetSixRestVolume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_SIX_REST_VOLUME = downcallHandleVoid("JPH_SoftBodySharedSettingsVolume_SetSixRestVolume", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsVolume_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsVolume_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_MIN_VERTEX_INDEX = downcallHandle("JPH_SoftBodySharedSettingsVolume_GetMinVertexIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Volume() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Volume(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Volume(
	    int inVertex1,
	    int inVertex2,
	    int inVertex3,
	    int inVertex4,
	    float inCompliance
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inVertex3,
	        inVertex4,
	        inCompliance
	    );
	}
	
	/// Typed method of [#create1].
	public Volume(
		Arena arena,
		int inVertex1,
		int inVertex2,
		int inVertex3,
		int inVertex4,
		float inCompliance
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inVertex3,
			inVertex4,
			inCompliance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Volume(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	int inVertex3,
    	int inVertex4,
    	float inCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inVertex3,
    			inVertex4,
    			inCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 6 times the rest volume of the tetrahedron, calculated by CalculateVolumeConstraintVolumes
    /// ```
    public static float getSixRestVolume(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_SIX_REST_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSixRestVolume].
    public final float getSixRestVolume() {
    	return getSixRestVolume(
    		this.segment
    	);
    }
    
    /// ```
    /// 6 times the rest volume of the tetrahedron, calculated by CalculateVolumeConstraintVolumes
    /// ```
    public static void setSixRestVolume(
    	MemorySegment self,
    	float mSixRestVolume
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_SIX_REST_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSixRestVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSixRestVolume].
    public final void setSixRestVolume(
    	float mSixRestVolume
    ) {
    	setSixRestVolume(
    		this.segment,
    		mSixRestVolume
    	);
    }
    
    /// ```
    /// Inverse of the stiffness of the constraint
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_COMPLIANCE.get();
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
    /// Inverse of the stiffness of the constraint
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_SET_COMPLIANCE.get();
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
    /// Return the lowest vertex index of this constraint
    /// ```
    public static int getMinVertexIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_VOLUME_GET_MIN_VERTEX_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinVertexIndex].
    public final int getMinVertexIndex() {
    	return getMinVertexIndex(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}