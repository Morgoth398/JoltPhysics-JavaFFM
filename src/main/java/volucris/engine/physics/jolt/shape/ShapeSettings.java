package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that can construct shapes and that is serializable using the
 * ObjectStream system. Can be used to store shape data in 'uncooked' form (i.e.
 * in a form that is still human readable and authorable). Once the shape has
 * been created using the Create() function, the data will be moved into the
 * Shape class in a form that is optimized for collision detection. After this,
 * the ShapeSettings object is no longer needed and can be destroyed. Each shape
 * class has a derived class of the ShapeSettings object to store shape specific
 * data.
 */
public sealed class ShapeSettings permits CompoundShapeSettings, ConvexShapeSettings, EmptyShapeSettings,
		HeightFieldShapeSettings, MeshShapeSettings, PlaneShapeSettings, OffsetCenterOfMassShapeSettings,
		ScaledShapeSettings, RotatedTranslatedShapeSettings {

	private static final MethodHandle JPH_SHAPE_SETTINGS_DESTROY;
	private static final MethodHandle JPH_SHAPE_SETTINGS_GET_USER_DATA;
	private static final MethodHandle JPH_SHAPE_SETTINGS_SET_USER_DATA;

	protected final MemorySegment jphShapeSettings;

	static {
		//@formatter:off
		JPH_SHAPE_SETTINGS_DESTROY = downcallHandleVoid("JPH_ShapeSettings_Destroy", ADDRESS);
		JPH_SHAPE_SETTINGS_GET_USER_DATA = downcallHandle("JPH_ShapeSettings_GetUserData", JAVA_LONG, ADDRESS);
		JPH_SHAPE_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_ShapeSettings_SetUserData", ADDRESS, JAVA_LONG);
		//@formatter:on
	}

	protected ShapeSettings(MemorySegment segment) {
		jphShapeSettings = segment.reinterpret(Arena.ofAuto(), s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SHAPE_SETTINGS_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy shape settings.");
		}
	}

	public long getUserData() {
		try {
			MethodHandle method = JPH_SHAPE_SETTINGS_GET_USER_DATA;
			return (long) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get user data.");
		}
	}

	public void setUserData(long userData) {
		try {
			MethodHandle method = JPH_SHAPE_SETTINGS_SET_USER_DATA;
			method.invokeExact(jphShapeSettings, userData);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set user data.");
		}
	}

	public MemorySegment memorySegment() {
		return jphShapeSettings;
	}

}