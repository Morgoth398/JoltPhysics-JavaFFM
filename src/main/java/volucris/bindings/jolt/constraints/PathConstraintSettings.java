/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PathConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_POSITION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_POSITION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_POSITION_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_POSITION_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_GET_ROTATION_CONSTRAINT_TYPE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SETTINGS_SET_ROTATION_CONSTRAINT_TYPE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PATH_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_PathConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_PathConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH = downcallHandleVoid("JPH_PathConstraintSettings_GetPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH = downcallHandleVoid("JPH_PathConstraintSettings_SetPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_POSITION = downcallHandleVoid("JPH_PathConstraintSettings_GetPathPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_POSITION = downcallHandleVoid("JPH_PathConstraintSettings_SetPathPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_ROTATION = downcallHandleVoid("JPH_PathConstraintSettings_GetPathRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_ROTATION = downcallHandleVoid("JPH_PathConstraintSettings_SetPathRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_FRACTION = downcallHandle("JPH_PathConstraintSettings_GetPathFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_FRACTION = downcallHandleVoid("JPH_PathConstraintSettings_SetPathFraction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_PathConstraintSettings_GetMaxFrictionForce", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_PathConstraintSettings_SetMaxFrictionForce", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_POSITION_MOTOR_SETTINGS = downcallHandleVoid("JPH_PathConstraintSettings_GetPositionMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_POSITION_MOTOR_SETTINGS = downcallHandleVoid("JPH_PathConstraintSettings_SetPositionMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_GET_ROTATION_CONSTRAINT_TYPE = downcallHandle("JPH_PathConstraintSettings_GetRotationConstraintType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SETTINGS_SET_ROTATION_CONSTRAINT_TYPE = downcallHandleVoid("JPH_PathConstraintSettings_SetRotationConstraintType", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public PathConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PathConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PathConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The path that constrains the two bodies
    /// ```
    public static void getPath(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPath].
    public final void getPath(
    	PathConstraintPathRefConst outResult
    ) {
    	getPath(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The path that constrains the two bodies
    /// ```
    public static void setPath(
    	MemorySegment self,
    	MemorySegment mPath
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPath
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPath].
    public final void setPath(
    	PathConstraintPathRefConst mPath
    ) {
    	setPath(
    		this.segment,
    		mPath.memorySegment()
    	);
    }
    
    /// ```
    /// The position of the path start relative to world transform of body 1
    /// ```
    public static void getPathPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPathPosition].
    public final void getPathPosition(
    	Vec3 outResult
    ) {
    	getPathPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The position of the path start relative to world transform of body 1
    /// ```
    public static void setPathPosition(
    	MemorySegment self,
    	MemorySegment mPathPosition
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPathPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPathPosition].
    public final void setPathPosition(
    	Vec3 mPathPosition
    ) {
    	setPathPosition(
    		this.segment,
    		mPathPosition.memorySegment()
    	);
    }
    
    /// ```
    /// The rotation of the path start relative to world transform of body 1
    /// ```
    public static void getPathRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPathRotation].
    public final void getPathRotation(
    	Quat outResult
    ) {
    	getPathRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The rotation of the path start relative to world transform of body 1
    /// ```
    public static void setPathRotation(
    	MemorySegment self,
    	MemorySegment mPathRotation
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPathRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPathRotation].
    public final void setPathRotation(
    	Quat mPathRotation
    ) {
    	setPathRotation(
    		this.segment,
    		mPathRotation.memorySegment()
    	);
    }
    
    /// ```
    /// The fraction along the path that corresponds to the initial position of body 2. Usually this is 0, the beginning of the path. But if you want to start an object halfway the path you can calculate this with mPath->GetClosestPoint(point on path to attach body to).
    /// ```
    public static float getPathFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_PATH_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPathFraction].
    public final float getPathFraction() {
    	return getPathFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// The fraction along the path that corresponds to the initial position of body 2. Usually this is 0, the beginning of the path. But if you want to start an object halfway the path you can calculate this with mPath->GetClosestPoint(point on path to attach body to).
    /// ```
    public static void setPathFraction(
    	MemorySegment self,
    	float mPathFraction
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_PATH_FRACTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPathFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPathFraction].
    public final void setPathFraction(
    	float mPathFraction
    ) {
    	setPathFraction(
    		this.segment,
    		mPathFraction
    	);
    }
    
    /// ```
    /// Maximum amount of friction force to apply (N) when not driven by a motor.
    /// ```
    public static float getMaxFrictionForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_FORCE.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_FORCE.get();
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
    /// In case the constraint is powered, this determines the motor settings along the path
    /// ```
    public static void getPositionMotorSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_POSITION_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionMotorSettings].
    public final void getPositionMotorSettings(
    	MotorSettings outResult
    ) {
    	getPositionMotorSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// In case the constraint is powered, this determines the motor settings along the path
    /// ```
    public static void setPositionMotorSettings(
    	MemorySegment self,
    	MemorySegment mPositionMotorSettings
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_POSITION_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPositionMotorSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionMotorSettings].
    public final void setPositionMotorSettings(
    	MotorSettings mPositionMotorSettings
    ) {
    	setPositionMotorSettings(
    		this.segment,
    		mPositionMotorSettings.memorySegment()
    	);
    }
    
    /// ```
    /// How to constrain the rotation of the body to the path
    /// ```
    public static int getRotationConstraintType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_GET_ROTATION_CONSTRAINT_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationConstraintType].
    public final int getRotationConstraintType() {
    	return getRotationConstraintType(
    		this.segment
    	);
    }
    
    /// ```
    /// How to constrain the rotation of the body to the path
    /// ```
    public static void setRotationConstraintType(
    	MemorySegment self,
    	int mRotationConstraintType
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SETTINGS_SET_ROTATION_CONSTRAINT_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRotationConstraintType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotationConstraintType].
    public final void setRotationConstraintType(
    	int mRotationConstraintType
    ) {
    	setRotationConstraintType(
    		this.segment,
    		mRotationConstraintType
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}