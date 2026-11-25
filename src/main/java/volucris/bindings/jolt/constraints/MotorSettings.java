/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MotorSettings {

	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE4;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_CREATE5;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_GET_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_GET_MIN_FORCE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_MIN_FORCE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_GET_MAX_FORCE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_MAX_FORCE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_GET_MIN_TORQUE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_MIN_TORQUE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_GET_MAX_TORQUE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_MAX_TORQUE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_FORCE_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_TORQUE_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_FORCE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SET_TORQUE_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_IS_VALID;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_MOTOR_SETTINGS_RESTORE_BINARY_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MOTOR_SETTINGS_CREATE = downcallHandle("JPH_MotorSettings_Create", UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_CREATE1 = downcallHandle("JPH_MotorSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_CREATE2 = downcallHandle("JPH_MotorSettings_Create2", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_CREATE3 = downcallHandle("JPH_MotorSettings_Create3", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_CREATE4 = downcallHandle("JPH_MotorSettings_Create4", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_CREATE5 = downcallHandle("JPH_MotorSettings_Create5", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_DESTROY = downcallHandleVoid("JPH_MotorSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_GET_SPRING_SETTINGS = downcallHandleVoid("JPH_MotorSettings_GetSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SET_SPRING_SETTINGS = downcallHandleVoid("JPH_MotorSettings_SetSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_GET_MIN_FORCE_LIMIT = downcallHandle("JPH_MotorSettings_GetMinForceLimit", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SET_MIN_FORCE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetMinForceLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_GET_MAX_FORCE_LIMIT = downcallHandle("JPH_MotorSettings_GetMaxForceLimit", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SET_MAX_FORCE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetMaxForceLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_GET_MIN_TORQUE_LIMIT = downcallHandle("JPH_MotorSettings_GetMinTorqueLimit", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SET_MIN_TORQUE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetMinTorqueLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_GET_MAX_TORQUE_LIMIT = downcallHandle("JPH_MotorSettings_GetMaxTorqueLimit", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SET_MAX_TORQUE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetMaxTorqueLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_SET_FORCE_LIMITS = downcallHandleVoid("JPH_MotorSettings_SetForceLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_SET_TORQUE_LIMITS = downcallHandleVoid("JPH_MotorSettings_SetTorqueLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_SET_FORCE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetForceLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_SET_TORQUE_LIMIT = downcallHandleVoid("JPH_MotorSettings_SetTorqueLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTOR_SETTINGS_IS_VALID = downcallHandle("JPH_MotorSettings_IsValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_MotorSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTOR_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_MotorSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MotorSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MotorSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(
	    MotorSettings param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create1].
	public MotorSettings(
		Arena arena,
		MotorSettings param0
	) {
		MemorySegment segment = create1(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(
	    int inMode,
	    float inFrequency,
	    float inDamping
	) {
	    this(
	        Arena.ofAuto(),
	        inMode,
	        inFrequency,
	        inDamping
	    );
	}
	
	/// Typed method of [#create2].
	public MotorSettings(
		Arena arena,
		int inMode,
		float inFrequency,
		float inDamping
	) {
		MemorySegment segment = create2(
			inMode,
			inFrequency,
			inDamping
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(
	    float inFrequency,
	    float inDamping
	) {
	    this(
	        Arena.ofAuto(),
	        inFrequency,
	        inDamping
	    );
	}
	
	/// Typed method of [#create3].
	public MotorSettings(
		Arena arena,
		float inFrequency,
		float inDamping
	) {
		MemorySegment segment = create3(
			inFrequency,
			inDamping
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(
	    int inMode,
	    float inFrequency,
	    float inDamping,
	    float inForceLimit,
	    float inTorqueLimit
	) {
	    this(
	        Arena.ofAuto(),
	        inMode,
	        inFrequency,
	        inDamping,
	        inForceLimit,
	        inTorqueLimit
	    );
	}
	
	/// Typed method of [#create4].
	public MotorSettings(
		Arena arena,
		int inMode,
		float inFrequency,
		float inDamping,
		float inForceLimit,
		float inTorqueLimit
	) {
		MemorySegment segment = create4(
			inMode,
			inFrequency,
			inDamping,
			inForceLimit,
			inTorqueLimit
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(
	    float inFrequency,
	    float inDamping,
	    float inForceLimit,
	    float inTorqueLimit
	) {
	    this(
	        Arena.ofAuto(),
	        inFrequency,
	        inDamping,
	        inForceLimit,
	        inTorqueLimit
	    );
	}
	
	/// Typed method of [#create5].
	public MotorSettings(
		Arena arena,
		float inFrequency,
		float inDamping,
		float inForceLimit,
		float inTorqueLimit
	) {
		MemorySegment segment = create5(
			inFrequency,
			inDamping,
			inForceLimit,
			inTorqueLimit
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotorSettings(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	int inMode,
    	float inFrequency,
    	float inDamping
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMode,
    			inFrequency,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	float inFrequency,
    	float inDamping
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inFrequency,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create4(
    	int inMode,
    	float inFrequency,
    	float inDamping,
    	float inForceLimit,
    	float inTorqueLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE4.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMode,
    			inFrequency,
    			inDamping,
    			inForceLimit,
    			inTorqueLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create5(
    	float inFrequency,
    	float inDamping,
    	float inForceLimit,
    	float inTorqueLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_CREATE5.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inFrequency,
    			inDamping,
    			inForceLimit,
    			inTorqueLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Settings for the spring that is used to drive to the position target (not used when motor is a velocity motor).
    /// ```
    public static void getSpringSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_GET_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpringSettings].
    public final void getSpringSettings(
    	SpringSettings outResult
    ) {
    	getSpringSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Settings for the spring that is used to drive to the position target (not used when motor is a velocity motor).
    /// ```
    public static void setSpringSettings(
    	MemorySegment self,
    	MemorySegment mSpringSettings
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpringSettings].
    public final void setSpringSettings(
    	SpringSettings mSpringSettings
    ) {
    	setSpringSettings(
    		this.segment,
    		mSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Minimum force to apply in case of a linear constraint (N). Usually this is -mMaxForceLimit unless you want a motor that can e.g. push but not pull. Not used when motor is an angular motor.
    /// ```
    public static float getMinForceLimit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_GET_MIN_FORCE_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinForceLimit].
    public final float getMinForceLimit() {
    	return getMinForceLimit(
    		this.segment
    	);
    }
    
    /// ```
    /// Minimum force to apply in case of a linear constraint (N). Usually this is -mMaxForceLimit unless you want a motor that can e.g. push but not pull. Not used when motor is an angular motor.
    /// ```
    public static void setMinForceLimit(
    	MemorySegment self,
    	float mMinForceLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_MIN_FORCE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinForceLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinForceLimit].
    public final void setMinForceLimit(
    	float mMinForceLimit
    ) {
    	setMinForceLimit(
    		this.segment,
    		mMinForceLimit
    	);
    }
    
    /// ```
    /// Maximum force to apply in case of a linear constraint (N). Not used when motor is an angular motor.
    /// ```
    public static float getMaxForceLimit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_GET_MAX_FORCE_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxForceLimit].
    public final float getMaxForceLimit() {
    	return getMaxForceLimit(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum force to apply in case of a linear constraint (N). Not used when motor is an angular motor.
    /// ```
    public static void setMaxForceLimit(
    	MemorySegment self,
    	float mMaxForceLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_MAX_FORCE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxForceLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxForceLimit].
    public final void setMaxForceLimit(
    	float mMaxForceLimit
    ) {
    	setMaxForceLimit(
    		this.segment,
    		mMaxForceLimit
    	);
    }
    
    /// ```
    /// Minimum torque to apply in case of a angular constraint (N m). Usually this is -mMaxTorqueLimit unless you want a motor that can e.g. push but not pull. Not used when motor is a linear motor.
    /// ```
    public static float getMinTorqueLimit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_GET_MIN_TORQUE_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinTorqueLimit].
    public final float getMinTorqueLimit() {
    	return getMinTorqueLimit(
    		this.segment
    	);
    }
    
    /// ```
    /// Minimum torque to apply in case of a angular constraint (N m). Usually this is -mMaxTorqueLimit unless you want a motor that can e.g. push but not pull. Not used when motor is a linear motor.
    /// ```
    public static void setMinTorqueLimit(
    	MemorySegment self,
    	float mMinTorqueLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_MIN_TORQUE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinTorqueLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinTorqueLimit].
    public final void setMinTorqueLimit(
    	float mMinTorqueLimit
    ) {
    	setMinTorqueLimit(
    		this.segment,
    		mMinTorqueLimit
    	);
    }
    
    /// ```
    /// Maximum torque to apply in case of a angular constraint (N m). Not used when motor is a linear motor.
    /// ```
    public static float getMaxTorqueLimit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_GET_MAX_TORQUE_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxTorqueLimit].
    public final float getMaxTorqueLimit() {
    	return getMaxTorqueLimit(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum torque to apply in case of a angular constraint (N m). Not used when motor is a linear motor.
    /// ```
    public static void setMaxTorqueLimit(
    	MemorySegment self,
    	float mMaxTorqueLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_MAX_TORQUE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxTorqueLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxTorqueLimit].
    public final void setMaxTorqueLimit(
    	float mMaxTorqueLimit
    ) {
    	setMaxTorqueLimit(
    		this.segment,
    		mMaxTorqueLimit
    	);
    }
    
    /// ```
    /// Set asymmetric force limits
    /// ```
    public static void setForceLimits(
    	MemorySegment self,
    	float inMin,
    	float inMax
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_FORCE_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMin,
    			inMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setForceLimits].
    public final void setForceLimits(
    	float inMin,
    	float inMax
    ) {
    	setForceLimits(
    		this.segment,
    		inMin,
    		inMax
    	);
    }
    
    /// ```
    /// Set asymmetric torque limits
    /// ```
    public static void setTorqueLimits(
    	MemorySegment self,
    	float inMin,
    	float inMax
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_TORQUE_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMin,
    			inMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTorqueLimits].
    public final void setTorqueLimits(
    	float inMin,
    	float inMax
    ) {
    	setTorqueLimits(
    		this.segment,
    		inMin,
    		inMax
    	);
    }
    
    /// ```
    /// Set symmetric force limits
    /// ```
    public static void setForceLimit(
    	MemorySegment self,
    	float inLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_FORCE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setForceLimit].
    public final void setForceLimit(
    	float inLimit
    ) {
    	setForceLimit(
    		this.segment,
    		inLimit
    	);
    }
    
    /// ```
    /// Set symmetric torque limits
    /// ```
    public static void setTorqueLimit(
    	MemorySegment self,
    	float inLimit
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SET_TORQUE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTorqueLimit].
    public final void setTorqueLimit(
    	float inLimit
    ) {
    	setTorqueLimit(
    		this.segment,
    		inLimit
    	);
    }
    
    /// ```
    /// Check if settings are valid
    /// ```
    public static boolean isValid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public final boolean isValid() {
    	return isValid(
    		this.segment
    	);
    }
    
    /// ```
    /// Saves the contents of the motor settings in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restores contents from the binary stream inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_MOTOR_SETTINGS_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBinaryState].
    public final void restoreBinaryState(
    	StreamIn inStream
    ) {
    	restoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}