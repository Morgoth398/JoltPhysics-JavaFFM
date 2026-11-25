/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class IndexedTriangle extends IndexedTriangleNoMaterial {

	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_AS_INDEXED_TRIANGLE_NO_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_GET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_SET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_GET_LOWEST_INDEX_FIRST;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_GET_IDX;
	private static final LazyConstant<MethodHandle> JPH_INDEXED_TRIANGLE_SET_IDX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_INDEXED_TRIANGLE_CREATE = downcallHandle("JPH_IndexedTriangle_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_INDEXED_TRIANGLE_AS_INDEXED_TRIANGLE_NO_MATERIAL = downcallHandle("JPH_IndexedTriangle_AsIndexedTriangleNoMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_GET_MATERIAL_INDEX = downcallHandle("JPH_IndexedTriangle_GetMaterialIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_SET_MATERIAL_INDEX = downcallHandleVoid("JPH_IndexedTriangle_SetMaterialIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_INDEXED_TRIANGLE_GET_USER_DATA = downcallHandle("JPH_IndexedTriangle_GetUserData", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_SET_USER_DATA = downcallHandleVoid("JPH_IndexedTriangle_SetUserData", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_INDEXED_TRIANGLE_GET_LOWEST_INDEX_FIRST = downcallHandleVoid("JPH_IndexedTriangle_GetLowestIndexFirst", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEXED_TRIANGLE_GET_IDX = downcallHandle("JPH_IndexedTriangle_GetIdx", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_INDEXED_TRIANGLE_SET_IDX = downcallHandleVoid("JPH_IndexedTriangle_SetIdx", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public IndexedTriangle(
	    int inI1,
	    int inI2,
	    int inI3,
	    int inMaterialIndex,
	    int inUserData
	) {
	    this(
	        Arena.ofAuto(),
	        inI1,
	        inI2,
	        inI3,
	        inMaterialIndex,
	        inUserData
	    );
	}
	
	/// Typed method of [#create].
	public IndexedTriangle(
		Arena arena,
		int inI1,
		int inI2,
		int inI3,
		int inMaterialIndex,
		int inUserData
	) {
		MemorySegment segment = create(
			inI1,
			inI2,
			inI3,
			inMaterialIndex,
			inUserData
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asIndexedTriangleNoMaterial(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public IndexedTriangle(MemorySegment segment) {
		this.segment = segment;
		super(asIndexedTriangleNoMaterial(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	int inI1,
    	int inI2,
    	int inI3,
    	int inMaterialIndex,
    	int inUserData
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inI1,
    			inI2,
    			inI3,
    			inMaterialIndex,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asIndexedTriangleNoMaterial(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_AS_INDEXED_TRIANGLE_NO_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getMaterialIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_GET_MATERIAL_INDEX.get();
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
    
    public static void setMaterialIndex(
    	MemorySegment self,
    	int mMaterialIndex
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_SET_MATERIAL_INDEX.get();
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
    	MethodHandle method = JPH_INDEXED_TRIANGLE_GET_USER_DATA.get();
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
    	MethodHandle method = JPH_INDEXED_TRIANGLE_SET_USER_DATA.get();
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
    /// Rotate the vertices so that the lowest vertex becomes the first. This does not change the represented triangle.
    /// ```
    public static void getLowestIndexFirst(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_GET_LOWEST_INDEX_FIRST.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowestIndexFirst].
    public final void getLowestIndexFirst(
    	IndexedTriangle outResult
    ) {
    	getLowestIndexFirst(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static int getIdx(
    	MemorySegment self,
    	int index
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_GET_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIdx].
    public final int getIdx(
    	int index
    ) {
    	return getIdx(
    		this.segment,
    		index
    	);
    }
    
    public static void setIdx(
    	MemorySegment self,
    	int index,
    	int idx
    ) {
    	MethodHandle method = JPH_INDEXED_TRIANGLE_SET_IDX.get();
    	try {
    		 method.invokeExact(
    			self,
    			index,
    			idx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIdx].
    public final void setIdx(
    	int index,
    	int idx
    ) {
    	setIdx(
    		this.segment,
    		index,
    		idx
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}