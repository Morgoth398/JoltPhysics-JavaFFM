/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class ValidateResult {

    /// ```
    /// Accept this and any further contact points for this body pair
    /// ```
    public static final int ACCEPT_ALL_CONTACTS_FOR_THIS_BODY_PAIR = 0;
    /// ```
    /// Accept this contact only (and continue calling this callback for every contact manifold for the same body pair)
    /// ```
    public static final int ACCEPT_CONTACT = 1;
    /// ```
    /// Reject this contact only (but process any other contact manifolds for the same body pair)
    /// ```
    public static final int REJECT_CONTACT = 2;
    /// ```
    /// Rejects this and any further contact points for this body pair
    /// ```
    public static final int REJECT_ALL_CONTACTS_FOR_THIS_BODY_PAIR = 3;

}