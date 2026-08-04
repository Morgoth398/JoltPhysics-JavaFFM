/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class StaticCompoundShape extends CompoundShape {

    private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_STATIC_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_StaticCompoundShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public StaticCompoundShape(
        StaticCompoundShapeSettings settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    /// Typed method of [#create].
    public StaticCompoundShape(
    	Arena arena,
    	StaticCompoundShapeSettings settings
    ) {
    	MemorySegment segment = create(
    		settings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    	super(segment);
    }
    
    public StaticCompoundShape(MemorySegment segment) {
    	this.segment = segment;
    	super(segment);
    }

    public static MemorySegment create(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}