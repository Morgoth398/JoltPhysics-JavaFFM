/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BroadPhaseLayer {

	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_GET_VALUE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_LAYER_CREATE = downcallHandle("JPH_BroadPhaseLayer_Create", UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_LAYER_CREATE1 = downcallHandle("JPH_BroadPhaseLayer_Create1", UNBOUNDED_ADDRESS, JAVA_BYTE);
		JPH_BROAD_PHASE_LAYER_CREATE2 = downcallHandle("JPH_BroadPhaseLayer_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_LAYER_DESTROY = downcallHandleVoid("JPH_BroadPhaseLayer_Destroy", UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_LAYER_GET_VALUE = downcallHandle("JPH_BroadPhaseLayer_GetValue", JAVA_BYTE, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BroadPhaseLayer() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BroadPhaseLayer(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BroadPhaseLayer(
	    byte inValue
	) {
	    this(
	        Arena.ofAuto(),
	        inValue
	    );
	}
	
	/// Typed method of [#create1].
	public BroadPhaseLayer(
		Arena arena,
		byte inValue
	) {
		MemorySegment segment = create1(
			inValue
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BroadPhaseLayer(
	    BroadPhaseLayer param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create2].
	public BroadPhaseLayer(
		Arena arena,
		BroadPhaseLayer param0
	) {
		MemorySegment segment = create2(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BroadPhaseLayer(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	byte inValue
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_CREATE2.get();
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
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte getValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_GET_VALUE.get();
    	try {
    		return (byte) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getValue].
    public final byte getValue() {
    	return getValue(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}