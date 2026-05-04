/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraint.SwingTwistConstraintSettings;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physicsSystem.PhysicsSystem;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class RagdollSettings {

    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_SKELETON;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_SKELETON;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_STABILIZE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_RESIZE_PARTS;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_PART_COUNT;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_POSITION;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_MOTION_TYPE;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_MASS_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PART_TO_PARENT;
    private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_RAGDOLL_SETTINGS_CREATE = downcallHandle("JPH_RagdollSettings_Create", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_DESTROY = downcallHandleVoid("JPH_RagdollSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_GET_SKELETON = downcallHandle("JPH_RagdollSettings_GetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_SET_SKELETON = downcallHandleVoid("JPH_RagdollSettings_SetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_STABILIZE = downcallHandle("JPH_RagdollSettings_Stabilize", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS = downcallHandleVoid("JPH_RagdollSettings_DisableParentChildCollisions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX = downcallHandleVoid("JPH_RagdollSettings_CalculateBodyIndexToConstraintIndex", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX = downcallHandle("JPH_RagdollSettings_GetConstraintIndexForBodyIndex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR = downcallHandleVoid("JPH_RagdollSettings_CalculateConstraintIndexToBodyIdxPair", UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_RESIZE_PARTS = downcallHandleVoid("JPH_RagdollSettings_ResizeParts", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_RAGDOLL_SETTINGS_GET_PART_COUNT = downcallHandle("JPH_RagdollSettings_GetPartCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_SET_PART_SHAPE = downcallHandleVoid("JPH_RagdollSettings_SetPartShape", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_SET_PART_POSITION = downcallHandleVoid("JPH_RagdollSettings_SetPartPosition", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_SET_PART_ROTATION = downcallHandleVoid("JPH_RagdollSettings_SetPartRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_SET_PART_MOTION_TYPE = downcallHandleVoid("JPH_RagdollSettings_SetPartMotionType", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_RAGDOLL_SETTINGS_SET_PART_OBJECT_LAYER = downcallHandleVoid("JPH_RagdollSettings_SetPartObjectLayer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_RAGDOLL_SETTINGS_SET_PART_MASS_PROPERTIES = downcallHandleVoid("JPH_RagdollSettings_SetPartMassProperties", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_RAGDOLL_SETTINGS_SET_PART_TO_PARENT = downcallHandleVoid("JPH_RagdollSettings_SetPartToParent", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL = downcallHandle("JPH_RagdollSettings_CreateRagdoll", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
        //@formatter:on
    }

    public RagdollSettings() {
        this(Arena.ofAuto());
    }
    
    public RagdollSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public RagdollSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment getSkeleton(
        MemorySegment character
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_SKELETON.get();
        try {
            return (MemorySegment) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSkeleton}.
     */
    public final @Nullable Skeleton getSkeleton(
        RagdollSettings character
    ) {
        MemorySegment segment = getSkeleton(
            character.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Skeleton(segment);
    }
    
    public static void setSkeleton(
        MemorySegment character, 
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_SKELETON.get();
        try {
            method.invokeExact(
                character, 
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setSkeleton}.
     */
    public final void setSkeleton(
        RagdollSettings character, 
        Skeleton skeleton
    ) {
        setSkeleton(
            character.memorySegment(), 
            skeleton.memorySegment()
        );
    }
    
    public static boolean stabilize(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_STABILIZE.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #stabilize}.
     */
    public final boolean stabilize(
        RagdollSettings settings
    ) {
        return (boolean) stabilize(
            settings.memorySegment()
        );
    }
    
    public static void disableParentChildCollisions(
        MemorySegment settings, 
        MemorySegment jointMatrices, 
        float minSeparationDistance
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS.get();
        try {
            method.invokeExact(
                settings, 
                jointMatrices, 
                minSeparationDistance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #disableParentChildCollisions}.
     */
    public final void disableParentChildCollisions(
        RagdollSettings settings, 
        Mat4 jointMatrices, 
        float minSeparationDistance
    ) {
        disableParentChildCollisions(
            settings.memorySegment(), 
            jointMatrices.memorySegment(), 
            minSeparationDistance
        );
    }
    
    public static void calculateBodyIndexToConstraintIndex(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #calculateBodyIndexToConstraintIndex}.
     */
    public final void calculateBodyIndexToConstraintIndex(
        RagdollSettings settings
    ) {
        calculateBodyIndexToConstraintIndex(
            settings.memorySegment()
        );
    }
    
    public static int getConstraintIndexForBodyIndex(
        MemorySegment settings, 
        int bodyIndex
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX.get();
        try {
            return (int) method.invokeExact(
                settings, 
                bodyIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraintIndexForBodyIndex}.
     */
    public final int getConstraintIndexForBodyIndex(
        RagdollSettings settings, 
        int bodyIndex
    ) {
        return (int) getConstraintIndexForBodyIndex(
            settings.memorySegment(), 
            bodyIndex
        );
    }
    
    public static void calculateConstraintIndexToBodyIdxPair(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #calculateConstraintIndexToBodyIdxPair}.
     */
    public final void calculateConstraintIndexToBodyIdxPair(
        RagdollSettings settings
    ) {
        calculateConstraintIndexToBodyIdxPair(
            settings.memorySegment()
        );
    }
    
    public static void resizeParts(
        MemorySegment settings, 
        int count
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_RESIZE_PARTS.get();
        try {
            method.invokeExact(
                settings, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resizeParts}.
     */
    public final void resizeParts(
        RagdollSettings settings, 
        int count
    ) {
        resizeParts(
            settings.memorySegment(), 
            count
        );
    }
    
    public static int getPartCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_PART_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPartCount}.
     */
    public final int getPartCount(
        RagdollSettings settings
    ) {
        return (int) getPartCount(
            settings.memorySegment()
        );
    }
    
    public static void setPartShape(
        MemorySegment settings, 
        int partIndex, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_SHAPE.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartShape}.
     */
    public final void setPartShape(
        RagdollSettings settings, 
        int partIndex, 
        Shape shape
    ) {
        setPartShape(
            settings.memorySegment(), 
            partIndex, 
            shape.memorySegment()
        );
    }
    
    public static void setPartPosition(
        MemorySegment settings, 
        int partIndex, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_POSITION.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartPosition}.
     */
    public final void setPartPosition(
        RagdollSettings settings, 
        int partIndex, 
        Vec3 position
    ) {
        setPartPosition(
            settings.memorySegment(), 
            partIndex, 
            position.memorySegment()
        );
    }
    
    public static void setPartRotation(
        MemorySegment settings, 
        int partIndex, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_ROTATION.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartRotation}.
     */
    public final void setPartRotation(
        RagdollSettings settings, 
        int partIndex, 
        Quat rotation
    ) {
        setPartRotation(
            settings.memorySegment(), 
            partIndex, 
            rotation.memorySegment()
        );
    }
    
    public static void setPartMotionType(
        MemorySegment settings, 
        int partIndex, 
        int motionType
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_MOTION_TYPE.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                motionType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartMotionType}.
     */
    public final void setPartMotionType(
        RagdollSettings settings, 
        int partIndex, 
        int motionType
    ) {
        setPartMotionType(
            settings.memorySegment(), 
            partIndex, 
            motionType
        );
    }
    
    public static void setPartObjectLayer(
        MemorySegment settings, 
        int partIndex, 
        int layer
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_OBJECT_LAYER.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                layer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartObjectLayer}.
     */
    public final void setPartObjectLayer(
        RagdollSettings settings, 
        int partIndex, 
        int layer
    ) {
        setPartObjectLayer(
            settings.memorySegment(), 
            partIndex, 
            layer
        );
    }
    
    public static void setPartMassProperties(
        MemorySegment settings, 
        int partIndex, 
        float mass
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_MASS_PROPERTIES.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                mass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartMassProperties}.
     */
    public final void setPartMassProperties(
        RagdollSettings settings, 
        int partIndex, 
        float mass
    ) {
        setPartMassProperties(
            settings.memorySegment(), 
            partIndex, 
            mass
        );
    }
    
    public static void setPartToParent(
        MemorySegment settings, 
        int partIndex, 
        MemorySegment constraintSettings
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PART_TO_PARENT.get();
        try {
            method.invokeExact(
                settings, 
                partIndex, 
                constraintSettings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPartToParent}.
     */
    public final void setPartToParent(
        RagdollSettings settings, 
        int partIndex, 
        SwingTwistConstraintSettings constraintSettings
    ) {
        setPartToParent(
            settings.memorySegment(), 
            partIndex, 
            constraintSettings.memorySegment()
        );
    }
    
    public static MemorySegment createRagdoll(
        MemorySegment settings, 
        MemorySegment system, 
        int collisionGroup, 
        long userData
    ) {
        MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings, 
                system, 
                collisionGroup, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createRagdoll}.
     */
    public final @Nullable Ragdoll createRagdoll(
        RagdollSettings settings, 
        PhysicsSystem system, 
        int collisionGroup, 
        long userData
    ) {
        MemorySegment segment = createRagdoll(
            settings.memorySegment(), 
            system.memorySegment(), 
            collisionGroup, 
            userData
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Ragdoll(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}