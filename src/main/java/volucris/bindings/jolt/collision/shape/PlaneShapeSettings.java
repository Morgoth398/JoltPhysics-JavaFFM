/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.PhysicsMaterialRefConst;
import volucris.bindings.jolt.geometry.Plane;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PlaneShapeSettings extends ShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_GET_PLANE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_SET_PLANE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_SET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_GET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_SET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_GET_DEFAULT_HALF_EXTENT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PLANE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_PlaneShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_PlaneShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PLANE_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_PlaneShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_GET_PLANE = downcallHandleVoid("JPH_PlaneShapeSettings_GetPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_SET_PLANE = downcallHandleVoid("JPH_PlaneShapeSettings_SetPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_GET_MATERIAL = downcallHandleVoid("JPH_PlaneShapeSettings_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_SET_MATERIAL = downcallHandleVoid("JPH_PlaneShapeSettings_SetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_GET_HALF_EXTENT = downcallHandle("JPH_PlaneShapeSettings_GetHalfExtent", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SETTINGS_SET_HALF_EXTENT = downcallHandleVoid("JPH_PlaneShapeSettings_SetHalfExtent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PLANE_SHAPE_SETTINGS_GET_DEFAULT_HALF_EXTENT = downcallHandle("JPH_PlaneShapeSettings_GetDefaultHalfExtent", JAVA_FLOAT);
		//@formatter:on
	}

	public PlaneShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PlaneShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PlaneShapeSettings(
	    Plane inPlane,
	    PhysicsMaterial inMaterial,
	    float inHalfExtent
	) {
	    this(
	        Arena.ofAuto(),
	        inPlane,
	        inMaterial,
	        inHalfExtent
	    );
	}
	
	/// Typed method of [#create1].
	public PlaneShapeSettings(
		Arena arena,
		Plane inPlane,
		PhysicsMaterial inMaterial,
		float inHalfExtent
	) {
		MemorySegment segment = create1(
			inPlane.memorySegment(),
			inMaterial.memorySegment(),
			inHalfExtent
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PlaneShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a plane shape.
    /// ```
    public static MemorySegment create1(
    	MemorySegment inPlane,
    	MemorySegment inMaterial,
    	float inHalfExtent
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPlane,
    			inMaterial,
    			inHalfExtent
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
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Plane that describes the shape. The negative half space is considered solid.
    /// ```
    public static void getPlane(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_GET_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlane].
    public final void getPlane(
    	Plane outResult
    ) {
    	getPlane(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Plane that describes the shape. The negative half space is considered solid.
    /// ```
    public static void setPlane(
    	MemorySegment self,
    	MemorySegment mPlane
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_SET_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPlane
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPlane].
    public final void setPlane(
    	Plane mPlane
    ) {
    	setPlane(
    		this.segment,
    		mPlane.memorySegment()
    	);
    }
    
    /// ```
    /// Surface material of the plane
    /// ```
    public static void getMaterial(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_GET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final void getMaterial(
    	PhysicsMaterialRefConst outResult
    ) {
    	getMaterial(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Surface material of the plane
    /// ```
    public static void setMaterial(
    	MemorySegment self,
    	MemorySegment mMaterial
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_SET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterial].
    public final void setMaterial(
    	PhysicsMaterialRefConst mMaterial
    ) {
    	setMaterial(
    		this.segment,
    		mMaterial.memorySegment()
    	);
    }
    
    /// ```
    /// The bounding box of this plane will run from [-half_extent, half_extent]. Keep this as low as possible for better broad phase performance.
    /// ```
    public static float getHalfExtent(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_GET_HALF_EXTENT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfExtent].
    public final float getHalfExtent() {
    	return getHalfExtent(
    		this.segment
    	);
    }
    
    /// ```
    /// The bounding box of this plane will run from [-half_extent, half_extent]. Keep this as low as possible for better broad phase performance.
    /// ```
    public static void setHalfExtent(
    	MemorySegment self,
    	float mHalfExtent
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_SET_HALF_EXTENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfExtent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfExtent].
    public final void setHalfExtent(
    	float mHalfExtent
    ) {
    	setHalfExtent(
    		this.segment,
    		mHalfExtent
    	);
    }
    
    /// ```
    /// Default half-extent of the plane (total size along 1 axis will be 2 * half-extent)
    /// ```
    public static float getDefaultHalfExtent() {
    	MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_GET_DEFAULT_HALF_EXTENT.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}