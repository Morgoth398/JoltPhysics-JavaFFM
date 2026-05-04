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
public final class FixedConstraintSettings
		implements Struct<FixedConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle AUTO_DETECT_POINT;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long AUTO_DETECT_POINT_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long AXIS_X1_OFFSET;
    public static final long AXIS_Y1_OFFSET;
    public static final long POINT2_OFFSET;
    public static final long AXIS_X2_OFFSET;
    public static final long AXIS_Y2_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 axisX1;
    private final Vec3 axisY1;
    private final Vec3 point2;
    private final Vec3 axisX2;
    private final Vec3 axisY2;

    static {
        //@formatter:off
        JPH_FIXED_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_FixedConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            JAVA_BOOLEAN.withName("autoDetectPoint"),
            MemoryLayout.paddingLayout(3),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("axisX1"),
            Vec3.LAYOUT.withName("axisY1"),
            Vec3.LAYOUT.withName("point2"),
            Vec3.LAYOUT.withName("axisX2"),
            Vec3.LAYOUT.withName("axisY2")
        ).withName("JPH_FixedConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        AUTO_DETECT_POINT = LAYOUT.varHandle(PathElement.groupElement("autoDetectPoint"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        AUTO_DETECT_POINT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("autoDetectPoint"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        AXIS_X1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX1"));
        AXIS_Y1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        AXIS_X2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX2"));
        AXIS_Y2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY2"));
        //@formatter:on
    }

    public FixedConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public FixedConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public FixedConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        axisX1 = new Vec3(segment.asSlice(AXIS_X1_OFFSET, Vec3.LAYOUT));
        axisY1 = new Vec3(segment.asSlice(AXIS_Y1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
        axisX2 = new Vec3(segment.asSlice(AXIS_X2_OFFSET, Vec3.LAYOUT));
        axisY2 = new Vec3(segment.asSlice(AXIS_Y2_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public FixedConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public FixedConstraintSettings autoDetectPoint(boolean autoDetectPoint) {
        AUTO_DETECT_POINT.set(segment, 0L, autoDetectPoint);
        return this;
    }
    
    public boolean autoDetectPoint() {
        return (boolean) AUTO_DETECT_POINT.get(segment, 0L);
    }
    
    public FixedConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public FixedConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public FixedConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public FixedConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public FixedConstraintSettings axisX1(Consumer<Vec3> consumer) {
        consumer.accept(axisX1);
        return this;
    }
    
    public FixedConstraintSettings axisX1(Vec3 other) {
        axisX1.set(other);
        return this;
    }
    
    public Vec3 axisX1() {
        return axisX1;
    }
    
    public FixedConstraintSettings axisY1(Consumer<Vec3> consumer) {
        consumer.accept(axisY1);
        return this;
    }
    
    public FixedConstraintSettings axisY1(Vec3 other) {
        axisY1.set(other);
        return this;
    }
    
    public Vec3 axisY1() {
        return axisY1;
    }
    
    public FixedConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public FixedConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    public FixedConstraintSettings axisX2(Consumer<Vec3> consumer) {
        consumer.accept(axisX2);
        return this;
    }
    
    public FixedConstraintSettings axisX2(Vec3 other) {
        axisX2.set(other);
        return this;
    }
    
    public Vec3 axisX2() {
        return axisX2;
    }
    
    public FixedConstraintSettings axisY2(Consumer<Vec3> consumer) {
        consumer.accept(axisY2);
        return this;
    }
    
    public FixedConstraintSettings axisY2(Vec3 other) {
        axisY2.set(other);
        return this;
    }
    
    public Vec3 axisY2() {
        return axisY2;
    }
    
    @Override
    public FixedConstraintSettings set(FixedConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public FixedConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<FixedConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<FixedConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FixedConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<FixedConstraintSettings> array(Arena arena, FixedConstraintSettings... structs) {
        NativeStructArray<FixedConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FixedConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<FixedConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new FixedConstraintSettings(segment)
        );
    }
    
}