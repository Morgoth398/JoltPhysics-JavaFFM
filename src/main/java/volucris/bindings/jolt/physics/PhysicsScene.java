/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.body.BodyCreationSettings;
import volucris.bindings.jolt.body.BodyCreationSettingsArray;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettings;
import volucris.bindings.jolt.softBody.SoftBodyCreationSettings;
import volucris.bindings.jolt.softBody.SoftBodyCreationSettingsArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsScene extends PhysicsSceneRefTarget {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_FIXED_TO_WORLD;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_ADD_BODY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_ADD_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_ADD_SOFT_BODY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_NUM_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_BODIES1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_NUM_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_CONSTRAINTS1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_NUM_SOFT_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_SOFT_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_GET_SOFT_BODIES1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CREATE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_FIX_INVALID_SCALES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_FROM_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_SCENE_CREATE = downcallHandle("JPH_PhysicsScene_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_AS_REF_TARGET = downcallHandle("JPH_PhysicsScene_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_FIXED_TO_WORLD = downcallHandle("JPH_PhysicsScene_GetFixedToWorld", JAVA_INT);
		JPH_PHYSICS_SCENE_ADD_BODY = downcallHandleVoid("JPH_PhysicsScene_AddBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_ADD_CONSTRAINT = downcallHandleVoid("JPH_PhysicsScene_AddConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_PHYSICS_SCENE_ADD_SOFT_BODY = downcallHandleVoid("JPH_PhysicsScene_AddSoftBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_NUM_BODIES = downcallHandle("JPH_PhysicsScene_GetNumBodies", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_BODIES = downcallHandle("JPH_PhysicsScene_GetBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_BODIES1 = downcallHandle("JPH_PhysicsScene_GetBodies1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_NUM_CONSTRAINTS = downcallHandle("JPH_PhysicsScene_GetNumConstraints", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_CONSTRAINTS = downcallHandle("JPH_PhysicsScene_GetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_CONSTRAINTS1 = downcallHandle("JPH_PhysicsScene_GetConstraints1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_NUM_SOFT_BODIES = downcallHandle("JPH_PhysicsScene_GetNumSoftBodies", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_SOFT_BODIES = downcallHandle("JPH_PhysicsScene_GetSoftBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_GET_SOFT_BODIES1 = downcallHandle("JPH_PhysicsScene_GetSoftBodies1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CREATE_BODIES = downcallHandle("JPH_PhysicsScene_CreateBodies", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_FIX_INVALID_SCALES = downcallHandle("JPH_PhysicsScene_FixInvalidScales", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_SAVE_BINARY_STATE = downcallHandleVoid("JPH_PhysicsScene_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_BOOLEAN);
		JPH_PHYSICS_SCENE_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_PhysicsScene_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_PhysicsScene_FromPhysicsSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_DESTROY = downcallHandleVoid("JPH_PhysicsScene_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsScene() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsScene(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsScene(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_SCENE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
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
    	MethodHandle method = JPH_PHYSICS_SCENE_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Body constant to use to indicate that the constraint is attached to the fixed world
    /// ```
    public static int getFixedToWorld() {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_FIXED_TO_WORLD.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Add a body to the scene
    /// ```
    public static void addBody(
    	MemorySegment self,
    	MemorySegment inBody
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_ADD_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addBody].
    public final void addBody(
    	BodyCreationSettings inBody
    ) {
    	addBody(
    		this.segment,
    		inBody.memorySegment()
    	);
    }
    
    /// ```
    /// Add a constraint to the scene
    /// @param inConstraint Constraint settings
    /// @param inBody1 Index in the bodies list of first body to attach constraint to
    /// @param inBody2 Index in the bodies list of the second body to attach constraint to
    /// ```
    public static void addConstraint(
    	MemorySegment self,
    	MemorySegment inConstraint,
    	int inBody1,
    	int inBody2
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_ADD_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraint,
    			inBody1,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addConstraint].
    public final void addConstraint(
    	TwoBodyConstraintSettings inConstraint,
    	int inBody1,
    	int inBody2
    ) {
    	addConstraint(
    		this.segment,
    		inConstraint.memorySegment(),
    		inBody1,
    		inBody2
    	);
    }
    
    /// ```
    /// Add a soft body to the scene
    /// ```
    public static void addSoftBody(
    	MemorySegment self,
    	MemorySegment inSoftBody
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_ADD_SOFT_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSoftBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addSoftBody].
    public final void addSoftBody(
    	SoftBodyCreationSettings inSoftBody
    ) {
    	addSoftBody(
    		this.segment,
    		inSoftBody.memorySegment()
    	);
    }
    
    /// ```
    /// Get number of bodies in this scene
    /// ```
    public static long getNumBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_NUM_BODIES.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodies].
    public final long getNumBodies() {
    	return getNumBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Access to the body settings for this scene
    /// ```
    public static MemorySegment getBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_BODIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodies].
    public final @Nullable BodyCreationSettingsArray getBodies() {
    	MemorySegment segment = getBodies(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyCreationSettingsArray(segment);
    }
    
    public static MemorySegment getBodies1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_BODIES1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodies1].
    public final @Nullable BodyCreationSettingsArray getBodies1() {
    	MemorySegment segment = getBodies1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyCreationSettingsArray(segment);
    }
    
    /// ```
    /// Get number of constraints in this scene
    /// ```
    public static long getNumConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_NUM_CONSTRAINTS.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumConstraints].
    public final long getNumConstraints() {
    	return getNumConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Access to the constraints for this scene
    /// ```
    public static MemorySegment getConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_CONSTRAINTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraints].
    public final @Nullable ConnectedConstraintArray getConstraints() {
    	MemorySegment segment = getConstraints(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ConnectedConstraintArray(segment);
    }
    
    public static MemorySegment getConstraints1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_CONSTRAINTS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraints1].
    public final @Nullable ConnectedConstraintArray getConstraints1() {
    	MemorySegment segment = getConstraints1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ConnectedConstraintArray(segment);
    }
    
    /// ```
    /// Get number of bodies in this scene
    /// ```
    public static long getNumSoftBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_NUM_SOFT_BODIES.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumSoftBodies].
    public final long getNumSoftBodies() {
    	return getNumSoftBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Access to the soft body settings for this scene
    /// ```
    public static MemorySegment getSoftBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_SOFT_BODIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSoftBodies].
    public final @Nullable SoftBodyCreationSettingsArray getSoftBodies() {
    	MemorySegment segment = getSoftBodies(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SoftBodyCreationSettingsArray(segment);
    }
    
    public static MemorySegment getSoftBodies1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_GET_SOFT_BODIES1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSoftBodies1].
    public final @Nullable SoftBodyCreationSettingsArray getSoftBodies1() {
    	MemorySegment segment = getSoftBodies1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SoftBodyCreationSettingsArray(segment);
    }
    
    /// ```
    /// Instantiate all bodies, returns false if not all bodies could be created
    /// ```
    public static boolean createBodies(
    	MemorySegment self,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CREATE_BODIES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBodies].
    public final boolean createBodies(
    	PhysicsSystem inSystem
    ) {
    	return createBodies(
    		this.segment,
    		inSystem.memorySegment()
    	);
    }
    
    /// ```
    /// Go through all body creation settings and fix shapes that are scaled incorrectly (note this will change the scene a bit).
    /// @return False when not all scales could be fixed.
    /// ```
    public static boolean fixInvalidScales(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_FIX_INVALID_SCALES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#fixInvalidScales].
    public final boolean fixInvalidScales() {
    	return fixInvalidScales(
    		this.segment
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream.
    /// @param inStream The stream to save the state to
    /// @param inSaveShapes If the shapes should be saved as well (these could be shared between physics scenes, in which case the calling application may want to write custom code to restore them)
    /// @param inSaveGroupFilter If the group filter should be saved as well (these could be shared)
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream,
    	boolean inSaveShapes,
    	boolean inSaveGroupFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			inSaveShapes,
    			inSaveGroupFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream,
    	boolean inSaveShapes,
    	boolean inSaveGroupFilter
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment(),
    		inSaveShapes,
    		inSaveGroupFilter
    	);
    }
    
    /// ```
    /// Restore a saved scene from inStream
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public static void sRestoreFromBinaryState(
    	StreamIn inStream,
    	PhysicsSceneResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// For debugging purposes: Construct a scene from the current state of the physics system
    /// ```
    public static void fromPhysicsSystem(
    	MemorySegment self,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_FROM_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#fromPhysicsSystem].
    public final void fromPhysicsSystem(
    	PhysicsSystem inSystem
    ) {
    	fromPhysicsSystem(
    		this.segment,
    		inSystem.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_DESTROY.get();
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

}