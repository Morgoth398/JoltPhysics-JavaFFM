/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class LinearCurvePoints {

	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_ASSIGN;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_ASSIGN_RANGE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_SWAP;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_RESIZE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_RESIZE1;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_SHRINK_TO_FIT;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_PUSH_BACK;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_POP_BACK;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_INSERT;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_ERASE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_ERASE_RANGE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET_CONST;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_FRONT;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_BACK;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET_DATA;
	private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_POINTS_GET_DATA_CONST;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_LINEAR_CURVE_POINTS_CREATE = downcallHandle("JPH_LinearCurvePoints_Create", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_CREATE1 = downcallHandle("JPH_LinearCurvePoints_Create1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_CREATE2 = downcallHandle("JPH_LinearCurvePoints_Create2", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_CREATE3 = downcallHandle("JPH_LinearCurvePoints_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_DESTROY = downcallHandleVoid("JPH_LinearCurvePoints_Destroy", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_ASSIGN = downcallHandleVoid("JPH_LinearCurvePoints_Assign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_ASSIGN_RANGE = downcallHandleVoid("JPH_LinearCurvePoints_AssignRange", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_SWAP = downcallHandleVoid("JPH_LinearCurvePoints_Swap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_CLEAR = downcallHandleVoid("JPH_LinearCurvePoints_Clear", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_RESERVE = downcallHandleVoid("JPH_LinearCurvePoints_Reserve", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_RESIZE = downcallHandleVoid("JPH_LinearCurvePoints_Resize", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_RESIZE1 = downcallHandleVoid("JPH_LinearCurvePoints_Resize1", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_SHRINK_TO_FIT = downcallHandleVoid("JPH_LinearCurvePoints_ShrinkToFit", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_PUSH_BACK = downcallHandleVoid("JPH_LinearCurvePoints_PushBack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_POP_BACK = downcallHandleVoid("JPH_LinearCurvePoints_PopBack", UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_INSERT = downcallHandleVoid("JPH_LinearCurvePoints_Insert", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_ERASE = downcallHandleVoid("JPH_LinearCurvePoints_Erase", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_ERASE_RANGE = downcallHandleVoid("JPH_LinearCurvePoints_EraseRange", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_GET_SIZE = downcallHandle("JPH_LinearCurvePoints_GetSize", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_GET_CAPACITY = downcallHandle("JPH_LinearCurvePoints_GetCapacity", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_IS_EMPTY = downcallHandle("JPH_LinearCurvePoints_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_GET = downcallHandle("JPH_LinearCurvePoints_Get", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_GET_CONST = downcallHandle("JPH_LinearCurvePoints_GetConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_LINEAR_CURVE_POINTS_FRONT = downcallHandle("JPH_LinearCurvePoints_Front", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_BACK = downcallHandle("JPH_LinearCurvePoints_Back", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_GET_DATA = downcallHandle("JPH_LinearCurvePoints_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_LINEAR_CURVE_POINTS_GET_DATA_CONST = downcallHandle("JPH_LinearCurvePoints_GetDataConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public LinearCurvePoints() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#linearCurvePoints_Create].
	public LinearCurvePoints(Arena arena) {
		MemorySegment segment = linearCurvePoints_Create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> linearCurvePoints_Destroy(s));
	}

	public LinearCurvePoints(
	    long inLength
	) {
	    this(
	        Arena.ofAuto(),
	        inLength
	    );
	}
	
	/// Typed method of [#linearCurvePoints_Create1].
	public LinearCurvePoints(
		Arena arena,
		long inLength
	) {
		MemorySegment segment = linearCurvePoints_Create1(
			inLength
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> linearCurvePoints_Destroy(s));
	}

	public LinearCurvePoints(
	    long inLength,
	    LinearCurvePoint inValue
	) {
	    this(
	        Arena.ofAuto(),
	        inLength,
	        inValue
	    );
	}
	
	/// Typed method of [#linearCurvePoints_Create2].
	public LinearCurvePoints(
		Arena arena,
		long inLength,
		LinearCurvePoint inValue
	) {
		MemorySegment segment = linearCurvePoints_Create2(
			inLength,
			inValue.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> linearCurvePoints_Destroy(s));
	}

	public LinearCurvePoints(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Default constructor.
    /// ```
    public static MemorySegment linearCurvePoints_Create() {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor with length.
    /// ```
    public static MemorySegment linearCurvePoints_Create1(
    	long inLength
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor with length and value.
    /// ```
    public static MemorySegment linearCurvePoints_Create2(
    	long inLength,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inLength,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment linearCurvePoints_Create3(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Create3].
    public final @Nullable LinearCurvePoints linearCurvePoints_Create3(
    	LinearCurvePoints inRHS
    ) {
    	MemorySegment segment = linearCurvePoints_Create3(
    		inRHS.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LinearCurvePoints(segment);
    }
    
    /// ```
    /// Destruct all elements.
    /// ```
    public static void linearCurvePoints_Destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void linearCurvePoints_Assign(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_ASSIGN.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Assign].
    public final void linearCurvePoints_Assign(
    	LinearCurvePoints inRHS
    ) {
    	linearCurvePoints_Assign(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void linearCurvePoints_AssignRange(
    	MemorySegment self,
    	MemorySegment inData,
    	long inCount
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_ASSIGN_RANGE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inData,
    			inCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_AssignRange].
    public final void linearCurvePoints_AssignRange(
    	LinearCurvePoint inData,
    	long inCount
    ) {
    	linearCurvePoints_AssignRange(
    		this.segment,
    		inData.memorySegment(),
    		inCount
    	);
    }
    
    /// ```
    /// Swap the contents of two arrays. 
    /// ```
    public static void linearCurvePoints_Swap(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_SWAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Swap].
    public final void linearCurvePoints_Swap(
    	LinearCurvePoints inRHS
    ) {
    	linearCurvePoints_Swap(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void linearCurvePoints_Clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_CLEAR.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Clear].
    public final void linearCurvePoints_Clear() {
    	linearCurvePoints_Clear(
    		this.segment
    	);
    }
    
    public static void linearCurvePoints_Reserve(
    	MemorySegment self,
    	long inNewCapacity
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_RESERVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNewCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Reserve].
    public final void linearCurvePoints_Reserve(
    	long inNewCapacity
    ) {
    	linearCurvePoints_Reserve(
    		this.segment,
    		inNewCapacity
    	);
    }
    
    public static void linearCurvePoints_Resize(
    	MemorySegment self,
    	long inNewSize
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_RESIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNewSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Resize].
    public final void linearCurvePoints_Resize(
    	long inNewSize
    ) {
    	linearCurvePoints_Resize(
    		this.segment,
    		inNewSize
    	);
    }
    
    public static void linearCurvePoints_Resize1(
    	MemorySegment self,
    	long inNewSize,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_RESIZE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNewSize,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Resize1].
    public final void linearCurvePoints_Resize1(
    	long inNewSize,
    	LinearCurvePoint inValue
    ) {
    	linearCurvePoints_Resize1(
    		this.segment,
    		inNewSize,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Reduce the capacity of the array to match its size.
    /// ```
    public static void linearCurvePoints_ShrinkToFit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_SHRINK_TO_FIT.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_ShrinkToFit].
    public final void linearCurvePoints_ShrinkToFit() {
    	linearCurvePoints_ShrinkToFit(
    		this.segment
    	);
    }
    
    /// ```
    /// Add element to the back of the array. 
    /// ```
    public static void linearCurvePoints_PushBack(
    	MemorySegment self,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_PUSH_BACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_PushBack].
    public final void linearCurvePoints_PushBack(
    	LinearCurvePoint inValue
    ) {
    	linearCurvePoints_PushBack(
    		this.segment,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Remove element from the back of the array.
    /// ```
    public static void linearCurvePoints_PopBack(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_POP_BACK.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_PopBack].
    public final void linearCurvePoints_PopBack() {
    	linearCurvePoints_PopBack(
    		this.segment
    	);
    }
    
    public static void linearCurvePoints_Insert(
    	MemorySegment self,
    	long inIndex,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_INSERT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Insert].
    public final void linearCurvePoints_Insert(
    	long inIndex,
    	LinearCurvePoint inValue
    ) {
    	linearCurvePoints_Insert(
    		this.segment,
    		inIndex,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Remove one element from the array.
    /// ```
    public static void linearCurvePoints_Erase(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_ERASE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Erase].
    public final void linearCurvePoints_Erase(
    	long inIndex
    ) {
    	linearCurvePoints_Erase(
    		this.segment,
    		inIndex
    	);
    }
    
    /// ```
    /// Remove multiple element from the array.
    /// ```
    public static void linearCurvePoints_EraseRange(
    	MemorySegment self,
    	long inFirstIndex,
    	long inLastIndex
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_ERASE_RANGE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFirstIndex,
    			inLastIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_EraseRange].
    public final void linearCurvePoints_EraseRange(
    	long inFirstIndex,
    	long inLastIndex
    ) {
    	linearCurvePoints_EraseRange(
    		this.segment,
    		inFirstIndex,
    		inLastIndex
    	);
    }
    
    /// ```
    /// Returns amount of elements in the array.
    /// ```
    public static long linearCurvePoints_GetSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_GetSize].
    public final long linearCurvePoints_GetSize() {
    	return linearCurvePoints_GetSize(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns maximum amount of elements the array can hold.
    /// ```
    public static long linearCurvePoints_GetCapacity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET_CAPACITY.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_GetCapacity].
    public final long linearCurvePoints_GetCapacity() {
    	return linearCurvePoints_GetCapacity(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns true if there are no elements in the array.
    /// ```
    public static boolean linearCurvePoints_IsEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_IS_EMPTY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_IsEmpty].
    public final boolean linearCurvePoints_IsEmpty() {
    	return linearCurvePoints_IsEmpty(
    		this.segment
    	);
    }
    
    public static MemorySegment linearCurvePoints_Get(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Get].
    public final @Nullable LinearCurvePoint linearCurvePoints_Get(
    	long inIndex
    ) {
    	MemorySegment segment = linearCurvePoints_Get(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LinearCurvePoint(segment);
    }
    
    public static MemorySegment linearCurvePoints_GetConst(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_GetConst].
    public final @Nullable LinearCurvePoint linearCurvePoints_GetConst(
    	long inIndex
    ) {
    	MemorySegment segment = linearCurvePoints_GetConst(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LinearCurvePoint(segment);
    }
    
    /// ```
    /// First element in the array.
    /// ```
    public static MemorySegment linearCurvePoints_Front(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_FRONT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Front].
    public final @Nullable LinearCurvePoint linearCurvePoints_Front() {
    	MemorySegment segment = linearCurvePoints_Front(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LinearCurvePoint(segment);
    }
    
    /// ```
    /// Last element in the array.
    /// ```
    public static MemorySegment linearCurvePoints_Back(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_BACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_Back].
    public final @Nullable LinearCurvePoint linearCurvePoints_Back() {
    	MemorySegment segment = linearCurvePoints_Back(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LinearCurvePoint(segment);
    }
    
    public static MemorySegment linearCurvePoints_GetData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_GetData].
    public final @Nullable MemorySegment linearCurvePoints_GetData() {
    	MemorySegment segment = linearCurvePoints_GetData(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment linearCurvePoints_GetDataConst(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_LINEAR_CURVE_POINTS_GET_DATA_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#linearCurvePoints_GetDataConst].
    public final @Nullable MemorySegment linearCurvePoints_GetDataConst() {
    	MemorySegment segment = linearCurvePoints_GetDataConst(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}