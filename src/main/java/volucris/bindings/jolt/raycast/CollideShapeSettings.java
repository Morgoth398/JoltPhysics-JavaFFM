/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CollideShapeSettings
		implements Struct<CollideShapeSettings> {

    private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_SEPARATION_DISTANCE;
    public static final VarHandle BACK_FACE_MODE;

    public static final long BASE_OFFSET;
    public static final long MAX_SEPARATION_DISTANCE_OFFSET;
    public static final long BACK_FACE_MODE_OFFSET;

    private final MemorySegment segment;

    private final CollideSettingsBase base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            CollideSettingsBase.LAYOUT.withName("base"),
            JAVA_FLOAT.withName("maxSeparationDistance"),
            JAVA_INT.withName("backFaceMode")
        ).withName("JPH_CollideShapeSettings").withByteAlignment(4);
        
        JPH_COLLIDE_SHAPE_SETTINGS_INIT = downcallHandleVoid("JPH_CollideShapeSettings_Init", UNBOUNDED_ADDRESS);
        
        MAX_SEPARATION_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("maxSeparationDistance"));
        BACK_FACE_MODE = LAYOUT.varHandle(PathElement.groupElement("backFaceMode"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        MAX_SEPARATION_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSeparationDistance"));
        BACK_FACE_MODE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceMode"));
        //@formatter:on
    }

    public CollideShapeSettings() {
        this(Arena.ofAuto());
    }
    
    public CollideShapeSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CollideShapeSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new CollideSettingsBase(segment.asSlice(BASE_OFFSET, CollideSettingsBase.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_INIT.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #init}.
     */
    public final void init(
    ) {
        init(
            this.segment
        );
    }
    
    public CollideShapeSettings maxSeparationDistance(float maxSeparationDistance) {
        MAX_SEPARATION_DISTANCE.set(segment, 0L, maxSeparationDistance);
        return this;
    }
    
    public float maxSeparationDistance() {
        return (float) MAX_SEPARATION_DISTANCE.get(segment, 0L);
    }
    
    public CollideShapeSettings backFaceMode(int backFaceMode) {
        BACK_FACE_MODE.set(segment, 0L, backFaceMode);
        return this;
    }
    
    public int backFaceMode() {
        return (int) BACK_FACE_MODE.get(segment, 0L);
    }
    
    public CollideShapeSettings base(Consumer<CollideSettingsBase> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public CollideShapeSettings base(CollideSettingsBase other) {
        base.set(other);
        return this;
    }
    
    public CollideSettingsBase base() {
        return base;
    }
    
    @Override
    public CollideShapeSettings set(CollideShapeSettings other) {
        return set(other.segment);
    }
    
    @Override
    public CollideShapeSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CollideShapeSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CollideShapeSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideShapeSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<CollideShapeSettings> array(Arena arena, CollideShapeSettings... structs) {
        NativeStructArray<CollideShapeSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideShapeSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CollideShapeSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CollideShapeSettings(segment)
        );
    }
    
}