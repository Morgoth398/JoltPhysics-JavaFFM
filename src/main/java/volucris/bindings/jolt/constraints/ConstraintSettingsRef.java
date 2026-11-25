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

public final class ConstraintSettingsRef {

	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_GET_PTR;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETTINGS_REF_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONSTRAINT_SETTINGS_REF_CREATE = downcallHandle("JPH_ConstraintSettingsRef_Create", UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_REF_CREATE1 = downcallHandle("JPH_ConstraintSettingsRef_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_REF_CREATE2 = downcallHandle("JPH_ConstraintSettingsRef_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_REF_DESTROY = downcallHandleVoid("JPH_ConstraintSettingsRef_Destroy", UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_REF_GET_PTR = downcallHandle("JPH_ConstraintSettingsRef_GetPtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETTINGS_REF_GET_HASH = downcallHandle("JPH_ConstraintSettingsRef_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConstraintSettingsRef() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ConstraintSettingsRef(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ConstraintSettingsRef(
	    ConstraintSettings inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public ConstraintSettingsRef(
		Arena arena,
		ConstraintSettings inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ConstraintSettingsRef(
	    ConstraintSettingsRef inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create2].
	public ConstraintSettingsRef(
		Arena arena,
		ConstraintSettingsRef inRHS
	) {
		MemorySegment segment = create2(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ConstraintSettingsRef(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_CREATE1.get();
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
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_CREATE2.get();
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
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_DESTROY.get();
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
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_GET_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPtr].
    public final @Nullable ConstraintSettings getPtr() {
    	MemorySegment segment = getPtr(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ConstraintSettings(segment);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETTINGS_REF_GET_HASH.get();
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