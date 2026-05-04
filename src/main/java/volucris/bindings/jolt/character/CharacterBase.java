/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class CharacterBase
		permits Character,
		CharacterVirtual {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_UP;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SET_UP;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_STATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_IS_SUPPORTED;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_NORMAL;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_MATERIAL;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_USER_DATA;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CHARACTER_BASE_DESTROY = downcallHandleVoid("JPH_CharacterBase_Destroy", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE = downcallHandle("JPH_CharacterBase_GetCosMaxSlopeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE = downcallHandleVoid("JPH_CharacterBase_SetMaxSlopeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CHARACTER_BASE_GET_UP = downcallHandleVoid("JPH_CharacterBase_GetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_SET_UP = downcallHandleVoid("JPH_CharacterBase_SetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP = downcallHandle("JPH_CharacterBase_IsSlopeTooSteep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_SHAPE = downcallHandle("JPH_CharacterBase_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_STATE = downcallHandle("JPH_CharacterBase_GetGroundState", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_IS_SUPPORTED = downcallHandle("JPH_CharacterBase_IsSupported", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_POSITION = downcallHandleVoid("JPH_CharacterBase_GetGroundPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_NORMAL = downcallHandleVoid("JPH_CharacterBase_GetGroundNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterBase_GetGroundVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_MATERIAL = downcallHandle("JPH_CharacterBase_GetGroundMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_BODY_ID = downcallHandle("JPH_CharacterBase_GetGroundBodyId", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID = downcallHandle("JPH_CharacterBase_GetGroundSubShapeId", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_BASE_GET_GROUND_USER_DATA = downcallHandle("JPH_CharacterBase_GetGroundUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CharacterBase(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_DESTROY.get();
        try {
            method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getCosMaxSlopeAngle(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCosMaxSlopeAngle}.
     */
    public final float getCosMaxSlopeAngle(
    ) {
        return (float) getCosMaxSlopeAngle(
            this.segment
        );
    }
    
    public static void setMaxSlopeAngle(
        MemorySegment character, 
        float maxSlopeAngle
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE.get();
        try {
            method.invokeExact(
                character, 
                maxSlopeAngle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxSlopeAngle}.
     */
    public final void setMaxSlopeAngle(
        float maxSlopeAngle
    ) {
        setMaxSlopeAngle(
            this.segment, 
            maxSlopeAngle
        );
    }
    
    public static void getUp(
        MemorySegment character, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_UP.get();
        try {
            method.invokeExact(
                character, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUp}.
     */
    public final void getUp(
        Vec3 result
    ) {
        getUp(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setUp(
        MemorySegment character, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_SET_UP.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUp}.
     */
    public final void setUp(
        Vec3 value
    ) {
        setUp(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static boolean isSlopeTooSteep(
        MemorySegment character, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSlopeTooSteep}.
     */
    public final boolean isSlopeTooSteep(
        Vec3 value
    ) {
        return (boolean) isSlopeTooSteep(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static MemorySegment getShape(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShape}.
     */
    public final @Nullable Shape getShape(
    ) {
        MemorySegment segment = getShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public static int getGroundState(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_STATE.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundState}.
     */
    public final int getGroundState(
    ) {
        return (int) getGroundState(
            this.segment
        );
    }
    
    public static boolean isSupported(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_IS_SUPPORTED.get();
        try {
            return (boolean) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSupported}.
     */
    public final boolean isSupported(
    ) {
        return (boolean) isSupported(
            this.segment
        );
    }
    
    public static void getGroundPosition(
        MemorySegment character, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_POSITION.get();
        try {
            method.invokeExact(
                character, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundPosition}.
     */
    public final void getGroundPosition(
        Vec3 position
    ) {
        getGroundPosition(
            this.segment, 
            position.memorySegment()
        );
    }
    
    public static void getGroundNormal(
        MemorySegment character, 
        MemorySegment normal
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_NORMAL.get();
        try {
            method.invokeExact(
                character, 
                normal
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundNormal}.
     */
    public final void getGroundNormal(
        Vec3 normal
    ) {
        getGroundNormal(
            this.segment, 
            normal.memorySegment()
        );
    }
    
    public static void getGroundVelocity(
        MemorySegment character, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundVelocity}.
     */
    public final void getGroundVelocity(
        Vec3 velocity
    ) {
        getGroundVelocity(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static MemorySegment getGroundMaterial(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_MATERIAL.get();
        try {
            return (MemorySegment) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundMaterial}.
     */
    public final @Nullable PhysicsMaterial getGroundMaterial(
    ) {
        MemorySegment segment = getGroundMaterial(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsMaterial(segment);
    }
    
    public static int getGroundBodyId(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_BODY_ID.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundBodyId}.
     */
    public final int getGroundBodyId(
    ) {
        return (int) getGroundBodyId(
            this.segment
        );
    }
    
    public static int getGroundSubShapeId(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundSubShapeId}.
     */
    public final int getGroundSubShapeId(
    ) {
        return (int) getGroundSubShapeId(
            this.segment
        );
    }
    
    public static long getGroundUserData(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGroundUserData}.
     */
    public final long getGroundUserData(
    ) {
        return (long) getGroundUserData(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}