/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public sealed class DecoratedShapeSettings extends ShapeSettings
		permits OffsetCenterOfMassShapeSettings,
		RotatedTranslatedShapeSettings,
		ScaledShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE_PTR;
	private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE_PTR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DECORATED_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_DecoratedShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE = downcallHandleVoid("JPH_DecoratedShapeSettings_GetInnerShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE = downcallHandleVoid("JPH_DecoratedShapeSettings_SetInnerShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE_PTR = downcallHandleVoid("JPH_DecoratedShapeSettings_GetInnerShapePtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE_PTR = downcallHandleVoid("JPH_DecoratedShapeSettings_SetInnerShapePtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DecoratedShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DECORATED_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Sub shape (either this or mShapePtr needs to be filled up)
    /// ```
    public static void getInnerShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerShape].
    public final void getInnerShape(
    	ShapeSettingsRefConst outResult
    ) {
    	getInnerShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape (either this or mShapePtr needs to be filled up)
    /// ```
    public static void setInnerShape(
    	MemorySegment self,
    	MemorySegment mInnerShape
    ) {
    	MethodHandle method = JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInnerShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerShape].
    public final void setInnerShape(
    	ShapeSettingsRefConst mInnerShape
    ) {
    	setInnerShape(
    		this.segment,
    		mInnerShape.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape (either this or mShape needs to be filled up)
    /// ```
    public static void getInnerShapePtr(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DECORATED_SHAPE_SETTINGS_GET_INNER_SHAPE_PTR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerShapePtr].
    public final void getInnerShapePtr(
    	ShapeRefConst outResult
    ) {
    	getInnerShapePtr(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape (either this or mShape needs to be filled up)
    /// ```
    public static void setInnerShapePtr(
    	MemorySegment self,
    	MemorySegment mInnerShapePtr
    ) {
    	MethodHandle method = JPH_DECORATED_SHAPE_SETTINGS_SET_INNER_SHAPE_PTR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInnerShapePtr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerShapePtr].
    public final void setInnerShapePtr(
    	ShapeRefConst mInnerShapePtr
    ) {
    	setInnerShapePtr(
    		this.segment,
    		mInnerShapePtr.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}