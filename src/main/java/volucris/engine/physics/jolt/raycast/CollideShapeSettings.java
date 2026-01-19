package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.JoltEnums.BackFaceMode;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings to be passed with a collision query.
 */
public final class CollideShapeSettings extends CollideSettingsBase {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_COLLIDE_SHAPE_SETTINGS_INIT;

	private static final VarHandle MAX_SEPARATION_DISTANCE;
	private static final VarHandle BACK_FACE_MODE;

	private static final long BASE_OFFSET;

	private final MemorySegment jphCollideShapeSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        CollideSettingsBase.LAYOUT().withName("base"),
		        JAVA_FLOAT.withName("maxSeparationDistance"),
		        JAVA_INT.withName("backFaceMode")
			).withName("JPH_CollideShapeSettings");
		
		JPH_COLLIDE_SHAPE_SETTINGS_INIT = downcallHandleVoid("JPH_CollideShapeSettings_Init", ADDRESS);
		//@formatter:on

		MAX_SEPARATION_DISTANCE = varHandle(LAYOUT, "maxSeparationDistance");
		BACK_FACE_MODE = varHandle(LAYOUT, "backFaceMode");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
	}

	public CollideShapeSettings() {
		this(Arena.ofAuto());
	}

	public CollideShapeSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, CollideSettingsBase.LAYOUT()));

		jphCollideShapeSettings = segment;

		init();
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphCollideShapeSettings, 0, LAYOUT.byteSize());
	}

	private void init() {
		try {
			MethodHandle method = JPH_COLLIDE_SHAPE_SETTINGS_INIT;
			method.invokeExact(jphCollideShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize collide shape settings: " + className);
		}
	}

	/**
	 * When > 0 contacts in the vicinity of the query shape can be found. All
	 * nearest contacts that are not further away than this distance will be found.
	 * Note that in this case CollideShapeResult::mPenetrationDepth can become
	 * negative to indicate that objects are not overlapping. (unit: meter)
	 */
	public void setMaxSeparationDistance(float distance) {
		MAX_SEPARATION_DISTANCE.set(jphCollideShapeSettings, distance);
	}

	/**
	 * @see #setMaxSeparationDistance(float)
	 */
	public float getMaxSeparationDistance() {
		return (float) MAX_SEPARATION_DISTANCE.get(jphCollideShapeSettings);
	}

	/**
	 * How backfacing triangles should be treated.
	 */
	public void setBackFaceMode(BackFaceMode mode) {
		BACK_FACE_MODE.set(jphCollideShapeSettings, mode.id());
	}

	/**
	 * How backfacing triangles should be treated.
	 */
	public BackFaceMode getBackFaceMode() {
		int value = (int) BACK_FACE_MODE.get(jphCollideShapeSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	public MemorySegment memorySegment() {
		return jphCollideShapeSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
