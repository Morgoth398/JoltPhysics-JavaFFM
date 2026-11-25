/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.TempAllocator;
import volucris.bindings.jolt.Vec3StridedPtr;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.body.MotionProperties;
import volucris.bindings.jolt.collision.PhysicsMaterialList;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyMotionProperties extends MotionProperties {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_AS_MOTION_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_INITIALIZE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_NUM_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_NUM_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_PRESSURE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_PRESSURE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_UPDATE_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_UPDATE_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES_DOUBLE_SIDED;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_FACES_DOUBLE_SIDED;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ENABLE_SKIN_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_ENABLE_SKIN_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_MAX_DISTANCE_MULTIPLIER;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_SKINNED_MAX_DISTANCE_MULTIPLIER;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SET_VERTEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_LOCAL_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_CALCULATE_MASS_AND_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTEX_VELOCITIES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_EDGE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_RODS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_STATES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_BEND_TWIST_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_BEND_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VOLUME_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_SKIN_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_LRACONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_PREDICTED_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_RESTORE_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_SKIN_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_PREVIOUS_POSITIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_POSITIONS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_NORMALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_CUSTOM_UPDATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MOTION_PROPERTIES_REQUEST_CONTACT_CALLBACK;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_MOTION_PROPERTIES_CREATE = downcallHandle("JPH_SoftBodyMotionProperties_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_AS_MOTION_PROPERTIES = downcallHandle("JPH_SoftBodyMotionProperties_AsMotionProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_INITIALIZE = downcallHandleVoid("JPH_SoftBodyMotionProperties_Initialize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SETTINGS = downcallHandle("JPH_SoftBodyMotionProperties_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES = downcallHandle("JPH_SoftBodyMotionProperties_GetVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES1 = downcallHandle("JPH_SoftBodyMotionProperties_GetVertices1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX = downcallHandle("JPH_SoftBodyMotionProperties_GetVertex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX1 = downcallHandle("JPH_SoftBodyMotionProperties_GetVertex1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ROTATION = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetRodRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ANGULAR_VELOCITY = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetRodAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_MATERIALS = downcallHandle("JPH_SoftBodyMotionProperties_GetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES = downcallHandle("JPH_SoftBodyMotionProperties_GetFaces", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACE = downcallHandle("JPH_SoftBodyMotionProperties_GetFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_NUM_ITERATIONS = downcallHandle("JPH_SoftBodyMotionProperties_GetNumIterations", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_NUM_ITERATIONS = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetNumIterations", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_PRESSURE = downcallHandle("JPH_SoftBodyMotionProperties_GetPressure", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_PRESSURE = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetPressure", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_UPDATE_POSITION = downcallHandle("JPH_SoftBodyMotionProperties_GetUpdatePosition", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_UPDATE_POSITION = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetUpdatePosition", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES_DOUBLE_SIDED = downcallHandle("JPH_SoftBodyMotionProperties_GetFacesDoubleSided", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_FACES_DOUBLE_SIDED = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetFacesDoubleSided", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ENABLE_SKIN_CONSTRAINTS = downcallHandle("JPH_SoftBodyMotionProperties_GetEnableSkinConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_ENABLE_SKIN_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetEnableSkinConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_MAX_DISTANCE_MULTIPLIER = downcallHandle("JPH_SoftBodyMotionProperties_GetSkinnedMaxDistanceMultiplier", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_SKINNED_MAX_DISTANCE_MULTIPLIER = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetSkinnedMaxDistanceMultiplier", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX_RADIUS = downcallHandle("JPH_SoftBodyMotionProperties_GetVertexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SET_VERTEX_RADIUS = downcallHandleVoid("JPH_SoftBodyMotionProperties_SetVertexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_LOCAL_BOUNDS = downcallHandle("JPH_SoftBodyMotionProperties_GetLocalBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VOLUME = downcallHandle("JPH_SoftBodyMotionProperties_GetVolume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_CALCULATE_MASS_AND_INERTIA = downcallHandleVoid("JPH_SoftBodyMotionProperties_CalculateMassAndInertia", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTICES = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTEX_VELOCITIES = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawVertexVelocities", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_EDGE_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawEdgeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_RODS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawRods", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_STATES = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawRodStates", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_BEND_TWIST_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawRodBendTwistConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_BEND_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawBendConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VOLUME_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawVolumeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_SKIN_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawSkinConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_LRACONSTRAINTS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawLRAConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_PREDICTED_BOUNDS = downcallHandleVoid("JPH_SoftBodyMotionProperties_DrawPredictedBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SAVE_STATE = downcallHandleVoid("JPH_SoftBodyMotionProperties_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_RESTORE_STATE = downcallHandleVoid("JPH_SoftBodyMotionProperties_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_SKIN_VERTICES = downcallHandleVoid("JPH_SoftBodyMotionProperties_SkinVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_TRANSFORM = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetSkinnedVertexTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_PREVIOUS_POSITIONS = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetSkinnedVertexPreviousPositions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_POSITIONS = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetSkinnedVertexPositions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_NORMALS = downcallHandleVoid("JPH_SoftBodyMotionProperties_GetSkinnedVertexNormals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_CUSTOM_UPDATE = downcallHandleVoid("JPH_SoftBodyMotionProperties_CustomUpdate", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MOTION_PROPERTIES_REQUEST_CONTACT_CALLBACK = downcallHandleVoid("JPH_SoftBodyMotionProperties_RequestContactCallback", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodyMotionProperties() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SoftBodyMotionProperties(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asMotionProperties(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SoftBodyMotionProperties(MemorySegment segment) {
		this.segment = segment;
		super(asMotionProperties(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asMotionProperties(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_AS_MOTION_PROPERTIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Initialize the soft body motion properties
    /// ```
    public static void initialize(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_INITIALIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#initialize].
    public final void initialize(
    	SoftBodyCreationSettings inSettings
    ) {
    	initialize(
    		this.segment,
    		inSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Get the shared settings of the soft body
    /// ```
    public static MemorySegment getSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final @Nullable SoftBodySharedSettings getSettings() {
    	MemorySegment segment = getSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SoftBodySharedSettings(segment);
    }
    
    /// ```
    /// Get the vertices of the soft body
    /// ```
    public static MemorySegment getVertices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertices].
    public final @Nullable VertexArray getVertices() {
    	MemorySegment segment = getVertices(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VertexArray(segment);
    }
    
    public static MemorySegment getVertices1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTICES1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertices1].
    public final @Nullable VertexArray getVertices1() {
    	MemorySegment segment = getVertices1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VertexArray(segment);
    }
    
    /// ```
    /// Access an individual vertex
    /// ```
    public static MemorySegment getVertex(
    	MemorySegment self,
    	int inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex].
    public final @Nullable Vertex getVertex(
    	int inIndex
    ) {
    	MemorySegment segment = getVertex(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vertex(segment);
    }
    
    public static MemorySegment getVertex1(
    	MemorySegment self,
    	int inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex1].
    public final @Nullable Vertex getVertex1(
    	int inIndex
    ) {
    	MemorySegment segment = getVertex1(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vertex(segment);
    }
    
    /// ```
    /// Access to the state of rods
    /// ```
    public static void getRodRotation(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodRotation].
    public final void getRodRotation(
    	int inIndex,
    	Quat outResult
    ) {
    	getRodRotation(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    public static void getRodAngularVelocity(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ROD_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodAngularVelocity].
    public final void getRodAngularVelocity(
    	int inIndex,
    	Vec3 outResult
    ) {
    	getRodAngularVelocity(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the materials of the soft body
    /// ```
    public static MemorySegment getMaterials(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_MATERIALS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterials].
    public final @Nullable PhysicsMaterialList getMaterials() {
    	MemorySegment segment = getMaterials(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterialList(segment);
    }
    
    /// ```
    /// Get the faces of the soft body
    /// ```
    public static MemorySegment getFaces(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFaces].
    public final @Nullable FaceArray getFaces() {
    	MemorySegment segment = getFaces(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new FaceArray(segment);
    }
    
    /// ```
    /// Access to an individual face
    /// ```
    public static MemorySegment getFace(
    	MemorySegment self,
    	int inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFace].
    public final @Nullable Face getFace(
    	int inIndex
    ) {
    	MemorySegment segment = getFace(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Face(segment);
    }
    
    /// ```
    /// Get the number of solver iterations
    /// ```
    public static int getNumIterations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_NUM_ITERATIONS.get();
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
    
    public static void setNumIterations(
    	MemorySegment self,
    	int inNumIterations
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_NUM_ITERATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNumIterations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumIterations].
    public final void setNumIterations(
    	int inNumIterations
    ) {
    	setNumIterations(
    		this.segment,
    		inNumIterations
    	);
    }
    
    /// ```
    /// Get the pressure of the soft body
    /// ```
    public static float getPressure(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_PRESSURE.get();
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
    
    public static void setPressure(
    	MemorySegment self,
    	float inPressure
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_PRESSURE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPressure
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPressure].
    public final void setPressure(
    	float inPressure
    ) {
    	setPressure(
    		this.segment,
    		inPressure
    	);
    }
    
    /// ```
    /// Update the position of the body while simulating (set to false for something that is attached to the static world)
    /// ```
    public static boolean getUpdatePosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_UPDATE_POSITION.get();
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
    
    public static void setUpdatePosition(
    	MemorySegment self,
    	boolean inUpdatePosition
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_UPDATE_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUpdatePosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUpdatePosition].
    public final void setUpdatePosition(
    	boolean inUpdatePosition
    ) {
    	setUpdatePosition(
    		this.segment,
    		inUpdatePosition
    	);
    }
    
    /// ```
    /// If the faces in this soft body should be treated as double sided for the purpose of collision detection (ray cast / collide shape / cast shape)
    /// ```
    public static boolean getFacesDoubleSided(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_FACES_DOUBLE_SIDED.get();
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
    
    public static void setFacesDoubleSided(
    	MemorySegment self,
    	boolean inDoubleSided
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_FACES_DOUBLE_SIDED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDoubleSided
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFacesDoubleSided].
    public final void setFacesDoubleSided(
    	boolean inDoubleSided
    ) {
    	setFacesDoubleSided(
    		this.segment,
    		inDoubleSided
    	);
    }
    
    /// ```
    /// Global setting to turn on/off skin constraints
    /// ```
    public static boolean getEnableSkinConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_ENABLE_SKIN_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnableSkinConstraints].
    public final boolean getEnableSkinConstraints() {
    	return getEnableSkinConstraints(
    		this.segment
    	);
    }
    
    public static void setEnableSkinConstraints(
    	MemorySegment self,
    	boolean inEnableSkinConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_ENABLE_SKIN_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inEnableSkinConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnableSkinConstraints].
    public final void setEnableSkinConstraints(
    	boolean inEnableSkinConstraints
    ) {
    	setEnableSkinConstraints(
    		this.segment,
    		inEnableSkinConstraints
    	);
    }
    
    /// ```
    /// Multiplier applied to Skinned::mMaxDistance to allow tightening or loosening of the skin constraints. 0 to hard skin all vertices.
    /// ```
    public static float getSkinnedMaxDistanceMultiplier(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_MAX_DISTANCE_MULTIPLIER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedMaxDistanceMultiplier].
    public final float getSkinnedMaxDistanceMultiplier() {
    	return getSkinnedMaxDistanceMultiplier(
    		this.segment
    	);
    }
    
    public static void setSkinnedMaxDistanceMultiplier(
    	MemorySegment self,
    	float inSkinnedMaxDistanceMultiplier
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_SKINNED_MAX_DISTANCE_MULTIPLIER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSkinnedMaxDistanceMultiplier
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSkinnedMaxDistanceMultiplier].
    public final void setSkinnedMaxDistanceMultiplier(
    	float inSkinnedMaxDistanceMultiplier
    ) {
    	setSkinnedMaxDistanceMultiplier(
    		this.segment,
    		inSkinnedMaxDistanceMultiplier
    	);
    }
    
    /// ```
    /// How big the particles are, can be used to push the vertices a little bit away from the surface of other bodies to prevent z-fighting
    /// ```
    public static float getVertexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VERTEX_RADIUS.get();
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
    
    public static void setVertexRadius(
    	MemorySegment self,
    	float inVertexRadius
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SET_VERTEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVertexRadius].
    public final void setVertexRadius(
    	float inVertexRadius
    ) {
    	setVertexRadius(
    		this.segment,
    		inVertexRadius
    	);
    }
    
    /// ```
    /// Get local bounding box
    /// ```
    public static MemorySegment getLocalBounds(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_LOCAL_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalBounds].
    public final @Nullable AABox getLocalBounds() {
    	MemorySegment segment = getLocalBounds(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABox(segment);
    }
    
    /// ```
    /// Get the volume of the soft body. Note can become negative if the shape is inside out!
    /// ```
    public static float getVolume(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVolume].
    public final float getVolume() {
    	return getVolume(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate the total mass and inertia of this body based on the current state of the vertices
    /// ```
    public static void calculateMassAndInertia(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_CALCULATE_MASS_AND_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateMassAndInertia].
    public final void calculateMassAndInertia() {
    	calculateMassAndInertia(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the state of a soft body
    /// ```
    public static void drawVertices(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawVertices].
    public final void drawVertices(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform
    ) {
    	drawVertices(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment()
    	);
    }
    
    public static void drawVertexVelocities(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VERTEX_VELOCITIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawVertexVelocities].
    public final void drawVertexVelocities(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform
    ) {
    	drawVertexVelocities(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment()
    	);
    }
    
    public static void drawEdgeConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_EDGE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawEdgeConstraints].
    public final void drawEdgeConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawEdgeConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawRods(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_RODS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawRods].
    public final void drawRods(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawRods(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawRodStates(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_STATES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawRodStates].
    public final void drawRodStates(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawRodStates(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawRodBendTwistConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_ROD_BEND_TWIST_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawRodBendTwistConstraints].
    public final void drawRodBendTwistConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawRodBendTwistConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawBendConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_BEND_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawBendConstraints].
    public final void drawBendConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawBendConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawVolumeConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_VOLUME_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawVolumeConstraints].
    public final void drawVolumeConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawVolumeConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawSkinConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_SKIN_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawSkinConstraints].
    public final void drawSkinConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawSkinConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawLRAConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_LRACONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawLRAConstraints].
    public final void drawLRAConstraints(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	int inConstraintColor
    ) {
    	drawLRAConstraints(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inConstraintColor
    	);
    }
    
    public static void drawPredictedBounds(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_DRAW_PREDICTED_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawPredictedBounds].
    public final void drawPredictedBounds(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform
    ) {
    	drawPredictedBounds(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment()
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SAVE_STATE.get();
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
    
    /// ```
    /// Restoring state for replay
    /// ```
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_RESTORE_STATE.get();
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
    
    /// ```
    /// Skin vertices to supplied joints, information is used by the skinned constraints.
    /// @param inCenterOfMassTransform Value of Body::GetCenterOfMassTransform().
    /// @param inJointMatrices The joint matrices must be expressed relative to inCenterOfMassTransform.
    /// @param inNumJoints Indicates how large the inJointMatrices array is (used only for validating out of bounds).
    /// @param inHardSkinAll Can be used to position all vertices on the skinned vertices and can be used to hard reset the soft body.
    /// @param ioTempAllocator Allocator.
    /// ```
    public static void skinVertices(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inJointMatrices,
    	int inNumJoints,
    	boolean inHardSkinAll,
    	MemorySegment ioTempAllocator
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_SKIN_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			inJointMatrices,
    			inNumJoints,
    			inHardSkinAll,
    			ioTempAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#skinVertices].
    public final void skinVertices(
    	Mat44 inCenterOfMassTransform,
    	Mat44 inJointMatrices,
    	int inNumJoints,
    	boolean inHardSkinAll,
    	TempAllocator ioTempAllocator
    ) {
    	skinVertices(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		inJointMatrices.memorySegment(),
    		inNumJoints,
    		inHardSkinAll,
    		ioTempAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// After calling SkinVertices, this gives access to the vertex positions and normals. This matrix takes the local space vertices to world space.
    /// ```
    public static void getSkinnedVertexTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedVertexTransform].
    public final void getSkinnedVertexTransform(
    	Mat44 outResult
    ) {
    	getSkinnedVertexTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the previous skinned position. During the simulation the skin constraints move from this position to the 'current position'. One entry per simulated vertex.
    /// ```
    public static void getSkinnedVertexPreviousPositions(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_PREVIOUS_POSITIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedVertexPreviousPositions].
    public final void getSkinnedVertexPreviousPositions(
    	Vec3StridedPtr outResult
    ) {
    	getSkinnedVertexPreviousPositions(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the current skinned position. One entry per simulated vertex.
    /// ```
    public static void getSkinnedVertexPositions(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_POSITIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedVertexPositions].
    public final void getSkinnedVertexPositions(
    	Vec3StridedPtr outResult
    ) {
    	getSkinnedVertexPositions(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the current skinned normal. One entry per simulated vertex.
    /// ```
    public static void getSkinnedVertexNormals(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_GET_SKINNED_VERTEX_NORMALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedVertexNormals].
    public final void getSkinnedVertexNormals(
    	Vec3StridedPtr outResult
    ) {
    	getSkinnedVertexNormals(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// This function allows you to update the soft body immediately without going through the PhysicsSystem.
    /// This is useful if the soft body is teleported and needs to 'settle' or it can be used if a the soft body
    /// is not added to the PhysicsSystem and needs to be updated manually. One reason for not adding it to the
    /// PhysicsSystem is that you might want to update a soft body immediately after updating an animated object
    /// that has the soft body attached to it. If the soft body is added to the PhysicsSystem it will be updated
    /// by it, so calling this function will effectively update it twice. Note that when you use this function,
    /// only the current thread will be used, whereas if you update through the PhysicsSystem, multiple threads may
    /// be used.
    /// Note that this will bypass any sleep checks. Since the dynamic objects that the soft body touches
    /// will not move during this call, there can be simulation artifacts if you call this function multiple times
    /// without running the physics simulation step.
    /// ```
    public static void customUpdate(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment ioSoftBody,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_CUSTOM_UPDATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			ioSoftBody,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#customUpdate].
    public final void customUpdate(
    	float inDeltaTime,
    	Body ioSoftBody,
    	PhysicsSystem inSystem
    ) {
    	customUpdate(
    		this.segment,
    		inDeltaTime,
    		ioSoftBody.memorySegment(),
    		inSystem.memorySegment()
    	);
    }
    
    /// ```
    /// Set a flag to indicate that the ContactListener::OnSoftBodyContactAdded should be called
    /// ```
    public static void requestContactCallback(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MOTION_PROPERTIES_REQUEST_CONTACT_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#requestContactCallback].
    public final void requestContactCallback() {
    	requestContactCallback(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}