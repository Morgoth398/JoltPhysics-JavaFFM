/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ObjectLayerPairFilterMask extends ObjectLayerPairFilter {

	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_AS_OBJECT_LAYER_PAIR_FILTER;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_NUM_BITS;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_GROUP;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_MASK;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectLayerPairFilterMask_Create", UNBOUNDED_ADDRESS);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_AS_OBJECT_LAYER_PAIR_FILTER = downcallHandle("JPH_ObjectLayerPairFilterMask_AsObjectLayerPairFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_NUM_BITS = downcallHandle("JPH_ObjectLayerPairFilterMask_GetNumBits", JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK = downcallHandle("JPH_ObjectLayerPairFilterMask_GetMask", JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_OBJECT_LAYER = downcallHandle("JPH_ObjectLayerPairFilterMask_sGetObjectLayer", JAVA_SHORT, JAVA_INT, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_GROUP = downcallHandle("JPH_ObjectLayerPairFilterMask_sGetGroup", JAVA_INT, JAVA_SHORT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_MASK = downcallHandle("JPH_ObjectLayerPairFilterMask_sGetMask", JAVA_INT, JAVA_SHORT);
		//@formatter:on
	}

	public ObjectLayerPairFilterMask() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ObjectLayerPairFilterMask(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectLayerPairFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ObjectLayerPairFilterMask(MemorySegment segment) {
		this.segment = segment;
		super(asObjectLayerPairFilter(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
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
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_AS_OBJECT_LAYER_PAIR_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Number of bits for the group and mask bits
    /// ```
    public static int getNumBits() {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_NUM_BITS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getMask() {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct an ObjectLayer from a group and mask bits
    /// ```
    public static short sGetObjectLayer(
    	int inGroup,
    	int inMask
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_OBJECT_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			inGroup,
    			inMask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the group bits from an ObjectLayer
    /// ```
    public static int sGetGroup(
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_GROUP.get();
    	try {
    		return (int) method.invokeExact(
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the mask bits from an ObjectLayer
    /// ```
    public static int sGetMask(
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_S_GET_MASK.get();
    	try {
    		return (int) method.invokeExact(
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}