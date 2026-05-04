package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A compound shape, sub shapes can be rotated and translated. Sub shapes cannot
 * be modified once the shape is constructed. Shifts all child objects so that
 * they're centered around the center of mass.
 */
public final class StaticCompoundShape extends CompoundShape {

	private static final MethodHandle JPH_STATIC_COMPOUND_SHAPE_CREATE;

	static {
		//@formatter:off
		JPH_STATIC_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_StaticCompoundShape_Create", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected StaticCompoundShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected StaticCompoundShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public StaticCompoundShape(StaticCompoundShapeSettings settings) {
		this(settings, Arena.ofAuto());
	}

	public StaticCompoundShape(StaticCompoundShapeSettings settings, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(settings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create static compound shape: " + className);
		}
		super(segment, arena);
	}

}