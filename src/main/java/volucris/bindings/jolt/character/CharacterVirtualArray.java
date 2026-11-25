/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class CharacterVirtualArray {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN_RANGE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_SWAP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_SHRINK_TO_FIT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_PUSH_BACK;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_POP_BACK;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_INSERT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_ERASE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_ERASE_RANGE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_FRONT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_BACK;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA_CONST;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_ARRAY_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_VIRTUAL_ARRAY_CREATE = downcallHandle("JPH_CharacterVirtualArray_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_CREATE1 = downcallHandle("JPH_CharacterVirtualArray_Create1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_CREATE2 = downcallHandle("JPH_CharacterVirtualArray_Create2", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_CREATE3 = downcallHandle("JPH_CharacterVirtualArray_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_DESTROY = downcallHandleVoid("JPH_CharacterVirtualArray_Destroy", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN = downcallHandleVoid("JPH_CharacterVirtualArray_Assign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN_RANGE = downcallHandleVoid("JPH_CharacterVirtualArray_AssignRange", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_SWAP = downcallHandleVoid("JPH_CharacterVirtualArray_Swap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_CLEAR = downcallHandleVoid("JPH_CharacterVirtualArray_Clear", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_RESERVE = downcallHandleVoid("JPH_CharacterVirtualArray_Reserve", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE = downcallHandleVoid("JPH_CharacterVirtualArray_Resize", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE1 = downcallHandleVoid("JPH_CharacterVirtualArray_Resize1", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_SHRINK_TO_FIT = downcallHandleVoid("JPH_CharacterVirtualArray_ShrinkToFit", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_PUSH_BACK = downcallHandleVoid("JPH_CharacterVirtualArray_PushBack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_POP_BACK = downcallHandleVoid("JPH_CharacterVirtualArray_PopBack", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_INSERT = downcallHandleVoid("JPH_CharacterVirtualArray_Insert", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_ERASE = downcallHandleVoid("JPH_CharacterVirtualArray_Erase", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_ERASE_RANGE = downcallHandleVoid("JPH_CharacterVirtualArray_EraseRange", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET_SIZE = downcallHandle("JPH_CharacterVirtualArray_GetSize", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET_CAPACITY = downcallHandle("JPH_CharacterVirtualArray_GetCapacity", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_IS_EMPTY = downcallHandle("JPH_CharacterVirtualArray_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET = downcallHandle("JPH_CharacterVirtualArray_Get", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_ARRAY_FRONT = downcallHandle("JPH_CharacterVirtualArray_Front", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_BACK = downcallHandle("JPH_CharacterVirtualArray_Back", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA = downcallHandle("JPH_CharacterVirtualArray_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA_CONST = downcallHandle("JPH_CharacterVirtualArray_GetDataConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_ARRAY_GET_HASH = downcallHandle("JPH_CharacterVirtualArray_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterVirtualArray() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterVirtualArray(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterVirtualArray(
	    long inLength
	) {
	    this(
	        Arena.ofAuto(),
	        inLength
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterVirtualArray(
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

	public CharacterVirtualArray(
	    long inLength,
	    CharacterVirtual inValue
	) {
	    this(
	        Arena.ofAuto(),
	        inLength,
	        inValue
	    );
	}
	
	/// Typed method of [#create2].
	public CharacterVirtualArray(
		Arena arena,
		long inLength,
		CharacterVirtual inValue
	) {
		MemorySegment segment = create2(
			inLength,
			inValue.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterVirtualArray(
	    CharacterVirtualArray inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create3].
	public CharacterVirtualArray(
		Arena arena,
		CharacterVirtualArray inRHS
	) {
		MemorySegment segment = create3(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterVirtualArray(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	long inLength
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	long inLength,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_CREATE2.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_DESTROY.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN.get();
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
    	CharacterVirtualArray inRHS
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_ASSIGN_RANGE.get();
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
    	NativePointerArray inData,
    	long inCount
    ) {
    	assignRange(
    		this.segment,
    		inData.memorySegment(),
    		inCount
    	);
    }
    
    public static void swap(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_SWAP.get();
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
    	CharacterVirtualArray inRHS
    ) {
    	swap(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_CLEAR.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_RESERVE.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_RESIZE1.get();
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
    	CharacterVirtual inValue
    ) {
    	resize1(
    		this.segment,
    		inNewSize,
    		inValue.memorySegment()
    	);
    }
    
    public static void shrinkToFit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_SHRINK_TO_FIT.get();
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
    
    public static void pushBack(
    	MemorySegment self,
    	MemorySegment inValue
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_PUSH_BACK.get();
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
    	CharacterVirtual inValue
    ) {
    	pushBack(
    		this.segment,
    		inValue.memorySegment()
    	);
    }
    
    public static void popBack(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_POP_BACK.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_INSERT.get();
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
    	CharacterVirtual inValue
    ) {
    	insert(
    		this.segment,
    		inIndex,
    		inValue.memorySegment()
    	);
    }
    
    public static void erase(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_ERASE.get();
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
    
    public static void eraseRange(
    	MemorySegment self,
    	long inFirstIndex,
    	long inLastIndex
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_ERASE_RANGE.get();
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
    
    public static long getSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET_SIZE.get();
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
    
    public static long getCapacity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET_CAPACITY.get();
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
    
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_IS_EMPTY.get();
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
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET.get();
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
    public final @Nullable CharacterVirtual get(
    	long inIndex
    ) {
    	MemorySegment segment = get(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterVirtual(segment);
    }
    
    public static MemorySegment front(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_FRONT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#front].
    public final @Nullable CharacterVirtual front() {
    	MemorySegment segment = front(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterVirtual(segment);
    }
    
    public static MemorySegment back(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_BACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#back].
    public final @Nullable CharacterVirtual back() {
    	MemorySegment segment = back(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterVirtual(segment);
    }
    
    public static MemorySegment getData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getData].
    public final @Nullable NativePointerArray getData() {
    	MemorySegment segment = getData(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    public static MemorySegment getDataConst(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET_DATA_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDataConst].
    public final @Nullable NativePointerArray getDataConst() {
    	MemorySegment segment = getDataConst(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_ARRAY_GET_HASH.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHash].
    public final long getHash() {
    	return getHash(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}