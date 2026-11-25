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

public final class SphereShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPHERE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_SphereShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_SphereShapeSettings_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_SphereShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS = downcallHandle("JPH_SphereShapeSettings_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_SphereShapeSettings_SetRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public SphereShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SphereShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SphereShapeSettings(
	    float inRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public SphereShapeSettings(
		Arena arena,
		float inRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SphereShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a sphere with radius inRadius
    /// ```
    public static MemorySegment create1(
    	float inRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
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
    	MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
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
    	MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS.get();
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
    	MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}