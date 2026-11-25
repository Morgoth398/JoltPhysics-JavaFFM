/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TaperedCapsuleShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_TAPERED_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_TAPERED_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_TOP_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_TOP_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_BOTTOM_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_BOTTOM_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_VALID;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_SPHERE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TaperedCapsuleShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_TaperedCapsuleShapeSettings_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_TaperedCapsuleShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_TAPERED_CYLINDER = downcallHandle("JPH_TaperedCapsuleShapeSettings_GetHalfHeightOfTaperedCylinder", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_TAPERED_CYLINDER = downcallHandleVoid("JPH_TaperedCapsuleShapeSettings_SetHalfHeightOfTaperedCylinder", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_TOP_RADIUS = downcallHandle("JPH_TaperedCapsuleShapeSettings_GetTopRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_TOP_RADIUS = downcallHandleVoid("JPH_TaperedCapsuleShapeSettings_SetTopRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_BOTTOM_RADIUS = downcallHandle("JPH_TaperedCapsuleShapeSettings_GetBottomRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_BOTTOM_RADIUS = downcallHandleVoid("JPH_TaperedCapsuleShapeSettings_SetBottomRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_VALID = downcallHandle("JPH_TaperedCapsuleShapeSettings_IsValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_SPHERE = downcallHandle("JPH_TaperedCapsuleShapeSettings_IsSphere", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TaperedCapsuleShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TaperedCapsuleShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TaperedCapsuleShapeSettings(
	    float inHalfHeightOfTaperedCylinder,
	    float inTopRadius,
	    float inBottomRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfHeightOfTaperedCylinder,
	        inTopRadius,
	        inBottomRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public TaperedCapsuleShapeSettings(
		Arena arena,
		float inHalfHeightOfTaperedCylinder,
		float inTopRadius,
		float inBottomRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inHalfHeightOfTaperedCylinder,
			inTopRadius,
			inBottomRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TaperedCapsuleShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a tapered capsule centered around the origin with one sphere cap at (0, -inHalfHeightOfTaperedCylinder, 0) with radius inBottomRadius and the other at (0, inHalfHeightOfTaperedCylinder, 0) with radius inTopRadius
    /// ```
    public static MemorySegment create1(
    	float inHalfHeightOfTaperedCylinder,
    	float inTopRadius,
    	float inBottomRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfHeightOfTaperedCylinder,
    			inTopRadius,
    			inBottomRadius,
    			inMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConvexShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float getHalfHeightOfTaperedCylinder(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_TAPERED_CYLINDER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfHeightOfTaperedCylinder].
    public final float getHalfHeightOfTaperedCylinder() {
    	return getHalfHeightOfTaperedCylinder(
    		this.segment
    	);
    }
    
    public static void setHalfHeightOfTaperedCylinder(
    	MemorySegment self,
    	float mHalfHeightOfTaperedCylinder
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_TAPERED_CYLINDER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfHeightOfTaperedCylinder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfHeightOfTaperedCylinder].
    public final void setHalfHeightOfTaperedCylinder(
    	float mHalfHeightOfTaperedCylinder
    ) {
    	setHalfHeightOfTaperedCylinder(
    		this.segment,
    		mHalfHeightOfTaperedCylinder
    	);
    }
    
    public static float getTopRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_TOP_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTopRadius].
    public final float getTopRadius() {
    	return getTopRadius(
    		this.segment
    	);
    }
    
    public static void setTopRadius(
    	MemorySegment self,
    	float mTopRadius
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_TOP_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTopRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTopRadius].
    public final void setTopRadius(
    	float mTopRadius
    ) {
    	setTopRadius(
    		this.segment,
    		mTopRadius
    	);
    }
    
    public static float getBottomRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_GET_BOTTOM_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBottomRadius].
    public final float getBottomRadius() {
    	return getBottomRadius(
    		this.segment
    	);
    }
    
    public static void setBottomRadius(
    	MemorySegment self,
    	float mBottomRadius
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_SET_BOTTOM_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBottomRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBottomRadius].
    public final void setBottomRadius(
    	float mBottomRadius
    ) {
    	setBottomRadius(
    		this.segment,
    		mBottomRadius
    	);
    }
    
    /// ```
    /// Check if the settings are valid
    /// ```
    public static boolean isValid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_VALID.get();
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
    /// Checks if the settings of this tapered capsule make this shape a sphere
    /// ```
    public static boolean isSphere(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_IS_SPHERE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSphere].
    public final boolean isSphere() {
    	return isSphere(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}