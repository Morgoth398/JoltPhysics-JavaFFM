/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DihedralBend {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_INITIAL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_INITIAL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_MIN_VERTEX_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE = downcallHandle("JPH_SoftBodySharedSettingsDihedralBend_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsDihedralBend_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsDihedralBend_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsDihedralBend_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsDihedralBend_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_INITIAL_ANGLE = downcallHandle("JPH_SoftBodySharedSettingsDihedralBend_GetInitialAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_INITIAL_ANGLE = downcallHandleVoid("JPH_SoftBodySharedSettingsDihedralBend_SetInitialAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_MIN_VERTEX_INDEX = downcallHandle("JPH_SoftBodySharedSettingsDihedralBend_GetMinVertexIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DihedralBend() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DihedralBend(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DihedralBend(
	    int inVertex1,
	    int inVertex2,
	    int inVertex3,
	    int inVertex4,
	    float inCompliance
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inVertex3,
	        inVertex4,
	        inCompliance
	    );
	}
	
	/// Typed method of [#create1].
	public DihedralBend(
		Arena arena,
		int inVertex1,
		int inVertex2,
		int inVertex3,
		int inVertex4,
		float inCompliance
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inVertex3,
			inVertex4,
			inCompliance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DihedralBend(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	int inVertex3,
    	int inVertex4,
    	float inCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inVertex3,
    			inVertex4,
    			inCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Inverse of the stiffness of the constraint
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_COMPLIANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompliance].
    public final float getCompliance() {
    	return getCompliance(
    		this.segment
    	);
    }
    
    /// ```
    /// Inverse of the stiffness of the constraint
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_COMPLIANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCompliance].
    public final void setCompliance(
    	float mCompliance
    ) {
    	setCompliance(
    		this.segment,
    		mCompliance
    	);
    }
    
    /// ```
    /// Initial angle between the normals of the triangles (pi - dihedral angle), calculated by CalculateBendConstraintConstants
    /// ```
    public static float getInitialAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_INITIAL_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInitialAngle].
    public final float getInitialAngle() {
    	return getInitialAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Initial angle between the normals of the triangles (pi - dihedral angle), calculated by CalculateBendConstraintConstants
    /// ```
    public static void setInitialAngle(
    	MemorySegment self,
    	float mInitialAngle
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_SET_INITIAL_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInitialAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInitialAngle].
    public final void setInitialAngle(
    	float mInitialAngle
    ) {
    	setInitialAngle(
    		this.segment,
    		mInitialAngle
    	);
    }
    
    /// ```
    /// Return the lowest vertex index of this constraint
    /// ```
    public static int getMinVertexIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DIHEDRAL_BEND_GET_MIN_VERTEX_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinVertexIndex].
    public final int getMinVertexIndex() {
    	return getMinVertexIndex(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}