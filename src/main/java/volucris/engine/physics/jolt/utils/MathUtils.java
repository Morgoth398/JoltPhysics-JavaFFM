package volucris.engine.physics.jolt.utils;

public final class MathUtils {

	private MathUtils() {

	}

	public static float toRadians(float degrees) {
		return (float) (degrees * Math.PI / 180);
	}

	public static float cosDegrees(float degrees) {
		return (float) Math.cos(toRadians(degrees));
	}

	public static float pow(float base, float exponent) {
		return (float) Math.pow(base, exponent);
	}

}
