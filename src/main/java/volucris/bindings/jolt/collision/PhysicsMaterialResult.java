/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsMaterialResult {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_CLEAR;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_IS_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_IS_VALID;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_GET;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_SET;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_HAS_ERROR;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_GET_ERROR;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_RESULT_SET_ERROR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_MATERIAL_RESULT_CREATE = downcallHandle("JPH_PhysicsMaterialResult_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_CREATE1 = downcallHandle("JPH_PhysicsMaterialResult_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_DESTROY = downcallHandleVoid("JPH_PhysicsMaterialResult_Destroy", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_CLEAR = downcallHandleVoid("JPH_PhysicsMaterialResult_Clear", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_IS_EMPTY = downcallHandle("JPH_PhysicsMaterialResult_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_IS_VALID = downcallHandle("JPH_PhysicsMaterialResult_IsValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_GET = downcallHandle("JPH_PhysicsMaterialResult_Get", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_SET = downcallHandleVoid("JPH_PhysicsMaterialResult_Set", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_HAS_ERROR = downcallHandle("JPH_PhysicsMaterialResult_HasError", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_GET_ERROR = downcallHandle("JPH_PhysicsMaterialResult_GetError", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_RESULT_SET_ERROR = downcallHandleVoid("JPH_PhysicsMaterialResult_SetError", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsMaterialResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsMaterialResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsMaterialResult(
	    PhysicsMaterialResult inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public PhysicsMaterialResult(
		Arena arena,
		PhysicsMaterialResult inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsMaterialResult(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_CREATE1.get();
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
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_DESTROY.get();
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
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_CLEAR.get();
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
    
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_IS_EMPTY.get();
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
    
    public static boolean isValid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public final boolean isValid() {
    	return isValid(
    		this.segment
    	);
    }
    
    public static MemorySegment get(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_GET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#get].
    public final @Nullable PhysicsMaterialRef get() {
    	MemorySegment segment = get(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterialRef(segment);
    }
    
    public static void set(
    	MemorySegment self,
    	MemorySegment inResult
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	PhysicsMaterialRef inResult
    ) {
    	set(
    		this.segment,
    		inResult.memorySegment()
    	);
    }
    
    public static boolean hasError(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_HAS_ERROR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasError].
    public final boolean hasError() {
    	return hasError(
    		this.segment
    	);
    }
    
    public static MemorySegment getError(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_GET_ERROR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getError].
    public final @Nullable NativeByteArray getError() {
    	MemorySegment segment = getError(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static void setError(
    	MemorySegment self,
    	MemorySegment inError
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_RESULT_SET_ERROR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inError
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setError].
    public final void setError(
    	NativeByteArray inError
    ) {
    	setError(
    		this.segment,
    		inError.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}