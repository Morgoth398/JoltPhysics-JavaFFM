/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class LinearCurve {

	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_POINTS;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_SET_POINTS;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_ADD_POINT;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_SORT;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_MIN_X;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_MAX_X;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_RESTORE_BINARY_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_LINEAR_CURVE_CREATE = downcallHandle("JPH_LinearCurve_Create", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_DESTROY = downcallHandleVoid("JPH_LinearCurve_Destroy", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_GET_POINTS = downcallHandleVoid("JPH_LinearCurve_GetPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_SET_POINTS = downcallHandleVoid("JPH_LinearCurve_SetPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_CLEAR = downcallHandleVoid("JPH_LinearCurve_Clear", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_RESERVE = downcallHandleVoid("JPH_LinearCurve_Reserve", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_LINEAR_CURVE_ADD_POINT = downcallHandleVoid("JPH_LinearCurve_AddPoint", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_LINEAR_CURVE_SORT = downcallHandleVoid("JPH_LinearCurve_Sort", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_GET_MIN_X = downcallHandle("JPH_LinearCurve_GetMinX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_GET_MAX_X = downcallHandle("JPH_LinearCurve_GetMaxX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_GET_VALUE = downcallHandle("JPH_LinearCurve_GetValue", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_LINEAR_CURVE_SAVE_BINARY_STATE = downcallHandleVoid("JPH_LinearCurve_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_LinearCurve_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public LinearCurve() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public LinearCurve(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public LinearCurve(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_LINEAR_CURVE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getPoints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_GET_POINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoints].
    public final void getPoints(
    	LinearCurvePoints outResult
    ) {
    	getPoints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setPoints(
    	MemorySegment self,
    	MemorySegment mPoints
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_SET_POINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoints].
    public final void setPoints(
    	LinearCurvePoints mPoints
    ) {
    	setPoints(
    		this.segment,
    		mPoints.memorySegment()
    	);
    }
    
    /// ```
    /// Remove all points
    /// ```
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_CLEAR.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clear].
    public final void clear() {
    	clear(
    		this.segment
    	);
    }
    
    /// ```
    /// Reserve memory for inNumPoints points
    /// ```
    public static void reserve(
    	MemorySegment self,
    	int inNumPoints
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_RESERVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNumPoints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reserve].
    public final void reserve(
    	int inNumPoints
    ) {
    	reserve(
    		this.segment,
    		inNumPoints
    	);
    }
    
    /// ```
    /// Add a point to the curve. Points must be inserted in ascending X or Sort() needs to be called when all points have been added.
    /// @param inX X value
    /// @param inY Y value
    /// ```
    public static void addPoint(
    	MemorySegment self,
    	float inX,
    	float inY
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_ADD_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addPoint].
    public final void addPoint(
    	float inX,
    	float inY
    ) {
    	addPoint(
    		this.segment,
    		inX,
    		inY
    	);
    }
    
    /// ```
    /// Sort the points on X ascending
    /// ```
    public static void sort(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_SORT.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sort].
    public final void sort() {
    	sort(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the lowest X value
    /// ```
    public static float getMinX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_GET_MIN_X.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinX].
    public final float getMinX() {
    	return getMinX(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the highest X value
    /// ```
    public static float getMaxX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_GET_MAX_X.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxX].
    public final float getMaxX() {
    	return getMaxX(
    		this.segment
    	);
    }
    
    /// ```
    /// Sample value on the curve
    /// @param inX X value to sample at
    /// @return Interpolated Y value
    /// ```
    public static float getValue(
    	MemorySegment self,
    	float inX
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_GET_VALUE.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inX
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getValue].
    public final float getValue(
    	float inX
    ) {
    	return getValue(
    		this.segment,
    		inX
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_SAVE_BINARY_STATE.get();
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
    	MethodHandle method = JPH_LINEAR_CURVE_RESTORE_BINARY_STATE.get();
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