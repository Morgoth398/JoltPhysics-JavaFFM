/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

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
public final class PointConstraintSettings
		implements Struct<PointConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long POINT2_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 point2;

    static {
        //@formatter:off
        JPH_POINT_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_PointConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("point2"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_PointConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        //@formatter:on
    }

    public PointConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public PointConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PointConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public PointConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public PointConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public PointConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public PointConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public PointConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public PointConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public PointConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    @Override
    public PointConstraintSettings set(PointConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public PointConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PointConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PointConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PointConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<PointConstraintSettings> array(Arena arena, PointConstraintSettings... structs) {
        NativeStructArray<PointConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PointConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PointConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PointConstraintSettings(segment)
        );
    }
    
}