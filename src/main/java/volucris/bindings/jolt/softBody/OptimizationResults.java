/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.UnsignedIntArray;

import static volucris.bindings.core.FFMUtils.*;

public final class OptimizationResults {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_EDGE_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_EDGE_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_LRAREMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_LRAREMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_BEND_TWIST_CONSTRAINT_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_BEND_TWIST_CONSTRAINT_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_DIHEDRAL_BEND_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_DIHEDRAL_BEND_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_VOLUME_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_VOLUME_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_SKINNED_REMAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_SKINNED_REMAP;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_CREATE = downcallHandle("JPH_SoftBodySharedSettingsOptimizationResults_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_EDGE_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetEdgeRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_EDGE_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetEdgeRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_LRAREMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetLRARemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_LRAREMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetLRARemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetRodStretchShearConstraintRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetRodStretchShearConstraintRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_BEND_TWIST_CONSTRAINT_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetRodBendTwistConstraintRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_BEND_TWIST_CONSTRAINT_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetRodBendTwistConstraintRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_DIHEDRAL_BEND_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetDihedralBendRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_DIHEDRAL_BEND_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetDihedralBendRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_VOLUME_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetVolumeRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_VOLUME_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetVolumeRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_SKINNED_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_GetSkinnedRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_SKINNED_REMAP = downcallHandleVoid("JPH_SoftBodySharedSettingsOptimizationResults_SetSkinnedRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public OptimizationResults() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public OptimizationResults(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public OptimizationResults(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maps old edge index to new edge index
    /// ```
    public static void getEdgeRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_EDGE_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEdgeRemap].
    public final void getEdgeRemap(
    	UnsignedIntArray outResult
    ) {
    	getEdgeRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old edge index to new edge index
    /// ```
    public static void setEdgeRemap(
    	MemorySegment self,
    	MemorySegment mEdgeRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_EDGE_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEdgeRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEdgeRemap].
    public final void setEdgeRemap(
    	UnsignedIntArray mEdgeRemap
    ) {
    	setEdgeRemap(
    		this.segment,
    		mEdgeRemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old LRA index to new LRA index
    /// ```
    public static void getLRARemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_LRAREMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLRARemap].
    public final void getLRARemap(
    	UnsignedIntArray outResult
    ) {
    	getLRARemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old LRA index to new LRA index
    /// ```
    public static void setLRARemap(
    	MemorySegment self,
    	MemorySegment mLRARemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_LRAREMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLRARemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLRARemap].
    public final void setLRARemap(
    	UnsignedIntArray mLRARemap
    ) {
    	setLRARemap(
    		this.segment,
    		mLRARemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old rod stretch shear constraint index to new stretch shear rod constraint index
    /// ```
    public static void getRodStretchShearConstraintRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodStretchShearConstraintRemap].
    public final void getRodStretchShearConstraintRemap(
    	UnsignedIntArray outResult
    ) {
    	getRodStretchShearConstraintRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old rod stretch shear constraint index to new stretch shear rod constraint index
    /// ```
    public static void setRodStretchShearConstraintRemap(
    	MemorySegment self,
    	MemorySegment mRodStretchShearConstraintRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_STRETCH_SHEAR_CONSTRAINT_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRodStretchShearConstraintRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRodStretchShearConstraintRemap].
    public final void setRodStretchShearConstraintRemap(
    	UnsignedIntArray mRodStretchShearConstraintRemap
    ) {
    	setRodStretchShearConstraintRemap(
    		this.segment,
    		mRodStretchShearConstraintRemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old rod bend twist constraint index to new bend twist rod constraint index
    /// ```
    public static void getRodBendTwistConstraintRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_ROD_BEND_TWIST_CONSTRAINT_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRodBendTwistConstraintRemap].
    public final void getRodBendTwistConstraintRemap(
    	UnsignedIntArray outResult
    ) {
    	getRodBendTwistConstraintRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old rod bend twist constraint index to new bend twist rod constraint index
    /// ```
    public static void setRodBendTwistConstraintRemap(
    	MemorySegment self,
    	MemorySegment mRodBendTwistConstraintRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_ROD_BEND_TWIST_CONSTRAINT_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRodBendTwistConstraintRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRodBendTwistConstraintRemap].
    public final void setRodBendTwistConstraintRemap(
    	UnsignedIntArray mRodBendTwistConstraintRemap
    ) {
    	setRodBendTwistConstraintRemap(
    		this.segment,
    		mRodBendTwistConstraintRemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old dihedral bend index to new dihedral bend index
    /// ```
    public static void getDihedralBendRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_DIHEDRAL_BEND_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDihedralBendRemap].
    public final void getDihedralBendRemap(
    	UnsignedIntArray outResult
    ) {
    	getDihedralBendRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old dihedral bend index to new dihedral bend index
    /// ```
    public static void setDihedralBendRemap(
    	MemorySegment self,
    	MemorySegment mDihedralBendRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_DIHEDRAL_BEND_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDihedralBendRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDihedralBendRemap].
    public final void setDihedralBendRemap(
    	UnsignedIntArray mDihedralBendRemap
    ) {
    	setDihedralBendRemap(
    		this.segment,
    		mDihedralBendRemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old volume constraint index to new volume constraint index
    /// ```
    public static void getVolumeRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_VOLUME_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVolumeRemap].
    public final void getVolumeRemap(
    	UnsignedIntArray outResult
    ) {
    	getVolumeRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old volume constraint index to new volume constraint index
    /// ```
    public static void setVolumeRemap(
    	MemorySegment self,
    	MemorySegment mVolumeRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_VOLUME_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVolumeRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVolumeRemap].
    public final void setVolumeRemap(
    	UnsignedIntArray mVolumeRemap
    ) {
    	setVolumeRemap(
    		this.segment,
    		mVolumeRemap.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old skinned constraint index to new skinned constraint index
    /// ```
    public static void getSkinnedRemap(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_GET_SKINNED_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkinnedRemap].
    public final void getSkinnedRemap(
    	UnsignedIntArray outResult
    ) {
    	getSkinnedRemap(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Maps old skinned constraint index to new skinned constraint index
    /// ```
    public static void setSkinnedRemap(
    	MemorySegment self,
    	MemorySegment mSkinnedRemap
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZATION_RESULTS_SET_SKINNED_REMAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSkinnedRemap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSkinnedRemap].
    public final void setSkinnedRemap(
    	UnsignedIntArray mSkinnedRemap
    ) {
    	setSkinnedRemap(
    		this.segment,
    		mSkinnedRemap.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}