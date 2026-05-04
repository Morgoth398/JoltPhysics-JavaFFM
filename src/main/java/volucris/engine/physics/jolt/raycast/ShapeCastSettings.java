package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.JoltEnums.BackFaceMode;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings to be passed with a shape cast.
 */
public final class ShapeCastSettings extends CollideSettingsBase {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SHAPE_CAST_SETTINGS_INIT;

	private static final VarHandle BACK_FACE_MODE_CONVEX;
	private static final VarHandle BACK_FACE_MODE_TRIANGLES;
	private static final VarHandle USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS;
	private static final VarHandle RETURN_DEEPEST_POINT;

	private static final long BASE_OFFSET;

	private final MemorySegment jphShapeCastSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        CollideSettingsBase.LAYOUT().withName("base"),
		        JAVA_INT.withName("backFaceModeTriangles"),
		        JAVA_INT.withName("backFaceModeConvex"),
		        JAVA_BOOLEAN.withName("useShrunkenShapeAndConvexRadius"),
		        JAVA_BOOLEAN.withName("returnDeepestPoint"),
		        MemoryLayout.paddingLayout(2)
			).withName("JPH_ShapeCastSettings");
		
		JPH_SHAPE_CAST_SETTINGS_INIT = downcallHandleVoid("JPH_ShapeCastSettings_Init", ADDRESS);
		//@formatter:on

		BACK_FACE_MODE_CONVEX = varHandle(LAYOUT, "maxSeparationDistance");
		BACK_FACE_MODE_TRIANGLES = varHandle(LAYOUT, "backFaceMode");
		USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS = varHandle(LAYOUT, "useShrunkenShapeAndConvexRadius");
		RETURN_DEEPEST_POINT = varHandle(LAYOUT, "returnDeepestPoint");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
	}

	public ShapeCastSettings() {
		this(Arena.ofAuto());
	}

	public ShapeCastSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, CollideSettingsBase.LAYOUT()));

		jphShapeCastSettings = segment;

		init();
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphShapeCastSettings, 0, LAYOUT.byteSize());
	}

	private void init() {
		try {
			MethodHandle method = JPH_SHAPE_CAST_SETTINGS_INIT;
			method.invokeExact(jphShapeCastSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize shape cast settings: " + className);
		}
	}

	/**
	 * How backfacing triangles should be treated (should we report moving from back
	 * to front for triangle based shapes, e.g. for MeshShape/HeightFieldShape?)
	 */
	public void setBackFaceModeTriangles(BackFaceMode mode) {
		BACK_FACE_MODE_TRIANGLES.set(jphShapeCastSettings, mode.id());
	}

	/**
	 * @see #setBackFaceModeTriangles(BackFaceMode)
	 */
	public BackFaceMode getBackFaceModeTriangles() {
		int value = (int) BACK_FACE_MODE_TRIANGLES.get(jphShapeCastSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	/**
	 * How backfacing convex objects should be treated (should we report starting
	 * inside an object and moving out?)
	 */
	public void setBackFaceModeConvex(BackFaceMode mode) {
		BACK_FACE_MODE_CONVEX.set(jphShapeCastSettings, mode.id());
	}

	/**
	 * How backfacing convex objects should be treated (should we report starting
	 * inside an object and moving out?)
	 */
	public BackFaceMode getBackFaceModeConvex() {
		int value = (int) BACK_FACE_MODE_CONVEX.get(jphShapeCastSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	/**
	 * Indicates if we want to shrink the shape by the convex radius and then expand
	 * it again. This speeds up collision detection and gives a more accurate normal
	 * at the cost of a more 'rounded' shape.
	 */
	public void useShrunkenShapeAndConvexRadius(boolean value) {
		USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS.set(jphShapeCastSettings, value);
	}

	/**
	 * @see #useShrunkenShapeAndConvexRadius(boolean)
	 */
	public boolean useShrunkenShapeAndConvexRadius() {
		return (boolean) USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS.get(jphShapeCastSettings);
	}

	/**
	 * When true, and the shape is intersecting at the beginning of the cast
	 * (fraction = 0) then this will calculate the deepest penetration point
	 * (costing additional CPU time)
	 */
	public void returnDeepestPoint(boolean value) {
		RETURN_DEEPEST_POINT.set(jphShapeCastSettings, value);
	}

	/**
	 * @see #returnDeepestPoint(boolean)
	 */
	public boolean returnDeepestPoint() {
		return (boolean) RETURN_DEEPEST_POINT.get(jphShapeCastSettings);
	}

	public MemorySegment memorySegment() {
		return jphShapeCastSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
