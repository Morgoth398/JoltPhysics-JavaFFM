/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Float4 {

	private static final LazyConstant<MethodHandle> JPH_FLOAT4_CREATE;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_GETX;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_SETX;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_GETY;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_SETY;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_GETZ;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_SETZ;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_GETW;
	private static final LazyConstant<MethodHandle> JPH_FLOAT4_SETW;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_FLOAT4_CREATE = downcallHandle("JPH_Float4_Create", UNBOUNDED_ADDRESS);
		JPH_FLOAT4_CREATE1 = downcallHandle("JPH_Float4_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_FLOAT4_CREATE2 = downcallHandle("JPH_Float4_Create2", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_FLOAT4_DESTROY = downcallHandleVoid("JPH_Float4_Destroy", UNBOUNDED_ADDRESS);
		JPH_FLOAT4_GETX = downcallHandle("JPH_Float4_Getx", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT4_SETX = downcallHandleVoid("JPH_Float4_Setx", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_FLOAT4_GETY = downcallHandle("JPH_Float4_Gety", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT4_SETY = downcallHandleVoid("JPH_Float4_Sety", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_FLOAT4_GETZ = downcallHandle("JPH_Float4_Getz", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT4_SETZ = downcallHandleVoid("JPH_Float4_Setz", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_FLOAT4_GETW = downcallHandle("JPH_Float4_Getw", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_FLOAT4_SETW = downcallHandleVoid("JPH_Float4_Setw", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public Float4() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Float4(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float4(
	    Float4 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Float4(
		Arena arena,
		Float4 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float4(
	    float inX,
	    float inY,
	    float inZ,
	    float inW
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ,
	        inW
	    );
	}
	
	/// Typed method of [#create2].
	public Float4(
		Arena arena,
		float inX,
		float inY,
		float inZ,
		float inW
	) {
		MemorySegment segment = create2(
			inX,
			inY,
			inZ,
			inW
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Float4(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_FLOAT4_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_FLOAT4_CREATE1.get();
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
    	float inY,
    	float inZ,
    	float inW
    ) {
    	MethodHandle method = JPH_FLOAT4_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inX,
    			inY,
    			inZ,
    			inW
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT4_DESTROY.get();
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
    	MethodHandle method = JPH_FLOAT4_GETX.get();
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
    	MethodHandle method = JPH_FLOAT4_SETX.get();
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
    	MethodHandle method = JPH_FLOAT4_GETY.get();
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
    	MethodHandle method = JPH_FLOAT4_SETY.get();
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
    
    public static float getz(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT4_GETZ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getz].
    public final float getz() {
    	return getz(
    		this.segment
    	);
    }
    
    public static void setz(
    	MemorySegment self,
    	float z
    ) {
    	MethodHandle method = JPH_FLOAT4_SETZ.get();
    	try {
    		 method.invokeExact(
    			self,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setz].
    public final void setz(
    	float z
    ) {
    	setz(
    		this.segment,
    		z
    	);
    }
    
    public static float getw(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FLOAT4_GETW.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getw].
    public final float getw() {
    	return getw(
    		this.segment
    	);
    }
    
    public static void setw(
    	MemorySegment self,
    	float w
    ) {
    	MethodHandle method = JPH_FLOAT4_SETW.get();
    	try {
    		 method.invokeExact(
    			self,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setw].
    public final void setw(
    	float w
    ) {
    	setw(
    		this.segment,
    		w
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}