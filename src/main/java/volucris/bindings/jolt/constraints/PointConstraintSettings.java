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

public final class PointConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_POINT_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_PointConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_PointConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_PointConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_PointConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_PointConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_PointConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_PointConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_PointConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PointConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PointConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PointConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// Body 1 constraint position (space determined by mSpace).
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT1.get();
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
    /// Body 1 constraint position (space determined by mSpace).
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	MemorySegment mPoint1
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT1.get();
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
    /// Body 2 constraint position (space determined by mSpace).
    /// Note: Normally you would set mPoint1 = mPoint2 if the bodies are already placed how you want to constrain them (if mSpace = world space).
    /// ```
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_GET_POINT2.get();
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
    /// Body 2 constraint position (space determined by mSpace).
    /// Note: Normally you would set mPoint1 = mPoint2 if the bodies are already placed how you want to constrain them (if mSpace = world space).
    /// ```
    public static void setPoint2(
    	MemorySegment self,
    	MemorySegment mPoint2
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_SET_POINT2.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}