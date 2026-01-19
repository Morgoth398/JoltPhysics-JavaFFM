package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a ConvexShape
 */
public sealed class ConvexShapeSettings extends ShapeSettings
		permits BoxShapeSettings, CapsuleShapeSettings, ConvexHullShapeSettings, CylinderShapeSettings,
		SphereShapeSettings, TaperedCapsuleShapeSettings, TaperedCylinderShapeSettings, TriangleShapeSettings {

	private static final MethodHandle JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY;
	private static final MethodHandle JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY;

	static {
		//@formatter:off
		JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY = downcallHandle("JPH_ConvexShapeSettings_GetDensity", JAVA_FLOAT, ADDRESS);
		JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY = downcallHandleVoid("JPH_ConvexShapeSettings_SetDensity", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected ConvexShapeSettings(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected ConvexShapeSettings(MemorySegment segment, Arena arena) {
		super(segment, arena);
	}

	public float getDensity() {
		try {
			MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get density: " + className);
		}
	}

	/**
	 * Set the density of the object in kg / m^3. y
	 */
	public void setDensity(float density) {
		try {
			MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY;
			method.invokeExact(jphShapeSettings, density);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set density: " + className);
		}
	}

}