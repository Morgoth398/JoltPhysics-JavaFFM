/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RodBendTwist {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_OMEGA0;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_OMEGA0;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE = downcallHandle("JPH_SoftBodySharedSettingsRodBendTwist_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsRodBendTwist_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsRodBendTwist_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsRodBendTwist_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsRodBendTwist_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_OMEGA0 = downcallHandleVoid("JPH_SoftBodySharedSettingsRodBendTwist_GetOmega0", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_OMEGA0 = downcallHandleVoid("JPH_SoftBodySharedSettingsRodBendTwist_SetOmega0", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RodBendTwist() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RodBendTwist(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RodBendTwist(
	    int inRod1,
	    int inRod2,
	    float inCompliance
	) {
	    this(
	        Arena.ofAuto(),
	        inRod1,
	        inRod2,
	        inCompliance
	    );
	}
	
	/// Typed method of [#create1].
	public RodBendTwist(
		Arena arena,
		int inRod1,
		int inRod2,
		float inCompliance
	) {
		MemorySegment segment = create1(
			inRod1,
			inRod2,
			inCompliance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RodBendTwist(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inRod1,
    	int inRod2,
    	float inCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRod1,
    			inRod2,
    			inCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Inverse of the stiffness of the rod
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_COMPLIANCE.get();
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
    /// Inverse of the stiffness of the rod
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_COMPLIANCE.get();
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
    /// The initial rotation between the rods: rod1.mBishop.Conjugated() * rod2.mBishop, calculated by CalculateRodProperties
    /// ```
    public static void getOmega0(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_GET_OMEGA0.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOmega0].
    public final void getOmega0(
    	Quat outResult
    ) {
    	getOmega0(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The initial rotation between the rods: rod1.mBishop.Conjugated() * rod2.mBishop, calculated by CalculateRodProperties
    /// ```
    public static void setOmega0(
    	MemorySegment self,
    	MemorySegment mOmega0
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_BEND_TWIST_SET_OMEGA0.get();
    	try {
    		 method.invokeExact(
    			self,
    			mOmega0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setOmega0].
    public final void setOmega0(
    	Quat mOmega0
    ) {
    	setOmega0(
    		this.segment,
    		mOmega0.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}