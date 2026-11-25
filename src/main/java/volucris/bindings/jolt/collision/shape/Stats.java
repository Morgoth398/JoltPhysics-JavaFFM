/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Stats {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_GET_SIZE_BYTES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_SET_SIZE_BYTES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_GET_NUM_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_STATS_SET_NUM_TRIANGLES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_STATS_CREATE = downcallHandle("JPH_ShapeStats_Create", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		JPH_SHAPE_STATS_DESTROY = downcallHandleVoid("JPH_ShapeStats_Destroy", UNBOUNDED_ADDRESS);
		JPH_SHAPE_STATS_GET_SIZE_BYTES = downcallHandle("JPH_ShapeStats_GetSizeBytes", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SHAPE_STATS_SET_SIZE_BYTES = downcallHandleVoid("JPH_ShapeStats_SetSizeBytes", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SHAPE_STATS_GET_NUM_TRIANGLES = downcallHandle("JPH_ShapeStats_GetNumTriangles", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_STATS_SET_NUM_TRIANGLES = downcallHandleVoid("JPH_ShapeStats_SetNumTriangles", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public Stats(
	    long inSizeBytes,
	    int inNumTriangles
	) {
	    this(
	        Arena.ofAuto(),
	        inSizeBytes,
	        inNumTriangles
	    );
	}
	
	/// Typed method of [#create].
	public Stats(
		Arena arena,
		long inSizeBytes,
		int inNumTriangles
	) {
		MemorySegment segment = create(
			inSizeBytes,
			inNumTriangles
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Stats(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	long inSizeBytes,
    	int inNumTriangles
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSizeBytes,
    			inNumTriangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Amount of memory used by this shape (size in bytes)
    /// ```
    public static long getSizeBytes(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_GET_SIZE_BYTES.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSizeBytes].
    public final long getSizeBytes() {
    	return getSizeBytes(
    		this.segment
    	);
    }
    
    /// ```
    /// Amount of memory used by this shape (size in bytes)
    /// ```
    public static void setSizeBytes(
    	MemorySegment self,
    	long mSizeBytes
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_SET_SIZE_BYTES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSizeBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSizeBytes].
    public final void setSizeBytes(
    	long mSizeBytes
    ) {
    	setSizeBytes(
    		this.segment,
    		mSizeBytes
    	);
    }
    
    /// ```
    /// Number of triangles in this shape (when applicable)
    /// ```
    public static int getNumTriangles(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_GET_NUM_TRIANGLES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumTriangles].
    public final int getNumTriangles() {
    	return getNumTriangles(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of triangles in this shape (when applicable)
    /// ```
    public static void setNumTriangles(
    	MemorySegment self,
    	int mNumTriangles
    ) {
    	MethodHandle method = JPH_SHAPE_STATS_SET_NUM_TRIANGLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumTriangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumTriangles].
    public final void setNumTriangles(
    	int mNumTriangles
    ) {
    	setNumTriangles(
    		this.segment,
    		mNumTriangles
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}