/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.collision.shape.SphereShape;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollideSphereVsTriangles {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SPHERE_VS_TRIANGLES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SPHERE_VS_TRIANGLES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SPHERE_VS_TRIANGLES_COLLIDE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_SPHERE_VS_TRIANGLES_CREATE = downcallHandle("JPH_CollideSphereVsTriangles_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SPHERE_VS_TRIANGLES_DESTROY = downcallHandleVoid("JPH_CollideSphereVsTriangles_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SPHERE_VS_TRIANGLES_COLLIDE = downcallHandleVoid("JPH_CollideSphereVsTriangles_Collide", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BYTE, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollideSphereVsTriangles(
	    SphereShape inShape1,
	    Vec3 inScale1,
	    Vec3 inScale2,
	    Mat44 inCenterOfMassTransform1,
	    Mat44 inCenterOfMassTransform2,
	    SubShapeID inSubShapeID1,
	    CollideShapeSettings inCollideShapeSettings,
	    CollideShapeCollector ioCollector
	) {
	    this(
	        Arena.ofAuto(),
	        inShape1,
	        inScale1,
	        inScale2,
	        inCenterOfMassTransform1,
	        inCenterOfMassTransform2,
	        inSubShapeID1,
	        inCollideShapeSettings,
	        ioCollector
	    );
	}
	
	/// Typed method of [#create].
	public CollideSphereVsTriangles(
		Arena arena,
		SphereShape inShape1,
		Vec3 inScale1,
		Vec3 inScale2,
		Mat44 inCenterOfMassTransform1,
		Mat44 inCenterOfMassTransform2,
		SubShapeID inSubShapeID1,
		CollideShapeSettings inCollideShapeSettings,
		CollideShapeCollector ioCollector
	) {
		MemorySegment segment = create(
			inShape1.memorySegment(),
			inScale1.memorySegment(),
			inScale2.memorySegment(),
			inCenterOfMassTransform1.memorySegment(),
			inCenterOfMassTransform2.memorySegment(),
			inSubShapeID1.memorySegment(),
			inCollideShapeSettings.memorySegment(),
			ioCollector.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollideSphereVsTriangles(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// @param inShape1 The sphere to collide against triangles
    /// @param inScale1 Local space scale for the sphere (scales relative to its center of mass)
    /// @param inScale2 Local space scale for the triangles
    /// @param inCenterOfMassTransform1 Transform that takes the center of mass of 1 into world space
    /// @param inCenterOfMassTransform2 Transform that takes the center of mass of 2 into world space
    /// @param inSubShapeID1 Sub shape ID of the convex object
    /// @param inCollideShapeSettings Settings for the collide shape query
    /// @param ioCollector The collector that will receive the results
    /// ```
    public static MemorySegment create(
    	MemorySegment inShape1,
    	MemorySegment inScale1,
    	MemorySegment inScale2,
    	MemorySegment inCenterOfMassTransform1,
    	MemorySegment inCenterOfMassTransform2,
    	MemorySegment inSubShapeID1,
    	MemorySegment inCollideShapeSettings,
    	MemorySegment ioCollector
    ) {
    	MethodHandle method = JPH_COLLIDE_SPHERE_VS_TRIANGLES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape1,
    			inScale1,
    			inScale2,
    			inCenterOfMassTransform1,
    			inCenterOfMassTransform2,
    			inSubShapeID1,
    			inCollideShapeSettings,
    			ioCollector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SPHERE_VS_TRIANGLES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Collide sphere with a single triangle
    /// @param inV0 , inV1 , inV2: CCW triangle vertices
    /// @param inActiveEdges bit 0 = edge v0..v1 is active, bit 1 = edge v1..v2 is active, bit 2 = edge v2..v0 is active
    /// An active edge is an edge that is not connected to another triangle in such a way that it is impossible to collide with the edge
    /// @param inSubShapeID2 The sub shape ID for the triangle
    /// ```
    public static void collide(
    	MemorySegment self,
    	MemorySegment inV0,
    	MemorySegment inV1,
    	MemorySegment inV2,
    	byte inActiveEdges,
    	MemorySegment inSubShapeID2
    ) {
    	MethodHandle method = JPH_COLLIDE_SPHERE_VS_TRIANGLES_COLLIDE.get();
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
    
    /// Typed method of [#collide].
    public final void collide(
    	Vec3 inV0,
    	Vec3 inV1,
    	Vec3 inV2,
    	byte inActiveEdges,
    	SubShapeID inSubShapeID2
    ) {
    	collide(
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