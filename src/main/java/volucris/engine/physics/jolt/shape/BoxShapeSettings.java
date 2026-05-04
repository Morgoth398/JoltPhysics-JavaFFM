package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a BoxShape. 
 */
public final class BoxShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_BOX_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE;
	
	static {
		//@formatter:off
		JPH_BOX_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_BoxShapeSettings_Create", ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_BoxShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public BoxShapeSettings(Vector3f halfExtent) {
		this(halfExtent, PhysicsSettings.DEFAULT_CONVEX_RADIUS);
	}
	
	public BoxShapeSettings(Vector3f halfExtent, float convexRadius) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vecTmp = new Vec3(arena);
			vecTmp.set(halfExtent);
			
			MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(vecTmp.memorySegment(), convexRadius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create box shape settings.");
		}
		super(segment);
	}

	public BoxShape createShape() {
		try {
			MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new BoxShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create box shape.");
		}
	}

}