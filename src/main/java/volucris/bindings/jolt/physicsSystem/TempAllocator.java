/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physicsSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TempAllocator {

    private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_MALLOC_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TEMP_ALLOCATOR_DESTROY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TEMP_ALLOCATOR_CREATE = downcallHandle("JPH_TempAllocator_Create", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_TEMP_ALLOCATOR_MALLOC_CREATE = downcallHandle("JPH_TempAllocatorMalloc_Create", UNBOUNDED_ADDRESS);
        JPH_TEMP_ALLOCATOR_DESTROY = downcallHandleVoid("JPH_TempAllocator_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TempAllocator(
        int size
    ) {
        this(
            Arena.ofAuto(),
            size
        );
    }
    
    /// Typed method of [#create].
    public TempAllocator(
    	Arena arena,
    	int size
    ) {
    	MemorySegment segment = create(
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public TempAllocator() {
    	this(Arena.ofAuto());
    }
    
    /// Typed method of [#create].
    public TempAllocator(Arena arena) {
    	MemorySegment segment = create();
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public TempAllocator(MemorySegment segment) {
    	this.segment = segment;
    }

    
    public static MemorySegment create(
    	int size
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_CREATE.get();
    	try {
    		return (MemorySegment)  method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    
    public static MemorySegment create() {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_MALLOC_CREATE.get();
    	try {
    		return (MemorySegment)  method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    
    public static void destroy(
    	MemorySegment allocator
    ) {
    	MethodHandle method = JPH_TEMP_ALLOCATOR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}