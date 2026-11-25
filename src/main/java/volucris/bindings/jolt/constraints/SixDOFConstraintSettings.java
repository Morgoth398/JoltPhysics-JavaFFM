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

public final class SixDOFConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y2;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SIX_DOFCONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_SixDOFConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_SixDOFConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_SixDOFConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetPosition1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetPosition1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetAxisX1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetAxisX1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetAxisY1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y1 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetAxisY1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetPosition2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetPosition2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetAxisX2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetAxisX2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_GetAxisY2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y2 = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetAxisY2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SWING_TYPE = downcallHandle("JPH_SixDOFConstraintSettings_GetSwingType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SWING_TYPE = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetSwingType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFreeAxis", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFreeAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFixedAxis", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFixedAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetLimitedAxis", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	public SixDOFConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SixDOFConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SixDOFConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SPACE.get();
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
    public static void getPosition1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION1.get();
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
    /// Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPosition1(
    	MemorySegment self,
    	MemorySegment mPosition1
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION1.get();
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
    
    public static void getAxisX1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisX1].
    public final void getAxisX1(
    	Vec3 outResult
    ) {
    	getAxisX1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisX1(
    	MemorySegment self,
    	MemorySegment mAxisX1
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAxisX1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisX1].
    public final void setAxisX1(
    	Vec3 mAxisX1
    ) {
    	setAxisX1(
    		this.segment,
    		mAxisX1.memorySegment()
    	);
    }
    
    public static void getAxisY1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisY1].
    public final void getAxisY1(
    	Vec3 outResult
    ) {
    	getAxisY1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisY1(
    	MemorySegment self,
    	MemorySegment mAxisY1
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAxisY1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisY1].
    public final void setAxisY1(
    	Vec3 mAxisY1
    ) {
    	setAxisY1(
    		this.segment,
    		mAxisY1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPosition2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_POSITION2.get();
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
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPosition2(
    	MemorySegment self,
    	MemorySegment mPosition2
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_POSITION2.get();
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
    
    public static void getAxisX2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_X2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisX2].
    public final void getAxisX2(
    	Vec3 outResult
    ) {
    	getAxisX2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisX2(
    	MemorySegment self,
    	MemorySegment mAxisX2
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_X2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAxisX2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisX2].
    public final void setAxisX2(
    	Vec3 mAxisX2
    ) {
    	setAxisX2(
    		this.segment,
    		mAxisX2.memorySegment()
    	);
    }
    
    public static void getAxisY2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_AXIS_Y2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisY2].
    public final void getAxisY2(
    	Vec3 outResult
    ) {
    	getAxisY2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisY2(
    	MemorySegment self,
    	MemorySegment mAxisY2
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_AXIS_Y2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAxisY2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisY2].
    public final void setAxisY2(
    	Vec3 mAxisY2
    ) {
    	setAxisY2(
    		this.segment,
    		mAxisY2.memorySegment()
    	);
    }
    
    /// ```
    /// The type of swing constraint that we want to use.
    /// ```
    public static int getSwingType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_GET_SWING_TYPE.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_SWING_TYPE.get();
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
    /// Make axis free (unconstrained)
    /// ```
    public static void makeFreeAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeFreeAxis].
    public final void makeFreeAxis(
    	int inAxis
    ) {
    	makeFreeAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    public static boolean isFreeAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isFreeAxis].
    public final boolean isFreeAxis(
    	int inAxis
    ) {
    	return isFreeAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    /// ```
    /// Make axis fixed (fixed at value 0)
    /// ```
    public static void makeFixedAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeFixedAxis].
    public final void makeFixedAxis(
    	int inAxis
    ) {
    	makeFixedAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    public static boolean isFixedAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isFixedAxis].
    public final boolean isFixedAxis(
    	int inAxis
    ) {
    	return isFixedAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    /// ```
    /// Set a valid range for the constraint (if inMax < inMin, the axis will become fixed)
    /// ```
    public static void setLimitedAxis(
    	MemorySegment self,
    	int inAxis,
    	float inMin,
    	float inMax
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis,
    			inMin,
    			inMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitedAxis].
    public final void setLimitedAxis(
    	int inAxis,
    	float inMin,
    	float inMax
    ) {
    	setLimitedAxis(
    		this.segment,
    		inAxis,
    		inMin,
    		inMax
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}