/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Double3 {

	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_GETX;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_SETX;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_GETY;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_SETY;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_GETZ;
	private static final LazyConstant<MethodHandle> JPH_DOUBLE3_SETZ;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DOUBLE3_CREATE = downcallHandle("JPH_Double3_Create", UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_CREATE1 = downcallHandle("JPH_Double3_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_CREATE2 = downcallHandle("JPH_Double3_Create2", UNBOUNDED_ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		JPH_DOUBLE3_DESTROY = downcallHandleVoid("JPH_Double3_Destroy", UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_GETX = downcallHandle("JPH_Double3_Getx", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_SETX = downcallHandleVoid("JPH_Double3_Setx", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DOUBLE3_GETY = downcallHandle("JPH_Double3_Gety", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_SETY = downcallHandleVoid("JPH_Double3_Sety", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DOUBLE3_GETZ = downcallHandle("JPH_Double3_Getz", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DOUBLE3_SETZ = downcallHandleVoid("JPH_Double3_Setz", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		//@formatter:on
	}

	public Double3() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Double3(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Double3(
	    Double3 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Double3(
		Arena arena,
		Double3 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Double3(
	    double inX,
	    double inY,
	    double inZ
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ
	    );
	}
	
	/// Typed method of [#create2].
	public Double3(
		Arena arena,
		double inX,
		double inY,
		double inZ
	) {
		MemorySegment segment = create2(
			inX,
			inY,
			inZ
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Double3(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DOUBLE3_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_DOUBLE3_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	double inX,
    	double inY,
    	double inZ
    ) {
    	MethodHandle method = JPH_DOUBLE3_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inX,
    			inY,
    			inZ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DOUBLE3_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static double getx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DOUBLE3_GETX.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getx].
    public final double getx() {
    	return getx(
    		this.segment
    	);
    }
    
    public static void setx(
    	MemorySegment self,
    	double x
    ) {
    	MethodHandle method = JPH_DOUBLE3_SETX.get();
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
    	double x
    ) {
    	setx(
    		this.segment,
    		x
    	);
    }
    
    public static double gety(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DOUBLE3_GETY.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#gety].
    public final double gety() {
    	return gety(
    		this.segment
    	);
    }
    
    public static void sety(
    	MemorySegment self,
    	double y
    ) {
    	MethodHandle method = JPH_DOUBLE3_SETY.get();
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
    	double y
    ) {
    	sety(
    		this.segment,
    		y
    	);
    }
    
    public static double getz(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DOUBLE3_GETZ.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getz].
    public final double getz() {
    	return getz(
    		this.segment
    	);
    }
    
    public static void setz(
    	MemorySegment self,
    	double z
    ) {
    	MethodHandle method = JPH_DOUBLE3_SETZ.get();
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
    	double z
    ) {
    	setz(
    		this.segment,
    		z
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}