/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraint.TwoBodyConstraint;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class Ragdoll {

    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ACTIVATE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_IS_ACTIVE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_RESET_WARM_START;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_POSE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_POSE2;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_POSE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_POSE2;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_BODY_COUNT;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_CONSTRAINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_ROOT_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_RAGDOLL_SETTINGS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_RAGDOLL_DESTROY = downcallHandleVoid("JPH_Ragdoll_Destroy", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_AddToPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_RemoveFromPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_ACTIVATE = downcallHandleVoid("JPH_Ragdoll_Activate", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_IS_ACTIVE = downcallHandle("JPH_Ragdoll_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_RESET_WARM_START = downcallHandleVoid("JPH_Ragdoll_ResetWarmStart", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SET_POSE = downcallHandleVoid("JPH_Ragdoll_SetPose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_SET_POSE2 = downcallHandleVoid("JPH_Ragdoll_SetPose2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_GET_POSE = downcallHandleVoid("JPH_Ragdoll_GetPose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_GET_POSE2 = downcallHandleVoid("JPH_Ragdoll_GetPose2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingMotors", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingKinematics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
        JPH_RAGDOLL_GET_BODY_COUNT = downcallHandle("JPH_Ragdoll_GetBodyCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_GET_BODY_ID = downcallHandle("JPH_Ragdoll_GetBodyID", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_RAGDOLL_GET_CONSTRAINT_COUNT = downcallHandle("JPH_Ragdoll_GetConstraintCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_GET_CONSTRAINT = downcallHandle("JPH_Ragdoll_GetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_RAGDOLL_GET_ROOT_TRANSFORM = downcallHandleVoid("JPH_Ragdoll_GetRootTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_RAGDOLL_GET_RAGDOLL_SETTINGS = downcallHandle("JPH_Ragdoll_GetRagdollSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public Ragdoll(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment ragdoll
    ) {
        MethodHandle method = JPH_RAGDOLL_DESTROY.get();
        try {
            method.invokeExact(
                ragdoll
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroy}.
     */
    public final void destroy(
    ) {
        destroy(
            this.segment
        );
    }
    
    public static void addToPhysicsSystem(
        MemorySegment ragdoll, 
        int activationMode, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM.get();
        try {
            method.invokeExact(
                ragdoll, 
                activationMode, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addToPhysicsSystem}.
     */
    public final void addToPhysicsSystem(
        int activationMode, 
        boolean lockBodies
    ) {
        addToPhysicsSystem(
            this.segment, 
            activationMode, 
            lockBodies
        );
    }
    
    public static void removeFromPhysicsSystem(
        MemorySegment ragdoll, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM.get();
        try {
            method.invokeExact(
                ragdoll, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeFromPhysicsSystem}.
     */
    public final void removeFromPhysicsSystem(
        boolean lockBodies
    ) {
        removeFromPhysicsSystem(
            this.segment, 
            lockBodies
        );
    }
    
    public static void activate(
        MemorySegment ragdoll, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_ACTIVATE.get();
        try {
            method.invokeExact(
                ragdoll, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #activate}.
     */
    public final void activate(
        boolean lockBodies
    ) {
        activate(
            this.segment, 
            lockBodies
        );
    }
    
    public static boolean isActive(
        MemorySegment ragdoll, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_IS_ACTIVE.get();
        try {
            return (boolean) method.invokeExact(
                ragdoll, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isActive}.
     */
    public final boolean isActive(
        boolean lockBodies
    ) {
        return (boolean) isActive(
            this.segment, 
            lockBodies
        );
    }
    
    public static void resetWarmStart(
        MemorySegment ragdoll
    ) {
        MethodHandle method = JPH_RAGDOLL_RESET_WARM_START.get();
        try {
            method.invokeExact(
                ragdoll
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetWarmStart}.
     */
    public final void resetWarmStart(
    ) {
        resetWarmStart(
            this.segment
        );
    }
    
    public static void setPose(
        MemorySegment ragdoll, 
        MemorySegment pose, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_SET_POSE.get();
        try {
            method.invokeExact(
                ragdoll, 
                pose, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPose}.
     */
    public final void setPose(
        SkeletonPose pose, 
        boolean lockBodies
    ) {
        setPose(
            this.segment, 
            pose.memorySegment(), 
            lockBodies
        );
    }
    
    public static void setPose2(
        MemorySegment ragdoll, 
        MemorySegment rootOffset, 
        MemorySegment jointMatrices, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_SET_POSE2.get();
        try {
            method.invokeExact(
                ragdoll, 
                rootOffset, 
                jointMatrices, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPose2}.
     */
    public final void setPose2(
        Vec3 rootOffset, 
        Mat4 jointMatrices, 
        boolean lockBodies
    ) {
        setPose2(
            this.segment, 
            rootOffset.memorySegment(), 
            jointMatrices.memorySegment(), 
            lockBodies
        );
    }
    
    public static void getPose(
        MemorySegment ragdoll, 
        MemorySegment outPose, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_POSE.get();
        try {
            method.invokeExact(
                ragdoll, 
                outPose, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPose}.
     */
    public final void getPose(
        SkeletonPose outPose, 
        boolean lockBodies
    ) {
        getPose(
            this.segment, 
            outPose.memorySegment(), 
            lockBodies
        );
    }
    
    public static void getPose2(
        MemorySegment ragdoll, 
        MemorySegment outRootOffset, 
        MemorySegment outJointMatrices, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_POSE2.get();
        try {
            method.invokeExact(
                ragdoll, 
                outRootOffset, 
                outJointMatrices, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPose2}.
     */
    public final void getPose2(
        Vec3 outRootOffset, 
        Mat4 outJointMatrices, 
        boolean lockBodies
    ) {
        getPose2(
            this.segment, 
            outRootOffset.memorySegment(), 
            outJointMatrices.memorySegment(), 
            lockBodies
        );
    }
    
    public static void driveToPoseUsingMotors(
        MemorySegment ragdoll, 
        MemorySegment pose
    ) {
        MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS.get();
        try {
            method.invokeExact(
                ragdoll, 
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #driveToPoseUsingMotors}.
     */
    public final void driveToPoseUsingMotors(
        SkeletonPose pose
    ) {
        driveToPoseUsingMotors(
            this.segment, 
            pose.memorySegment()
        );
    }
    
    public static void driveToPoseUsingKinematics(
        MemorySegment ragdoll, 
        MemorySegment pose, 
        float deltaTime, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS.get();
        try {
            method.invokeExact(
                ragdoll, 
                pose, 
                deltaTime, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #driveToPoseUsingKinematics}.
     */
    public final void driveToPoseUsingKinematics(
        SkeletonPose pose, 
        float deltaTime, 
        boolean lockBodies
    ) {
        driveToPoseUsingKinematics(
            this.segment, 
            pose.memorySegment(), 
            deltaTime, 
            lockBodies
        );
    }
    
    public static int getBodyCount(
        MemorySegment ragdoll
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_BODY_COUNT.get();
        try {
            return (int) method.invokeExact(
                ragdoll
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyCount}.
     */
    public final int getBodyCount(
    ) {
        return (int) getBodyCount(
            this.segment
        );
    }
    
    public static int getBodyID(
        MemorySegment ragdoll, 
        int bodyIndex
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_BODY_ID.get();
        try {
            return (int) method.invokeExact(
                ragdoll, 
                bodyIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyID}.
     */
    public final int getBodyID(
        int bodyIndex
    ) {
        return (int) getBodyID(
            this.segment, 
            bodyIndex
        );
    }
    
    public static int getConstraintCount(
        MemorySegment ragdoll
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                ragdoll
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraintCount}.
     */
    public final int getConstraintCount(
    ) {
        return (int) getConstraintCount(
            this.segment
        );
    }
    
    public static MemorySegment getConstraint(
        MemorySegment ragdoll, 
        int constraintIndex
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT.get();
        try {
            return (MemorySegment) method.invokeExact(
                ragdoll, 
                constraintIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraint}.
     */
    public final @Nullable TwoBodyConstraint getConstraint(
        int constraintIndex
    ) {
        MemorySegment segment = getConstraint(
            this.segment, 
            constraintIndex
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new TwoBodyConstraint(segment);
    }
    
    public static void getRootTransform(
        MemorySegment ragdoll, 
        MemorySegment outPosition, 
        MemorySegment outRotation, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_ROOT_TRANSFORM.get();
        try {
            method.invokeExact(
                ragdoll, 
                outPosition, 
                outRotation, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRootTransform}.
     */
    public final void getRootTransform(
        Vec3 outPosition, 
        Quat outRotation, 
        boolean lockBodies
    ) {
        getRootTransform(
            this.segment, 
            outPosition.memorySegment(), 
            outRotation.memorySegment(), 
            lockBodies
        );
    }
    
    public static MemorySegment getRagdollSettings(
        MemorySegment ragdoll
    ) {
        MethodHandle method = JPH_RAGDOLL_GET_RAGDOLL_SETTINGS.get();
        try {
            return (MemorySegment) method.invokeExact(
                ragdoll
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRagdollSettings}.
     */
    public final @Nullable RagdollSettings getRagdollSettings(
    ) {
        MemorySegment segment = getRagdollSettings(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new RagdollSettings(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}