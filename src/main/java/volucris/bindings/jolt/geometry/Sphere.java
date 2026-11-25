/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Float3;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Sphere {

	private static final LazyConstant<MethodHandle> JPH_SPHERE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_GET_SUPPORT;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_GET_CENTER;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_OVERLAPS;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_OVERLAPS1;
	private static final LazyConstant<MethodHandle> JPH_SPHERE_ENCAPSULATE_POINT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPHERE_CREATE = downcallHandle("JPH_Sphere_Create", UNBOUNDED_ADDRESS);
		JPH_SPHERE_CREATE1 = downcallHandle("JPH_Sphere_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SPHERE_CREATE2 = downcallHandle("JPH_Sphere_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SPHERE_DESTROY = downcallHandleVoid("JPH_Sphere_Destroy", UNBOUNDED_ADDRESS);
		JPH_SPHERE_GET_SUPPORT = downcallHandleVoid("JPH_Sphere_GetSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPHERE_GET_CENTER = downcallHandleVoid("JPH_Sphere_GetCenter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPHERE_GET_RADIUS = downcallHandle("JPH_Sphere_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPHERE_OVERLAPS = downcallHandle("JPH_Sphere_Overlaps", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPHERE_OVERLAPS1 = downcallHandle("JPH_Sphere_Overlaps1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPHERE_ENCAPSULATE_POINT = downcallHandleVoid("JPH_Sphere_EncapsulatePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Sphere() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#sphere_Create].
	public Sphere(Arena arena) {
		MemorySegment segment = sphere_Create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> sphere_Destroy(s));
	}

	public Sphere(
	    Float3 inCenter,
	    float inRadius
	) {
	    this(
	        Arena.ofAuto(),
	        inCenter,
	        inRadius
	    );
	}
	
	/// Typed method of [#sphere_Create1].
	public Sphere(
		Arena arena,
		Float3 inCenter,
		float inRadius
	) {
		MemorySegment segment = sphere_Create1(
			inCenter.memorySegment(),
			inRadius
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> sphere_Destroy(s));
	}

	public Sphere(
	    Vec3 inCenter,
	    float inRadius
	) {
	    this(
	        Arena.ofAuto(),
	        inCenter,
	        inRadius
	    );
	}
	
	/// Typed method of [#sphere_Create2].
	public Sphere(
		Arena arena,
		Vec3 inCenter,
		float inRadius
	) {
		MemorySegment segment = sphere_Create2(
			inCenter.memorySegment(),
			inRadius
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> sphere_Destroy(s));
	}

	public Sphere(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment sphere_Create() {
    	MethodHandle method = JPH_SPHERE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment sphere_Create1(
    	MemorySegment inCenter,
    	float inRadius
    ) {
    	MethodHandle method = JPH_SPHERE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenter,
    			inRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment sphere_Create2(
    	MemorySegment inCenter,
    	float inRadius
    ) {
    	MethodHandle method = JPH_SPHERE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenter,
    			inRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void sphere_Destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPHERE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Calculate the support vector for this convex shape.
    /// ```
    public static void sphere_GetSupport(
    	MemorySegment self,
    	MemorySegment inDirection,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SPHERE_GET_SUPPORT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDirection,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_GetSupport].
    public final void sphere_GetSupport(
    	Vec3 inDirection,
    	Vec3 outResult
    ) {
    	sphere_GetSupport(
    		this.segment,
    		inDirection.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void sphere_GetCenter(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SPHERE_GET_CENTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_GetCenter].
    public final void sphere_GetCenter(
    	Vec3 outResult
    ) {
    	sphere_GetCenter(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static float sphere_GetRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPHERE_GET_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_GetRadius].
    public final float sphere_GetRadius() {
    	return sphere_GetRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if two spheres overlap
    /// ```
    public static boolean sphere_Overlaps(
    	MemorySegment self,
    	MemorySegment inB
    ) {
    	MethodHandle method = JPH_SPHERE_OVERLAPS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_Overlaps].
    public final boolean sphere_Overlaps(
    	Sphere inB
    ) {
    	return sphere_Overlaps(
    		this.segment,
    		inB.memorySegment()
    	);
    }
    
    /// ```
    /// Check if this sphere overlaps with a box
    /// ```
    public static boolean sphere_Overlaps1(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_SPHERE_OVERLAPS1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_Overlaps1].
    public final boolean sphere_Overlaps1(
    	AABox inOther
    ) {
    	return sphere_Overlaps1(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Create the minimal sphere that encapsulates this sphere and inPoint
    /// ```
    public static void sphere_EncapsulatePoint(
    	MemorySegment self,
    	MemorySegment inPoint
    ) {
    	MethodHandle method = JPH_SPHERE_ENCAPSULATE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sphere_EncapsulatePoint].
    public final void sphere_EncapsulatePoint(
    	Vec3 inPoint
    ) {
    	sphere_EncapsulatePoint(
    		this.segment,
    		inPoint.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}