/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class RotatedTranslatedShapeSettings extends DecoratedShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_ROTATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS = downcallHandle("JPH_RotatedTranslatedShapeSettings_AsDecoratedShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_RotatedTranslatedShapeSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_RotatedTranslatedShapeSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_RotatedTranslatedShapeSettings_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_RotatedTranslatedShapeSettings_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RotatedTranslatedShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RotatedTranslatedShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RotatedTranslatedShapeSettings(
	    Vec3 inPosition,
	    Quat inRotation,
	    ShapeSettings inShape
	) {
	    this(
	        Arena.ofAuto(),
	        inPosition,
	        inRotation,
	        inShape
	    );
	}
	
	/// Typed method of [#create1].
	public RotatedTranslatedShapeSettings(
		Arena arena,
		Vec3 inPosition,
		Quat inRotation,
		ShapeSettings inShape
	) {
		MemorySegment segment = create1(
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inShape.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RotatedTranslatedShapeSettings(
	    Vec3 inPosition,
	    Quat inRotation,
	    Shape inShape
	) {
	    this(
	        Arena.ofAuto(),
	        inPosition,
	        inRotation,
	        inShape
	    );
	}
	
	/// Typed method of [#create2].
	public RotatedTranslatedShapeSettings(
		Arena arena,
		Vec3 inPosition,
		Quat inRotation,
		Shape inShape
	) {
		MemorySegment segment = create2(
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inShape.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RotatedTranslatedShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShapeSettings(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct with shape settings, can be serialized.
    /// ```
    public static MemorySegment create1(
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPosition,
    			inRotation,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Variant that uses a concrete shape, which means this object cannot be serialized.
    /// ```
    public static MemorySegment create2(
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPosition,
    			inRotation,
    			inShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asDecoratedShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Position of the sub shape
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Position of the sub shape
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 mPosition
    ) {
    	setPosition(
    		this.segment,
    		mPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the sub shape
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the sub shape
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment mRotation
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Quat mRotation
    ) {
    	setRotation(
    		this.segment,
    		mRotation.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}