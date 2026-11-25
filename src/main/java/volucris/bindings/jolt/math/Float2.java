/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Float2 {

	private static final LazyConstant<MethodHandle> JPH_FLOAT2_CREATE;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_GETX;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_SETX;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_GETY;
	private static final LazyConstant<MethodHandle> JPH_FLOAT2_SETY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_FLOAT2_CREATE = downcallHandle("JPH_Float2_Create", UNBOUNDED_ADDRESS);
		JPH_FLOAT2_CREATE1 = downcallHandle("JPH_Float2_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FLOAT2_CREATE2 = downcallHandle("JPH_Float2_Create2", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_FLOAT2_DESTROY = downcallHandleVoid("JPH_Float2_Destroy", UNBOUNDED_ADDRESS);
		JPH_FLOAT2_GETX = downcallHandle("JPH_Float2_Getx", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT2_SETX = downcallHandleVoid("JPH_Float2_Setx", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_FLOAT2_GETY = downcallHandle("JPH_Float2_Gety", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT2_SETY = downcallHandleVoid("JPH_Float2_Sety", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public Float2() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Float2(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float2(
	    Float2 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Float2(
		Arena arena,
		Float2 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float2(
	    float inX,
	    float inY
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY
	    );
	}
	
	/// Typed method of [#create2].
	public Float2(
		Arena arena,
		float inX,
		float inY
	) {
		MemorySegment segment = create2(
			inX,
			inY
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float2(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_FLOAT2_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_FLOAT2_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	float inX,
    	float inY
    ) {
    	MethodHandle method = JPH_FLOAT2_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inX,
    			inY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT2_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float getx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT2_GETX.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getx].
    public final float getx() {
    	return getx(
    		this.segment
    	);
    }
    
    public static void setx(
    	MemorySegment self,
    	float x
    ) {
    	MethodHandle method = JPH_FLOAT2_SETX.get();
    	try {
    		 method.invokeExact(
    			self,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setx].
    public final void setx(
    	float x
    ) {
    	setx(
    		this.segment,
    		x
    	);
    }
    
    public static float gety(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT2_GETY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#gety].
    public final float gety() {
    	return gety(
    		this.segment
    	);
    }
    
    public static void sety(
    	MemorySegment self,
    	float y
    ) {
    	MethodHandle method = JPH_FLOAT2_SETY.get();
    	try {
    		 method.invokeExact(
    			self,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sety].
    public final void sety(
    	float y
    ) {
    	sety(
    		this.segment,
    		y
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}