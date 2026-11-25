/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class PhysicsUpdateError {

    /// ```
    /// No errors
    /// ```
    public static final int NONE = 0;
    /// ```
    /// The manifold cache is full, this means that the total number of contacts between bodies is too high. Some contacts were ignored. Increase inMaxContactConstraints in PhysicsSystem::Init.
    /// ```
    public static final int MANIFOLD_CACHE_FULL = 1;
    /// ```
    /// The body pair cache is full, this means that too many bodies contacted. Some contacts were ignored. Increase inMaxBodyPairs in PhysicsSystem::Init.
    /// ```
    public static final int BODY_PAIR_CACHE_FULL = 2;
    /// ```
    /// The contact constraints buffer is full. Some contacts were ignored. Increase inMaxContactConstraints in PhysicsSystem::Init.
    /// ```
    public static final int CONTACT_CONSTRAINTS_FULL = 4;

}