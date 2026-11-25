/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class StateRecorderState {

    /// ```
    /// Save nothing
    /// ```
    public static final int NONE = 0;
    /// ```
    /// Save global physics system state (delta time, gravity, etc.)
    /// ```
    public static final int GLOBAL = 1;
    /// ```
    /// Save the state of bodies
    /// ```
    public static final int BODIES = 2;
    /// ```
    /// Save the state of contacts
    /// ```
    public static final int CONTACTS = 4;
    /// ```
    /// Save the state of constraints
    /// ```
    public static final int CONSTRAINTS = 8;
    /// ```
    /// Save all state
    /// ```
    public static final int ALL = 15;

}