/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollisionCollectorTraitsCastRay {

	private static final LazyConstant<MethodHandle> JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_INITIAL_EARLY_OUT_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_SHOULD_EARLY_OUT_FRACTION;

	static {
		//@formatter:off
		JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_INITIAL_EARLY_OUT_FRACTION = downcallHandle("JPH_CollisionCollectorTraitsCastRay_GetInitialEarlyOutFraction", JAVA_FLOAT);
		JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_SHOULD_EARLY_OUT_FRACTION = downcallHandle("JPH_CollisionCollectorTraitsCastRay_GetShouldEarlyOutFraction", JAVA_FLOAT);
		//@formatter:on
	}

	private CollisionCollectorTraitsCastRay() {
	}

    /// ```
    /// Furthest hit: Fraction is 1 + epsilon
    /// ```
    public static float getInitialEarlyOutFraction() {
    	MethodHandle method = JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_INITIAL_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Closest hit: Fraction is 0
    /// ```
    public static float getShouldEarlyOutFraction() {
    	MethodHandle method = JPH_COLLISION_COLLECTOR_TRAITS_CAST_RAY_GET_SHOULD_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}