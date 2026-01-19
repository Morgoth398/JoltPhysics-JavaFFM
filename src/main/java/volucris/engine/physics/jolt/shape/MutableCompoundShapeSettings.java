package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a MutableCompoundShape
 */
public final class MutableCompoundShapeSettings extends CompoundShapeSettings {

	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE;

	static {
		//@formatter:off
		JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MutableCompoundShapeSettings_Create", ADDRESS);
		//@formatter:on
	}

	public MutableCompoundShapeSettings() {
		this(Arena.ofAuto());
	}

	public MutableCompoundShapeSettings(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create MutableCompundShapeSettings: " + className);
		}
		super(segment, arena);
	}

}