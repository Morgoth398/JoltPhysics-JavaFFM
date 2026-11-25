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

public final class RackAndPinionConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_HINGE_AXIS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_HINGE_AXIS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_RATIO;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_RATIO;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_RackAndPinionConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_RackAndPinionConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_RackAndPinionConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_HINGE_AXIS = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_GetHingeAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_HINGE_AXIS = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_SetHingeAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_GetSliderAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_SetSliderAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_RATIO = downcallHandle("JPH_RackAndPinionConstraintSettings_GetRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_RATIO = downcallHandleVoid("JPH_RackAndPinionConstraintSettings_SetRatio", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_INT);
		//@formatter:on
	}

	public RackAndPinionConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RackAndPinionConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RackAndPinionConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
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
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SPACE.get();
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
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SPACE.get();
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
    /// Body 1 (pinion) constraint reference frame (space determined by mSpace).
    /// ```
    public static void getHingeAxis(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_HINGE_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHingeAxis].
    public final void getHingeAxis(
    	Vec3 outResult
    ) {
    	getHingeAxis(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 1 (pinion) constraint reference frame (space determined by mSpace).
    /// ```
    public static void setHingeAxis(
    	MemorySegment self,
    	MemorySegment mHingeAxis
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_HINGE_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHingeAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHingeAxis].
    public final void setHingeAxis(
    	Vec3 mHingeAxis
    ) {
    	setHingeAxis(
    		this.segment,
    		mHingeAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 (rack) constraint reference frame (space determined by mSpace)
    /// ```
    public static void getSliderAxis(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_SLIDER_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSliderAxis].
    public final void getSliderAxis(
    	Vec3 outResult
    ) {
    	getSliderAxis(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 (rack) constraint reference frame (space determined by mSpace)
    /// ```
    public static void setSliderAxis(
    	MemorySegment self,
    	MemorySegment mSliderAxis
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSliderAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSliderAxis].
    public final void setSliderAxis(
    	Vec3 mSliderAxis
    ) {
    	setSliderAxis(
    		this.segment,
    		mSliderAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio between the rack and pinion, see SetRatio.
    /// ```
    public static float getRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_GET_RATIO.get();
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
    /// Defines the ratio between the rotation of the pinion and the translation of the rack.
    /// The ratio is defined as: PinionRotation(t) = ratio * RackTranslation(t)
    /// @param inNumTeethRack Number of teeth that the rack has
    /// @param inRackLength Length of the rack
    /// @param inNumTeethPinion Number of teeth the pinion has
    /// ```
    public static void setRatio(
    	MemorySegment self,
    	int inNumTeethRack,
    	float inRackLength,
    	int inNumTeethPinion
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SETTINGS_SET_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNumTeethRack,
    			inRackLength,
    			inNumTeethPinion
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRatio].
    public final void setRatio(
    	int inNumTeethRack,
    	float inRackLength,
    	int inNumTeethPinion
    ) {
    	setRatio(
    		this.segment,
    		inNumTeethRack,
    		inRackLength,
    		inNumTeethPinion
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}