/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.geometry.PlaneArray;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConvexHullShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_MAX_POINTS_IN_HULL;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_DRAW_FACE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SET_DRAW_FACE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_DRAW_SHRUNK_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_PLANES;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_POINT;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONVEX_HULL_SHAPE_CREATE = downcallHandle("JPH_ConvexHullShape_Create", UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_CREATE1 = downcallHandle("JPH_ConvexHullShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_ConvexHullShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_MAX_POINTS_IN_HULL = downcallHandle("JPH_ConvexHullShape_GetMaxPointsInHull", JAVA_INT);
		JPH_CONVEX_HULL_SHAPE_GET_DRAW_FACE_OUTLINES = downcallHandle("JPH_ConvexHullShape_GetDrawFaceOutlines", JAVA_BOOLEAN);
		JPH_CONVEX_HULL_SHAPE_SET_DRAW_FACE_OUTLINES = downcallHandleVoid("JPH_ConvexHullShape_SetDrawFaceOutlines", JAVA_BOOLEAN);
		JPH_CONVEX_HULL_SHAPE_DRAW_SHRUNK_SHAPE = downcallHandleVoid("JPH_ConvexHullShape_DrawShrunkShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_ConvexHullShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_PLANES = downcallHandle("JPH_ConvexHullShape_GetPlanes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS = downcallHandle("JPH_ConvexHullShape_GetNumPoints", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_POINT = downcallHandleVoid("JPH_ConvexHullShape_GetPoint", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES = downcallHandle("JPH_ConvexHullShape_GetNumFaces", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE = downcallHandle("JPH_ConvexHullShape_GetNumVerticesInFace", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES = downcallHandle("JPH_ConvexHullShape_GetFaceVertices", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConvexHullShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ConvexHullShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConvexHullShape(
	    ConvexHullShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public ConvexHullShape(
		Arena arena,
		ConvexHullShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ConvexHullShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConvexShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maximum amount of points supported in a convex hull. Note that while constructing a hull, interior points are discarded so you can provide more points.
    /// The ConvexHullShapeSettings::Create function will return an error when too many points are provided.
    /// ```
    public static int getMaxPointsInHull() {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_MAX_POINTS_IN_HULL.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the outlines of the faces of the convex hull when drawing the shape
    /// ```
    public static boolean getDrawFaceOutlines() {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_DRAW_FACE_OUTLINES.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the outlines of the faces of the convex hull when drawing the shape
    /// ```
    public static void setDrawFaceOutlines(
    	boolean sDrawFaceOutlines
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_SET_DRAW_FACE_OUTLINES.get();
    	try {
    		 method.invokeExact(
    			sDrawFaceOutlines
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Debugging helper draw function that draws how all points are moved when a shape is shrunk by the convex radius
    /// ```
    public static void drawShrunkShape(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_DRAW_SHRUNK_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawShrunkShape].
    public final void drawShrunkShape(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale
    ) {
    	drawShrunkShape(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Get the convex radius of this convex hull
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_CONVEX_RADIUS.get();
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
    
    /// ```
    /// Get the planes of this convex hull
    /// ```
    public static MemorySegment getPlanes(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_PLANES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlanes].
    public final @Nullable PlaneArray getPlanes() {
    	MemorySegment segment = getPlanes(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PlaneArray(segment);
    }
    
    /// ```
    /// Get the number of vertices in this convex hull
    /// ```
    public static int getNumPoints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumPoints].
    public final int getNumPoints() {
    	return getNumPoints(
    		this.segment
    	);
    }
    
    /// ```
    /// Get a vertex of this convex hull relative to the center of mass
    /// ```
    public static void getPoint(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint].
    public final void getPoint(
    	int inIndex,
    	Vec3 outResult
    ) {
    	getPoint(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the number of faces in this convex hull
    /// ```
    public static int getNumFaces(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumFaces].
    public final int getNumFaces() {
    	return getNumFaces(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the number of vertices in a face
    /// ```
    public static int getNumVerticesInFace(
    	MemorySegment self,
    	int inFaceIndex
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inFaceIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumVerticesInFace].
    public final int getNumVerticesInFace(
    	int inFaceIndex
    ) {
    	return getNumVerticesInFace(
    		this.segment,
    		inFaceIndex
    	);
    }
    
    /// ```
    /// Get the vertices indices of a face
    /// @param inFaceIndex Index of the face.
    /// @param inMaxVertices Maximum number of vertices to return.
    /// @param outVertices Array of vertices indices, must be at least inMaxVertices in size, the vertices are returned in counter clockwise order and the positions can be obtained using GetPoint(index).
    /// @return Number of vertices in face, if this is bigger than inMaxVertices, not all vertices were retrieved.
    /// ```
    public static int getFaceVertices(
    	MemorySegment self,
    	int inFaceIndex,
    	int inMaxVertices,
    	MemorySegment outVertices
    ) {
    	MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inFaceIndex,
    			inMaxVertices,
    			outVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFaceVertices].
    public final int getFaceVertices(
    	int inFaceIndex,
    	int inMaxVertices,
    	NativeIntArray outVertices
    ) {
    	return getFaceVertices(
    		this.segment,
    		inFaceIndex,
    		inMaxVertices,
    		outVertices.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}