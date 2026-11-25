/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TempAllocatorImplWithMallocFallback extends TempAllocator {

	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_AS_TEMP_ALLOCATOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_CREATE = downcallHandle("JPH_TempAllocatorImplWithMallocFallback_Create", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_AS_TEMP_ALLOCATOR = downcallHandle("JPH_TempAllocatorImplWithMallocFallback_AsTempAllocator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TempAllocatorImplWithMallocFallback(
	    int inSize
	) {
	    this(
	        Arena.ofAuto(),
	        inSize
	    );
	}
	
	/// Typed method of [#create].
	public TempAllocatorImplWithMallocFallback(
		Arena arena,
		int inSize
	) {
		MemorySegment segment = create(
			inSize
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTempAllocator(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TempAllocatorImplWithMallocFallback(MemorySegment segment) {
		this.segment = segment;
		super(asTempAllocator(segment));
	}

    /// ```
    /// Constructs the allocator with an initial fixed block if inSize
    /// ```
    public static MemorySegment create(
    	int inSize
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asTempAllocator(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_WITH_MALLOC_FALLBACK_AS_TEMP_ALLOCATOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}