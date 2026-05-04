/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class MutableCompoundShape extends CompoundShape {

    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2;
    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MUTABLE_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_MutableCompoundShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE = downcallHandle("JPH_MutableCompoundShape_AddShape", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_RemoveShape", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2 = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS = downcallHandleVoid("JPH_MutableCompoundShape_AdjustCenterOfMass", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public MutableCompoundShape(
        MutableCompoundShapeSettings settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    public MutableCompoundShape(
        Arena arena,
        MutableCompoundShapeSettings settings
    ) {
         MemorySegment segment = create(
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public MutableCompoundShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int addShape(
        MemorySegment shape, 
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment child, 
        int userData, 
        int index
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE.get();
        try {
            return (int) method.invokeExact(
                shape, 
                position, 
                rotation, 
                child, 
                userData, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addShape}.
     */
    public final int addShape(
        Vec3 position, 
        Quat rotation, 
        Shape child, 
        int userData, 
        int index
    ) {
        return (int) addShape(
            this.segment, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            child.memorySegment(), 
            userData, 
            index
        );
    }
    
    public static void removeShape(
        MemorySegment shape, 
        int index
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE.get();
        try {
            method.invokeExact(
                shape, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeShape}.
     */
    public final void removeShape(
        int index
    ) {
        removeShape(
            this.segment, 
            index
        );
    }
    
    public static void modifyShape(
        MemorySegment shape, 
        int index, 
        MemorySegment position, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE.get();
        try {
            method.invokeExact(
                shape, 
                index, 
                position, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #modifyShape}.
     */
    public final void modifyShape(
        int index, 
        Vec3 position, 
        Quat rotation
    ) {
        modifyShape(
            this.segment, 
            index, 
            position.memorySegment(), 
            rotation.memorySegment()
        );
    }
    
    public static void modifyShape2(
        MemorySegment shape, 
        int index, 
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment newShape
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2.get();
        try {
            method.invokeExact(
                shape, 
                index, 
                position, 
                rotation, 
                newShape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #modifyShape2}.
     */
    public final void modifyShape2(
        int index, 
        Vec3 position, 
        Quat rotation, 
        Shape newShape
    ) {
        modifyShape2(
            this.segment, 
            index, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            newShape.memorySegment()
        );
    }
    
    public static void adjustCenterOfMass(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS.get();
        try {
            method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #adjustCenterOfMass}.
     */
    public final void adjustCenterOfMass(
    ) {
        adjustCenterOfMass(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}