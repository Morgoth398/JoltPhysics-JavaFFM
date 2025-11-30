package volucris.engine.graphics;

import volucris.engine.utils.VolucrisRuntimeException;

public final class Color implements Cloneable {

	public static final Color WHITE = new Color(1.0f, 1.0f, 1.0f, 1.0f);
	public static final Color SNOW_WHITE = new Color(1.0f, 0.98f, 0.98f, 1.0f);
	public static final Color DAISY = new Color(0.98f, 0.98f, 0.98f, 1.0f);
	public static final Color BLACK = new Color(0.0f, 0.0f, 0.0f, 1.0f);
	public static final Color RED = new Color(1.0f, 0.0f, 0.0f, 1.0f);
	public static final Color DARK_RED = new Color(0.35f, 0.0f, 0.0f, 1.0f);
	public static final Color BLUE = new Color(0.0f, 0.0f, 1.0f, 1.0f);
	public static final Color GREEN = new Color(0.0f, 1.0f, 0.0f, 1.0f);
	public static final Color DARK_GREEN = new Color(0.0f, 0.39f, 0.0f, 1.0f);
	public static final Color IRISH_FLAG = new Color(0.0f, 0.6f, 0.0f, 1.0f);
	public static final Color LIGHT_GRAY = new Color(0.7490196f, 0.7490196f, 0.7490196f, 1.0f);
	public static final Color GRAY = new Color(0.49803922f, 0.49803922f, 0.49803922f, 1.0f);
	public static final Color DARK_GRAY = new Color(0.24705882f, 0.24705882f, 0.24705882f, 1.0f);
	public static final Color CLEAR = new Color(0.0f, 0.0f, 0.0f, 0.0f);
	public static final Color NAVY = new Color(0.0f, 0.0f, 0.5f, 1.0f);
	public static final Color ROYAL = new Color(0.25490198f, 0.4117647f, 0.88235295f, 1.0f);
	public static final Color SLATE = new Color(0.4392157f, 0.5019608f, 0.5647059f, 1.0f);
	public static final Color SKY = new Color(0.5294118f, 0.80784315f, 0.92156863f, 1.0f);
	public static final Color CYAN = new Color(0.0f, 1.0f, 1.0f, 1.0f);
	public static final Color TEAL = new Color(0.0f, 0.5f, 0.5f, 1.0f);
	public static final Color CHARTREUSE = new Color(0.49803922f, 1.0f, 0.0f, 1.0f);
	public static final Color LIME = new Color(0.19607843f, 0.8039216f, 0.19607843f, 1.0f);
	public static final Color FOREST = new Color(0.13333334f, 0.54509807f, 0.13333334f, 1.0f);
	public static final Color OLIVE = new Color(0.41960785f, 0.5568628f, 0.13725491f, 1.0f);
	public static final Color YELLOW = new Color(1.0f, 1.0f, 0.0f, 1.0f);
	public static final Color GOLD = new Color(1.0f, 0.84313726f, 0.0f, 1.0f);
	public static final Color GOLDENROD = new Color(0.85490197f, 0.64705884f, 0.1254902f, 1.0f);
	public static final Color ORANGE = new Color(1.0f, 0.64705884f, 0.0f, 1.0f);
	public static final Color BROWN = new Color(0.54509807f, 0.27058825f, 0.07450981f, 1.0f);
	public static final Color TAN = new Color(0.8235294f, 0.7058824f, 0.54901963f, 1.0f);
	public static final Color FIREBRICK = new Color(0.69803923f, 0.13333334f, 0.13333334f, 1.0f);
	public static final Color SCARLET = new Color(1.0f, 0.20392157f, 0.10980392f, 1.0f);
	public static final Color CORAL = new Color(1.0f, 0.49803922f, 0.3137255f, 1.0f);
	public static final Color SALMON = new Color(0.98039216f, 0.5019608f, 0.44705883f, 1.0f);
	public static final Color PINK = new Color(1.0f, 0.4117647f, 0.7058824f, 1.0f);
	public static final Color MAGENTA = new Color(1.0f, 0.0f, 1.0f, 1.0f);
	public static final Color PURPLE = new Color(0.627451f, 0.1254902f, 0.9411765f, 1.0f);
	public static final Color VIOLET = new Color(0.93333334f, 0.50980395f, 0.93333334f, 1.0f);
	public static final Color MAROON = new Color(0.6901961f, 0.1882353f, 0.3764706f, 1.0f);
	public static final Color EMERALD_GREEN = new Color(0.0f, 0.79f, 0.34f, 1f);

	public float r;
	public float g;
	public float b;
	public float a;

	public Color() {

	}

	/**
	 * Creates a color with the given rgba values. The values need to be between 0
	 * and 1.
	 * 
	 * @param r The red component
	 * @param g The green component
	 * @param b The blue component
	 * @param a The alpha component
	 */
	public Color(float r, float g, float b, float a) {
		set(r, g, b, a);
	}

