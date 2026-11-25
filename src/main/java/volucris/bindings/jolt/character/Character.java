/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.TransformedShape;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Character extends CharacterBase {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_AS_CHARACTER_BASE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_POST_SIMULATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_POSITION_AND_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_POSITION_AND_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_LAYER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LAYER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CHECK_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_CHARACTER_SETTINGS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_CREATE = downcallHandle("JPH_Character_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_AS_CHARACTER_BASE = downcallHandle("JPH_Character_AsCharacterBase", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_AddToPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_RemoveFromPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ACTIVATE = downcallHandleVoid("JPH_Character_Activate", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_POST_SIMULATION = downcallHandleVoid("JPH_Character_PostSimulation", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_GetLinearVelocity", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_AddLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ADD_IMPULSE = downcallHandleVoid("JPH_Character_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_BODY_ID = downcallHandleVoid("JPH_Character_GetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_GetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_SetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_POSITION = downcallHandleVoid("JPH_Character_GetPosition", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SET_POSITION = downcallHandleVoid("JPH_Character_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_ROTATION = downcallHandleVoid("JPH_Character_GetRotation", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SET_ROTATION = downcallHandleVoid("JPH_Character_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Character_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Character_GetWorldTransform", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_GET_LAYER = downcallHandle("JPH_Character_GetLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SET_LAYER = downcallHandleVoid("JPH_Character_SetLayer", UNBOUNDED_ADDRESS, JAVA_SHORT, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_SHAPE = downcallHandle("JPH_Character_SetShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_Character_GetTransformedShape", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CHECK_COLLISION = downcallHandleVoid("JPH_Character_CheckCollision", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_CHARACTER_SETTINGS = downcallHandleVoid("JPH_Character_GetCharacterSettings", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Character(
	    CharacterSettings inSettings,
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
	public Character(
		Arena arena,
		CharacterSettings inSettings,
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

	public Character(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterBase(segment));
	}

    /// ```
    /// Constructor
    /// @param inSettings The settings for the character
    /// @param inPosition Initial position for the character
    /// @param inRotation Initial rotation for the character (usually only around Y)
    /// @param inUserData Application specific value
    /// @param inSystem Physics system that this character will be added to later
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	long inUserData,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_CHARACTER_CREATE.get();
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
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterBase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_AS_CHARACTER_BASE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Add bodies and constraints to the system and optionally activate the bodies
    /// ```
    public static void addToPhysicsSystem(
    	MemorySegment self,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inActivationMode,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addToPhysicsSystem].
    public final void addToPhysicsSystem(
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	addToPhysicsSystem(
    		this.segment,
    		inActivationMode,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Remove bodies and constraints from the system
    /// ```
    public static void removeFromPhysicsSystem(
    	MemorySegment self,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeFromPhysicsSystem].
    public final void removeFromPhysicsSystem(
    	boolean inLockBodies
    ) {
    	removeFromPhysicsSystem(
    		this.segment,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Wake up the character
    /// ```
    public static void activate(
    	MemorySegment self,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_ACTIVATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activate].
    public final void activate(
    	boolean inLockBodies
    ) {
    	activate(
    		this.segment,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Needs to be called after every PhysicsSystem::Update
    /// @param inMaxSeparationDistance Max distance between the floor and the character to still consider the character standing on the floor
    /// @param inLockBodies If the collision query should use the locking body interface (true) or the non locking body interface (false)
    /// ```
    public static void postSimulation(
    	MemorySegment self,
    	float inMaxSeparationDistance,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_POST_SIMULATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxSeparationDistance,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#postSimulation].
    public final void postSimulation(
    	float inMaxSeparationDistance,
    	boolean inLockBodies
    ) {
    	postSimulation(
    		this.segment,
    		inMaxSeparationDistance,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Control the velocity of the character
    /// ```
    public static void setLinearAndAngularVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	MemorySegment inAngularVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inAngularVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearAndAngularVelocity].
    public final void setLinearAndAngularVelocity(
    	Vec3 inLinearVelocity,
    	Vec3 inAngularVelocity,
    	boolean inLockBodies
    ) {
    	setLinearAndAngularVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inAngularVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the linear velocity of the character (m / s)
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	boolean inLockBodies,
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the linear velocity of the character (m / s)
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 inLinearVelocity,
    	boolean inLockBodies
    ) {
    	setLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Add world space linear velocity to current velocity (m / s)
    /// ```
    public static void addLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_ADD_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addLinearVelocity].
    public final void addLinearVelocity(
    	Vec3 inLinearVelocity,
    	boolean inLockBodies
    ) {
    	addLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Add impulse to the center of mass of the character
    /// ```
    public static void addImpulse(
    	MemorySegment self,
    	MemorySegment inImpulse,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_ADD_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inImpulse,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse].
    public final void addImpulse(
    	Vec3 inImpulse,
    	boolean inLockBodies
    ) {
    	addImpulse(
    		this.segment,
    		inImpulse.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the body associated with this character
    /// ```
    public static void getBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyID].
    public final void getBodyID(
    	BodyID outResult
    ) {
    	getBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get position / rotation of the body
    /// ```
    public static void getPositionAndRotation(
    	MemorySegment self,
    	MemorySegment outPosition,
    	MemorySegment outRotation,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_POSITION_AND_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outPosition,
    			outRotation,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionAndRotation].
    public final void getPositionAndRotation(
    	Vec3 outPosition,
    	Quat outRotation,
    	boolean inLockBodies
    ) {
    	getPositionAndRotation(
    		this.segment,
    		outPosition.memorySegment(),
    		outRotation.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Set the position / rotation of the body, optionally activating it.
    /// ```
    public static void setPositionAndRotation(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_POSITION_AND_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inActivationMode,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionAndRotation].
    public final void setPositionAndRotation(
    	Vec3 inPosition,
    	Quat inRotation,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	setPositionAndRotation(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inActivationMode,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the position of the character
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	boolean inLockBodies,
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the position of the character, optionally activating it.
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment inPosition,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inActivationMode,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 inPosition,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	setPosition(
    		this.segment,
    		inPosition.memorySegment(),
    		inActivationMode,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the rotation of the character
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	boolean inLockBodies,
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the rotation of the character, optionally activating it.
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inRotation,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRotation,
    			inActivationMode,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Quat inRotation,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	setRotation(
    		this.segment,
    		inRotation.memorySegment(),
    		inActivationMode,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Position of the center of mass of the underlying rigid body
    /// ```
    public static void getCenterOfMassPosition(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassPosition].
    public final void getCenterOfMassPosition(
    	boolean inLockBodies,
    	Vec3 outResult
    ) {
    	getCenterOfMassPosition(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the world transform of the character
    /// ```
    public static void getWorldTransform(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldTransform].
    public final void getWorldTransform(
    	boolean inLockBodies,
    	Mat44 outResult
    ) {
    	getWorldTransform(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the layer of the character
    /// ```
    public static short getLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLayer].
    public final short getLayer() {
    	return getLayer(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the layer of the character
    /// ```
    public static void setLayer(
    	MemorySegment self,
    	short inLayer,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLayer,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLayer].
    public final void setLayer(
    	short inLayer,
    	boolean inLockBodies
    ) {
    	setLayer(
    		this.segment,
    		inLayer,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Switch the shape of the character (e.g. for stance). When inMaxPenetrationDepth is not FLT_MAX, it checks
    /// if the new shape collides before switching shape. Returns true if the switch succeeded.
    /// ```
    public static boolean setShape(
    	MemorySegment self,
    	MemorySegment inShape,
    	float inMaxPenetrationDepth,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_SET_SHAPE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inShape,
    			inMaxPenetrationDepth,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final boolean setShape(
    	Shape inShape,
    	float inMaxPenetrationDepth,
    	boolean inLockBodies
    ) {
    	return setShape(
    		this.segment,
    		inShape.memorySegment(),
    		inMaxPenetrationDepth,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the transformed shape that represents the volume of the character, can be used for collision checks.
    /// ```
    public static void getTransformedShape(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransformedShape].
    public final void getTransformedShape(
    	boolean inLockBodies,
    	TransformedShape outResult
    ) {
    	getTransformedShape(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Get all contacts for the character at a particular location
    /// @param inPosition Position to test.
    /// @param inRotation Rotation at which to test the shape.
    /// @param inMovementDirection A hint in which direction the character is moving, will be used to calculate a proper normal.
    /// @param inMaxSeparationDistance How much distance around the character you want to report contacts in (can be 0 to match the character exactly).
    /// @param inShape Shape to test collision with.
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
    /// @param ioCollector Collision collector that receives the collision results.
    /// @param inLockBodies If the collision query should use the locking body interface (true) or the non locking body interface (false)
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
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_CHARACTER_CHECK_COLLISION.get();
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
    			inLockBodies
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
    	boolean inLockBodies
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
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the character settings that can recreate this character
    /// ```
    public static void getCharacterSettings(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_GET_CHARACTER_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterSettings].
    public final void getCharacterSettings(
    	boolean inLockBodies,
    	CharacterSettings outResult
    ) {
    	getCharacterSettings(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}