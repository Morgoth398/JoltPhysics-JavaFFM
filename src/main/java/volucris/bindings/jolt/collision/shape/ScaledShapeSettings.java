/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class ScaledShapeSettings extends DecoratedShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_GET_SCALE;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_SET_SCALE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SCALED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ScaledShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_ScaledShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_ScaledShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS = downcallHandle("JPH_ScaledShapeSettings_AsDecoratedShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_GET_SCALE = downcallHandleVoid("JPH_ScaledShapeSettings_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_SET_SCALE = downcallHandleVoid("JPH_ScaledShapeSettings_SetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ScaledShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ScaledShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShapeSettings(
	    ShapeSettings inShape,
	    Vec3 inScale
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inScale
	    );
	}
	
	/// Typed method of [#create1].
	public ScaledShapeSettings(
		Arena arena,
		ShapeSettings inShape,
		Vec3 inScale
	) {
		MemorySegment segment = create1(
			inShape.memorySegment(),
			inScale.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShapeSettings(
	    Shape inShape,
	    Vec3 inScale
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inScale
	    );
	}
	
	/// Typed method of [#create2].
	public ScaledShapeSettings(
		Arena arena,
		Shape inShape,
		Vec3 inScale
	) {
		MemorySegment segment = create2(
			inShape.memorySegment(),
			inScale.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor that decorates another shape with a scale
    /// ```
    public static MemorySegment create1(
    	MemorySegment inShape,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Variant that uses a concrete shape, which means this object cannot be serialized.
    /// ```
    public static MemorySegment create2(
    	MemorySegment inShape,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inScale
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
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getScale(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_GET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getScale].
    public final void getScale(
    	Vec3 outResult
    ) {
    	getScale(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setScale(
    	MemorySegment self,
    	MemorySegment mScale
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_SET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setScale].
    public final void setScale(
    	Vec3 mScale
    ) {
    	setScale(
    		this.segment,
    		mScale.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}