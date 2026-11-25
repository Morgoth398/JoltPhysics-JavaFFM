/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BoxShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_GET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_SET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_GET_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_SET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BOX_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_BoxShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_BoxShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_BoxShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_GET_HALF_EXTENT = downcallHandleVoid("JPH_BoxShapeSettings_GetHalfExtent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_SET_HALF_EXTENT = downcallHandleVoid("JPH_BoxShapeSettings_SetHalfExtent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_GET_CONVEX_RADIUS = downcallHandle("JPH_BoxShapeSettings_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_SETTINGS_SET_CONVEX_RADIUS = downcallHandleVoid("JPH_BoxShapeSettings_SetConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public BoxShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BoxShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BoxShapeSettings(
	    Vec3 inHalfExtent,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfExtent,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public BoxShapeSettings(
		Arena arena,
		Vec3 inHalfExtent,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inHalfExtent.memorySegment(),
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BoxShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a box with half edge length inHalfExtent and convex radius inConvexRadius.
    /// (internally the convex radius will be subtracted from the half extent so the total box will not grow with the convex radius).
    /// ```
    public static MemorySegment create1(
    	MemorySegment inHalfExtent,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfExtent,
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
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Half the size of the box (including convex radius)
    /// ```
    public static void getHalfExtent(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_GET_HALF_EXTENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfExtent].
    public final void getHalfExtent(
    	Vec3 outResult
    ) {
    	getHalfExtent(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Half the size of the box (including convex radius)
    /// ```
    public static void setHalfExtent(
    	MemorySegment self,
    	MemorySegment mHalfExtent
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_SET_HALF_EXTENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfExtent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfExtent].
    public final void setHalfExtent(
    	Vec3 mHalfExtent
    ) {
    	setHalfExtent(
    		this.segment,
    		mHalfExtent.memorySegment()
    	);
    }
    
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_GET_CONVEX_RADIUS.get();
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
    	MethodHandle method = JPH_BOX_SHAPE_SETTINGS_SET_CONVEX_RADIUS.get();
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