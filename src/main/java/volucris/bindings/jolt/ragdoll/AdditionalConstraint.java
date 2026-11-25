/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettings;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettingsRef;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class AdditionalConstraint {

	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_GET_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_SET_CONSTRAINT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE = downcallHandle("JPH_RagdollSettingsAdditionalConstraint_Create", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE1 = downcallHandle("JPH_RagdollSettingsAdditionalConstraint_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_DESTROY = downcallHandleVoid("JPH_RagdollSettingsAdditionalConstraint_Destroy", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_GET_CONSTRAINT = downcallHandleVoid("JPH_RagdollSettingsAdditionalConstraint_GetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_SET_CONSTRAINT = downcallHandleVoid("JPH_RagdollSettingsAdditionalConstraint_SetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public AdditionalConstraint() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public AdditionalConstraint(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AdditionalConstraint(
	    int inBodyIdx1,
	    int inBodyIdx2,
	    TwoBodyConstraintSettings inConstraint
	) {
	    this(
	        Arena.ofAuto(),
	        inBodyIdx1,
	        inBodyIdx2,
	        inConstraint
	    );
	}
	
	/// Typed method of [#create1].
	public AdditionalConstraint(
		Arena arena,
		int inBodyIdx1,
		int inBodyIdx2,
		TwoBodyConstraintSettings inConstraint
	) {
		MemorySegment segment = create1(
			inBodyIdx1,
			inBodyIdx2,
			inConstraint.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AdditionalConstraint(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructors
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inBodyIdx1,
    	int inBodyIdx2,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBodyIdx1,
    			inBodyIdx2,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The constraint that connects these bodies
    /// ```
    public static void getConstraint(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_GET_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraint].
    public final void getConstraint(
    	TwoBodyConstraintSettingsRef outResult
    ) {
    	getConstraint(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The constraint that connects these bodies
    /// ```
    public static void setConstraint(
    	MemorySegment self,
    	MemorySegment mConstraint
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_ADDITIONAL_CONSTRAINT_SET_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraint].
    public final void setConstraint(
    	TwoBodyConstraintSettingsRef mConstraint
    ) {
    	setConstraint(
    		this.segment,
    		mConstraint.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}