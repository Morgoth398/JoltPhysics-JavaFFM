/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Float3Array;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class IndexedTriangleNoMaterial
		permits IndexedTriangle {

	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_EQUIVALENT;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_OPPOSITE;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_DEGENERATE;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_ROTATE;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_NO_MATERIAL_GET_CENTROID;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE = downcallHandle("JPH_IndexedTriangleNoMaterial_Create", UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE1 = downcallHandle("JPH_IndexedTriangleNoMaterial_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_DESTROY = downcallHandleVoid("JPH_IndexedTriangleNoMaterial_Destroy", UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_EQUIVALENT = downcallHandle("JPH_IndexedTriangleNoMaterial_IsEquivalent", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_OPPOSITE = downcallHandle("JPH_IndexedTriangleNoMaterial_IsOpposite", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_DEGENERATE = downcallHandle("JPH_IndexedTriangleNoMaterial_IsDegenerate", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_ROTATE = downcallHandleVoid("JPH_IndexedTriangleNoMaterial_Rotate", UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_NO_MATERIAL_GET_CENTROID = downcallHandleVoid("JPH_IndexedTriangleNoMaterial_GetCentroid", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public IndexedTriangleNoMaterial() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public IndexedTriangleNoMaterial(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public IndexedTriangleNoMaterial(
	    int inI1,
	    int inI2,
	    int inI3
	) {
	    this(
	        Arena.ofAuto(),
	        inI1,
	        inI2,
	        inI3
	    );
	}
	
	/// Typed method of [#create1].
	public IndexedTriangleNoMaterial(
		Arena arena,
		int inI1,
		int inI2,
		int inI3
	) {
		MemorySegment segment = create1(
			inI1,
			inI2,
			inI3
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public IndexedTriangleNoMaterial(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inI1,
    	int inI2,
    	int inI3
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inI1,
    			inI2,
    			inI3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Check if two triangles are equivalent (using the same vertices)
    /// ```
    public static boolean isEquivalent(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_EQUIVALENT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isEquivalent].
    public final boolean isEquivalent(
    	IndexedTriangleNoMaterial inRHS
    ) {
    	return isEquivalent(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    /// ```
    /// Check if two triangles are opposite (using the same vertices but in opposing order)
    /// ```
    public static boolean isOpposite(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_OPPOSITE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isOpposite].
    public final boolean isOpposite(
    	IndexedTriangleNoMaterial inRHS
    ) {
    	return isOpposite(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    /// ```
    /// Check if triangle is degenerate
    /// ```
    public static boolean isDegenerate(
    	MemorySegment self,
    	MemorySegment inVertices
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_IS_DEGENERATE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isDegenerate].
    public final boolean isDegenerate(
    	Float3Array inVertices
    ) {
    	return isDegenerate(
    		this.segment,
    		inVertices.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate the vertices so that the second vertex becomes first etc. This does not change the represented triangle.
    /// ```
    public static void rotate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_ROTATE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotate].
    public final void rotate() {
    	rotate(
    		this.segment
    	);
    }
    
    /// ```
    /// Get center of triangle
    /// ```
    public static void getCentroid(
    	MemorySegment self,
    	MemorySegment inVertices,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_NO_MATERIAL_GET_CENTROID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertices,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCentroid].
    public final void getCentroid(
    	Float3Array inVertices,
    	Vec3 outResult
    ) {
    	getCentroid(
    		this.segment,
    		inVertices.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}