/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Float3;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Triangle {

	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_GET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_GET_CENTROID;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRIANGLE_CREATE = downcallHandle("JPH_Triangle_Create", UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CREATE1 = downcallHandle("JPH_Triangle_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_TRIANGLE_CREATE2 = downcallHandle("JPH_Triangle_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_TRIANGLE_DESTROY = downcallHandleVoid("JPH_Triangle_Destroy", UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_GET_MATERIAL_INDEX = downcallHandle("JPH_Triangle_GetMaterialIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SET_MATERIAL_INDEX = downcallHandleVoid("JPH_Triangle_SetMaterialIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_TRIANGLE_GET_USER_DATA = downcallHandle("JPH_Triangle_GetUserData", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SET_USER_DATA = downcallHandleVoid("JPH_Triangle_SetUserData", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_TRIANGLE_GET_CENTROID = downcallHandleVoid("JPH_Triangle_GetCentroid", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Triangle() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Triangle(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(
	    Float3 inV1,
	    Float3 inV2,
	    Float3 inV3,
	    int inMaterialIndex,
	    int inUserData
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inMaterialIndex,
	        inUserData
	    );
	}
	
	/// Typed method of [#create1].
	public Triangle(
		Arena arena,
		Float3 inV1,
		Float3 inV2,
		Float3 inV3,
		int inMaterialIndex,
		int inUserData
	) {
		MemorySegment segment = create1(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inMaterialIndex,
			inUserData
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3,
	    int inMaterialIndex,
	    int inUserData
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inMaterialIndex,
	        inUserData
	    );
	}
	
	/// Typed method of [#create2].
	public Triangle(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3,
		int inMaterialIndex,
		int inUserData
	) {
		MemorySegment segment = create2(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inMaterialIndex,
			inUserData
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TRIANGLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	int inMaterialIndex,
    	int inUserData
    ) {
    	MethodHandle method = JPH_TRIANGLE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
    			inMaterialIndex,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	int inMaterialIndex,
    	int inUserData
    ) {
    	MethodHandle method = JPH_TRIANGLE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
    			inMaterialIndex,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Follows mV[3] so that we can read mV as 4 vectors
    /// ```
    public static int getMaterialIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_GET_MATERIAL_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialIndex].
    public final int getMaterialIndex() {
    	return getMaterialIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Follows mV[3] so that we can read mV as 4 vectors
    /// ```
    public static void setMaterialIndex(
    	MemorySegment self,
    	int mMaterialIndex
    ) {
    	MethodHandle method = JPH_TRIANGLE_SET_MATERIAL_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterialIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterialIndex].
    public final void setMaterialIndex(
    	int mMaterialIndex
    ) {
    	setMaterialIndex(
    		this.segment,
    		mMaterialIndex
    	);
    }
    
    /// ```
    /// User data that can be used for anything by the application, e.g. for tracking the original index of the triangle
    /// ```
    public static int getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_GET_USER_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final int getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data that can be used for anything by the application, e.g. for tracking the original index of the triangle
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	int mUserData
    ) {
    	MethodHandle method = JPH_TRIANGLE_SET_USER_DATA.get();
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
    	int mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// Get center of triangle
    /// ```
    public static void getCentroid(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_GET_CENTROID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCentroid].
    public final void getCentroid(
    	Vec3 outResult
    ) {
    	getCentroid(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}