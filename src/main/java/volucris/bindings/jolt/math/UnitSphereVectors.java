/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class UnitSphereVectors {

	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_PUSH_BACK;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_POP_BACK;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_GET_CAPACITY;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_RESIZE;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_GET_DATA;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_GET_DATA_CONST;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_AT;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_AT_CONST;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_FRONT;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_BACK;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_ERASE;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_ERASE_RANGE;
	private static final LazyConstant<MethodHandle> JPH_UNIT_SPHERE_VECTORS_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_UNIT_SPHERE_VECTORS_CREATE = downcallHandle("JPH_UnitSphereVectors_Create", UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_CREATE1 = downcallHandle("JPH_UnitSphereVectors_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_DESTROY = downcallHandleVoid("JPH_UnitSphereVectors_Destroy", UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_CLEAR = downcallHandleVoid("JPH_UnitSphereVectors_Clear", UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_PUSH_BACK = downcallHandleVoid("JPH_UnitSphereVectors_PushBack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_POP_BACK = downcallHandleVoid("JPH_UnitSphereVectors_PopBack", UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_IS_EMPTY = downcallHandle("JPH_UnitSphereVectors_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_GET_SIZE = downcallHandle("JPH_UnitSphereVectors_GetSize", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_GET_CAPACITY = downcallHandle("JPH_UnitSphereVectors_GetCapacity", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_RESIZE = downcallHandleVoid("JPH_UnitSphereVectors_Resize", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UNIT_SPHERE_VECTORS_GET_DATA = downcallHandle("JPH_UnitSphereVectors_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_GET_DATA_CONST = downcallHandle("JPH_UnitSphereVectors_GetDataConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_AT = downcallHandle("JPH_UnitSphereVectors_At", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UNIT_SPHERE_VECTORS_AT_CONST = downcallHandle("JPH_UnitSphereVectors_AtConst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UNIT_SPHERE_VECTORS_FRONT = downcallHandle("JPH_UnitSphereVectors_Front", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_BACK = downcallHandle("JPH_UnitSphereVectors_Back", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UNIT_SPHERE_VECTORS_ERASE = downcallHandleVoid("JPH_UnitSphereVectors_Erase", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UNIT_SPHERE_VECTORS_ERASE_RANGE = downcallHandleVoid("JPH_UnitSphereVectors_EraseRange", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_UNIT_SPHERE_VECTORS_GET_HASH = downcallHandle("JPH_UnitSphereVectors_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public UnitSphereVectors() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public UnitSphereVectors(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public UnitSphereVectors(
	    UnitSphereVectors inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public UnitSphereVectors(
		Arena arena,
		UnitSphereVectors inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public UnitSphereVectors(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_CREATE1.get();
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
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void clear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_CLEAR.get();
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
    
    public static void pushBack(
    	MemorySegment self,
    	MemorySegment inElement
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_PUSH_BACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inElement
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pushBack].
    public final void pushBack(
    	Vec3 inElement
    ) {
    	pushBack(
    		this.segment,
    		inElement.memorySegment()
    	);
    }
    
    public static void popBack(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_POP_BACK.get();
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
    
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_IS_EMPTY.get();
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
    
    public static int getSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_GET_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSize].
    public final int getSize() {
    	return getSize(
    		this.segment
    	);
    }
    
    public static int getCapacity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_GET_CAPACITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCapacity].
    public final int getCapacity() {
    	return getCapacity(
    		this.segment
    	);
    }
    
    public static void resize(
    	MemorySegment self,
    	int inNewSize
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_RESIZE.get();
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
    	int inNewSize
    ) {
    	resize(
    		this.segment,
    		inNewSize
    	);
    }
    
    public static MemorySegment getData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getData].
    public final @Nullable Vec3 getData() {
    	MemorySegment segment = getData(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static MemorySegment getDataConst(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_GET_DATA_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDataConst].
    public final @Nullable Vec3 getDataConst() {
    	MemorySegment segment = getDataConst(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static MemorySegment at(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#at].
    public final @Nullable Vec3 at(
    	int inIdx
    ) {
    	MemorySegment segment = at(
    		this.segment,
    		inIdx
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static MemorySegment atConst(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_AT_CONST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#atConst].
    public final @Nullable Vec3 atConst(
    	int inIdx
    ) {
    	MemorySegment segment = atConst(
    		this.segment,
    		inIdx
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static MemorySegment front(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_FRONT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#front].
    public final @Nullable Vec3 front() {
    	MemorySegment segment = front(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static MemorySegment back(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_BACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#back].
    public final @Nullable Vec3 back() {
    	MemorySegment segment = back(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    public static void erase(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_ERASE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#erase].
    public final void erase(
    	int inIdx
    ) {
    	erase(
    		this.segment,
    		inIdx
    	);
    }
    
    public static void eraseRange(
    	MemorySegment self,
    	int inFirstIdx,
    	int inLastIdx
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_ERASE_RANGE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFirstIdx,
    			inLastIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#eraseRange].
    public final void eraseRange(
    	int inFirstIdx,
    	int inLastIdx
    ) {
    	eraseRange(
    		this.segment,
    		inFirstIdx,
    		inLastIdx
    	);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UNIT_SPHERE_VECTORS_GET_HASH.get();
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