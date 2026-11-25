/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class GroundState {

    /// ```
    /// Character is on the ground and can move freely.
    /// ```
    public static final int ON_GROUND = 0;
    /// ```
    /// Character is on a slope that is too steep and can't climb up any further. The caller should start applying downward velocity if sliding from the slope is desired.
    /// ```
    public static final int ON_STEEP_GROUND = 1;
    /// ```
    /// Character is touching an object, but is not supported by it and should fall. The GetGroundXXX functions will return information about the touched object.
    /// ```
    public static final int NOT_SUPPORTED = 2;
    /// ```
    /// Character is in the air and is not touching anything.
    /// ```
    public static final int IN_AIR = 3;

}