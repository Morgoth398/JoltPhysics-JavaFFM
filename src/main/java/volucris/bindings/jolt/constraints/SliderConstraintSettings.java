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

public final class SliderConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SLIDER_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_SliderConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_SliderConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_SliderConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_SliderConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT = downcallHandle("JPH_SliderConstraintSettings_GetAutoDetectPoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT = downcallHandleVoid("JPH_SliderConstraintSettings_SetAutoDetectPoint", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_SliderConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_SliderConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS1 = downcallHandleVoid("JPH_SliderConstraintSettings_GetSliderAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS1 = downcallHandleVoid("JPH_SliderConstraintSettings_SetSliderAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1 = downcallHandleVoid("JPH_SliderConstraintSettings_GetNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1 = downcallHandleVoid("JPH_SliderConstraintSettings_SetNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_SliderConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_SliderConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS2 = downcallHandleVoid("JPH_SliderConstraintSettings_GetSliderAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS2 = downcallHandleVoid("JPH_SliderConstraintSettings_SetSliderAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2 = downcallHandleVoid("JPH_SliderConstraintSettings_GetNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2 = downcallHandleVoid("JPH_SliderConstraintSettings_SetNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MIN = downcallHandle("JPH_SliderConstraintSettings_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MIN = downcallHandleVoid("JPH_SliderConstraintSettings_SetLimitsMin", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MAX = downcallHandle("JPH_SliderConstraintSettings_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MAX = downcallHandleVoid("JPH_SliderConstraintSettings_SetLimitsMax", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraintSettings_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraintSettings_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_SliderConstraintSettings_GetMaxFrictionForce", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_SliderConstraintSettings_SetMaxFrictionForce", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraintSettings_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraintSettings_SetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS = downcallHandleVoid("JPH_SliderConstraintSettings_SetSliderAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SliderConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SliderConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SliderConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// When mSpace is WorldSpace mPoint1 and mPoint2 can be automatically calculated based on the positions of the bodies when the constraint is created (the current relative position/orientation is chosen as the '0' position). Set this to false if you want to supply the attachment points yourself.
    /// ```
    public static boolean getAutoDetectPoint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAutoDetectPoint].
    public final boolean getAutoDetectPoint() {
    	return getAutoDetectPoint(
    		this.segment
    	);
    }
    
    /// ```
    /// When mSpace is WorldSpace mPoint1 and mPoint2 can be automatically calculated based on the positions of the bodies when the constraint is created (the current relative position/orientation is chosen as the '0' position). Set this to false if you want to supply the attachment points yourself.
    /// ```
    public static void setAutoDetectPoint(
    	MemorySegment self,
    	boolean mAutoDetectPoint
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAutoDetectPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAutoDetectPoint].
    public final void setAutoDetectPoint(
    	boolean mAutoDetectPoint
    ) {
    	setAutoDetectPoint(
    		this.segment,
    		mAutoDetectPoint
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// Slider axis is the axis along which movement is possible (direction), normal axis is a perpendicular vector to define the frame.
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT1.get();
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
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// Slider axis is the axis along which movement is possible (direction), normal axis is a perpendicular vector to define the frame.
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	MemorySegment mPoint1
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT1.get();
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
    
    public static void getSliderAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSliderAxis1].
    public final void getSliderAxis1(
    	Vec3 outResult
    ) {
    	getSliderAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setSliderAxis1(
    	MemorySegment self,
    	MemorySegment mSliderAxis1
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSliderAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSliderAxis1].
    public final void setSliderAxis1(
    	Vec3 mSliderAxis1
    ) {
    	setSliderAxis1(
    		this.segment,
    		mSliderAxis1.memorySegment()
    	);
    }
    
    public static void getNormalAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalAxis1].
    public final void getNormalAxis1(
    	Vec3 outResult
    ) {
    	getNormalAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormalAxis1(
    	MemorySegment self,
    	MemorySegment mNormalAxis1
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalAxis1].
    public final void setNormalAxis1(
    	Vec3 mNormalAxis1
    ) {
    	setNormalAxis1(
    		this.segment,
    		mNormalAxis1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_POINT2.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_POINT2.get();
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
    
    public static void getSliderAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSliderAxis2].
    public final void getSliderAxis2(
    	Vec3 outResult
    ) {
    	getSliderAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setSliderAxis2(
    	MemorySegment self,
    	MemorySegment mSliderAxis2
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSliderAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSliderAxis2].
    public final void setSliderAxis2(
    	Vec3 mSliderAxis2
    ) {
    	setSliderAxis2(
    		this.segment,
    		mSliderAxis2.memorySegment()
    	);
    }
    
    public static void getNormalAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalAxis2].
    public final void getNormalAxis2(
    	Vec3 outResult
    ) {
    	getNormalAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormalAxis2(
    	MemorySegment self,
    	MemorySegment mNormalAxis2
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalAxis2].
    public final void setNormalAxis2(
    	Vec3 mNormalAxis2
    ) {
    	setNormalAxis2(
    		this.segment,
    		mNormalAxis2.memorySegment()
    	);
    }
    
    /// ```
    /// When the bodies move so that mPoint1 coincides with mPoint2 the slider position is defined to be 0, movement will be limited between [mLimitsMin, mLimitsMax] where mLimitsMin e [-inf, 0] and mLimitsMax e [0, inf]
    /// ```
    public static float getLimitsMin(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MIN.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMin].
    public final float getLimitsMin() {
    	return getLimitsMin(
    		this.segment
    	);
    }
    
    /// ```
    /// When the bodies move so that mPoint1 coincides with mPoint2 the slider position is defined to be 0, movement will be limited between [mLimitsMin, mLimitsMax] where mLimitsMin e [-inf, 0] and mLimitsMax e [0, inf]
    /// ```
    public static void setLimitsMin(
    	MemorySegment self,
    	float mLimitsMin
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsMin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsMin].
    public final void setLimitsMin(
    	float mLimitsMin
    ) {
    	setLimitsMin(
    		this.segment,
    		mLimitsMin
    	);
    }
    
    public static float getLimitsMax(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_MAX.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMax].
    public final float getLimitsMax() {
    	return getLimitsMax(
    		this.segment
    	);
    }
    
    public static void setLimitsMax(
    	MemorySegment self,
    	float mLimitsMax
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsMax].
    public final void setLimitsMax(
    	float mLimitsMax
    ) {
    	setLimitsMax(
    		this.segment,
    		mLimitsMax
    	);
    }
    
    /// ```
    /// When enabled, this makes the limits soft. When the constraint exceeds the limits, a spring force will pull it back.
    /// ```
    public static void getLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings].
    public final void getLimitsSpringSettings(
    	SpringSettings outResult
    ) {
    	getLimitsSpringSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// When enabled, this makes the limits soft. When the constraint exceeds the limits, a spring force will pull it back.
    /// ```
    public static void setLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment mLimitsSpringSettings
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsSpringSettings].
    public final void setLimitsSpringSettings(
    	SpringSettings mLimitsSpringSettings
    ) {
    	setLimitsSpringSettings(
    		this.segment,
    		mLimitsSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Maximum amount of friction force to apply (N) when not driven by a motor.
    /// ```
    public static float getMaxFrictionForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxFrictionForce].
    public final float getMaxFrictionForce() {
    	return getMaxFrictionForce(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum amount of friction force to apply (N) when not driven by a motor.
    /// ```
    public static void setMaxFrictionForce(
    	MemorySegment self,
    	float mMaxFrictionForce
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxFrictionForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFrictionForce].
    public final void setMaxFrictionForce(
    	float mMaxFrictionForce
    ) {
    	setMaxFrictionForce(
    		this.segment,
    		mMaxFrictionForce
    	);
    }
    
    /// ```
    /// In case the constraint is powered, this determines the motor settings around the sliding axis
    /// ```
    public static void getMotorSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings].
    public final void getMotorSettings(
    	MotorSettings outResult
    ) {
    	getMotorSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// In case the constraint is powered, this determines the motor settings around the sliding axis
    /// ```
    public static void setMotorSettings(
    	MemorySegment self,
    	MemorySegment mMotorSettings
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMotorSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorSettings].
    public final void setMotorSettings(
    	MotorSettings mMotorSettings
    ) {
    	setMotorSettings(
    		this.segment,
    		mMotorSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Simple way of setting the slider and normal axis in world space (assumes the bodies are already oriented correctly when the constraint is created)
    /// ```
    public static void setSliderAxis(
    	MemorySegment self,
    	MemorySegment inSliderAxis
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSliderAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSliderAxis].
    public final void setSliderAxis(
    	Vec3 inSliderAxis
    ) {
    	setSliderAxis(
    		this.segment,
    		inSliderAxis.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}