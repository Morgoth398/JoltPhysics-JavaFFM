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
public final class GearConstraintSettings
		implements Struct<GearConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle RATIO;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long HINGE_AXIS1_OFFSET;
    public static final long HINGE_AXIS2_OFFSET;
    public static final long RATIO_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 hingeAxis1;
    private final Vec3 hingeAxis2;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("hingeAxis1"),
            Vec3.LAYOUT.withName("hingeAxis2"),
            JAVA_FLOAT.withName("ratio")
        ).withName("JPH_GearConstraintSettings").withByteAlignment(8);
        
        JPH_GEAR_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_GearConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        RATIO = LAYOUT.varHandle(PathElement.groupElement("ratio"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        HINGE_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis1"));
        HINGE_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis2"));
        RATIO_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ratio"));
        //@formatter:on
    }

    public GearConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public GearConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public GearConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        hingeAxis1 = new Vec3(segment.asSlice(HINGE_AXIS1_OFFSET, Vec3.LAYOUT));
        hingeAxis2 = new Vec3(segment.asSlice(HINGE_AXIS2_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public GearConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public GearConstraintSettings ratio(float ratio) {
        RATIO.set(segment, 0L, ratio);
        return this;
    }
    
    public float ratio() {
        return (float) RATIO.get(segment, 0L);
    }
    
    public GearConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public GearConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public GearConstraintSettings hingeAxis1(Consumer<Vec3> consumer) {
        consumer.accept(hingeAxis1);
        return this;
    }
    
    public GearConstraintSettings hingeAxis1(Vec3 other) {
        hingeAxis1.set(other);
        return this;
    }
    
    public Vec3 hingeAxis1() {
        return hingeAxis1;
    }
    
    public GearConstraintSettings hingeAxis2(Consumer<Vec3> consumer) {
        consumer.accept(hingeAxis2);
        return this;
    }
    
    public GearConstraintSettings hingeAxis2(Vec3 other) {
        hingeAxis2.set(other);
        return this;
    }
    
    public Vec3 hingeAxis2() {
        return hingeAxis2;
    }
    
    @Override
    public GearConstraintSettings set(GearConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public GearConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GearConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GearConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GearConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<GearConstraintSettings> array(Arena arena, GearConstraintSettings... structs) {
        NativeStructArray<GearConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GearConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GearConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GearConstraintSettings(segment)
        );
    }
    
}