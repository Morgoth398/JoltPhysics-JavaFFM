package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a CapsuleShape. 
 */
public final class CapsuleShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_CAPSULE_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_CAPSULE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CapsuleShapeSettings_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_CapsuleShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public CapsuleShapeSettings(float halfHeightOfCylinder, float radius) {
		MemorySegment segment;
		try {			
			MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeightOfCylinder, radius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create capsule shape settings.");
		}
		super(segment);
	}

	public CapsuleShape createShape() {
		try {
			MethodHandle method = JPH_CAPSULE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new CapsuleShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create capsule shape.");
		}
	}

}