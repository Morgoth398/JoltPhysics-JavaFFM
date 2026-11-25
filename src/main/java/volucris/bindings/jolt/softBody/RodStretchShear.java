/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RodStretchShear {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_INV_MASS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_INV_MASS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_BISHOP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_BISHOP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_MIN_VERTEX_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_LENGTH = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_GetLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_LENGTH = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_SetLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_INV_MASS = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_GetInvMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_INV_MASS = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_SetInvMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_BISHOP = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_GetBishop", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_BISHOP = downcallHandleVoid("JPH_SoftBodySharedSettingsRodStretchShear_SetBishop", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_MIN_VERTEX_INDEX = downcallHandle("JPH_SoftBodySharedSettingsRodStretchShear_GetMinVertexIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RodStretchShear() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RodStretchShear(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RodStretchShear(
	    int inVertex1,
	    int inVertex2,
	    float inCompliance
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inCompliance
	    );
	}
	
	/// Typed method of [#create1].
	public RodStretchShear(
		Arena arena,
		int inVertex1,
		int inVertex2,
		float inCompliance
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inCompliance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RodStretchShear(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	float inCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Fixed length of the rod, calculated by CalculateRodProperties
    /// ```
    public static float getLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLength].
    public final float getLength() {
    	return getLength(
    		this.segment
    	);
    }
    
    /// ```
    /// Fixed length of the rod, calculated by CalculateRodProperties
    /// ```
    public static void setLength(
    	MemorySegment self,
    	float mLength
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLength].
    public final void setLength(
    	float mLength
    ) {
    	setLength(
    		this.segment,
    		mLength
    	);
    }
    
    /// ```
    /// Inverse of the mass of the rod (0 for static rods), calculated by CalculateRodProperties but can be overridden afterwards
    /// ```
    public static float getInvMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_INV_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvMass].
    public final float getInvMass() {
    	return getInvMass(
    		this.segment
    	);
    }
    
    /// ```
    /// Inverse of the mass of the rod (0 for static rods), calculated by CalculateRodProperties but can be overridden afterwards
    /// ```
    public static void setInvMass(
    	MemorySegment self,
    	float mInvMass
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_INV_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvMass].
    public final void setInvMass(
    	float mInvMass
    ) {
    	setInvMass(
    		this.segment,
    		mInvMass
    	);
    }
    
    /// ```
    /// Inverse of the stiffness of the rod
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_COMPLIANCE.get();
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
    /// Inverse of the stiffness of the rod
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_COMPLIANCE.get();
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
    /// The Bishop frame of the rod (the rotation of the rod in its rest pose so that it has zero twist towards adjacent rods), calculated by CalculateRodProperties
    /// ```
    public static void getBishop(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_BISHOP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBishop].
    public final void getBishop(
    	Quat outResult
    ) {
    	getBishop(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The Bishop frame of the rod (the rotation of the rod in its rest pose so that it has zero twist towards adjacent rods), calculated by CalculateRodProperties
    /// ```
    public static void setBishop(
    	MemorySegment self,
    	MemorySegment mBishop
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_SET_BISHOP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBishop
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBishop].
    public final void setBishop(
    	Quat mBishop
    ) {
    	setBishop(
    		this.segment,
    		mBishop.memorySegment()
    	);
    }
    
    /// ```
    /// Return the lowest vertex index of this constraint
    /// ```
    public static int getMinVertexIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ROD_STRETCH_SHEAR_GET_MIN_VERTEX_INDEX.get();
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