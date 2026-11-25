/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class PathConstraintPathRef {

	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_GET_PTR;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_REF_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PATH_CONSTRAINT_PATH_REF_CREATE = downcallHandle("JPH_PathConstraintPathRef_Create", UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_REF_CREATE1 = downcallHandle("JPH_PathConstraintPathRef_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_REF_CREATE2 = downcallHandle("JPH_PathConstraintPathRef_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_REF_DESTROY = downcallHandleVoid("JPH_PathConstraintPathRef_Destroy", UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_REF_GET_PTR = downcallHandle("JPH_PathConstraintPathRef_GetPtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_REF_GET_HASH = downcallHandle("JPH_PathConstraintPathRef_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PathConstraintPathRef() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#pathConstraintPathRef_Create].
	public PathConstraintPathRef(Arena arena) {
		MemorySegment segment = pathConstraintPathRef_Create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> pathConstraintPathRef_Destroy(s));
	}

	public PathConstraintPathRef(
	    PathConstraintPath inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#pathConstraintPathRef_Create1].
	public PathConstraintPathRef(
		Arena arena,
		PathConstraintPath inRHS
	) {
		MemorySegment segment = pathConstraintPathRef_Create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> pathConstraintPathRef_Destroy(s));
	}

	public PathConstraintPathRef(
	    PathConstraintPathRef inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#pathConstraintPathRef_Create2].
	public PathConstraintPathRef(
		Arena arena,
		PathConstraintPathRef inRHS
	) {
		MemorySegment segment = pathConstraintPathRef_Create2(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> pathConstraintPathRef_Destroy(s));
	}

	public PathConstraintPathRef(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment pathConstraintPathRef_Create() {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment pathConstraintPathRef_Create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment pathConstraintPathRef_Create2(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void pathConstraintPathRef_Destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment pathConstraintPathRef_GetPtr(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_GET_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pathConstraintPathRef_GetPtr].
    public final @Nullable PathConstraintPath pathConstraintPathRef_GetPtr() {
    	MemorySegment segment = pathConstraintPathRef_GetPtr(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PathConstraintPath(segment);
    }
    
    public static long pathConstraintPathRef_GetHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_REF_GET_HASH.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pathConstraintPathRef_GetHash].
    public final long pathConstraintPathRef_GetHash() {
    	return pathConstraintPathRef_GetHash(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}