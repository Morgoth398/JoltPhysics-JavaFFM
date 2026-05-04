/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CharacterVirtualContact
		implements Struct<CharacterVirtualContact> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HASH;
    public static final VarHandle BODY_B;
    public static final VarHandle CHARACTER_IDB;
    public static final VarHandle SUB_SHAPE_IDB;
    public static final VarHandle DISTANCE;
    public static final VarHandle FRACTION;
    public static final VarHandle MOTION_TYPE_B;
    public static final VarHandle IS_SENSOR_B;
    public static final VarHandle CHARACTER_B;
    public static final VarHandle USER_DATA;
    public static final VarHandle MATERIAL;
    public static final VarHandle HAD_COLLISION;
    public static final VarHandle WAS_DISCARDED;
    public static final VarHandle CAN_PUSH_CHARACTER;

    public static final long HASH_OFFSET;
    public static final long BODY_B_OFFSET;
    public static final long CHARACTER_IDB_OFFSET;
    public static final long SUB_SHAPE_IDB_OFFSET;
    public static final long POSITION_OFFSET;
    public static final long LINEAR_VELOCITY_OFFSET;
    public static final long CONTACT_NORMAL_OFFSET;
    public static final long SURFACE_NORMAL_OFFSET;
    public static final long DISTANCE_OFFSET;
    public static final long FRACTION_OFFSET;
    public static final long MOTION_TYPE_B_OFFSET;
    public static final long IS_SENSOR_B_OFFSET;
    public static final long CHARACTER_B_OFFSET;
    public static final long USER_DATA_OFFSET;
    public static final long MATERIAL_OFFSET;
    public static final long HAD_COLLISION_OFFSET;
    public static final long WAS_DISCARDED_OFFSET;
    public static final long CAN_PUSH_CHARACTER_OFFSET;

    private final MemorySegment segment;

    private final Vec3 position;
    private final Vec3 linearVelocity;
    private final Vec3 contactNormal;
    private final Vec3 surfaceNormal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("hash"),
            JAVA_INT.withName("bodyB"),
            JAVA_INT.withName("characterIDB"),
            JAVA_INT.withName("subShapeIDB"),
            Vec3.LAYOUT.withName("position"),
            Vec3.LAYOUT.withName("linearVelocity"),
            Vec3.LAYOUT.withName("contactNormal"),
            Vec3.LAYOUT.withName("surfaceNormal"),
            JAVA_FLOAT.withName("distance"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_INT.withName("motionTypeB"),
            JAVA_BOOLEAN.withName("isSensorB"),
            MemoryLayout.paddingLayout(7),
            UNBOUNDED_ADDRESS.withName("characterB"),
            JAVA_LONG.withName("userData"),
            UNBOUNDED_ADDRESS.withName("material"),
            JAVA_BOOLEAN.withName("hadCollision"),
            JAVA_BOOLEAN.withName("wasDiscarded"),
            JAVA_BOOLEAN.withName("canPushCharacter"),
            MemoryLayout.paddingLayout(5)
        ).withName("JPH_CharacterVirtualContact").withByteAlignment(8);
        
        HASH = LAYOUT.varHandle(PathElement.groupElement("hash"));
        BODY_B = LAYOUT.varHandle(PathElement.groupElement("bodyB"));
        CHARACTER_IDB = LAYOUT.varHandle(PathElement.groupElement("characterIDB"));
        SUB_SHAPE_IDB = LAYOUT.varHandle(PathElement.groupElement("subShapeIDB"));
        DISTANCE = LAYOUT.varHandle(PathElement.groupElement("distance"));
        FRACTION = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        MOTION_TYPE_B = LAYOUT.varHandle(PathElement.groupElement("motionTypeB"));
        IS_SENSOR_B = LAYOUT.varHandle(PathElement.groupElement("isSensorB"));
        CHARACTER_B = LAYOUT.varHandle(PathElement.groupElement("characterB"));
        USER_DATA = LAYOUT.varHandle(PathElement.groupElement("userData"));
        MATERIAL = LAYOUT.varHandle(PathElement.groupElement("material"));
        HAD_COLLISION = LAYOUT.varHandle(PathElement.groupElement("hadCollision"));
        WAS_DISCARDED = LAYOUT.varHandle(PathElement.groupElement("wasDiscarded"));
        CAN_PUSH_CHARACTER = LAYOUT.varHandle(PathElement.groupElement("canPushCharacter"));
        
        HASH_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hash"));
        BODY_B_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyB"));
        CHARACTER_IDB_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("characterIDB"));
        SUB_SHAPE_IDB_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeIDB"));
        POSITION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
        LINEAR_VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearVelocity"));
        CONTACT_NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactNormal"));
        SURFACE_NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceNormal"));
        DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance"));
        FRACTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        MOTION_TYPE_B_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motionTypeB"));
        IS_SENSOR_B_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isSensorB"));
        CHARACTER_B_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("characterB"));
        USER_DATA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        MATERIAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("material"));
        HAD_COLLISION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hadCollision"));
        WAS_DISCARDED_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wasDiscarded"));
        CAN_PUSH_CHARACTER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("canPushCharacter"));
        //@formatter:on
    }

    public CharacterVirtualContact() {
        this(Arena.ofAuto());
    }
    
    public CharacterVirtualContact(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CharacterVirtualContact(MemorySegment segment) {
        this.segment = segment;
    
        position = new Vec3(segment.asSlice(POSITION_OFFSET, Vec3.LAYOUT));
        linearVelocity = new Vec3(segment.asSlice(LINEAR_VELOCITY_OFFSET, Vec3.LAYOUT));
        contactNormal = new Vec3(segment.asSlice(CONTACT_NORMAL_OFFSET, Vec3.LAYOUT));
        surfaceNormal = new Vec3(segment.asSlice(SURFACE_NORMAL_OFFSET, Vec3.LAYOUT));
    }

    public CharacterVirtualContact hash(long hash) {
        HASH.set(segment, 0L, hash);
        return this;
    }
    
    public long hash() {
        return (long) HASH.get(segment, 0L);
    }
    
    public CharacterVirtualContact bodyB(int bodyB) {
        BODY_B.set(segment, 0L, bodyB);
        return this;
    }
    
    public int bodyB() {
        return (int) BODY_B.get(segment, 0L);
    }
    
    public CharacterVirtualContact characterIDB(int characterIDB) {
        CHARACTER_IDB.set(segment, 0L, characterIDB);
        return this;
    }
    
    public int characterIDB() {
        return (int) CHARACTER_IDB.get(segment, 0L);
    }
    
    public CharacterVirtualContact subShapeIDB(int subShapeIDB) {
        SUB_SHAPE_IDB.set(segment, 0L, subShapeIDB);
        return this;
    }
    
    public int subShapeIDB() {
        return (int) SUB_SHAPE_IDB.get(segment, 0L);
    }
    
    public CharacterVirtualContact distance(float distance) {
        DISTANCE.set(segment, 0L, distance);
        return this;
    }
    
    public float distance() {
        return (float) DISTANCE.get(segment, 0L);
    }
    
    public CharacterVirtualContact fraction(float fraction) {
        FRACTION.set(segment, 0L, fraction);
        return this;
    }
    
    public float fraction() {
        return (float) FRACTION.get(segment, 0L);
    }
    
    public CharacterVirtualContact motionTypeB(int motionTypeB) {
        MOTION_TYPE_B.set(segment, 0L, motionTypeB);
        return this;
    }
    
    public int motionTypeB() {
        return (int) MOTION_TYPE_B.get(segment, 0L);
    }
    
    public CharacterVirtualContact isSensorB(boolean isSensorB) {
        IS_SENSOR_B.set(segment, 0L, isSensorB);
        return this;
    }
    
    public boolean isSensorB() {
        return (boolean) IS_SENSOR_B.get(segment, 0L);
    }
    
    public CharacterVirtualContact characterB(CharacterVirtual characterB) {
        CHARACTER_B.set(segment, 0L, characterB.memorySegment());
        return this;
    }
    
    public @Nullable CharacterVirtual characterB() {
        MemorySegment segment = (MemorySegment) CHARACTER_B.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new CharacterVirtual(segment);
    }
    
    public CharacterVirtualContact userData(long userData) {
        USER_DATA.set(segment, 0L, userData);
        return this;
    }
    
    public long userData() {
        return (long) USER_DATA.get(segment, 0L);
    }
    
    public CharacterVirtualContact material(PhysicsMaterial material) {
        MATERIAL.set(segment, 0L, material.memorySegment());
        return this;
    }
    
    public @Nullable PhysicsMaterial material() {
        MemorySegment segment = (MemorySegment) MATERIAL.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsMaterial(segment);
    }
    
    public CharacterVirtualContact hadCollision(boolean hadCollision) {
        HAD_COLLISION.set(segment, 0L, hadCollision);
        return this;
    }
    
    public boolean hadCollision() {
        return (boolean) HAD_COLLISION.get(segment, 0L);
    }
    
    public CharacterVirtualContact wasDiscarded(boolean wasDiscarded) {
        WAS_DISCARDED.set(segment, 0L, wasDiscarded);
        return this;
    }
    
    public boolean wasDiscarded() {
        return (boolean) WAS_DISCARDED.get(segment, 0L);
    }
    
    public CharacterVirtualContact canPushCharacter(boolean canPushCharacter) {
        CAN_PUSH_CHARACTER.set(segment, 0L, canPushCharacter);
        return this;
    }
    
    public boolean canPushCharacter() {
        return (boolean) CAN_PUSH_CHARACTER.get(segment, 0L);
    }
    
    public CharacterVirtualContact position(Consumer<Vec3> consumer) {
        consumer.accept(position);
        return this;
    }
    
    public CharacterVirtualContact position(Vec3 other) {
        position.set(other);
        return this;
    }
    
    public Vec3 position() {
        return position;
    }
    
    public CharacterVirtualContact linearVelocity(Consumer<Vec3> consumer) {
        consumer.accept(linearVelocity);
        return this;
    }
    
    public CharacterVirtualContact linearVelocity(Vec3 other) {
        linearVelocity.set(other);
        return this;
    }
    
    public Vec3 linearVelocity() {
        return linearVelocity;
    }
    
    public CharacterVirtualContact contactNormal(Consumer<Vec3> consumer) {
        consumer.accept(contactNormal);
        return this;
    }
    
    public CharacterVirtualContact contactNormal(Vec3 other) {
        contactNormal.set(other);
        return this;
    }
    
    public Vec3 contactNormal() {
        return contactNormal;
    }
    
    public CharacterVirtualContact surfaceNormal(Consumer<Vec3> consumer) {
        consumer.accept(surfaceNormal);
        return this;
    }
    
    public CharacterVirtualContact surfaceNormal(Vec3 other) {
        surfaceNormal.set(other);
        return this;
    }
    
    public Vec3 surfaceNormal() {
        return surfaceNormal;
    }
    
    @Override
    public CharacterVirtualContact set(CharacterVirtualContact other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterVirtualContact set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterVirtualContact> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterVirtualContact> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterVirtualContact(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterVirtualContact> array(Arena arena, CharacterVirtualContact... structs) {
        NativeStructArray<CharacterVirtualContact> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterVirtualContact(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterVirtualContact> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterVirtualContact(segment)
        );
    }
    
}