/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterialRefConst;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class ConvexShapeSettings extends ShapeSettings
		permits BoxShapeSettings,
		CapsuleShapeSettings,
		ConvexHullShapeSettings,
		CylinderShapeSettings,
		SphereShapeSettings,
		TaperedCapsuleShapeSettings,
		TaperedCylinderShapeSettings,
		TriangleShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_SET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONVEX_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_ConvexShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SETTINGS_GET_MATERIAL = downcallHandleVoid("JPH_ConvexShapeSettings_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SETTINGS_SET_MATERIAL = downcallHandleVoid("JPH_ConvexShapeSettings_SetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY = downcallHandle("JPH_ConvexShapeSettings_GetDensity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY = downcallHandleVoid("JPH_ConvexShapeSettings_SetDensity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public ConvexShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Material assigned to this shape
    /// ```
    public static void getMaterial(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_GET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final void getMaterial(
    	PhysicsMaterialRefConst outResult
    ) {
    	getMaterial(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Material assigned to this shape
    /// ```
    public static void setMaterial(
    	MemorySegment self,
    	MemorySegment mMaterial
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_SET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterial].
    public final void setMaterial(
    	PhysicsMaterialRefConst mMaterial
    ) {
    	setMaterial(
    		this.segment,
    		mMaterial.memorySegment()
    	);
    }
    
    /// ```
    /// Uniform density of the interior of the convex object (kg / m^3)
    /// ```
    public static float getDensity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDensity].
    public final float getDensity() {
    	return getDensity(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the density of the object in kg / m^3
    /// ```
    public static void setDensity(
    	MemorySegment self,
    	float inDensity
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDensity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDensity].
    public final void setDensity(
    	float inDensity
    ) {
    	setDensity(
    		this.segment,
    		inDensity
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}