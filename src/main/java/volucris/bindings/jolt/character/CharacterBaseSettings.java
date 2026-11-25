/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.collision.shape.ShapeRefConst;
import volucris.bindings.jolt.geometry.Plane;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CharacterBaseSettings extends CharacterBaseSettingsRefTarget
		permits CharacterSettings,
		CharacterVirtualSettings {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_GET_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_SET_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_GET_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_SET_SUPPORTING_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_GET_MAX_SLOPE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_SET_MAX_SLOPE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_BASE_SETTINGS_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_BASE_SETTINGS_CREATE = downcallHandle("JPH_CharacterBaseSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_CREATE1 = downcallHandle("JPH_CharacterBaseSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_CharacterBaseSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_GET_UP = downcallHandleVoid("JPH_CharacterBaseSettings_GetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_SET_UP = downcallHandleVoid("JPH_CharacterBaseSettings_SetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_GET_SUPPORTING_VOLUME = downcallHandleVoid("JPH_CharacterBaseSettings_GetSupportingVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_SET_SUPPORTING_VOLUME = downcallHandleVoid("JPH_CharacterBaseSettings_SetSupportingVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_GET_MAX_SLOPE_ANGLE = downcallHandle("JPH_CharacterBaseSettings_GetMaxSlopeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_SET_MAX_SLOPE_ANGLE = downcallHandleVoid("JPH_CharacterBaseSettings_SetMaxSlopeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_BASE_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_CharacterBaseSettings_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_CharacterBaseSettings_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_BASE_SETTINGS_GET_SHAPE = downcallHandleVoid("JPH_CharacterBaseSettings_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_SET_SHAPE = downcallHandleVoid("JPH_CharacterBaseSettings_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_BASE_SETTINGS_DESTROY = downcallHandleVoid("JPH_CharacterBaseSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterBaseSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterBaseSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterBaseSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create1].
    public final @Nullable CharacterBaseSettings create1(
    	CharacterBaseSettings param0
    ) {
    	MemorySegment segment = create1(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterBaseSettings(segment);
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Vector indicating the up direction of the character
    /// ```
    public static void getUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_GET_UP.get();
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
    
    /// ```
    /// Vector indicating the up direction of the character
    /// ```
    public static void setUp(
    	MemorySegment self,
    	MemorySegment mUp
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_SET_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUp].
    public final void setUp(
    	Vec3 mUp
    ) {
    	setUp(
    		this.segment,
    		mUp.memorySegment()
    	);
    }
    
    /// ```
    /// Plane, defined in local space relative to the character. Every contact behind this plane can support the
    /// character, every contact in front of this plane is treated as only colliding with the player.
    /// Default: Accept any contact.
    /// ```
    public static void getSupportingVolume(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_GET_SUPPORTING_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupportingVolume].
    public final void getSupportingVolume(
    	Plane outResult
    ) {
    	getSupportingVolume(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Plane, defined in local space relative to the character. Every contact behind this plane can support the
    /// character, every contact in front of this plane is treated as only colliding with the player.
    /// Default: Accept any contact.
    /// ```
    public static void setSupportingVolume(
    	MemorySegment self,
    	MemorySegment mSupportingVolume
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_SET_SUPPORTING_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSupportingVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSupportingVolume].
    public final void setSupportingVolume(
    	Plane mSupportingVolume
    ) {
    	setSupportingVolume(
    		this.segment,
    		mSupportingVolume.memorySegment()
    	);
    }
    
    /// ```
    /// Maximum angle of slope that character can still walk on (radians).
    /// ```
    public static float getMaxSlopeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_GET_MAX_SLOPE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxSlopeAngle].
    public final float getMaxSlopeAngle() {
    	return getMaxSlopeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum angle of slope that character can still walk on (radians).
    /// ```
    public static void setMaxSlopeAngle(
    	MemorySegment self,
    	float mMaxSlopeAngle
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_SET_MAX_SLOPE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxSlopeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSlopeAngle].
    public final void setMaxSlopeAngle(
    	float mMaxSlopeAngle
    ) {
    	setMaxSlopeAngle(
    		this.segment,
    		mMaxSlopeAngle
    	);
    }
    
    /// ```
    /// Set to indicate that extra effort should be made to try to remove ghost contacts (collisions with internal edges of a mesh). This is more expensive but makes bodies move smoother over a mesh with convex edges.
    /// ```
    public static boolean getEnhancedInternalEdgeRemoval(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
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
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
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
    /// Initial shape that represents the character's volume.
    /// Usually this is a capsule, make sure the shape is made so that the bottom of the shape is at (0, 0, 0).
    /// ```
    public static void getShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_GET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final void getShape(
    	ShapeRefConst outResult
    ) {
    	getShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Initial shape that represents the character's volume.
    /// Usually this is a capsule, make sure the shape is made so that the bottom of the shape is at (0, 0, 0).
    /// ```
    public static void setShape(
    	MemorySegment self,
    	MemorySegment mShape
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_SET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final void setShape(
    	ShapeRefConst mShape
    ) {
    	setShape(
    		this.segment,
    		mShape.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_BASE_SETTINGS_DESTROY.get();
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