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

public final class FixedConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y1;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X2;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X2;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y2;
	private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_FIXED_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_FixedConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_FixedConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_FixedConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_FixedConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT = downcallHandle("JPH_FixedConstraintSettings_GetAutoDetectPoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT = downcallHandleVoid("JPH_FixedConstraintSettings_SetAutoDetectPoint", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_FixedConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_FixedConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X1 = downcallHandleVoid("JPH_FixedConstraintSettings_GetAxisX1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X1 = downcallHandleVoid("JPH_FixedConstraintSettings_SetAxisX1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y1 = downcallHandleVoid("JPH_FixedConstraintSettings_GetAxisY1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y1 = downcallHandleVoid("JPH_FixedConstraintSettings_SetAxisY1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_FixedConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_FixedConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X2 = downcallHandleVoid("JPH_FixedConstraintSettings_GetAxisX2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X2 = downcallHandleVoid("JPH_FixedConstraintSettings_SetAxisX2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y2 = downcallHandleVoid("JPH_FixedConstraintSettings_GetAxisY2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y2 = downcallHandleVoid("JPH_FixedConstraintSettings_SetAxisY2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public FixedConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public FixedConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public FixedConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// When mSpace is WorldSpace mPoint1 and mPoint2 can be automatically calculated based on the positions of the bodies when the constraint is created (they will be fixated in their current relative position/orientation). Set this to false if you want to supply the attachment points yourself.
    /// ```
    public static boolean getAutoDetectPoint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_AUTO_DETECT_POINT.get();
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
    /// When mSpace is WorldSpace mPoint1 and mPoint2 can be automatically calculated based on the positions of the bodies when the constraint is created (they will be fixated in their current relative position/orientation). Set this to false if you want to supply the attachment points yourself.
    /// ```
    public static void setAutoDetectPoint(
    	MemorySegment self,
    	boolean mAutoDetectPoint
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_AUTO_DETECT_POINT.get();
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
    /// Body 1 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT1.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT1.get();
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
    
    public static void getAxisX1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X1.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X1.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y1.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y1.get();
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
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_POINT2.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_POINT2.get();
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
    
    public static void getAxisX2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_X2.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_X2.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_GET_AXIS_Y2.get();
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
    	MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_SET_AXIS_Y2.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}