/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class SupportMode {

    /// ```
    /// Return the shape excluding the convex radius, Support::GetConvexRadius will return the convex radius if there is one, but adding this radius may not result in the most accurate/efficient representation of shapes with sharp edges
    /// ```
    public static final int EXCLUDE_CONVEX_RADIUS = 0;
    /// ```
    /// Return the shape including the convex radius, Support::GetSupport includes the convex radius if there is one, Support::GetConvexRadius will return 0
    /// ```
    public static final int INCLUDE_CONVEX_RADIUS = 1;
    /// ```
    /// Use both Support::GetSupport add Support::GetConvexRadius to get a support point that matches the original shape as accurately/efficiently as possible
    /// ```
    public static final int DEFAULT = 2;

}