package volucris.engine.utils;

import java.util.Random;

import org.joml.Vector2f;
import org.joml.Vector4f;

public final class MathUtils {

	private static Random random = new Random();

	private MathUtils() {

	}

	public static float round(float value, int precision) {
		int scale = (int) Math.pow(10, precision);
		return (float) Math.round(value * scale) / scale;
	}

	public static float toRadians(float degrees) {
		return (float) (degrees * Math.PI / 180);
	}

	public static float toDegrees(float radians) {
		return (float) (radians * 180 / Math.PI);
	}

	public static float sinDegrees(float degrees) {
		return (float) Math.sin(toRadians(degrees));
	}

	public static float cosDegrees(float degrees) {
		return (float) Math.cos(toRadians(degrees));
	}

	public static float tanDegrees(float degrees) {
		return (float) Math.tan(toRadians(degrees));
	}

	public static float sinRadians(float radians) {
		return (float) Math.sin(radians);
	}

	public static float cosRadians(float radians) {
		return (float) Math.cos(radians);
	}

	public static float tanRadians(float radians) {
		return (float) Math.tan(radians);
	}

	public static float asinDegrees(float value) {
		return toDegrees((float) Math.asin(value));
	}

	public static float acosDegrees(float value) {
		return toDegrees((float) Math.acos(value));
	}

	public static float atanDegrees(float value) {
		return toDegrees((float) Math.atan(value));
	}

	public static float asinRadians(float value) {
		return (float) Math.asin(value);
	}

	public static float acosRadians(float value) {
		return (float) Math.acos(value);
	}

	public static float atanRadians(float value) {
		return (float) Math.atan(value);
	}

	/**
	 * Returns a random number between 0 (inclusive) and the specified value
	 * (inclusive).
	 */
	public static int random(int range) {
		return random.nextInt(range + 1);
	}

	/**
	 * Returns a random number between 0 (inclusive) and the specified value
	 * (exclusive).
	 */
	public static float random(float range) {
		return random.nextFloat(range);
	}

	/**
	 * Returns a random number between start (inclusive) and end (inclusive).
	 */
	public static int random(int start, int end) {
		return random.nextInt(start, end + 1);
	}

	/**
	 * Returns a random number between start (inclusive) and end (exclusive).
	 */
	public static float random(float start, float end) {
		return random.nextFloat(start, end);
	}

	public static float rotatePointXDegrees(float x, float y, float centerX, float centerY, float degrees) {
		return centerX + (x - centerX) * cosDegrees(degrees) - (y - centerY) * sinDegrees(degrees);
	}

	public static float rotatePointXRadians(float x, float y, float centerX, float centerY, float radians) {
		return centerX + (x - centerX) * cosRadians(radians) - (y - centerY) * sinRadians(radians);
	}

	public static float rotatePointYDegrees(float x, float y, float centerX, float centerY, float degrees) {
		return centerY + (x - centerX) * sinDegrees(degrees) + (y - centerY) * cosDegrees(degrees);
	}

	public static float rotatePointYRadians(float x, float y, float centerX, float centerY, float radians) {
		return centerY + (x - centerX) * sinRadians(radians) + (y - centerY) * cosRadians(radians);
	}

	public static Vector2f rotatePointDegrees(float x, float y, float centerX, float centerY, float degrees,
			Vector2f target) {
		target.x = rotatePointXDegrees(x, y, centerX, centerY, degrees);
		target.y = rotatePointYDegrees(x, y, centerX, centerY, degrees);
		return target;
	}

	public static Vector2f rotatePointRadians(float x, float y, float centerX, float centerY, float radians,
			Vector2f target) {
		target.x = rotatePointXRadians(x, y, centerX, centerY, radians);
		target.y = rotatePointYRadians(x, y, centerX, centerY, radians);
		return target;
	}

	public static float clamp(float value, float min, float max) {
		if (value < min)
			return min;
		if (value > max)
			return max;
		return value;
	}

	public static int clamp(int value, int min, int max) {
		if (value < min)
			return min;
		if (value > max)
			return max;
		return value;
	}

	public static float sqrt(float value) {
		return (float) Math.sqrt(value);
	}

