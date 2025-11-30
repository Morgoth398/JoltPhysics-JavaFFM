package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector2f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Point;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class LinearCurve {

	private static final MethodHandle JPH_LINEAR_CURVE_CREATE;
	private static final MethodHandle JPH_LINEAR_CURVE_DESTROY;
	private static final MethodHandle JPH_LINEAR_CURVE_CLEAR;
	private static final MethodHandle JPH_LINEAR_CURVE_RESERVE;
	private static final MethodHandle JPH_LINEAR_CURVE_ADD_POINT;
	private static final MethodHandle JPH_LINEAR_CURVE_SORT;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_MIN_X;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_MAX_X;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_VALUE;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_POINT_COUNT;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_POINT;
	private static final MethodHandle JPH_LINEAR_CURVE_GET_POINTS;

	private final MemorySegment jphLinearCurve;

	private Point pointTmp;

	static {
		//@formatter:off
		JPH_LINEAR_CURVE_CREATE = downcallHandle("JPH_LinearCurve_Create", ADDRESS);
		JPH_LINEAR_CURVE_DESTROY = downcallHandleVoid("JPH_LinearCurve_Destroy", ADDRESS);
		JPH_LINEAR_CURVE_CLEAR = downcallHandleVoid("JPH_LinearCurve_Clear", ADDRESS);
		JPH_LINEAR_CURVE_RESERVE = downcallHandleVoid("JPH_LinearCurve_Reserve", ADDRESS, JAVA_INT);
		JPH_LINEAR_CURVE_ADD_POINT = downcallHandleVoid("JPH_LinearCurve_AddPoint", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_LINEAR_CURVE_SORT = downcallHandleVoid("JPH_LinearCurve_Sort", ADDRESS);
		JPH_LINEAR_CURVE_GET_MIN_X = downcallHandle("JPH_LinearCurve_GetMinX", JAVA_FLOAT, ADDRESS);
		JPH_LINEAR_CURVE_GET_MAX_X = downcallHandle("JPH_LinearCurve_GetMaxX", JAVA_FLOAT, ADDRESS);
		JPH_LINEAR_CURVE_GET_VALUE = downcallHandle("JPH_LinearCurve_GetValue", JAVA_FLOAT, ADDRESS, JAVA_FLOAT);
		JPH_LINEAR_CURVE_GET_POINT_COUNT = downcallHandle("JPH_LinearCurve_GetPointCount", JAVA_INT, ADDRESS);
		JPH_LINEAR_CURVE_GET_POINT = downcallHandle("JPH_LinearCurve_GetPoint", Point.LAYOUT(), ADDRESS, JAVA_INT);
		JPH_LINEAR_CURVE_GET_POINTS = downcallHandleVoid("JPH_LinearCurve_GetPoints", ADDRESS, ADDRESS, ADDRESS);
		//@formatter:on
	}

	public LinearCurve() {
		try {
			Arena arena = Arena.ofAuto();

			MethodHandle method = JPH_LINEAR_CURVE_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphLinearCurve = segment.reinterpret(arena, s -> destroy(s));

			pointTmp = new Point(arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create linear curve.");
		}

		Jolt.addLinearCurve(jphLinearCurve.address(), this);
	}

	public LinearCurve(MemorySegment segment) {
		jphLinearCurve = segment;

		pointTmp = new Point();

		Jolt.addLinearCurve(jphLinearCurve.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_DESTROY;
			method.invokeExact(segment);

			Jolt.removeLinearCurve(segment.address());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy linear curve.");
		}
	}

	/**
	 * Remove all points.
	 */
	public void clear() {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_CLEAR;
			method.invokeExact(jphLinearCurve);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call clear.");
		}
	}

	/**
	 * Reserve memory for inNumPoints points.
	 */
	public void reserve(int numPoints) {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_RESERVE;
			method.invokeExact(jphLinearCurve, numPoints);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call reserve.");
		}
	}

	/**
	 * Add a point to the curve. Points must be inserted in ascending X or Sort()
	 * needs to be called when all points have been added.
	 */
	public void addPoint(float x, float y) {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_ADD_POINT;
			method.invokeExact(jphLinearCurve, x, y);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add point.");
		}
	}

	/**
	 * Sort the points on X ascending. 
	 */
	public void sort() {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_SORT;
			method.invokeExact(jphLinearCurve);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call sort.");
		}
	}

	/**
	 * Get the lowest X value. 
	 */
	public float getMinX() {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_GET_MIN_X;
			return (float) method.invokeExact(jphLinearCurve);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get min X.");
		}
	}

	/**
	 * Get the highest X value. 
	 */
	public float getMaxX() {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_GET_MAX_X;
			return (float) method.invokeExact(jphLinearCurve);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max X.");
		}
	}

	/**
	 * Sample value on the curve 
	 */
	public float getValue(float x) {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_GET_VALUE;
			return (float) method.invokeExact(jphLinearCurve, x);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get value.");
		}
	}

	/**
	 * 
	 */
	public int getPointCount() {
		try {
			MethodHandle method = JPH_LINEAR_CURVE_GET_POINT_COUNT;
			return (int) method.invokeExact(jphLinearCurve);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get point count.");
		}
	}

	/**
	 * 
	 */
	public Vector2f getPoint(int index, Vector2f target) {
		try (Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_LINEAR_CURVE_GET_POINT;
			MemorySegment segment = (MemorySegment) method.invokeExact(arena, jphLinearCurve, index);

			pointTmp.set(segment);
			return pointTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get point.");
		}
	}

	/**
	 * 
	 */
	public Vector2f getPoint(int index) {
		return getPoint(index, new Vector2f());
	}

	/**
	 * The points on the curve.
	 * <p>
	 * The array needs to have space for {@link #getPointCount()} elements.
	 */
	public int getPoints(Vector2f[] points) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(getPointCount(), Point.LAYOUT()));
			MemorySegment count = arena.allocate(JAVA_INT);

			MethodHandle method = JPH_LINEAR_CURVE_GET_POINTS;
			method.invokeExact(jphLinearCurve, array, count);

			for (int i = 0; i < getPointCount(); i++) {
				long offset = i * Point.LAYOUT().byteSize();
				MemorySegment.copy(array, offset, pointTmp.memorySegment(), 0, Point.LAYOUT().byteSize());

				if (points[i] == null)
					points[i] = pointTmp.get();
				else
					pointTmp.get(points[i]);
			}

			return count.getAtIndex(JAVA_INT, 0);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get points.");
		}
	}

	public MemorySegment memorySegment() {
		return jphLinearCurve;
	}

}
