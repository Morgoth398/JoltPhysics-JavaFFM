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

public final class SpringSettings {

	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_GET_MODE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_SET_MODE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_GET_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_SET_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_HAS_STIFFNESS;
	private static final LazyConstant<MethodHandle> JPH_SPRING_SETTINGS_HAS_STIFFNESS_OR_DAMPING;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPRING_SETTINGS_CREATE = downcallHandle("JPH_SpringSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_CREATE1 = downcallHandle("JPH_SpringSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_CREATE2 = downcallHandle("JPH_SpringSettings_Create2", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SPRING_SETTINGS_DESTROY = downcallHandleVoid("JPH_SpringSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_GET_MODE = downcallHandle("JPH_SpringSettings_GetMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_SET_MODE = downcallHandleVoid("JPH_SpringSettings_SetMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SPRING_SETTINGS_GET_DAMPING = downcallHandle("JPH_SpringSettings_GetDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_SET_DAMPING = downcallHandleVoid("JPH_SpringSettings_SetDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SPRING_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_SpringSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_SpringSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_HAS_STIFFNESS = downcallHandle("JPH_SpringSettings_HasStiffness", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SPRING_SETTINGS_HAS_STIFFNESS_OR_DAMPING = downcallHandle("JPH_SpringSettings_HasStiffnessOrDamping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SpringSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SpringSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SpringSettings(
	    SpringSettings param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create1].
	public SpringSettings(
		Arena arena,
		SpringSettings param0
	) {
		MemorySegment segment = create1(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SpringSettings(
	    int inMode,
	    float inFrequencyOrStiffness,
	    float inDamping
	) {
	    this(
	        Arena.ofAuto(),
	        inMode,
	        inFrequencyOrStiffness,
	        inDamping
	    );
	}
	
	/// Typed method of [#create2].
	public SpringSettings(
		Arena arena,
		int inMode,
		float inFrequencyOrStiffness,
		float inDamping
	) {
		MemorySegment segment = create2(
			inMode,
			inFrequencyOrStiffness,
			inDamping
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SpringSettings(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SPRING_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_CREATE1.get();
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
    	float inFrequencyOrStiffness,
    	float inDamping
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMode,
    			inFrequencyOrStiffness,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Selects the way in which the spring is defined. See the descriptions of the mFrequency, mStiffness and mDamping properties.
    /// ```
    public static int getMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_GET_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMode].
    public final int getMode() {
    	return getMode(
    		this.segment
    	);
    }
    
    /// ```
    /// Selects the way in which the spring is defined. See the descriptions of the mFrequency, mStiffness and mDamping properties.
    /// ```
    public static void setMode(
    	MemorySegment self,
    	int mMode
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_SET_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMode].
    public final void setMode(
    	int mMode
    ) {
    	setMode(
    		this.segment,
    		mMode
    	);
    }
    
    /// ```
    /// When mMode = ESpringMode::FrequencyAndDamping this is the damping ratio (0 = no damping, 1 = critical damping).
    /// 
    /// When mMode = ESpringMode::StiffnessAndDamping this is the damping (c) in the spring equation F = -k * x - c * v for a linear or T = -k * theta - c * w for an angular spring.
    /// Units are N s / m for a linear spring and N s m / rad for an angular spring.
    /// 
    /// When mMode = ESpringMode::MassNormalizedStiffnessAndDamping this is the damping (c) in the spring equation F = m_eff * (-k * x - c * v) for a linear or T = i_eff * (-k * theta - c * w) for an angular spring.
    /// m_eff / i_eff is the effective mass / inertia of the constraint.
    /// Units are 1 / s for a linear spring and 1 / rad s for an angular spring.
    /// 
    /// Note that if you set this to 0, you will not get an infinite oscillation. Because we integrate physics using an explicit Euler scheme, there is always energy loss.
    /// This is done to keep the simulation from exploding, because with a damping of 0 and even the slightest rounding error, the oscillation could become bigger and bigger until the simulation explodes.
    /// ```
    public static float getDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_GET_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDamping].
    public final float getDamping() {
    	return getDamping(
    		this.segment
    	);
    }
    
    /// ```
    /// When mMode = ESpringMode::FrequencyAndDamping this is the damping ratio (0 = no damping, 1 = critical damping).
    /// 
    /// When mMode = ESpringMode::StiffnessAndDamping this is the damping (c) in the spring equation F = -k * x - c * v for a linear or T = -k * theta - c * w for an angular spring.
    /// Units are N s / m for a linear spring and N s m / rad for an angular spring.
    /// 
    /// When mMode = ESpringMode::MassNormalizedStiffnessAndDamping this is the damping (c) in the spring equation F = m_eff * (-k * x - c * v) for a linear or T = i_eff * (-k * theta - c * w) for an angular spring.
    /// m_eff / i_eff is the effective mass / inertia of the constraint.
    /// Units are 1 / s for a linear spring and 1 / rad s for an angular spring.
    /// 
    /// Note that if you set this to 0, you will not get an infinite oscillation. Because we integrate physics using an explicit Euler scheme, there is always energy loss.
    /// This is done to keep the simulation from exploding, because with a damping of 0 and even the slightest rounding error, the oscillation could become bigger and bigger until the simulation explodes.
    /// ```
    public static void setDamping(
    	MemorySegment self,
    	float mDamping
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_SET_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDamping].
    public final void setDamping(
    	float mDamping
    ) {
    	setDamping(
    		this.segment,
    		mDamping
    	);
    }
    
    /// ```
    /// Saves the contents of the spring settings in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_SAVE_BINARY_STATE.get();
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
    	MethodHandle method = JPH_SPRING_SETTINGS_RESTORE_BINARY_STATE.get();
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
    
    /// ```
    /// Check if the spring has a valid frequency / stiffness, if not the spring will be hard
    /// ```
    public static boolean hasStiffness(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_HAS_STIFFNESS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasStiffness].
    public final boolean hasStiffness() {
    	return hasStiffness(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this spring has stiffness or damping (making it active), if not the constraint will be hard
    /// ```
    public static boolean hasStiffnessOrDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_SETTINGS_HAS_STIFFNESS_OR_DAMPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasStiffnessOrDamping].
    public final boolean hasStiffnessOrDamping() {
    	return hasStiffnessOrDamping(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}