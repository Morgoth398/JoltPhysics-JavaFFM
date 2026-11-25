/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class PhysicsSceneRefTarget
		permits PhysicsScene {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_REF_TARGET_GET_REF_COUNT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_REF_TARGET_ADD_REF;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_REF_TARGET_RELEASE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_REF_TARGET_SET_EMBEDDED;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_SCENE_REF_TARGET_GET_REF_COUNT = downcallHandle("JPH_PhysicsSceneRefTarget_GetRefCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_REF_TARGET_ADD_REF = downcallHandleVoid("JPH_PhysicsSceneRefTarget_AddRef", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_REF_TARGET_RELEASE = downcallHandleVoid("JPH_PhysicsSceneRefTarget_Release", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_REF_TARGET_SET_EMBEDDED = downcallHandleVoid("JPH_PhysicsSceneRefTarget_SetEmbedded", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsSceneRefTarget(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Get current refcount of this object
    /// ```
    public static int physicsSceneRefTarget_GetRefCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_REF_TARGET_GET_REF_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#physicsSceneRefTarget_GetRefCount].
    public final int physicsSceneRefTarget_GetRefCount() {
    	return physicsSceneRefTarget_GetRefCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Add a reference to this object
    /// ```
    public static void physicsSceneRefTarget_AddRef(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_REF_TARGET_ADD_REF.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#physicsSceneRefTarget_AddRef].
    public final void physicsSceneRefTarget_AddRef() {
    	physicsSceneRefTarget_AddRef(
    		this.segment
    	);
    }
    
    /// ```
    /// Release a reference to this object
    /// ```
    public static void physicsSceneRefTarget_Release(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_REF_TARGET_RELEASE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#physicsSceneRefTarget_Release].
    public final void physicsSceneRefTarget_Release() {
    	physicsSceneRefTarget_Release(
    		this.segment
    	);
    }
    
    /// ```
    /// Mark this class as embedded, this means the type can be used in a compound or constructed on the stack.
    /// The Release function will never destruct the object, it is assumed the destructor will be called by whoever allocated
    /// the object and at that point in time it is checked that no references are left to the structure.
    /// ```
    public static void physicsSceneRefTarget_SetEmbedded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_REF_TARGET_SET_EMBEDDED.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#physicsSceneRefTarget_SetEmbedded].
    public final void physicsSceneRefTarget_SetEmbedded() {
    	physicsSceneRefTarget_SetEmbedded(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}