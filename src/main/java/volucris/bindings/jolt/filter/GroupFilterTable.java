/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.filter;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class GroupFilterTable extends GroupFilter {

    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_GROUP_FILTER_TABLE_CREATE = downcallHandle("JPH_GroupFilterTable_Create", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_DisableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_EnableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED = downcallHandle("JPH_GroupFilterTable_IsCollisionEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    public GroupFilterTable(
        int numSubGroups
    ) {
        this(
            Arena.ofAuto(),
            numSubGroups
        );
    }
    
    public GroupFilterTable(
        Arena arena,
        int numSubGroups
    ) {
         MemorySegment segment = create(
            numSubGroups
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public GroupFilterTable(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int numSubGroups
    ) {
        MethodHandle method = JPH_GROUP_FILTER_TABLE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                numSubGroups
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void disableCollision(
        MemorySegment table, 
        int subGroup1, 
        int subGroup2
    ) {
        MethodHandle method = JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION.get();
        try {
            method.invokeExact(
                table, 
                subGroup1, 
                subGroup2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #disableCollision}.
     */
    public final void disableCollision(
        int subGroup1, 
        int subGroup2
    ) {
        disableCollision(
            this.segment, 
            subGroup1, 
            subGroup2
        );
    }
    
    public static void enableCollision(
        MemorySegment table, 
        int subGroup1, 
        int subGroup2
    ) {
        MethodHandle method = JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION.get();
        try {
            method.invokeExact(
                table, 
                subGroup1, 
                subGroup2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #enableCollision}.
     */
    public final void enableCollision(
        int subGroup1, 
        int subGroup2
    ) {
        enableCollision(
            this.segment, 
            subGroup1, 
            subGroup2
        );
    }
    
    public static boolean isCollisionEnabled(
        MemorySegment table, 
        int subGroup1, 
        int subGroup2
    ) {
        MethodHandle method = JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED.get();
        try {
            return (boolean) method.invokeExact(
                table, 
                subGroup1, 
                subGroup2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isCollisionEnabled}.
     */
    public final boolean isCollisionEnabled(
        int subGroup1, 
        int subGroup2
    ) {
        return (boolean) isCollisionEnabled(
            this.segment, 
            subGroup1, 
            subGroup2
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}