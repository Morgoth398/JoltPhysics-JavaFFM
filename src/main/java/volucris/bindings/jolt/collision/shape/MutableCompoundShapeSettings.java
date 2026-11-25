/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class MutableCompoundShapeSettings extends CompoundShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MutableCompoundShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS = downcallHandle("JPH_MutableCompoundShapeSettings_AsCompoundShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MutableCompoundShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MutableCompoundShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MutableCompoundShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCompoundShapeSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCompoundShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_AS_COMPOUND_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}