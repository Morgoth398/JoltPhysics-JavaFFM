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

public final class CapsuleShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_SET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_IS_VALID;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_IS_SPHERE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CapsuleShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_CapsuleShapeSettings_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_CapsuleShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_GET_RADIUS = downcallHandle("JPH_CapsuleShapeSettings_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_CapsuleShapeSettings_SetRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_CYLINDER = downcallHandle("JPH_CapsuleShapeSettings_GetHalfHeightOfCylinder", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_CYLINDER = downcallHandleVoid("JPH_CapsuleShapeSettings_SetHalfHeightOfCylinder", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CAPSULE_SHAPE_SETTINGS_IS_VALID = downcallHandle("JPH_CapsuleShapeSettings_IsValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_SETTINGS_IS_SPHERE = downcallHandle("JPH_CapsuleShapeSettings_IsSphere", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CapsuleShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CapsuleShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CapsuleShapeSettings(
	    float inHalfHeightOfCylinder,
	    float inRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfHeightOfCylinder,
	        inRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public CapsuleShapeSettings(
		Arena arena,
		float inHalfHeightOfCylinder,
		float inRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inHalfHeightOfCylinder,
			inRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CapsuleShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a capsule centered around the origin with one sphere cap at (0, -inHalfHeightOfCylinder, 0) and the other at (0, inHalfHeightOfCylinder, 0)
    /// ```
    public static MemorySegment create1(
    	float inHalfHeightOfCylinder,
    	float inRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfHeightOfCylinder,
    			inRadius,
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
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float getRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_GET_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRadius].
    public final float getRadius() {
    	return getRadius(
    		this.segment
    	);
    }
    
    public static void setRadius(
    	MemorySegment self,
    	float mRadius
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_SET_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRadius].
    public final void setRadius(
    	float mRadius
    ) {
    	setRadius(
    		this.segment,
    		mRadius
    	);
    }
    
    public static float getHalfHeightOfCylinder(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_GET_HALF_HEIGHT_OF_CYLINDER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfHeightOfCylinder].
    public final float getHalfHeightOfCylinder() {
    	return getHalfHeightOfCylinder(
    		this.segment
    	);
    }
    
    public static void setHalfHeightOfCylinder(
    	MemorySegment self,
    	float mHalfHeightOfCylinder
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_SET_HALF_HEIGHT_OF_CYLINDER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfHeightOfCylinder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfHeightOfCylinder].
    public final void setHalfHeightOfCylinder(
    	float mHalfHeightOfCylinder
    ) {
    	setHalfHeightOfCylinder(
    		this.segment,
    		mHalfHeightOfCylinder
    	);
    }
    
    /// ```
    /// Check if this is a valid capsule shape
    /// ```
    public static boolean isValid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_IS_VALID.get();
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
    /// Checks if the settings of this capsule make this shape a sphere
    /// ```
    public static boolean isSphere(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_IS_SPHERE.get();
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