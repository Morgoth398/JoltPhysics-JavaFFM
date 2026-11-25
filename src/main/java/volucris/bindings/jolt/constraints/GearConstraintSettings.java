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

public final class GearConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_GET_RATIO;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_SET_RATIO;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_GEAR_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_GearConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_GearConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_GearConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_GearConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1 = downcallHandleVoid("JPH_GearConstraintSettings_GetHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1 = downcallHandleVoid("JPH_GearConstraintSettings_SetHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2 = downcallHandleVoid("JPH_GearConstraintSettings_GetHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2 = downcallHandleVoid("JPH_GearConstraintSettings_SetHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_GET_RATIO = downcallHandle("JPH_GearConstraintSettings_GetRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SETTINGS_SET_RATIO = downcallHandleVoid("JPH_GearConstraintSettings_SetRatio", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public GearConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public GearConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public GearConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// ```
    public static void getHingeAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHingeAxis1].
    public final void getHingeAxis1(
    	Vec3 outResult
    ) {
    	getHingeAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// ```
    public static void setHingeAxis1(
    	MemorySegment self,
    	MemorySegment mHingeAxis1
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHingeAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHingeAxis1].
    public final void setHingeAxis1(
    	Vec3 mHingeAxis1
    ) {
    	setHingeAxis1(
    		this.segment,
    		mHingeAxis1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getHingeAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHingeAxis2].
    public final void getHingeAxis2(
    	Vec3 outResult
    ) {
    	getHingeAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setHingeAxis2(
    	MemorySegment self,
    	MemorySegment mHingeAxis2
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHingeAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHingeAxis2].
    public final void setHingeAxis2(
    	Vec3 mHingeAxis2
    ) {
    	setHingeAxis2(
    		this.segment,
    		mHingeAxis2.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio between both gears, see SetRatio.
    /// ```
    public static float getRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_GET_RATIO.get();
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
    /// Defines the ratio between the rotation of both gears
    /// The ratio is defined as: Gear1Rotation(t) = -ratio * Gear2Rotation(t)
    /// @param inNumTeethGear1 Number of teeth that body 1 has
    /// @param inNumTeethGear2 Number of teeth that body 2 has
    /// ```
    public static void setRatio(
    	MemorySegment self,
    	int inNumTeethGear1,
    	int inNumTeethGear2
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_SET_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNumTeethGear1,
    			inNumTeethGear2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRatio].
    public final void setRatio(
    	int inNumTeethGear1,
    	int inNumTeethGear2
    ) {
    	setRatio(
    		this.segment,
    		inNumTeethGear1,
    		inNumTeethGear2
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}