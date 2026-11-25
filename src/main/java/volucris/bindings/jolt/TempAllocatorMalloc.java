/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class TempAllocatorMalloc extends TempAllocator {

	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_MALLOC_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_MALLOC_AS_TEMP_ALLOCATOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TEMP_ALLOCATOR_MALLOC_CREATE = downcallHandle("JPH_TempAllocatorMalloc_Create", UNBOUNDED_ADDRESS);
		JPH_TEMP_ALLOCATOR_MALLOC_AS_TEMP_ALLOCATOR = downcallHandle("JPH_TempAllocatorMalloc_AsTempAllocator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TempAllocatorMalloc() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TempAllocatorMalloc(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTempAllocator(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TempAllocatorMalloc(MemorySegment segment) {
		this.segment = segment;
		super(asTempAllocator(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_MALLOC_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
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
    	MethodHandle method = JPH_TEMP_ALLOCATOR_MALLOC_AS_TEMP_ALLOCATOR.get();
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