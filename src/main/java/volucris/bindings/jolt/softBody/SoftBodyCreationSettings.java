/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.GroupFilterToIDMap;
import volucris.bindings.jolt.IDToGroupFilterMap;
import volucris.bindings.jolt.IDToMaterialMap;
import volucris.bindings.jolt.MaterialToIDMap;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.collision.CollisionGroup;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyCreationSettings {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_SoftBodyCreationSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_CREATE1 = downcallHandle("JPH_SoftBodyCreationSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodyCreationSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA = downcallHandle("JPH_SoftBodyCreationSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER = downcallHandle("JPH_SoftBodyCreationSettings_GetObjectLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS = downcallHandle("JPH_SoftBodyCreationSettings_GetNumIterations", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetNumIterations", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING = downcallHandle("JPH_SoftBodyCreationSettings_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_SoftBodyCreationSettings_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION = downcallHandle("JPH_SoftBodyCreationSettings_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION = downcallHandle("JPH_SoftBodyCreationSettings_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE = downcallHandle("JPH_SoftBodyCreationSettings_GetPressure", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetPressure", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_SoftBodyCreationSettings_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS = downcallHandle("JPH_SoftBodyCreationSettings_GetVertexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetVertexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION = downcallHandle("JPH_SoftBodyCreationSettings_GetUpdatePosition", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetUpdatePosition", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY = downcallHandle("JPH_SoftBodyCreationSettings_GetMakeRotationIdentity", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetMakeRotationIdentity", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_SoftBodyCreationSettings_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED = downcallHandle("JPH_SoftBodyCreationSettings_GetFacesDoubleSided", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetFacesDoubleSided", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_SoftBodyCreationSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_SoftBodyCreationSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN = downcallHandleVoid("JPH_SoftBodyCreationSettings_SaveWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN = downcallHandleVoid("JPH_SoftBodyCreationSettings_sRestoreWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodyCreationSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SoftBodyCreationSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SoftBodyCreationSettings(
	    SoftBodySharedSettings inSettings,
	    Vec3 inPosition,
	    Quat inRotation,
	    short inObjectLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inPosition,
	        inRotation,
	        inObjectLayer
	    );
	}
	
	/// Typed method of [#create1].
	public SoftBodyCreationSettings(
		Arena arena,
		SoftBodySharedSettings inSettings,
		Vec3 inPosition,
		Quat inRotation,
		short inObjectLayer
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inObjectLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SoftBodyCreationSettings(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inPosition,
    			inRotation,
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Defines the configuration of this soft body
    /// ```
    public static void getSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final void getSettings(
    	SoftBodySharedSettingsRefConst outResult
    ) {
    	getSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Defines the configuration of this soft body
    /// ```
    public static void setSettings(
    	MemorySegment self,
    	MemorySegment mSettings
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSettings].
    public final void setSettings(
    	SoftBodySharedSettingsRefConst mSettings
    ) {
    	setSettings(
    		this.segment,
    		mSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Initial position of the soft body
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION.get();
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
    /// Initial position of the soft body
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION.get();
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
    /// Initial rotation of the soft body
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION.get();
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
    /// Initial rotation of the soft body
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment mRotation
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION.get();
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
    /// User data value (can be used by application)
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP.get();
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
    /// Number of solver iterations
    /// ```
    public static int getNumIterations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumIterations].
    public final int getNumIterations() {
    	return getNumIterations(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of solver iterations
    /// ```
    public static void setNumIterations(
    	MemorySegment self,
    	int mNumIterations
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumIterations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumIterations].
    public final void setNumIterations(
    	int mNumIterations
    ) {
    	setNumIterations(
    		this.segment,
    		mNumIterations
    	);
    }
    
    /// ```
    /// Linear damping: dv/dt = -mLinearDamping * v. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getLinearDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING.get();
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
    /// Linear damping: dv/dt = -mLinearDamping * v. Value should be zero or positive and is usually close to 0.
    /// ```
    public static void setLinearDamping(
    	MemorySegment self,
    	float mLinearDamping
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING.get();
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
    /// Maximum linear velocity that a vertex can reach (m/s)
    /// ```
    public static float getMaxLinearVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY.get();
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
    /// Maximum linear velocity that a vertex can reach (m/s)
    /// ```
    public static void setMaxLinearVelocity(
    	MemorySegment self,
    	float mMaxLinearVelocity
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY.get();
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
    /// Restitution when colliding
    /// ```
    public static float getRestitution(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION.get();
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
    /// Restitution when colliding
    /// ```
    public static void setRestitution(
    	MemorySegment self,
    	float mRestitution
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION.get();
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
    /// Friction coefficient when colliding
    /// ```
    public static float getFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION.get();
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
    /// Friction coefficient when colliding
    /// ```
    public static void setFriction(
    	MemorySegment self,
    	float mFriction
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION.get();
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
    /// n * R * T, amount of substance * ideal gas constant * absolute temperature, see https://en.wikipedia.org/wiki/Pressure
    /// ```
    public static float getPressure(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPressure].
    public final float getPressure() {
    	return getPressure(
    		this.segment
    	);
    }
    
    /// ```
    /// n * R * T, amount of substance * ideal gas constant * absolute temperature, see https://en.wikipedia.org/wiki/Pressure
    /// ```
    public static void setPressure(
    	MemorySegment self,
    	float mPressure
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPressure
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPressure].
    public final void setPressure(
    	float mPressure
    ) {
    	setPressure(
    		this.segment,
    		mPressure
    	);
    }
    
    /// ```
    /// Value to multiply gravity with for this body
    /// ```
    public static float getGravityFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR.get();
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
    /// How big the particles are, can be used to push the vertices a little bit away from the surface of other bodies to prevent z-fighting
    /// ```
    public static float getVertexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertexRadius].
    public final float getVertexRadius() {
    	return getVertexRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// How big the particles are, can be used to push the vertices a little bit away from the surface of other bodies to prevent z-fighting
    /// ```
    public static void setVertexRadius(
    	MemorySegment self,
    	float mVertexRadius
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVertexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVertexRadius].
    public final void setVertexRadius(
    	float mVertexRadius
    ) {
    	setVertexRadius(
    		this.segment,
    		mVertexRadius
    	);
    }
    
    /// ```
    /// Update the position of the body while simulating (set to false for something that is attached to the static world)
    /// ```
    public static boolean getUpdatePosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUpdatePosition].
    public final boolean getUpdatePosition() {
    	return getUpdatePosition(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the position of the body while simulating (set to false for something that is attached to the static world)
    /// ```
    public static void setUpdatePosition(
    	MemorySegment self,
    	boolean mUpdatePosition
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUpdatePosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUpdatePosition].
    public final void setUpdatePosition(
    	boolean mUpdatePosition
    ) {
    	setUpdatePosition(
    		this.segment,
    		mUpdatePosition
    	);
    }
    
    /// ```
    /// Bake specified mRotation in the vertices and set the body rotation to identity (simulation is slightly more accurate if the rotation of a soft body is kept to identity)
    /// ```
    public static boolean getMakeRotationIdentity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMakeRotationIdentity].
    public final boolean getMakeRotationIdentity() {
    	return getMakeRotationIdentity(
    		this.segment
    	);
    }
    
    /// ```
    /// Bake specified mRotation in the vertices and set the body rotation to identity (simulation is slightly more accurate if the rotation of a soft body is kept to identity)
    /// ```
    public static void setMakeRotationIdentity(
    	MemorySegment self,
    	boolean mMakeRotationIdentity
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMakeRotationIdentity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMakeRotationIdentity].
    public final void setMakeRotationIdentity(
    	boolean mMakeRotationIdentity
    ) {
    	setMakeRotationIdentity(
    		this.segment,
    		mMakeRotationIdentity
    	);
    }
    
    /// ```
    /// If this body can go to sleep or not
    /// ```
    public static boolean getAllowSleeping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING.get();
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
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING.get();
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
    /// If the faces in this soft body should be treated as double sided for the purpose of collision detection (ray cast / collide shape / cast shape)
    /// ```
    public static boolean getFacesDoubleSided(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFacesDoubleSided].
    public final boolean getFacesDoubleSided() {
    	return getFacesDoubleSided(
    		this.segment
    	);
    }
    
    /// ```
    /// If the faces in this soft body should be treated as double sided for the purpose of collision detection (ray cast / collide shape / cast shape)
    /// ```
    public static void setFacesDoubleSided(
    	MemorySegment self,
    	boolean mFacesDoubleSided
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFacesDoubleSided
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFacesDoubleSided].
    public final void setFacesDoubleSided(
    	boolean mFacesDoubleSided
    ) {
    	setFacesDoubleSided(
    		this.segment,
    		mFacesDoubleSided
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream. Doesn't store the shared settings nor the group filter.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_BINARY_STATE.get();
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
    /// Restore the state of this object from inStream. Doesn't restore the shared settings nor the group filter.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_RESTORE_BINARY_STATE.get();
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
    /// Save this body creation settings, its shared settings and group filter. Pass in an empty map in ioSharedSettingsMap / ioMaterialMap / ioGroupFilterMap or reuse the same map while saving multiple shapes to the same stream in order to avoid writing duplicates.
    /// Pass nullptr to ioSharedSettingsMap and ioMaterial map to skip saving shared settings and materials
    /// Pass nullptr to ioGroupFilterMap to skip saving group filters
    /// ```
    public static void saveWithChildren(
    	MemorySegment self,
    	MemorySegment inStream,
    	MemorySegment ioSharedSettingsMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment ioGroupFilterMap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SAVE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			ioSharedSettingsMap,
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
    	SharedSettingsToIDMap ioSharedSettingsMap,
    	MaterialToIDMap ioMaterialMap,
    	GroupFilterToIDMap ioGroupFilterMap
    ) {
    	saveWithChildren(
    		this.segment,
    		inStream.memorySegment(),
    		ioSharedSettingsMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		ioGroupFilterMap.memorySegment()
    	);
    }
    
    /// ```
    /// Restore a shape, all its children and materials. Pass in an empty map in ioSharedSettingsMap / ioMaterialMap / ioGroupFilterMap or reuse the same map while reading multiple shapes from the same stream in order to restore duplicates.
    /// ```
    public static void sRestoreWithChildren(
    	MemorySegment inStream,
    	MemorySegment ioSharedSettingsMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment ioGroupFilterMap,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_S_RESTORE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			ioSharedSettingsMap,
    			ioMaterialMap,
    			ioGroupFilterMap,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreWithChildren].
    public static void sRestoreWithChildren(
    	StreamIn inStream,
    	IDToSharedSettingsMap ioSharedSettingsMap,
    	IDToMaterialMap ioMaterialMap,
    	IDToGroupFilterMap ioGroupFilterMap,
    	SBCSResult outResult
    ) {
    	sRestoreWithChildren(
    		inStream.memorySegment(),
    		ioSharedSettingsMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		ioGroupFilterMap.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}