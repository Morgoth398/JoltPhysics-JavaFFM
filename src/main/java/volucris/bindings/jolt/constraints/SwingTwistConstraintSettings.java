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

public final class SwingTwistConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_NORMAL_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_NORMAL_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MIN_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MIN_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MOTOR_SETTINGS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_SwingTwistConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_SwingTwistConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_SwingTwistConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetPosition1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetPosition1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetTwistAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetTwistAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetPlaneAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS1 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetPlaneAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetPosition2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetPosition2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetTwistAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetTwistAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetPlaneAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS2 = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetPlaneAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_TYPE = downcallHandle("JPH_SwingTwistConstraintSettings_GetSwingType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_TYPE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetSwingType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_NORMAL_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraintSettings_GetNormalHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_NORMAL_HALF_CONE_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetNormalHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraintSettings_GetPlaneHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_HALF_CONE_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetPlaneHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MIN_ANGLE = downcallHandle("JPH_SwingTwistConstraintSettings_GetTwistMinAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MIN_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetTwistMinAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MAX_ANGLE = downcallHandle("JPH_SwingTwistConstraintSettings_GetTwistMaxAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MAX_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetTwistMaxAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_SwingTwistConstraintSettings_GetMaxFrictionTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetMaxFrictionTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_MOTOR_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetSwingMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_MOTOR_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetSwingMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MOTOR_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraintSettings_GetTwistMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MOTOR_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraintSettings_SetTwistMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SwingTwistConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SwingTwistConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SwingTwistConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// @name Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPosition1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition1].
    public final void getPosition1(
    	Vec3 outResult
    ) {
    	getPosition1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPosition1(
    	MemorySegment self,
    	MemorySegment mPosition1
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition1].
    public final void setPosition1(
    	Vec3 mPosition1
    ) {
    	setPosition1(
    		this.segment,
    		mPosition1.memorySegment()
    	);
    }
    
    public static void getTwistAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS1.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS1.get();
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
    
    public static void getPlaneAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlaneAxis1].
    public final void getPlaneAxis1(
    	Vec3 outResult
    ) {
    	getPlaneAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setPlaneAxis1(
    	MemorySegment self,
    	MemorySegment mPlaneAxis1
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPlaneAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPlaneAxis1].
    public final void setPlaneAxis1(
    	Vec3 mPlaneAxis1
    ) {
    	setPlaneAxis1(
    		this.segment,
    		mPlaneAxis1.memorySegment()
    	);
    }
    
    /// ```
    /// @name Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPosition2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_POSITION2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition2].
    public final void getPosition2(
    	Vec3 outResult
    ) {
    	getPosition2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPosition2(
    	MemorySegment self,
    	MemorySegment mPosition2
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_POSITION2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition2].
    public final void setPosition2(
    	Vec3 mPosition2
    ) {
    	setPosition2(
    		this.segment,
    		mPosition2.memorySegment()
    	);
    }
    
    public static void getTwistAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_AXIS2.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_AXIS2.get();
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
    
    public static void getPlaneAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlaneAxis2].
    public final void getPlaneAxis2(
    	Vec3 outResult
    ) {
    	getPlaneAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setPlaneAxis2(
    	MemorySegment self,
    	MemorySegment mPlaneAxis2
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPlaneAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPlaneAxis2].
    public final void setPlaneAxis2(
    	Vec3 mPlaneAxis2
    ) {
    	setPlaneAxis2(
    		this.segment,
    		mPlaneAxis2.memorySegment()
    	);
    }
    
    /// ```
    /// The type of swing constraint that we want to use.
    /// ```
    public static int getSwingType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingType].
    public final int getSwingType() {
    	return getSwingType(
    		this.segment
    	);
    }
    
    /// ```
    /// The type of swing constraint that we want to use.
    /// ```
    public static void setSwingType(
    	MemorySegment self,
    	int mSwingType
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSwingType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwingType].
    public final void setSwingType(
    	int mSwingType
    ) {
    	setSwingType(
    		this.segment,
    		mSwingType
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians.
    /// ```
    public static float getNormalHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_NORMAL_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalHalfConeAngle].
    public final float getNormalHalfConeAngle() {
    	return getNormalHalfConeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians.
    /// ```
    public static void setNormalHalfConeAngle(
    	MemorySegment self,
    	float mNormalHalfConeAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_NORMAL_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalHalfConeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalHalfConeAngle].
    public final void setNormalHalfConeAngle(
    	float mNormalHalfConeAngle
    ) {
    	setNormalHalfConeAngle(
    		this.segment,
    		mNormalHalfConeAngle
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians.
    /// ```
    public static float getPlaneHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_PLANE_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlaneHalfConeAngle].
    public final float getPlaneHalfConeAngle() {
    	return getPlaneHalfConeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians.
    /// ```
    public static void setPlaneHalfConeAngle(
    	MemorySegment self,
    	float mPlaneHalfConeAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_PLANE_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPlaneHalfConeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPlaneHalfConeAngle].
    public final void setPlaneHalfConeAngle(
    	float mPlaneHalfConeAngle
    ) {
    	setPlaneHalfConeAngle(
    		this.segment,
    		mPlaneHalfConeAngle
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians. Should be \f$\in [-\pi, \pi]\f$.
    /// ```
    public static float getTwistMinAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MIN_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMinAngle].
    public final float getTwistMinAngle() {
    	return getTwistMinAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians. Should be \f$\in [-\pi, \pi]\f$.
    /// ```
    public static void setTwistMinAngle(
    	MemorySegment self,
    	float mTwistMinAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MIN_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTwistMinAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMinAngle].
    public final void setTwistMinAngle(
    	float mTwistMinAngle
    ) {
    	setTwistMinAngle(
    		this.segment,
    		mTwistMinAngle
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians. Should be \f$\in [-\pi, \pi]\f$.
    /// ```
    public static float getTwistMaxAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MAX_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMaxAngle].
    public final float getTwistMaxAngle() {
    	return getTwistMaxAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// See image at Detailed Description. Angle in radians. Should be \f$\in [-\pi, \pi]\f$.
    /// ```
    public static void setTwistMaxAngle(
    	MemorySegment self,
    	float mTwistMaxAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MAX_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTwistMaxAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMaxAngle].
    public final void setTwistMaxAngle(
    	float mTwistMaxAngle
    ) {
    	setTwistMaxAngle(
    		this.segment,
    		mTwistMaxAngle
    	);
    }
    
    /// ```
    /// Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor
    /// ```
    public static float getMaxFrictionTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxFrictionTorque].
    public final float getMaxFrictionTorque() {
    	return getMaxFrictionTorque(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor
    /// ```
    public static void setMaxFrictionTorque(
    	MemorySegment self,
    	float mMaxFrictionTorque
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxFrictionTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFrictionTorque].
    public final void setMaxFrictionTorque(
    	float mMaxFrictionTorque
    ) {
    	setMaxFrictionTorque(
    		this.segment,
    		mMaxFrictionTorque
    	);
    }
    
    /// ```
    /// @name In case the constraint is powered, this determines the motor settings around the swing and twist axis
    /// ```
    public static void getSwingMotorSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_SWING_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingMotorSettings].
    public final void getSwingMotorSettings(
    	MotorSettings outResult
    ) {
    	getSwingMotorSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name In case the constraint is powered, this determines the motor settings around the swing and twist axis
    /// ```
    public static void setSwingMotorSettings(
    	MemorySegment self,
    	MemorySegment mSwingMotorSettings
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_SWING_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSwingMotorSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwingMotorSettings].
    public final void setSwingMotorSettings(
    	MotorSettings mSwingMotorSettings
    ) {
    	setSwingMotorSettings(
    		this.segment,
    		mSwingMotorSettings.memorySegment()
    	);
    }
    
    public static void getTwistMotorSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_GET_TWIST_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMotorSettings].
    public final void getTwistMotorSettings(
    	MotorSettings outResult
    ) {
    	getTwistMotorSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTwistMotorSettings(
    	MemorySegment self,
    	MemorySegment mTwistMotorSettings
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_SET_TWIST_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTwistMotorSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMotorSettings].
    public final void setTwistMotorSettings(
    	MotorSettings mTwistMotorSettings
    ) {
    	setTwistMotorSettings(
    		this.segment,
    		mTwistMotorSettings.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}