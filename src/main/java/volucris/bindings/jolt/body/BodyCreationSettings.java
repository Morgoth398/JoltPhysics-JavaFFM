/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.GroupFilterToIDMap;
import volucris.bindings.jolt.IDToGroupFilterMap;
import volucris.bindings.jolt.IDToMaterialMap;
import volucris.bindings.jolt.MaterialToIDMap;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.collision.CollisionGroup;
import volucris.bindings.jolt.collision.shape.IDToShapeMap;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.ShapeResult;
import volucris.bindings.jolt.collision.shape.ShapeSettings;
import volucris.bindings.jolt.collision.shape.ShapeToIDMap;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class BodyCreationSettings {

	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CONVERT_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_HAS_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN;
	private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_BodyCreationSettings_Create", UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_CREATE1 = downcallHandle("JPH_BodyCreationSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_SHORT);
		JPH_BODY_CREATION_SETTINGS_CREATE2 = downcallHandle("JPH_BodyCreationSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_SHORT);
		JPH_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_BodyCreationSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_USER_DATA = downcallHandle("JPH_BodyCreationSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_BodyCreationSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER = downcallHandle("JPH_BodyCreationSettings_GetObjectLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyCreationSettings_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE = downcallHandle("JPH_BodyCreationSettings_GetMotionType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS = downcallHandle("JPH_BodyCreationSettings_GetAllowedDOFs", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowedDOFs", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandle("JPH_BodyCreationSettings_GetAllowDynamicOrKinematic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowDynamicOrKinematic", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR = downcallHandle("JPH_BodyCreationSettings_GetIsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyCreationSettings_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandle("JPH_BodyCreationSettings_GetCollideKinematicVsNonDynamic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandleVoid("JPH_BodyCreationSettings_SetCollideKinematicVsNonDynamic", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyCreationSettings_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyCreationSettings_SetUseManifoldReduction", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE = downcallHandle("JPH_BodyCreationSettings_GetApplyGyroscopicForce", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE = downcallHandleVoid("JPH_BodyCreationSettings_SetApplyGyroscopicForce", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY = downcallHandle("JPH_BodyCreationSettings_GetMotionQuality", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionQuality", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_BodyCreationSettings_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_BodyCreationSettings_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_BodyCreationSettings_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_FRICTION = downcallHandle("JPH_BodyCreationSettings_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_BodyCreationSettings_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION = downcallHandle("JPH_BodyCreationSettings_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION = downcallHandleVoid("JPH_BodyCreationSettings_SetRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyCreationSettings_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyCreationSettings_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES = downcallHandle("JPH_BodyCreationSettings_GetOverrideMassProperties", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES = downcallHandleVoid("JPH_BodyCreationSettings_SetOverrideMassProperties", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER = downcallHandle("JPH_BodyCreationSettings_GetInertiaMultiplier", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER = downcallHandleVoid("JPH_BodyCreationSettings_SetInertiaMultiplier", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_GetMassPropertiesOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetMassPropertiesOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_SHAPE_SETTINGS = downcallHandle("JPH_BodyCreationSettings_GetShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_SHAPE_SETTINGS = downcallHandleVoid("JPH_BodyCreationSettings_SetShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_CONVERT_SHAPE_SETTINGS = downcallHandleVoid("JPH_BodyCreationSettings_ConvertShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_SHAPE = downcallHandle("JPH_BodyCreationSettings_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_SHAPE = downcallHandleVoid("JPH_BodyCreationSettings_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_HAS_MASS_PROPERTIES = downcallHandle("JPH_BodyCreationSettings_HasMassProperties", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES = downcallHandleVoid("JPH_BodyCreationSettings_GetMassProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_BodyCreationSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_BodyCreationSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN = downcallHandleVoid("JPH_BodyCreationSettings_SaveWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN = downcallHandleVoid("JPH_BodyCreationSettings_sRestoreWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyCreationSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BodyCreationSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyCreationSettings(
	    ShapeSettings inShape,
	    Vec3 inPosition,
	    Quat inRotation,
	    int inMotionType,
	    short inObjectLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inPosition,
	        inRotation,
	        inMotionType,
	        inObjectLayer
	    );
	}
	
	/// Typed method of [#create1].
	public BodyCreationSettings(
		Arena arena,
		ShapeSettings inShape,
		Vec3 inPosition,
		Quat inRotation,
		int inMotionType,
		short inObjectLayer
	) {
		MemorySegment segment = create1(
			inShape.memorySegment(),
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inMotionType,
			inObjectLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyCreationSettings(
	    Shape inShape,
	    Vec3 inPosition,
	    Quat inRotation,
	    int inMotionType,
	    short inObjectLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inPosition,
	        inRotation,
	        inMotionType,
	        inObjectLayer
	    );
	}
	
	/// Typed method of [#create2].
	public BodyCreationSettings(
		Arena arena,
		Shape inShape,
		Vec3 inPosition,
		Quat inRotation,
		int inMotionType,
		short inObjectLayer
	) {
		MemorySegment segment = create2(
			inShape.memorySegment(),
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inMotionType,
			inObjectLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyCreationSettings(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inShape,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	int inMotionType,
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inPosition,
    			inRotation,
    			inMotionType,
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inShape,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	int inMotionType,
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inPosition,
    			inRotation,
    			inMotionType,
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Position of the body (not of the center of mass)
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Position of the body (not of the center of mass)
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 mPosition
    ) {
    	setPosition(
    		this.segment,
    		mPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the body
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the body
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment mRotation
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Quat mRotation
    ) {
    	setRotation(
    		this.segment,
    		mRotation.memorySegment()
    	);
    }
    
    /// ```
    /// World space linear velocity of the center of mass (m/s)
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// World space linear velocity of the center of mass (m/s)
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment mLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 mLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		mLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// World space angular velocity (rad/s)
    /// ```
    public static void getAngularVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final void getAngularVelocity(
    	Vec3 outResult
    ) {
    	getAngularVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// World space angular velocity (rad/s)
    /// ```
    public static void setAngularVelocity(
    	MemorySegment self,
    	MemorySegment mAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	Vec3 mAngularVelocity
    ) {
    	setAngularVelocity(
    		this.segment,
    		mAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// User data value (can be used by application)
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data value (can be used by application)
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	long mUserData
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// The collision layer this body belongs to (determines if two objects can collide)
    /// ```
    public static short getObjectLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayer].
    public final short getObjectLayer() {
    	return getObjectLayer(
    		this.segment
    	);
    }
    
    /// ```
    /// The collision layer this body belongs to (determines if two objects can collide)
    /// ```
    public static void setObjectLayer(
    	MemorySegment self,
    	short mObjectLayer
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setObjectLayer].
    public final void setObjectLayer(
    	short mObjectLayer
    ) {
    	setObjectLayer(
    		this.segment,
    		mObjectLayer
    	);
    }
    
    /// ```
    /// The collision group this body belongs to (determines if two objects can collide)
    /// ```
    public static void getCollisionGroup(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionGroup].
    public final void getCollisionGroup(
    	CollisionGroup outResult
    ) {
    	getCollisionGroup(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The collision group this body belongs to (determines if two objects can collide)
    /// ```
    public static void setCollisionGroup(
    	MemorySegment self,
    	MemorySegment mCollisionGroup
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollisionGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionGroup].
    public final void setCollisionGroup(
    	CollisionGroup mCollisionGroup
    ) {
    	setCollisionGroup(
    		this.segment,
    		mCollisionGroup.memorySegment()
    	);
    }
    
    /// ```
    /// Motion type, determines if the object is static, dynamic or kinematic
    /// ```
    public static int getMotionType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionType].
    public final int getMotionType() {
    	return getMotionType(
    		this.segment
    	);
    }
    
    /// ```
    /// Motion type, determines if the object is static, dynamic or kinematic
    /// ```
    public static void setMotionType(
    	MemorySegment self,
    	int mMotionType
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMotionType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionType].
    public final void setMotionType(
    	int mMotionType
    ) {
    	setMotionType(
    		this.segment,
    		mMotionType
    	);
    }
    
    /// ```
    /// Which degrees of freedom this body has (can be used to limit simulation to 2D)
    /// ```
    public static int getAllowedDOFs(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowedDOFs].
    public final int getAllowedDOFs() {
    	return getAllowedDOFs(
    		this.segment
    	);
    }
    
    /// ```
    /// Which degrees of freedom this body has (can be used to limit simulation to 2D)
    /// ```
    public static void setAllowedDOFs(
    	MemorySegment self,
    	int mAllowedDOFs
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAllowedDOFs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowedDOFs].
    public final void setAllowedDOFs(
    	int mAllowedDOFs
    ) {
    	setAllowedDOFs(
    		this.segment,
    		mAllowedDOFs
    	);
    }
    
    /// ```
    /// When this body is created as static, this setting tells the system to create a MotionProperties object so that the object can be switched to kinematic or dynamic
    /// ```
    public static boolean getAllowDynamicOrKinematic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowDynamicOrKinematic].
    public final boolean getAllowDynamicOrKinematic() {
    	return getAllowDynamicOrKinematic(
    		this.segment
    	);
    }
    
    /// ```
    /// When this body is created as static, this setting tells the system to create a MotionProperties object so that the object can be switched to kinematic or dynamic
    /// ```
    public static void setAllowDynamicOrKinematic(
    	MemorySegment self,
    	boolean mAllowDynamicOrKinematic
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAllowDynamicOrKinematic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowDynamicOrKinematic].
    public final void setAllowDynamicOrKinematic(
    	boolean mAllowDynamicOrKinematic
    ) {
    	setAllowDynamicOrKinematic(
    		this.segment,
    		mAllowDynamicOrKinematic
    	);
    }
    
    /// ```
    /// If this body is a sensor. A sensor will receive collision callbacks, but will not cause any collision responses and can be used as a trigger volume. See description at Body::SetIsSensor.
    /// ```
    public static boolean getIsSensor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsSensor].
    public final boolean getIsSensor() {
    	return getIsSensor(
    		this.segment
    	);
    }
    
    /// ```
    /// If this body is a sensor. A sensor will receive collision callbacks, but will not cause any collision responses and can be used as a trigger volume. See description at Body::SetIsSensor.
    /// ```
    public static void setIsSensor(
    	MemorySegment self,
    	boolean mIsSensor
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsSensor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsSensor].
    public final void setIsSensor(
    	boolean mIsSensor
    ) {
    	setIsSensor(
    		this.segment,
    		mIsSensor
    	);
    }
    
    /// ```
    /// If kinematic objects can generate contact points against other kinematic or static objects. See description at Body::SetCollideKinematicVsNonDynamic.
    /// ```
    public static boolean getCollideKinematicVsNonDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollideKinematicVsNonDynamic].
    public final boolean getCollideKinematicVsNonDynamic() {
    	return getCollideKinematicVsNonDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// If kinematic objects can generate contact points against other kinematic or static objects. See description at Body::SetCollideKinematicVsNonDynamic.
    /// ```
    public static void setCollideKinematicVsNonDynamic(
    	MemorySegment self,
    	boolean mCollideKinematicVsNonDynamic
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollideKinematicVsNonDynamic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollideKinematicVsNonDynamic].
    public final void setCollideKinematicVsNonDynamic(
    	boolean mCollideKinematicVsNonDynamic
    ) {
    	setCollideKinematicVsNonDynamic(
    		this.segment,
    		mCollideKinematicVsNonDynamic
    	);
    }
    
    /// ```
    /// If this body should use manifold reduction (see description at Body::SetUseManifoldReduction)
    /// ```
    public static boolean getUseManifoldReduction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseManifoldReduction].
    public final boolean getUseManifoldReduction() {
    	return getUseManifoldReduction(
    		this.segment
    	);
    }
    
    /// ```
    /// If this body should use manifold reduction (see description at Body::SetUseManifoldReduction)
    /// ```
    public static void setUseManifoldReduction(
    	MemorySegment self,
    	boolean mUseManifoldReduction
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUseManifoldReduction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseManifoldReduction].
    public final void setUseManifoldReduction(
    	boolean mUseManifoldReduction
    ) {
    	setUseManifoldReduction(
    		this.segment,
    		mUseManifoldReduction
    	);
    }
    
    /// ```
    /// Set to indicate that the gyroscopic force should be applied to this body (aka Dzhanibekov effect, see https://en.wikipedia.org/wiki/Tennis_racket_theorem)
    /// ```
    public static boolean getApplyGyroscopicForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getApplyGyroscopicForce].
    public final boolean getApplyGyroscopicForce() {
    	return getApplyGyroscopicForce(
    		this.segment
    	);
    }
    
    /// ```
    /// Set to indicate that the gyroscopic force should be applied to this body (aka Dzhanibekov effect, see https://en.wikipedia.org/wiki/Tennis_racket_theorem)
    /// ```
    public static void setApplyGyroscopicForce(
    	MemorySegment self,
    	boolean mApplyGyroscopicForce
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mApplyGyroscopicForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setApplyGyroscopicForce].
    public final void setApplyGyroscopicForce(
    	boolean mApplyGyroscopicForce
    ) {
    	setApplyGyroscopicForce(
    		this.segment,
    		mApplyGyroscopicForce
    	);
    }
    
    /// ```
    /// Motion quality, or how well it detects collisions when it has a high velocity
    /// ```
    public static int getMotionQuality(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionQuality].
    public final int getMotionQuality() {
    	return getMotionQuality(
    		this.segment
    	);
    }
    
    /// ```
    /// Motion quality, or how well it detects collisions when it has a high velocity
    /// ```
    public static void setMotionQuality(
    	MemorySegment self,
    	int mMotionQuality
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMotionQuality
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionQuality].
    public final void setMotionQuality(
    	int mMotionQuality
    ) {
    	setMotionQuality(
    		this.segment,
    		mMotionQuality
    	);
    }
    
    /// ```
    /// Set to indicate that extra effort should be made to try to remove ghost contacts (collisions with internal edges of a mesh). This is more expensive but makes bodies move smoother over a mesh with convex edges.
    /// ```
    public static boolean getEnhancedInternalEdgeRemoval(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnhancedInternalEdgeRemoval].
    public final boolean getEnhancedInternalEdgeRemoval() {
    	return getEnhancedInternalEdgeRemoval(
    		this.segment
    	);
    }
    
    /// ```
    /// Set to indicate that extra effort should be made to try to remove ghost contacts (collisions with internal edges of a mesh). This is more expensive but makes bodies move smoother over a mesh with convex edges.
    /// ```
    public static void setEnhancedInternalEdgeRemoval(
    	MemorySegment self,
    	boolean mEnhancedInternalEdgeRemoval
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEnhancedInternalEdgeRemoval
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnhancedInternalEdgeRemoval].
    public final void setEnhancedInternalEdgeRemoval(
    	boolean mEnhancedInternalEdgeRemoval
    ) {
    	setEnhancedInternalEdgeRemoval(
    		this.segment,
    		mEnhancedInternalEdgeRemoval
    	);
    }
    
    /// ```
    /// If this body can go to sleep or not
    /// ```
    public static boolean getAllowSleeping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowSleeping].
    public final boolean getAllowSleeping() {
    	return getAllowSleeping(
    		this.segment
    	);
    }
    
    /// ```
    /// If this body can go to sleep or not
    /// ```
    public static void setAllowSleeping(
    	MemorySegment self,
    	boolean mAllowSleeping
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAllowSleeping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowSleeping].
    public final void setAllowSleeping(
    	boolean mAllowSleeping
    ) {
    	setAllowSleeping(
    		this.segment,
    		mAllowSleeping
    	);
    }
    
    /// ```
    /// Friction of the body (dimensionless number, usually between 0 and 1, 0 = no friction, 1 = friction force equals force that presses the two bodies together). Note that bodies can have negative friction but the combined friction (see PhysicsSystem::SetCombineFriction) should never go below zero.
    /// ```
    public static float getFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFriction].
    public final float getFriction() {
    	return getFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction of the body (dimensionless number, usually between 0 and 1, 0 = no friction, 1 = friction force equals force that presses the two bodies together). Note that bodies can have negative friction but the combined friction (see PhysicsSystem::SetCombineFriction) should never go below zero.
    /// ```
    public static void setFriction(
    	MemorySegment self,
    	float mFriction
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFriction].
    public final void setFriction(
    	float mFriction
    ) {
    	setFriction(
    		this.segment,
    		mFriction
    	);
    }
    
    /// ```
    /// Restitution of body (dimensionless number, usually between 0 and 1, 0 = completely inelastic collision response, 1 = completely elastic collision response). Note that bodies can have negative restitution but the combined restitution (see PhysicsSystem::SetCombineRestitution) should never go below zero.
    /// ```
    public static float getRestitution(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestitution].
    public final float getRestitution() {
    	return getRestitution(
    		this.segment
    	);
    }
    
    /// ```
    /// Restitution of body (dimensionless number, usually between 0 and 1, 0 = completely inelastic collision response, 1 = completely elastic collision response). Note that bodies can have negative restitution but the combined restitution (see PhysicsSystem::SetCombineRestitution) should never go below zero.
    /// ```
    public static void setRestitution(
    	MemorySegment self,
    	float mRestitution
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRestitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitution].
    public final void setRestitution(
    	float mRestitution
    ) {
    	setRestitution(
    		this.segment,
    		mRestitution
    	);
    }
    
    /// ```
    /// Linear damping: dv/dt = -c * v. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getLinearDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearDamping].
    public final float getLinearDamping() {
    	return getLinearDamping(
    		this.segment
    	);
    }
    
    /// ```
    /// Linear damping: dv/dt = -c * v. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static void setLinearDamping(
    	MemorySegment self,
    	float mLinearDamping
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearDamping].
    public final void setLinearDamping(
    	float mLinearDamping
    ) {
    	setLinearDamping(
    		this.segment,
    		mLinearDamping
    	);
    }
    
    /// ```
    /// Angular damping: dw/dt = -c * w. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getAngularDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDamping].
    public final float getAngularDamping() {
    	return getAngularDamping(
    		this.segment
    	);
    }
    
    /// ```
    /// Angular damping: dw/dt = -c * w. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static void setAngularDamping(
    	MemorySegment self,
    	float mAngularDamping
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDamping].
    public final void setAngularDamping(
    	float mAngularDamping
    ) {
    	setAngularDamping(
    		this.segment,
    		mAngularDamping
    	);
    }
    
    /// ```
    /// Maximum linear velocity that this body can reach (m/s)
    /// ```
    public static float getMaxLinearVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLinearVelocity].
    public final float getMaxLinearVelocity() {
    	return getMaxLinearVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum linear velocity that this body can reach (m/s)
    /// ```
    public static void setMaxLinearVelocity(
    	MemorySegment self,
    	float mMaxLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLinearVelocity].
    public final void setMaxLinearVelocity(
    	float mMaxLinearVelocity
    ) {
    	setMaxLinearVelocity(
    		this.segment,
    		mMaxLinearVelocity
    	);
    }
    
    /// ```
    /// Maximum angular velocity that this body can reach (rad/s)
    /// ```
    public static float getMaxAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxAngularVelocity].
    public final float getMaxAngularVelocity() {
    	return getMaxAngularVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum angular velocity that this body can reach (rad/s)
    /// ```
    public static void setMaxAngularVelocity(
    	MemorySegment self,
    	float mMaxAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxAngularVelocity].
    public final void setMaxAngularVelocity(
    	float mMaxAngularVelocity
    ) {
    	setMaxAngularVelocity(
    		this.segment,
    		mMaxAngularVelocity
    	);
    }
    
    /// ```
    /// Value to multiply gravity with for this body
    /// ```
    public static float getGravityFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityFactor].
    public final float getGravityFactor() {
    	return getGravityFactor(
    		this.segment
    	);
    }
    
    /// ```
    /// Value to multiply gravity with for this body
    /// ```
    public static void setGravityFactor(
    	MemorySegment self,
    	float mGravityFactor
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mGravityFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravityFactor].
    public final void setGravityFactor(
    	float mGravityFactor
    ) {
    	setGravityFactor(
    		this.segment,
    		mGravityFactor
    	);
    }
    
    /// ```
    /// Used only when this body is dynamic and colliding. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static int getNumVelocityStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumVelocityStepsOverride].
    public final int getNumVelocityStepsOverride() {
    	return getNumVelocityStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Used only when this body is dynamic and colliding. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumVelocityStepsOverride(
    	MemorySegment self,
    	int mNumVelocityStepsOverride
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumVelocityStepsOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumVelocityStepsOverride].
    public final void setNumVelocityStepsOverride(
    	int mNumVelocityStepsOverride
    ) {
    	setNumVelocityStepsOverride(
    		this.segment,
    		mNumVelocityStepsOverride
    	);
    }
    
    /// ```
    /// Used only when this body is dynamic and colliding. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static int getNumPositionStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumPositionStepsOverride].
    public final int getNumPositionStepsOverride() {
    	return getNumPositionStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Used only when this body is dynamic and colliding. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumPositionStepsOverride(
    	MemorySegment self,
    	int mNumPositionStepsOverride
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumPositionStepsOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumPositionStepsOverride].
    public final void setNumPositionStepsOverride(
    	int mNumPositionStepsOverride
    ) {
    	setNumPositionStepsOverride(
    		this.segment,
    		mNumPositionStepsOverride
    	);
    }
    
    /// ```
    /// Determines how mMassPropertiesOverride will be used
    /// ```
    public static int getOverrideMassProperties(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOverrideMassProperties].
    public final int getOverrideMassProperties() {
    	return getOverrideMassProperties(
    		this.segment
    	);
    }
    
    /// ```
    /// Determines how mMassPropertiesOverride will be used
    /// ```
    public static void setOverrideMassProperties(
    	MemorySegment self,
    	int mOverrideMassProperties
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mOverrideMassProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setOverrideMassProperties].
    public final void setOverrideMassProperties(
    	int mOverrideMassProperties
    ) {
    	setOverrideMassProperties(
    		this.segment,
    		mOverrideMassProperties
    	);
    }
    
    /// ```
    /// When calculating the inertia (not when it is provided) the calculated inertia will be multiplied by this value
    /// ```
    public static float getInertiaMultiplier(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInertiaMultiplier].
    public final float getInertiaMultiplier() {
    	return getInertiaMultiplier(
    		this.segment
    	);
    }
    
    /// ```
    /// When calculating the inertia (not when it is provided) the calculated inertia will be multiplied by this value
    /// ```
    public static void setInertiaMultiplier(
    	MemorySegment self,
    	float mInertiaMultiplier
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInertiaMultiplier
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInertiaMultiplier].
    public final void setInertiaMultiplier(
    	float mInertiaMultiplier
    ) {
    	setInertiaMultiplier(
    		this.segment,
    		mInertiaMultiplier
    	);
    }
    
    /// ```
    /// Contains replacement mass settings which override the automatically calculated values
    /// ```
    public static void getMassPropertiesOverride(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMassPropertiesOverride].
    public final void getMassPropertiesOverride(
    	MassProperties outResult
    ) {
    	getMassPropertiesOverride(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contains replacement mass settings which override the automatically calculated values
    /// ```
    public static void setMassPropertiesOverride(
    	MemorySegment self,
    	MemorySegment mMassPropertiesOverride
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMassPropertiesOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMassPropertiesOverride].
    public final void setMassPropertiesOverride(
    	MassProperties mMassPropertiesOverride
    ) {
    	setMassPropertiesOverride(
    		this.segment,
    		mMassPropertiesOverride.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the shape settings object. This contains serializable (non-runtime optimized) information about the Shape.
    /// ```
    public static MemorySegment getShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeSettings].
    public final @Nullable ShapeSettings getShapeSettings() {
    	MemorySegment segment = getShapeSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeSettings(segment);
    }
    
    public static void setShapeSettings(
    	MemorySegment self,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_SHAPE_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeSettings].
    public final void setShapeSettings(
    	ShapeSettings inShape
    ) {
    	setShapeSettings(
    		this.segment,
    		inShape.memorySegment()
    	);
    }
    
    /// ```
    /// Convert ShapeSettings object into a Shape object. This will free the ShapeSettings object and make the object ready for runtime. Serialization is no longer possible after this.
    /// ```
    public static void convertShapeSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_CONVERT_SHAPE_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#convertShapeSettings].
    public final void convertShapeSettings(
    	ShapeResult outResult
    ) {
    	convertShapeSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the run-time shape object. Will convert from ShapeSettings object if needed.
    /// ```
    public static MemorySegment getShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final @Nullable Shape getShape() {
    	MemorySegment segment = getShape(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Shape(segment);
    }
    
    public static void setShape(
    	MemorySegment self,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final void setShape(
    	Shape inShape
    ) {
    	setShape(
    		this.segment,
    		inShape.memorySegment()
    	);
    }
    
    /// ```
    /// Check if the mass properties of this body will be calculated (only relevant for kinematic or dynamic objects that need a MotionProperties object)
    /// ```
    public static boolean hasMassProperties(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_HAS_MASS_PROPERTIES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasMassProperties].
    public final boolean hasMassProperties() {
    	return hasMassProperties(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate (or return when overridden) the mass and inertia for this body
    /// ```
    public static void getMassProperties(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMassProperties].
    public final void getMassProperties(
    	MassProperties outResult
    ) {
    	getMassProperties(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream. Doesn't store the shape nor the group filter.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restore the state of this object from inStream. Doesn't restore the shape nor the group filter.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBinaryState].
    public final void restoreBinaryState(
    	StreamIn inStream
    ) {
    	restoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Save body creation settings, its shape, materials and group filter. Pass in an empty map in ioShapeMap / ioMaterialMap / ioGroupFilterMap or reuse the same map while saving multiple shapes to the same stream in order to avoid writing duplicates.
    /// Pass nullptr to ioShapeMap and ioMaterial map to skip saving shapes
    /// Pass nullptr to ioGroupFilterMap to skip saving group filters
    /// ```
    public static void saveWithChildren(
    	MemorySegment self,
    	MemorySegment inStream,
    	MemorySegment ioShapeMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment ioGroupFilterMap
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			ioShapeMap,
    			ioMaterialMap,
    			ioGroupFilterMap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveWithChildren].
    public final void saveWithChildren(
    	StreamOut inStream,
    	ShapeToIDMap ioShapeMap,
    	MaterialToIDMap ioMaterialMap,
    	GroupFilterToIDMap ioGroupFilterMap
    ) {
    	saveWithChildren(
    		this.segment,
    		inStream.memorySegment(),
    		ioShapeMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		ioGroupFilterMap.memorySegment()
    	);
    }
    
    /// ```
    /// Restore body creation settings, its shape, materials and group filter. Pass in an empty map in ioShapeMap / ioMaterialMap / ioGroupFilterMap or reuse the same map while reading multiple shapes from the same stream in order to restore duplicates.
    /// ```
    public static void sRestoreWithChildren(
    	MemorySegment inStream,
    	MemorySegment ioShapeMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment ioGroupFilterMap,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			ioShapeMap,
    			ioMaterialMap,
    			ioGroupFilterMap,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreWithChildren].
    public final void sRestoreWithChildren(
    	StreamIn inStream,
    	IDToShapeMap ioShapeMap,
    	IDToMaterialMap ioMaterialMap,
    	IDToGroupFilterMap ioGroupFilterMap,
    	BCSResult outResult
    ) {
    	sRestoreWithChildren(
    		inStream.memorySegment(),
    		ioShapeMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		ioGroupFilterMap.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}