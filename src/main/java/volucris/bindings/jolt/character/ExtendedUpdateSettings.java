/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
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
public final class ExtendedUpdateSettings
		implements Struct<ExtendedUpdateSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle WALK_STAIRS_MIN_STEP_FORWARD;
    public static final VarHandle WALK_STAIRS_STEP_FORWARD_TEST;
    public static final VarHandle WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT;

    public static final long STICK_TO_FLOOR_STEP_DOWN_OFFSET;
    public static final long WALK_STAIRS_STEP_UP_OFFSET;
    public static final long WALK_STAIRS_MIN_STEP_FORWARD_OFFSET;
    public static final long WALK_STAIRS_STEP_FORWARD_TEST_OFFSET;
    public static final long WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT_OFFSET;
    public static final long WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET;

    private final MemorySegment segment;

    private final Vec3 stickToFloorStepDown;
    private final Vec3 walkStairsStepUp;
    private final Vec3 walkStairsStepDownExtra;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("stickToFloorStepDown"),
            Vec3.LAYOUT.withName("walkStairsStepUp"),
            JAVA_FLOAT.withName("walkStairsMinStepForward"),
            JAVA_FLOAT.withName("walkStairsStepForwardTest"),
            JAVA_FLOAT.withName("walkStairsCosAngleForwardContact"),
            Vec3.LAYOUT.withName("walkStairsStepDownExtra")
        ).withName("JPH_ExtendedUpdateSettings").withByteAlignment(4);
        
        WALK_STAIRS_MIN_STEP_FORWARD = LAYOUT.varHandle(PathElement.groupElement("walkStairsMinStepForward"));
        WALK_STAIRS_STEP_FORWARD_TEST = LAYOUT.varHandle(PathElement.groupElement("walkStairsStepForwardTest"));
        WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT = LAYOUT.varHandle(PathElement.groupElement("walkStairsCosAngleForwardContact"));
        
        STICK_TO_FLOOR_STEP_DOWN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stickToFloorStepDown"));
        WALK_STAIRS_STEP_UP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsStepUp"));
        WALK_STAIRS_MIN_STEP_FORWARD_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsMinStepForward"));
        WALK_STAIRS_STEP_FORWARD_TEST_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsStepForwardTest"));
        WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsCosAngleForwardContact"));
        WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsStepDownExtra"));
        //@formatter:on
    }

    public ExtendedUpdateSettings() {
        this(Arena.ofAuto());
    }
    
    public ExtendedUpdateSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ExtendedUpdateSettings(MemorySegment segment) {
        this.segment = segment;
    
        stickToFloorStepDown = new Vec3(segment.asSlice(STICK_TO_FLOOR_STEP_DOWN_OFFSET, Vec3.LAYOUT));
        walkStairsStepUp = new Vec3(segment.asSlice(WALK_STAIRS_STEP_UP_OFFSET, Vec3.LAYOUT));
        walkStairsStepDownExtra = new Vec3(segment.asSlice(WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET, Vec3.LAYOUT));
    }

    public ExtendedUpdateSettings walkStairsMinStepForward(float walkStairsMinStepForward) {
        WALK_STAIRS_MIN_STEP_FORWARD.set(segment, 0L, walkStairsMinStepForward);
        return this;
    }
    
    public float walkStairsMinStepForward() {
        return (float) WALK_STAIRS_MIN_STEP_FORWARD.get(segment, 0L);
    }
    
    public ExtendedUpdateSettings walkStairsStepForwardTest(float walkStairsStepForwardTest) {
        WALK_STAIRS_STEP_FORWARD_TEST.set(segment, 0L, walkStairsStepForwardTest);
        return this;
    }
    
    public float walkStairsStepForwardTest() {
        return (float) WALK_STAIRS_STEP_FORWARD_TEST.get(segment, 0L);
    }
    
    public ExtendedUpdateSettings walkStairsCosAngleForwardContact(float walkStairsCosAngleForwardContact) {
        WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.set(segment, 0L, walkStairsCosAngleForwardContact);
        return this;
    }
    
    public float walkStairsCosAngleForwardContact() {
        return (float) WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.get(segment, 0L);
    }
    
    public ExtendedUpdateSettings stickToFloorStepDown(Consumer<Vec3> consumer) {
        consumer.accept(stickToFloorStepDown);
        return this;
    }
    
    public ExtendedUpdateSettings stickToFloorStepDown(Vec3 other) {
        stickToFloorStepDown.set(other);
        return this;
    }
    
    public Vec3 stickToFloorStepDown() {
        return stickToFloorStepDown;
    }
    
    public ExtendedUpdateSettings walkStairsStepUp(Consumer<Vec3> consumer) {
        consumer.accept(walkStairsStepUp);
        return this;
    }
    
    public ExtendedUpdateSettings walkStairsStepUp(Vec3 other) {
        walkStairsStepUp.set(other);
        return this;
    }
    
    public Vec3 walkStairsStepUp() {
        return walkStairsStepUp;
    }
    
    public ExtendedUpdateSettings walkStairsStepDownExtra(Consumer<Vec3> consumer) {
        consumer.accept(walkStairsStepDownExtra);
        return this;
    }
    
    public ExtendedUpdateSettings walkStairsStepDownExtra(Vec3 other) {
        walkStairsStepDownExtra.set(other);
        return this;
    }
    
    public Vec3 walkStairsStepDownExtra() {
        return walkStairsStepDownExtra;
    }
    
    @Override
    public ExtendedUpdateSettings set(ExtendedUpdateSettings other) {
        return set(other.segment);
    }
    
    @Override
    public ExtendedUpdateSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ExtendedUpdateSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ExtendedUpdateSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ExtendedUpdateSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<ExtendedUpdateSettings> array(Arena arena, ExtendedUpdateSettings... structs) {
        NativeStructArray<ExtendedUpdateSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ExtendedUpdateSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ExtendedUpdateSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ExtendedUpdateSettings(segment)
        );
    }
    
}