	public static int ceil(float value) {
		return (int) Math.ceil(value);
	}

	public static int floor(float value) {
		return (int) Math.floor(value);
	}

	public static int roundPositive(float value) {
		return (int) (value + 0.5f);
	}

	public static int max(int value1, int value2) {
		if (value1 > value2)
			return value1;
		return value2;
	}

	public static int min(int value1, int value2) {
		if (value1 < value2)
			return value1;
		return value2;
	}

	public static float max(float value1, float value2) {
		if (value1 > value2)
			return value1;
		return value2;
	}

	public static float min(float value1, float value2) {
		if (value1 < value2)
			return value1;
		return value2;
	}

	public static float pow(float base, float exponent) {
		return (float) Math.pow(base, exponent);
	}

	public static float log(float base, float value) {
		return (float) (Math.log(value) / Math.log(base));
	}

	/**
	 * Returns the natural logarithm (base e) of a float value.
	 * 
	 * @param value The value
	 */
	public static float log(float value) {
		return (float) Math.log(value);
	}

	public static float log10(float value) {
		return (float) Math.log10(value);
	}

	public static boolean intersectLines(Vector4f line1, Vector4f line2) {
		return intersectLines(line1.x, line1.y, line1.z, line1.w, line2.x, line2.y, line2.z, line2.w);
	}

	public static boolean intersectLines(Vector2f p1, Vector2f p2, Vector2f p3, Vector2f p4) {
		return intersectLines(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y);
	}

	public static boolean intersectLines(float x, float y, float x2, float y2, float x3, float y3, float x4, float y4) {
		float dx0 = x2 - x;
		float dx1 = x4 - x3;

		float dy0 = y2 - y;
		float dy1 = y4 - y3;

		float p0 = dy1 * (x4 - x) - dx1 * (y4 - y);
		float p1 = dy1 * (x4 - x2) - dx1 * (y4 - y2);

		float p2 = dy0 * (x2 - x3) - dx0 * (y - y3);
		float p3 = dy0 * (x2 - x4) - dx0 * (y2 - y4);

		return (p0 * p1 <= 0) & (p2 * p3 <= 0);
	}

	public static boolean intersectPolygon(Vector4f line, float[] polygon) {
		return intersectPolygon(line.x, line.y, line.z, line.w, polygon);
	}

	public static boolean intersectPolygon(Vector2f p1, Vector2f p2, float[] polygon) {
		return intersectPolygon(p1.x, p1.y, p2.x, p2.y, polygon);
	}

	public static boolean intersectPolygon(float x, float y, float x2, float y2, float[] polygon) {
		int intersections = 0;

		for (int i = 0; i < polygon.length; i += 2) {

			if (i == polygon.length - 2) {

				if (intersectLines(x, y, x2, y2, polygon[i], polygon[i + 1], polygon[0], polygon[1]))
					intersections++;
				continue;
			}

			if (intersectLines(x, y, x2, y2, polygon[i], polygon[i + 1], polygon[i + 2], polygon[i + 3]))
				intersections++;

		}

		return intersections % 2 != 0;
	}

	public static boolean intersectPolygons(float[] polygon1, float[] polygon2) {

		for (int i = 0; i < polygon1.length; i += 2) {

			float p1x1 = polygon1[i];
			float p1y1 = polygon1[i + 1];
			float p1x2;
			float p1y2;

			if (i == polygon1.length - 2) {
				p1x2 = polygon1[0];
				p1y2 = polygon1[1];
			} else {
				p1x2 = polygon1[i + 2];
				p1y2 = polygon1[i + 3];
			}

			for (int j = 0; j < polygon2.length; j += 2) {
				if (j == polygon2.length - 2) {
					if (intersectLines(p1x1, p1y1, p1x2, p1y2, polygon2[j], polygon2[j + 1], polygon2[0], polygon2[1]))
						return true;
					continue;
				}

				if (intersectLines(p1x1, p1y1, p1x2, p1y2, polygon2[j], polygon2[j + 1], polygon2[j + 2],
						polygon2[j + 3]))
					return true;
			}
		}

		return false;
	}

}
