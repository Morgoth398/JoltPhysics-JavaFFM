/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.objectLayerPairFilter;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class ObjectLayerPairFilterMask extends ObjectLayerPairFilter {

    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectLayerPairFilterMask_Create", UNBOUNDED_ADDRESS);
        JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER = downcallHandle("JPH_ObjectLayerPairFilterMask_GetObjectLayer", JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP = downcallHandle("JPH_ObjectLayerPairFilterMask_GetGroup", JAVA_INT, JAVA_INT);
        JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK = downcallHandle("JPH_ObjectLayerPairFilterMask_GetMask", JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    public ObjectLayerPairFilterMask() {
        this(Arena.ofAuto());
    }
    
    public ObjectLayerPairFilterMask(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public ObjectLayerPairFilterMask(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getObjectLayer(
        int group, 
        int mask
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER.get();
        try {
            return (int) method.invokeExact(
                group, 
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getGroup(
        int layer
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP.get();
        try {
            return (int) method.invokeExact(
                layer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getMask(
        int layer
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK.get();
        try {
            return (int) method.invokeExact(
                layer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}