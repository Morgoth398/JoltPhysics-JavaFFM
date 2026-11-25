/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MortonCode {

	private static final LazyConstant<MethodHandle> JPH_MORTON_CODE_S_EXPAND_BITS;
	private static final LazyConstant<MethodHandle> JPH_MORTON_CODE_S_GET_MORTON_CODE;

	static {
		//@formatter:off
		JPH_MORTON_CODE_S_EXPAND_BITS = downcallHandle("JPH_MortonCode_sExpandBits", JAVA_INT, JAVA_FLOAT);
		JPH_MORTON_CODE_S_GET_MORTON_CODE = downcallHandle("JPH_MortonCode_sGetMortonCode", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private MortonCode() {
	}

    /// ```
    /// First converts a floating point value in the range [0, 1] to a 10 bit fixed point integer.
    /// Then expands a 10-bit integer into 30 bits by inserting 2 zeros after each bit.
    /// ```
    public static int sExpandBits(
    	float inV
    ) {
    	MethodHandle method = JPH_MORTON_CODE_S_EXPAND_BITS.get();
    	try {
    		return (int) method.invokeExact(
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Calculate the morton code for inVector, given that all vectors lie in inVectorBounds
    /// ```
    public static int sGetMortonCode(
    	MemorySegment inVector,
    	MemorySegment inVectorBounds
    ) {
    	MethodHandle method = JPH_MORTON_CODE_S_GET_MORTON_CODE.get();
    	try {
    		return (int) method.invokeExact(
    			inVector,
    			inVectorBounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetMortonCode].
    public static int sGetMortonCode(
    	Vec3 inVector,
    	AABox inVectorBounds
    ) {
    	return sGetMortonCode(
    		inVector.memorySegment(),
    		inVectorBounds.memorySegment()
    	);
    }

}