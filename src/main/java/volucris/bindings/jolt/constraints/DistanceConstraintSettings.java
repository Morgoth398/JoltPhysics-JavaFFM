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

public final class DistanceConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DISTANCE_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_DistanceConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_DistanceConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_DistanceConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_DistanceConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_DistanceConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_DistanceConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_DistanceConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_DistanceConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MIN_DISTANCE = downcallHandle("JPH_DistanceConstraintSettings_GetMinDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MIN_DISTANCE = downcallHandleVoid("JPH_DistanceConstraintSettings_SetMinDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MAX_DISTANCE = downcallHandle("JPH_DistanceConstraintSettings_GetMaxDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MAX_DISTANCE = downcallHandleVoid("JPH_DistanceConstraintSettings_SetMaxDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraintSettings_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraintSettings_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DistanceConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DistanceConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public DistanceConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// Constraint will keep mPoint1 (a point on body 1) and mPoint2 (a point on body 2) at the same distance.
    /// Note that this constraint can be used as a cheap PointConstraint by setting mPoint1 = mPoint2 (but this removes only 1 degree of freedom instead of 3).
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT1.get();
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
    /// Constraint will keep mPoint1 (a point on body 1) and mPoint2 (a point on body 2) at the same distance.
    /// Note that this constraint can be used as a cheap PointConstraint by setting mPoint1 = mPoint2 (but this removes only 1 degree of freedom instead of 3).
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	MemorySegment mPoint1
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT1.get();
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
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_POINT2.get();
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
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_POINT2.get();
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
    
    /// ```
    /// Ability to override the distance range at which the two points are kept apart. If the value is negative, it will be replaced by the distance between mPoint1 and mPoint2 (works only if mSpace is world space).
    /// ```
    public static float getMinDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MIN_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinDistance].
    public final float getMinDistance() {
    	return getMinDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Ability to override the distance range at which the two points are kept apart. If the value is negative, it will be replaced by the distance between mPoint1 and mPoint2 (works only if mSpace is world space).
    /// ```
    public static void setMinDistance(
    	MemorySegment self,
    	float mMinDistance
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MIN_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinDistance].
    public final void setMinDistance(
    	float mMinDistance
    ) {
    	setMinDistance(
    		this.segment,
    		mMinDistance
    	);
    }
    
    public static float getMaxDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_MAX_DISTANCE.get();
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
    
    public static void setMaxDistance(
    	MemorySegment self,
    	float mMaxDistance
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_MAX_DISTANCE.get();
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
    /// When enabled, this makes the limits soft. When the constraint exceeds the limits, a spring force will pull it back.
    /// ```
    public static void getLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS.get();
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
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}