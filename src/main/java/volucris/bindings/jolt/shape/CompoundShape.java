/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class CompoundShape extends Shape
		permits MutableCompoundShape,
		StaticCompoundShape {

    private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES;
    private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES = downcallHandle("JPH_CompoundShape_GetNumSubShapes", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_COMPOUND_SHAPE_GET_SUB_SHAPE = downcallHandleVoid("JPH_CompoundShape_GetSubShape", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID = downcallHandle("JPH_CompoundShape_GetSubShapeIndexFromID", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CompoundShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static int getNumSubShapes(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumSubShapes}.
     */
    public final int getNumSubShapes(
    ) {
        return (int) getNumSubShapes(
            this.segment
        );
    }
    
    public static void getSubShape(
        MemorySegment shape, 
        int index, 
        MemorySegment subShape, 
        MemorySegment positionCOM, 
        MemorySegment rotation, 
        MemorySegment userData
    ) {
        MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE.get();
        try {
            method.invokeExact(
                shape, 
                index, 
                subShape, 
                positionCOM, 
                rotation, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubShape}.
     */
    public final void getSubShape(
        int index, 
        NativePointerArray subShape, 
        Vec3 positionCOM, 
        Quat rotation, 
        NativeIntArray userData
    ) {
        getSubShape(
            this.segment, 
            index, 
            subShape.memorySegment(), 
            positionCOM.memorySegment(), 
            rotation.memorySegment(), 
            userData.memorySegment()
        );
    }
    
    public static int getSubShapeIndexFromID(
        MemorySegment shape, 
        int id, 
        MemorySegment remainder
    ) {
        MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID.get();
        try {
            return (int) method.invokeExact(
                shape, 
                id, 
                remainder
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubShapeIndexFromID}.
     */
    public final int getSubShapeIndexFromID(
        int id, 
        NativeIntArray remainder
    ) {
        return (int) getSubShapeIndexFromID(
            this.segment, 
            id, 
            remainder.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}