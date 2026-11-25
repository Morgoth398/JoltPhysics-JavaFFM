/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollisionGroup {

	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_INVALID_GROUP;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_INVALID_SUB_GROUP;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_INVALID;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_SET_GROUP_FILTER;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_GROUP_FILTER;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_SET_GROUP_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_GROUP_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_SET_SUB_GROUP_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_GET_SUB_GROUP_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_CAN_COLLIDE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_GROUP_RESTORE_BINARY_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLISION_GROUP_CREATE = downcallHandle("JPH_CollisionGroup_Create", UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_CREATE1 = downcallHandle("JPH_CollisionGroup_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_COLLISION_GROUP_DESTROY = downcallHandleVoid("JPH_CollisionGroup_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_GET_INVALID_GROUP = downcallHandle("JPH_CollisionGroup_GetInvalidGroup", JAVA_INT);
		JPH_COLLISION_GROUP_GET_INVALID_SUB_GROUP = downcallHandle("JPH_CollisionGroup_GetInvalidSubGroup", JAVA_INT);
		JPH_COLLISION_GROUP_GET_INVALID = downcallHandleVoid("JPH_CollisionGroup_GetInvalid", UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_SET_GROUP_FILTER = downcallHandleVoid("JPH_CollisionGroup_SetGroupFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_GET_GROUP_FILTER = downcallHandle("JPH_CollisionGroup_GetGroupFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_SET_GROUP_ID = downcallHandleVoid("JPH_CollisionGroup_SetGroupID", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLISION_GROUP_GET_GROUP_ID = downcallHandle("JPH_CollisionGroup_GetGroupID", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_SET_SUB_GROUP_ID = downcallHandleVoid("JPH_CollisionGroup_SetSubGroupID", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLISION_GROUP_GET_SUB_GROUP_ID = downcallHandle("JPH_CollisionGroup_GetSubGroupID", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_CAN_COLLIDE = downcallHandle("JPH_CollisionGroup_CanCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_SAVE_BINARY_STATE = downcallHandleVoid("JPH_CollisionGroup_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_GROUP_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_CollisionGroup_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollisionGroup() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#collisionGroup_Create].
	public CollisionGroup(Arena arena) {
		MemorySegment segment = collisionGroup_Create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> collisionGroup_Destroy(s));
	}

	public CollisionGroup(
	    GroupFilter inFilter,
	    int inGroupID,
	    int inSubGroupID
	) {
	    this(
	        Arena.ofAuto(),
	        inFilter,
	        inGroupID,
	        inSubGroupID
	    );
	}
	
	/// Typed method of [#collisionGroup_Create1].
	public CollisionGroup(
		Arena arena,
		GroupFilter inFilter,
		int inGroupID,
		int inSubGroupID
	) {
		MemorySegment segment = collisionGroup_Create1(
			inFilter.memorySegment(),
			inGroupID,
			inSubGroupID
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> collisionGroup_Destroy(s));
	}

	public CollisionGroup(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Default constructor
    /// ```
    public static MemorySegment collisionGroup_Create() {
    	MethodHandle method = JPH_COLLISION_GROUP_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct with all properties
    /// ```
    public static MemorySegment collisionGroup_Create1(
    	MemorySegment inFilter,
    	int inGroupID,
    	int inSubGroupID
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inFilter,
    			inGroupID,
    			inSubGroupID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void collisionGroup_Destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int collisionGroup_GetInvalidGroup() {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_INVALID_GROUP.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int collisionGroup_GetInvalidSubGroup() {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_INVALID_SUB_GROUP.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// An invalid collision group
    /// ```
    public static void collisionGroup_GetInvalid(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_INVALID.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_GetInvalid].
    public final void collisionGroup_GetInvalid(
    	CollisionGroup outResult
    ) {
    	collisionGroup_GetInvalid(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the collision group filter
    /// ```
    public static void collisionGroup_SetGroupFilter(
    	MemorySegment self,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_SET_GROUP_FILTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_SetGroupFilter].
    public final void collisionGroup_SetGroupFilter(
    	GroupFilter inFilter
    ) {
    	collisionGroup_SetGroupFilter(
    		this.segment,
    		inFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get the collision group filter
    /// ```
    public static MemorySegment collisionGroup_GetGroupFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_GROUP_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_GetGroupFilter].
    public final @Nullable GroupFilter collisionGroup_GetGroupFilter() {
    	MemorySegment segment = collisionGroup_GetGroupFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new GroupFilter(segment);
    }
    
    /// ```
    /// Set the main group id for this object
    /// ```
    public static void collisionGroup_SetGroupID(
    	MemorySegment self,
    	int inID
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_SET_GROUP_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_SetGroupID].
    public final void collisionGroup_SetGroupID(
    	int inID
    ) {
    	collisionGroup_SetGroupID(
    		this.segment,
    		inID
    	);
    }
    
    public static int collisionGroup_GetGroupID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_GROUP_ID.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_GetGroupID].
    public final int collisionGroup_GetGroupID() {
    	return collisionGroup_GetGroupID(
    		this.segment
    	);
    }
    
    /// ```
    /// Add this object to a sub group
    /// ```
    public static void collisionGroup_SetSubGroupID(
    	MemorySegment self,
    	int inID
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_SET_SUB_GROUP_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_SetSubGroupID].
    public final void collisionGroup_SetSubGroupID(
    	int inID
    ) {
    	collisionGroup_SetSubGroupID(
    		this.segment,
    		inID
    	);
    }
    
    public static int collisionGroup_GetSubGroupID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_GET_SUB_GROUP_ID.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_GetSubGroupID].
    public final int collisionGroup_GetSubGroupID() {
    	return collisionGroup_GetSubGroupID(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this object collides with another object
    /// ```
    public static boolean collisionGroup_CanCollide(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_CAN_COLLIDE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_CanCollide].
    public final boolean collisionGroup_CanCollide(
    	CollisionGroup inOther
    ) {
    	return collisionGroup_CanCollide(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream. Does not save group filter.
    /// ```
    public static void collisionGroup_SaveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_SaveBinaryState].
    public final void collisionGroup_SaveBinaryState(
    	StreamOut inStream
    ) {
    	collisionGroup_SaveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restore the state of this object from inStream. Does not save group filter.
    /// ```
    public static void collisionGroup_RestoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_COLLISION_GROUP_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collisionGroup_RestoreBinaryState].
    public final void collisionGroup_RestoreBinaryState(
    	StreamIn inStream
    ) {
    	collisionGroup_RestoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}