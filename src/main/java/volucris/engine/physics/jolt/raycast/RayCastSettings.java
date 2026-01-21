package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.JoltEnums.BackFaceMode;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Settings to be passed with a ray cast.
 */
public final class RayCastSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle BACK_FACE_MODE_TRIANGLES;
	private static final VarHandle BACK_FACE_MODE_CONVEX;
	private static final VarHandle TREAT_CONVEX_AS_SOLID;

	private final MemorySegment jphRayCastSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("backFaceModeTriangles"),
		        JAVA_INT.withName("backFaceModeConvex"),
		        JAVA_BOOLEAN.withName("treatConvexAsSolid"),
		        MemoryLayout.paddingLayout(3)
			);
		//@formatter:on

		BACK_FACE_MODE_TRIANGLES = varHandle(LAYOUT, "backFaceModeTriangles");
		BACK_FACE_MODE_CONVEX = varHandle(LAYOUT, "backFaceModeConvex");
		TREAT_CONVEX_AS_SOLID = varHandle(LAYOUT, "treatConvexAsSolid");
	}

	public RayCastSettings() {
		this(Arena.ofAuto());
	}

	public RayCastSettings(Arena arena) {
		jphRayCastSettings = arena.allocate(LAYOUT);

		setBackFaceModeTriangle(BackFaceMode.IGNORE_BACK_FACE);
		setBackFaceModeConvex(BackFaceMode.IGNORE_BACK_FACE);
		treatConvexAsSolid(true);
	}

	/**
	 * How backfacing triangles should be treated (should we report back facing hits
	 * for triangle based shapes, e.g. MeshShape/HeightFieldShape?)
	 */
	public void setBackFaceModeTriangle(BackFaceMode mode) {
		BACK_FACE_MODE_TRIANGLES.set(jphRayCastSettings, mode.id());
	}

	/**
	 * @see #setBackFaceModeTriangle(BackFaceMode)
	 */
	public BackFaceMode getBackFaceModeTriangle() {
		int value = (int) BACK_FACE_MODE_TRIANGLES.get(jphRayCastSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	/**
	 * How backfacing convex objects should be treated (should we report back facing
	 * hits for convex shapes?)
	 */
	public void setBackFaceModeConvex(BackFaceMode mode) {
		BACK_FACE_MODE_CONVEX.set(jphRayCastSettings, mode.id());
	}

	/**
	 * How backfacing convex objects should be treated (should we report back facing
	 * hits for convex shapes?)
	 */
	public BackFaceMode getBackFaceModeConvex() {
		int value = (int) BACK_FACE_MODE_CONVEX.get(jphRayCastSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	/**
	 * If convex shapes should be treated as solid. When true, a ray starting inside
	 * a convex shape will generate a hit at fraction 0.
	 */
	public void treatConvexAsSolid(boolean value) {
		TREAT_CONVEX_AS_SOLID.set(jphRayCastSettings, value);
	}

	/**
	 * If convex shapes should be treated as solid. When true, a ray starting inside
	 * a convex shape will generate a hit at fraction 0.
	 */
	public boolean treatConvexAsSolid() {
		return (boolean) TREAT_CONVEX_AS_SOLID.get(jphRayCastSettings);
	}

	public MemorySegment memorySegment() {
		return jphRayCastSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
