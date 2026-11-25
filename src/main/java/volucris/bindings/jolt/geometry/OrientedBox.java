/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class OrientedBox {

	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_CREATE;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_GET_ORIENTATION;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_SET_ORIENTATION;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_GET_HALF_EXTENTS;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_SET_HALF_EXTENTS;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_OVERLAPS;
	private static final LazyConstant<MethodHandle> JPH_ORIENTED_BOX_OVERLAPS1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_ORIENTED_BOX_CREATE = downcallHandle("JPH_OrientedBox_Create", UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_CREATE1 = downcallHandle("JPH_OrientedBox_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_CREATE2 = downcallHandle("JPH_OrientedBox_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_DESTROY = downcallHandleVoid("JPH_OrientedBox_Destroy", UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_GET_ORIENTATION = downcallHandleVoid("JPH_OrientedBox_GetOrientation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_SET_ORIENTATION = downcallHandleVoid("JPH_OrientedBox_SetOrientation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_GET_HALF_EXTENTS = downcallHandleVoid("JPH_OrientedBox_GetHalfExtents", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_SET_HALF_EXTENTS = downcallHandleVoid("JPH_OrientedBox_SetHalfExtents", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ORIENTED_BOX_OVERLAPS = downcallHandle("JPH_OrientedBox_Overlaps", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_ORIENTED_BOX_OVERLAPS1 = downcallHandle("JPH_OrientedBox_Overlaps1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public OrientedBox() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public OrientedBox(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public OrientedBox(
	    Mat44 inOrientation,
	    Vec3 inHalfExtents
	) {
	    this(
	        Arena.ofAuto(),
	        inOrientation,
	        inHalfExtents
	    );
	}
	
	/// Typed method of [#create1].
	public OrientedBox(
		Arena arena,
		Mat44 inOrientation,
		Vec3 inHalfExtents
	) {
		MemorySegment segment = create1(
			inOrientation.memorySegment(),
			inHalfExtents.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public OrientedBox(
	    Mat44 inOrientation,
	    AABox inBox
	) {
	    this(
	        Arena.ofAuto(),
	        inOrientation,
	        inBox
	    );
	}
	
	/// Typed method of [#create2].
	public OrientedBox(
		Arena arena,
		Mat44 inOrientation,
		AABox inBox
	) {
		MemorySegment segment = create2(
			inOrientation.memorySegment(),
			inBox.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public OrientedBox(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_ORIENTED_BOX_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inOrientation,
    	MemorySegment inHalfExtents
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inOrientation,
    			inHalfExtents
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct from axis aligned box and transform. Only works for rotation/translation matrix (no scaling / shearing).
    /// ```
    public static MemorySegment create2(
    	MemorySegment inOrientation,
    	MemorySegment inBox
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inOrientation,
    			inBox
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Transform that positions and rotates the local space axis aligned box into world space
    /// ```
    public static void getOrientation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_GET_ORIENTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOrientation].
    public final void getOrientation(
    	Mat44 outResult
    ) {
    	getOrientation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transform that positions and rotates the local space axis aligned box into world space
    /// ```
    public static void setOrientation(
    	MemorySegment self,
    	MemorySegment mOrientation
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_SET_ORIENTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mOrientation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setOrientation].
    public final void setOrientation(
    	Mat44 mOrientation
    ) {
    	setOrientation(
    		this.segment,
    		mOrientation.memorySegment()
    	);
    }
    
    /// ```
    /// Half extents (half the size of the edge) of the local space axis aligned box
    /// ```
    public static void getHalfExtents(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_GET_HALF_EXTENTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfExtents].
    public final void getHalfExtents(
    	Vec3 outResult
    ) {
    	getHalfExtents(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Half extents (half the size of the edge) of the local space axis aligned box
    /// ```
    public static void setHalfExtents(
    	MemorySegment self,
    	MemorySegment mHalfExtents
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_SET_HALF_EXTENTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHalfExtents
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfExtents].
    public final void setHalfExtents(
    	Vec3 mHalfExtents
    ) {
    	setHalfExtents(
    		this.segment,
    		mHalfExtents.memorySegment()
    	);
    }
    
    /// ```
    /// Test if oriented box overlaps with axis aligned box each other
    /// ```
    public static boolean overlaps(
    	MemorySegment self,
    	MemorySegment inBox,
    	float inEpsilon
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_OVERLAPS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBox,
    			inEpsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlaps].
    public final boolean overlaps(
    	AABox inBox,
    	float inEpsilon
    ) {
    	return overlaps(
    		this.segment,
    		inBox.memorySegment(),
    		inEpsilon
    	);
    }
    
    /// ```
    /// Test if two oriented boxes overlap each other
    /// ```
    public static boolean overlaps1(
    	MemorySegment self,
    	MemorySegment inBox,
    	float inEpsilon
    ) {
    	MethodHandle method = JPH_ORIENTED_BOX_OVERLAPS1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBox,
    			inEpsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlaps1].
    public final boolean overlaps1(
    	OrientedBox inBox,
    	float inEpsilon
    ) {
    	return overlaps1(
    		this.segment,
    		inBox.memorySegment(),
    		inEpsilon
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}