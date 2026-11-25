/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class ConstraintSpace {

    /// ```
    /// All constraint properties are specified in local space to center of mass of the bodies that are being constrained (so e.g. 'constraint position 1' will be local to body 1 COM, 'constraint position 2' will be local to body 2 COM). Note that this means you need to subtract Shape::GetCenterOfMass() from positions!
    /// ```
    public static final int LOCAL_TO_BODY_COM = 0;
    /// ```
    /// All constraint properties are specified in world space
    /// ```
    public static final int WORLD_SPACE = 1;

}