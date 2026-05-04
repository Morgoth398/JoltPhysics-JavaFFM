/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.filter;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class GroupFilter
		permits GroupFilterTable {

    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_CAN_COLLIDE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_GROUP_FILTER_DESTROY = downcallHandleVoid("JPH_GroupFilter_Destroy", UNBOUNDED_ADDRESS);
        JPH_GROUP_FILTER_CAN_COLLIDE = downcallHandle("JPH_GroupFilter_CanCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public GroupFilter(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment groupFilter
    ) {
        MethodHandle method = JPH_GROUP_FILTER_DESTROY.get();
        try {
            method.invokeExact(
                groupFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean canCollide(
        MemorySegment groupFilter, 
        MemorySegment group1, 
        MemorySegment group2
    ) {
        MethodHandle method = JPH_GROUP_FILTER_CAN_COLLIDE.get();
        try {
            return (boolean) method.invokeExact(
                groupFilter, 
                group1, 
                group2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #canCollide}.
     */
    public final boolean canCollide(
        CollisionGroup group1, 
        CollisionGroup group2
    ) {
        return (boolean) canCollide(
            this.segment, 
            group1.memorySegment(), 
            group2.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}