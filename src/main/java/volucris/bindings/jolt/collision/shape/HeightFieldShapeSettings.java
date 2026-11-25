/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.jolt.FloatArray;
import volucris.bindings.jolt.UnsignedCharArray;
import volucris.bindings.jolt.collision.PhysicsMaterialList;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class HeightFieldShapeSettings extends ShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_HEIGHT_SAMPLES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_HEIGHT_SAMPLES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIAL_INDICES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIAL_INDICES;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE;
	private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_HeightFieldShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_HeightFieldShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_HeightFieldShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShapeSettings_GetSampleCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetSampleCount", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMinHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMinHeightValue", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMaxHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaxHeightValue", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS_CAPACITY = downcallHandle("JPH_HeightFieldShapeSettings_GetMaterialsCapacity", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS_CAPACITY = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaterialsCapacity", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShapeSettings_GetBlockSize", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBlockSize", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE = downcallHandle("JPH_HeightFieldShapeSettings_GetBitsPerSample", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBitsPerSample", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_HEIGHT_SAMPLES = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetHeightSamples", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_HEIGHT_SAMPLES = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetHeightSamples", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIAL_INDICES = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetMaterialIndices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIAL_INDICES = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaterialIndices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_HeightFieldShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetActiveEdgeCosThresholdAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_DetermineMinAndMaxSample", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR = downcallHandle("JPH_HeightFieldShapeSettings_CalculateBitsPerSampleForError", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public HeightFieldShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public HeightFieldShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HeightFieldShapeSettings(
	    NativeFloatArray inSamples,
	    Vec3 inOffset,
	    Vec3 inScale,
	    int inSampleCount,
	    NativeByteArray inMaterialIndices,
	    PhysicsMaterialList inMaterialList
	) {
	    this(
	        Arena.ofAuto(),
	        inSamples,
	        inOffset,
	        inScale,
	        inSampleCount,
	        inMaterialIndices,
	        inMaterialList
	    );
	}
	
	/// Typed method of [#create1].
	public HeightFieldShapeSettings(
		Arena arena,
		NativeFloatArray inSamples,
		Vec3 inOffset,
		Vec3 inScale,
		int inSampleCount,
		NativeByteArray inMaterialIndices,
		PhysicsMaterialList inMaterialList
	) {
		MemorySegment segment = create1(
			inSamples.memorySegment(),
			inOffset.memorySegment(),
			inScale.memorySegment(),
			inSampleCount,
			inMaterialIndices.memorySegment(),
			inMaterialList.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HeightFieldShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a height field shape of inSampleCount * inSampleCount vertices.
    /// The height field is a surface defined by: inOffset + inScale * (x, inSamples[y * inSampleCount + x], y).
    /// where x and y are integers in the range x and y e [0, inSampleCount - 1].
    /// inSampleCount: inSampleCount / mBlockSize must be minimally 2 and a power of 2 is the most efficient in terms of performance and storage.
    /// inSamples: inSampleCount^2 vertices.
    /// inMaterialIndices: (inSampleCount - 1)^2 indices that index into inMaterialList.
    /// ```
    public static MemorySegment create1(
    	MemorySegment inSamples,
    	MemorySegment inOffset,
    	MemorySegment inScale,
    	int inSampleCount,
    	MemorySegment inMaterialIndices,
    	MemorySegment inMaterialList
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSamples,
    			inOffset,
    			inScale,
    			inSampleCount,
    			inMaterialIndices,
    			inMaterialList
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The height field is a surface defined by: mOffset + mScale * (x, mHeightSamples[y * mSampleCount + x], y).
    /// where x and y are integers in the range x and y e [0, mSampleCount - 1].
    /// ```
    public static void getOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOffset].
    public final void getOffset(
    	Vec3 outResult
    ) {
    	getOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The height field is a surface defined by: mOffset + mScale * (x, mHeightSamples[y * mSampleCount + x], y).
    /// where x and y are integers in the range x and y e [0, mSampleCount - 1].
    /// ```
    public static void setOffset(
    	MemorySegment self,
    	MemorySegment mOffset
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			mOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setOffset].
    public final void setOffset(
    	Vec3 mOffset
    ) {
    	setOffset(
    		this.segment,
    		mOffset.memorySegment()
    	);
    }
    
    public static void getScale(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getScale].
    public final void getScale(
    	Vec3 outResult
    ) {
    	getScale(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setScale(
    	MemorySegment self,
    	MemorySegment mScale
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setScale].
    public final void setScale(
    	Vec3 mScale
    ) {
    	setScale(
    		this.segment,
    		mScale.memorySegment()
    	);
    }
    
    public static int getSampleCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT.get();
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
    
    public static void setSampleCount(
    	MemorySegment self,
    	int mSampleCount
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSampleCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSampleCount].
    public final void setSampleCount(
    	int mSampleCount
    ) {
    	setSampleCount(
    		this.segment,
    		mSampleCount
    	);
    }
    
    /// ```
    /// Artificial minimal value of mHeightSamples, used for compression and can be used to update the terrain after creating with lower height values. If there are any lower values in mHeightSamples, this value will be ignored.
    /// ```
    public static float getMinHeightValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE.get();
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
    
    /// ```
    /// Artificial minimal value of mHeightSamples, used for compression and can be used to update the terrain after creating with lower height values. If there are any lower values in mHeightSamples, this value will be ignored.
    /// ```
    public static void setMinHeightValue(
    	MemorySegment self,
    	float mMinHeightValue
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinHeightValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinHeightValue].
    public final void setMinHeightValue(
    	float mMinHeightValue
    ) {
    	setMinHeightValue(
    		this.segment,
    		mMinHeightValue
    	);
    }
    
    /// ```
    /// Artificial maximum value of mHeightSamples, used for compression and can be used to update the terrain after creating with higher height values. If there are any higher values in mHeightSamples, this value will be ignored.
    /// ```
    public static float getMaxHeightValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE.get();
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
    /// Artificial maximum value of mHeightSamples, used for compression and can be used to update the terrain after creating with higher height values. If there are any higher values in mHeightSamples, this value will be ignored.
    /// ```
    public static void setMaxHeightValue(
    	MemorySegment self,
    	float mMaxHeightValue
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxHeightValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxHeightValue].
    public final void setMaxHeightValue(
    	float mMaxHeightValue
    ) {
    	setMaxHeightValue(
    		this.segment,
    		mMaxHeightValue
    	);
    }
    
    /// ```
    /// When bigger than mMaterials.size() the internal material list will be preallocated to support this number of materials.
    /// This avoids reallocations when calling HeightFieldShape::SetMaterials with new materials later.
    /// ```
    public static int getMaterialsCapacity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS_CAPACITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialsCapacity].
    public final int getMaterialsCapacity() {
    	return getMaterialsCapacity(
    		this.segment
    	);
    }
    
    /// ```
    /// When bigger than mMaterials.size() the internal material list will be preallocated to support this number of materials.
    /// This avoids reallocations when calling HeightFieldShape::SetMaterials with new materials later.
    /// ```
    public static void setMaterialsCapacity(
    	MemorySegment self,
    	int mMaterialsCapacity
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS_CAPACITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterialsCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterialsCapacity].
    public final void setMaterialsCapacity(
    	int mMaterialsCapacity
    ) {
    	setMaterialsCapacity(
    		this.segment,
    		mMaterialsCapacity
    	);
    }
    
    /// ```
    /// The heightfield is divided in blocks of mBlockSize * mBlockSize * 2 triangles and the acceleration structure culls blocks only,
    /// bigger block sizes reduce memory consumption but also reduce query performance. Valid values are [2, 8], does not need to be
    /// a power of 2. Note that at run-time we'll perform one more grid subdivision, so the effective block size is half of what is provided here.
    /// ```
    public static int getBlockSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE.get();
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
    /// The heightfield is divided in blocks of mBlockSize * mBlockSize * 2 triangles and the acceleration structure culls blocks only,
    /// bigger block sizes reduce memory consumption but also reduce query performance. Valid values are [2, 8], does not need to be
    /// a power of 2. Note that at run-time we'll perform one more grid subdivision, so the effective block size is half of what is provided here.
    /// ```
    public static void setBlockSize(
    	MemorySegment self,
    	int mBlockSize
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBlockSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBlockSize].
    public final void setBlockSize(
    	int mBlockSize
    ) {
    	setBlockSize(
    		this.segment,
    		mBlockSize
    	);
    }
    
    /// ```
    /// How many bits per sample to use to compress the height field. Can be in the range [1, 16].
    /// Note that each sample is compressed relative to the min/max value of its block of mBlockSize * mBlockSize samples so the effective precision is higher.
    /// Also note that increasing mBlockSize saves more memory than reducing the amount of bits per sample.
    /// ```
    public static int getBitsPerSample(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBitsPerSample].
    public final int getBitsPerSample() {
    	return getBitsPerSample(
    		this.segment
    	);
    }
    
    /// ```
    /// How many bits per sample to use to compress the height field. Can be in the range [1, 16].
    /// Note that each sample is compressed relative to the min/max value of its block of mBlockSize * mBlockSize samples so the effective precision is higher.
    /// Also note that increasing mBlockSize saves more memory than reducing the amount of bits per sample.
    /// ```
    public static void setBitsPerSample(
    	MemorySegment self,
    	int mBitsPerSample
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBitsPerSample
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBitsPerSample].
    public final void setBitsPerSample(
    	int mBitsPerSample
    ) {
    	setBitsPerSample(
    		this.segment,
    		mBitsPerSample
    	);
    }
    
    /// ```
    /// An array of mSampleCount^2 height samples. Samples are stored in row major order, so the sample at (x, y) is at index y * mSampleCount + x.
    /// ```
    public static void getHeightSamples(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_HEIGHT_SAMPLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHeightSamples].
    public final void getHeightSamples(
    	FloatArray outResult
    ) {
    	getHeightSamples(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// An array of mSampleCount^2 height samples. Samples are stored in row major order, so the sample at (x, y) is at index y * mSampleCount + x.
    /// ```
    public static void setHeightSamples(
    	MemorySegment self,
    	MemorySegment mHeightSamples
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_HEIGHT_SAMPLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHeightSamples
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHeightSamples].
    public final void setHeightSamples(
    	FloatArray mHeightSamples
    ) {
    	setHeightSamples(
    		this.segment,
    		mHeightSamples.memorySegment()
    	);
    }
    
    /// ```
    /// An array of (mSampleCount - 1)^2 material indices.
    /// ```
    public static void getMaterialIndices(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIAL_INDICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialIndices].
    public final void getMaterialIndices(
    	UnsignedCharArray outResult
    ) {
    	getMaterialIndices(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// An array of (mSampleCount - 1)^2 material indices.
    /// ```
    public static void setMaterialIndices(
    	MemorySegment self,
    	MemorySegment mMaterialIndices
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIAL_INDICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterialIndices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterialIndices].
    public final void setMaterialIndices(
    	UnsignedCharArray mMaterialIndices
    ) {
    	setMaterialIndices(
    		this.segment,
    		mMaterialIndices.memorySegment()
    	);
    }
    
    /// ```
    /// The materials of square at (x, y) is: mMaterials[mMaterialIndices[x + y * (mSampleCount - 1)]]
    /// ```
    public static void getMaterials(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterials].
    public final void getMaterials(
    	PhysicsMaterialList outResult
    ) {
    	getMaterials(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The materials of square at (x, y) is: mMaterials[mMaterialIndices[x + y * (mSampleCount - 1)]]
    /// ```
    public static void setMaterials(
    	MemorySegment self,
    	MemorySegment mMaterials
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterials].
    public final void setMaterials(
    	PhysicsMaterialList mMaterials
    ) {
    	setMaterials(
    		this.segment,
    		mMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Cosine of the threshold angle (if the angle between the two triangles is bigger than this, the edge is active, note that a concave edge is always inactive).
    /// Setting this value too small can cause ghost collisions with edges, setting it too big can cause depenetration artifacts (objects not depenetrating quickly).
    /// Valid ranges are between cos(0 degrees) and cos(90 degrees). The default value is cos(5 degrees).
    /// ```
    public static float getActiveEdgeCosThresholdAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveEdgeCosThresholdAngle].
    public final float getActiveEdgeCosThresholdAngle() {
    	return getActiveEdgeCosThresholdAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Cosine of the threshold angle (if the angle between the two triangles is bigger than this, the edge is active, note that a concave edge is always inactive).
    /// Setting this value too small can cause ghost collisions with edges, setting it too big can cause depenetration artifacts (objects not depenetrating quickly).
    /// Valid ranges are between cos(0 degrees) and cos(90 degrees). The default value is cos(5 degrees).
    /// ```
    public static void setActiveEdgeCosThresholdAngle(
    	MemorySegment self,
    	float mActiveEdgeCosThresholdAngle
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mActiveEdgeCosThresholdAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setActiveEdgeCosThresholdAngle].
    public final void setActiveEdgeCosThresholdAngle(
    	float mActiveEdgeCosThresholdAngle
    ) {
    	setActiveEdgeCosThresholdAngle(
    		this.segment,
    		mActiveEdgeCosThresholdAngle
    	);
    }
    
    /// ```
    /// Determine the minimal and maximal value of mHeightSamples (will ignore cNoCollisionValue)
    /// @param outMinValue The minimal value of mHeightSamples or FLT_MAX if no samples have collision
    /// @param outMaxValue The maximal value of mHeightSamples or -FLT_MAX if no samples have collision
    /// @param outQuantizationScale (value - outMinValue) * outQuantizationScale quantizes a height sample to 16 bits
    /// ```
    public static void determineMinAndMaxSample(
    	MemorySegment self,
    	MemorySegment outMinValue,
    	MemorySegment outMaxValue,
    	MemorySegment outQuantizationScale
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outMinValue,
    			outMaxValue,
    			outQuantizationScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#determineMinAndMaxSample].
    public final void determineMinAndMaxSample(
    	NativeFloatArray outMinValue,
    	NativeFloatArray outMaxValue,
    	NativeFloatArray outQuantizationScale
    ) {
    	determineMinAndMaxSample(
    		this.segment,
    		outMinValue.memorySegment(),
    		outMaxValue.memorySegment(),
    		outQuantizationScale.memorySegment()
    	);
    }
    
    /// ```
    /// Given mBlockSize, mSampleCount and mHeightSamples, calculate the amount of bits needed to stay below absolute error inMaxError
    /// @param inMaxError Maximum allowed error in mHeightSamples after compression (note that this does not take mScale.Y into account)
    /// @return Needed bits per sample in the range [1, 16].
    /// ```
    public static int calculateBitsPerSampleForError(
    	MemorySegment self,
    	float inMaxError
    ) {
    	MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inMaxError
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateBitsPerSampleForError].
    public final int calculateBitsPerSampleForError(
    	float inMaxError
    ) {
    	return calculateBitsPerSampleForError(
    		this.segment,
    		inMaxError
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}