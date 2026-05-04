/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

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
public final class SphereShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SPHERE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_SphereShapeSettings_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_SphereShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS = downcallHandle("JPH_SphereShapeSettings_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_SphereShapeSettings_SetRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public SphereShapeSettings(
        float radius
    ) {
        this(
            Arena.ofAuto(),
            radius
        );
    }
    
    public SphereShapeSettings(
        Arena arena,
        float radius
    ) {
         MemorySegment segment = create(
            radius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public SphereShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float radius
    ) {
        MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                radius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createShape}.
     */
    public final @Nullable SphereShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new SphereShape(segment);
    }
    
    public static float getRadius(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRadius}.
     */
    public final float getRadius(
    ) {
        return (float) getRadius(
            this.segment
        );
    }
    
    public static void setRadius(
        MemorySegment settings, 
        float radius
    ) {
        MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS.get();
        try {
            method.invokeExact(
                settings, 
                radius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRadius}.
     */
    public final void setRadius(
        float radius
    ) {
        setRadius(
            this.segment, 
            radius
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}