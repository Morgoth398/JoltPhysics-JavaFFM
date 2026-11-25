/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DynMatrix {

	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_GET_COLS;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_GET_ROWS;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_SET;
	private static final LazyConstant<MethodHandle> JPH_DYN_MATRIX_GET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DYN_MATRIX_CREATE = downcallHandle("JPH_DynMatrix_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DYN_MATRIX_CREATE1 = downcallHandle("JPH_DynMatrix_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DYN_MATRIX_DESTROY = downcallHandleVoid("JPH_DynMatrix_Destroy", UNBOUNDED_ADDRESS);
		JPH_DYN_MATRIX_GET_COLS = downcallHandle("JPH_DynMatrix_GetCols", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DYN_MATRIX_GET_ROWS = downcallHandle("JPH_DynMatrix_GetRows", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DYN_MATRIX_SET = downcallHandleVoid("JPH_DynMatrix_Set", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_DYN_MATRIX_GET = downcallHandle("JPH_DynMatrix_Get", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public DynMatrix(
	    DynMatrix param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create].
	public DynMatrix(
		Arena arena,
		DynMatrix param0
	) {
		MemorySegment segment = create(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DynMatrix(
	    int inRows,
	    int inCols
	) {
	    this(
	        Arena.ofAuto(),
	        inRows,
	        inCols
	    );
	}
	
	/// Typed method of [#create1].
	public DynMatrix(
		Arena arena,
		int inRows,
		int inCols
	) {
		MemorySegment segment = create1(
			inRows,
			inCols
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DynMatrix(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inRows,
    	int inCols
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRows,
    			inCols
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get dimensions
    /// ```
    public static int getCols(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_GET_COLS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCols].
    public final int getCols() {
    	return getCols(
    		this.segment
    	);
    }
    
    public static int getRows(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_GET_ROWS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRows].
    public final int getRows() {
    	return getRows(
    		this.segment
    	);
    }
    
    public static void set(
    	MemorySegment self,
    	int inRow,
    	int inCol,
    	float element
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRow,
    			inCol,
    			element
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	int inRow,
    	int inCol,
    	float element
    ) {
    	set(
    		this.segment,
    		inRow,
    		inCol,
    		element
    	);
    }
    
    public static float get(
    	MemorySegment self,
    	int inRow,
    	int inCol
    ) {
    	MethodHandle method = JPH_DYN_MATRIX_GET.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inRow,
    			inCol
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#get].
    public final float get(
    	int inRow,
    	int inCol
    ) {
    	return get(
    		this.segment,
    		inRow,
    		inCol
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}