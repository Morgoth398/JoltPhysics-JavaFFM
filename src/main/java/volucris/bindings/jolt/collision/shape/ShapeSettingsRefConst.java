/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ShapeSettingsRefConst {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_REF_CONST_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_REF_CONST_GET_PTR;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_REF_CONST_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_SETTINGS_REF_CONST_DESTROY = downcallHandleVoid("JPH_ShapeSettingsRefConst_Destroy", UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_REF_CONST_GET_PTR = downcallHandle("JPH_ShapeSettingsRefConst_GetPtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_REF_CONST_GET_HASH = downcallHandle("JPH_ShapeSettingsRefConst_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ShapeSettingsRefConst(MemorySegment segment) {
		this.segment = segment;
	}

    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_REF_CONST_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
    	);
    }
    
    public static MemorySegment getPtr(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_REF_CONST_GET_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPtr].
    public final @Nullable ShapeSettings getPtr() {
    	MemorySegment segment = getPtr(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeSettings(segment);
    }
    
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_REF_CONST_GET_HASH.get();
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