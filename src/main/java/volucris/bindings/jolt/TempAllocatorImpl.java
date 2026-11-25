/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TempAllocatorImpl extends TempAllocator {

	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_AS_TEMP_ALLOCATOR;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_GET_USAGE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_CAN_ALLOCATE;
	private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_IMPL_OWNS_MEMORY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TEMP_ALLOCATOR_IMPL_CREATE = downcallHandle("JPH_TempAllocatorImpl_Create", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_TEMP_ALLOCATOR_IMPL_AS_TEMP_ALLOCATOR = downcallHandle("JPH_TempAllocatorImpl_AsTempAllocator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TEMP_ALLOCATOR_IMPL_IS_EMPTY = downcallHandle("JPH_TempAllocatorImpl_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_TEMP_ALLOCATOR_IMPL_GET_SIZE = downcallHandle("JPH_TempAllocatorImpl_GetSize", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_TEMP_ALLOCATOR_IMPL_GET_USAGE = downcallHandle("JPH_TempAllocatorImpl_GetUsage", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_TEMP_ALLOCATOR_IMPL_CAN_ALLOCATE = downcallHandle("JPH_TempAllocatorImpl_CanAllocate", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_TEMP_ALLOCATOR_IMPL_OWNS_MEMORY = downcallHandle("JPH_TempAllocatorImpl_OwnsMemory", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TempAllocatorImpl(
	    long inSize
	) {
	    this(
	        Arena.ofAuto(),
	        inSize
	    );
	}
	
	/// Typed method of [#create].
	public TempAllocatorImpl(
		Arena arena,
		long inSize
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

	public TempAllocatorImpl(MemorySegment segment) {
		this.segment = segment;
		super(asTempAllocator(segment));
	}

    /// ```
    /// Constructs the allocator with a maximum allocatable size of inSize
    /// ```
    public static MemorySegment create(
    	long inSize
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_CREATE.get();
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
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_AS_TEMP_ALLOCATOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Check if no allocations have been made
    /// ```
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_IS_EMPTY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isEmpty].
    public final boolean isEmpty() {
    	return isEmpty(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the total size of the fixed buffer
    /// ```
    public static long getSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_GET_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSize].
    public final long getSize() {
    	return getSize(
    		this.segment
    	);
    }
    
    /// ```
    /// Get current usage in bytes of the buffer
    /// ```
    public static long getUsage(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_GET_USAGE.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUsage].
    public final long getUsage() {
    	return getUsage(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if an allocation of inSize can be made in this fixed buffer allocator
    /// ```
    public static boolean canAllocate(
    	MemorySegment self,
    	int inSize
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_CAN_ALLOCATE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#canAllocate].
    public final boolean canAllocate(
    	int inSize
    ) {
    	return canAllocate(
    		this.segment,
    		inSize
    	);
    }
    
    /// ```
    /// Check if memory block at inAddress is owned by this allocator
    /// ```
    public static boolean ownsMemory(
    	MemorySegment self,
    	MemorySegment inAddress
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_IMPL_OWNS_MEMORY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inAddress
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ownsMemory].
    public final boolean ownsMemory(
    	MemorySegment inAddress
    ) {
    	return ownsMemory(
    		this.segment,
    		inAddress
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}