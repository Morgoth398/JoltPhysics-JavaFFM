/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.BodyID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SubShapeIDPair {

	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_GET_BODY1_ID;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID1;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_GET_BODY2_ID;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDPAIR_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SUB_SHAPE_IDPAIR_CREATE = downcallHandle("JPH_SubShapeIDPair_Create", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_CREATE1 = downcallHandle("JPH_SubShapeIDPair_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_CREATE2 = downcallHandle("JPH_SubShapeIDPair_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_DESTROY = downcallHandleVoid("JPH_SubShapeIDPair_Destroy", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_GET_BODY1_ID = downcallHandle("JPH_SubShapeIDPair_GetBody1ID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID1 = downcallHandle("JPH_SubShapeIDPair_GetSubShapeID1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_GET_BODY2_ID = downcallHandle("JPH_SubShapeIDPair_GetBody2ID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID2 = downcallHandle("JPH_SubShapeIDPair_GetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDPAIR_GET_HASH = downcallHandle("JPH_SubShapeIDPair_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SubShapeIDPair() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SubShapeIDPair(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShapeIDPair(
	    BodyID inBody1ID,
	    SubShapeID inSubShapeID1,
	    BodyID inBody2ID,
	    SubShapeID inSubShapeID2
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1ID,
	        inSubShapeID1,
	        inBody2ID,
	        inSubShapeID2
	    );
	}
	
	/// Typed method of [#create1].
	public SubShapeIDPair(
		Arena arena,
		BodyID inBody1ID,
		SubShapeID inSubShapeID1,
		BodyID inBody2ID,
		SubShapeID inSubShapeID2
	) {
		MemorySegment segment = create1(
			inBody1ID.memorySegment(),
			inSubShapeID1.memorySegment(),
			inBody2ID.memorySegment(),
			inSubShapeID2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShapeIDPair(
	    SubShapeIDPair param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create2].
	public SubShapeIDPair(
		Arena arena,
		SubShapeIDPair param0
	) {
		MemorySegment segment = create2(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShapeIDPair(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inBody1ID,
    	MemorySegment inSubShapeID1,
    	MemorySegment inBody2ID,
    	MemorySegment inSubShapeID2
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBody1ID,
    			inSubShapeID1,
    			inBody2ID,
    			inSubShapeID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment getBody1ID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_GET_BODY1_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody1ID].
    public final @Nullable BodyID getBody1ID() {
    	MemorySegment segment = getBody1ID(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyID(segment);
    }
    
    public static MemorySegment getSubShapeID1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeID1].
    public final @Nullable SubShapeID getSubShapeID1() {
    	MemorySegment segment = getSubShapeID1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SubShapeID(segment);
    }
    
    public static MemorySegment getBody2ID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_GET_BODY2_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody2ID].
    public final @Nullable BodyID getBody2ID() {
    	MemorySegment segment = getBody2ID(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyID(segment);
    }
    
    public static MemorySegment getSubShapeID2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_GET_SUB_SHAPE_ID2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeID2].
    public final @Nullable SubShapeID getSubShapeID2() {
    	MemorySegment segment = getSubShapeID2(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SubShapeID(segment);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDPAIR_GET_HASH.get();
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