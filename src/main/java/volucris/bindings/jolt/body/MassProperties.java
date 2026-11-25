/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MassProperties {

	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_GET_MASS;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SET_MASS;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_GET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SET_MASS_AND_INERTIA_OF_SOLID_BOX;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SCALE_TO_MASS;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_S_GET_EQUIVALENT_SOLID_BOX_SIZE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_ROTATE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_TRANSLATE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SCALE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_MASS_PROPERTIES_RESTORE_BINARY_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MASS_PROPERTIES_CREATE = downcallHandle("JPH_MassProperties_Create", UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_DESTROY = downcallHandleVoid("JPH_MassProperties_Destroy", UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_GET_MASS = downcallHandle("JPH_MassProperties_GetMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_SET_MASS = downcallHandleVoid("JPH_MassProperties_SetMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MASS_PROPERTIES_GET_INERTIA = downcallHandleVoid("JPH_MassProperties_GetInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_SET_INERTIA = downcallHandleVoid("JPH_MassProperties_SetInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA = downcallHandle("JPH_MassProperties_DecomposePrincipalMomentsOfInertia", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_SET_MASS_AND_INERTIA_OF_SOLID_BOX = downcallHandleVoid("JPH_MassProperties_SetMassAndInertiaOfSolidBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MASS_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MassProperties_ScaleToMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MASS_PROPERTIES_S_GET_EQUIVALENT_SOLID_BOX_SIZE = downcallHandleVoid("JPH_MassProperties_sGetEquivalentSolidBoxSize", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_ROTATE = downcallHandleVoid("JPH_MassProperties_Rotate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_TRANSLATE = downcallHandleVoid("JPH_MassProperties_Translate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_SCALE = downcallHandleVoid("JPH_MassProperties_Scale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_SAVE_BINARY_STATE = downcallHandleVoid("JPH_MassProperties_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MASS_PROPERTIES_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_MassProperties_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MassProperties() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MassProperties(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MassProperties(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_MASS_PROPERTIES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Mass of the shape (kg)
    /// ```
    public static float getMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_GET_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMass].
    public final float getMass() {
    	return getMass(
    		this.segment
    	);
    }
    
    /// ```
    /// Mass of the shape (kg)
    /// ```
    public static void setMass(
    	MemorySegment self,
    	float mMass
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SET_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMass].
    public final void setMass(
    	float mMass
    ) {
    	setMass(
    		this.segment,
    		mMass
    	);
    }
    
    /// ```
    /// Inertia tensor of the shape (kg m^2)
    /// ```
    public static void getInertia(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_GET_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInertia].
    public final void getInertia(
    	Mat44 outResult
    ) {
    	getInertia(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Inertia tensor of the shape (kg m^2)
    /// ```
    public static void setInertia(
    	MemorySegment self,
    	MemorySegment mInertia
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SET_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInertia
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInertia].
    public final void setInertia(
    	Mat44 mInertia
    ) {
    	setInertia(
    		this.segment,
    		mInertia.memorySegment()
    	);
    }
    
    /// ```
    /// Using eigendecomposition, decompose the inertia tensor into a diagonal matrix D and a right-handed rotation matrix R so that the inertia tensor is \f$R \: D \: R^{-1}\f$.
    /// @see https://en.wikipedia.org/wiki/Moment_of_inertia section 'Principal axes'
    /// @param outRotation The rotation matrix R
    /// @param outDiagonal The diagonal of the diagonal matrix D
    /// @return True if successful, false if failed
    /// ```
    public static boolean decomposePrincipalMomentsOfInertia(
    	MemorySegment self,
    	MemorySegment outRotation,
    	MemorySegment outDiagonal
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			outRotation,
    			outDiagonal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#decomposePrincipalMomentsOfInertia].
    public final boolean decomposePrincipalMomentsOfInertia(
    	Mat44 outRotation,
    	Vec3 outDiagonal
    ) {
    	return decomposePrincipalMomentsOfInertia(
    		this.segment,
    		outRotation.memorySegment(),
    		outDiagonal.memorySegment()
    	);
    }
    
    /// ```
    /// Set the mass and inertia of a box with edge size inBoxSize and density inDensity
    /// ```
    public static void setMassAndInertiaOfSolidBox(
    	MemorySegment self,
    	MemorySegment inBoxSize,
    	float inDensity
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SET_MASS_AND_INERTIA_OF_SOLID_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBoxSize,
    			inDensity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMassAndInertiaOfSolidBox].
    public final void setMassAndInertiaOfSolidBox(
    	Vec3 inBoxSize,
    	float inDensity
    ) {
    	setMassAndInertiaOfSolidBox(
    		this.segment,
    		inBoxSize.memorySegment(),
    		inDensity
    	);
    }
    
    /// ```
    /// Set the mass and scale the inertia tensor to match the mass
    /// ```
    public static void scaleToMass(
    	MemorySegment self,
    	float inMass
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SCALE_TO_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scaleToMass].
    public final void scaleToMass(
    	float inMass
    ) {
    	scaleToMass(
    		this.segment,
    		inMass
    	);
    }
    
    /// ```
    /// Calculates the size of the solid box that has an inertia tensor diagonal inInertiaDiagonal
    /// ```
    public static void sGetEquivalentSolidBoxSize(
    	float inMass,
    	MemorySegment inInertiaDiagonal,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_S_GET_EQUIVALENT_SOLID_BOX_SIZE.get();
    	try {
    		 method.invokeExact(
    			inMass,
    			inInertiaDiagonal,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetEquivalentSolidBoxSize].
    public static void sGetEquivalentSolidBoxSize(
    	float inMass,
    	Vec3 inInertiaDiagonal,
    	Vec3 outResult
    ) {
    	sGetEquivalentSolidBoxSize(
    		inMass,
    		inInertiaDiagonal.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate the inertia by 3x3 matrix inRotation
    /// ```
    public static void rotate(
    	MemorySegment self,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_ROTATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotate].
    public final void rotate(
    	Mat44 inRotation
    ) {
    	rotate(
    		this.segment,
    		inRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Translate the inertia by a vector inTranslation
    /// ```
    public static void translate(
    	MemorySegment self,
    	MemorySegment inTranslation
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_TRANSLATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#translate].
    public final void translate(
    	Vec3 inTranslation
    ) {
    	translate(
    		this.segment,
    		inTranslation.memorySegment()
    	);
    }
    
    /// ```
    /// Scale the mass and inertia by inScale, note that elements can be < 0 to flip the shape
    /// ```
    public static void scale(
    	MemorySegment self,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scale].
    public final void scale(
    	Vec3 inScale
    ) {
    	scale(
    		this.segment,
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_SAVE_BINARY_STATE.get();
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
    /// Restore the state of this object from inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_MASS_PROPERTIES_RESTORE_BINARY_STATE.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}