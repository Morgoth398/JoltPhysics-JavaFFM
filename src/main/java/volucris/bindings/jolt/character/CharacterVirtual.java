/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.TempAllocator;
import volucris.bindings.jolt.body.BodyFilter;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.ObjectLayerFilter;
import volucris.bindings.jolt.collision.ShapeFilter;
import volucris.bindings.jolt.collision.TransformedShape;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerFilter;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterVirtual extends CharacterBase {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_AS_CHARACTER_BASE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_DRAW_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_DRAW_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_DRAW_WALK_STAIRS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_DRAW_WALK_STAIRS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_DRAW_STICK_TO_FLOOR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_DRAW_STICK_TO_FLOOR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_DRAW_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_DRAW_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_UPDATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_WALK_STAIRS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CHECK_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CHARACTER_VIRTUAL_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACTS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_VIRTUAL_CREATE = downcallHandle("JPH_CharacterVirtual_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_CREATE1 = downcallHandle("JPH_CharacterVirtual_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_AS_CHARACTER_BASE = downcallHandle("JPH_CharacterVirtual_AsCharacterBase", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_DRAW_CONSTRAINTS = downcallHandle("JPH_CharacterVirtual_GetDrawConstraints", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_SET_DRAW_CONSTRAINTS = downcallHandleVoid("JPH_CharacterVirtual_SetDrawConstraints", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_DRAW_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_GetDrawWalkStairs", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_SET_DRAW_WALK_STAIRS = downcallHandleVoid("JPH_CharacterVirtual_SetDrawWalkStairs", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_DRAW_STICK_TO_FLOOR = downcallHandle("JPH_CharacterVirtual_GetDrawStickToFloor", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_SET_DRAW_STICK_TO_FLOOR = downcallHandleVoid("JPH_CharacterVirtual_SetDrawStickToFloor", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_DRAW_SUPPORTING_VOLUME = downcallHandle("JPH_CharacterVirtual_GetDrawSupportingVolume", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_SET_DRAW_SUPPORTING_VOLUME = downcallHandleVoid("JPH_CharacterVirtual_SetDrawSupportingVolume", JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_ID = downcallHandle("JPH_CharacterVirtual_GetID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_LISTENER = downcallHandleVoid("JPH_CharacterVirtual_SetListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_LISTENER = downcallHandle("JPH_CharacterVirtual_GetListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION = downcallHandleVoid("JPH_CharacterVirtual_SetCharacterVsCharacterCollision", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_CharacterVirtual_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_MASS = downcallHandle("JPH_CharacterVirtual_GetMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MASS = downcallHandleVoid("JPH_CharacterVirtual_SetMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH = downcallHandle("JPH_CharacterVirtual_GetMaxStrength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH = downcallHandleVoid("JPH_CharacterVirtual_SetMaxStrength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED = downcallHandle("JPH_CharacterVirtual_GetPenetrationRecoverySpeed", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED = downcallHandleVoid("JPH_CharacterVirtual_SetPenetrationRecoverySpeed", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_CharacterVirtual_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_CharacterVirtual_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING = downcallHandle("JPH_CharacterVirtual_GetCharacterPadding", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS = downcallHandle("JPH_CharacterVirtual_GetMaxNumHits", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS = downcallHandleVoid("JPH_CharacterVirtual_SetMaxNumHits", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandle("JPH_CharacterVirtual_GetHitReductionCosMaxAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandleVoid("JPH_CharacterVirtual_SetHitReductionCosMaxAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED = downcallHandle("JPH_CharacterVirtual_GetMaxHitsExceeded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_GetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_SetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_USER_DATA = downcallHandle("JPH_CharacterVirtual_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_USER_DATA = downcallHandleVoid("JPH_CharacterVirtual_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID = downcallHandleVoid("JPH_CharacterVirtual_GetInnerBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES = downcallHandleVoid("JPH_CharacterVirtual_CancelVelocityTowardsSteepSlopes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_StartTrackingContactChanges", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_FinishTrackingContactChanges", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_Update", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_CanWalkStairs", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_WalkStairs", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR = downcallHandle("JPH_CharacterVirtual_StickToFloor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_ExtendedUpdate", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS = downcallHandleVoid("JPH_CharacterVirtual_RefreshContacts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_UpdateGroundVelocity", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_SHAPE = downcallHandle("JPH_CharacterVirtual_SetShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE = downcallHandleVoid("JPH_CharacterVirtual_SetInnerBodyShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_CharacterVirtual_GetTransformedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_CHECK_COLLISION = downcallHandleVoid("JPH_CharacterVirtual_CheckCollision", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_CHARACTER_VIRTUAL_SETTINGS = downcallHandleVoid("JPH_CharacterVirtual_GetCharacterVirtualSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACTS = downcallHandle("JPH_CharacterVirtual_GetActiveContacts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH = downcallHandle("JPH_CharacterVirtual_HasCollidedWith", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH1 = downcallHandle("JPH_CharacterVirtual_HasCollidedWith1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH2 = downcallHandle("JPH_CharacterVirtual_HasCollidedWith2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterVirtual(
	    CharacterVirtualSettings inSettings,
	    Vec3 inPosition,
	    Quat inRotation,
	    long inUserData,
	    PhysicsSystem inSystem
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inPosition,
	        inRotation,
	        inUserData,
	        inSystem
	    );
	}
	
	/// Typed method of [#create].
	public CharacterVirtual(
		Arena arena,
		CharacterVirtualSettings inSettings,
		Vec3 inPosition,
		Quat inRotation,
		long inUserData,
		PhysicsSystem inSystem
	) {
		MemorySegment segment = create(
			inSettings.memorySegment(),
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inUserData,
			inSystem.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBase(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterVirtual(
	    CharacterVirtualSettings inSettings,
	    Vec3 inPosition,
	    Quat inRotation,
	    PhysicsSystem inSystem
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inPosition,
	        inRotation,
	        inSystem
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterVirtual(
		Arena arena,
		CharacterVirtualSettings inSettings,
		Vec3 inPosition,
		Quat inRotation,
		PhysicsSystem inSystem
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inSystem.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBase(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterVirtual(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterBase(segment));
	}

    /// ```
    /// Constructor
    /// @param inSettings The settings for the character
    /// @param inPosition Initial position for the character
    /// @param inRotation Initial rotation for the character (usually only around the up-axis)
    /// @param inUserData Application specific value
    /// @param inSystem Physics system that this character will be added to
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	long inUserData,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inPosition,
    			inRotation,
    			inUserData,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor without user data
    /// ```
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inPosition,
    			inRotation,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterBase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_AS_CHARACTER_BASE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the current state of the constraints for iteration 0 when creating them
    /// ```
    public static boolean getDrawConstraints() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_DRAW_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the current state of the constraints for iteration 0 when creating them
    /// ```
    public static void setDrawConstraints(
    	boolean sDrawConstraints
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_DRAW_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			sDrawConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the state of the walk stairs algorithm
    /// ```
    public static boolean getDrawWalkStairs() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_DRAW_WALK_STAIRS.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the state of the walk stairs algorithm
    /// ```
    public static void setDrawWalkStairs(
    	boolean sDrawWalkStairs
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_DRAW_WALK_STAIRS.get();
    	try {
    		 method.invokeExact(
    			sDrawWalkStairs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the state of the stick to floor algorithm
    /// ```
    public static boolean getDrawStickToFloor() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_DRAW_STICK_TO_FLOOR.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the state of the stick to floor algorithm
    /// ```
    public static void setDrawStickToFloor(
    	boolean sDrawStickToFloor
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_DRAW_STICK_TO_FLOOR.get();
    	try {
    		 method.invokeExact(
    			sDrawStickToFloor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the supporting volume plane
    /// ```
    public static boolean getDrawSupportingVolume() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_DRAW_SUPPORTING_VOLUME.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw the supporting volume plane
    /// ```
    public static void setDrawSupportingVolume(
    	boolean sDrawSupportingVolume
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_DRAW_SUPPORTING_VOLUME.get();
    	try {
    		 method.invokeExact(
    			sDrawSupportingVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The ID of this character
    /// ```
    public static MemorySegment getID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getID].
    public final @Nullable CharacterID getID() {
    	MemorySegment segment = getID(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterID(segment);
    }
    
    /// ```
    /// Set the contact listener
    /// ```
    public static void setListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setListener].
    public final void setListener(
    	CharacterContactListener inListener
    ) {
    	setListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current contact listener
    /// ```
    public static MemorySegment getListener(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getListener].
    public final @Nullable CharacterContactListener getListener() {
    	MemorySegment segment = getListener(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContactListener(segment);
    }
    
    /// ```
    /// Set the character vs character collision interface
    /// ```
    public static void setCharacterVsCharacterCollision(
    	MemorySegment self,
    	MemorySegment inCharacterVsCharacterCollision
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCharacterVsCharacterCollision
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCharacterVsCharacterCollision].
    public final void setCharacterVsCharacterCollision(
    	CharacterVsCharacterCollision inCharacterVsCharacterCollision
    ) {
    	setCharacterVsCharacterCollision(
    		this.segment,
    		inCharacterVsCharacterCollision.memorySegment()
    	);
    }
    
    /// ```
    /// Get the linear velocity of the character (m / s)
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY.get();
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
    /// Set the linear velocity of the character (m / s)
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get the position of the character
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_POSITION.get();
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
    /// Set the position of the character
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment inPosition
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 inPosition
    ) {
    	setPosition(
    		this.segment,
    		inPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Get the rotation of the character
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ROTATION.get();
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
    /// Set the rotation of the character
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Quat inRotation
    ) {
    	setRotation(
    		this.segment,
    		inRotation.memorySegment()
    	);
    }
    
    public static void getCenterOfMassPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassPosition].
    public final void getCenterOfMassPosition(
    	Vec3 outResult
    ) {
    	getCenterOfMassPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the world transform of the character
    /// ```
    public static void getWorldTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldTransform].
    public final void getWorldTransform(
    	Mat44 outResult
    ) {
    	getWorldTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the transform for this character's center of mass
    /// ```
    public static void getCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassTransform].
    public final void getCenterOfMassTransform(
    	Mat44 outResult
    ) {
    	getCenterOfMassTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Character mass (kg)
    /// ```
    public static float getMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMass].
    public final float getMass() {
    	return getMass(
    		this.segment
    	);
    }
    
    public static void setMass(
    	MemorySegment self,
    	float inMass
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMass].
    public final void setMass(
    	float inMass
    ) {
    	setMass(
    		this.segment,
    		inMass
    	);
    }
    
    /// ```
    /// Maximum force with which the character can push other bodies (N)
    /// ```
    public static float getMaxStrength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxStrength].
    public final float getMaxStrength() {
    	return getMaxStrength(
    		this.segment
    	);
    }
    
    public static void setMaxStrength(
    	MemorySegment self,
    	float inMaxStrength
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxStrength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxStrength].
    public final void setMaxStrength(
    	float inMaxStrength
    ) {
    	setMaxStrength(
    		this.segment,
    		inMaxStrength
    	);
    }
    
    /// ```
    /// This value governs how fast a penetration will be resolved, 0 = nothing is resolved, 1 = everything in one update
    /// ```
    public static float getPenetrationRecoverySpeed(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationRecoverySpeed].
    public final float getPenetrationRecoverySpeed() {
    	return getPenetrationRecoverySpeed(
    		this.segment
    	);
    }
    
    public static void setPenetrationRecoverySpeed(
    	MemorySegment self,
    	float inSpeed
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSpeed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationRecoverySpeed].
    public final void setPenetrationRecoverySpeed(
    	float inSpeed
    ) {
    	setPenetrationRecoverySpeed(
    		this.segment,
    		inSpeed
    	);
    }
    
    /// ```
    /// Set to indicate that extra effort should be made to try to remove ghost contacts (collisions with internal edges of a mesh). This is more expensive but makes bodies move smoother over a mesh with convex edges.
    /// ```
    public static boolean getEnhancedInternalEdgeRemoval(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
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
    
    public static void setEnhancedInternalEdgeRemoval(
    	MemorySegment self,
    	boolean inApply
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inApply
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnhancedInternalEdgeRemoval].
    public final void setEnhancedInternalEdgeRemoval(
    	boolean inApply
    ) {
    	setEnhancedInternalEdgeRemoval(
    		this.segment,
    		inApply
    	);
    }
    
    /// ```
    /// Character padding
    /// ```
    public static float getCharacterPadding(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterPadding].
    public final float getCharacterPadding() {
    	return getCharacterPadding(
    		this.segment
    	);
    }
    
    /// ```
    /// Max num hits to collect in order to avoid excess of contact points collection
    /// ```
    public static int getMaxNumHits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxNumHits].
    public final int getMaxNumHits() {
    	return getMaxNumHits(
    		this.segment
    	);
    }
    
    public static void setMaxNumHits(
    	MemorySegment self,
    	int inMaxHits
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxHits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxNumHits].
    public final void setMaxNumHits(
    	int inMaxHits
    ) {
    	setMaxNumHits(
    		this.segment,
    		inMaxHits
    	);
    }
    
    /// ```
    /// Cos(angle) where angle is the maximum angle between two hits contact normals that are allowed to be merged during hit reduction. Default is around 2.5 degrees. Set to -1 to turn off.
    /// ```
    public static float getHitReductionCosMaxAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHitReductionCosMaxAngle].
    public final float getHitReductionCosMaxAngle() {
    	return getHitReductionCosMaxAngle(
    		this.segment
    	);
    }
    
    public static void setHitReductionCosMaxAngle(
    	MemorySegment self,
    	float inCosMaxAngle
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCosMaxAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHitReductionCosMaxAngle].
    public final void setHitReductionCosMaxAngle(
    	float inCosMaxAngle
    ) {
    	setHitReductionCosMaxAngle(
    		this.segment,
    		inCosMaxAngle
    	);
    }
    
    /// ```
    /// Returns if we exceeded the maximum number of hits during the last collision check and had to discard hits based on distance.
    /// This can be used to find areas that have too complex geometry for the character to navigate properly.
    /// To solve you can either increase the max number of hits or simplify the geometry. Note that the character simulation will
    /// try to do its best to select the most relevant contacts to avoid the character from getting stuck.
    /// ```
    public static boolean getMaxHitsExceeded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxHitsExceeded].
    public final boolean getMaxHitsExceeded() {
    	return getMaxHitsExceeded(
    		this.segment
    	);
    }
    
    /// ```
    /// An extra offset applied to the shape in local space. This allows applying an extra offset to the shape in local space. Note that setting it on the fly can cause the shape to teleport into collision.
    /// ```
    public static void getShapeOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeOffset].
    public final void getShapeOffset(
    	Vec3 outResult
    ) {
    	getShapeOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setShapeOffset(
    	MemorySegment self,
    	MemorySegment inShapeOffset
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShapeOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeOffset].
    public final void setShapeOffset(
    	Vec3 inShapeOffset
    ) {
    	setShapeOffset(
    		this.segment,
    		inShapeOffset.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the user data, can be used for anything by the application
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_USER_DATA.get();
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
    
    public static void setUserData(
    	MemorySegment self,
    	long inUserData
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long inUserData
    ) {
    	setUserData(
    		this.segment,
    		inUserData
    	);
    }
    
    /// ```
    /// Optional inner rigid body that proxies the character in the world. Can be used to update body properties.
    /// ```
    public static void getInnerBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerBodyID].
    public final void getInnerBodyID(
    	BodyID outResult
    ) {
    	getInnerBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// This function can be called prior to calling Update() to convert a desired velocity into a velocity that won't make the character move further onto steep slopes.
    /// This velocity can then be set on the character using SetLinearVelocity()
    /// @param inDesiredVelocity Velocity to clamp against steep walls
    /// @return A new velocity vector that won't make the character move up steep slopes
    /// ```
    public static void cancelVelocityTowardsSteepSlopes(
    	MemorySegment self,
    	MemorySegment inDesiredVelocity,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDesiredVelocity,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cancelVelocityTowardsSteepSlopes].
    public final void cancelVelocityTowardsSteepSlopes(
    	Vec3 inDesiredVelocity,
    	Vec3 outResult
    ) {
    	cancelVelocityTowardsSteepSlopes(
    		this.segment,
    		inDesiredVelocity.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// This function is internally called by Update, WalkStairs, StickToFloor and ExtendedUpdate and is responsible for tracking if contacts are added, persisted or removed.
    /// If you want to do multiple operations on a character (e.g. first Update then WalkStairs), you can surround the code with a StartTrackingContactChanges and FinishTrackingContactChanges pair
    /// to only receive a single callback per contact on the CharacterContactListener. If you don't do this then you could for example receive a contact added callback during the Update and a
    /// contact persisted callback during WalkStairs.
    /// ```
    public static void startTrackingContactChanges(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#startTrackingContactChanges].
    public final void startTrackingContactChanges() {
    	startTrackingContactChanges(
    		this.segment
    	);
    }
    
    /// ```
    /// This call triggers contact removal callbacks and is used in conjunction with StartTrackingContactChanges.
    /// ```
    public static void finishTrackingContactChanges(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#finishTrackingContactChanges].
    public final void finishTrackingContactChanges() {
    	finishTrackingContactChanges(
    		this.segment
    	);
    }
    
    /// ```
    /// This is the main update function. It moves the character according to its current velocity (the character is similar to a kinematic body in the sense
    /// that you set the velocity and the character will follow unless collision is blocking the way). Note it's your own responsibility to apply gravity to the character velocity!
    /// Different surface materials (like ice) can be emulated by getting the ground material and adjusting the velocity and/or the max slope angle accordingly every frame.
    /// @param inDeltaTime Time step to simulate.
    /// @param inGravity Gravity vector (m/s^2). This gravity vector is only used when the character is standing on top of another object to apply downward force.
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// @param inAllocator An allocator for temporary allocations. All memory will be freed by the time this function returns.
    /// ```
    public static void update(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inGravity,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inGravity,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#update].
    public final void update(
    	float inDeltaTime,
    	Vec3 inGravity,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	update(
    		this.segment,
    		inDeltaTime,
    		inGravity.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// This function will return true if the character has moved into a slope that is too steep (e.g. a vertical wall).
    /// You would call WalkStairs to attempt to step up stairs.
    /// @param inLinearVelocity The linear velocity that the player desired. This is used to determine if we're pushing into a step.
    /// ```
    public static boolean canWalkStairs(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#canWalkStairs].
    public final boolean canWalkStairs(
    	Vec3 inLinearVelocity
    ) {
    	return canWalkStairs(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// When stair walking is needed, you can call the WalkStairs function to cast up, forward and down again to try to find a valid position
    /// @param inDeltaTime Time step to simulate.
    /// @param inStepUp The direction and distance to step up (this corresponds to the max step height)
    /// @param inStepForward The direction and distance to step forward after the step up
    /// @param inStepForwardTest When running at a high frequency, inStepForward can be very small and it's likely that you hit the side of the stairs on the way down. This could produce a normal that violates the max slope angle. If this happens, we test again using this distance from the up position to see if we find a valid slope.
    /// @param inStepDownExtra An additional translation that is added when stepping down at the end. Allows you to step further down than up. Set to zero if you don't want this. Should be in the opposite direction of up.
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// @param inAllocator An allocator for temporary allocations. All memory will be freed by the time this function returns.
    /// @return true if the stair walk was successful
    /// ```
    public static boolean walkStairs(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inStepUp,
    	MemorySegment inStepForward,
    	MemorySegment inStepForwardTest,
    	MemorySegment inStepDownExtra,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_WALK_STAIRS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inDeltaTime,
    			inStepUp,
    			inStepForward,
    			inStepForwardTest,
    			inStepDownExtra,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#walkStairs].
    public final boolean walkStairs(
    	float inDeltaTime,
    	Vec3 inStepUp,
    	Vec3 inStepForward,
    	Vec3 inStepForwardTest,
    	Vec3 inStepDownExtra,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	return walkStairs(
    		this.segment,
    		inDeltaTime,
    		inStepUp.memorySegment(),
    		inStepForward.memorySegment(),
    		inStepForwardTest.memorySegment(),
    		inStepDownExtra.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// This function can be used to artificially keep the character to the floor. Normally when a character is on a small step and starts moving horizontally, the character will
    /// lose contact with the floor because the initial vertical velocity is zero while the horizontal velocity is quite high. To prevent the character from losing contact with the floor,
    /// we do an additional collision check downwards and if we find the floor within a certain distance, we project the character onto the floor.
    /// @param inStepDown Max amount to project the character downwards (if no floor is found within this distance, the function will return false)
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// @param inAllocator An allocator for temporary allocations. All memory will be freed by the time this function returns.
    /// @return True if the character was successfully projected onto the floor.
    /// ```
    public static boolean stickToFloor(
    	MemorySegment self,
    	MemorySegment inStepDown,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inStepDown,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stickToFloor].
    public final boolean stickToFloor(
    	Vec3 inStepDown,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	return stickToFloor(
    		this.segment,
    		inStepDown.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// This function combines Update, StickToFloor and WalkStairs. This function serves as an example of how these functions could be combined.
    /// Before calling, call SetLinearVelocity to update the horizontal/vertical speed of the character, typically this is:
    /// - When on OnGround and not moving away from ground: velocity = GetGroundVelocity() + horizontal speed as input by player + optional vertical jump velocity + delta time * gravity
    /// - Else: velocity = current vertical velocity + horizontal speed as input by player + delta time * gravity
    /// @param inDeltaTime Time step to simulate.
    /// @param inGravity Gravity vector (m/s^2). This gravity vector is only used when the character is standing on top of another object to apply downward force.
    /// @param inSettings A structure containing settings for the algorithm.
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// @param inAllocator An allocator for temporary allocations. All memory will be freed by the time this function returns.
    /// ```
    public static void extendedUpdate(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inGravity,
    	MemorySegment inSettings,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inGravity,
    			inSettings,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#extendedUpdate].
    public final void extendedUpdate(
    	float inDeltaTime,
    	Vec3 inGravity,
    	ExtendedUpdateSettings inSettings,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	extendedUpdate(
    		this.segment,
    		inDeltaTime,
    		inGravity.memorySegment(),
    		inSettings.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// This function can be used after a character has teleported to determine the new contacts with the world.
    /// ```
    public static void refreshContacts(
    	MemorySegment self,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#refreshContacts].
    public final void refreshContacts(
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	refreshContacts(
    		this.segment,
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// Use the ground body ID to get an updated estimate of the ground velocity. This function can be used if the ground body has moved / changed velocity and you want a new estimate of the ground velocity.
    /// It will not perform collision detection, so is less accurate than RefreshContacts but a lot faster.
    /// ```
    public static void updateGroundVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#updateGroundVelocity].
    public final void updateGroundVelocity() {
    	updateGroundVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Switch the shape of the character (e.g. for stance).
    /// @param inShape The shape to switch to.
    /// @param inMaxPenetrationDepth When inMaxPenetrationDepth is not FLT_MAX, it checks if the new shape collides before switching shape. This is the max penetration we're willing to accept after the switch.
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// @param inAllocator An allocator for temporary allocations. All memory will be freed by the time this function returns.
    /// @return Returns true if the switch succeeded.
    /// ```
    public static boolean setShape(
    	MemorySegment self,
    	MemorySegment inShape,
    	float inMaxPenetrationDepth,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inShape,
    			inMaxPenetrationDepth,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final boolean setShape(
    	Shape inShape,
    	float inMaxPenetrationDepth,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter,
    	TempAllocator inAllocator
    ) {
    	return setShape(
    		this.segment,
    		inShape.memorySegment(),
    		inMaxPenetrationDepth,
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// Updates the shape of the inner rigid body. Should be called after a successful call to SetShape.
    /// ```
    public static void setInnerBodyShape(
    	MemorySegment self,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerBodyShape].
    public final void setInnerBodyShape(
    	Shape inShape
    ) {
    	setInnerBodyShape(
    		this.segment,
    		inShape.memorySegment()
    	);
    }
    
    /// ```
    /// Get the transformed shape that represents the volume of the character, can be used for collision checks.
    /// ```
    public static void getTransformedShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransformedShape].
    public final void getTransformedShape(
    	TransformedShape outResult
    ) {
    	getTransformedShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Get all contacts for the character at a particular location.
    /// When colliding with another character virtual, this pointer will be provided through CollideShapeCollector::SetUserContext before adding a hit.
    /// @param inPosition Position to test, note that this position will be corrected for the character padding.
    /// @param inRotation Rotation at which to test the shape.
    /// @param inMovementDirection A hint in which direction the character is moving, will be used to calculate a proper normal.
    /// @param inMaxSeparationDistance How much distance around the character you want to report contacts in (can be 0 to match the character exactly).
    /// @param inShape Shape to test collision with.
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
    /// @param ioCollector Collision collector that receives the collision results.
    /// @param inBroadPhaseLayerFilter Filter that is used to check if the character collides with something in the broadphase.
    /// @param inObjectLayerFilter Filter that is used to check if a character collides with a layer.
    /// @param inBodyFilter Filter that is used to check if a character collides with a body.
    /// @param inShapeFilter Filter that is used to check if a character collides with a subshape.
    /// ```
    public static void checkCollision(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inMovementDirection,
    	float inMaxSeparationDistance,
    	MemorySegment inShape,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_CHECK_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inMovementDirection,
    			inMaxSeparationDistance,
    			inShape,
    			inBaseOffset,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#checkCollision].
    public final void checkCollision(
    	Vec3 inPosition,
    	Quat inRotation,
    	Vec3 inMovementDirection,
    	float inMaxSeparationDistance,
    	Shape inShape,
    	Vec3 inBaseOffset,
    	CollideShapeCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	checkCollision(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inMovementDirection.memorySegment(),
    		inMaxSeparationDistance,
    		inShape.memorySegment(),
    		inBaseOffset.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get the character settings that can recreate this character
    /// ```
    public static void getCharacterVirtualSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CHARACTER_VIRTUAL_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterVirtualSettings].
    public final void getCharacterVirtualSettings(
    	CharacterVirtualSettings outResult
    ) {
    	getCharacterVirtualSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the internal list of contacts that the character has found.
    /// Note that only contacts that have their mHadCollision flag set are actual contacts.
    /// ```
    public static MemorySegment getActiveContacts(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveContacts].
    public final @Nullable ContactList getActiveContacts() {
    	MemorySegment segment = getActiveContacts(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ContactList(segment);
    }
    
    /// ```
    /// Check if the character is currently in contact with or has collided with another body in the last operation (e.g. Update or WalkStairs)
    /// ```
    public static boolean hasCollidedWith(
    	MemorySegment self,
    	MemorySegment inBody
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasCollidedWith].
    public final boolean hasCollidedWith(
    	BodyID inBody
    ) {
    	return hasCollidedWith(
    		this.segment,
    		inBody.memorySegment()
    	);
    }
    
    /// ```
    /// Check if the character is currently in contact with or has collided with another character in the last time step (e.g. Update or WalkStairs)
    /// ```
    public static boolean hasCollidedWith1(
    	MemorySegment self,
    	MemorySegment inCharacterID
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inCharacterID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasCollidedWith1].
    public final boolean hasCollidedWith1(
    	CharacterID inCharacterID
    ) {
    	return hasCollidedWith1(
    		this.segment,
    		inCharacterID.memorySegment()
    	);
    }
    
    /// ```
    /// Check if the character is currently in contact with or has collided with another character in the last time step (e.g. Update or WalkStairs)
    /// ```
    public static boolean hasCollidedWith2(
    	MemorySegment self,
    	MemorySegment inCharacter
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH2.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inCharacter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasCollidedWith2].
    public final boolean hasCollidedWith2(
    	CharacterVirtual inCharacter
    ) {
    	return hasCollidedWith2(
    		this.segment,
    		inCharacter.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}