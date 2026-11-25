/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class ShapeSettings extends ShapeSettingsRefTarget
		permits CompoundShapeSettings,
		ConvexShapeSettings,
		DecoratedShapeSettings,
		EmptyShapeSettings,
		HeightFieldShapeSettings,
		MeshShapeSettings,
		PlaneShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_CLEAR_CACHED_RESULT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_ShapeSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_GET_USER_DATA = downcallHandle("JPH_ShapeSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_ShapeSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SHAPE_SETTINGS_CREATE = downcallHandleVoid("JPH_ShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_CLEAR_CACHED_RESULT = downcallHandleVoid("JPH_ShapeSettings_ClearCachedResult", UNBOUNDED_ADDRESS);
		JPH_SHAPE_SETTINGS_DESTROY = downcallHandleVoid("JPH_ShapeSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// User data (to be used freely by the application)
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data (to be used freely by the application)
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	long mUserData
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// Create a shape according to the settings specified by this object.
    /// ```
    public static void create(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_CREATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create].
    public final void create(
    	ShapeResult outResult
    ) {
    	create(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// When creating a shape, the result is cached so that calling Create() again will return the same shape.
    /// If you make changes to the ShapeSettings you need to call this function to clear the cached result to allow Create() to build a new shape.
    /// ```
    public static void clearCachedResult(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_CLEAR_CACHED_RESULT.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clearCachedResult].
    public final void clearCachedResult() {
    	clearCachedResult(
    		this.segment
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_SETTINGS_DESTROY.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}