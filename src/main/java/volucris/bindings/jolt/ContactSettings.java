/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

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

/**
 * 
 */
public final class ContactSettings
		implements Struct<ContactSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle COMBINED_FRICTION;
    public static final VarHandle COMBINED_RESTITUTION;
    public static final VarHandle INV_MASS_SCALE1;
    public static final VarHandle INV_INERTIA_SCALE1;
    public static final VarHandle INV_MASS_SCALE2;
    public static final VarHandle INV_INERTIA_SCALE2;
    public static final VarHandle IS_SENSOR;

    public static final long COMBINED_FRICTION_OFFSET;
    public static final long COMBINED_RESTITUTION_OFFSET;
    public static final long INV_MASS_SCALE1_OFFSET;
    public static final long INV_INERTIA_SCALE1_OFFSET;
    public static final long INV_MASS_SCALE2_OFFSET;
    public static final long INV_INERTIA_SCALE2_OFFSET;
    public static final long IS_SENSOR_OFFSET;
    public static final long RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET;
    public static final long RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET;

    private final MemorySegment segment;

    private final Vec3 relativeLinearSurfaceVelocity;
    private final Vec3 relativeAngularSurfaceVelocity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("combinedFriction"),
            JAVA_FLOAT.withName("combinedRestitution"),
            JAVA_FLOAT.withName("invMassScale1"),
            JAVA_FLOAT.withName("invInertiaScale1"),
            JAVA_FLOAT.withName("invMassScale2"),
            JAVA_FLOAT.withName("invInertiaScale2"),
            JAVA_INT.withName("isSensor"),
            Vec3.LAYOUT.withName("relativeLinearSurfaceVelocity"),
            Vec3.LAYOUT.withName("relativeAngularSurfaceVelocity")
        ).withName("JPH_ContactSettings").withByteAlignment(4);
        
        COMBINED_FRICTION = LAYOUT.varHandle(PathElement.groupElement("combinedFriction"));
        COMBINED_RESTITUTION = LAYOUT.varHandle(PathElement.groupElement("combinedRestitution"));
        INV_MASS_SCALE1 = LAYOUT.varHandle(PathElement.groupElement("invMassScale1"));
        INV_INERTIA_SCALE1 = LAYOUT.varHandle(PathElement.groupElement("invInertiaScale1"));
        INV_MASS_SCALE2 = LAYOUT.varHandle(PathElement.groupElement("invMassScale2"));
        INV_INERTIA_SCALE2 = LAYOUT.varHandle(PathElement.groupElement("invInertiaScale2"));
        IS_SENSOR = LAYOUT.varHandle(PathElement.groupElement("isSensor"));
        
        COMBINED_FRICTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinedFriction"));
        COMBINED_RESTITUTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinedRestitution"));
        INV_MASS_SCALE1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invMassScale1"));
        INV_INERTIA_SCALE1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invInertiaScale1"));
        INV_MASS_SCALE2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invMassScale2"));
        INV_INERTIA_SCALE2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invInertiaScale2"));
        IS_SENSOR_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isSensor"));
        RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("relativeLinearSurfaceVelocity"));
        RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("relativeAngularSurfaceVelocity"));
        //@formatter:on
    }

    public ContactSettings() {
        this(Arena.ofAuto());
    }
    
    public ContactSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactSettings(MemorySegment segment) {
        this.segment = segment;
    
        relativeLinearSurfaceVelocity = new Vec3(segment.asSlice(RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET, Vec3.LAYOUT));
        relativeAngularSurfaceVelocity = new Vec3(segment.asSlice(RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET, Vec3.LAYOUT));
    }

    public ContactSettings combinedFriction(float combinedFriction) {
        COMBINED_FRICTION.set(segment, 0L, combinedFriction);
        return this;
    }
    
    public float combinedFriction() {
        return (float) COMBINED_FRICTION.get(segment, 0L);
    }
    
    public ContactSettings combinedRestitution(float combinedRestitution) {
        COMBINED_RESTITUTION.set(segment, 0L, combinedRestitution);
        return this;
    }
    
    public float combinedRestitution() {
        return (float) COMBINED_RESTITUTION.get(segment, 0L);
    }
    
    public ContactSettings invMassScale1(float invMassScale1) {
        INV_MASS_SCALE1.set(segment, 0L, invMassScale1);
        return this;
    }
    
    public float invMassScale1() {
        return (float) INV_MASS_SCALE1.get(segment, 0L);
    }
    
    public ContactSettings invInertiaScale1(float invInertiaScale1) {
        INV_INERTIA_SCALE1.set(segment, 0L, invInertiaScale1);
        return this;
    }
    
    public float invInertiaScale1() {
        return (float) INV_INERTIA_SCALE1.get(segment, 0L);
    }
    
    public ContactSettings invMassScale2(float invMassScale2) {
        INV_MASS_SCALE2.set(segment, 0L, invMassScale2);
        return this;
    }
    
    public float invMassScale2() {
        return (float) INV_MASS_SCALE2.get(segment, 0L);
    }
    
    public ContactSettings invInertiaScale2(float invInertiaScale2) {
        INV_INERTIA_SCALE2.set(segment, 0L, invInertiaScale2);
        return this;
    }
    
    public float invInertiaScale2() {
        return (float) INV_INERTIA_SCALE2.get(segment, 0L);
    }
    
    public ContactSettings isSensor(int isSensor) {
        IS_SENSOR.set(segment, 0L, isSensor);
        return this;
    }
    
    public int isSensor() {
        return (int) IS_SENSOR.get(segment, 0L);
    }
    
    public ContactSettings relativeLinearSurfaceVelocity(Consumer<Vec3> consumer) {
        consumer.accept(relativeLinearSurfaceVelocity);
        return this;
    }
    
    public ContactSettings relativeLinearSurfaceVelocity(Vec3 other) {
        relativeLinearSurfaceVelocity.set(other);
        return this;
    }
    
    public Vec3 relativeLinearSurfaceVelocity() {
        return relativeLinearSurfaceVelocity;
    }
    
    public ContactSettings relativeAngularSurfaceVelocity(Consumer<Vec3> consumer) {
        consumer.accept(relativeAngularSurfaceVelocity);
        return this;
    }
    
    public ContactSettings relativeAngularSurfaceVelocity(Vec3 other) {
        relativeAngularSurfaceVelocity.set(other);
        return this;
    }
    
    public Vec3 relativeAngularSurfaceVelocity() {
        return relativeAngularSurfaceVelocity;
    }
    
    @Override
    public ContactSettings set(ContactSettings other) {
        return set(other.segment);
    }
    
    @Override
    public ContactSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactSettings> array(Arena arena, ContactSettings... structs) {
        NativeStructArray<ContactSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactSettings(segment)
        );
    }
    
}