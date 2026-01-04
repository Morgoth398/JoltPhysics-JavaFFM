package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a CylinderShape
 */
public final class CylinderShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_CYLINDER_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_CYLINDER_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CylinderShapeSettings_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_CylinderShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	/**
	 * @see #CylinderShapeSettings(float, float, float, Arena)
	 */
	public CylinderShapeSettings(float halfHeight, float radius) {
		this(halfHeight, radius, Arena.ofAuto());
	}
	
	/**
	 * @see #CylinderShapeSettings(float, float, float, Arena)
	 */
	public CylinderShapeSettings(float halfHeight, float radius, Arena arena) {
		this(halfHeight, radius, PhysicsSettings.DEFAULT_CONVEX_RADIUS, arena);
	}

	/**
	 * @see #CylinderShapeSettings(float, float, float, Arena)
	 */
	public CylinderShapeSettings(float halfHeight, float radius, float convexRadius) {
		this(halfHeight, radius, convexRadius, Arena.ofAuto());
	}
	
	/**
	 * Create a shape centered around the origin with one top at (0, -inHalfHeight,
	 * 0) and the other at (0, inHalfHeight, 0) and radius inRadius. (internally the
	 * convex radius will be subtracted from the cylinder the total cylinder will
	 * not grow with the convex radius, but the edges of the cylinder will be
	 * rounded a bit).
	 */
	public CylinderShapeSettings(float halfHeight, float radius, float convexRadius, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeight, radius, convexRadius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create cylinder shape settings.");
		}
		super(segment, arena);
	}

	public CylinderShape createShape() {
		return createShape(Arena.ofAuto());
	}
	
	public CylinderShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new CylinderShape(segment, arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}