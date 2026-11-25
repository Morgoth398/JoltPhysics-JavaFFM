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

public sealed class ConstraintSettings extends ConstraintSettingsRefTarget
		permits TwoBodyConstraintSettings,
		VehicleConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_CONSTRAINT_PRIORITY;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_CONSTRAINT_PRIORITY;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_DRAW_CONSTRAINT_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_DRAW_CONSTRAINT_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONSTRAINT_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_ConstraintSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_GET_ENABLED = downcallHandle("JPH_ConstraintSettings_GetEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_ENABLED = downcallHandleVoid("JPH_ConstraintSettings_SetEnabled", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CONSTRAINT_SETTINGS_GET_CONSTRAINT_PRIORITY = downcallHandle("JPH_ConstraintSettings_GetConstraintPriority", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_CONSTRAINT_PRIORITY = downcallHandleVoid("JPH_ConstraintSettings_SetConstraintPriority", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_ConstraintSettings_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_ConstraintSettings_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_ConstraintSettings_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_ConstraintSettings_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_SETTINGS_GET_DRAW_CONSTRAINT_SIZE = downcallHandle("JPH_ConstraintSettings_GetDrawConstraintSize", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_DRAW_CONSTRAINT_SIZE = downcallHandleVoid("JPH_ConstraintSettings_SetDrawConstraintSize", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SETTINGS_GET_USER_DATA = downcallHandle("JPH_ConstraintSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_ConstraintSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONSTRAINT_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_ConstraintSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_ConstraintSettings_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_DESTROY = downcallHandleVoid("JPH_ConstraintSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// If this constraint is enabled initially. Use Constraint::SetEnabled to toggle after creation.
    /// ```
    public static boolean getEnabled(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnabled].
    public final boolean getEnabled() {
    	return getEnabled(
    		this.segment
    	);
    }
    
    /// ```
    /// If this constraint is enabled initially. Use Constraint::SetEnabled to toggle after creation.
    /// ```
    public static void setEnabled(
    	MemorySegment self,
    	boolean mEnabled
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_ENABLED.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEnabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnabled].
    public final void setEnabled(
    	boolean mEnabled
    ) {
    	setEnabled(
    		this.segment,
    		mEnabled
    	);
    }
    
    /// ```
    /// Priority of the constraint when solving. Higher numbers are more likely to be solved correctly.
    /// Note that if you want a deterministic simulation and you cannot guarantee the order in which constraints are added/removed, you can make the priority for all constraints unique to get a deterministic ordering.
    /// ```
    public static int getConstraintPriority(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_CONSTRAINT_PRIORITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintPriority].
    public final int getConstraintPriority() {
    	return getConstraintPriority(
    		this.segment
    	);
    }
    
    /// ```
    /// Priority of the constraint when solving. Higher numbers are more likely to be solved correctly.
    /// Note that if you want a deterministic simulation and you cannot guarantee the order in which constraints are added/removed, you can make the priority for all constraints unique to get a deterministic ordering.
    /// ```
    public static void setConstraintPriority(
    	MemorySegment self,
    	int mConstraintPriority
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_CONSTRAINT_PRIORITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mConstraintPriority
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraintPriority].
    public final void setConstraintPriority(
    	int mConstraintPriority
    ) {
    	setConstraintPriority(
    		this.segment,
    		mConstraintPriority
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static int getNumVelocityStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumVelocityStepsOverride].
    public final int getNumVelocityStepsOverride() {
    	return getNumVelocityStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumVelocityStepsOverride(
    	MemorySegment self,
    	int mNumVelocityStepsOverride
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumVelocityStepsOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumVelocityStepsOverride].
    public final void setNumVelocityStepsOverride(
    	int mNumVelocityStepsOverride
    ) {
    	setNumVelocityStepsOverride(
    		this.segment,
    		mNumVelocityStepsOverride
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static int getNumPositionStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumPositionStepsOverride].
    public final int getNumPositionStepsOverride() {
    	return getNumPositionStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumPositionStepsOverride(
    	MemorySegment self,
    	int mNumPositionStepsOverride
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumPositionStepsOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumPositionStepsOverride].
    public final void setNumPositionStepsOverride(
    	int mNumPositionStepsOverride
    ) {
    	setNumPositionStepsOverride(
    		this.segment,
    		mNumPositionStepsOverride
    	);
    }
    
    /// ```
    /// Size of constraint when drawing it through the debug renderer
    /// ```
    public static float getDrawConstraintSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_DRAW_CONSTRAINT_SIZE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawConstraintSize].
    public final float getDrawConstraintSize() {
    	return getDrawConstraintSize(
    		this.segment
    	);
    }
    
    /// ```
    /// Size of constraint when drawing it through the debug renderer
    /// ```
    public static void setDrawConstraintSize(
    	MemorySegment self,
    	float mDrawConstraintSize
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_DRAW_CONSTRAINT_SIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawConstraintSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawConstraintSize].
    public final void setDrawConstraintSize(
    	float mDrawConstraintSize
    ) {
    	setDrawConstraintSize(
    		this.segment,
    		mDrawConstraintSize
    	);
    }
    
    /// ```
    /// User data value (can be used by application)
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data value (can be used by application)
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	long mUserData
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// Saves the contents of the constraint settings in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_SAVE_BINARY_STATE.get();
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
    /// Creates a constraint of the correct type and restores its contents from the binary stream inStream.
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public final void sRestoreFromBinaryState(
    	StreamIn inStream,
    	ConstraintSettingsResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}