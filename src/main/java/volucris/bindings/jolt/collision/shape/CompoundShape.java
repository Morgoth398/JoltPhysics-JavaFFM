/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.geometry.OrientedBox;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CompoundShape extends Shape
		permits MutableCompoundShape,
		StaticCompoundShape {

	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES1;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_COMPOUND_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SET_COMPOUND_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_IS_SUB_SHAPE_IDVALID;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_IDFROM_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COMPOUND_SHAPE_AS_SHAPE = downcallHandle("JPH_CompoundShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES = downcallHandle("JPH_CompoundShape_GetIntersectingSubShapes", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES1 = downcallHandle("JPH_CompoundShape_GetIntersectingSubShapes1", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPES = downcallHandle("JPH_CompoundShape_GetSubShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES = downcallHandle("JPH_CompoundShape_GetNumSubShapes", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPE = downcallHandle("JPH_CompoundShape_GetSubShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_GET_COMPOUND_USER_DATA = downcallHandle("JPH_CompoundShape_GetCompoundUserData", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_SET_COMPOUND_USER_DATA = downcallHandleVoid("JPH_CompoundShape_SetCompoundUserData", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_COMPOUND_SHAPE_IS_SUB_SHAPE_IDVALID = downcallHandle("JPH_CompoundShape_IsSubShapeIDValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID = downcallHandle("JPH_CompoundShape_GetSubShapeIndexFromID", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_IDFROM_INDEX = downcallHandleVoid("JPH_CompoundShape_GetSubShapeIDFromIndex", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CompoundShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get which sub shape's bounding boxes overlap with an axis aligned box
    /// @param inBox The axis aligned box to test against (relative to the center of mass of this shape)
    /// @param outSubShapeIndices Buffer where to place the indices of the sub shapes that intersect
    /// @param inMaxSubShapeIndices How many indices will fit in the buffer (normally you'd provide a buffer of GetNumSubShapes() indices)
    /// @return How many indices were placed in outSubShapeIndices
    /// ```
    public static int getIntersectingSubShapes(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment outSubShapeIndices,
    	int inMaxSubShapeIndices
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBox,
    			outSubShapeIndices,
    			inMaxSubShapeIndices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIntersectingSubShapes].
    public final int getIntersectingSubShapes(
    	AABox inBox,
    	NativeIntArray outSubShapeIndices,
    	int inMaxSubShapeIndices
    ) {
    	return getIntersectingSubShapes(
    		this.segment,
    		inBox.memorySegment(),
    		outSubShapeIndices.memorySegment(),
    		inMaxSubShapeIndices
    	);
    }
    
    /// ```
    /// Get which sub shape's bounding boxes overlap with an axis aligned box
    /// @param inBox The axis aligned box to test against (relative to the center of mass of this shape)
    /// @param outSubShapeIndices Buffer where to place the indices of the sub shapes that intersect
    /// @param inMaxSubShapeIndices How many indices will fit in the buffer (normally you'd provide a buffer of GetNumSubShapes() indices)
    /// @return How many indices were placed in outSubShapeIndices
    /// ```
    public static int getIntersectingSubShapes1(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment outSubShapeIndices,
    	int inMaxSubShapeIndices
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_INTERSECTING_SUB_SHAPES1.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBox,
    			outSubShapeIndices,
    			inMaxSubShapeIndices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIntersectingSubShapes1].
    public final int getIntersectingSubShapes1(
    	OrientedBox inBox,
    	NativeIntArray outSubShapeIndices,
    	int inMaxSubShapeIndices
    ) {
    	return getIntersectingSubShapes1(
    		this.segment,
    		inBox.memorySegment(),
    		outSubShapeIndices.memorySegment(),
    		inMaxSubShapeIndices
    	);
    }
    
    /// ```
    /// Access to the sub shapes of this compound
    /// ```
    public static MemorySegment getSubShapes(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapes].
    public final @Nullable SubShapes getSubShapes() {
    	MemorySegment segment = getSubShapes(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SubShapes(segment);
    }
    
    /// ```
    /// Get the total number of sub shapes
    /// ```
    public static int getNumSubShapes(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumSubShapes].
    public final int getNumSubShapes() {
    	return getNumSubShapes(
    		this.segment
    	);
    }
    
    /// ```
    /// Access to a particular sub shape
    /// ```
    public static MemorySegment getSubShape(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShape].
    public final @Nullable SubShape getSubShape(
    	int inIdx
    ) {
    	MemorySegment segment = getSubShape(
    		this.segment,
    		inIdx
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SubShape(segment);
    }
    
    /// ```
    /// Get the user data associated with a shape in this compound
    /// ```
    public static int getCompoundUserData(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_COMPOUND_USER_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundUserData].
    public final int getCompoundUserData(
    	int inIdx
    ) {
    	return getCompoundUserData(
    		this.segment,
    		inIdx
    	);
    }
    
    /// ```
    /// Set the user data associated with a shape in this compound
    /// ```
    public static void setCompoundUserData(
    	MemorySegment self,
    	int inIdx,
    	int inUserData
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SET_COMPOUND_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIdx,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCompoundUserData].
    public final void setCompoundUserData(
    	int inIdx,
    	int inUserData
    ) {
    	setCompoundUserData(
    		this.segment,
    		inIdx,
    		inUserData
    	);
    }
    
    /// ```
    /// Check if a sub shape ID is still valid for this shape
    /// @param inSubShapeID Sub shape id that indicates the leaf shape relative to this shape
    /// @return True if the ID is valid, false if not
    /// ```
    public static boolean isSubShapeIDValid(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_IS_SUB_SHAPE_IDVALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSubShapeIDValid].
    public final boolean isSubShapeIDValid(
    	SubShapeID inSubShapeID
    ) {
    	return isSubShapeIDValid(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    /// ```
    /// Convert SubShapeID to sub shape index
    /// @param inSubShapeID Sub shape id that indicates the leaf shape relative to this shape
    /// @param outRemainder This is the sub shape ID for the sub shape of the compound after popping off the index
    /// @return The index of the sub shape of this compound
    /// ```
    public static int getSubShapeIndexFromID(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment outRemainder
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inSubShapeID,
    			outRemainder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIndexFromID].
    public final int getSubShapeIndexFromID(
    	SubShapeID inSubShapeID,
    	SubShapeID outRemainder
    ) {
    	return getSubShapeIndexFromID(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		outRemainder.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Convert a sub shape index to a sub shape ID
    /// @param inIdx Index of the sub shape of this compound
    /// @param inParentSubShapeID Parent SubShapeID (describing the path to the compound shape)
    /// @return A sub shape ID creator that contains the full path to the sub shape with index inIdx
    /// ```
    public static void getSubShapeIDFromIndex(
    	MemorySegment self,
    	int inIdx,
    	MemorySegment inParentSubShapeID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_IDFROM_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIdx,
    			inParentSubShapeID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIDFromIndex].
    public final void getSubShapeIDFromIndex(
    	int inIdx,
    	SubShapeIDCreator inParentSubShapeID,
    	SubShapeIDCreator outResult
    ) {
    	getSubShapeIDFromIndex(
    		this.segment,
    		inIdx,
    		inParentSubShapeID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}