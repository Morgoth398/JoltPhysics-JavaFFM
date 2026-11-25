/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class AllowedDOFs {

    /// ```
    /// No degrees of freedom are allowed. Note that this is not valid and will crash. Use a static body instead.
    /// ```
    public static final int NONE = 0;
    /// ```
    /// All degrees of freedom are allowed
    /// ```
    public static final int ALL = 63;
    /// ```
    /// Body can move in world space X axis
    /// ```
    public static final int TRANSLATION_X = 1;
    /// ```
    /// Body can move in world space Y axis
    /// ```
    public static final int TRANSLATION_Y = 2;
    /// ```
    /// Body can move in world space Z axis
    /// ```
    public static final int TRANSLATION_Z = 4;
    /// ```
    /// Body can rotate around world space X axis
    /// ```
    public static final int ROTATION_X = 8;
    /// ```
    /// Body can rotate around world space Y axis
    /// ```
    public static final int ROTATION_Y = 16;
    /// ```
    /// Body can rotate around world space Z axis
    /// ```
    public static final int ROTATION_Z = 32;
    /// ```
    /// Body can only move in X and Y axis and rotate around Z axis
    /// ```
    public static final int PLANE_2D = 35;

}