/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat4;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class SkeletonMapper {

    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_INITIALIZE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAP;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAP_REVERSE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SKELETON_MAPPER_CREATE = downcallHandle("JPH_SkeletonMapper_Create", UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_DESTROY = downcallHandleVoid("JPH_SkeletonMapper_Destroy", UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_INITIALIZE = downcallHandleVoid("JPH_SkeletonMapper_Initialize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockAllTranslations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockTranslations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_MAP = downcallHandleVoid("JPH_SkeletonMapper_Map", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_MAP_REVERSE = downcallHandleVoid("JPH_SkeletonMapper_MapReverse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX = downcallHandle("JPH_SkeletonMapper_GetMappedJointIndex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED = downcallHandle("JPH_SkeletonMapper_IsJointTranslationLocked", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public SkeletonMapper() {
        this(Arena.ofAuto());
    }
    
    public SkeletonMapper(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SkeletonMapper(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_SKELETON_MAPPER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment mapper
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_DESTROY.get();
        try {
            method.invokeExact(
                mapper
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void initialize(
        MemorySegment mapper, 
        MemorySegment skeleton1, 
        MemorySegment neutralPose1, 
        MemorySegment skeleton2, 
        MemorySegment neutralPose2
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_INITIALIZE.get();
        try {
            method.invokeExact(
                mapper, 
                skeleton1, 
                neutralPose1, 
                skeleton2, 
                neutralPose2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #initialize}.
     */
    public final void initialize(
        Skeleton skeleton1, 
        Mat4 neutralPose1, 
        Skeleton skeleton2, 
        Mat4 neutralPose2
    ) {
        initialize(
            this.segment, 
            skeleton1.memorySegment(), 
            neutralPose1.memorySegment(), 
            skeleton2.memorySegment(), 
            neutralPose2.memorySegment()
        );
    }
    
    public static void lockAllTranslations(
        MemorySegment mapper, 
        MemorySegment skeleton2, 
        MemorySegment neutralPose2
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS.get();
        try {
            method.invokeExact(
                mapper, 
                skeleton2, 
                neutralPose2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockAllTranslations}.
     */
    public final void lockAllTranslations(
        Skeleton skeleton2, 
        Mat4 neutralPose2
    ) {
        lockAllTranslations(
            this.segment, 
            skeleton2.memorySegment(), 
            neutralPose2.memorySegment()
        );
    }
    
    public static void lockTranslations(
        MemorySegment mapper, 
        MemorySegment skeleton2, 
        boolean lockedTranslations, 
        MemorySegment neutralPose2
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS.get();
        try {
            method.invokeExact(
                mapper, 
                skeleton2, 
                lockedTranslations, 
                neutralPose2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockTranslations}.
     */
    public final void lockTranslations(
        Skeleton skeleton2, 
        boolean lockedTranslations, 
        Mat4 neutralPose2
    ) {
        lockTranslations(
            this.segment, 
            skeleton2.memorySegment(), 
            lockedTranslations, 
            neutralPose2.memorySegment()
        );
    }
    
    public static void map(
        MemorySegment mapper, 
        MemorySegment pose1ModelSpace, 
        MemorySegment pose2LocalSpace, 
        MemorySegment outPose2ModelSpace
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_MAP.get();
        try {
            method.invokeExact(
                mapper, 
                pose1ModelSpace, 
                pose2LocalSpace, 
                outPose2ModelSpace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #map}.
     */
    public final void map(
        Mat4 pose1ModelSpace, 
        Mat4 pose2LocalSpace, 
        Mat4 outPose2ModelSpace
    ) {
        map(
            this.segment, 
            pose1ModelSpace.memorySegment(), 
            pose2LocalSpace.memorySegment(), 
            outPose2ModelSpace.memorySegment()
        );
    }
    
    public static void mapReverse(
        MemorySegment mapper, 
        MemorySegment pose2ModelSpace, 
        MemorySegment outPose1ModelSpace
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_MAP_REVERSE.get();
        try {
            method.invokeExact(
                mapper, 
                pose2ModelSpace, 
                outPose1ModelSpace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #mapReverse}.
     */
    public final void mapReverse(
        Mat4 pose2ModelSpace, 
        Mat4 outPose1ModelSpace
    ) {
        mapReverse(
            this.segment, 
            pose2ModelSpace.memorySegment(), 
            outPose1ModelSpace.memorySegment()
        );
    }
    
    public static int getMappedJointIndex(
        MemorySegment mapper, 
        int joint1Index
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX.get();
        try {
            return (int) method.invokeExact(
                mapper, 
                joint1Index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMappedJointIndex}.
     */
    public final int getMappedJointIndex(
        int joint1Index
    ) {
        return (int) getMappedJointIndex(
            this.segment, 
            joint1Index
        );
    }
    
    public static boolean isJointTranslationLocked(
        MemorySegment mapper, 
        int joint2Index
    ) {
        MethodHandle method = JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED.get();
        try {
            return (boolean) method.invokeExact(
                mapper, 
                joint2Index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isJointTranslationLocked}.
     */
    public final boolean isJointTranslationLocked(
        int joint2Index
    ) {
        return (boolean) isJointTranslationLocked(
            this.segment, 
            joint2Index
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}