/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyContactSettings {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_GET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_SETTINGS_SET_IS_SENSOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_CONTACT_SETTINGS_CREATE = downcallHandle("JPH_SoftBodyContactSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodyContactSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE1 = downcallHandle("JPH_SoftBodyContactSettings_GetInvMassScale1", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE1 = downcallHandleVoid("JPH_SoftBodyContactSettings_SetInvMassScale1", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE2 = downcallHandle("JPH_SoftBodyContactSettings_GetInvMassScale2", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE2 = downcallHandleVoid("JPH_SoftBodyContactSettings_SetInvMassScale2", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2 = downcallHandle("JPH_SoftBodyContactSettings_GetInvInertiaScale2", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2 = downcallHandleVoid("JPH_SoftBodyContactSettings_SetInvInertiaScale2", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CONTACT_SETTINGS_GET_IS_SENSOR = downcallHandle("JPH_SoftBodyContactSettings_GetIsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CONTACT_SETTINGS_SET_IS_SENSOR = downcallHandleVoid("JPH_SoftBodyContactSettings_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		//@formatter:on
	}

	public SoftBodyContactSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SoftBodyContactSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SoftBodyContactSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Scale factor for the inverse mass of the soft body (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static float getInvMassScale1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE1.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvMassScale1].
    public final float getInvMassScale1() {
    	return getInvMassScale1(
    		this.segment
    	);
    }
    
    /// ```
    /// Scale factor for the inverse mass of the soft body (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static void setInvMassScale1(
    	MemorySegment self,
    	float mInvMassScale1
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvMassScale1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvMassScale1].
    public final void setInvMassScale1(
    	float mInvMassScale1
    ) {
    	setInvMassScale1(
    		this.segment,
    		mInvMassScale1
    	);
    }
    
    /// ```
    /// Scale factor for the inverse mass of the other body (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static float getInvMassScale2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_MASS_SCALE2.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvMassScale2].
    public final float getInvMassScale2() {
    	return getInvMassScale2(
    		this.segment
    	);
    }
    
    /// ```
    /// Scale factor for the inverse mass of the other body (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static void setInvMassScale2(
    	MemorySegment self,
    	float mInvMassScale2
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_MASS_SCALE2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvMassScale2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvMassScale2].
    public final void setInvMassScale2(
    	float mInvMassScale2
    ) {
    	setInvMassScale2(
    		this.segment,
    		mInvMassScale2
    	);
    }
    
    /// ```
    /// Scale factor for the inverse inertia of the other body (usually same as mInvMassScale2)
    /// ```
    public static float getInvInertiaScale2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvInertiaScale2].
    public final float getInvInertiaScale2() {
    	return getInvInertiaScale2(
    		this.segment
    	);
    }
    
    /// ```
    /// Scale factor for the inverse inertia of the other body (usually same as mInvMassScale2)
    /// ```
    public static void setInvInertiaScale2(
    	MemorySegment self,
    	float mInvInertiaScale2
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvInertiaScale2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvInertiaScale2].
    public final void setInvInertiaScale2(
    	float mInvInertiaScale2
    ) {
    	setInvInertiaScale2(
    		this.segment,
    		mInvInertiaScale2
    	);
    }
    
    /// ```
    /// If the contact should be treated as a sensor vs body contact (no collision response)
    /// ```
    public static boolean getIsSensor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_GET_IS_SENSOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsSensor].
    public final boolean getIsSensor() {
    	return getIsSensor(
    		this.segment
    	);
    }
    
    /// ```
    /// If the contact should be treated as a sensor vs body contact (no collision response)
    /// ```
    public static void setIsSensor(
    	MemorySegment self,
    	boolean mIsSensor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_SETTINGS_SET_IS_SENSOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsSensor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsSensor].
    public final void setIsSensor(
    	boolean mIsSensor
    ) {
    	setIsSensor(
    		this.segment,
    		mIsSensor
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}