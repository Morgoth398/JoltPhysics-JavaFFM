/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.TempAllocator;

import static volucris.bindings.core.FFMUtils.*;

public final class StaticCompoundShapeSettings extends CompoundShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_StaticCompoundShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_STATIC_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS = downcallHandle("JPH_StaticCompoundShapeSettings_AsCompoundShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE1 = downcallHandleVoid("JPH_StaticCompoundShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public StaticCompoundShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public StaticCompoundShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public StaticCompoundShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCompoundShapeSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCompoundShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Specialization of Create() function that allows specifying a temp allocator to avoid temporary memory allocations on the heap
    /// ```
    public static void create1(
    	MemorySegment self,
    	MemorySegment inTempAllocator,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTempAllocator,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create1].
    public final void create1(
    	TempAllocator inTempAllocator,
    	ShapeResult outResult
    ) {
    	create1(
    		this.segment,
    		inTempAllocator.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}