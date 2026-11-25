/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CompoundShapeSettings extends ShapeSettings
		permits StaticCompoundShapeSettings,
		MutableCompoundShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_GET_SUB_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_SET_SUB_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COMPOUND_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_CompoundShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SETTINGS_GET_SUB_SHAPES = downcallHandleVoid("JPH_CompoundShapeSettings_GetSubShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SETTINGS_SET_SUB_SHAPES = downcallHandleVoid("JPH_CompoundShapeSettings_SetSubShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE1 = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public CompoundShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getSubShapes(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_GET_SUB_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapes].
    public final void getSubShapes(
    	SubShapesSettings outResult
    ) {
    	getSubShapes(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setSubShapes(
    	MemorySegment self,
    	MemorySegment mSubShapes
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_SET_SUB_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapes].
    public final void setSubShapes(
    	SubShapesSettings mSubShapes
    ) {
    	setSubShapes(
    		this.segment,
    		mSubShapes.memorySegment()
    	);
    }
    
    /// ```
    /// Add a shape to the compound.
    /// ```
    public static void addShape(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape,
    	int inUserData
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inShape,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addShape].
    public final void addShape(
    	Vec3 inPosition,
    	Quat inRotation,
    	ShapeSettings inShape,
    	int inUserData
    ) {
    	addShape(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inShape.memorySegment(),
    		inUserData
    	);
    }
    
    /// ```
    /// Add a shape to the compound. Variant that uses a concrete shape, which means this object cannot be serialized.
    /// ```
    public static void addShape1(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape,
    	int inUserData
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inShape,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addShape1].
    public final void addShape1(
    	Vec3 inPosition,
    	Quat inRotation,
    	Shape inShape,
    	int inUserData
    ) {
    	addShape1(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inShape.memorySegment(),
    		inUserData
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}