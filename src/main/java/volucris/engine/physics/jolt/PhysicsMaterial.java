package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * This structure describes the surface of (part of) a shape. You should inherit
 * from it to define additional information that is interesting for the
 * simulation. The 2 materials involved in a contact could be used to decide
 * which sound or particle effects to play.
 * <p>
 * If you inherit from this material, don't forget to create a suitable default
 * material in sDefault
 */
public final class PhysicsMaterial {

	private static final MethodHandle JPH_PHYSICS_MATERIAL_CREATE;
	private static final MethodHandle JPH_PHYSICS_MATERIAL_DESTROY;
	private static final MethodHandle JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME;
	private static final MethodHandle JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR;

	private final MemorySegment jphPhysicsMaterial;

	static {
		//@formatter:off
		JPH_PHYSICS_MATERIAL_CREATE = downcallHandle("JPH_PhysicsMaterial_Create", ADDRESS, ADDRESS, JAVA_INT);
		JPH_PHYSICS_MATERIAL_DESTROY = downcallHandleVoid("JPH_PhysicsMaterial_Destroy", ADDRESS);
		JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME = downcallHandle("JPH_PhysicsMaterial_GetDebugName", ADDRESS, ADDRESS);
		JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR = downcallHandle("JPH_PhysicsMaterial_GetDebugColor", JAVA_INT, ADDRESS);
		//@formatter:on
	}

	public PhysicsMaterial(MemorySegment segment) {
		jphPhysicsMaterial = segment;

		Jolt.addMaterial(segment.address(), this);
	}

	public PhysicsMaterial(String name, int color) {
		this(name, color, Arena.ofAuto());
	}

	public PhysicsMaterial(String name, int color, Arena arena) {
		try (Arena confinedArena = Arena.ofConfined()) {
			MemorySegment string = confinedArena.allocateFrom(name);

			MethodHandle method = JPH_PHYSICS_MATERIAL_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(string, color);
			jphPhysicsMaterial = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create physics material: " + className);
		}

		Jolt.addMaterial(jphPhysicsMaterial.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_PHYSICS_MATERIAL_DESTROY;
			method.invokeExact(segment);

			Jolt.removeMaterial(segment.address());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy physics material: " + className);
		}
	}

	public String getDebugName() {
		try {
			MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsMaterial);
			return (String) segment.reinterpret(Integer.MAX_VALUE).getString(0);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get debug name: " + className);
		}
	}

	public int getDebugColor() {
		try {
			MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR;
			return (int) method.invokeExact(jphPhysicsMaterial);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get debug color: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphPhysicsMaterial;
	}

}