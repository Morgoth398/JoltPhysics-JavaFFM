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
public final class MutableCompoundShapeSettings extends CompoundShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MutableCompoundShapeSettings_Create", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public MutableCompoundShapeSettings() {
        this(Arena.ofAuto());
    }
    
    public MutableCompoundShapeSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public MutableCompoundShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}