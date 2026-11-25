/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class OffsetCenterOfMassShapeSettings extends DecoratedShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_GET_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_SET_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_AsDecoratedShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_GET_OFFSET = downcallHandleVoid("JPH_OffsetCenterOfMassShapeSettings_GetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_SET_OFFSET = downcallHandleVoid("JPH_OffsetCenterOfMassShapeSettings_SetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public OffsetCenterOfMassShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public OffsetCenterOfMassShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public OffsetCenterOfMassShapeSettings(
	    Vec3 inOffset,
	    ShapeSettings inShape
	) {
	    this(
	        Arena.ofAuto(),
	        inOffset,
	        inShape
	    );
	}
	
	/// Typed method of [#create1].
	public OffsetCenterOfMassShapeSettings(
		Arena arena,
		Vec3 inOffset,
		ShapeSettings inShape
	) {
		MemorySegment segment = create1(
			inOffset.memorySegment(),
			inShape.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public OffsetCenterOfMassShapeSettings(
	    Vec3 inOffset,
	    Shape inShape
	) {
	    this(
	        Arena.ofAuto(),
	        inOffset,
	        inShape
	    );
	}
	
	/// Typed method of [#create2].
	public OffsetCenterOfMassShapeSettings(
		Arena arena,
		Vec3 inOffset,
		Shape inShape
	) {
		MemorySegment segment = create2(
			inOffset.memorySegment(),
			inShape.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public OffsetCenterOfMassShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShapeSettings(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE.get();
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
    	MemorySegment inOffset,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inOffset,
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
    	MemorySegment inOffset,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inOffset,
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
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_AS_DECORATED_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Offset to be applied to the center of mass of the child shape
    /// ```
    public static void getOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_GET_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOffset].
    public final void getOffset(
    	Vec3 outResult
    ) {
    	getOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Offset to be applied to the center of mass of the child shape
    /// ```
    public static void setOffset(
    	MemorySegment self,
    	MemorySegment mOffset
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_SET_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			mOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setOffset].
    public final void setOffset(
    	Vec3 mOffset
    ) {
    	setOffset(
    		this.segment,
    		mOffset.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}