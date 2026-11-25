/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CollideSettingsBase
		permits CollideShapeSettings,
		ShapeCastSettings {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_GET_COLLECT_FACES_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_SET_COLLECT_FACES_MODE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_GET_COLLISION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_SET_COLLISION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_GET_PENETRATION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_SET_PENETRATION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MOVEMENT_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MOVEMENT_DIRECTION;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_SETTINGS_BASE_CREATE = downcallHandle("JPH_CollideSettingsBase_Create", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_DESTROY = downcallHandleVoid("JPH_CollideSettingsBase_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MODE = downcallHandle("JPH_CollideSettingsBase_GetActiveEdgeMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MODE = downcallHandleVoid("JPH_CollideSettingsBase_SetActiveEdgeMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLIDE_SETTINGS_BASE_GET_COLLECT_FACES_MODE = downcallHandle("JPH_CollideSettingsBase_GetCollectFacesMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_SET_COLLECT_FACES_MODE = downcallHandleVoid("JPH_CollideSettingsBase_SetCollectFacesMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLIDE_SETTINGS_BASE_GET_COLLISION_TOLERANCE = downcallHandle("JPH_CollideSettingsBase_GetCollisionTolerance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_SET_COLLISION_TOLERANCE = downcallHandleVoid("JPH_CollideSettingsBase_SetCollisionTolerance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SETTINGS_BASE_GET_PENETRATION_TOLERANCE = downcallHandle("JPH_CollideSettingsBase_GetPenetrationTolerance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_SET_PENETRATION_TOLERANCE = downcallHandleVoid("JPH_CollideSettingsBase_SetPenetrationTolerance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MOVEMENT_DIRECTION = downcallHandleVoid("JPH_CollideSettingsBase_GetActiveEdgeMovementDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MOVEMENT_DIRECTION = downcallHandleVoid("JPH_CollideSettingsBase_SetActiveEdgeMovementDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollideSettingsBase() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CollideSettingsBase(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollideSettingsBase(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How active edges (edges that a moving object should bump into) are handled
    /// ```
    public static int getActiveEdgeMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveEdgeMode].
    public final int getActiveEdgeMode() {
    	return getActiveEdgeMode(
    		this.segment
    	);
    }
    
    /// ```
    /// How active edges (edges that a moving object should bump into) are handled
    /// ```
    public static void setActiveEdgeMode(
    	MemorySegment self,
    	int mActiveEdgeMode
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mActiveEdgeMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setActiveEdgeMode].
    public final void setActiveEdgeMode(
    	int mActiveEdgeMode
    ) {
    	setActiveEdgeMode(
    		this.segment,
    		mActiveEdgeMode
    	);
    }
    
    /// ```
    /// If colliding faces should be collected or only the collision point
    /// ```
    public static int getCollectFacesMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_GET_COLLECT_FACES_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollectFacesMode].
    public final int getCollectFacesMode() {
    	return getCollectFacesMode(
    		this.segment
    	);
    }
    
    /// ```
    /// If colliding faces should be collected or only the collision point
    /// ```
    public static void setCollectFacesMode(
    	MemorySegment self,
    	int mCollectFacesMode
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_SET_COLLECT_FACES_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollectFacesMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollectFacesMode].
    public final void setCollectFacesMode(
    	int mCollectFacesMode
    ) {
    	setCollectFacesMode(
    		this.segment,
    		mCollectFacesMode
    	);
    }
    
    /// ```
    /// If objects are closer than this distance, they are considered to be colliding (used for GJK) (unit: meter)
    /// ```
    public static float getCollisionTolerance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_GET_COLLISION_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionTolerance].
    public final float getCollisionTolerance() {
    	return getCollisionTolerance(
    		this.segment
    	);
    }
    
    /// ```
    /// If objects are closer than this distance, they are considered to be colliding (used for GJK) (unit: meter)
    /// ```
    public static void setCollisionTolerance(
    	MemorySegment self,
    	float mCollisionTolerance
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_SET_COLLISION_TOLERANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollisionTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionTolerance].
    public final void setCollisionTolerance(
    	float mCollisionTolerance
    ) {
    	setCollisionTolerance(
    		this.segment,
    		mCollisionTolerance
    	);
    }
    
    /// ```
    /// A factor that determines the accuracy of the penetration depth calculation. If the change of the squared distance is less than tolerance * current_penetration_depth^2 the algorithm will terminate. (unit: dimensionless)
    /// ```
    public static float getPenetrationTolerance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_GET_PENETRATION_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationTolerance].
    public final float getPenetrationTolerance() {
    	return getPenetrationTolerance(
    		this.segment
    	);
    }
    
    /// ```
    /// A factor that determines the accuracy of the penetration depth calculation. If the change of the squared distance is less than tolerance * current_penetration_depth^2 the algorithm will terminate. (unit: dimensionless)
    /// ```
    public static void setPenetrationTolerance(
    	MemorySegment self,
    	float mPenetrationTolerance
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_SET_PENETRATION_TOLERANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPenetrationTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationTolerance].
    public final void setPenetrationTolerance(
    	float mPenetrationTolerance
    ) {
    	setPenetrationTolerance(
    		this.segment,
    		mPenetrationTolerance
    	);
    }
    
    /// ```
    /// When mActiveEdgeMode is CollideOnlyWithActive a movement direction can be provided. When hitting an inactive edge, the system will select the triangle normal as penetration depth only if it impedes the movement less than with the calculated penetration depth.
    /// ```
    public static void getActiveEdgeMovementDirection(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_GET_ACTIVE_EDGE_MOVEMENT_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveEdgeMovementDirection].
    public final void getActiveEdgeMovementDirection(
    	Vec3 outResult
    ) {
    	getActiveEdgeMovementDirection(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// When mActiveEdgeMode is CollideOnlyWithActive a movement direction can be provided. When hitting an inactive edge, the system will select the triangle normal as penetration depth only if it impedes the movement less than with the calculated penetration depth.
    /// ```
    public static void setActiveEdgeMovementDirection(
    	MemorySegment self,
    	MemorySegment mActiveEdgeMovementDirection
    ) {
    	MethodHandle method = JPH_COLLIDE_SETTINGS_BASE_SET_ACTIVE_EDGE_MOVEMENT_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mActiveEdgeMovementDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setActiveEdgeMovementDirection].
    public final void setActiveEdgeMovementDirection(
    	Vec3 mActiveEdgeMovementDirection
    ) {
    	setActiveEdgeMovementDirection(
    		this.segment,
    		mActiveEdgeMovementDirection.memorySegment()
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