	/**
	 * Creates a color with the rgba values of the passed color.
	 * 
	 * @param color
	 */
	public Color(Color color) {
		set(color);
	}

	/**
	 * Creates a rgba color with the given hex code.
	 * 
	 * @param hexCode The hex code, e.g. "#FFFFFF" or "#FFFFFFFF"
	 */
	public Color(String hexCode) {
		set(hexCode);
	}

	/**
	 * Creates a rgba color from the given integer.
	 * 
	 * @param color           The color number, e.g. 0xFFFFFFFF with alpha channel
	 *                        and 0xFFFFFF without alpha channel.
	 * @param hasAlphaChannel If the alpha channel is represented in the number.
	 */
	public Color(int color, boolean hasAlphaChannel) {
		set(color, hasAlphaChannel);
	}

	/**
	 * Sets this color's values to the rgba values of the passed color.
	 * 
	 * @param color
	 * @return This color for chaining
	 */
	public Color set(Color color) {
		set(color.r, color.g, color.b, color.a);
		return this;
	}

	/**
	 * Sets this color's values to the passed rgba values. The values need to be
	 * between 0 and 1.
	 * 
	 * @param r The red component
	 * @param g The green component
	 * @param b The blue component
	 * @param a The alpha component
	 * @return This color for chaining
	 */
	public Color set(float r, float g, float b, float a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
		clamp();
		return this;
	}

	/**
	 * Sets this rgba color's values to the rgba values of the passed hex code.
	 * 
	 * @param hexCode The hex code, e.g. "#FFFFFF" or "#FFFFFFFF"
	 * @return This color for chaining
	 */
	public Color set(String hexCode) {
		convertHexCode(hexCode);
		return this;
	}

	/**
	 * Creates a rgba color from the given integer.
	 * 
	 * @param color           The color number, e.g. 0xFFFFFFFF with alpha channel
	 *                        and 0xFFFFFF without alpha channel.
	 * @param hasAlphaChannel If the alpha channel is represented in the number.
	 * @return This color for chaining.
	 */
	public Color set(int color, boolean hasAlphaChannel) {
		if (hasAlphaChannel) {
			r = ((color & 0xFF000000) >>> 24) / 255f;
			g = ((color & 0x00FF0000) >>> 16) / 255f;
			b = ((color & 0x0000FF00) >>> 8) / 255f;
			a = ((color & 0x000000FF) >>> 0) / 255f;
		} else {
			r = ((color & 0xFF0000) >>> 16) / 255f;
			g = ((color & 0x00FF00) >>> 8) / 255f;
			b = ((color & 0x0000FF) >>> 0) / 255f;
			a = 1f;
		}
		clamp();
		return this;
	}

	/**
	 * Multiplies this color's values with the rgba values of the passed color.
	 * 
	 * @param color
	 * @return This color for chaining
	 */
	public Color mul(Color color) {
		return mul(color.r, color.g, color.b, color.a);
	}

	/**
	 * Multiplies this color's values with the passed rgba values.
	 * 
	 * @param r The red component
	 * @param g The green component
	 * @param b The blue component
	 * @param a The alpha component
	 * @return This color for chaining
	 */
	public Color mul(float r, float g, float b, float a) {
		this.r *= r;
		this.g *= g;
		this.b *= b;
		this.a *= a;
		clamp();
		return this;
	}

	/**
	 * Multiplies this color's values with the passed value.
	 * 
	 * @param value
	 * @return This color for chaining
	 */
	public Color mul(float value) {
		this.r *= value;
		this.g *= value;
		this.b *= value;
		this.a *= value;
		clamp();
		return this;
	}

	/**
	 * Adds the rgba values of the passed color to this color's values.
	 * 
	 * @param color
	 * @return This color for chaining
	 */
	public Color add(Color color) {
		return add(color.r, color.g, color.b, color.a);
	}

	/**
	 * Adds the passed rgba values to this color's values.
	 * 
	 * @param r The red component
	 * @param g The green component
	 * @param b The blue component
	 * @param a The alpha component
	 * @return This color for chaining
	 */
	public Color add(float r, float g, float b, float a) {
		this.r += r;
		this.g += g;
		this.b += b;
		this.a += a;
		clamp();
		return this;
	}

	/**
	 * Adds the passed value to this color's values.
	 * 
	 * @param value
	 * @return This color for chaining
	 */
	public Color add(float value) {
		this.r += value;
		this.g += value;
		this.b += value;
		this.a += value;
		clamp();
		return this;
	}

	/**
	 * Subtracts the rgba values of the passed color from this color's values.
	 * 
	 * @param color
	 * @return This color for chaining
	 */
	public Color sub(Color color) {
		return sub(color.r, color.g, color.b, color.a);
	}

