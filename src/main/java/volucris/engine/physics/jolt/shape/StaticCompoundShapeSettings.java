package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a StaticCompoundShape. Note that if you only want a
 * compound of 1 shape, use a RotatedTranslatedShape instead.
 */
public final class StaticCompoundShapeSettings extends CompoundShapeSettings {

	private static final MethodHandle JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE;

	static {
		//@formatter:off
		JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_StaticCompoundShapeSettings_Create", ADDRESS);
		//@formatter:on
	}

	public StaticCompoundShapeSettings() {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create MutableCompundShapeSettings.");
		}
		super(segment);
	}

}