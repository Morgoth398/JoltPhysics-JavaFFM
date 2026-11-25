/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MutableCompoundShape extends CompoundShape {

	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_AS_COMPOUND_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_CLONE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE1;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES1;
	private static final LazyConstant<MethodHandle> JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MUTABLE_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_MutableCompoundShape_Create", UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_CREATE1 = downcallHandle("JPH_MutableCompoundShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_AS_COMPOUND_SHAPE = downcallHandle("JPH_MutableCompoundShape_AsCompoundShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_CLONE = downcallHandleVoid("JPH_MutableCompoundShape_Clone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE = downcallHandle("JPH_MutableCompoundShape_AddShape", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_RemoveShape", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE1 = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShapes", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES1 = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShapes1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS = downcallHandleVoid("JPH_MutableCompoundShape_AdjustCenterOfMass", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MutableCompoundShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MutableCompoundShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MutableCompoundShape(
	    MutableCompoundShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public MutableCompoundShape(
		Arena arena,
		MutableCompoundShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MutableCompoundShape(MemorySegment segment) {
		this.segment = segment;
		super(asCompoundShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCompoundShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_AS_COMPOUND_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Clone this shape. Can be used to avoid race conditions. See the documentation of this class for more information.
    /// ```
    public static void clone(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_CLONE.get();
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
    	MutableCompoundShapeRef outResult
    ) {
    	clone(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Adding a new shape.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// @param inPosition The position of the new shape
    /// @param inRotation The orientation of the new shape
    /// @param inShape The shape to add
    /// @param inUserData User data that will be stored with the shape and can be retrieved using GetCompoundUserData
    /// @param inIndex Index where to insert the shape, UINT_MAX to add to the end
    /// @return The index of the newly added shape
    /// ```
    public static int addShape(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape,
    	int inUserData,
    	int inIndex
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inShape,
    			inUserData,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addShape].
    public final int addShape(
    	Vec3 inPosition,
    	Quat inRotation,
    	Shape inShape,
    	int inUserData,
    	int inIndex
    ) {
    	return addShape(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inShape.memorySegment(),
    		inUserData,
    		inIndex
    	);
    }
    
    /// ```
    /// Remove a shape by index.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// ```
    public static void removeShape(
    	MemorySegment self,
    	int inIndex
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeShape].
    public final void removeShape(
    	int inIndex
    ) {
    	removeShape(
    		this.segment,
    		inIndex
    	);
    }
    
    /// ```
    /// Modify the position / orientation of a shape.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// ```
    public static void modifyShape(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment inPosition,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			inPosition,
    			inRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#modifyShape].
    public final void modifyShape(
    	int inIndex,
    	Vec3 inPosition,
    	Quat inRotation
    ) {
    	modifyShape(
    		this.segment,
    		inIndex,
    		inPosition.memorySegment(),
    		inRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Modify the position / orientation and shape at the same time.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// ```
    public static void modifyShape1(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			inPosition,
    			inRotation,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#modifyShape1].
    public final void modifyShape1(
    	int inIndex,
    	Vec3 inPosition,
    	Quat inRotation,
    	Shape inShape
    ) {
    	modifyShape1(
    		this.segment,
    		inIndex,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inShape.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Batch set positions / orientations, this avoids duplicate work due to bounding box calculation.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// @param inStartIndex Index of first shape to update
    /// @param inNumber Number of shapes to update
    /// @param inPositions A list of positions with arbitrary stride
    /// @param inRotations A list of orientations with arbitrary stride
    /// @param inPositionStride The position stride (the number of bytes between the first and second element)
    /// @param inRotationStride The orientation stride (the number of bytes between the first and second element)
    /// ```
    public static void modifyShapes(
    	MemorySegment self,
    	int inStartIndex,
    	int inNumber,
    	MemorySegment inPositions,
    	MemorySegment inRotations,
    	int inPositionStride,
    	int inRotationStride
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStartIndex,
    			inNumber,
    			inPositions,
    			inRotations,
    			inPositionStride,
    			inRotationStride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#modifyShapes].
    public final void modifyShapes(
    	int inStartIndex,
    	int inNumber,
    	Vec3 inPositions,
    	Quat inRotations,
    	int inPositionStride,
    	int inRotationStride
    ) {
    	modifyShapes(
    		this.segment,
    		inStartIndex,
    		inNumber,
    		inPositions.memorySegment(),
    		inRotations.memorySegment(),
    		inPositionStride,
    		inRotationStride
    	);
    }
    
    /// ```
    /// @brief Batch set positions / orientations / shapes, this avoids duplicate work due to bounding box calculation.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// @param inStartIndex Index of first shape to update
    /// @param inNumber Number of shapes to update
    /// @param inPositions A list of positions with arbitrary stride
    /// @param inRotations A list of orientations with arbitrary stride
    /// @param inShapes A list of shapes with arbitrary stride
    /// @param inPositionStride The position stride (the number of bytes between the first and second element)
    /// @param inRotationStride The orientation stride (the number of bytes between the first and second element)
    /// @param inShapeStride The shape stride (the number of bytes between the first and second element)
    /// ```
    public static void modifyShapes1(
    	MemorySegment self,
    	int inStartIndex,
    	int inNumber,
    	MemorySegment inPositions,
    	MemorySegment inRotations,
    	MemorySegment inShapes,
    	int inPositionStride,
    	int inRotationStride,
    	int inShapeStride
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPES1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStartIndex,
    			inNumber,
    			inPositions,
    			inRotations,
    			inShapes,
    			inPositionStride,
    			inRotationStride,
    			inShapeStride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#modifyShapes1].
    public final void modifyShapes1(
    	int inStartIndex,
    	int inNumber,
    	Vec3 inPositions,
    	Quat inRotations,
    	NativePointerArray inShapes,
    	int inPositionStride,
    	int inRotationStride,
    	int inShapeStride
    ) {
    	modifyShapes1(
    		this.segment,
    		inStartIndex,
    		inNumber,
    		inPositions.memorySegment(),
    		inRotations.memorySegment(),
    		inShapes.memorySegment(),
    		inPositionStride,
    		inRotationStride,
    		inShapeStride
    	);
    }
    
    /// ```
    /// Recalculate the center of mass and shift all objects so they're centered around it
    /// (this needs to be done of dynamic bodies and if the center of mass changes significantly due to adding / removing / repositioning sub shapes or else the simulation will look unnatural)
    /// Note that after adjusting the center of mass of an object you need to call BodyInterface::NotifyShapeChanged and Constraint::NotifyShapeChanged on the relevant bodies / constraints.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// ```
    public static void adjustCenterOfMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#adjustCenterOfMass].
    public final void adjustCenterOfMass() {
    	adjustCenterOfMass(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}