/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class Skeleton {

    private static final LazyConstant<MethodHandle> JPH_SKELETON_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_ADD_JOINT;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_ADD_JOINT2;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_ADD_JOINT3;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT_INDEX;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SKELETON_CREATE = downcallHandle("JPH_Skeleton_Create", UNBOUNDED_ADDRESS);
        JPH_SKELETON_DESTROY = downcallHandleVoid("JPH_Skeleton_Destroy", UNBOUNDED_ADDRESS);
        JPH_SKELETON_ADD_JOINT = downcallHandle("JPH_Skeleton_AddJoint", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_ADD_JOINT2 = downcallHandle("JPH_Skeleton_AddJoint2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SKELETON_ADD_JOINT3 = downcallHandle("JPH_Skeleton_AddJoint3", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_GET_JOINT_COUNT = downcallHandle("JPH_Skeleton_GetJointCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETON_GET_JOINT = downcallHandleVoid("JPH_Skeleton_GetJoint", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETON_GET_JOINT_INDEX = downcallHandle("JPH_Skeleton_GetJointIndex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES = downcallHandleVoid("JPH_Skeleton_CalculateParentJointIndices", UNBOUNDED_ADDRESS);
        JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED = downcallHandle("JPH_Skeleton_AreJointsCorrectlyOrdered", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public Skeleton() {
        this(Arena.ofAuto());
    }
    
    public Skeleton(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public Skeleton(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_SKELETON_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_SKELETON_DESTROY.get();
        try {
            method.invokeExact(
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int addJoint(
        MemorySegment skeleton, 
        MemorySegment name
    ) {
        MethodHandle method = JPH_SKELETON_ADD_JOINT.get();
        try {
            return (int) method.invokeExact(
                skeleton, 
                name
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addJoint}.
     */
    public final int addJoint(
        String name
    ) {
        try (Arena arena = Arena.ofConfined()) {
            return (int) addJoint(
                this.segment, 
                arena.allocateFrom(name)
            );
        }
    }
    
    public static int addJoint2(
        MemorySegment skeleton, 
        MemorySegment name, 
        int parentIndex
    ) {
        MethodHandle method = JPH_SKELETON_ADD_JOINT2.get();
        try {
            return (int) method.invokeExact(
                skeleton, 
                name, 
                parentIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addJoint2}.
     */
    public final int addJoint2(
        String name, 
        int parentIndex
    ) {
        try (Arena arena = Arena.ofConfined()) {
            return (int) addJoint2(
                this.segment, 
                arena.allocateFrom(name), 
                parentIndex
            );
        }
    }
    
    public static int addJoint3(
        MemorySegment skeleton, 
        MemorySegment name, 
        MemorySegment parentName
    ) {
        MethodHandle method = JPH_SKELETON_ADD_JOINT3.get();
        try {
            return (int) method.invokeExact(
                skeleton, 
                name, 
                parentName
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addJoint3}.
     */
    public final int addJoint3(
        String name, 
        String parentName
    ) {
        try (Arena arena = Arena.ofConfined()) {
            return (int) addJoint3(
                this.segment, 
                arena.allocateFrom(name), 
                arena.allocateFrom(parentName)
            );
        }
    }
    
    public static int getJointCount(
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_SKELETON_GET_JOINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getJointCount}.
     */
    public final int getJointCount(
    ) {
        return (int) getJointCount(
            this.segment
        );
    }
    
    public static void getJoint(
        MemorySegment skeleton, 
        int index, 
        MemorySegment joint
    ) {
        MethodHandle method = JPH_SKELETON_GET_JOINT.get();
        try {
            method.invokeExact(
                skeleton, 
                index, 
                joint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getJoint}.
     */
    public final void getJoint(
        int index, 
        SkeletonJoint joint
    ) {
        getJoint(
            this.segment, 
            index, 
            joint.memorySegment()
        );
    }
    
    public static int getJointIndex(
        MemorySegment skeleton, 
        MemorySegment name
    ) {
        MethodHandle method = JPH_SKELETON_GET_JOINT_INDEX.get();
        try {
            return (int) method.invokeExact(
                skeleton, 
                name
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getJointIndex}.
     */
    public final int getJointIndex(
        String name
    ) {
        try (Arena arena = Arena.ofConfined()) {
            return (int) getJointIndex(
                this.segment, 
                arena.allocateFrom(name)
            );
        }
    }
    
    public static void calculateParentJointIndices(
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES.get();
        try {
            method.invokeExact(
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #calculateParentJointIndices}.
     */
    public final void calculateParentJointIndices(
    ) {
        calculateParentJointIndices(
            this.segment
        );
    }
    
    public static boolean areJointsCorrectlyOrdered(
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED.get();
        try {
            return (boolean) method.invokeExact(
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #areJointsCorrectlyOrdered}.
     */
    public final boolean areJointsCorrectlyOrdered(
    ) {
        return (boolean) areJointsCorrectlyOrdered(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}