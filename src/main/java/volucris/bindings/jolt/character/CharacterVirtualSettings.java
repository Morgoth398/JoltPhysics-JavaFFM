/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterVirtualSettings
		implements Struct<CharacterVirtualSettings> {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle ID_HANDLE;
    public static final VarHandle MASS_HANDLE;
    public static final VarHandle MAX_STRENGTH_HANDLE;
    public static final VarHandle BACK_FACE_MODE_HANDLE;
    public static final VarHandle PREDICTIVE_CONTACT_DISTANCE_HANDLE;
    public static final VarHandle MAX_COLLISION_ITERATIONS_HANDLE;
    public static final VarHandle MAX_CONSTRAINT_ITERATIONS_HANDLE;
    public static final VarHandle MIN_TIME_REMAINING_HANDLE;
    public static final VarHandle COLLISION_TOLERANCE_HANDLE;
    public static final VarHandle CHARACTER_PADDING_HANDLE;
    public static final VarHandle MAX_NUM_HITS_HANDLE;
    public static final VarHandle HIT_REDUCTION_COS_MAX_ANGLE_HANDLE;
    public static final VarHandle PENETRATION_RECOVERY_SPEED_HANDLE;
    public static final VarHandle INNER_BODY_SHAPE_HANDLE;
    public static final VarHandle INNER_BODY_IDOVERRIDE_HANDLE;
    public static final VarHandle INNER_BODY_LAYER_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long ID_BYTE_OFFSET;
    public static final long MASS_BYTE_OFFSET;
    public static final long MAX_STRENGTH_BYTE_OFFSET;
    public static final long SHAPE_OFFSET_BYTE_OFFSET;
    public static final long BACK_FACE_MODE_BYTE_OFFSET;
    public static final long PREDICTIVE_CONTACT_DISTANCE_BYTE_OFFSET;
    public static final long MAX_COLLISION_ITERATIONS_BYTE_OFFSET;
    public static final long MAX_CONSTRAINT_ITERATIONS_BYTE_OFFSET;
    public static final long MIN_TIME_REMAINING_BYTE_OFFSET;
    public static final long COLLISION_TOLERANCE_BYTE_OFFSET;
    public static final long CHARACTER_PADDING_BYTE_OFFSET;
    public static final long MAX_NUM_HITS_BYTE_OFFSET;
    public static final long HIT_REDUCTION_COS_MAX_ANGLE_BYTE_OFFSET;
    public static final long PENETRATION_RECOVERY_SPEED_BYTE_OFFSET;
    public static final long INNER_BODY_SHAPE_BYTE_OFFSET;
    public static final long INNER_BODY_IDOVERRIDE_BYTE_OFFSET;
    public static final long INNER_BODY_LAYER_BYTE_OFFSET;

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
        
        ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ID"));
        MASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mass"));
        MAX_STRENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStrength"));
        BACK_FACE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("backFaceMode"));
        PREDICTIVE_CONTACT_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("predictiveContactDistance"));
        MAX_COLLISION_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCollisionIterations"));
        MAX_CONSTRAINT_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxConstraintIterations"));
        MIN_TIME_REMAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minTimeRemaining"));
        COLLISION_TOLERANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("collisionTolerance"));
        CHARACTER_PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("characterPadding"));
        MAX_NUM_HITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxNumHits"));
        HIT_REDUCTION_COS_MAX_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitReductionCosMaxAngle"));
        PENETRATION_RECOVERY_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("penetrationRecoverySpeed"));
        INNER_BODY_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("innerBodyShape"));
        INNER_BODY_IDOVERRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("innerBodyIDOverride"));
        INNER_BODY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("innerBodyLayer"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ID"));
        MASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mass"));
        MAX_STRENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStrength"));
        SHAPE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeOffset"));
        BACK_FACE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceMode"));
        PREDICTIVE_CONTACT_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("predictiveContactDistance"));
        MAX_COLLISION_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCollisionIterations"));
        MAX_CONSTRAINT_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxConstraintIterations"));
        MIN_TIME_REMAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTimeRemaining"));
        COLLISION_TOLERANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collisionTolerance"));
        CHARACTER_PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("characterPadding"));
        MAX_NUM_HITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxNumHits"));
        HIT_REDUCTION_COS_MAX_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitReductionCosMaxAngle"));
        PENETRATION_RECOVERY_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationRecoverySpeed"));
        INNER_BODY_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyShape"));
        INNER_BODY_IDOVERRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyIDOverride"));
        INNER_BODY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerBodyLayer"));
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
    
        base = new CharacterBaseSettings(segment.asSlice(BASE_BYTE_OFFSET, CharacterBaseSettings.LAYOUT));
        shapeOffset = new Vec3(segment.asSlice(SHAPE_OFFSET_BYTE_OFFSET, Vec3.LAYOUT));
    
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
    
    /// Typed method of [#init].
    public final void init() {
    	init(
    		this.segment
    	);
    }
    
    /// @see #iD()
    public CharacterVirtualSettings iD(int iD) {
    	ID_HANDLE.set(segment, 0L, iD);
    	return this;
    }
    
    public int iD() {
    	return (int) ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #mass()
    public CharacterVirtualSettings mass(float mass) {
    	MASS_HANDLE.set(segment, 0L, mass);
    	return this;
    }
    
    public float mass() {
    	return (float) MASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStrength()
    public CharacterVirtualSettings maxStrength(float maxStrength) {
    	MAX_STRENGTH_HANDLE.set(segment, 0L, maxStrength);
    	return this;
    }
    
    public float maxStrength() {
    	return (float) MAX_STRENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #backFaceMode()
    public CharacterVirtualSettings backFaceMode(int backFaceMode) {
    	BACK_FACE_MODE_HANDLE.set(segment, 0L, backFaceMode);
    	return this;
    }
    
    public int backFaceMode() {
    	return (int) BACK_FACE_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #predictiveContactDistance()
    public CharacterVirtualSettings predictiveContactDistance(float predictiveContactDistance) {
    	PREDICTIVE_CONTACT_DISTANCE_HANDLE.set(segment, 0L, predictiveContactDistance);
    	return this;
    }
    
    public float predictiveContactDistance() {
    	return (float) PREDICTIVE_CONTACT_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCollisionIterations()
    public CharacterVirtualSettings maxCollisionIterations(int maxCollisionIterations) {
    	MAX_COLLISION_ITERATIONS_HANDLE.set(segment, 0L, maxCollisionIterations);
    	return this;
    }
    
    public int maxCollisionIterations() {
    	return (int) MAX_COLLISION_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxConstraintIterations()
    public CharacterVirtualSettings maxConstraintIterations(int maxConstraintIterations) {
    	MAX_CONSTRAINT_ITERATIONS_HANDLE.set(segment, 0L, maxConstraintIterations);
    	return this;
    }
    
    public int maxConstraintIterations() {
    	return (int) MAX_CONSTRAINT_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minTimeRemaining()
    public CharacterVirtualSettings minTimeRemaining(float minTimeRemaining) {
    	MIN_TIME_REMAINING_HANDLE.set(segment, 0L, minTimeRemaining);
    	return this;
    }
    
    public float minTimeRemaining() {
    	return (float) MIN_TIME_REMAINING_HANDLE.get(segment, 0L);
    }
    
    /// @see #collisionTolerance()
    public CharacterVirtualSettings collisionTolerance(float collisionTolerance) {
    	COLLISION_TOLERANCE_HANDLE.set(segment, 0L, collisionTolerance);
    	return this;
    }
    
    public float collisionTolerance() {
    	return (float) COLLISION_TOLERANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #characterPadding()
    public CharacterVirtualSettings characterPadding(float characterPadding) {
    	CHARACTER_PADDING_HANDLE.set(segment, 0L, characterPadding);
    	return this;
    }
    
    public float characterPadding() {
    	return (float) CHARACTER_PADDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxNumHits()
    public CharacterVirtualSettings maxNumHits(int maxNumHits) {
    	MAX_NUM_HITS_HANDLE.set(segment, 0L, maxNumHits);
    	return this;
    }
    
    public int maxNumHits() {
    	return (int) MAX_NUM_HITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitReductionCosMaxAngle()
    public CharacterVirtualSettings hitReductionCosMaxAngle(float hitReductionCosMaxAngle) {
    	HIT_REDUCTION_COS_MAX_ANGLE_HANDLE.set(segment, 0L, hitReductionCosMaxAngle);
    	return this;
    }
    
    public float hitReductionCosMaxAngle() {
    	return (float) HIT_REDUCTION_COS_MAX_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #penetrationRecoverySpeed()
    public CharacterVirtualSettings penetrationRecoverySpeed(float penetrationRecoverySpeed) {
    	PENETRATION_RECOVERY_SPEED_HANDLE.set(segment, 0L, penetrationRecoverySpeed);
    	return this;
    }
    
    public float penetrationRecoverySpeed() {
    	return (float) PENETRATION_RECOVERY_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #innerBodyShape()
    public CharacterVirtualSettings innerBodyShape(Shape innerBodyShape) {
    	INNER_BODY_SHAPE_HANDLE.set(segment, 0L, innerBodyShape.memorySegment());
    	return this;
    }
    
    public @Nullable Shape innerBodyShape() {
    	MemorySegment segment = (MemorySegment) INNER_BODY_SHAPE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Shape(segment);
    }
    
    /// @see #innerBodyIDOverride()
    public CharacterVirtualSettings innerBodyIDOverride(int innerBodyIDOverride) {
    	INNER_BODY_IDOVERRIDE_HANDLE.set(segment, 0L, innerBodyIDOverride);
    	return this;
    }
    
    public int innerBodyIDOverride() {
    	return (int) INNER_BODY_IDOVERRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #innerBodyLayer()
    public CharacterVirtualSettings innerBodyLayer(int innerBodyLayer) {
    	INNER_BODY_LAYER_HANDLE.set(segment, 0L, innerBodyLayer);
    	return this;
    }
    
    public int innerBodyLayer() {
    	return (int) INNER_BODY_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public CharacterVirtualSettings base(Consumer<CharacterBaseSettings> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public CharacterVirtualSettings base(CharacterBaseSettings other) {
    	base.set(other);
    	return this;
    }
    
    public CharacterBaseSettings base() {
    	return base;
    }
    
    /// @see #shapeOffset()
    public CharacterVirtualSettings shapeOffset(Consumer<Vec3> consumer) {
    	consumer.accept(shapeOffset);
    	return this;
    }
    
    /// @see #shapeOffset()
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