/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.vehicle.VehicleCollisionTester;
import volucris.bindings.jolt.vehicle.VehicleController;
import volucris.bindings.jolt.vehicle.Wheel;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleConstraint extends Constraint {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_CONSTRAINT_CREATE = downcallHandle("JPH_VehicleConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER = downcallHandle("JPH_VehicleConstraint_AsPhysicsStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE = downcallHandleVoid("JPH_VehicleConstraint_SetMaxPitchRollAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER = downcallHandleVoid("JPH_VehicleConstraint_SetVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY = downcallHandleVoid("JPH_VehicleConstraint_OverrideGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN = downcallHandle("JPH_VehicleConstraint_IsGravityOverridden", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_GetGravityOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_ResetGravityOverride", UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD = downcallHandleVoid("JPH_VehicleConstraint_GetLocalForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP = downcallHandleVoid("JPH_VehicleConstraint_GetLocalUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP = downcallHandleVoid("JPH_VehicleConstraint_GetWorldUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY = downcallHandle("JPH_VehicleConstraint_GetVehicleBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER = downcallHandle("JPH_VehicleConstraint_GetController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT = downcallHandle("JPH_VehicleConstraint_GetWheelsCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_WHEEL = downcallHandle("JPH_VehicleConstraint_GetWheel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalBasis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelWorldTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleConstraint(
        Body body, 
        VehicleConstraintSettings settings
    ) {
        this(
            Arena.ofAuto(),
            body, 
            settings
        );
    }
    
    public VehicleConstraint(
        Arena arena,
        Body body, 
        VehicleConstraintSettings settings
    ) {
         MemorySegment segment = create(
            body.memorySegment(), 
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public VehicleConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment body, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                body, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment asPhysicsStepListener(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void setMaxPitchRollAngle(
        MemorySegment constraint, 
        float maxPitchRollAngle
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE.get();
        try {
            method.invokeExact(
                constraint, 
                maxPitchRollAngle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxPitchRollAngle}.
     */
    public final void setMaxPitchRollAngle(
        float maxPitchRollAngle
    ) {
        setMaxPitchRollAngle(
            this.segment, 
            maxPitchRollAngle
        );
    }
    
    public static void setVehicleCollisionTester(
        MemorySegment constraint, 
        MemorySegment tester
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER.get();
        try {
            method.invokeExact(
                constraint, 
                tester
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setVehicleCollisionTester}.
     */
    public final void setVehicleCollisionTester(
        VehicleCollisionTester tester
    ) {
        setVehicleCollisionTester(
            this.segment, 
            tester.memorySegment()
        );
    }
    
    public static void overrideGravity(
        MemorySegment constraint, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY.get();
        try {
            method.invokeExact(
                constraint, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #overrideGravity}.
     */
    public final void overrideGravity(
        Vec3 value
    ) {
        overrideGravity(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static boolean isGravityOverridden(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN.get();
        try {
            return (boolean) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isGravityOverridden}.
     */
    public final boolean isGravityOverridden(
    ) {
        return (boolean) isGravityOverridden(
            this.segment
        );
    }
    
    public static void getGravityOverride(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGravityOverride}.
     */
    public final void getGravityOverride(
        Vec3 result
    ) {
        getGravityOverride(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void resetGravityOverride(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE.get();
        try {
            method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetGravityOverride}.
     */
    public final void resetGravityOverride(
    ) {
        resetGravityOverride(
            this.segment
        );
    }
    
    public static void getLocalForward(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLocalForward}.
     */
    public final void getLocalForward(
        Vec3 result
    ) {
        getLocalForward(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalUp(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLocalUp}.
     */
    public final void getLocalUp(
        Vec3 result
    ) {
        getLocalUp(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getWorldUp(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldUp}.
     */
    public final void getWorldUp(
        Vec3 result
    ) {
        getWorldUp(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static MemorySegment getVehicleBody(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVehicleBody}.
     */
    public final @Nullable Body getVehicleBody(
    ) {
        MemorySegment segment = getVehicleBody(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment getController(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getController}.
     */
    public final @Nullable VehicleController getController(
    ) {
        MemorySegment segment = getController(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleController(segment);
    }
    
    public static int getWheelsCount(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelsCount}.
     */
    public final int getWheelsCount(
    ) {
        return (int) getWheelsCount(
            this.segment
        );
    }
    
    public static MemorySegment getWheel(
        MemorySegment constraint, 
        int index
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheel}.
     */
    public final @Nullable Wheel getWheel(
        int index
    ) {
        MemorySegment segment = getWheel(
            this.segment, 
            index
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Wheel(segment);
    }
    
    public static void getWheelLocalBasis(
        MemorySegment constraint, 
        MemorySegment wheel, 
        MemorySegment outForward, 
        MemorySegment outUp, 
        MemorySegment outRight
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS.get();
        try {
            method.invokeExact(
                constraint, 
                wheel, 
                outForward, 
                outUp, 
                outRight
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelLocalBasis}.
     */
    public final void getWheelLocalBasis(
        Wheel wheel, 
        Vec3 outForward, 
        Vec3 outUp, 
        Vec3 outRight
    ) {
        getWheelLocalBasis(
            this.segment, 
            wheel.memorySegment(), 
            outForward.memorySegment(), 
            outUp.memorySegment(), 
            outRight.memorySegment()
        );
    }
    
    public static void getWheelLocalTransform(
        MemorySegment constraint, 
        int wheelIndex, 
        MemorySegment wheelRight, 
        MemorySegment wheelUp, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM.get();
        try {
            method.invokeExact(
                constraint, 
                wheelIndex, 
                wheelRight, 
                wheelUp, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelLocalTransform}.
     */
    public final void getWheelLocalTransform(
        int wheelIndex, 
        Vec3 wheelRight, 
        Vec3 wheelUp, 
        Mat4 result
    ) {
        getWheelLocalTransform(
            this.segment, 
            wheelIndex, 
            wheelRight.memorySegment(), 
            wheelUp.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getWheelWorldTransform(
        MemorySegment constraint, 
        int wheelIndex, 
        MemorySegment wheelRight, 
        MemorySegment wheelUp, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM.get();
        try {
            method.invokeExact(
                constraint, 
                wheelIndex, 
                wheelRight, 
                wheelUp, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelWorldTransform}.
     */
    public final void getWheelWorldTransform(
        int wheelIndex, 
        Vec3 wheelRight, 
        Vec3 wheelUp, 
        Mat4 result
    ) {
        getWheelWorldTransform(
            this.segment, 
            wheelIndex, 
            wheelRight.memorySegment(), 
            wheelUp.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}