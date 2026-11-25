/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.TempAllocator;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.PhysicsMaterialList;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class HeightFieldShape extends Shape {

	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_DRAW_TRIANGLE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SET_DRAW_TRIANGLE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_CLONE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL1;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_SUB_SHAPE_COORDINATES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_HEIGHTS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SET_HEIGHTS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL_LIST;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SET_MATERIALS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_HEIGHT_FIELD_SHAPE_CREATE = downcallHandle("JPH_HeightFieldShape_Create", UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_CREATE1 = downcallHandle("JPH_HeightFieldShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_AS_SHAPE = downcallHandle("JPH_HeightFieldShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_DRAW_TRIANGLE_OUTLINES = downcallHandle("JPH_HeightFieldShape_GetDrawTriangleOutlines", JAVA_BOOLEAN);
		JPH_HEIGHT_FIELD_SHAPE_SET_DRAW_TRIANGLE_OUTLINES = downcallHandleVoid("JPH_HeightFieldShape_SetDrawTriangleOutlines", JAVA_BOOLEAN);
		JPH_HEIGHT_FIELD_SHAPE_CLONE = downcallHandleVoid("JPH_HeightFieldShape_Clone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShape_GetSampleCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShape_GetBlockSize", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL1 = downcallHandle("JPH_HeightFieldShape_GetMaterial1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_GET_POSITION = downcallHandleVoid("JPH_HeightFieldShape_GetPosition", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION = downcallHandle("JPH_HeightFieldShape_IsNoCollision", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE = downcallHandle("JPH_HeightFieldShape_ProjectOntoSurface", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_SUB_SHAPE_COORDINATES = downcallHandleVoid("JPH_HeightFieldShape_GetSubShapeCoordinates", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMinHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMaxHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_HEIGHTS = downcallHandleVoid("JPH_HeightFieldShape_GetHeights", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_HEIGHT_FIELD_SHAPE_SET_HEIGHTS = downcallHandleVoid("JPH_HeightFieldShape_SetHeights", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL_LIST = downcallHandle("JPH_HeightFieldShape_GetMaterialList", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MATERIALS = downcallHandleVoid("JPH_HeightFieldShape_GetMaterials", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_HEIGHT_FIELD_SHAPE_SET_MATERIALS = downcallHandle("JPH_HeightFieldShape_SetMaterials", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public HeightFieldShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public HeightFieldShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HeightFieldShape(
	    HeightFieldShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public HeightFieldShape(
		Arena arena,
		HeightFieldShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HeightFieldShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_CREATE1.get();
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
    public static MemorySegment asShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean getDrawTriangleOutlines() {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_DRAW_TRIANGLE_OUTLINES.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setDrawTriangleOutlines(
    	boolean sDrawTriangleOutlines
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SET_DRAW_TRIANGLE_OUTLINES.get();
    	try {
    		 method.invokeExact(
    			sDrawTriangleOutlines
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
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_CLONE.get();
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
    	HeightFieldShapeRef outResult
    ) {
    	clone(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the size of the height field. Note that this will always be rounded up to the nearest multiple of GetBlockSize().
    /// ```
    public static int getSampleCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSampleCount].
    public final int getSampleCount() {
    	return getSampleCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the size of a block
    /// ```
    public static int getBlockSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBlockSize].
    public final int getBlockSize() {
    	return getBlockSize(
    		this.segment
    	);
    }
    
    /// ```
    /// Overload to get the material at a particular location
    /// ```
    public static MemorySegment getMaterial1(
    	MemorySegment self,
    	int inX,
    	int inY
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inX,
    			inY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial1].
    public final @Nullable PhysicsMaterial getMaterial1(
    	int inX,
    	int inY
    ) {
    	MemorySegment segment = getMaterial1(
    		this.segment,
    		inX,
    		inY
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Get height field position at sampled location (inX, inY).
    /// where inX and inY are integers in the range inX e [0, mSampleCount - 1] and inY e [0, mSampleCount - 1].
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	int inX,
    	int inY,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	int inX,
    	int inY,
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		inX,
    		inY,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Check if height field at sampled location (inX, inY) has collision (has a hole or not)
    /// ```
    public static boolean isNoCollision(
    	MemorySegment self,
    	int inX,
    	int inY
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inX,
    			inY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isNoCollision].
    public final boolean isNoCollision(
    	int inX,
    	int inY
    ) {
    	return isNoCollision(
    		this.segment,
    		inX,
    		inY
    	);
    }
    
    /// ```
    /// Projects inLocalPosition (a point in the space of the shape) along the Y axis onto the surface and returns it in outSurfacePosition.
    /// When there is no surface position (because of a hole or because the point is outside the heightfield) the function will return false.
    /// ```
    public static boolean projectOntoSurface(
    	MemorySegment self,
    	MemorySegment inLocalPosition,
    	MemorySegment outSurfacePosition,
    	MemorySegment outSubShapeID
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inLocalPosition,
    			outSurfacePosition,
    			outSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#projectOntoSurface].
    public final boolean projectOntoSurface(
    	Vec3 inLocalPosition,
    	Vec3 outSurfacePosition,
    	SubShapeID outSubShapeID
    ) {
    	return projectOntoSurface(
    		this.segment,
    		inLocalPosition.memorySegment(),
    		outSurfacePosition.memorySegment(),
    		outSubShapeID.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the coordinates of the triangle that a sub shape ID represents
    /// @param inSubShapeID The sub shape ID to decode
    /// @param outX X coordinate of the triangle (in the range [0, mSampleCount - 2])
    /// @param outY Y coordinate of the triangle (in the range [0, mSampleCount - 2])
    /// @param outTriangleIndex Triangle within the quad (0 = lower triangle or 1 = upper triangle)
    /// ```
    public static void getSubShapeCoordinates(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment outX,
    	MemorySegment outY,
    	MemorySegment outTriangleIndex
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_SUB_SHAPE_COORDINATES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			outX,
    			outY,
    			outTriangleIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeCoordinates].
    public final void getSubShapeCoordinates(
    	SubShapeID inSubShapeID,
    	NativeIntArray outX,
    	NativeIntArray outY,
    	NativeIntArray outTriangleIndex
    ) {
    	getSubShapeCoordinates(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		outX.memorySegment(),
    		outY.memorySegment(),
    		outTriangleIndex.memorySegment()
    	);
    }
    
    /// ```
    /// Get the range of height values that this height field can encode. Can be used to determine the allowed range when setting the height values with SetHeights.
    /// ```
    public static float getMinHeightValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinHeightValue].
    public final float getMinHeightValue() {
    	return getMinHeightValue(
    		this.segment
    	);
    }
    
    public static float getMaxHeightValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxHeightValue].
    public final float getMaxHeightValue() {
    	return getMaxHeightValue(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the height values of a block of data.
    /// Note that the height values are decompressed so will be slightly different from what the shape was originally created with.
    /// @param inX Start X position, must be a multiple of mBlockSize and in the range [0, mSampleCount - 1]
    /// @param inY Start Y position, must be a multiple of mBlockSize and in the range [0, mSampleCount - 1]
    /// @param inSizeX Number of samples in X direction, must be a multiple of mBlockSize and in the range [0, mSampleCount - inX]
    /// @param inSizeY Number of samples in Y direction, must be a multiple of mBlockSize and in the range [0, mSampleCount - inY]
    /// @param outHeights Returned height values, must be at least inSizeX * inSizeY floats. Values are returned in x-major order and can be cNoCollisionValue.
    /// @param inHeightsStride Stride in floats between two consecutive rows of outHeights (can be negative if the data is upside down).
    /// ```
    public static void getHeights(
    	MemorySegment self,
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	MemorySegment outHeights,
    	long inHeightsStride
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_HEIGHTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			inSizeX,
    			inSizeY,
    			outHeights,
    			inHeightsStride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHeights].
    public final void getHeights(
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	NativeFloatArray outHeights,
    	long inHeightsStride
    ) {
    	getHeights(
    		this.segment,
    		inX,
    		inY,
    		inSizeX,
    		inSizeY,
    		outHeights.memorySegment(),
    		inHeightsStride
    	);
    }
    
    /// ```
    /// Set the height values of a block of data.
    /// Note that this requires decompressing and recompressing a border of size mBlockSize in the negative x/y direction so will cause some precision loss.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// @param inX Start X position, must be a multiple of mBlockSize and in the range [0, mSampleCount - 1]
    /// @param inY Start Y position, must be a multiple of mBlockSize and in the range [0, mSampleCount - 1]
    /// @param inSizeX Number of samples in X direction, must be a multiple of mBlockSize and in the range [0, mSampleCount - inX]
    /// @param inSizeY Number of samples in Y direction, must be a multiple of mBlockSize and in the range [0, mSampleCount - inY]
    /// @param inHeights The new height values to set, must be an array of inSizeX * inSizeY floats, can be cNoCollisionValue. Values outside of the range [GetMinHeightValue(), GetMaxHeightValue()] will be clamped.
    /// @param inHeightsStride Stride in floats between two consecutive rows of inHeights (can be negative if the data is upside down).
    /// @param inAllocator Allocator to use for temporary memory
    /// @param inActiveEdgeCosThresholdAngle Cosine of the threshold angle (if the angle between the two triangles is bigger than this, the edge is active, note that a concave edge is always inactive).
    /// ```
    public static void setHeights(
    	MemorySegment self,
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	MemorySegment inHeights,
    	long inHeightsStride,
    	MemorySegment inAllocator,
    	float inActiveEdgeCosThresholdAngle
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SET_HEIGHTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			inSizeX,
    			inSizeY,
    			inHeights,
    			inHeightsStride,
    			inAllocator,
    			inActiveEdgeCosThresholdAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHeights].
    public final void setHeights(
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	NativeFloatArray inHeights,
    	long inHeightsStride,
    	TempAllocator inAllocator,
    	float inActiveEdgeCosThresholdAngle
    ) {
    	setHeights(
    		this.segment,
    		inX,
    		inY,
    		inSizeX,
    		inSizeY,
    		inHeights.memorySegment(),
    		inHeightsStride,
    		inAllocator.memorySegment(),
    		inActiveEdgeCosThresholdAngle
    	);
    }
    
    /// ```
    /// Get the current list of materials, the indices returned by GetMaterials() will index into this list.
    /// ```
    public static MemorySegment getMaterialList(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL_LIST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialList].
    public final @Nullable PhysicsMaterialList getMaterialList() {
    	MemorySegment segment = getMaterialList(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterialList(segment);
    }
    
    /// ```
    /// Get the material indices of a block of data.
    /// @param inX Start X position, must in the range [0, mSampleCount - 1]
    /// @param inY Start Y position, must in the range [0, mSampleCount - 1]
    /// @param inSizeX Number of samples in X direction
    /// @param inSizeY Number of samples in Y direction
    /// @param outMaterials Returned material indices, must be at least inSizeX * inSizeY uint8s. Values are returned in x-major order.
    /// @param inMaterialsStride Stride in uint8s between two consecutive rows of outMaterials (can be negative if the data is upside down).
    /// ```
    public static void getMaterials(
    	MemorySegment self,
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	MemorySegment outMaterials,
    	long inMaterialsStride
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			inSizeX,
    			inSizeY,
    			outMaterials,
    			inMaterialsStride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterials].
    public final void getMaterials(
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	NativeByteArray outMaterials,
    	long inMaterialsStride
    ) {
    	getMaterials(
    		this.segment,
    		inX,
    		inY,
    		inSizeX,
    		inSizeY,
    		outMaterials.memorySegment(),
    		inMaterialsStride
    	);
    }
    
    /// ```
    /// Set the material indices of a block of data.
    /// Beware this can create a race condition if you're running collision queries in parallel. See class documentation for more information.
    /// @param inX Start X position, must in the range [0, mSampleCount - 1]
    /// @param inY Start Y position, must in the range [0, mSampleCount - 1]
    /// @param inSizeX Number of samples in X direction
    /// @param inSizeY Number of samples in Y direction
    /// @param inMaterials The new material indices, must be at least inSizeX * inSizeY uint8s. Values are returned in x-major order.
    /// @param inMaterialsStride Stride in uint8s between two consecutive rows of inMaterials (can be negative if the data is upside down).
    /// @param inMaterialList The material list to use for the new material indices or nullptr if the material list should not be updated
    /// @param inAllocator Allocator to use for temporary memory
    /// @return True if the material indices were set, false if the total number of materials exceeded 256
    /// ```
    public static boolean setMaterials(
    	MemorySegment self,
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	MemorySegment inMaterials,
    	long inMaterialsStride,
    	MemorySegment inMaterialList,
    	MemorySegment inAllocator
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SET_MATERIALS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inX,
    			inY,
    			inSizeX,
    			inSizeY,
    			inMaterials,
    			inMaterialsStride,
    			inMaterialList,
    			inAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterials].
    public final boolean setMaterials(
    	int inX,
    	int inY,
    	int inSizeX,
    	int inSizeY,
    	NativeByteArray inMaterials,
    	long inMaterialsStride,
    	PhysicsMaterialList inMaterialList,
    	TempAllocator inAllocator
    ) {
    	return setMaterials(
    		this.segment,
    		inX,
    		inY,
    		inSizeX,
    		inSizeY,
    		inMaterials.memorySegment(),
    		inMaterialsStride,
    		inMaterialList.memorySegment(),
    		inAllocator.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}