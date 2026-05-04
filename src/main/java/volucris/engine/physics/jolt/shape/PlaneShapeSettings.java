package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a PlaneShape
 */
public final class PlaneShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_PLANE_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_PLANE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_PlaneShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_PlaneShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public PlaneShapeSettings(Plane plane, PhysicsMaterial material) {
		this(plane, material, 1000.0f);
	}

	public PlaneShapeSettings(Plane plane, PhysicsMaterial material, float halfExtent) {
		MemorySegment segment;
		try {
			MemorySegment matAddr = material.memorySegment();

			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(plane.memorySegment(), matAddr, halfExtent);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create plane shape settings.");
		}
		super(segment);
	}

	public PlaneShapeSettings(Plane plane) {
		this(plane, 1000.0f);
	}

	public PlaneShapeSettings(Plane plane, float halfExtent) {
		MemorySegment segment;
		try {
			MemorySegment matAddr = MemorySegment.NULL;

			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(plane.memorySegment(), matAddr, halfExtent);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create plane shape settings.");
		}
		super(segment);
	}

	public PlaneShape createShape() {
		try {
			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new PlaneShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}