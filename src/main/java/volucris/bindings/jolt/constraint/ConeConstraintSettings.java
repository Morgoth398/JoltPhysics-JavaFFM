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
public final class ConeConstraintSettings
		implements Struct<ConeConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle HALF_CONE_ANGLE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long TWIST_AXIS1_OFFSET;
    public static final long POINT2_OFFSET;
    public static final long TWIST_AXIS2_OFFSET;
    public static final long HALF_CONE_ANGLE_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 twistAxis1;
    private final Vec3 point2;
    private final Vec3 twistAxis2;

    static {
        //@formatter:off
        JPH_CONE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_ConeConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("twistAxis1"),
            Vec3.LAYOUT.withName("point2"),
            Vec3.LAYOUT.withName("twistAxis2"),
            JAVA_FLOAT.withName("halfConeAngle")
        ).withName("JPH_ConeConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        HALF_CONE_ANGLE = LAYOUT.varHandle(PathElement.groupElement("halfConeAngle"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        TWIST_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        TWIST_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis2"));
        HALF_CONE_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("halfConeAngle"));
        //@formatter:on
    }

    public ConeConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public ConeConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ConeConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        twistAxis1 = new Vec3(segment.asSlice(TWIST_AXIS1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
        twistAxis2 = new Vec3(segment.asSlice(TWIST_AXIS2_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public ConeConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public ConeConstraintSettings halfConeAngle(float halfConeAngle) {
        HALF_CONE_ANGLE.set(segment, 0L, halfConeAngle);
        return this;
    }
    
    public float halfConeAngle() {
        return (float) HALF_CONE_ANGLE.get(segment, 0L);
    }
    
    public ConeConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public ConeConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public ConeConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public ConeConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public ConeConstraintSettings twistAxis1(Consumer<Vec3> consumer) {
        consumer.accept(twistAxis1);
        return this;
    }
    
    public ConeConstraintSettings twistAxis1(Vec3 other) {
        twistAxis1.set(other);
        return this;
    }
    
    public Vec3 twistAxis1() {
        return twistAxis1;
    }
    
    public ConeConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public ConeConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    public ConeConstraintSettings twistAxis2(Consumer<Vec3> consumer) {
        consumer.accept(twistAxis2);
        return this;
    }
    
    public ConeConstraintSettings twistAxis2(Vec3 other) {
        twistAxis2.set(other);
        return this;
    }
    
    public Vec3 twistAxis2() {
        return twistAxis2;
    }
    
    @Override
    public ConeConstraintSettings set(ConeConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public ConeConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ConeConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ConeConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ConeConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<ConeConstraintSettings> array(Arena arena, ConeConstraintSettings... structs) {
        NativeStructArray<ConeConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ConeConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ConeConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ConeConstraintSettings(segment)
        );
    }
    
}