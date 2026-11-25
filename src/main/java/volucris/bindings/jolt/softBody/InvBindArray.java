/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class InvBindArray {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN_RANGE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SWAP;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SHRINK_TO_FIT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_PUSH_BACK;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_POP_BACK;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_INSERT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE_RANGE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CONST;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_FRONT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_BACK;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA_CONST;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Create1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE2 = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Create2", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE3 = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Assign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN_RANGE = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_AssignRange", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SWAP = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Swap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CLEAR = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Clear", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESERVE = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Reserve", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Resize", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE1 = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Resize1", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SHRINK_TO_FIT = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_ShrinkToFit", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_PUSH_BACK = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_PushBack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_POP_BACK = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_PopBack", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_INSERT = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Insert", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_Erase", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE_RANGE = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBindArray_EraseRange", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_SIZE = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_GetSize", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CAPACITY = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_GetCapacity", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_IS_EMPTY = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Get", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CONST = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_GetConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_FRONT = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Front", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_BACK = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_Back", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA_CONST = downcallHandle("JPH_SoftBodySharedSettingsInvBindArray_GetDataConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public InvBindArray() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public InvBindArray(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBindArray(
	    long inLength
	) {
	    this(
	        Arena.ofAuto(),
	        inLength
	    );
	}
	
	/// Typed method of [#create1].
	public InvBindArray(
		Arena arena,
		long inLength
	) {
		MemorySegment segment = create1(
			inLength
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBindArray(
	    long inLength,
	    InvBind inValue
	) {
	    this(
	        Arena.ofAuto(),
	        inLength,
	        inValue
	    );
	}
	
	/// Typed method of [#create2].
	public InvBindArray(
		Arena arena,
		long inLength,
		InvBind inValue
	) {
		MemorySegment segment = create2(
			inLength,
			inValue.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBindArray(
	    InvBindArray inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create3].
	public InvBindArray(
		Arena arena,
		InvBindArray inRHS
	) {
		MemorySegment segment = create3(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBindArray(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Default constructor.
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor with length.
    /// ```
    public static MemorySegment create1(
    	long inLength
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE1.get();
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
    public static MemorySegment create2(
    	long inLength,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inLength,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Destruct all elements.
    /// ```
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void assign(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#assign].
    public final void assign(
    	InvBindArray inRHS
    ) {
    	assign(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void assignRange(
    	MemorySegment self,
    	MemorySegment inData,
    	long inCount
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ASSIGN_RANGE.get();
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
    
    /// Typed method of [#assignRange].
    public final void assignRange(
    	InvBind inData,
    	long inCount
    ) {
    	assignRange(
    		this.segment,
    		inData.memorySegment(),
    		inCount
    	);
    }
    
    /// ```
    /// Swap the contents of two arrays. 
    /// ```
    public static void swap(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SWAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#swap].
    public final void swap(
    	InvBindArray inRHS
    ) {
    	swap(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_CLEAR.get();
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
    
    public static void reserve(
    	MemorySegment self,
    	long inNewCapacity
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESERVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNewCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reserve].
    public final void reserve(
    	long inNewCapacity
    ) {
    	reserve(
    		this.segment,
    		inNewCapacity
    	);
    }
    
    public static void resize(
    	MemorySegment self,
    	long inNewSize
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNewSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resize].
    public final void resize(
    	long inNewSize
    ) {
    	resize(
    		this.segment,
    		inNewSize
    	);
    }
    
    public static void resize1(
    	MemorySegment self,
    	long inNewSize,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_RESIZE1.get();
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
    
    /// Typed method of [#resize1].
    public final void resize1(
    	long inNewSize,
    	InvBind inValue
    ) {
    	resize1(
    		this.segment,
    		inNewSize,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Reduce the capacity of the array to match its size.
    /// ```
    public static void shrinkToFit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_SHRINK_TO_FIT.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shrinkToFit].
    public final void shrinkToFit() {
    	shrinkToFit(
    		this.segment
    	);
    }
    
    /// ```
    /// Add element to the back of the array. 
    /// ```
    public static void pushBack(
    	MemorySegment self,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_PUSH_BACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pushBack].
    public final void pushBack(
    	InvBind inValue
    ) {
    	pushBack(
    		this.segment,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Remove element from the back of the array.
    /// ```
    public static void popBack(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_POP_BACK.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#popBack].
    public final void popBack() {
    	popBack(
    		this.segment
    	);
    }
    
    public static void insert(
    	MemorySegment self,
    	long inIndex,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_INSERT.get();
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
    
    /// Typed method of [#insert].
    public final void insert(
    	long inIndex,
    	InvBind inValue
    ) {
    	insert(
    		this.segment,
    		inIndex,
    		inValue.memorySegment()
    	);
    }
    
    /// ```
    /// Remove one element from the array.
    /// ```
    public static void erase(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#erase].
    public final void erase(
    	long inIndex
    ) {
    	erase(
    		this.segment,
    		inIndex
    	);
    }
    
    /// ```
    /// Remove multiple element from the array.
    /// ```
    public static void eraseRange(
    	MemorySegment self,
    	long inFirstIndex,
    	long inLastIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_ERASE_RANGE.get();
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
    
    /// Typed method of [#eraseRange].
    public final void eraseRange(
    	long inFirstIndex,
    	long inLastIndex
    ) {
    	eraseRange(
    		this.segment,
    		inFirstIndex,
    		inLastIndex
    	);
    }
    
    /// ```
    /// Returns amount of elements in the array.
    /// ```
    public static long getSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSize].
    public final long getSize() {
    	return getSize(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns maximum amount of elements the array can hold.
    /// ```
    public static long getCapacity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CAPACITY.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCapacity].
    public final long getCapacity() {
    	return getCapacity(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns true if there are no elements in the array.
    /// ```
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_IS_EMPTY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isEmpty].
    public final boolean isEmpty() {
    	return isEmpty(
    		this.segment
    	);
    }
    
    public static MemorySegment get(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#get].
    public final @Nullable InvBind get(
    	long inIndex
    ) {
    	MemorySegment segment = get(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new InvBind(segment);
    }
    
    public static MemorySegment getConst(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConst].
    public final @Nullable InvBind getConst(
    	long inIndex
    ) {
    	MemorySegment segment = getConst(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new InvBind(segment);
    }
    
    /// ```
    /// First element in the array.
    /// ```
    public static MemorySegment front(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_FRONT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#front].
    public final @Nullable InvBind front() {
    	MemorySegment segment = front(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new InvBind(segment);
    }
    
    /// ```
    /// Last element in the array.
    /// ```
    public static MemorySegment back(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_BACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#back].
    public final @Nullable InvBind back() {
    	MemorySegment segment = back(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new InvBind(segment);
    }
    
    public static MemorySegment getData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getData].
    public final @Nullable MemorySegment getData() {
    	MemorySegment segment = getData(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment getDataConst(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_ARRAY_GET_DATA_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDataConst].
    public final @Nullable MemorySegment getDataConst() {
    	MemorySegment segment = getDataConst(
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