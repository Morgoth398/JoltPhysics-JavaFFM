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

public class TwoBodyConstraintSettingsRefConst {

	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_PTR;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE = downcallHandle("JPH_TwoBodyConstraintSettingsRefConst_Create", UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE1 = downcallHandle("JPH_TwoBodyConstraintSettingsRefConst_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE2 = downcallHandle("JPH_TwoBodyConstraintSettingsRefConst_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_DESTROY = downcallHandleVoid("JPH_TwoBodyConstraintSettingsRefConst_Destroy", UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_PTR = downcallHandle("JPH_TwoBodyConstraintSettingsRefConst_GetPtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_HASH = downcallHandle("JPH_TwoBodyConstraintSettingsRefConst_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TwoBodyConstraintSettingsRefConst() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TwoBodyConstraintSettingsRefConst(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TwoBodyConstraintSettingsRefConst(
	    TwoBodyConstraintSettings inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public TwoBodyConstraintSettingsRefConst(
		Arena arena,
		TwoBodyConstraintSettings inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TwoBodyConstraintSettingsRefConst(
	    TwoBodyConstraintSettingsRefConst inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create2].
	public TwoBodyConstraintSettingsRefConst(
		Arena arena,
		TwoBodyConstraintSettingsRefConst inRHS
	) {
		MemorySegment segment = create2(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TwoBodyConstraintSettingsRefConst(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_CREATE2.get();
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
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment getPtr(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPtr].
    public final @Nullable TwoBodyConstraintSettings getPtr() {
    	MemorySegment segment = getPtr(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TwoBodyConstraintSettings(segment);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_REF_CONST_GET_HASH.get();
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