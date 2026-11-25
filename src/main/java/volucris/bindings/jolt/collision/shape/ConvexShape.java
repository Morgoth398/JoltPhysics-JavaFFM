/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class ConvexShape extends Shape
		permits BoxShape,
		CapsuleShape,
		ConvexHullShape,
		CylinderShape,
		SphereShape,
		TaperedCapsuleShape,
		TaperedCylinderShape,
		TriangleShape {

	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_GET_SUPPORT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_GET_MATERIAL1;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SET_DENSITY;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_GET_DENSITY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONVEX_SHAPE_AS_SHAPE = downcallHandle("JPH_ConvexShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_GET_SUPPORT_FUNCTION = downcallHandle("JPH_ConvexShape_GetSupportFunction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SET_MATERIAL = downcallHandleVoid("JPH_ConvexShape_SetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_GET_MATERIAL1 = downcallHandle("JPH_ConvexShape_GetMaterial1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SET_DENSITY = downcallHandleVoid("JPH_ConvexShape_SetDensity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONVEX_SHAPE_GET_DENSITY = downcallHandle("JPH_ConvexShape_GetDensity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConvexShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Returns an object that provides the GetSupport function for this shape.
    /// inMode determines if this support function includes or excludes the convex radius.
    /// of the values returned by the GetSupport function. This improves numerical accuracy of the results.
    /// inScale scales this shape in local space.
    /// ```
    public static MemorySegment getSupportFunction(
    	MemorySegment self,
    	int inMode,
    	MemorySegment inBuffer,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_GET_SUPPORT_FUNCTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inMode,
    			inBuffer,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupportFunction].
    public final @Nullable ConvexShapeSupport getSupportFunction(
    	int inMode,
    	ConvexShapeSupportBuffer inBuffer,
    	Vec3 inScale
    ) {
    	MemorySegment segment = getSupportFunction(
    		this.segment,
    		inMode,
    		inBuffer.memorySegment(),
    		inScale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ConvexShapeSupport(segment);
    }
    
    /// ```
    /// Material of the shape
    /// ```
    public static void setMaterial(
    	MemorySegment self,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterial].
    public final void setMaterial(
    	PhysicsMaterial inMaterial
    ) {
    	setMaterial(
    		this.segment,
    		inMaterial.memorySegment()
    	);
    }
    
    public static MemorySegment getMaterial1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_GET_MATERIAL1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial1].
    public final @Nullable PhysicsMaterial getMaterial1() {
    	MemorySegment segment = getMaterial1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Set density of the shape (kg / m^3)
    /// ```
    public static void setDensity(
    	MemorySegment self,
    	float inDensity
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SET_DENSITY.get();
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
    
    /// ```
    /// Get density of the shape (kg / m^3)
    /// ```
    public static float getDensity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_GET_DENSITY.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}