/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class OverrideMassProperties {

    /// ```
    /// Tells the system to calculate the mass and inertia based on density
    /// ```
    public static final int CALCULATE_MASS_AND_INERTIA = 0;
    /// ```
    /// Tells the system to take the mass from mMassPropertiesOverride and to calculate the inertia based on density of the shapes and to scale it to the provided mass
    /// ```
    public static final int CALCULATE_INERTIA = 1;
    /// ```
    /// Tells the system to take the mass and inertia from mMassPropertiesOverride
    /// ```
    public static final int MASS_AND_INERTIA_PROVIDED = 2;

}