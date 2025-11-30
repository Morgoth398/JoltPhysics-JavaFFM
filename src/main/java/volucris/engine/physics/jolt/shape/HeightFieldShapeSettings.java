package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a HeightFieldShape
 */
public final class HeightFieldShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_HeightFieldShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_DetermineMinAndMaxSample", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR = downcallHandle("JPH_HeightFieldShapeSettings_CalculateBitsPerSampleForError", JAVA_INT, ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetOffset", ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetOffset", ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetScale", ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetScale", ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShapeSettings_GetSampleCount", JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetSampleCount", ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMinHeightValue", JAVA_FLOAT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMinHeightValue", ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMaxHeightValue", JAVA_FLOAT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaxHeightValue", ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShapeSettings_GetBlockSize", JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBlockSize", ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE = downcallHandle("JPH_HeightFieldShapeSettings_GetBitsPerSample", JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBitsPerSample", ADDRESS, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_HeightFieldShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetActiveEdgeCosThresholdAngle", ADDRESS, JAVA_FLOAT);
		JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_HeightFieldShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	/**
	 * Create a height field shape of sampleCount * sampleCount vertices. The height
	 * field is a surface defined by: inOffset + inScale * (x, samples[y *
	 * sampleCount + x], y). where x and y are integers in the range x and y e [0,
	 * sampleCount - 1]. sampleCount: sampleCount / blockSize must be minimally 2
	 * and a power of 2 is the most efficient in terms of performance and storage.
	 * samples: sampleCount^2 vertices. materialIndices: (sampleCount - 1)^2 indices
	 * that index into materialList.
	 */
	public HeightFieldShapeSettings(float[] samples, Vector3f offset, Vector3f scale, int sampleCount,
			byte[] materialIndices) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 offsetVec = new Vec3(arena, offset);
			Vec3 scaleVec = new Vec3(arena, scale);

			MemorySegment offsetAddr = offsetVec.memorySegment();
			MemorySegment scaleAddr = scaleVec.memorySegment();
			MemorySegment samplesArray = arena.allocateFrom(JAVA_FLOAT, samples);
			MemorySegment matArray = arena.allocateFrom(JAVA_BYTE, materialIndices);

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(samplesArray, offsetAddr, scaleAddr, sampleCount, matArray);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create height field shape settings.");
		}
		super(segment);

		vecTmp = new Vec3();
	}

	/**
	 * @see #HeightFieldShapeSettings(float[], Vector3f, Vector3f, int, byte[])
	 */
	public HeightFieldShapeSettings(float[] samples, Vector3f offset, Vector3f scale, int sampleCount) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 offsetVec = new Vec3(arena, offset);
			Vec3 scaleVec = new Vec3(arena, scale);

			MemorySegment offsetAddr = offsetVec.memorySegment();
			MemorySegment scaleAddr = scaleVec.memorySegment();
			MemorySegment samplesArray = arena.allocateFrom(JAVA_FLOAT, samples);
			MemorySegment matArray = MemorySegment.NULL;

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(samplesArray, offsetAddr, scaleAddr, sampleCount, matArray);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create height field shape settings.");
		}
		super(segment);

		vecTmp = new Vec3();
	}

	/**
	 * Determine the minimal and maximal value of mHeightSamples (will ignore
	 * cNoCollisionValue)
	 * 
	 * @param minValue          The minimal value of mHeightSamples or FLT_MAX if no
	 *                          samples have collision
	 * @param maxValue          The maximal value of mHeightSamples or -FLT_MAX if
	 *                          no samples have collision
	 * @param quantizationScale (value - outMinValue) * outQuantizationScale
	 *                          quantizes a height sample to 16 bits
	 */
	public void determineMinAndMaxSample(float[] minValue, float[] maxValue, float[] quantizationScale) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment minValuePointer = arena.allocate(JAVA_FLOAT);
			MemorySegment maxValuePointer = arena.allocate(JAVA_FLOAT);
			MemorySegment scalePointer = arena.allocate(JAVA_FLOAT);

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE;
			method.invokeExact(jphShapeSettings, minValuePointer, maxValuePointer, scalePointer);

			minValue[0] = minValuePointer.getAtIndex(JAVA_FLOAT, 0);
			maxValue[0] = maxValuePointer.getAtIndex(JAVA_FLOAT, 0);
			quantizationScale[0] = scalePointer.getAtIndex(JAVA_FLOAT, 0);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot determine min and max sample.");
		}
	}

	/**
	 * Given mBlockSize, mSampleCount and mHeightSamples, calculate the amount of
	 * bits needed to stay below absolute error inMaxError
	 * 
	 * @param maxError Maximum allowed error in mHeightSamples after compression
	 *                 (note that this does not take mScale.Y into account)
	 * 
	 * @return Needed bits per sample in the range [1, 8].
	 */
	public int calculateBitsPerSampleForError(float maxError) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR;
			return (int) method.invokeExact(jphShapeSettings, maxError);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot calculate bits per sample for error.");
		}
	}

	/**
	 * Artificial minimal value of mHeightSamples, used for compression and can be
	 * used to update the terrain after creating with lower height values. If there
	 * are any lower values in mHeightSamples, this value will be ignored.
	 */
	public Vector3f getOffset(Vector3f target) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET;
			method.invokeExact(jphShapeSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get offset.");
		}
	}

	/**
	 * @see #getOffset(Vector3f)
	 */
	public void setOffset(Vector3f offset) {
		try {
			vecTmp.set(offset);

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET;
			method.invokeExact(jphShapeSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set offset.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getScale(Vector3f target) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE;
			method.invokeExact(jphShapeSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get scale.");
		}
	}

	/**
	 * 
	 */
	public void setScale(Vector3f scale) {
		try {
			vecTmp.set(scale);

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE;
			method.invokeExact(jphShapeSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set scale.");
		}
	}

	/**
	 * 
	 */
	public int getSampleCount() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT;
			return (int) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get sample count.");
		}
	}

	/**
	 * 
	 */
	public void setSampleCount(int sampleCount) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT;
			method.invokeExact(jphShapeSettings, sampleCount);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set sample count.");
		}
	}

	/**
	 * Artificial minimal value of mHeightSamples, used for compression and can be
	 * used to update the terrain after creating with lower height values. If there
	 * are any lower values in mHeightSamples, this value will be ignored.
	 */
	public float getMinHeightValue() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get min height value.");
		}
	}

	/**
	 * @see #getMinHeightValue()
	 */
	public void setMinHeightValue(float minHeightValue) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE;
			method.invokeExact(jphShapeSettings, minHeightValue);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set min height value.");
		}
	}

	/**
	 * Artificial maximum value of mHeightSamples, used for compression and can be
	 * used to update the terrain after creating with higher height values. If there
	 * are any higher values in mHeightSamples, this value will be ignored.
	 */
	public float getMaxHeightValue() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max height value.");
		}
	}

	/**
	 * @see #getMaxHeightValue()
	 */
	public void setMaxHeightValue(float maxHeightValue) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE;
			method.invokeExact(jphShapeSettings, maxHeightValue);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max height value.");
		}
	}

	/**
	 * The heightfield is divided in blocks of mBlockSize * mBlockSize * 2 triangles
	 * and the acceleration structure culls blocks only, bigger block sizes reduce
	 * memory consumption but also reduce query performance. Sensible values are [2,
	 * 8], does not need to be a power of 2. Note that at run-time we'll perform one
	 * more grid subdivision, so the effective block size is half of what is
	 * provided here.
	 */
	public int getBlockSize() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE;
			return (int) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get block size.");
		}
	}

	/**
	 * @see #getBlockSize()
	 */
	public void setBlockSize(int blockSize) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE;
			method.invokeExact(jphShapeSettings, blockSize);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set block size.");
		}
	}

	/**
	 * How many bits per sample to use to compress the height field. Can be in the
	 * range [1, 8]. Note that each sample is compressed relative to the min/max
	 * value of its block of mBlockSize * mBlockSize pixels so the effective
	 * precision is higher. Also note that increasing mBlockSize saves more memory
	 * than reducing the amount of bits per sample.
	 */
	public int getBitsPerSample() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE;
			return (int) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get bits per sample.");
		}
	}

	/**
	 * @see #getBitsPerSample()
	 */
	public void setBitsPerSample(int bitsPerSample) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE;
			method.invokeExact(jphShapeSettings, bitsPerSample);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set bits per sample.");
		}
	}

	/**
	 * Cosine of the threshold angle (if the angle between the two triangles is
	 * bigger than this, the edge is active, note that a concave edge is always
	 * inactive). Setting this value too small can cause ghost collisions with
	 * edges, setting it too big can cause depenetration artifacts (objects not
	 * depenetrating quickly). Valid ranges are between cos(0 degrees) and cos(90
	 * degrees). The default value is cos(5 degrees).
	 */
	public float getActiveEdgeCosThresholdAngle() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get activeEdgeCosThresholdAngle.");
		}
	}

	/**
	 * @see #getActiveEdgeCosThresholdAngle()	
	 */
	public void setActiveEdgeCosThresholdAngle(float value) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
			method.invokeExact(jphShapeSettings, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set activeEdgeCosThresholdAngle.");
		}
	}

	public HeightFieldShape createShape() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new HeightFieldShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}