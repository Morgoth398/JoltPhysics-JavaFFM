/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.geometry.Plane;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CharacterBase extends CharacterBaseRefTarget
		permits Character,
		CharacterVirtual {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SET_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SET_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_S_TO_STRING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_STATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_IS_SUPPORTED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_GET_GROUND_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_RESTORE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_BASE_CREATE = downcallHandle("JPH_CharacterBase_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_AS_REF_TARGET = downcallHandle("JPH_CharacterBase_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE = downcallHandleVoid("JPH_CharacterBase_SetMaxSlopeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE = downcallHandle("JPH_CharacterBase_GetCosMaxSlopeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SET_UP = downcallHandleVoid("JPH_CharacterBase_SetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_UP = downcallHandleVoid("JPH_CharacterBase_GetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_SUPPORTING_VOLUME = downcallHandle("JPH_CharacterBase_GetSupportingVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SET_SUPPORTING_VOLUME = downcallHandleVoid("JPH_CharacterBase_SetSupportingVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP = downcallHandle("JPH_CharacterBase_IsSlopeTooSteep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_SHAPE = downcallHandle("JPH_CharacterBase_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_S_TO_STRING = downcallHandle("JPH_CharacterBase_sToString", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_BASE_GET_GROUND_STATE = downcallHandle("JPH_CharacterBase_GetGroundState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_IS_SUPPORTED = downcallHandle("JPH_CharacterBase_IsSupported", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_POSITION = downcallHandleVoid("JPH_CharacterBase_GetGroundPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_NORMAL = downcallHandleVoid("JPH_CharacterBase_GetGroundNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterBase_GetGroundVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_MATERIAL = downcallHandle("JPH_CharacterBase_GetGroundMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_BODY_ID = downcallHandleVoid("JPH_CharacterBase_GetGroundBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID = downcallHandleVoid("JPH_CharacterBase_GetGroundSubShapeID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_USER_DATA = downcallHandle("JPH_CharacterBase_GetGroundUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SAVE_STATE = downcallHandleVoid("JPH_CharacterBase_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_RESTORE_STATE = downcallHandleVoid("JPH_CharacterBase_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_DESTROY = downcallHandleVoid("JPH_CharacterBase_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterBase(
	    CharacterBaseSettings inSettings,
	    PhysicsSystem inSystem
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inSystem
	    );
	}
	
	/// Typed method of [#create].
	public CharacterBase(
		Arena arena,
		CharacterBaseSettings inSettings,
		PhysicsSystem inSystem
	) {
		MemorySegment segment = create(
			inSettings.memorySegment(),
			inSystem.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterBase(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Set the maximum angle of slope that character can still walk on (radians)
    /// ```
    public static void setMaxSlopeAngle(
    	MemorySegment self,
    	float inMaxSlopeAngle
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxSlopeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSlopeAngle].
    public final void setMaxSlopeAngle(
    	float inMaxSlopeAngle
    ) {
    	setMaxSlopeAngle(
    		this.segment,
    		inMaxSlopeAngle
    	);
    }
    
    public static float getCosMaxSlopeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCosMaxSlopeAngle].
    public final float getCosMaxSlopeAngle() {
    	return getCosMaxSlopeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the up vector for the character
    /// ```
    public static void setUp(
    	MemorySegment self,
    	MemorySegment inUp
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SET_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUp].
    public final void setUp(
    	Vec3 inUp
    ) {
    	setUp(
    		this.segment,
    		inUp.memorySegment()
    	);
    }
    
    public static void getUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUp].
    public final void getUp(
    	Vec3 outResult
    ) {
    	getUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static MemorySegment getSupportingVolume(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_SUPPORTING_VOLUME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupportingVolume].
    public final @Nullable Plane getSupportingVolume() {
    	MemorySegment segment = getSupportingVolume(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Plane(segment);
    }
    
    public static void setSupportingVolume(
    	MemorySegment self,
    	MemorySegment inPlane
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SET_SUPPORTING_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPlane
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSupportingVolume].
    public final void setSupportingVolume(
    	Plane inPlane
    ) {
    	setSupportingVolume(
    		this.segment,
    		inPlane.memorySegment()
    	);
    }
    
    /// ```
    /// Check if the normal of the ground surface is too steep to walk on
    /// ```
    public static boolean isSlopeTooSteep(
    	MemorySegment self,
    	MemorySegment inNormal
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSlopeTooSteep].
    public final boolean isSlopeTooSteep(
    	Vec3 inNormal
    ) {
    	return isSlopeTooSteep(
    		this.segment,
    		inNormal.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current shape that the character is using.
    /// ```
    public static MemorySegment getShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_SHAPE.get();
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
    
    /// ```
    /// Debug function to convert enum values to string
    /// ```
    public static MemorySegment nsToString(
    	int inState
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_S_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nsToString].
    public final @Nullable NativeByteArray sToString(
    	int inState
    ) {
    	MemorySegment segment = nsToString(
    		inState
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// Current ground state
    /// ```
    public static int getGroundState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundState].
    public final int getGroundState() {
    	return getGroundState(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns true if the player is supported by normal or steep ground
    /// ```
    public static boolean isSupported(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_IS_SUPPORTED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSupported].
    public final boolean isSupported() {
    	return isSupported(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the contact point with the ground
    /// ```
    public static void getGroundPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundPosition].
    public final void getGroundPosition(
    	Vec3 outResult
    ) {
    	getGroundPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the contact normal with the ground
    /// ```
    public static void getGroundNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundNormal].
    public final void getGroundNormal(
    	Vec3 outResult
    ) {
    	getGroundNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity in world space of ground
    /// ```
    public static void getGroundVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundVelocity].
    public final void getGroundVelocity(
    	Vec3 outResult
    ) {
    	getGroundVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Material that the character is standing on
    /// ```
    public static MemorySegment getGroundMaterial(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundMaterial].
    public final @Nullable PhysicsMaterial getGroundMaterial() {
    	MemorySegment segment = getGroundMaterial(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// BodyID of the object the character is standing on. Note may have been removed!
    /// ```
    public static void getGroundBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundBodyID].
    public final void getGroundBodyID(
    	BodyID outResult
    ) {
    	getGroundBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub part of the body that we're standing on.
    /// ```
    public static void getGroundSubShapeID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundSubShapeID].
    public final void getGroundSubShapeID(
    	SubShapeID outResult
    ) {
    	getGroundSubShapeID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// User data value of the body that we're standing on
    /// ```
    public static long getGroundUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGroundUserData].
    public final long getGroundUserData() {
    	return getGroundUserData(
    		this.segment
    	);
    }
    
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
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