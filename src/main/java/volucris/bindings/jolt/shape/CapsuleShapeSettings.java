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
public final class CapsuleShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CapsuleShapeSettings_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_CapsuleShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CapsuleShapeSettings(
        float halfHeightOfCylinder, 
        float radius
    ) {
        this(
            Arena.ofAuto(),
            halfHeightOfCylinder, 
            radius
        );
    }
    
    public CapsuleShapeSettings(
        Arena arena,
        float halfHeightOfCylinder, 
        float radius
    ) {
         MemorySegment segment = create(
            halfHeightOfCylinder, 
            radius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public CapsuleShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeightOfCylinder, 
        float radius
    ) {
        MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeightOfCylinder, 
                radius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable CapsuleShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new CapsuleShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}