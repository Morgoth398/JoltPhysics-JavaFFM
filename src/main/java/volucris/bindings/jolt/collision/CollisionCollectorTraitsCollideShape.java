/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollisionCollectorTraitsCollideShape {

	private static final LazyConstant<MethodHandle> JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_INITIAL_EARLY_OUT_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_SHOULD_EARLY_OUT_FRACTION;

	static {
		//@formatter:off
		JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_INITIAL_EARLY_OUT_FRACTION = downcallHandle("JPH_CollisionCollectorTraitsCollideShape_GetInitialEarlyOutFraction", JAVA_FLOAT);
		JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_SHOULD_EARLY_OUT_FRACTION = downcallHandle("JPH_CollisionCollectorTraitsCollideShape_GetShouldEarlyOutFraction", JAVA_FLOAT);
		//@formatter:on
	}

	private CollisionCollectorTraitsCollideShape() {
	}

    /// ```
    /// Most shallow hit: Separation is infinite
    /// ```
    public static float getInitialEarlyOutFraction() {
    	MethodHandle method = JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_INITIAL_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Deepest hit: Penetration is infinite
    /// ```
    public static float getShouldEarlyOutFraction() {
    	MethodHandle method = JPH_COLLISION_COLLECTOR_TRAITS_COLLIDE_SHAPE_GET_SHOULD_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}