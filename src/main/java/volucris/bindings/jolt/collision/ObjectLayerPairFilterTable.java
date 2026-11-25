/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ObjectLayerPairFilterTable extends ObjectLayerPairFilter {

	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_AS_OBJECT_LAYER_PAIR_FILTER;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_GET_NUM_OBJECT_LAYERS;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectLayerPairFilterTable_Create", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_AS_OBJECT_LAYER_PAIR_FILTER = downcallHandle("JPH_ObjectLayerPairFilterTable_AsObjectLayerPairFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_GET_NUM_OBJECT_LAYERS = downcallHandle("JPH_ObjectLayerPairFilterTable_GetNumObjectLayers", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_DisableCollision", UNBOUNDED_ADDRESS, JAVA_SHORT, JAVA_SHORT);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_EnableCollision", UNBOUNDED_ADDRESS, JAVA_SHORT, JAVA_SHORT);
		//@formatter:on
	}

	public ObjectLayerPairFilterTable(
	    int inNumObjectLayers
	) {
	    this(
	        Arena.ofAuto(),
	        inNumObjectLayers
	    );
	}
	
	/// Typed method of [#create].
	public ObjectLayerPairFilterTable(
		Arena arena,
		int inNumObjectLayers
	) {
		MemorySegment segment = create(
			inNumObjectLayers
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectLayerPairFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ObjectLayerPairFilterTable(MemorySegment segment) {
		this.segment = segment;
		super(asObjectLayerPairFilter(segment));
	}

    /// ```
    /// Constructs the table with inNumObjectLayers Layers, initially all layer pairs are disabled
    /// ```
    public static MemorySegment create(
    	int inNumObjectLayers
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNumObjectLayers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asObjectLayerPairFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_AS_OBJECT_LAYER_PAIR_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the number of object layers
    /// ```
    public static int getNumObjectLayers(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_GET_NUM_OBJECT_LAYERS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumObjectLayers].
    public final int getNumObjectLayers() {
    	return getNumObjectLayers(
    		this.segment
    	);
    }
    
    /// ```
    /// Disable collision between two object layers
    /// ```
    public static void disableCollision(
    	MemorySegment self,
    	short inLayer1,
    	short inLayer2
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLayer1,
    			inLayer2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#disableCollision].
    public final void disableCollision(
    	short inLayer1,
    	short inLayer2
    ) {
    	disableCollision(
    		this.segment,
    		inLayer1,
    		inLayer2
    	);
    }
    
    /// ```
    /// Enable collision between two object layers
    /// ```
    public static void enableCollision(
    	MemorySegment self,
    	short inLayer1,
    	short inLayer2
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLayer1,
    			inLayer2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableCollision].
    public final void enableCollision(
    	short inLayer1,
    	short inLayer2
    ) {
    	enableCollision(
    		this.segment,
    		inLayer1,
    		inLayer2
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}