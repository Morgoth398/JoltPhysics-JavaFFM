/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class AABoxCast {

	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_CREATE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_GET_BOX;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_SET_BOX;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CAST_SET_DIRECTION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_AABOX_CAST_CREATE = downcallHandle("JPH_AABoxCast_Create", UNBOUNDED_ADDRESS);
		JPH_AABOX_CAST_DESTROY = downcallHandleVoid("JPH_AABoxCast_Destroy", UNBOUNDED_ADDRESS);
		JPH_AABOX_CAST_GET_BOX = downcallHandleVoid("JPH_AABoxCast_GetBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CAST_SET_BOX = downcallHandleVoid("JPH_AABoxCast_SetBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CAST_GET_DIRECTION = downcallHandleVoid("JPH_AABoxCast_GetDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CAST_SET_DIRECTION = downcallHandleVoid("JPH_AABoxCast_SetDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public AABoxCast() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public AABoxCast(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AABoxCast(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_AABOX_CAST_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_CAST_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Axis aligned box at starting location
    /// ```
    public static void getBox(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_CAST_GET_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBox].
    public final void getBox(
    	AABox outResult
    ) {
    	getBox(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Axis aligned box at starting location
    /// ```
    public static void setBox(
    	MemorySegment self,
    	MemorySegment mBox
    ) {
    	MethodHandle method = JPH_AABOX_CAST_SET_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBox
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBox].
    public final void setBox(
    	AABox mBox
    ) {
    	setBox(
    		this.segment,
    		mBox.memorySegment()
    	);
    }
    
    /// ```
    /// Direction and length of the cast (anything beyond this length will not be reported as a hit)
    /// ```
    public static void getDirection(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_CAST_GET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDirection].
    public final void getDirection(
    	Vec3 outResult
    ) {
    	getDirection(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Direction and length of the cast (anything beyond this length will not be reported as a hit)
    /// ```
    public static void setDirection(
    	MemorySegment self,
    	MemorySegment mDirection
    ) {
    	MethodHandle method = JPH_AABOX_CAST_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDirection].
    public final void setDirection(
    	Vec3 mDirection
    ) {
    	setDirection(
    		this.segment,
    		mDirection.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}