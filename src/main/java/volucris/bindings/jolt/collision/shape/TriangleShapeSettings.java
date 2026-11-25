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

public final class TriangleShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_GET_V1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_SET_V1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_GET_V2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_SET_V2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_GET_V3;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_SET_V3;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_GET_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_SET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRIANGLE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TriangleShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_TriangleShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_TriangleShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_GET_V1 = downcallHandleVoid("JPH_TriangleShapeSettings_GetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_SET_V1 = downcallHandleVoid("JPH_TriangleShapeSettings_SetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_GET_V2 = downcallHandleVoid("JPH_TriangleShapeSettings_GetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_SET_V2 = downcallHandleVoid("JPH_TriangleShapeSettings_SetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_GET_V3 = downcallHandleVoid("JPH_TriangleShapeSettings_GetV3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_SET_V3 = downcallHandleVoid("JPH_TriangleShapeSettings_SetV3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_GET_CONVEX_RADIUS = downcallHandle("JPH_TriangleShapeSettings_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_SETTINGS_SET_CONVEX_RADIUS = downcallHandleVoid("JPH_TriangleShapeSettings_SetConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public TriangleShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TriangleShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TriangleShapeSettings(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public TriangleShapeSettings(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TriangleShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a triangle with points (inV1, inV2, inV3) (counter clockwise) and convex radius inConvexRadius.
    /// Note that the convex radius is currently only used for shape vs shape collision, for all other purposes the triangle is infinitely thin.
    /// ```
    public static MemorySegment create1(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
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
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getV1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_GET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV1].
    public final void getV1(
    	Vec3 outResult
    ) {
    	getV1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV1(
    	MemorySegment self,
    	MemorySegment mV1
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_SET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV1].
    public final void setV1(
    	Vec3 mV1
    ) {
    	setV1(
    		this.segment,
    		mV1.memorySegment()
    	);
    }
    
    public static void getV2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_GET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV2].
    public final void getV2(
    	Vec3 outResult
    ) {
    	getV2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV2(
    	MemorySegment self,
    	MemorySegment mV2
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_SET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV2].
    public final void setV2(
    	Vec3 mV2
    ) {
    	setV2(
    		this.segment,
    		mV2.memorySegment()
    	);
    }
    
    public static void getV3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_GET_V3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV3].
    public final void getV3(
    	Vec3 outResult
    ) {
    	getV3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV3(
    	MemorySegment self,
    	MemorySegment mV3
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_SET_V3.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV3].
    public final void setV3(
    	Vec3 mV3
    ) {
    	setV3(
    		this.segment,
    		mV3.memorySegment()
    	);
    }
    
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_GET_CONVEX_RADIUS.get();
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
    	MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_SET_CONVEX_RADIUS.get();
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