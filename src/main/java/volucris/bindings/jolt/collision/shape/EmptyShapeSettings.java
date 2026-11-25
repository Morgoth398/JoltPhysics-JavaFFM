/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class EmptyShapeSettings extends ShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_GET_CENTER_OF_MASS;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_SET_CENTER_OF_MASS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_EMPTY_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_EmptyShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_EmptyShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_EmptyShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_SETTINGS_GET_CENTER_OF_MASS = downcallHandleVoid("JPH_EmptyShapeSettings_GetCenterOfMass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_SETTINGS_SET_CENTER_OF_MASS = downcallHandleVoid("JPH_EmptyShapeSettings_SetCenterOfMass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public EmptyShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public EmptyShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public EmptyShapeSettings(
	    Vec3 inCenterOfMass
	) {
	    this(
	        Arena.ofAuto(),
	        inCenterOfMass
	    );
	}
	
	/// Typed method of [#create1].
	public EmptyShapeSettings(
		Arena arena,
		Vec3 inCenterOfMass
	) {
		MemorySegment segment = create1(
			inCenterOfMass.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public EmptyShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inCenterOfMass
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenterOfMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Determines the center of mass for this shape
    /// ```
    public static void getCenterOfMass(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_GET_CENTER_OF_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMass].
    public final void getCenterOfMass(
    	Vec3 outResult
    ) {
    	getCenterOfMass(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Determines the center of mass for this shape
    /// ```
    public static void setCenterOfMass(
    	MemorySegment self,
    	MemorySegment mCenterOfMass
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_SET_CENTER_OF_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCenterOfMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCenterOfMass].
    public final void setCenterOfMass(
    	Vec3 mCenterOfMass
    ) {
    	setCenterOfMass(
    		this.segment,
    		mCenterOfMass.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}