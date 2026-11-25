/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public class ObjectLayerPairFilter {

	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_OBJECT_LAYER_PAIR_FILTER_CREATE = downcallHandle("JPH_ObjectLayerPairFilter_Create", UNBOUNDED_ADDRESS, ObjectLayerPairFilterFunctions.LAYOUT);
		JPH_OBJECT_LAYER_PAIR_FILTER_DESTROY = downcallHandleVoid("JPH_ObjectLayerPairFilter_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ObjectLayerPairFilter(
	    ObjectLayerPairFilterFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public ObjectLayerPairFilter(
		Arena arena,
		ObjectLayerPairFilterFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ObjectLayerPairFilter(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}