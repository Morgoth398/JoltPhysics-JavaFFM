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
public final class TaperedCapsuleShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TaperedCapsuleShapeSettings_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TaperedCapsuleShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TaperedCapsuleShapeSettings(
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius
    ) {
        this(
            Arena.ofAuto(),
            halfHeightOfTaperedCylinder, 
            topRadius, 
            bottomRadius
        );
    }
    
    public TaperedCapsuleShapeSettings(
        Arena arena,
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius
    ) {
         MemorySegment segment = create(
            halfHeightOfTaperedCylinder, 
            topRadius, 
            bottomRadius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public TaperedCapsuleShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius
    ) {
        MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeightOfTaperedCylinder, 
                topRadius, 
                bottomRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable TaperedCapsuleShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new TaperedCapsuleShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}