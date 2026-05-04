/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class Wheel
		permits WheelTV,
		WheelWV {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_ROTATION_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_ROTATION_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_STEER_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_STEER_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_HAS_CONTACT;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_POSITION;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_POINT_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_NORMAL;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_LONGITUDINAL;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_LATERAL;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SUSPENSION_LENGTH;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SUSPENSION_LAMBDA;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_LONGITUDINAL_LAMBDA;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_LATERAL_LAMBDA;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_HAS_HIT_HARD_POINT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEEL_CREATE = downcallHandle("JPH_Wheel_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_DESTROY = downcallHandleVoid("JPH_Wheel_Destroy", UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_SETTINGS = downcallHandle("JPH_Wheel_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_ANGULAR_VELOCITY = downcallHandle("JPH_Wheel_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Wheel_SetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_GET_ROTATION_ANGLE = downcallHandle("JPH_Wheel_GetRotationAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SET_ROTATION_ANGLE = downcallHandleVoid("JPH_Wheel_SetRotationAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_GET_STEER_ANGLE = downcallHandle("JPH_Wheel_GetSteerAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SET_STEER_ANGLE = downcallHandleVoid("JPH_Wheel_SetSteerAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_HAS_CONTACT = downcallHandle("JPH_Wheel_HasContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_BODY_ID = downcallHandle("JPH_Wheel_GetContactBodyID", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID = downcallHandle("JPH_Wheel_GetContactSubShapeID", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_POSITION = downcallHandleVoid("JPH_Wheel_GetContactPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_POINT_VELOCITY = downcallHandleVoid("JPH_Wheel_GetContactPointVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_NORMAL = downcallHandleVoid("JPH_Wheel_GetContactNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_LONGITUDINAL = downcallHandleVoid("JPH_Wheel_GetContactLongitudinal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_CONTACT_LATERAL = downcallHandleVoid("JPH_Wheel_GetContactLateral", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_SUSPENSION_LENGTH = downcallHandle("JPH_Wheel_GetSuspensionLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_SUSPENSION_LAMBDA = downcallHandle("JPH_Wheel_GetSuspensionLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_LONGITUDINAL_LAMBDA = downcallHandle("JPH_Wheel_GetLongitudinalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_GET_LATERAL_LAMBDA = downcallHandle("JPH_Wheel_GetLateralLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_HAS_HIT_HARD_POINT = downcallHandle("JPH_Wheel_HasHitHardPoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public Wheel(
        WheelSettings settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    public Wheel(
        Arena arena,
        WheelSettings settings
    ) {
         MemorySegment segment = create(
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public Wheel(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_DESTROY.get();
        try {
            method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment getSettings(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_SETTINGS.get();
        try {
            return (MemorySegment) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSettings}.
     */
    public @Nullable WheelSettings getSettings(
    ) {
        MemorySegment segment = getSettings(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new WheelSettings(segment);
    }
    
    public static float getAngularVelocity(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_ANGULAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularVelocity}.
     */
    public final float getAngularVelocity(
    ) {
        return (float) getAngularVelocity(
            this.segment
        );
    }
    
    public static void setAngularVelocity(
        MemorySegment wheel, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                wheel, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularVelocity}.
     */
    public final void setAngularVelocity(
        float value
    ) {
        setAngularVelocity(
            this.segment, 
            value
        );
    }
    
    public static float getRotationAngle(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_ROTATION_ANGLE.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotationAngle}.
     */
    public final float getRotationAngle(
    ) {
        return (float) getRotationAngle(
            this.segment
        );
    }
    
    public static void setRotationAngle(
        MemorySegment wheel, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SET_ROTATION_ANGLE.get();
        try {
            method.invokeExact(
                wheel, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRotationAngle}.
     */
    public final void setRotationAngle(
        float value
    ) {
        setRotationAngle(
            this.segment, 
            value
        );
    }
    
    public static float getSteerAngle(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_STEER_ANGLE.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSteerAngle}.
     */
    public final float getSteerAngle(
    ) {
        return (float) getSteerAngle(
            this.segment
        );
    }
    
    public static void setSteerAngle(
        MemorySegment wheel, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SET_STEER_ANGLE.get();
        try {
            method.invokeExact(
                wheel, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setSteerAngle}.
     */
    public final void setSteerAngle(
        float value
    ) {
        setSteerAngle(
            this.segment, 
            value
        );
    }
    
    public static boolean hasContact(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_HAS_CONTACT.get();
        try {
            return (boolean) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasContact}.
     */
    public final boolean hasContact(
    ) {
        return (boolean) hasContact(
            this.segment
        );
    }
    
    public static int getContactBodyID(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_BODY_ID.get();
        try {
            return (int) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactBodyID}.
     */
    public final int getContactBodyID(
    ) {
        return (int) getContactBodyID(
            this.segment
        );
    }
    
    public static int getContactSubShapeID(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID.get();
        try {
            return (int) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactSubShapeID}.
     */
    public final int getContactSubShapeID(
    ) {
        return (int) getContactSubShapeID(
            this.segment
        );
    }
    
    public static void getContactPosition(
        MemorySegment wheel, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_POSITION.get();
        try {
            method.invokeExact(
                wheel, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactPosition}.
     */
    public final void getContactPosition(
        Vec3 result
    ) {
        getContactPosition(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getContactPointVelocity(
        MemorySegment wheel, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_POINT_VELOCITY.get();
        try {
            method.invokeExact(
                wheel, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactPointVelocity}.
     */
    public final void getContactPointVelocity(
        Vec3 result
    ) {
        getContactPointVelocity(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getContactNormal(
        MemorySegment wheel, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_NORMAL.get();
        try {
            method.invokeExact(
                wheel, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactNormal}.
     */
    public final void getContactNormal(
        Vec3 result
    ) {
        getContactNormal(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getContactLongitudinal(
        MemorySegment wheel, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_LONGITUDINAL.get();
        try {
            method.invokeExact(
                wheel, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactLongitudinal}.
     */
    public final void getContactLongitudinal(
        Vec3 result
    ) {
        getContactLongitudinal(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getContactLateral(
        MemorySegment wheel, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEEL_GET_CONTACT_LATERAL.get();
        try {
            method.invokeExact(
                wheel, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getContactLateral}.
     */
    public final void getContactLateral(
        Vec3 result
    ) {
        getContactLateral(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static float getSuspensionLength(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LENGTH.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSuspensionLength}.
     */
    public final float getSuspensionLength(
    ) {
        return (float) getSuspensionLength(
            this.segment
        );
    }
    
    public static float getSuspensionLambda(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LAMBDA.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSuspensionLambda}.
     */
    public final float getSuspensionLambda(
    ) {
        return (float) getSuspensionLambda(
            this.segment
        );
    }
    
    public static float getLongitudinalLambda(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_LONGITUDINAL_LAMBDA.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLongitudinalLambda}.
     */
    public final float getLongitudinalLambda(
    ) {
        return (float) getLongitudinalLambda(
            this.segment
        );
    }
    
    public static float getLateralLambda(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_GET_LATERAL_LAMBDA.get();
        try {
            return (float) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLateralLambda}.
     */
    public final float getLateralLambda(
    ) {
        return (float) getLateralLambda(
            this.segment
        );
    }
    
    public static boolean hasHitHardPoint(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_HAS_HIT_HARD_POINT.get();
        try {
            return (boolean) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasHitHardPoint}.
     */
    public final boolean hasHitHardPoint(
    ) {
        return (boolean) hasHitHardPoint(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}