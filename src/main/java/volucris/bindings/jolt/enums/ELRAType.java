/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class ELRAType {

    /// ```
    /// Don't create a LRA constraint
    /// ```
    public static final int JPH_ELRA_TYPE_NONE = 0;
    /// ```
    /// Create a LRA constraint based on Euclidean distance between the closest kinematic vertex and this vertex
    /// ```
    public static final int JPH_ELRA_TYPE_EUCLIDEAN_DISTANCE = 1;
    /// ```
    /// Create a LRA constraint based on the geodesic distance between the closest kinematic vertex and this vertex (follows the edge constraints)
    /// ```
    public static final int JPH_ELRA_TYPE_GEODESIC_DISTANCE = 2;

}