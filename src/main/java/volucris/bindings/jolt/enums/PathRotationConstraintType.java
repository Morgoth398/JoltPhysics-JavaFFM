/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class PathRotationConstraintType {

    /// ```
    /// Do not constrain the rotation of the body at all
    /// ```
    public static final int FREE = 0;
    /// ```
    /// Only allow rotation around the tangent vector (following the path)
    /// ```
    public static final int CONSTRAIN_AROUND_TANGENT = 1;
    /// ```
    /// Only allow rotation around the normal vector (perpendicular to the path)
    /// ```
    public static final int CONSTRAIN_AROUND_NORMAL = 2;
    /// ```
    /// Only allow rotation around the binormal vector (perpendicular to the path)
    /// ```
    public static final int CONSTRAIN_AROUND_BINORMAL = 3;
    /// ```
    /// Fully constrain the rotation of body 2 to the path (following the tangent and normal of the path)
    /// ```
    public static final int CONSTRAIN_TO_PATH = 4;
    /// ```
    /// Fully constrain the rotation of the body 2 to the rotation of body 1
    /// ```
    public static final int FULLY_CONSTRAINED = 5;

}