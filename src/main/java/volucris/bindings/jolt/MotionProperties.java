/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class MotionProperties {

    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_INVERSE_MASS;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA;
    private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SCALE_TO_MASS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS = downcallHandle("JPH_MotionProperties_GetAllowedDOFs", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING = downcallHandle("JPH_MotionProperties_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING = downcallHandle("JPH_MotionProperties_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES = downcallHandleVoid("JPH_MotionProperties_SetMassProperties", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED = downcallHandle("JPH_MotionProperties_GetInverseMassUnchecked", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SET_INVERSE_MASS = downcallHandleVoid("JPH_MotionProperties_SetInverseMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL = downcallHandleVoid("JPH_MotionProperties_GetInverseInertiaDiagonal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION = downcallHandleVoid("JPH_MotionProperties_GetInertiaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA = downcallHandleVoid("JPH_MotionProperties_SetInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MOTION_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MotionProperties_ScaleToMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public MotionProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public static int getAllowedDOFs(
        MemorySegment properties
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS.get();
        try {
            return (int) method.invokeExact(
                properties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAllowedDOFs}.
     */
    public final int getAllowedDOFs(
    ) {
        return (int) getAllowedDOFs(
            this.segment
        );
    }
    
    public static void setLinearDamping(
        MemorySegment properties, 
        float damping
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING.get();
        try {
            method.invokeExact(
                properties, 
                damping
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearDamping}.
     */
    public final void setLinearDamping(
        float damping
    ) {
        setLinearDamping(
            this.segment, 
            damping
        );
    }
    
    public static float getLinearDamping(
        MemorySegment properties
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                properties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLinearDamping}.
     */
    public final float getLinearDamping(
    ) {
        return (float) getLinearDamping(
            this.segment
        );
    }
    
    public static void setAngularDamping(
        MemorySegment properties, 
        float damping
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING.get();
        try {
            method.invokeExact(
                properties, 
                damping
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularDamping}.
     */
    public final void setAngularDamping(
        float damping
    ) {
        setAngularDamping(
            this.segment, 
            damping
        );
    }
    
    public static float getAngularDamping(
        MemorySegment properties
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                properties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularDamping}.
     */
    public final float getAngularDamping(
    ) {
        return (float) getAngularDamping(
            this.segment
        );
    }
    
    public static void setMassProperties(
        MemorySegment properties, 
        int allowedDOFs, 
        MemorySegment massProperties
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES.get();
        try {
            method.invokeExact(
                properties, 
                allowedDOFs, 
                massProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMassProperties}.
     */
    public final void setMassProperties(
        int allowedDOFs, 
        MassProperties massProperties
    ) {
        setMassProperties(
            this.segment, 
            allowedDOFs, 
            massProperties.memorySegment()
        );
    }
    
    public static float getInverseMassUnchecked(
        MemorySegment properties
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED.get();
        try {
            return (float) method.invokeExact(
                properties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInverseMassUnchecked}.
     */
    public final float getInverseMassUnchecked(
    ) {
        return (float) getInverseMassUnchecked(
            this.segment
        );
    }
    
    public static void setInverseMass(
        MemorySegment properties, 
        float inverseMass
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_MASS.get();
        try {
            method.invokeExact(
                properties, 
                inverseMass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setInverseMass}.
     */
    public final void setInverseMass(
        float inverseMass
    ) {
        setInverseMass(
            this.segment, 
            inverseMass
        );
    }
    
    public static void getInverseInertiaDiagonal(
        MemorySegment properties, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL.get();
        try {
            method.invokeExact(
                properties, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInverseInertiaDiagonal}.
     */
    public final void getInverseInertiaDiagonal(
        Vec3 result
    ) {
        getInverseInertiaDiagonal(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getInertiaRotation(
        MemorySegment properties, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION.get();
        try {
            method.invokeExact(
                properties, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInertiaRotation}.
     */
    public final void getInertiaRotation(
        Quat result
    ) {
        getInertiaRotation(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setInverseInertia(
        MemorySegment properties, 
        MemorySegment diagonal, 
        MemorySegment rot
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA.get();
        try {
            method.invokeExact(
                properties, 
                diagonal, 
                rot
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setInverseInertia}.
     */
    public final void setInverseInertia(
        Vec3 diagonal, 
        Quat rot
    ) {
        setInverseInertia(
            this.segment, 
            diagonal.memorySegment(), 
            rot.memorySegment()
        );
    }
    
    public static void scaleToMass(
        MemorySegment properties, 
        float mass
    ) {
        MethodHandle method = JPH_MOTION_PROPERTIES_SCALE_TO_MASS.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}