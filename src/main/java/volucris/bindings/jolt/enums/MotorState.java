/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class MotorState {

    /// ```
    /// Motor is off
    /// ```
    public static final int OFF = 0;
    /// ```
    /// Motor will drive to target velocity limited only by max force/torque that the motor can apply
    /// ```
    public static final int VELOCITY = 1;
    /// ```
    /// Motor will drive to target position using: force = stiffness * (target_position - current_position) - damping * current_velocity
    /// ```
    public static final int POSITION = 2;
    /// ```
    /// Motor will drive both to target position and velocity using: force = stiffness * (target_position - current_position) + damping * (target_velocity - current_velocity)
    /// ```
    public static final int POSITION_AND_VELOCITY = 3;

}