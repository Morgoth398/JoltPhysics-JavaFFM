/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.math.Vec3Array;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConvexHullShapeSettings extends ConvexShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_POINTS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_POINTS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_ERROR_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_ERROR_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_HULL_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_HULL_TOLERANCE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ConvexHullShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_ConvexHullShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_ConvexHullShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS = downcallHandle("JPH_ConvexHullShapeSettings_AsConvexShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_POINTS = downcallHandleVoid("JPH_ConvexHullShapeSettings_GetPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_POINTS = downcallHandleVoid("JPH_ConvexHullShapeSettings_SetPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_CONVEX_RADIUS = downcallHandle("JPH_ConvexHullShapeSettings_GetMaxConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_CONVEX_RADIUS = downcallHandleVoid("JPH_ConvexHullShapeSettings_SetMaxConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_ERROR_CONVEX_RADIUS = downcallHandle("JPH_ConvexHullShapeSettings_GetMaxErrorConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_ERROR_CONVEX_RADIUS = downcallHandleVoid("JPH_ConvexHullShapeSettings_SetMaxErrorConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_HULL_TOLERANCE = downcallHandle("JPH_ConvexHullShapeSettings_GetHullTolerance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_HULL_TOLERANCE = downcallHandleVoid("JPH_ConvexHullShapeSettings_SetHullTolerance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public ConvexHullShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ConvexHullShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConvexHullShapeSettings(
	    Vec3 inPoints,
	    int inNumPoints,
	    float inMaxConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inPoints,
	        inNumPoints,
	        inMaxConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create1].
	public ConvexHullShapeSettings(
		Arena arena,
		Vec3 inPoints,
		int inNumPoints,
		float inMaxConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create1(
			inPoints.memorySegment(),
			inNumPoints,
			inMaxConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConvexHullShapeSettings(
	    Vec3Array inPoints,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inPoints,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create2].
	public ConvexHullShapeSettings(
		Arena arena,
		Vec3Array inPoints,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create2(
			inPoints.memorySegment(),
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConvexHullShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a convex hull from inPoints and maximum convex radius inMaxConvexRadius, the radius is automatically lowered if the hull requires it.
    /// (internally this will be subtracted so the total size will not grow with the convex radius).
    /// ```
    public static MemorySegment create1(
    	MemorySegment inPoints,
    	int inNumPoints,
    	float inMaxConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPoints,
    			inNumPoints,
    			inMaxConvexRadius,
    			inMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inPoints,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPoints,
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
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_AS_CONVEX_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Points to create the hull from. Note that these points don't need to be the vertices of the convex hull, they can contain interior points or points on faces/edges.
    /// ```
    public static void getPoints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_POINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoints].
    public final void getPoints(
    	Vec3Array outResult
    ) {
    	getPoints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Points to create the hull from. Note that these points don't need to be the vertices of the convex hull, they can contain interior points or points on faces/edges.
    /// ```
    public static void setPoints(
    	MemorySegment self,
    	MemorySegment mPoints
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_POINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoints].
    public final void setPoints(
    	Vec3Array mPoints
    ) {
    	setPoints(
    		this.segment,
    		mPoints.memorySegment()
    	);
    }
    
    /// ```
    /// Convex radius as supplied by the constructor. Note that during hull creation the convex radius can be made smaller if the value is too big for the hull.
    /// ```
    public static float getMaxConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxConvexRadius].
    public final float getMaxConvexRadius() {
    	return getMaxConvexRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Convex radius as supplied by the constructor. Note that during hull creation the convex radius can be made smaller if the value is too big for the hull.
    /// ```
    public static void setMaxConvexRadius(
    	MemorySegment self,
    	float mMaxConvexRadius
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_CONVEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxConvexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxConvexRadius].
    public final void setMaxConvexRadius(
    	float mMaxConvexRadius
    ) {
    	setMaxConvexRadius(
    		this.segment,
    		mMaxConvexRadius
    	);
    }
    
    /// ```
    /// Maximum distance between the shrunk hull + convex radius and the actual hull.
    /// ```
    public static float getMaxErrorConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_MAX_ERROR_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxErrorConvexRadius].
    public final float getMaxErrorConvexRadius() {
    	return getMaxErrorConvexRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum distance between the shrunk hull + convex radius and the actual hull.
    /// ```
    public static void setMaxErrorConvexRadius(
    	MemorySegment self,
    	float mMaxErrorConvexRadius
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_MAX_ERROR_CONVEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxErrorConvexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxErrorConvexRadius].
    public final void setMaxErrorConvexRadius(
    	float mMaxErrorConvexRadius
    ) {
    	setMaxErrorConvexRadius(
    		this.segment,
    		mMaxErrorConvexRadius
    	);
    }
    
    /// ```
    /// Points are allowed this far outside of the hull (increasing this yields a hull with less vertices). Note that the actual used value can be larger if the points of the hull are far apart.
    /// ```
    public static float getHullTolerance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_GET_HULL_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHullTolerance].
    public final float getHullTolerance() {
    	return getHullTolerance(
    		this.segment
    	);
    }
    
    /// ```
    /// Points are allowed this far outside of the hull (increasing this yields a hull with less vertices). Note that the actual used value can be larger if the points of the hull are far apart.
    /// ```
    public static void setHullTolerance(
    	MemorySegment self,
    	float mHullTolerance
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_SET_HULL_TOLERANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHullTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHullTolerance].
    public final void setHullTolerance(
    	float mHullTolerance
    ) {
    	setHullTolerance(
    		this.segment,
    		mHullTolerance
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}