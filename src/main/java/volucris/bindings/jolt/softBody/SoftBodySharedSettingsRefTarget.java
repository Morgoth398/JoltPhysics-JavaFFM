/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class SoftBodySharedSettingsRefTarget
		permits SoftBodySharedSettings {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_GET_REF_COUNT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_ADD_REF;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_RELEASE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_SET_EMBEDDED;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_GET_REF_COUNT = downcallHandle("JPH_SoftBodySharedSettingsRefTarget_GetRefCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_ADD_REF = downcallHandleVoid("JPH_SoftBodySharedSettingsRefTarget_AddRef", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_RELEASE = downcallHandleVoid("JPH_SoftBodySharedSettingsRefTarget_Release", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_SET_EMBEDDED = downcallHandleVoid("JPH_SoftBodySharedSettingsRefTarget_SetEmbedded", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodySharedSettingsRefTarget(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Get current refcount of this object
    /// ```
    public static int softBodySharedSettingsRefTarget_GetRefCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_GET_REF_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#softBodySharedSettingsRefTarget_GetRefCount].
    public final int softBodySharedSettingsRefTarget_GetRefCount() {
    	return softBodySharedSettingsRefTarget_GetRefCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Add a reference to this object
    /// ```
    public static void softBodySharedSettingsRefTarget_AddRef(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_ADD_REF.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#softBodySharedSettingsRefTarget_AddRef].
    public final void softBodySharedSettingsRefTarget_AddRef() {
    	softBodySharedSettingsRefTarget_AddRef(
    		this.segment
    	);
    }
    
    /// ```
    /// Release a reference to this object
    /// ```
    public static void softBodySharedSettingsRefTarget_Release(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_RELEASE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#softBodySharedSettingsRefTarget_Release].
    public final void softBodySharedSettingsRefTarget_Release() {
    	softBodySharedSettingsRefTarget_Release(
    		this.segment
    	);
    }
    
    /// ```
    /// Mark this class as embedded, this means the type can be used in a compound or constructed on the stack.
    /// The Release function will never destruct the object, it is assumed the destructor will be called by whoever allocated
    /// the object and at that point in time it is checked that no references are left to the structure.
    /// ```
    public static void softBodySharedSettingsRefTarget_SetEmbedded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REF_TARGET_SET_EMBEDDED.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#softBodySharedSettingsRefTarget_SetEmbedded].
    public final void softBodySharedSettingsRefTarget_SetEmbedded() {
    	softBodySharedSettingsRefTarget_SetEmbedded(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}