/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class EmptyShape extends Shape {


    private final MemorySegment segment;

    static {
        //@formatter:off
        //@formatter:on
    }

    public EmptyShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public MemorySegment memorySegment() {
    	return segment;
    }
    
}