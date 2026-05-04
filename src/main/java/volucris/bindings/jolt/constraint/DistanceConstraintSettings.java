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
public final class DistanceConstraintSettings
		implements Struct<DistanceConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle MIN_DISTANCE;
    public static final VarHandle MAX_DISTANCE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long POINT2_OFFSET;
    public static final long MIN_DISTANCE_OFFSET;
    public static final long MAX_DISTANCE_OFFSET;
    public static final long LIMITS_SPRING_SETTINGS_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 point2;
    private final SpringSettings limitsSpringSettings;

    static {
        //@formatter:off
        JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_DistanceConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("point2"),
            JAVA_FLOAT.withName("minDistance"),
            JAVA_FLOAT.withName("maxDistance"),
            SpringSettings.LAYOUT.withName("limitsSpringSettings")
        ).withName("JPH_DistanceConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        MIN_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("minDistance"));
        MAX_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("maxDistance"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        MIN_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDistance"));
        MAX_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDistance"));
        LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
        //@formatter:on
    }

    public DistanceConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public DistanceConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DistanceConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
        limitsSpringSettings = new SpringSettings(segment.asSlice(LIMITS_SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public DistanceConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public DistanceConstraintSettings minDistance(float minDistance) {
        MIN_DISTANCE.set(segment, 0L, minDistance);
        return this;
    }
    
    public float minDistance() {
        return (float) MIN_DISTANCE.get(segment, 0L);
    }
    
    public DistanceConstraintSettings maxDistance(float maxDistance) {
        MAX_DISTANCE.set(segment, 0L, maxDistance);
        return this;
    }
    
    public float maxDistance() {
        return (float) MAX_DISTANCE.get(segment, 0L);
    }
    
    public DistanceConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public DistanceConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public DistanceConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public DistanceConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public DistanceConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public DistanceConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    public DistanceConstraintSettings limitsSpringSettings(Consumer<SpringSettings> consumer) {
        consumer.accept(limitsSpringSettings);
        return this;
    }
    
    public DistanceConstraintSettings limitsSpringSettings(SpringSettings other) {
        limitsSpringSettings.set(other);
        return this;
    }
    
    public SpringSettings limitsSpringSettings() {
        return limitsSpringSettings;
    }
    
    @Override
    public DistanceConstraintSettings set(DistanceConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public DistanceConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DistanceConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DistanceConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<DistanceConstraintSettings> array(Arena arena, DistanceConstraintSettings... structs) {
        NativeStructArray<DistanceConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DistanceConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DistanceConstraintSettings(segment)
        );
    }
    
}