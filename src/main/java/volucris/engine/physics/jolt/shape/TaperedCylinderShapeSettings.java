package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a TaperedCylinderShape
 */
public final class TaperedCylinderShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TaperedCylinderShapeSettings_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, ADDRESS, ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TaperedCylinderShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius,
			PhysicsMaterial material) {
		this(halfHeight, topRadius, bottomRadius, material, Arena.ofAuto());
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, PhysicsMaterial material,
			Arena arena) {
		this(halfHeight, topRadius, bottomRadius, 0.05f, material, arena);
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, float convexRadius,
			PhysicsMaterial material) {
		this(halfHeight, topRadius, bottomRadius, convexRadius, material, Arena.ofAuto());
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, float convexRadius,
			PhysicsMaterial material, Arena arena) {
		MemorySegment segment;
		try {

			MemorySegment matAddr = material.memorySegment();

			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeight, topRadius, bottomRadius, convexRadius, matAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create tapered cylinder shape settings: " + className);
		}
		super(segment, arena);
	}

	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius) {
		this(halfHeight, topRadius, bottomRadius, Arena.ofAuto());
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, Arena arena) {
		this(halfHeight, topRadius, bottomRadius, PhysicsSettings.DEFAULT_CONVEX_RADIUS, arena);
	}

	/**
	 * @see #TaperedCylinderShapeSettings(float, float, float, float)
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, float convexRadius) {
		this(halfHeight, topRadius, bottomRadius, convexRadius, Arena.ofAuto());
	}

	/**
	 * Create a tapered cylinder centered around the origin with bottom at (0,
	 * -inHalfHeightOfTaperedCylinder, 0) with radius inBottomRadius and top at (0,
	 * inHalfHeightOfTaperedCylinder, 0) with radius inTopRadius.
	 */
	public TaperedCylinderShapeSettings(float halfHeight, float topRadius, float bottomRadius, float convexRadius,
			Arena arena) {
		MemorySegment segment;
		try {

			MemorySegment matAddr = MemorySegment.NULL;

			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeight, topRadius, bottomRadius, convexRadius, matAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create tapered cylinder shape settings: " + className);
		}
		super(segment, arena);
	}

	public TaperedCylinderShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public TaperedCylinderShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new TaperedCylinderShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape: " + className);
		}
	}

}