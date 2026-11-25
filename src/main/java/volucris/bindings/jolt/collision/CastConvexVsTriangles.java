/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.collision.shape.SubShapeIDCreator;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CastConvexVsTriangles {

	private static final LazyConstant<MethodHandle> JPH_CAST_CONVEX_VS_TRIANGLES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CAST_CONVEX_VS_TRIANGLES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CAST_CONVEX_VS_TRIANGLES_CAST;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CAST_CONVEX_VS_TRIANGLES_CREATE = downcallHandle("JPH_CastConvexVsTriangles_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CAST_CONVEX_VS_TRIANGLES_DESTROY = downcallHandleVoid("JPH_CastConvexVsTriangles_Destroy", UNBOUNDED_ADDRESS);
		JPH_CAST_CONVEX_VS_TRIANGLES_CAST = downcallHandleVoid("JPH_CastConvexVsTriangles_Cast", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BYTE, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CastConvexVsTriangles(
	    ShapeCast inShapeCast,
	    ShapeCastSettings inShapeCastSettings,
	    Vec3 inScale,
	    Mat44 inCenterOfMassTransform2,
	    SubShapeIDCreator inSubShapeIDCreator1,
	    CastShapeCollector ioCollector
	) {
	    this(
	        Arena.ofAuto(),
	        inShapeCast,
	        inShapeCastSettings,
	        inScale,
	        inCenterOfMassTransform2,
	        inSubShapeIDCreator1,
	        ioCollector
	    );
	}
	
	/// Typed method of [#create].
	public CastConvexVsTriangles(
		Arena arena,
		ShapeCast inShapeCast,
		ShapeCastSettings inShapeCastSettings,
		Vec3 inScale,
		Mat44 inCenterOfMassTransform2,
		SubShapeIDCreator inSubShapeIDCreator1,
		CastShapeCollector ioCollector
	) {
		MemorySegment segment = create(
			inShapeCast.memorySegment(),
			inShapeCastSettings.memorySegment(),
			inScale.memorySegment(),
			inCenterOfMassTransform2.memorySegment(),
			inSubShapeIDCreator1.memorySegment(),
			ioCollector.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CastConvexVsTriangles(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// @param inShapeCast The shape to cast against the triangles and its start and direction
    /// @param inShapeCastSettings Settings for performing the cast
    /// @param inScale Local space scale for the shape to cast against (scales relative to its center of mass).
    /// @param inCenterOfMassTransform2 Is the center of mass transform of shape 2 (excluding scale), this is used to provide a transform to the shape cast result so that local quantities can be transformed into world space.
    /// @param inSubShapeIDCreator1 Class that tracks the current sub shape ID for the casting shape
    /// @param ioCollector The collector that receives the results.
    /// ```
    public static MemorySegment create(
    	MemorySegment inShapeCast,
    	MemorySegment inShapeCastSettings,
    	MemorySegment inScale,
    	MemorySegment inCenterOfMassTransform2,
    	MemorySegment inSubShapeIDCreator1,
    	MemorySegment ioCollector
    ) {
    	MethodHandle method = JPH_CAST_CONVEX_VS_TRIANGLES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShapeCast,
    			inShapeCastSettings,
    			inScale,
    			inCenterOfMassTransform2,
    			inSubShapeIDCreator1,
    			ioCollector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAST_CONVEX_VS_TRIANGLES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Cast convex object with a single triangle
    /// @param inV0 , inV1 , inV2: CCW triangle vertices
    /// @param inActiveEdges bit 0 = edge v0..v1 is active, bit 1 = edge v1..v2 is active, bit 2 = edge v2..v0 is active
    /// An active edge is an edge that is not connected to another triangle in such a way that it is impossible to collide with the edge
    /// @param inSubShapeID2 The sub shape ID for the triangle
    /// ```
    public static void cast(
    	MemorySegment self,
    	MemorySegment inV0,
    	MemorySegment inV1,
    	MemorySegment inV2,
    	byte inActiveEdges,
    	MemorySegment inSubShapeID2
    ) {
    	MethodHandle method = JPH_CAST_CONVEX_VS_TRIANGLES_CAST.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV0,
    			inV1,
    			inV2,
    			inActiveEdges,
    			inSubShapeID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cast].
    public final void cast(
    	Vec3 inV0,
    	Vec3 inV1,
    	Vec3 inV2,
    	byte inActiveEdges,
    	SubShapeID inSubShapeID2
    ) {
    	cast(
    		this.segment,
    		inV0.memorySegment(),
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		inActiveEdges,
    		inSubShapeID2.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}