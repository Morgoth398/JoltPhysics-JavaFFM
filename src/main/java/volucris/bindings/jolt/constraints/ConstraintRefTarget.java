/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class ConstraintRefTarget
		permits Constraint {

	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_REF_TARGET_GET_REF_COUNT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_REF_TARGET_ADD_REF;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_REF_TARGET_RELEASE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_REF_TARGET_SET_EMBEDDED;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONSTRAINT_REF_TARGET_GET_REF_COUNT = downcallHandle("JPH_ConstraintRefTarget_GetRefCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_REF_TARGET_ADD_REF = downcallHandleVoid("JPH_ConstraintRefTarget_AddRef", UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_REF_TARGET_RELEASE = downcallHandleVoid("JPH_ConstraintRefTarget_Release", UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_REF_TARGET_SET_EMBEDDED = downcallHandleVoid("JPH_ConstraintRefTarget_SetEmbedded", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConstraintRefTarget(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Get current refcount of this object
    /// ```
    public static int getRefCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_REF_TARGET_GET_REF_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRefCount].
    public final int getRefCount() {
    	return getRefCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Add a reference to this object
    /// ```
    public static void addRef(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_REF_TARGET_ADD_REF.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addRef].
    public final void addRef() {
    	addRef(
    		this.segment
    	);
    }
    
    /// ```
    /// Release a reference to this object
    /// ```
    public static void release(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_REF_TARGET_RELEASE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#release].
    public final void release() {
    	release(
    		this.segment
    	);
    }
    
    /// ```
    /// Mark this class as embedded, this means the type can be used in a compound or constructed on the stack.
    /// The Release function will never destruct the object, it is assumed the destructor will be called by whoever allocated
    /// the object and at that point in time it is checked that no references are left to the structure.
    /// ```
    public static void setEmbedded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_REF_TARGET_SET_EMBEDDED.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEmbedded].
    public final void setEmbedded() {
    	setEmbedded(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}