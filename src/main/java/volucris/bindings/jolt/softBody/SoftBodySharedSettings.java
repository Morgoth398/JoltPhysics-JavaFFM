/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.IDToMaterialMap;
import volucris.bindings.jolt.MaterialToIDMap;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.collision.PhysicsMaterialList;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodySharedSettings extends SoftBodySharedSettingsRefTarget {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_FACES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_EDGE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_EDGE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_DIHEDRAL_BEND_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_DIHEDRAL_BEND_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_VOLUME_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_VOLUME_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_SKINNED_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_SKINNED_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_INV_BIND_MATRICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_INV_BIND_MATRICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_LRACONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_LRACONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_STRETCH_SHEAR_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_STRETCH_SHEAR_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_BEND_TWIST_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_BEND_TWIST_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_EDGE_LENGTHS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_ROD_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_LRALENGTHS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_BEND_CONSTRAINT_CONSTANTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_VOLUME_CONSTRAINT_VOLUMES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_SKINNED_CONSTRAINT_NORMALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CLONE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_WITH_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_S_RESTORE_WITH_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_S_CREATE_CUBE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_CREATE = downcallHandle("JPH_SoftBodySharedSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_SoftBodySharedSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTICES = downcallHandleVoid("JPH_SoftBodySharedSettings_GetVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_VERTICES = downcallHandleVoid("JPH_SoftBodySharedSettings_SetVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACES = downcallHandleVoid("JPH_SoftBodySharedSettings_GetFaces", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_FACES = downcallHandleVoid("JPH_SoftBodySharedSettings_SetFaces", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_EDGE_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetEdgeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_EDGE_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetEdgeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_DIHEDRAL_BEND_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetDihedralBendConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_DIHEDRAL_BEND_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetDihedralBendConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_VOLUME_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetVolumeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_VOLUME_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetVolumeConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_SKINNED_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetSkinnedConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_SKINNED_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetSkinnedConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_INV_BIND_MATRICES = downcallHandleVoid("JPH_SoftBodySharedSettings_GetInvBindMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_INV_BIND_MATRICES = downcallHandleVoid("JPH_SoftBodySharedSettings_SetInvBindMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_LRACONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetLRAConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_LRACONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetLRAConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_STRETCH_SHEAR_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetRodStretchShearConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_STRETCH_SHEAR_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetRodStretchShearConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_BEND_TWIST_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetRodBendTwistConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_BEND_TWIST_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetRodBendTwistConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_GET_MATERIALS = downcallHandleVoid("JPH_SoftBodySharedSettings_GetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SET_MATERIALS = downcallHandleVoid("JPH_SoftBodySharedSettings_SetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_CreateConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_EDGE_LENGTHS = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateEdgeLengths", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_ROD_PROPERTIES = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateRodProperties", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_LRALENGTHS = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateLRALengths", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_BEND_CONSTRAINT_CONSTANTS = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateBendConstraintConstants", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_VOLUME_CONSTRAINT_VOLUMES = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateVolumeConstraintVolumes", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_SKINNED_CONSTRAINT_NORMALS = downcallHandleVoid("JPH_SoftBodySharedSettings_CalculateSkinnedConstraintNormals", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE = downcallHandleVoid("JPH_SoftBodySharedSettings_Optimize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE1 = downcallHandleVoid("JPH_SoftBodySharedSettings_Optimize1", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_CLONE = downcallHandleVoid("JPH_SoftBodySharedSettings_Clone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_SoftBodySharedSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_SoftBodySharedSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_WITH_MATERIALS = downcallHandleVoid("JPH_SoftBodySharedSettings_SaveWithMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_S_RESTORE_WITH_MATERIALS = downcallHandleVoid("JPH_SoftBodySharedSettings_sRestoreWithMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_S_CREATE_CUBE = downcallHandleVoid("JPH_SoftBodySharedSettings_sCreateCube", JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE = downcallHandleVoid("JPH_SoftBodySharedSettings_AddFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodySharedSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SoftBodySharedSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SoftBodySharedSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The list of vertices or particles of the body
    /// ```
    public static void getVertices(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertices].
    public final void getVertices(
    	VertexArray outResult
    ) {
    	getVertices(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of vertices or particles of the body
    /// ```
    public static void setVertices(
    	MemorySegment self,
    	MemorySegment mVertices
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVertices].
    public final void setVertices(
    	VertexArray mVertices
    ) {
    	setVertices(
    		this.segment,
    		mVertices.memorySegment()
    	);
    }
    
    /// ```
    /// The list of faces of the body
    /// ```
    public static void getFaces(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFaces].
    public final void getFaces(
    	FaceArray outResult
    ) {
    	getFaces(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of faces of the body
    /// ```
    public static void setFaces(
    	MemorySegment self,
    	MemorySegment mFaces
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_FACES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFaces
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFaces].
    public final void setFaces(
    	FaceArray mFaces
    ) {
    	setFaces(
    		this.segment,
    		mFaces.memorySegment()
    	);
    }
    
    /// ```
    /// The list of edges or springs of the body
    /// ```
    public static void getEdgeConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_EDGE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEdgeConstraints].
    public final void getEdgeConstraints(
    	EdgeArray outResult
    ) {
    	getEdgeConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of edges or springs of the body
    /// ```
    public static void setEdgeConstraints(
    	MemorySegment self,
    	MemorySegment mEdgeConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_EDGE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEdgeConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEdgeConstraints].
    public final void setEdgeConstraints(
    	EdgeArray mEdgeConstraints
    ) {
    	setEdgeConstraints(
    		this.segment,
    		mEdgeConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of dihedral bend constraints of the body
    /// ```
    public static void getDihedralBendConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_DIHEDRAL_BEND_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDihedralBendConstraints].
    public final void getDihedralBendConstraints(
    	DihedralBendArray outResult
    ) {
    	getDihedralBendConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of dihedral bend constraints of the body
    /// ```
    public static void setDihedralBendConstraints(
    	MemorySegment self,
    	MemorySegment mDihedralBendConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_DIHEDRAL_BEND_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDihedralBendConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDihedralBendConstraints].
    public final void setDihedralBendConstraints(
    	DihedralBendArray mDihedralBendConstraints
    ) {
    	setDihedralBendConstraints(
    		this.segment,
    		mDihedralBendConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of volume constraints of the body that keep the volume of tetrahedra in the soft body constant
    /// ```
    public static void getVolumeConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_VOLUME_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVolumeConstraints].
    public final void getVolumeConstraints(
    	VolumeArray outResult
    ) {
    	getVolumeConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of volume constraints of the body that keep the volume of tetrahedra in the soft body constant
    /// ```
    public static void setVolumeConstraints(
    	MemorySegment self,
    	MemorySegment mVolumeConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_VOLUME_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVolumeConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVolumeConstraints].
    public final void setVolumeConstraints(
    	VolumeArray mVolumeConstraints
    ) {
    	setVolumeConstraints(
    		this.segment,
    		mVolumeConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of vertices that are constrained to a skinned vertex
    /// ```
    public static void getSkinnedConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_SKINNED_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedConstraints].
    public final void getSkinnedConstraints(
    	SkinnedArray outResult
    ) {
    	getSkinnedConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of vertices that are constrained to a skinned vertex
    /// ```
    public static void setSkinnedConstraints(
    	MemorySegment self,
    	MemorySegment mSkinnedConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_SKINNED_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSkinnedConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSkinnedConstraints].
    public final void setSkinnedConstraints(
    	SkinnedArray mSkinnedConstraints
    ) {
    	setSkinnedConstraints(
    		this.segment,
    		mSkinnedConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of inverse bind matrices for skinning vertices
    /// ```
    public static void getInvBindMatrices(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_INV_BIND_MATRICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvBindMatrices].
    public final void getInvBindMatrices(
    	InvBindArray outResult
    ) {
    	getInvBindMatrices(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of inverse bind matrices for skinning vertices
    /// ```
    public static void setInvBindMatrices(
    	MemorySegment self,
    	MemorySegment mInvBindMatrices
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_INV_BIND_MATRICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvBindMatrices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvBindMatrices].
    public final void setInvBindMatrices(
    	InvBindArray mInvBindMatrices
    ) {
    	setInvBindMatrices(
    		this.segment,
    		mInvBindMatrices.memorySegment()
    	);
    }
    
    /// ```
    /// The list of long range attachment constraints
    /// ```
    public static void getLRAConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_LRACONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLRAConstraints].
    public final void getLRAConstraints(
    	LRAArray outResult
    ) {
    	getLRAConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of long range attachment constraints
    /// ```
    public static void setLRAConstraints(
    	MemorySegment self,
    	MemorySegment mLRAConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_LRACONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLRAConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLRAConstraints].
    public final void setLRAConstraints(
    	LRAArray mLRAConstraints
    ) {
    	setLRAConstraints(
    		this.segment,
    		mLRAConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of Cosserat rod constraints that connect two vertices and that limit stretch and shear
    /// ```
    public static void getRodStretchShearConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_STRETCH_SHEAR_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodStretchShearConstraints].
    public final void getRodStretchShearConstraints(
    	RodStretchShearArray outResult
    ) {
    	getRodStretchShearConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of Cosserat rod constraints that connect two vertices and that limit stretch and shear
    /// ```
    public static void setRodStretchShearConstraints(
    	MemorySegment self,
    	MemorySegment mRodStretchShearConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_STRETCH_SHEAR_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRodStretchShearConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRodStretchShearConstraints].
    public final void setRodStretchShearConstraints(
    	RodStretchShearArray mRodStretchShearConstraints
    ) {
    	setRodStretchShearConstraints(
    		this.segment,
    		mRodStretchShearConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The list of Cosserat rod constraints that connect two rods and limit the bend and twist
    /// ```
    public static void getRodBendTwistConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_ROD_BEND_TWIST_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodBendTwistConstraints].
    public final void getRodBendTwistConstraints(
    	RodBendTwistArray outResult
    ) {
    	getRodBendTwistConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of Cosserat rod constraints that connect two rods and limit the bend and twist
    /// ```
    public static void setRodBendTwistConstraints(
    	MemorySegment self,
    	MemorySegment mRodBendTwistConstraints
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_ROD_BEND_TWIST_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRodBendTwistConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRodBendTwistConstraints].
    public final void setRodBendTwistConstraints(
    	RodBendTwistArray mRodBendTwistConstraints
    ) {
    	setRodBendTwistConstraints(
    		this.segment,
    		mRodBendTwistConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// The materials of the faces of the body, referenced by Face::mMaterialIndex
    /// ```
    public static void getMaterials(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterials].
    public final void getMaterials(
    	PhysicsMaterialList outResult
    ) {
    	getMaterials(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The materials of the faces of the body, referenced by Face::mMaterialIndex
    /// ```
    public static void setMaterials(
    	MemorySegment self,
    	MemorySegment mMaterials
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterials].
    public final void setMaterials(
    	PhysicsMaterialList mMaterials
    ) {
    	setMaterials(
    		this.segment,
    		mMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Automatically create constraints based on the faces of the soft body
    /// @param inVertexAttributes A list of attributes for each vertex (1-on-1 with mVertices, note that if the list is smaller than mVertices the last element will be repeated). This defines the properties of the constraints that are created.
    /// @param inVertexAttributesLength The length of inVertexAttributes
    /// @param inBendType The type of bend constraint to create
    /// @param inAngleTolerance Shear edges are created when two connected triangles form a quad (are roughly in the same plane and form a square with roughly 90 degree angles). This defines the tolerance (in radians).
    /// ```
    public static void createConstraints(
    	MemorySegment self,
    	MemorySegment inVertexAttributes,
    	int inVertexAttributesLength,
    	int inBendType,
    	float inAngleTolerance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertexAttributes,
    			inVertexAttributesLength,
    			inBendType,
    			inAngleTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createConstraints].
    public final void createConstraints(
    	VertexAttributes inVertexAttributes,
    	int inVertexAttributesLength,
    	int inBendType,
    	float inAngleTolerance
    ) {
    	createConstraints(
    		this.segment,
    		inVertexAttributes.memorySegment(),
    		inVertexAttributesLength,
    		inBendType,
    		inAngleTolerance
    	);
    }
    
    /// ```
    /// Calculate the initial lengths of all springs of the edges of this soft body (if you use CreateConstraint, this is already done)
    /// ```
    public static void calculateEdgeLengths(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_EDGE_LENGTHS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateEdgeLengths].
    public final void calculateEdgeLengths() {
    	calculateEdgeLengths(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate the properties of the rods
    /// Note that this can swap mVertex of the RodStretchShear constraints if two rods are connected through a RodBendTwist constraint but point in opposite directions.
    /// ```
    public static void calculateRodProperties(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_ROD_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateRodProperties].
    public final void calculateRodProperties() {
    	calculateRodProperties(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate the max lengths for the long range attachment constraints based on Euclidean distance (if you use CreateConstraints, this is already done)
    /// @param inMaxDistanceMultiplier Multiplier for the max distance of the LRA constraint, e.g. 1.01 means the max distance is 1% longer than the calculated distance in the rest pose.
    /// ```
    public static void calculateLRALengths(
    	MemorySegment self,
    	float inMaxDistanceMultiplier
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_LRALENGTHS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxDistanceMultiplier
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateLRALengths].
    public final void calculateLRALengths(
    	float inMaxDistanceMultiplier
    ) {
    	calculateLRALengths(
    		this.segment,
    		inMaxDistanceMultiplier
    	);
    }
    
    /// ```
    /// Calculate the constants for the bend constraints (if you use CreateConstraints, this is already done)
    /// ```
    public static void calculateBendConstraintConstants(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_BEND_CONSTRAINT_CONSTANTS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateBendConstraintConstants].
    public final void calculateBendConstraintConstants() {
    	calculateBendConstraintConstants(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculates the initial volume of all tetrahedra of this soft body
    /// ```
    public static void calculateVolumeConstraintVolumes(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_VOLUME_CONSTRAINT_VOLUMES.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateVolumeConstraintVolumes].
    public final void calculateVolumeConstraintVolumes() {
    	calculateVolumeConstraintVolumes(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate information needed to be able to calculate the skinned constraint normals at run-time
    /// ```
    public static void calculateSkinnedConstraintNormals(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CALCULATE_SKINNED_CONSTRAINT_NORMALS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSkinnedConstraintNormals].
    public final void calculateSkinnedConstraintNormals() {
    	calculateSkinnedConstraintNormals(
    		this.segment
    	);
    }
    
    /// ```
    /// Optimize the soft body settings for simulation. This will reorder constraints so they can be executed in parallel.
    /// ```
    public static void optimize(
    	MemorySegment self,
    	MemorySegment outResults
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResults
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#optimize].
    public final void optimize(
    	OptimizationResults outResults
    ) {
    	optimize(
    		this.segment,
    		outResults.memorySegment()
    	);
    }
    
    /// ```
    /// Optimize the soft body settings without results
    /// ```
    public static void optimize1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE1.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#optimize1].
    public final void optimize1() {
    	optimize1(
    		this.segment
    	);
    }
    
    /// ```
    /// Clone this object
    /// ```
    public static void clone(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CLONE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clone].
    public final void clone(
    	SharedSettingsRef outResult
    ) {
    	clone(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream. Doesn't store the material list.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_BINARY_STATE.get();
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
    /// Restore the state of this object from inStream. Doesn't restore the material list.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_RESTORE_BINARY_STATE.get();
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
    /// Save this shared settings and its materials. Pass in an empty map ioSettingsMap / ioMaterialMap or reuse the same map while saving multiple settings objects to the same stream in order to avoid writing duplicates.
    /// ```
    public static void saveWithMaterials(
    	MemorySegment self,
    	MemorySegment inStream,
    	MemorySegment ioSettingsMap,
    	MemorySegment ioMaterialMap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_SAVE_WITH_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			ioSettingsMap,
    			ioMaterialMap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveWithMaterials].
    public final void saveWithMaterials(
    	StreamOut inStream,
    	SharedSettingsToIDMap ioSettingsMap,
    	MaterialToIDMap ioMaterialMap
    ) {
    	saveWithMaterials(
    		this.segment,
    		inStream.memorySegment(),
    		ioSettingsMap.memorySegment(),
    		ioMaterialMap.memorySegment()
    	);
    }
    
    /// ```
    /// Restore a shape and materials. Pass in an empty map in ioSettingsMap / ioMaterialMap or reuse the same map while reading multiple settings objects from the same stream in order to restore duplicates.
    /// ```
    public static void sRestoreWithMaterials(
    	MemorySegment inStream,
    	MemorySegment ioSettingsMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_S_RESTORE_WITH_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			ioSettingsMap,
    			ioMaterialMap,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreWithMaterials].
    public static void sRestoreWithMaterials(
    	StreamIn inStream,
    	IDToSharedSettingsMap ioSettingsMap,
    	IDToMaterialMap ioMaterialMap,
    	SharedSettingsResult outResult
    ) {
    	sRestoreWithMaterials(
    		inStream.memorySegment(),
    		ioSettingsMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create a cube. This can be used to create a simple soft body for testing purposes.
    /// It will contain edge constraints, volume constraints and faces.
    /// @param inGridSize Number of points along each axis
    /// @param inGridSpacing Distance between points
    /// ```
    public static void sCreateCube(
    	int inGridSize,
    	float inGridSpacing,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_S_CREATE_CUBE.get();
    	try {
    		 method.invokeExact(
    			inGridSize,
    			inGridSpacing,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sCreateCube].
    public static void sCreateCube(
    	int inGridSize,
    	float inGridSpacing,
    	SharedSettingsRef outResult
    ) {
    	sCreateCube(
    		inGridSize,
    		inGridSpacing,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Add a face to this soft body
    /// ```
    public static void addFace(
    	MemorySegment self,
    	MemorySegment inFace
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addFace].
    public final void addFace(
    	Face inFace
    ) {
    	addFace(
    		this.segment,
    		inFace.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY.get();
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