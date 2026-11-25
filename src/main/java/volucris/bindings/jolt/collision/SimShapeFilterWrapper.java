/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SimShapeFilterWrapper {

	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_SET_BODY2;
	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_GET_FILTER;
	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE;
	private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SIM_SHAPE_FILTER_WRAPPER_CREATE = downcallHandle("JPH_SimShapeFilterWrapper_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIM_SHAPE_FILTER_WRAPPER_DESTROY = downcallHandleVoid("JPH_SimShapeFilterWrapper_Destroy", UNBOUNDED_ADDRESS);
		JPH_SIM_SHAPE_FILTER_WRAPPER_SET_BODY2 = downcallHandleVoid("JPH_SimShapeFilterWrapper_SetBody2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIM_SHAPE_FILTER_WRAPPER_GET_FILTER = downcallHandle("JPH_SimShapeFilterWrapper_GetFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE = downcallHandle("JPH_SimShapeFilterWrapper_ShouldCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE1 = downcallHandle("JPH_SimShapeFilterWrapper_ShouldCollide1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SimShapeFilterWrapper(
	    SimShapeFilter inFilter,
	    Body inBody1
	) {
	    this(
	        Arena.ofAuto(),
	        inFilter,
	        inBody1
	    );
	}
	
	/// Typed method of [#create].
	public SimShapeFilterWrapper(
		Arena arena,
		SimShapeFilter inFilter,
		Body inBody1
	) {
		MemorySegment segment = create(
			inFilter.memorySegment(),
			inBody1.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SimShapeFilterWrapper(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inFilter,
    	MemorySegment inBody1
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inFilter,
    			inBody1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Set the body we're colliding against
    /// ```
    public static void setBody2(
    	MemorySegment self,
    	MemorySegment inBody2
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_SET_BODY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBody2].
    public final void setBody2(
    	Body inBody2
    ) {
    	setBody2(
    		this.segment,
    		inBody2.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the actual filter to use for collision detection
    /// ```
    public static MemorySegment getFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_GET_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFilter].
    public final @Nullable ShapeFilter getFilter() {
    	MemorySegment segment = getFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeFilter(segment);
    }
    
    /// ```
    /// Forward to the simulation shape filter
    /// ```
    public static boolean shouldCollide(
    	MemorySegment self,
    	MemorySegment inShape1,
    	MemorySegment inSubShapeIDOfShape1,
    	MemorySegment inShape2,
    	MemorySegment inSubShapeIDOfShape2
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inShape1,
    			inSubShapeIDOfShape1,
    			inShape2,
    			inSubShapeIDOfShape2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shouldCollide].
    public final boolean shouldCollide(
    	Shape inShape1,
    	SubShapeID inSubShapeIDOfShape1,
    	Shape inShape2,
    	SubShapeID inSubShapeIDOfShape2
    ) {
    	return shouldCollide(
    		this.segment,
    		inShape1.memorySegment(),
    		inSubShapeIDOfShape1.memorySegment(),
    		inShape2.memorySegment(),
    		inSubShapeIDOfShape2.memorySegment()
    	);
    }
    
    /// ```
    /// Forward to the simulation shape filter
    /// ```
    public static boolean shouldCollide1(
    	MemorySegment self,
    	MemorySegment inShape2,
    	MemorySegment inSubShapeIDOfShape2
    ) {
    	MethodHandle method = JPH_SIM_SHAPE_FILTER_WRAPPER_SHOULD_COLLIDE1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inShape2,
    			inSubShapeIDOfShape2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shouldCollide1].
    public final boolean shouldCollide1(
    	Shape inShape2,
    	SubShapeID inSubShapeIDOfShape2
    ) {
    	return shouldCollide1(
    		this.segment,
    		inShape2.memorySegment(),
    		inSubShapeIDOfShape2.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}