package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that constructs a SphereShape.
 */
public final class SphereShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_SPHERE_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE;
	private static final MethodHandle JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS;
	private static final MethodHandle JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS;

	static {
		//@formatter:off
		JPH_SPHERE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_SphereShapeSettings_Create", ADDRESS, JAVA_FLOAT);
		JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_SphereShapeSettings_CreateShape", ADDRESS, ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS = downcallHandle("JPH_SphereShapeSettings_GetRadius", JAVA_FLOAT, ADDRESS);
		JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_SphereShapeSettings_SetRadius", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public SphereShapeSettings(float radius) {
		this(radius, Arena.ofAuto());
	}

	public SphereShapeSettings(float radius, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(radius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create sphere shape settings: " + className);
		}
		super(segment, arena);
	}

	public SphereShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public SphereShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new SphereShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create sphere shape: " + className);
		}
	}

	public float getRadius() {
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_GET_RADIUS;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get radius: " + className);
		}
	}

	public void setRadius(float radius) {
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_SETTINGS_SET_RADIUS;
			method.invokeExact(jphShapeSettings, radius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set radius: " + className);
		}
	}

}