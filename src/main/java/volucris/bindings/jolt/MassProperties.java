/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class MassProperties
		implements Struct<MassProperties> {

    private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA;
    private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SCALE_TO_MASS;
    private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE;

    public static final StructLayout LAYOUT;

    public static final VarHandle MASS;

    public static final long MASS_OFFSET;
    public static final long INERTIA_OFFSET;

    private final MemorySegment segment;

    private final Mat4 inertia;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("mass"),
            Mat4.LAYOUT.withName("inertia")
        ).withName("JPH_MassProperties").withByteAlignment(4);
        
        JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA = downcallHandleVoid("JPH_MassProperties_DecomposePrincipalMomentsOfInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MASS_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MassProperties_ScaleToMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE = downcallHandleVoid("JPH_MassProperties_GetEquivalentSolidBoxSize", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        
        MASS = LAYOUT.varHandle(PathElement.groupElement("mass"));
        
        MASS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mass"));
        INERTIA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inertia"));
        //@formatter:on
    }

    public MassProperties() {
        this(Arena.ofAuto());
    }
    
    public MassProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MassProperties(MemorySegment segment) {
        this.segment = segment;
    
        inertia = new Mat4(segment.asSlice(INERTIA_OFFSET, Mat4.LAYOUT));
    }

    public static void decomposePrincipalMomentsOfInertia(
        MemorySegment properties, 
        MemorySegment rotation, 
        MemorySegment diagonal
    ) {
        MethodHandle method = JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA.get();
        try {
            method.invokeExact(
                properties, 
                rotation, 
                diagonal
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #decomposePrincipalMomentsOfInertia}.
     */
    public final void decomposePrincipalMomentsOfInertia(
        Mat4 rotation, 
        Vec3 diagonal
    ) {
        decomposePrincipalMomentsOfInertia(
            this.segment, 
            rotation.memorySegment(), 
            diagonal.memorySegment()
        );
    }
    
    public static void scaleToMass(
        MemorySegment properties, 
        float mass
    ) {
        MethodHandle method = JPH_MASS_PROPERTIES_SCALE_TO_MASS.get();
        try {
            method.invokeExact(
                properties, 
                mass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #scaleToMass}.
     */
    public final void scaleToMass(
        float mass
    ) {
        scaleToMass(
            this.segment, 
            mass
        );
    }
    
    public static void getEquivalentSolidBoxSize(
        float mass, 
        MemorySegment inertiaDiagonal, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE.get();
        try {
            method.invokeExact(
                mass, 
                inertiaDiagonal, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEquivalentSolidBoxSize}.
     */
    public final void getEquivalentSolidBoxSize(
        float mass, 
        Vec3 inertiaDiagonal, 
        Vec3 result
    ) {
        getEquivalentSolidBoxSize(
            mass, 
            inertiaDiagonal.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public MassProperties mass(float mass) {
        MASS.set(segment, 0L, mass);
        return this;
    }
    
    public float mass() {
        return (float) MASS.get(segment, 0L);
    }
    
    public MassProperties inertia(Consumer<Mat4> consumer) {
        consumer.accept(inertia);
        return this;
    }
    
    public MassProperties inertia(Mat4 other) {
        inertia.set(other);
        return this;
    }
    
    public Mat4 inertia() {
        return inertia;
    }
    
    @Override
    public MassProperties set(MassProperties other) {
        return set(other.segment);
    }
    
    @Override
    public MassProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MassProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MassProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MassProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<MassProperties> array(Arena arena, MassProperties... structs) {
        NativeStructArray<MassProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MassProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MassProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MassProperties(segment)
        );
    }
    
}