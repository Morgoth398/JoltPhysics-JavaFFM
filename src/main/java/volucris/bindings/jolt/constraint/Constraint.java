/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class Constraint
		permits TwoBodyConstraint,
		VehicleConstraint {

    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_TYPE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_SUB_TYPE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_ENABLED;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_ENABLED;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_RESET_WARM_START;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_IS_ACTIVE;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONSTRAINT_DESTROY = downcallHandleVoid("JPH_Constraint_Destroy", UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_GET_TYPE = downcallHandle("JPH_Constraint_GetType", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_GET_SUB_TYPE = downcallHandle("JPH_Constraint_GetSubType", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY = downcallHandle("JPH_Constraint_GetConstraintPriority", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY = downcallHandleVoid("JPH_Constraint_SetConstraintPriority", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CONSTRAINT_GET_ENABLED = downcallHandle("JPH_Constraint_GetEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SET_ENABLED = downcallHandleVoid("JPH_Constraint_SetEnabled", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CONSTRAINT_GET_USER_DATA = downcallHandle("JPH_Constraint_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SET_USER_DATA = downcallHandleVoid("JPH_Constraint_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_Constraint_NotifyShapeChanged", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_RESET_WARM_START = downcallHandleVoid("JPH_Constraint_ResetWarmStart", UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_IS_ACTIVE = downcallHandle("JPH_Constraint_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_SetupVelocityConstraint", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_WarmStartVelocityConstraint", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_Constraint_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_Constraint_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        //@formatter:on
    }

    public Constraint(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_DESTROY.get();
        try {
            method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getType(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_TYPE.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getType}.
     */
    public final int getType(
    ) {
        return (int) getType(
            this.segment
        );
    }
    
    public static int getSubType(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_SUB_TYPE.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubType}.
     */
    public final int getSubType(
    ) {
        return (int) getSubType(
            this.segment
        );
    }
    
    public static int getConstraintPriority(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraintPriority}.
     */
    public final int getConstraintPriority(
    ) {
        return (int) getConstraintPriority(
            this.segment
        );
    }
    
    public static void setConstraintPriority(
        MemorySegment constraint, 
        int priority
    ) {
        MethodHandle method = JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY.get();
        try {
            method.invokeExact(
                constraint, 
                priority
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setConstraintPriority}.
     */
    public final void setConstraintPriority(
        int priority
    ) {
        setConstraintPriority(
            this.segment, 
            priority
        );
    }
    
    public static int getNumVelocityStepsOverride(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumVelocityStepsOverride}.
     */
    public final int getNumVelocityStepsOverride(
    ) {
        return (int) getNumVelocityStepsOverride(
            this.segment
        );
    }
    
    public static void setNumVelocityStepsOverride(
        MemorySegment constraint, 
        int value
    ) {
        MethodHandle method = JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
        try {
            method.invokeExact(
                constraint, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setNumVelocityStepsOverride}.
     */
    public final void setNumVelocityStepsOverride(
        int value
    ) {
        setNumVelocityStepsOverride(
            this.segment, 
            value
        );
    }
    
    public static int getNumPositionStepsOverride(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumPositionStepsOverride}.
     */
    public final int getNumPositionStepsOverride(
    ) {
        return (int) getNumPositionStepsOverride(
            this.segment
        );
    }
    
    public static void setNumPositionStepsOverride(
        MemorySegment constraint, 
        int value
    ) {
        MethodHandle method = JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE.get();
        try {
            method.invokeExact(
                constraint, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setNumPositionStepsOverride}.
     */
    public final void setNumPositionStepsOverride(
        int value
    ) {
        setNumPositionStepsOverride(
            this.segment, 
            value
        );
    }
    
    public static boolean getEnabled(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_ENABLED.get();
        try {
            return (boolean) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEnabled}.
     */
    public final boolean getEnabled(
    ) {
        return (boolean) getEnabled(
            this.segment
        );
    }
    
    public static void setEnabled(
        MemorySegment constraint, 
        boolean enabled
    ) {
        MethodHandle method = JPH_CONSTRAINT_SET_ENABLED.get();
        try {
            method.invokeExact(
                constraint, 
                enabled
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setEnabled}.
     */
    public final void setEnabled(
        boolean enabled
    ) {
        setEnabled(
            this.segment, 
            enabled
        );
    }
    
    public static long getUserData(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUserData}.
     */
    public final long getUserData(
    ) {
        return (long) getUserData(
            this.segment
        );
    }
    
    public static void setUserData(
        MemorySegment constraint, 
        long userData
    ) {
        MethodHandle method = JPH_CONSTRAINT_SET_USER_DATA.get();
        try {
            method.invokeExact(
                constraint, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        long userData
    ) {
        setUserData(
            this.segment, 
            userData
        );
    }
    
    public static void notifyShapeChanged(
        MemorySegment constraint, 
        int bodyID, 
        MemorySegment deltaCOM
    ) {
        MethodHandle method = JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED.get();
        try {
            method.invokeExact(
                constraint, 
                bodyID, 
                deltaCOM
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #notifyShapeChanged}.
     */
    public final void notifyShapeChanged(
        int bodyID, 
        Vec3 deltaCOM
    ) {
        notifyShapeChanged(
            this.segment, 
            bodyID, 
            deltaCOM.memorySegment()
        );
    }
    
    public static void resetWarmStart(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_RESET_WARM_START.get();
        try {
            method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetWarmStart}.
     */
    public final void resetWarmStart(
    ) {
        resetWarmStart(
            this.segment
        );
    }
    
    public static boolean isActive(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONSTRAINT_IS_ACTIVE.get();
        try {
            return (boolean) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isActive}.
     */
    public final boolean isActive(
    ) {
        return (boolean) isActive(
            this.segment
        );
    }
    
    public static void setupVelocityConstraint(
        MemorySegment constraint, 
        float deltaTime
    ) {
        MethodHandle method = JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT.get();
        try {
            method.invokeExact(
                constraint, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setupVelocityConstraint}.
     */
    public final void setupVelocityConstraint(
        float deltaTime
    ) {
        setupVelocityConstraint(
            this.segment, 
            deltaTime
        );
    }
    
    public static void warmStartVelocityConstraint(
        MemorySegment constraint, 
        float warmStartImpulseRatio
    ) {
        MethodHandle method = JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT.get();
        try {
            method.invokeExact(
                constraint, 
                warmStartImpulseRatio
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #warmStartVelocityConstraint}.
     */
    public final void warmStartVelocityConstraint(
        float warmStartImpulseRatio
    ) {
        warmStartVelocityConstraint(
            this.segment, 
            warmStartImpulseRatio
        );
    }
    
    public static boolean solveVelocityConstraint(
        MemorySegment constraint, 
        float deltaTime
    ) {
        MethodHandle method = JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT.get();
        try {
            return (boolean) method.invokeExact(
                constraint, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #solveVelocityConstraint}.
     */
    public final boolean solveVelocityConstraint(
        float deltaTime
    ) {
        return (boolean) solveVelocityConstraint(
            this.segment, 
            deltaTime
        );
    }
    
    public static boolean solvePositionConstraint(
        MemorySegment constraint, 
        float deltaTime, 
        float baumgarte
    ) {
        MethodHandle method = JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT.get();
        try {
            return (boolean) method.invokeExact(
                constraint, 
                deltaTime, 
                baumgarte
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #solvePositionConstraint}.
     */
    public final boolean solvePositionConstraint(
        float deltaTime, 
        float baumgarte
    ) {
        return (boolean) solvePositionConstraint(
            this.segment, 
            deltaTime, 
            baumgarte
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}