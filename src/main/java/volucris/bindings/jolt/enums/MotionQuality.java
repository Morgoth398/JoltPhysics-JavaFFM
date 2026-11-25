/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.enums;

public final class MotionQuality {

    /// ```
    /// Update the body in discrete steps. Body will tunnel through thin objects if its velocity is high enough.
    /// This is the cheapest way of simulating a body.
    /// ```
    public static final int DISCRETE = 0;
    /// ```
    /// Update the body using linear casting. When stepping the body, its collision shape is cast from
    /// start to destination using the starting rotation. The body will not be able to tunnel through thin
    /// objects at high velocity, but tunneling is still possible if the body is long and thin and has high
    /// angular velocity. Time is stolen from the object (which means it will move up to the first collision
    /// and will not bounce off the surface until the next integration step). This will make the body appear
    /// to go slower when it collides with high velocity. In order to not get stuck, the body is always
    /// allowed to move by a fraction of it's inner radius, which may eventually lead it to pass through geometry.
    /// 
    /// Note that if you're using a collision listener, you can receive contact added/persisted notifications of contacts
    /// that may in the end not happen. This happens between bodies that are using casting: If bodies A and B collide at t1
    /// and B and C collide at t2 where t2  t1 and A and C don't collide. In this case you may receive an incorrect contact
    /// point added callback between A and B (which will be removed the next frame).
    /// ```
    public static final int LINEAR_CAST = 1;

}