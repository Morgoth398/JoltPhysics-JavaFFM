/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class StaticCompoundShapeSettings extends CompoundShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_StaticCompoundShapeSettings_Create", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public StaticCompoundShapeSettings() {
    	this(Arena.ofAuto());
    }
    
    /// Typed method of [#create].
    public StaticCompoundShapeSettings(Arena arena) {
    	MemorySegment segment = create();
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    	super(segment);
    }
    
    public StaticCompoundShapeSettings(MemorySegment segment) {
    	this.segment = segment;
    	super(segment);
    }

    
    public static MemorySegment create() {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment)  method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}