	/**
	 * Subtracts the passed rgba values from this color's values.
	 * 
	 * @param r The red component
	 * @param g The green component
	 * @param b The blue component
	 * @param a The alpha component
	 * @return This color for chaining
	 */
	public Color sub(float r, float g, float b, float a) {
		this.r -= r;
		this.g -= g;
		this.b -= b;
		this.a -= a;
		clamp();
		return this;
	}

	/**
	 * Subtracts the passed value from this color's values.
	 * 
	 * @param value
	 * @return This color for chaining
	 */
	public Color sub(float value) {
		this.r -= value;
		this.g -= value;
		this.b -= value;
		this.a -= value;
		clamp();
		return this;
	}

	/**
	 * Linearly interpolates between this color and the target color by the
	 * interpolation coefficient in the range of [0, 1]. The result is stored in
	 * this color.
	 * 
	 * @param target The target color
	 * @param time   The interpolation coefficient
	 * @return This color for chaining
	 */
	public Color lerp(Color target, float time) {
		return lerp(target.r, target.g, target.b, target.a, time);
	}

	/**
	 * Linearly interpolates between this color and the target colors rgba values by
	 * the interpolation coefficient in the range of [0, 1]. The result is stored in
	 * this color.
	 * 
	 * @param r    The red component
	 * @param g    The green component
	 * @param b    The blue component
	 * @param a    The alpha component
	 * @param time The interpolation coefficient
	 * @return This color for chaining
	 */
	public Color lerp(float r, float g, float b, float a, float time) {
		this.r += time * (r - this.r);
		this.g += time * (g - this.g);
		this.b += time * (b - this.b);
		this.a += time * (a - this.a);
		clamp();
		return this;
	}

	private void convertHexCode(String hexCode) {
		if (hexCode == null || hexCode.length() < 6)
			throw new VolucrisRuntimeException("Hex code is not in expected format!");

		this.r = Integer.valueOf(hexCode.substring(1, 3), 16) / 255f;
		this.g = Integer.valueOf(hexCode.substring(3, 5), 16) / 255f;
		this.b = Integer.valueOf(hexCode.substring(5, 7), 16) / 255f;
		if (hexCode.length() == 9) {
			this.a = Integer.valueOf(hexCode.substring(7, 9), 16) / 255f;
		} else {
			this.a = 1;
		}
		clamp();
	}

	/**
	 * Converts the color into hex code format, e.g. "#FFFFFFFF".
	 * <p>
	 * There may be some rounding errors due to the conversion of float to int.
	 * 
	 * @return hexCode
	 */
	public String toHexCode() {
		StringBuilder builder = new StringBuilder();
		int r = (int) (this.r * 255);
		int g = (int) (this.g * 255);
		int b = (int) (this.b * 255);
		int a = (int) (this.a * 255);
		builder.append("#");
		builder.append(Integer.toHexString(r));
		if (builder.length() == 2)
			builder.insert(1, '0');
		builder.append(Integer.toHexString(g));
		if (builder.length() == 4)
			builder.insert(3, '0');
		builder.append(Integer.toHexString(b));
		if (builder.length() == 6)
			builder.insert(5, '0');
		builder.append(Integer.toHexString(a));
		if (builder.length() == 8)
			builder.insert(7, '0');
		return builder.toString().toUpperCase();
	}

	/**
	 * Converts the color into hex code, e.g. 0xFFFFFFFF
	 * <p>
	 * There may be some rounding errors due to the conversion of float to int.
	 * 
	 * @return
	 */
	public int toInt() {
		int r = (int) (this.r * 255);
		int g = (int) (this.g * 255);
		int b = (int) (this.b * 255);
		int a = (int) (this.a * 255);

		return (r << 24) | (g << 16) | (b << 8) | a;
	}

	//@formatter:off
	private void clamp() {
		if (r < 0) r = 0;
		else if (r > 1) r = 1;
		if (g < 0) g = 0;
		else if (g > 1) g = 1;
		if (b < 0) b = 0;
		else if (b > 1) b = 1;
		if (a < 0) a = 0;
		else if (a > 1) a = 1;
	}
	//@formatter:on

	@Override
	public String toString() {
		return "(r: " + r + ", g: " + g + ", b: " + b + ", a: " + a + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Color color = (Color) obj;
		if (this.r != color.r)
			return false;
		if (this.g != color.g)
			return false;
		if (this.b != color.b)
			return false;
		if (this.a != color.a)
			return false;
		return true;
	}

	@Override
	public Color clone() {
		return new Color(this);
	}

	public Color setR(float r) {
		this.r = r;
		return this;
	}

	public Color setG(float g) {
		this.g = g;
		return this;
	}

	public Color setB(float b) {
		this.b = b;
		return this;
	}

	public Color setA(float a) {
		this.a = a;
		return this;
	}

}
