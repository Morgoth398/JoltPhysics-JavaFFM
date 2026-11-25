/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ContactList {

	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_ASSIGN;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_ASSIGN_RANGE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_SWAP;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_RESERVE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_RESIZE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_RESIZE1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_SHRINK_TO_FIT;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_PUSH_BACK;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_POP_BACK;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_INSERT;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_ERASE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_ERASE_RANGE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET_CONST;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_FRONT;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_BACK;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET_DATA;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_LIST_GET_DATA_CONST;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONTACT_LIST_CREATE = downcallHandle("JPH_ContactList_Create", UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_CREATE1 = downcallHandle("JPH_ContactList_Create1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_CREATE2 = downcallHandle("JPH_ContactList_Create2", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_CREATE3 = downcallHandle("JPH_ContactList_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_DESTROY = downcallHandleVoid("JPH_ContactList_Destroy", UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_ASSIGN = downcallHandleVoid("JPH_ContactList_Assign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_ASSIGN_RANGE = downcallHandleVoid("JPH_ContactList_AssignRange", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_SWAP = downcallHandleVoid("JPH_ContactList_Swap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_CLEAR = downcallHandleVoid("JPH_ContactList_Clear", UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_RESERVE = downcallHandleVoid("JPH_ContactList_Reserve", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_RESIZE = downcallHandleVoid("JPH_ContactList_Resize", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_RESIZE1 = downcallHandleVoid("JPH_ContactList_Resize1", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_SHRINK_TO_FIT = downcallHandleVoid("JPH_ContactList_ShrinkToFit", UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_PUSH_BACK = downcallHandleVoid("JPH_ContactList_PushBack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_POP_BACK = downcallHandleVoid("JPH_ContactList_PopBack", UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_INSERT = downcallHandleVoid("JPH_ContactList_Insert", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_ERASE = downcallHandleVoid("JPH_ContactList_Erase", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_ERASE_RANGE = downcallHandleVoid("JPH_ContactList_EraseRange", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		JPH_CONTACT_LIST_GET_SIZE = downcallHandle("JPH_ContactList_GetSize", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_GET_CAPACITY = downcallHandle("JPH_ContactList_GetCapacity", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_IS_EMPTY = downcallHandle("JPH_ContactList_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_GET = downcallHandle("JPH_ContactList_Get", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_GET_CONST = downcallHandle("JPH_ContactList_GetConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONTACT_LIST_FRONT = downcallHandle("JPH_ContactList_Front", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_BACK = downcallHandle("JPH_ContactList_Back", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_GET_DATA = downcallHandle("JPH_ContactList_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_LIST_GET_DATA_CONST = downcallHandle("JPH_ContactList_GetDataConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ContactList() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ContactList(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ContactList(
	    long inLength
	) {
	    this(
	        Arena.ofAuto(),
	        inLength
	    );
	}
	
	/// Typed method of [#create1].
	public ContactList(
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

	public ContactList(
	    long inLength,
	    CharacterContact inValue
	) {
	    this(
	        Arena.ofAuto(),
	        inLength,
	        inValue
	    );
	}
	
	/// Typed method of [#create2].
	public ContactList(
		Arena arena,
		long inLength,
		CharacterContact inValue
	) {
		MemorySegment segment = create2(
			inLength,
			inValue.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ContactList(
	    ContactList inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create3].
	public ContactList(
		Arena arena,
		ContactList inRHS
	) {
		MemorySegment segment = create3(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ContactList(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Default constructor.
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CONTACT_LIST_CREATE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_CREATE1.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_CREATE2.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_CREATE3.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_DESTROY.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_ASSIGN.get();
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
    	ContactList inRHS
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
    	MethodHandle method = JPH_CONTACT_LIST_ASSIGN_RANGE.get();
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
    	CharacterContact inData,
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
    	MethodHandle method = JPH_CONTACT_LIST_SWAP.get();
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
    	ContactList inRHS
    ) {
    	swap(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_LIST_CLEAR.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_RESERVE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_RESIZE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_RESIZE1.get();
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
    	CharacterContact inValue
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
    	MethodHandle method = JPH_CONTACT_LIST_SHRINK_TO_FIT.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_PUSH_BACK.get();
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
    	CharacterContact inValue
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
    	MethodHandle method = JPH_CONTACT_LIST_POP_BACK.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_INSERT.get();
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
    	CharacterContact inValue
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
    	MethodHandle method = JPH_CONTACT_LIST_ERASE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_ERASE_RANGE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_GET_SIZE.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_GET_CAPACITY.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_IS_EMPTY.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_GET.get();
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
    public final @Nullable CharacterContact get(
    	long inIndex
    ) {
    	MemorySegment segment = get(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContact(segment);
    }
    
    public static MemorySegment getConst(
    	MemorySegment self,
    	long inIndex
    ) {
    	MethodHandle method = JPH_CONTACT_LIST_GET_CONST.get();
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
    public final @Nullable CharacterContact getConst(
    	long inIndex
    ) {
    	MemorySegment segment = getConst(
    		this.segment,
    		inIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContact(segment);
    }
    
    /// ```
    /// First element in the array.
    /// ```
    public static MemorySegment front(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_LIST_FRONT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#front].
    public final @Nullable CharacterContact front() {
    	MemorySegment segment = front(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContact(segment);
    }
    
    /// ```
    /// Last element in the array.
    /// ```
    public static MemorySegment back(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_LIST_BACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#back].
    public final @Nullable CharacterContact back() {
    	MemorySegment segment = back(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContact(segment);
    }
    
    public static MemorySegment getData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_LIST_GET_DATA.get();
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
    	MethodHandle method = JPH_CONTACT_LIST_GET_DATA_CONST.get();
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