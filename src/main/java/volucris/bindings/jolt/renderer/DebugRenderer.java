/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.RefTargetVirtualRef;
import volucris.bindings.jolt.UnsignedIntArray;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.geometry.IndexedTriangleNoMaterial;
import volucris.bindings.jolt.geometry.IndexedTriangleNoMaterialArray;
import volucris.bindings.jolt.geometry.OrientedBox;
import volucris.bindings.jolt.math.Float3;
import volucris.bindings.jolt.math.Float3Array;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class DebugRenderer {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_NEXT_FRAME;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_BOX;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_BOX1;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_MARKER;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_ARROW;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_PLANE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_BOX;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_BOX1;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_CAPSULE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_OPEN_CONE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_PIE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH2;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH3;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH4;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH5;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH_FOR_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE_TRIANGLE_GEOMETRY_FOR_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_GEOMETRY1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_CREATE = downcallHandle("JPH_DebugRenderer_Create", UNBOUNDED_ADDRESS, DebugRendererFunctions.LAYOUT);
		JPH_DEBUG_RENDERER_DESTROY = downcallHandleVoid("JPH_DebugRenderer_Destroy", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_TRIANGLES = downcallHandle("JPH_DebugRenderer_GetElementFromInTriangles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_VERTICES = downcallHandle("JPH_DebugRenderer_GetElementFromInVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_NEXT_FRAME = downcallHandleVoid("JPH_DebugRenderer_NextFrame", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_WIRE_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_WIRE_BOX1 = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2 = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_MARKER = downcallHandleVoid("JPH_DebugRenderer_DrawMarker", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_ARROW = downcallHandleVoid("JPH_DebugRenderer_DrawArrow", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM = downcallHandleVoid("JPH_DebugRenderer_DrawCoordinateSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_PLANE = downcallHandleVoid("JPH_DebugRenderer_DrawPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE = downcallHandleVoid("JPH_DebugRenderer_DrawWireTriangle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireUnitSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_BOX1 = downcallHandleVoid("JPH_DebugRenderer_DrawBox1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawUnitSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_CAPSULE = downcallHandleVoid("JPH_DebugRenderer_DrawCapsule", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawCylinder", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_OPEN_CONE = downcallHandleVoid("JPH_DebugRenderer_DrawOpenCone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingConeLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingPyramidLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_PIE = downcallHandleVoid("JPH_DebugRenderer_DrawPie", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawTaperedCylinder", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH2 = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleBatch2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH3 = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleBatch3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH4 = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleBatch4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH5 = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleBatch5", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH_FOR_CONVEX = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleBatchForConvex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_CREATE_TRIANGLE_GEOMETRY_FOR_CONVEX = downcallHandleVoid("JPH_DebugRenderer_CreateTriangleGeometryForConvex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_GEOMETRY1 = downcallHandleVoid("JPH_DebugRenderer_DrawGeometry1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public DebugRenderer(
	    DebugRendererFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public DebugRenderer(
		Arena arena,
		DebugRendererFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DebugRenderer(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ngetElementFromInTriangles(
    	MemorySegment inTriangles,
    	int index
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_TRIANGLES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inTriangles,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetElementFromInTriangles].
    public static @Nullable Triangle getElementFromInTriangles(
    	MemorySegment inTriangles,
    	int index
    ) {
    	MemorySegment segment = ngetElementFromInTriangles(
    		inTriangles,
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Triangle(segment);
    }
    
    public static MemorySegment ngetElementFromInVertices(
    	MemorySegment inVertices,
    	int index
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GET_ELEMENT_FROM_IN_VERTICES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertices,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetElementFromInVertices].
    public static @Nullable Vertex getElementFromInVertices(
    	MemorySegment inVertices,
    	int index
    ) {
    	MemorySegment segment = ngetElementFromInVertices(
    		inVertices,
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vertex(segment);
    }
    
    /// ```
    /// Call once after frame is complete. Releases unused dynamically generated geometry assets.
    /// ```
    public static void nextFrame(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_NEXT_FRAME.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nextFrame].
    public final void nextFrame() {
    	nextFrame(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw wireframe box
    /// ```
    public static void drawWireBox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireBox].
    public final void drawWireBox(
    	AABox inBox,
    	Color inColor
    ) {
    	drawWireBox(
    		this.segment,
    		inBox.memorySegment(),
    		inColor.memorySegment()
    	);
    }
    
    public static void drawWireBox1(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireBox1].
    public final void drawWireBox1(
    	OrientedBox inBox,
    	Color inColor
    ) {
    	drawWireBox1(
    		this.segment,
    		inBox.memorySegment(),
    		inColor.memorySegment()
    	);
    }
    
    public static void drawWireBox2(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment inBox,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inBox,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireBox2].
    public final void drawWireBox2(
    	Mat44 inMatrix,
    	AABox inBox,
    	Color inColor
    ) {
    	drawWireBox2(
    		this.segment,
    		inMatrix.memorySegment(),
    		inBox.memorySegment(),
    		inColor.memorySegment()
    	);
    }
    
    /// ```
    /// Draw a marker on a position
    /// ```
    public static void drawMarker(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inColor,
    	float inSize
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_MARKER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inColor,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawMarker].
    public final void drawMarker(
    	Vec3 inPosition,
    	Color inColor,
    	float inSize
    ) {
    	drawMarker(
    		this.segment,
    		inPosition.memorySegment(),
    		inColor.memorySegment(),
    		inSize
    	);
    }
    
    /// ```
    /// Draw an arrow
    /// ```
    public static void drawArrow(
    	MemorySegment self,
    	MemorySegment inFrom,
    	MemorySegment inTo,
    	MemorySegment inColor,
    	float inSize
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_ARROW.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFrom,
    			inTo,
    			inColor,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawArrow].
    public final void drawArrow(
    	Vec3 inFrom,
    	Vec3 inTo,
    	Color inColor,
    	float inSize
    ) {
    	drawArrow(
    		this.segment,
    		inFrom.memorySegment(),
    		inTo.memorySegment(),
    		inColor.memorySegment(),
    		inSize
    	);
    }
    
    /// ```
    /// Draw coordinate system (3 arrows, x = red, y = green, z = blue)
    /// ```
    public static void drawCoordinateSystem(
    	MemorySegment self,
    	MemorySegment inTransform,
    	float inSize
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTransform,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawCoordinateSystem].
    public final void drawCoordinateSystem(
    	Mat44 inTransform,
    	float inSize
    ) {
    	drawCoordinateSystem(
    		this.segment,
    		inTransform.memorySegment(),
    		inSize
    	);
    }
    
    /// ```
    /// Draw a plane through inPoint with normal inNormal
    /// ```
    public static void drawPlane(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment inNormal,
    	MemorySegment inColor,
    	float inSize
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			inNormal,
    			inColor,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawPlane].
    public final void drawPlane(
    	Vec3 inPoint,
    	Vec3 inNormal,
    	Color inColor,
    	float inSize
    ) {
    	drawPlane(
    		this.segment,
    		inPoint.memorySegment(),
    		inNormal.memorySegment(),
    		inColor.memorySegment(),
    		inSize
    	);
    }
    
    /// ```
    /// Draw wireframe triangle
    /// ```
    public static void drawWireTriangle(
    	MemorySegment self,
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV1,
    			inV2,
    			inV3,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireTriangle].
    public final void drawWireTriangle(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 inV3,
    	Color inColor
    ) {
    	drawWireTriangle(
    		this.segment,
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		inV3.memorySegment(),
    		inColor.memorySegment()
    	);
    }
    
    /// ```
    /// Draw wireframe sphere
    /// ```
    public static void drawWireSphere(
    	MemorySegment self,
    	MemorySegment inCenter,
    	float inRadius,
    	MemorySegment inColor,
    	int inLevel
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenter,
    			inRadius,
    			inColor,
    			inLevel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireSphere].
    public final void drawWireSphere(
    	Vec3 inCenter,
    	float inRadius,
    	Color inColor,
    	int inLevel
    ) {
    	drawWireSphere(
    		this.segment,
    		inCenter.memorySegment(),
    		inRadius,
    		inColor.memorySegment(),
    		inLevel
    	);
    }
    
    public static void drawWireUnitSphere(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment inColor,
    	int inLevel
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inColor,
    			inLevel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawWireUnitSphere].
    public final void drawWireUnitSphere(
    	Mat44 inMatrix,
    	Color inColor,
    	int inLevel
    ) {
    	drawWireUnitSphere(
    		this.segment,
    		inMatrix.memorySegment(),
    		inColor.memorySegment(),
    		inLevel
    	);
    }
    
    /// ```
    /// Draw a box
    /// ```
    public static void drawBox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawBox].
    public final void drawBox(
    	AABox inBox,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawBox(
    		this.segment,
    		inBox.memorySegment(),
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    public static void drawBox1(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment inBox,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inBox,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawBox1].
    public final void drawBox1(
    	Mat44 inMatrix,
    	AABox inBox,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawBox1(
    		this.segment,
    		inMatrix.memorySegment(),
    		inBox.memorySegment(),
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a sphere
    /// ```
    public static void drawSphere(
    	MemorySegment self,
    	MemorySegment inCenter,
    	float inRadius,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SPHERE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenter,
    			inRadius,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawSphere].
    public final void drawSphere(
    	Vec3 inCenter,
    	float inRadius,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawSphere(
    		this.segment,
    		inCenter.memorySegment(),
    		inRadius,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    public static void drawUnitSphere(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawUnitSphere].
    public final void drawUnitSphere(
    	Mat44 inMatrix,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawUnitSphere(
    		this.segment,
    		inMatrix.memorySegment(),
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a capsule with one half sphere at (0, -inHalfHeightOfCylinder, 0) and the other half sphere at (0, inHalfHeightOfCylinder, 0) and radius inRadius.
    /// The capsule will be transformed by inMatrix.
    /// ```
    public static void drawCapsule(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	float inHalfHeightOfCylinder,
    	float inRadius,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CAPSULE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inHalfHeightOfCylinder,
    			inRadius,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawCapsule].
    public final void drawCapsule(
    	Mat44 inMatrix,
    	float inHalfHeightOfCylinder,
    	float inRadius,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawCapsule(
    		this.segment,
    		inMatrix.memorySegment(),
    		inHalfHeightOfCylinder,
    		inRadius,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a cylinder with top (0, inHalfHeight, 0) and bottom (0, -inHalfHeight, 0) and radius inRadius.
    /// The cylinder will be transformed by inMatrix
    /// ```
    public static void drawCylinder(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	float inHalfHeight,
    	float inRadius,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CYLINDER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inHalfHeight,
    			inRadius,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawCylinder].
    public final void drawCylinder(
    	Mat44 inMatrix,
    	float inHalfHeight,
    	float inRadius,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawCylinder(
    		this.segment,
    		inMatrix.memorySegment(),
    		inHalfHeight,
    		inRadius,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a bottomless cone.
    /// @param inTop Top of cone, center of base is at inTop + inAxis.
    /// @param inAxis Height and direction of cone
    /// @param inPerpendicular Perpendicular vector to inAxis.
    /// @param inHalfAngle Specifies the cone angle in radians (angle measured between inAxis and cone surface).
    /// @param inLength The length of the cone.
    /// @param inColor Color to use for drawing the cone.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public static void drawOpenCone(
    	MemorySegment self,
    	MemorySegment inTop,
    	MemorySegment inAxis,
    	MemorySegment inPerpendicular,
    	float inHalfAngle,
    	float inLength,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_OPEN_CONE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTop,
    			inAxis,
    			inPerpendicular,
    			inHalfAngle,
    			inLength,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawOpenCone].
    public final void drawOpenCone(
    	Vec3 inTop,
    	Vec3 inAxis,
    	Vec3 inPerpendicular,
    	float inHalfAngle,
    	float inLength,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawOpenCone(
    		this.segment,
    		inTop.memorySegment(),
    		inAxis.memorySegment(),
    		inPerpendicular.memorySegment(),
    		inHalfAngle,
    		inLength,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draws cone rotation limits as used by the SwingTwistConstraintPart.
    /// @param inMatrix Matrix that transforms from constraint space to world space
    /// @param inSwingYHalfAngle See SwingTwistConstraintPart
    /// @param inSwingZHalfAngle See SwingTwistConstraintPart
    /// @param inEdgeLength Size of the edge of the cone shape
    /// @param inColor Color to use for drawing the cone.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public static void drawSwingConeLimits(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	float inSwingYHalfAngle,
    	float inSwingZHalfAngle,
    	float inEdgeLength,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inSwingYHalfAngle,
    			inSwingZHalfAngle,
    			inEdgeLength,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawSwingConeLimits].
    public final void drawSwingConeLimits(
    	Mat44 inMatrix,
    	float inSwingYHalfAngle,
    	float inSwingZHalfAngle,
    	float inEdgeLength,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawSwingConeLimits(
    		this.segment,
    		inMatrix.memorySegment(),
    		inSwingYHalfAngle,
    		inSwingZHalfAngle,
    		inEdgeLength,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draws rotation limits as used by the SwingTwistConstraintPart.
    /// @param inMatrix Matrix that transforms from constraint space to world space
    /// @param inMinSwingYAngle See SwingTwistConstraintPart
    /// @param inMaxSwingYAngle See SwingTwistConstraintPart
    /// @param inMinSwingZAngle See SwingTwistConstraintPart
    /// @param inMaxSwingZAngle See SwingTwistConstraintPart
    /// @param inEdgeLength Size of the edge of the cone shape
    /// @param inColor Color to use for drawing the cone.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public static void drawSwingPyramidLimits(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	float inMinSwingYAngle,
    	float inMaxSwingYAngle,
    	float inMinSwingZAngle,
    	float inMaxSwingZAngle,
    	float inEdgeLength,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inMinSwingYAngle,
    			inMaxSwingYAngle,
    			inMinSwingZAngle,
    			inMaxSwingZAngle,
    			inEdgeLength,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawSwingPyramidLimits].
    public final void drawSwingPyramidLimits(
    	Mat44 inMatrix,
    	float inMinSwingYAngle,
    	float inMaxSwingYAngle,
    	float inMinSwingZAngle,
    	float inMaxSwingZAngle,
    	float inEdgeLength,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawSwingPyramidLimits(
    		this.segment,
    		inMatrix.memorySegment(),
    		inMinSwingYAngle,
    		inMaxSwingYAngle,
    		inMinSwingZAngle,
    		inMaxSwingZAngle,
    		inEdgeLength,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a pie (part of a circle).
    /// @param inCenter The center of the circle.
    /// @param inRadius Radius of the circle.
    /// @param inNormal The plane normal in which the pie resides.
    /// @param inAxis The axis that defines an angle of 0 radians.
    /// @param inMinAngle The pie will be drawn between [inMinAngle, inMaxAngle] (in radians).
    /// @param inMaxAngle The pie will be drawn between [inMinAngle, inMaxAngle] (in radians).
    /// @param inColor Color to use for drawing the pie.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public static void drawPie(
    	MemorySegment self,
    	MemorySegment inCenter,
    	float inRadius,
    	MemorySegment inNormal,
    	MemorySegment inAxis,
    	float inMinAngle,
    	float inMaxAngle,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PIE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenter,
    			inRadius,
    			inNormal,
    			inAxis,
    			inMinAngle,
    			inMaxAngle,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawPie].
    public final void drawPie(
    	Vec3 inCenter,
    	float inRadius,
    	Vec3 inNormal,
    	Vec3 inAxis,
    	float inMinAngle,
    	float inMaxAngle,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawPie(
    		this.segment,
    		inCenter.memorySegment(),
    		inRadius,
    		inNormal.memorySegment(),
    		inAxis.memorySegment(),
    		inMinAngle,
    		inMaxAngle,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    /// ```
    /// Draw a tapered cylinder
    /// @param inMatrix Matrix that transforms the cylinder to world space.
    /// @param inTop Top of cylinder (along Y axis)
    /// @param inBottom Bottom of cylinder (along Y axis)
    /// @param inTopRadius Radius at the top
    /// @param inBottomRadius Radius at the bottom
    /// @param inColor Color to use for drawing the pie.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public static void drawTaperedCylinder(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	float inTop,
    	float inBottom,
    	float inTopRadius,
    	float inBottomRadius,
    	MemorySegment inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			inTop,
    			inBottom,
    			inTopRadius,
    			inBottomRadius,
    			inColor,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawTaperedCylinder].
    public final void drawTaperedCylinder(
    	Mat44 inMatrix,
    	float inTop,
    	float inBottom,
    	float inTopRadius,
    	float inBottomRadius,
    	Color inColor,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawTaperedCylinder(
    		this.segment,
    		inMatrix.memorySegment(),
    		inTop,
    		inBottom,
    		inTopRadius,
    		inBottomRadius,
    		inColor.memorySegment(),
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    public static void createTriangleBatch2(
    	MemorySegment self,
    	MemorySegment inTriangles,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTriangles,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleBatch2].
    public final void createTriangleBatch2(
    	TriangleArray inTriangles,
    	RefTargetVirtualRef outResult
    ) {
    	createTriangleBatch2(
    		this.segment,
    		inTriangles.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void createTriangleBatch3(
    	MemorySegment self,
    	MemorySegment inVertices,
    	MemorySegment inIndices,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertices,
    			inIndices,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleBatch3].
    public final void createTriangleBatch3(
    	VertexArray inVertices,
    	UnsignedIntArray inIndices,
    	RefTargetVirtualRef outResult
    ) {
    	createTriangleBatch3(
    		this.segment,
    		inVertices.memorySegment(),
    		inIndices.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void createTriangleBatch4(
    	MemorySegment self,
    	MemorySegment inVertices,
    	int inVertexCount,
    	MemorySegment inTriangles,
    	int inTriangleCount,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH4.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertices,
    			inVertexCount,
    			inTriangles,
    			inTriangleCount,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleBatch4].
    public final void createTriangleBatch4(
    	Float3 inVertices,
    	int inVertexCount,
    	IndexedTriangleNoMaterial inTriangles,
    	int inTriangleCount,
    	RefTargetVirtualRef outResult
    ) {
    	createTriangleBatch4(
    		this.segment,
    		inVertices.memorySegment(),
    		inVertexCount,
    		inTriangles.memorySegment(),
    		inTriangleCount,
    		outResult.memorySegment()
    	);
    }
    
    public static void createTriangleBatch5(
    	MemorySegment self,
    	MemorySegment inVertices,
    	MemorySegment inTriangles,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH5.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertices,
    			inTriangles,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleBatch5].
    public final void createTriangleBatch5(
    	Float3Array inVertices,
    	IndexedTriangleNoMaterialArray inTriangles,
    	RefTargetVirtualRef outResult
    ) {
    	createTriangleBatch5(
    		this.segment,
    		inVertices.memorySegment(),
    		inTriangles.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void createTriangleBatchForConvex(
    	MemorySegment self,
    	MemorySegment inGetSupport,
    	int inLevel,
    	MemorySegment outBounds,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_BATCH_FOR_CONVEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGetSupport,
    			inLevel,
    			outBounds,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleBatchForConvex].
    public final void createTriangleBatchForConvex(
    	SupportFunction inGetSupport,
    	int inLevel,
    	AABox outBounds,
    	RefTargetVirtualRef outResult
    ) {
    	createTriangleBatchForConvex(
    		this.segment,
    		inGetSupport.memorySegment(),
    		inLevel,
    		outBounds.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void createTriangleGeometryForConvex(
    	MemorySegment self,
    	MemorySegment inGetSupport,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_CREATE_TRIANGLE_GEOMETRY_FOR_CONVEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGetSupport,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTriangleGeometryForConvex].
    public final void createTriangleGeometryForConvex(
    	SupportFunction inGetSupport,
    	GeometryRef outResult
    ) {
    	createTriangleGeometryForConvex(
    		this.segment,
    		inGetSupport.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void drawGeometry1(
    	MemorySegment self,
    	MemorySegment inModelMatrix,
    	MemorySegment inModelColor,
    	MemorySegment inGeometry,
    	int inCullMode,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_DRAW_GEOMETRY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inModelMatrix,
    			inModelColor,
    			inGeometry,
    			inCullMode,
    			inCastShadow,
    			inDrawMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawGeometry1].
    public final void drawGeometry1(
    	Mat44 inModelMatrix,
    	Color inModelColor,
    	GeometryRef inGeometry,
    	int inCullMode,
    	int inCastShadow,
    	int inDrawMode
    ) {
    	drawGeometry1(
    		this.segment,
    		inModelMatrix.memorySegment(),
    		inModelColor.memorySegment(),
    		inGeometry.memorySegment(),
    		inCullMode,
    		inCastShadow,
    		inDrawMode
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}