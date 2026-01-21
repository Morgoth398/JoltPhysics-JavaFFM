package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that constructs a TaperedCapsuleShape.
 */
public final class TaperedCapsuleShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TaperedCapsuleShapeSettings_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TaperedCapsuleShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public TaperedCapsuleShapeSettings(float halfHeightOfCylinder, float topRadius, float bottomRadius) {
		this(halfHeightOfCylinder, topRadius, bottomRadius, Arena.ofAuto());
	}

	public TaperedCapsuleShapeSettings(float halfHeightOfCylinder, float topRadius, float bottomRadius, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeightOfCylinder, topRadius, bottomRadius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create tapered capsule shape settings: " + className);
		}
		super(segment, arena);
	}

	public TaperedCapsuleShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public TaperedCapsuleShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new TaperedCapsuleShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create tapered capsule shape: " + className);
		}
	}

}