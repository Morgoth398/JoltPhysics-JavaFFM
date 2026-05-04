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
public final class ObjectLayerPairFilterTable extends ObjectLayerPairFilter {

    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectLayerPairFilterTable_Create", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_DisableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_EnableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE = downcallHandle("JPH_ObjectLayerPairFilterTable_ShouldCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    public ObjectLayerPairFilterTable(
        int numObjectLayers
    ) {
        this(
            Arena.ofAuto(),
            numObjectLayers
        );
    }
    
    public ObjectLayerPairFilterTable(
        Arena arena,
        int numObjectLayers
    ) {
         MemorySegment segment = create(
            numObjectLayers
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ObjectLayerPairFilterTable(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int numObjectLayers
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                numObjectLayers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void disableCollision(
        MemorySegment objectFilter, 
        int layer1, 
        int layer2
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION.get();
        try {
            method.invokeExact(
                objectFilter, 
                layer1, 
                layer2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #disableCollision}.
     */
    public final void disableCollision(
        int layer1, 
        int layer2
    ) {
        disableCollision(
            this.segment, 
            layer1, 
            layer2
        );
    }
    
    public static void enableCollision(
        MemorySegment objectFilter, 
        int layer1, 
        int layer2
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION.get();
        try {
            method.invokeExact(
                objectFilter, 
                layer1, 
                layer2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #enableCollision}.
     */
    public final void enableCollision(
        int layer1, 
        int layer2
    ) {
        enableCollision(
            this.segment, 
            layer1, 
            layer2
        );
    }
    
    public static boolean shouldCollide(
        MemorySegment objectFilter, 
        int layer1, 
        int layer2
    ) {
        MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE.get();
        try {
            return (boolean) method.invokeExact(
                objectFilter, 
                layer1, 
                layer2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #shouldCollide}.
     */
    public final boolean shouldCollide(
        int layer1, 
        int layer2
    ) {
        return (boolean) shouldCollide(
            this.segment, 
            layer1, 
            layer2
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}