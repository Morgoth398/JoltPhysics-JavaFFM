/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec4;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Color {

	private static final LazyConstant<MethodHandle> JPH_COLOR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_COLOR_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_COLOR_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_COLOR_CREATE4;
	private static final LazyConstant<MethodHandle> JPH_COLOR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_BLACK;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_DARK_RED;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_RED;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_DARK_GREEN;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_GREEN;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_DARK_BLUE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_BLUE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_YELLOW;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_PURPLE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_CYAN;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_ORANGE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_DARK_ORANGE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_GREY;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_LIGHT_GREY;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_WHITE;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_UINT32;
	private static final LazyConstant<MethodHandle> JPH_COLOR_TO_VEC4;
	private static final LazyConstant<MethodHandle> JPH_COLOR_GET_INTENSITY;
	private static final LazyConstant<MethodHandle> JPH_COLOR_S_GET_DISTINCT_COLOR;
	private static final LazyConstant<MethodHandle> JPH_COLOR_S_GREEN_RED_GRADIENT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLOR_CREATE = downcallHandle("JPH_Color_Create", UNBOUNDED_ADDRESS);
		JPH_COLOR_CREATE1 = downcallHandle("JPH_Color_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLOR_CREATE2 = downcallHandle("JPH_Color_Create2", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLOR_CREATE3 = downcallHandle("JPH_Color_Create3", UNBOUNDED_ADDRESS, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE);
		JPH_COLOR_CREATE4 = downcallHandle("JPH_Color_Create4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BYTE);
		JPH_COLOR_DESTROY = downcallHandleVoid("JPH_Color_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_BLACK = downcallHandleVoid("JPH_Color_GetBlack", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_DARK_RED = downcallHandleVoid("JPH_Color_GetDarkRed", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_RED = downcallHandleVoid("JPH_Color_GetRed", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_DARK_GREEN = downcallHandleVoid("JPH_Color_GetDarkGreen", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_GREEN = downcallHandleVoid("JPH_Color_GetGreen", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_DARK_BLUE = downcallHandleVoid("JPH_Color_GetDarkBlue", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_BLUE = downcallHandleVoid("JPH_Color_GetBlue", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_YELLOW = downcallHandleVoid("JPH_Color_GetYellow", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_PURPLE = downcallHandleVoid("JPH_Color_GetPurple", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_CYAN = downcallHandleVoid("JPH_Color_GetCyan", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_ORANGE = downcallHandleVoid("JPH_Color_GetOrange", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_DARK_ORANGE = downcallHandleVoid("JPH_Color_GetDarkOrange", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_GREY = downcallHandleVoid("JPH_Color_GetGrey", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_LIGHT_GREY = downcallHandleVoid("JPH_Color_GetLightGrey", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_WHITE = downcallHandleVoid("JPH_Color_GetWhite", UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_UINT32 = downcallHandle("JPH_Color_GetUInt32", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLOR_TO_VEC4 = downcallHandleVoid("JPH_Color_ToVec4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLOR_GET_INTENSITY = downcallHandle("JPH_Color_GetIntensity", JAVA_BYTE, UNBOUNDED_ADDRESS);
		JPH_COLOR_S_GET_DISTINCT_COLOR = downcallHandleVoid("JPH_Color_sGetDistinctColor", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLOR_S_GREEN_RED_GRADIENT = downcallHandleVoid("JPH_Color_sGreenRedGradient", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Color() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Color(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Color(
	    Color inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Color(
		Arena arena,
		Color inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Color(
	    int inColor
	) {
	    this(
	        Arena.ofAuto(),
	        inColor
	    );
	}
	
	/// Typed method of [#create2].
	public Color(
		Arena arena,
		int inColor
	) {
		MemorySegment segment = create2(
			inColor
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Color(
	    byte inRed,
	    byte inGreen,
	    byte inBlue,
	    byte inAlpha
	) {
	    this(
	        Arena.ofAuto(),
	        inRed,
	        inGreen,
	        inBlue,
	        inAlpha
	    );
	}
	
	/// Typed method of [#create3].
	public Color(
		Arena arena,
		byte inRed,
		byte inGreen,
		byte inBlue,
		byte inAlpha
	) {
		MemorySegment segment = create3(
			inRed,
			inGreen,
			inBlue,
			inAlpha
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Color(
	    Color inRHS,
	    byte inAlpha
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS,
	        inAlpha
	    );
	}
	
	/// Typed method of [#create4].
	public Color(
		Arena arena,
		Color inRHS,
		byte inAlpha
	) {
		MemorySegment segment = create4(
			inRHS.memorySegment(),
			inAlpha
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Color(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructors
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_COLOR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_COLOR_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	int inColor
    ) {
    	MethodHandle method = JPH_COLOR_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	byte inRed,
    	byte inGreen,
    	byte inBlue,
    	byte inAlpha
    ) {
    	MethodHandle method = JPH_COLOR_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRed,
    			inGreen,
    			inBlue,
    			inAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create4(
    	MemorySegment inRHS,
    	byte inAlpha
    ) {
    	MethodHandle method = JPH_COLOR_CREATE4.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS,
    			inAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLOR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Predefined colors
    /// ```
    public static void getBlack(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_BLACK.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBlack].
    public static void getBlack(
    	Color outResult
    ) {
    	getBlack(
    		outResult.memorySegment()
    	);
    }
    
    public static void getDarkRed(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_DARK_RED.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDarkRed].
    public final void getDarkRed(
    	Color outResult
    ) {
    	getDarkRed(
    		outResult.memorySegment()
    	);
    }
    
    public static void getRed(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_RED.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRed].
    public final void getRed(
    	Color outResult
    ) {
    	getRed(
    		outResult.memorySegment()
    	);
    }
    
    public static void getDarkGreen(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_DARK_GREEN.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDarkGreen].
    public static void getDarkGreen(
    	Color outResult
    ) {
    	getDarkGreen(
    		outResult.memorySegment()
    	);
    }
    
    public static void getGreen(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_GREEN.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGreen].
    public static void getGreen(
    	Color outResult
    ) {
    	getGreen(
    		outResult.memorySegment()
    	);
    }
    
    public static void getDarkBlue(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_DARK_BLUE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDarkBlue].
    public static void getDarkBlue(
    	Color outResult
    ) {
    	getDarkBlue(
    		outResult.memorySegment()
    	);
    }
    
    public static void getBlue(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_BLUE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBlue].
    public static void getBlue(
    	Color outResult
    ) {
    	getBlue(
    		outResult.memorySegment()
    	);
    }
    
    public static void getYellow(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_YELLOW.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getYellow].
    public static void getYellow(
    	Color outResult
    ) {
    	getYellow(
    		outResult.memorySegment()
    	);
    }
    
    public static void getPurple(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_PURPLE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPurple].
    public static void getPurple(
    	Color outResult
    ) {
    	getPurple(
    		outResult.memorySegment()
    	);
    }
    
    public static void getCyan(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_CYAN.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCyan].
    public static void getCyan(
    	Color outResult
    ) {
    	getCyan(
    		outResult.memorySegment()
    	);
    }
    
    public static void getOrange(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_ORANGE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOrange].
    public static void getOrange(
    	Color outResult
    ) {
    	getOrange(
    		outResult.memorySegment()
    	);
    }
    
    public static void getDarkOrange(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_DARK_ORANGE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDarkOrange].
    public static void getDarkOrange(
    	Color outResult
    ) {
    	getDarkOrange(
    		outResult.memorySegment()
    	);
    }
    
    public static void getGrey(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_GREY.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGrey].
    public static void getGrey(
    	Color outResult
    ) {
    	getGrey(
    		outResult.memorySegment()
    	);
    }
    
    public static void getLightGrey(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_LIGHT_GREY.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLightGrey].
    public final void getLightGrey(
    	Color outResult
    ) {
    	getLightGrey(
    		outResult.memorySegment()
    	);
    }
    
    public static void getWhite(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_GET_WHITE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWhite].
    public static void getWhite(
    	Color outResult
    ) {
    	getWhite(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to uint32
    /// ```
    public static int getUInt32(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLOR_GET_UINT32.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUInt32].
    public final int getUInt32(
    	Color self
    ) {
    	return getUInt32(
    		self.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to Vec4 with range [0, 1]
    /// ```
    public static void toVec4(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_TO_VEC4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toVec4].
    public final void toVec4(
    	Color self,
    	Vec4 outResult
    ) {
    	toVec4(
    		self.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get grayscale intensity of color
    /// ```
    public static byte getIntensity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLOR_GET_INTENSITY.get();
    	try {
    		return (byte) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIntensity].
    public final byte getIntensity(
    	Color self
    ) {
    	return getIntensity(
    		self.memorySegment()
    	);
    }
    
    /// ```
    /// Get a visually distinct color
    /// ```
    public static void sGetDistinctColor(
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_S_GET_DISTINCT_COLOR.get();
    	try {
    		 method.invokeExact(
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetDistinctColor].
    public static void sGetDistinctColor(
    	int inIndex,
    	Color outResult
    ) {
    	sGetDistinctColor(
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get a color value on the gradient from green through yellow to red
    /// @param inValue Value in the range [0, 1], 0 = green, 0.5 = yellow, 1 = red
    /// ```
    public static void sGreenRedGradient(
    	float inValue,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLOR_S_GREEN_RED_GRADIENT.get();
    	try {
    		 method.invokeExact(
    			inValue,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGreenRedGradient].
    public static void sGreenRedGradient(
    	float inValue,
    	Color outResult
    ) {
    	sGreenRedGradient(
    		inValue,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}