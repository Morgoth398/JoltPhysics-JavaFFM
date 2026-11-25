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

public final class PulleyConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT1;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT1;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT1;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT1;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT2;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT2;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT2;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT2;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_RATIO;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_RATIO;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MIN_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MIN_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MAX_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MAX_LENGTH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PULLEY_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_PulleyConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_PulleyConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_PulleyConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_PulleyConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT1 = downcallHandleVoid("JPH_PulleyConstraintSettings_GetBodyPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT1 = downcallHandleVoid("JPH_PulleyConstraintSettings_SetBodyPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT1 = downcallHandleVoid("JPH_PulleyConstraintSettings_GetFixedPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT1 = downcallHandleVoid("JPH_PulleyConstraintSettings_SetFixedPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT2 = downcallHandleVoid("JPH_PulleyConstraintSettings_GetBodyPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT2 = downcallHandleVoid("JPH_PulleyConstraintSettings_SetBodyPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT2 = downcallHandleVoid("JPH_PulleyConstraintSettings_GetFixedPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT2 = downcallHandleVoid("JPH_PulleyConstraintSettings_SetFixedPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_RATIO = downcallHandle("JPH_PulleyConstraintSettings_GetRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_RATIO = downcallHandleVoid("JPH_PulleyConstraintSettings_SetRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MIN_LENGTH = downcallHandle("JPH_PulleyConstraintSettings_GetMinLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MIN_LENGTH = downcallHandleVoid("JPH_PulleyConstraintSettings_SetMinLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MAX_LENGTH = downcallHandle("JPH_PulleyConstraintSettings_GetMaxLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MAX_LENGTH = downcallHandleVoid("JPH_PulleyConstraintSettings_SetMaxLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public PulleyConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PulleyConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PulleyConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This determines in which space the constraint is setup, specified properties below should be in the specified space
    /// ```
    public static int getSpace(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    /// This determines in which space the constraint is setup, specified properties below should be in the specified space
    /// ```
    public static void setSpace(
    	MemorySegment self,
    	int mSpace
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// Body 1 constraint attachment point (space determined by mSpace).
    /// ```
    public static void getBodyPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyPoint1].
    public final void getBodyPoint1(
    	Vec3 outResult
    ) {
    	getBodyPoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 1 constraint attachment point (space determined by mSpace).
    /// ```
    public static void setBodyPoint1(
    	MemorySegment self,
    	MemorySegment mBodyPoint1
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyPoint1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyPoint1].
    public final void setBodyPoint1(
    	Vec3 mBodyPoint1
    ) {
    	setBodyPoint1(
    		this.segment,
    		mBodyPoint1.memorySegment()
    	);
    }
    
    /// ```
    /// Fixed world point to which body 1 is connected (always world space)
    /// ```
    public static void getFixedPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFixedPoint1].
    public final void getFixedPoint1(
    	Vec3 outResult
    ) {
    	getFixedPoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Fixed world point to which body 1 is connected (always world space)
    /// ```
    public static void setFixedPoint1(
    	MemorySegment self,
    	MemorySegment mFixedPoint1
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFixedPoint1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFixedPoint1].
    public final void setFixedPoint1(
    	Vec3 mFixedPoint1
    ) {
    	setFixedPoint1(
    		this.segment,
    		mFixedPoint1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint attachment point (space determined by mSpace)
    /// ```
    public static void getBodyPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_BODY_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyPoint2].
    public final void getBodyPoint2(
    	Vec3 outResult
    ) {
    	getBodyPoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint attachment point (space determined by mSpace)
    /// ```
    public static void setBodyPoint2(
    	MemorySegment self,
    	MemorySegment mBodyPoint2
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_BODY_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyPoint2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyPoint2].
    public final void setBodyPoint2(
    	Vec3 mBodyPoint2
    ) {
    	setBodyPoint2(
    		this.segment,
    		mBodyPoint2.memorySegment()
    	);
    }
    
    /// ```
    /// Fixed world point to which body 2 is connected (always world space)
    /// ```
    public static void getFixedPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_FIXED_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFixedPoint2].
    public final void getFixedPoint2(
    	Vec3 outResult
    ) {
    	getFixedPoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Fixed world point to which body 2 is connected (always world space)
    /// ```
    public static void setFixedPoint2(
    	MemorySegment self,
    	MemorySegment mFixedPoint2
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_FIXED_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFixedPoint2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFixedPoint2].
    public final void setFixedPoint2(
    	Vec3 mFixedPoint2
    ) {
    	setFixedPoint2(
    		this.segment,
    		mFixedPoint2.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio between the two line segments (see formula above), can be used to create a block and tackle
    /// ```
    public static float getRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRatio].
    public final float getRatio() {
    	return getRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Ratio between the two line segments (see formula above), can be used to create a block and tackle
    /// ```
    public static void setRatio(
    	MemorySegment self,
    	float mRatio
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRatio].
    public final void setRatio(
    	float mRatio
    ) {
    	setRatio(
    		this.segment,
    		mRatio
    	);
    }
    
    /// ```
    /// The minimum length of the line segments (see formula above), use -1 to calculate the length based on the positions of the objects when the constraint is created.
    /// ```
    public static float getMinLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MIN_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinLength].
    public final float getMinLength() {
    	return getMinLength(
    		this.segment
    	);
    }
    
    /// ```
    /// The minimum length of the line segments (see formula above), use -1 to calculate the length based on the positions of the objects when the constraint is created.
    /// ```
    public static void setMinLength(
    	MemorySegment self,
    	float mMinLength
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MIN_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinLength].
    public final void setMinLength(
    	float mMinLength
    ) {
    	setMinLength(
    		this.segment,
    		mMinLength
    	);
    }
    
    /// ```
    /// The maximum length of the line segments (see formula above), use -1 to calculate the length based on the positions of the objects when the constraint is created.
    /// ```
    public static float getMaxLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_GET_MAX_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLength].
    public final float getMaxLength() {
    	return getMaxLength(
    		this.segment
    	);
    }
    
    /// ```
    /// The maximum length of the line segments (see formula above), use -1 to calculate the length based on the positions of the objects when the constraint is created.
    /// ```
    public static void setMaxLength(
    	MemorySegment self,
    	float mMaxLength
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SETTINGS_SET_MAX_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLength].
    public final void setMaxLength(
    	float mMaxLength
    ) {
    	setMaxLength(
    		this.segment,
    		mMaxLength
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}