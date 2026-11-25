/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Float2;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Ellipse {

	private static final LazyConstant<MethodHandle> JPH_ELLIPSE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_ELLIPSE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_ELLIPSE_IS_INSIDE;
	private static final LazyConstant<MethodHandle> JPH_ELLIPSE_GET_CLOSEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_ELLIPSE_GET_NORMAL;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_ELLIPSE_CREATE = downcallHandle("JPH_Ellipse_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_ELLIPSE_DESTROY = downcallHandleVoid("JPH_Ellipse_Destroy", UNBOUNDED_ADDRESS);
		JPH_ELLIPSE_IS_INSIDE = downcallHandle("JPH_Ellipse_IsInside", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ELLIPSE_GET_CLOSEST_POINT = downcallHandleVoid("JPH_Ellipse_GetClosestPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ELLIPSE_GET_NORMAL = downcallHandleVoid("JPH_Ellipse_GetNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Ellipse(
	    float inA,
	    float inB
	) {
	    this(
	        Arena.ofAuto(),
	        inA,
	        inB
	    );
	}
	
	/// Typed method of [#create].
	public Ellipse(
		Arena arena,
		float inA,
		float inB
	) {
		MemorySegment segment = create(
			inA,
			inB
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Ellipse(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Construct ellipse with radius A along the X-axis and B along the Y-axis
    /// ```
    public static MemorySegment create(
    	float inA,
    	float inB
    ) {
    	MethodHandle method = JPH_ELLIPSE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inA,
    			inB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_ELLIPSE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Check if inPoint is inside the ellipse
    /// ```
    public static boolean isInside(
    	MemorySegment self,
    	MemorySegment inPoint
    ) {
    	MethodHandle method = JPH_ELLIPSE_IS_INSIDE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isInside].
    public final boolean isInside(
    	Float2 inPoint
    ) {
    	return isInside(
    		this.segment,
    		inPoint.memorySegment()
    	);
    }
    
    /// ```
    /// Get the closest point on the ellipse to inPoint
    /// Assumes inPoint is outside the ellipse
    /// @see Rotation Joint Limits in Quaternion Space by Gino van den Bergen, section 10.1 in Game Engine Gems 3.
    /// ```
    public static void getClosestPoint(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ELLIPSE_GET_CLOSEST_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestPoint].
    public final void getClosestPoint(
    	Float2 inPoint,
    	Float2 outResult
    ) {
    	getClosestPoint(
    		this.segment,
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get normal at point inPoint (non-normalized vector)
    /// ```
    public static void getNormal(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ELLIPSE_GET_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormal].
    public final void getNormal(
    	Float2 inPoint,
    	Float2 outResult
    ) {
    	getNormal(
    		this.segment,
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}