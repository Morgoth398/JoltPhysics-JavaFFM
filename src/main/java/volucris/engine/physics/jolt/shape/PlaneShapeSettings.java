package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
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
		this(plane, material, Arena.ofAuto());
	}
	
	public PlaneShapeSettings(Plane plane, PhysicsMaterial material, Arena arena) {
		this(plane, material, 1000.0f, arena);
	}

	public PlaneShapeSettings(Plane plane, PhysicsMaterial material, float halfExtent) {
		this(plane, material, halfExtent, Arena.ofAuto());
	}
	
	public PlaneShapeSettings(Plane plane, PhysicsMaterial material, float halfExtent, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment matAddr = material.memorySegment();

			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(plane.memorySegment(), matAddr, halfExtent);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create plane shape settings.");
		}
		super(segment, arena);
	}

	public PlaneShapeSettings(Plane plane) {
		this(plane, Arena.ofAuto());
	}
	
	public PlaneShapeSettings(Plane plane, Arena arena) {
		this(plane, 1000.0f, arena);
	}

	public PlaneShapeSettings(Plane plane, float halfExtent) {
		this(plane, halfExtent, Arena.ofAuto());
	}
	
	public PlaneShapeSettings(Plane plane, float halfExtent, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment matAddr = MemorySegment.NULL;

			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(plane.memorySegment(), matAddr, halfExtent);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create plane shape settings.");
		}
		super(segment, arena);
	}

	public PlaneShape createShape() {
		return createShape(Arena.ofAuto());
	}
	
	public PlaneShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new PlaneShape(segment, arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}