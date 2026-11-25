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

public final class CylinderShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_GET_HALF_HEIGHT;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_SET_HALF_HEIGHT;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_SET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_GET_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_SET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CYLINDER_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CylinderShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_CylinderShapeSettings_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_CylinderShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_GET_HALF_HEIGHT = downcallHandle("JPH_CylinderShapeSettings_GetHalfHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_SET_HALF_HEIGHT = downcallHandleVoid("JPH_CylinderShapeSettings_SetHalfHeight", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CYLINDER_SHAPE_SETTINGS_GET_RADIUS = downcallHandle("JPH_CylinderShapeSettings_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_CylinderShapeSettings_SetRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CYLINDER_SHAPE_SETTINGS_GET_CONVEX_RADIUS = downcallHandle("JPH_CylinderShapeSettings_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_SETTINGS_SET_CONVEX_RADIUS = downcallHandleVoid("JPH_CylinderShapeSettings_SetConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public CylinderShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CylinderShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CylinderShapeSettings(
	    float inHalfHeight,
	    float inRadius,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfHeight,
	        inRadius,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public CylinderShapeSettings(
		Arena arena,
		float inHalfHeight,
		float inRadius,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inHalfHeight,
			inRadius,
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CylinderShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a shape centered around the origin with one top at (0, -inHalfHeight, 0) and the other at (0, inHalfHeight, 0) and radius inRadius.
    /// (internally the convex radius will be subtracted from the cylinder the total cylinder will not grow with the convex radius, but the edges of the cylinder will be rounded a bit).
    /// ```
    public static MemorySegment create1(
    	float inHalfHeight,
    	float inRadius,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfHeight,
    			inRadius,
    			inConvexRadius,
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
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float getHalfHeight(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_GET_HALF_HEIGHT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfHeight].
    public final float getHalfHeight() {
    	return getHalfHeight(
    		this.segment
    	);
    }
    
    public static void setHalfHeight(
    	MemorySegment self,
    	float mHalfHeight
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_SET_HALF_HEIGHT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfHeight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfHeight].
    public final void setHalfHeight(
    	float mHalfHeight
    ) {
    	setHalfHeight(
    		this.segment,
    		mHalfHeight
    	);
    }
    
    public static float getRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_GET_RADIUS.get();
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
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_SET_RADIUS.get();
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
    
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_GET_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConvexRadius].
    public final float getConvexRadius() {
    	return getConvexRadius(
    		this.segment
    	);
    }
    
    public static void setConvexRadius(
    	MemorySegment self,
    	float mConvexRadius
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_SET_CONVEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mConvexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConvexRadius].
    public final void setConvexRadius(
    	float mConvexRadius
    ) {
    	setConvexRadius(
    		this.segment,
    		mConvexRadius
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}