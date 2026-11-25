/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ContactSettings {

	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_COMBINED_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_COMBINED_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_COMBINED_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_COMBINED_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_RELATIVE_LINEAR_SURFACE_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_RELATIVE_LINEAR_SURFACE_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_GET_RELATIVE_ANGULAR_SURFACE_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_SETTINGS_SET_RELATIVE_ANGULAR_SURFACE_VELOCITY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONTACT_SETTINGS_CREATE = downcallHandle("JPH_ContactSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_DESTROY = downcallHandleVoid("JPH_ContactSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_GET_COMBINED_FRICTION = downcallHandle("JPH_ContactSettings_GetCombinedFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_COMBINED_FRICTION = downcallHandleVoid("JPH_ContactSettings_SetCombinedFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_COMBINED_RESTITUTION = downcallHandle("JPH_ContactSettings_GetCombinedRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_COMBINED_RESTITUTION = downcallHandleVoid("JPH_ContactSettings_SetCombinedRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE1 = downcallHandle("JPH_ContactSettings_GetInvMassScale1", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE1 = downcallHandleVoid("JPH_ContactSettings_SetInvMassScale1", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE1 = downcallHandle("JPH_ContactSettings_GetInvInertiaScale1", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE1 = downcallHandleVoid("JPH_ContactSettings_SetInvInertiaScale1", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE2 = downcallHandle("JPH_ContactSettings_GetInvMassScale2", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE2 = downcallHandleVoid("JPH_ContactSettings_SetInvMassScale2", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2 = downcallHandle("JPH_ContactSettings_GetInvInertiaScale2", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2 = downcallHandleVoid("JPH_ContactSettings_SetInvInertiaScale2", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_SETTINGS_GET_IS_SENSOR = downcallHandle("JPH_ContactSettings_GetIsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_IS_SENSOR = downcallHandleVoid("JPH_ContactSettings_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CONTACT_SETTINGS_GET_RELATIVE_LINEAR_SURFACE_VELOCITY = downcallHandleVoid("JPH_ContactSettings_GetRelativeLinearSurfaceVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_RELATIVE_LINEAR_SURFACE_VELOCITY = downcallHandleVoid("JPH_ContactSettings_SetRelativeLinearSurfaceVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_GET_RELATIVE_ANGULAR_SURFACE_VELOCITY = downcallHandleVoid("JPH_ContactSettings_GetRelativeAngularSurfaceVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_SETTINGS_SET_RELATIVE_ANGULAR_SURFACE_VELOCITY = downcallHandleVoid("JPH_ContactSettings_SetRelativeAngularSurfaceVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ContactSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ContactSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ContactSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CONTACT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Combined friction for the body pair (see: PhysicsSystem::SetCombineFriction)
    /// ```
    public static float getCombinedFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_COMBINED_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCombinedFriction].
    public final float getCombinedFriction() {
    	return getCombinedFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Combined friction for the body pair (see: PhysicsSystem::SetCombineFriction)
    /// ```
    public static void setCombinedFriction(
    	MemorySegment self,
    	float mCombinedFriction
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_COMBINED_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCombinedFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCombinedFriction].
    public final void setCombinedFriction(
    	float mCombinedFriction
    ) {
    	setCombinedFriction(
    		this.segment,
    		mCombinedFriction
    	);
    }
    
    /// ```
    /// Combined restitution for the body pair (see: PhysicsSystem::SetCombineRestitution)
    /// ```
    public static float getCombinedRestitution(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_COMBINED_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCombinedRestitution].
    public final float getCombinedRestitution() {
    	return getCombinedRestitution(
    		this.segment
    	);
    }
    
    /// ```
    /// Combined restitution for the body pair (see: PhysicsSystem::SetCombineRestitution)
    /// ```
    public static void setCombinedRestitution(
    	MemorySegment self,
    	float mCombinedRestitution
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_COMBINED_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCombinedRestitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCombinedRestitution].
    public final void setCombinedRestitution(
    	float mCombinedRestitution
    ) {
    	setCombinedRestitution(
    		this.segment,
    		mCombinedRestitution
    	);
    }
    
    /// ```
    /// Scale factor for the inverse mass of body 1 (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static float getInvMassScale1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE1.get();
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
    /// Scale factor for the inverse mass of body 1 (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static void setInvMassScale1(
    	MemorySegment self,
    	float mInvMassScale1
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE1.get();
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
    /// Scale factor for the inverse inertia of body 1 (usually same as mInvMassScale1)
    /// ```
    public static float getInvInertiaScale1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE1.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvInertiaScale1].
    public final float getInvInertiaScale1() {
    	return getInvInertiaScale1(
    		this.segment
    	);
    }
    
    /// ```
    /// Scale factor for the inverse inertia of body 1 (usually same as mInvMassScale1)
    /// ```
    public static void setInvInertiaScale1(
    	MemorySegment self,
    	float mInvInertiaScale1
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvInertiaScale1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvInertiaScale1].
    public final void setInvInertiaScale1(
    	float mInvInertiaScale1
    ) {
    	setInvInertiaScale1(
    		this.segment,
    		mInvInertiaScale1
    	);
    }
    
    /// ```
    /// Scale factor for the inverse mass of body 2 (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static float getInvMassScale2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_INV_MASS_SCALE2.get();
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
    /// Scale factor for the inverse mass of body 2 (0 = infinite mass, 1 = use original mass, 2 = body has half the mass). For the same contact pair, you should strive to keep the value the same over time.
    /// ```
    public static void setInvMassScale2(
    	MemorySegment self,
    	float mInvMassScale2
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_INV_MASS_SCALE2.get();
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
    /// Scale factor for the inverse inertia of body 2 (usually same as mInvMassScale2)
    /// ```
    public static float getInvInertiaScale2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_INV_INERTIA_SCALE2.get();
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
    /// Scale factor for the inverse inertia of body 2 (usually same as mInvMassScale2)
    /// ```
    public static void setInvInertiaScale2(
    	MemorySegment self,
    	float mInvInertiaScale2
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_INV_INERTIA_SCALE2.get();
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
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_IS_SENSOR.get();
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
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_IS_SENSOR.get();
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
    
    /// ```
    /// Relative linear surface velocity between the bodies (world space surface velocity of body 2 - world space surface velocity of body 1), can be used to create a conveyor belt effect
    /// ```
    public static void getRelativeLinearSurfaceVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_RELATIVE_LINEAR_SURFACE_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRelativeLinearSurfaceVelocity].
    public final void getRelativeLinearSurfaceVelocity(
    	Vec3 outResult
    ) {
    	getRelativeLinearSurfaceVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Relative linear surface velocity between the bodies (world space surface velocity of body 2 - world space surface velocity of body 1), can be used to create a conveyor belt effect
    /// ```
    public static void setRelativeLinearSurfaceVelocity(
    	MemorySegment self,
    	MemorySegment mRelativeLinearSurfaceVelocity
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_RELATIVE_LINEAR_SURFACE_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRelativeLinearSurfaceVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRelativeLinearSurfaceVelocity].
    public final void setRelativeLinearSurfaceVelocity(
    	Vec3 mRelativeLinearSurfaceVelocity
    ) {
    	setRelativeLinearSurfaceVelocity(
    		this.segment,
    		mRelativeLinearSurfaceVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Relative angular surface velocity between the bodies (world space angular surface velocity of body 2 - world space angular surface velocity of body 1). Note that this angular velocity is relative to the center of mass of body 1, so if you want it relative to body 2's center of mass you need to add body 2 angular velocity x (body 1 world space center of mass - body 2 world space center of mass) to mRelativeLinearSurfaceVelocity.
    /// ```
    public static void getRelativeAngularSurfaceVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_GET_RELATIVE_ANGULAR_SURFACE_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRelativeAngularSurfaceVelocity].
    public final void getRelativeAngularSurfaceVelocity(
    	Vec3 outResult
    ) {
    	getRelativeAngularSurfaceVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Relative angular surface velocity between the bodies (world space angular surface velocity of body 2 - world space angular surface velocity of body 1). Note that this angular velocity is relative to the center of mass of body 1, so if you want it relative to body 2's center of mass you need to add body 2 angular velocity x (body 1 world space center of mass - body 2 world space center of mass) to mRelativeLinearSurfaceVelocity.
    /// ```
    public static void setRelativeAngularSurfaceVelocity(
    	MemorySegment self,
    	MemorySegment mRelativeAngularSurfaceVelocity
    ) {
    	MethodHandle method = JPH_CONTACT_SETTINGS_SET_RELATIVE_ANGULAR_SURFACE_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRelativeAngularSurfaceVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRelativeAngularSurfaceVelocity].
    public final void setRelativeAngularSurfaceVelocity(
    	Vec3 mRelativeAngularSurfaceVelocity
    ) {
    	setRelativeAngularSurfaceVelocity(
    		this.segment,
    		mRelativeAngularSurfaceVelocity.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}