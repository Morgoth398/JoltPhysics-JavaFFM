/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
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
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CharacterVirtualSettings
		implements Struct<CharacterVirtualSettings> {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle ID;
    public static final VarHandle MASS;
    public static final VarHandle MAX_STRENGTH;
    public static final VarHandle BACK_FACE_MODE;
    public static final VarHandle PREDICTIVE_CONTACT_DISTANCE;
    public static final VarHandle MAX_COLLISION_ITERATIONS;
    public static final VarHandle MAX_CONSTRAINT_ITERATIONS;
    public static final VarHandle MIN_TIME_REMAINING;
    public static final VarHandle COLLISION_TOLERANCE;
    public static final VarHandle CHARACTER_PADDING;
    public static final VarHandle MAX_NUM_HITS;
    public static final VarHandle HIT_REDUCTION_COS_MAX_ANGLE;
    public static final VarHandle PENETRATION_RECOVERY_SPEED;
    public static final VarHandle INNER_BODY_SHAPE;
    public static final VarHandle INNER_BODY_IDOVERRIDE;
    public static final VarHandle INNER_BODY_LAYER;

    public static final long BASE_OFFSET;
    public static final long ID_OFFSET;
    public static final long MASS_OFFSET;
    public static final long MAX_STRENGTH_OFFSET;
    public static final long SHAPE_OFFSET_OFFSET;
    public static final long BACK_FACE_MODE_OFFSET;
    public static final long PREDICTIVE_CONTACT_DISTANCE_OFFSET;
    public static final long MAX_COLLISION_ITERATIONS_OFFSET;
    public static final long MAX_CONSTRAINT_ITERATIONS_OFFSET;
    public static final long MIN_TIME_REMAINING_OFFSET;
    public static final long COLLISION_TOLERANCE_OFFSET;
    public static final long CHARACTER_PADDING_OFFSET;
    public static final long MAX_NUM_HITS_OFFSET;
    public static final long HIT_REDUCTION_COS_MAX_ANGLE_OFFSET;
    public static final long PENETRATION_RECOVERY_SPEED_OFFSET;
    public static final long INNER_BODY_SHAPE_OFFSET;
    public static final long INNER_BODY_IDOVERRIDE_OFFSET;
    public static final long INNER_BODY_LAYER_OFFSET;

    private final MemorySegment segment;

    private final CharacterBaseSettings base;
    private final Vec3 shapeOffset;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            CharacterBaseSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("ID"),
            JAVA_FLOAT.withName("mass"),
            JAVA_FLOAT.withName("maxStrength"),
            Vec3.LAYOUT.withName("shapeOffset"),
            JAVA_INT.withName("backFaceMode"),
            JAVA_FLOAT.withName("predictiveContactDistance"),
            JAVA_INT.withName("maxCollisionIterations"),
            JAVA_INT.withName("maxConstraintIterations"),
            JAVA_FLOAT.withName("minTimeRemaining"),
            JAVA_FLOAT.withName("collisionTolerance"),
            JAVA_FLOAT.withName("characterPadding"),
            JAVA_INT.withName("maxNumHits"),
            JAVA_FLOAT.withName("hitReductionCosMaxAngle"),
            JAVA_FLOAT.withName("penetrationRecoverySpeed"),
            UNBOUNDED_ADDRESS.withName("innerBodyShape"),
            JAVA_INT.withName("innerBodyIDOverride"),
            JAVA_INT.withName("innerBodyLayer")
        ).withName("JPH_CharacterVirtualSettings").withByteAlignment(8);
        
        JPH_CHARACTER_VIRTUAL_SETTINGS_INIT = downcallHandleVoid("JPH_CharacterVirtualSettings_Init", UNBOUNDED_ADDRESS);
        
        ID = LAYOUT.varHandle(PathElement.groupElement("ID"));
        MASS = LAYOUT.varHandle(PathElement.groupElement("mass"));
        MAX_STRENGTH = LAYOUT.varHandle(PathElement.groupElement("maxStrength"));
        BACK_FACE_MODE = LAYOUT.varHandle(PathElement.groupElement("backFaceMode"));
        PREDICTIVE_CONTACT_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("predictiveContactDistance"));
        MAX_COLLISION_ITERATIONS = LAYOUT.varHandle(PathElement.groupElement("maxCollisionIterations"));
        MAX_CONSTRAINT_ITERATIONS = LAYOUT.varHandle(PathElement.groupElement("maxConstraintIterations"));
        MIN_TIME_REMAINING = LAYOUT.varHandle(PathElement.groupElement("minTimeRemaining"));
        COLLISION_TOLERANCE = LAYOUT.varHandle(PathElement.groupElement("collisionTolerance"));
        CHARACTER_PADDING = LAYOUT.varHandle(PathElement.groupElement("characterPadding"));
        MAX_NUM_HITS = LAYOUT.varHandle(PathElement.groupElement("maxNumHits"));
        HIT_REDUCTION_COS_MAX_ANGLE = LAYOUT.varHandle(PathElement.groupElement("hitReductionCosMaxAngle"));
        PENETRATION_RECOVERY_SPEED = LAYOUT.varHandle(PathElement.groupElement("penetrationRecoverySpeed"));
        INNER_BODY_SHAPE = LAYOUT.varHandle(PathElement.groupElement("innerBodyShape"));
        INNER_BODY_IDOVERRIDE = LAYOUT.varHandle(PathElement.groupElement("innerBodyIDOverride"));
        INNER_BODY_LAYER = LAYOUT.varHandle(PathElement.groupElement("innerBodyLayer"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ID"));
        MASS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mass"));
        MAX_STRENGTH_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStrength"));
        SHAPE_OFFSET_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeOffset"));
        BACK_FACE_MODE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceMode"));
        PREDICTIVE_CONTACT_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("predictiveContactDistance"));
        MAX_COLLISION_ITERATIONS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCollisionIterations"));
        MAX_CONSTRAINT_ITERATIONS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxConstraintIterations"));
        MIN_TIME_REMAINING_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTimeRemaining"));
        COLLISION_TOLERANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collisionTolerance"));
        CHARACTER_PADDING_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("characterPadding"));
        MAX_NUM_HITS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxNumHits"));
        HIT_REDUCTION_COS_MAX_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitReductionCosMaxAngle"));
        PENETRATION_RECOVERY_SPEED_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationRecoverySpeed"));
        INNER_BODY_SHAPE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyShape"));
        INNER_BODY_IDOVERRIDE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyIDOverride"));
        INNER_BODY_LAYER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyLayer"));
        //@formatter:on
    }

    public CharacterVirtualSettings() {
        this(Arena.ofAuto());
    }
    
    public CharacterVirtualSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CharacterVirtualSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new CharacterBaseSettings(segment.asSlice(BASE_OFFSET, CharacterBaseSettings.LAYOUT));
        shapeOffset = new Vec3(segment.asSlice(SHAPE_OFFSET_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_INIT.get();
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
    
    public CharacterVirtualSettings ID(int ID) {
        CharacterVirtualSettings.ID.set(segment, 0L, ID);
        return this;
    }
    
    public int ID() {
        return (int) ID.get(segment, 0L);
    }
    
    public CharacterVirtualSettings mass(float mass) {
        MASS.set(segment, 0L, mass);
        return this;
    }
    
    public float mass() {
        return (float) MASS.get(segment, 0L);
    }
    
    public CharacterVirtualSettings maxStrength(float maxStrength) {
        MAX_STRENGTH.set(segment, 0L, maxStrength);
        return this;
    }
    
    public float maxStrength() {
        return (float) MAX_STRENGTH.get(segment, 0L);
    }
    
    public CharacterVirtualSettings backFaceMode(int backFaceMode) {
        BACK_FACE_MODE.set(segment, 0L, backFaceMode);
        return this;
    }
    
    public int backFaceMode() {
        return (int) BACK_FACE_MODE.get(segment, 0L);
    }
    
    public CharacterVirtualSettings predictiveContactDistance(float predictiveContactDistance) {
        PREDICTIVE_CONTACT_DISTANCE.set(segment, 0L, predictiveContactDistance);
        return this;
    }
    
    public float predictiveContactDistance() {
        return (float) PREDICTIVE_CONTACT_DISTANCE.get(segment, 0L);
    }
    
    public CharacterVirtualSettings maxCollisionIterations(int maxCollisionIterations) {
        MAX_COLLISION_ITERATIONS.set(segment, 0L, maxCollisionIterations);
        return this;
    }
    
    public int maxCollisionIterations() {
        return (int) MAX_COLLISION_ITERATIONS.get(segment, 0L);
    }
    
    public CharacterVirtualSettings maxConstraintIterations(int maxConstraintIterations) {
        MAX_CONSTRAINT_ITERATIONS.set(segment, 0L, maxConstraintIterations);
        return this;
    }
    
    public int maxConstraintIterations() {
        return (int) MAX_CONSTRAINT_ITERATIONS.get(segment, 0L);
    }
    
    public CharacterVirtualSettings minTimeRemaining(float minTimeRemaining) {
        MIN_TIME_REMAINING.set(segment, 0L, minTimeRemaining);
        return this;
    }
    
    public float minTimeRemaining() {
        return (float) MIN_TIME_REMAINING.get(segment, 0L);
    }
    
    public CharacterVirtualSettings collisionTolerance(float collisionTolerance) {
        COLLISION_TOLERANCE.set(segment, 0L, collisionTolerance);
        return this;
    }
    
    public float collisionTolerance() {
        return (float) COLLISION_TOLERANCE.get(segment, 0L);
    }
    
    public CharacterVirtualSettings characterPadding(float characterPadding) {
        CHARACTER_PADDING.set(segment, 0L, characterPadding);
        return this;
    }
    
    public float characterPadding() {
        return (float) CHARACTER_PADDING.get(segment, 0L);
    }
    
    public CharacterVirtualSettings maxNumHits(int maxNumHits) {
        MAX_NUM_HITS.set(segment, 0L, maxNumHits);
        return this;
    }
    
    public int maxNumHits() {
        return (int) MAX_NUM_HITS.get(segment, 0L);
    }
    
    public CharacterVirtualSettings hitReductionCosMaxAngle(float hitReductionCosMaxAngle) {
        HIT_REDUCTION_COS_MAX_ANGLE.set(segment, 0L, hitReductionCosMaxAngle);
        return this;
    }
    
    public float hitReductionCosMaxAngle() {
        return (float) HIT_REDUCTION_COS_MAX_ANGLE.get(segment, 0L);
    }
    
    public CharacterVirtualSettings penetrationRecoverySpeed(float penetrationRecoverySpeed) {
        PENETRATION_RECOVERY_SPEED.set(segment, 0L, penetrationRecoverySpeed);
        return this;
    }
    
    public float penetrationRecoverySpeed() {
        return (float) PENETRATION_RECOVERY_SPEED.get(segment, 0L);
    }
    
    public CharacterVirtualSettings innerBodyShape(Shape innerBodyShape) {
        INNER_BODY_SHAPE.set(segment, 0L, innerBodyShape.memorySegment());
        return this;
    }
    
    public @Nullable Shape innerBodyShape() {
        MemorySegment segment = (MemorySegment) INNER_BODY_SHAPE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public CharacterVirtualSettings innerBodyIDOverride(int innerBodyIDOverride) {
        INNER_BODY_IDOVERRIDE.set(segment, 0L, innerBodyIDOverride);
        return this;
    }
    
    public int innerBodyIDOverride() {
        return (int) INNER_BODY_IDOVERRIDE.get(segment, 0L);
    }
    
    public CharacterVirtualSettings innerBodyLayer(int innerBodyLayer) {
        INNER_BODY_LAYER.set(segment, 0L, innerBodyLayer);
        return this;
    }
    
    public int innerBodyLayer() {
        return (int) INNER_BODY_LAYER.get(segment, 0L);
    }
    
    public CharacterVirtualSettings base(Consumer<CharacterBaseSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public CharacterVirtualSettings base(CharacterBaseSettings other) {
        base.set(other);
        return this;
    }
    
    public CharacterBaseSettings base() {
        return base;
    }
    
    public CharacterVirtualSettings shapeOffset(Consumer<Vec3> consumer) {
        consumer.accept(shapeOffset);
        return this;
    }
    
    public CharacterVirtualSettings shapeOffset(Vec3 other) {
        shapeOffset.set(other);
        return this;
    }
    
    public Vec3 shapeOffset() {
        return shapeOffset;
    }
    
    @Override
    public CharacterVirtualSettings set(CharacterVirtualSettings other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterVirtualSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterVirtualSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterVirtualSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterVirtualSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterVirtualSettings> array(Arena arena, CharacterVirtualSettings... structs) {
        NativeStructArray<CharacterVirtualSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterVirtualSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterVirtualSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterVirtualSettings(segment)
        );
    }
    
}