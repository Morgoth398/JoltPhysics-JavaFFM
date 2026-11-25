/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class IgnoreMultipleBodiesFilter extends BodyFilter {

	private static final LazyConstant<MethodHandle> JPH_IGNORE_MULTIPLE_BODIES_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_MULTIPLE_BODIES_FILTER_AS_BODY_FILTER;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_MULTIPLE_BODIES_FILTER_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_MULTIPLE_BODIES_FILTER_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_MULTIPLE_BODIES_FILTER_IGNORE_BODY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_IGNORE_MULTIPLE_BODIES_FILTER_CREATE = downcallHandle("JPH_IgnoreMultipleBodiesFilter_Create", UNBOUNDED_ADDRESS);
		JPH_IGNORE_MULTIPLE_BODIES_FILTER_AS_BODY_FILTER = downcallHandle("JPH_IgnoreMultipleBodiesFilter_AsBodyFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_IGNORE_MULTIPLE_BODIES_FILTER_CLEAR = downcallHandleVoid("JPH_IgnoreMultipleBodiesFilter_Clear", UNBOUNDED_ADDRESS);
		JPH_IGNORE_MULTIPLE_BODIES_FILTER_RESERVE = downcallHandleVoid("JPH_IgnoreMultipleBodiesFilter_Reserve", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_IGNORE_MULTIPLE_BODIES_FILTER_IGNORE_BODY = downcallHandleVoid("JPH_IgnoreMultipleBodiesFilter_IgnoreBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public IgnoreMultipleBodiesFilter() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public IgnoreMultipleBodiesFilter(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBodyFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public IgnoreMultipleBodiesFilter(MemorySegment segment) {
		this.segment = segment;
		super(asBodyFilter(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_IGNORE_MULTIPLE_BODIES_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBodyFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_IGNORE_MULTIPLE_BODIES_FILTER_AS_BODY_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Remove all bodies from the filter
    /// ```
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_IGNORE_MULTIPLE_BODIES_FILTER_CLEAR.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clear].
    public final void clear() {
    	clear(
    		this.segment
    	);
    }
    
    /// ```
    /// Reserve space for inSize body ID's
    /// ```
    public static void reserve(
    	MemorySegment self,
    	int inSize
    ) {
    	MethodHandle method = JPH_IGNORE_MULTIPLE_BODIES_FILTER_RESERVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reserve].
    public final void reserve(
    	int inSize
    ) {
    	reserve(
    		this.segment,
    		inSize
    	);
    }
    
    /// ```
    /// Add a body to be ignored
    /// ```
    public static void ignoreBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_IGNORE_MULTIPLE_BODIES_FILTER_IGNORE_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ignoreBody].
    public final void ignoreBody(
    	BodyID inBodyID
    ) {
    	ignoreBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}