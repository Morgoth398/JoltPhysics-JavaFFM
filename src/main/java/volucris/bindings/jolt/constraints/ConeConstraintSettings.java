/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConeConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_GET_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_SET_HALF_CONE_ANGLE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONE_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_ConeConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_ConeConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_ConeConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_ConeConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_ConeConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_ConeConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1 = downcallHandleVoid("JPH_ConeConstraintSettings_GetTwistAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1 = downcallHandleVoid("JPH_ConeConstraintSettings_SetTwistAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_ConeConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_ConeConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2 = downcallHandleVoid("JPH_ConeConstraintSettings_GetTwistAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2 = downcallHandleVoid("JPH_ConeConstraintSettings_SetTwistAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_GET_HALF_CONE_ANGLE = downcallHandle("JPH_ConeConstraintSettings_GetHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SETTINGS_SET_HALF_CONE_ANGLE = downcallHandleVoid("JPH_ConeConstraintSettings_SetHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public ConeConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ConeConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConeConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asTwoBodyConstraintSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This determines in which space the constraint is setup, all properties below should be in the specified space
    /// ```
    public static int getSpace(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_SPACE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpace].
    public final int getSpace() {
    	return getSpace(
    		this.segment
    	);
    }
    
    /// ```
    /// This determines in which space the constraint is setup, all properties below should be in the specified space
    /// ```
    public static void setSpace(
    	MemorySegment self,
    	int mSpace
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_SPACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSpace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpace].
    public final void setSpace(
    	int mSpace
    ) {
    	setSpace(
    		this.segment,
    		mSpace
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint1].
    public final void getPoint1(
    	Vec3 outResult
    ) {
    	getPoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	MemorySegment mPoint1
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoint1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint1].
    public final void setPoint1(
    	Vec3 mPoint1
    ) {
    	setPoint1(
    		this.segment,
    		mPoint1.memorySegment()
    	);
    }
    
    public static void getTwistAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistAxis1].
    public final void getTwistAxis1(
    	Vec3 outResult
    ) {
    	getTwistAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTwistAxis1(
    	MemorySegment self,
    	MemorySegment mTwistAxis1
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTwistAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistAxis1].
    public final void setTwistAxis1(
    	Vec3 mTwistAxis1
    ) {
    	setTwistAxis1(
    		this.segment,
    		mTwistAxis1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint2].
    public final void getPoint2(
    	Vec3 outResult
    ) {
    	getPoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPoint2(
    	MemorySegment self,
    	MemorySegment mPoint2
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoint2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint2].
    public final void setPoint2(
    	Vec3 mPoint2
    ) {
    	setPoint2(
    		this.segment,
    		mPoint2.memorySegment()
    	);
    }
    
    public static void getTwistAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistAxis2].
    public final void getTwistAxis2(
    	Vec3 outResult
    ) {
    	getTwistAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTwistAxis2(
    	MemorySegment self,
    	MemorySegment mTwistAxis2
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTwistAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistAxis2].
    public final void setTwistAxis2(
    	Vec3 mTwistAxis2
    ) {
    	setTwistAxis2(
    		this.segment,
    		mTwistAxis2.memorySegment()
    	);
    }
    
    /// ```
    /// Half of maximum angle between twist axis of body 1 and 2
    /// ```
    public static float getHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_GET_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfConeAngle].
    public final float getHalfConeAngle() {
    	return getHalfConeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Half of maximum angle between twist axis of body 1 and 2
    /// ```
    public static void setHalfConeAngle(
    	MemorySegment self,
    	float mHalfConeAngle
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_SET_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfConeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfConeAngle].
    public final void setHalfConeAngle(
    	float mHalfConeAngle
    ) {
    	setHalfConeAngle(
    		this.segment,
    		mHalfConeAngle
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}