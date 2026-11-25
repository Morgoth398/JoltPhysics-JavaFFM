/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class LinearCurvePoint {

	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_GET_X;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_SET_X;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINT_SET_Y;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_LINEAR_CURVE_POINT_CREATE = downcallHandle("JPH_LinearCurvePoint_Create", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINT_DESTROY = downcallHandleVoid("JPH_LinearCurvePoint_Destroy", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINT_GET_X = downcallHandle("JPH_LinearCurvePoint_GetX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINT_SET_X = downcallHandleVoid("JPH_LinearCurvePoint_SetX", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_LINEAR_CURVE_POINT_GET_Y = downcallHandle("JPH_LinearCurvePoint_GetY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINT_SET_Y = downcallHandleVoid("JPH_LinearCurvePoint_SetY", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public LinearCurvePoint() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public LinearCurvePoint(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public LinearCurvePoint(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_GET_X.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getX].
    public final float getX() {
    	return getX(
    		this.segment
    	);
    }
    
    public static void setX(
    	MemorySegment self,
    	float mX
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_SET_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			mX
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setX].
    public final void setX(
    	float mX
    ) {
    	setX(
    		this.segment,
    		mX
    	);
    }
    
    public static float getY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_GET_Y.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getY].
    public final float getY() {
    	return getY(
    		this.segment
    	);
    }
    
    public static void setY(
    	MemorySegment self,
    	float mY
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINT_SET_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			mY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setY].
    public final void setY(
    	float mY
    ) {
    	setY(
    		this.segment,
    		mY
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}