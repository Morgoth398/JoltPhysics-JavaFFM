/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class GroupFilterTable extends GroupFilter {

	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_AS_GROUP_FILTER;
	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_GROUP_FILTER_TABLE_CREATE = downcallHandle("JPH_GroupFilterTable_Create", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_CREATE1 = downcallHandle("JPH_GroupFilterTable_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GROUP_FILTER_TABLE_AS_GROUP_FILTER = downcallHandle("JPH_GroupFilterTable_AsGroupFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_DisableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_EnableCollision", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED = downcallHandle("JPH_GroupFilterTable_IsCollisionEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public GroupFilterTable(
	    int inNumSubGroups
	) {
	    this(
	        Arena.ofAuto(),
	        inNumSubGroups
	    );
	}
	
	/// Typed method of [#create].
	public GroupFilterTable(
		Arena arena,
		int inNumSubGroups
	) {
		MemorySegment segment = create(
			inNumSubGroups
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asGroupFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public GroupFilterTable(
	    GroupFilterTable inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public GroupFilterTable(
		Arena arena,
		GroupFilterTable inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asGroupFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public GroupFilterTable(MemorySegment segment) {
		this.segment = segment;
		super(asGroupFilter(segment));
	}

    /// ```
    /// Constructs the table with inNumSubGroups subgroups, initially all collision pairs are enabled except when the sub group ID is the same
    /// ```
    public static MemorySegment create(
    	int inNumSubGroups
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNumSubGroups
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Copy constructor
    /// ```
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asGroupFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_AS_GROUP_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Disable collision between two sub groups
    /// ```
    public static void disableCollision(
    	MemorySegment self,
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubGroup1,
    			inSubGroup2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#disableCollision].
    public final void disableCollision(
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	disableCollision(
    		this.segment,
    		inSubGroup1,
    		inSubGroup2
    	);
    }
    
    /// ```
    /// Enable collision between two sub groups
    /// ```
    public static void enableCollision(
    	MemorySegment self,
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubGroup1,
    			inSubGroup2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableCollision].
    public final void enableCollision(
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	enableCollision(
    		this.segment,
    		inSubGroup1,
    		inSubGroup2
    	);
    }
    
    /// ```
    /// Check if the collision between two subgroups is enabled
    /// ```
    public static boolean isCollisionEnabled(
    	MemorySegment self,
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	MethodHandle method = JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inSubGroup1,
    			inSubGroup2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isCollisionEnabled].
    public final boolean isCollisionEnabled(
    	int inSubGroup1,
    	int inSubGroup2
    ) {
    	return isCollisionEnabled(
    		this.segment,
    		inSubGroup1,
    		inSubGroup2
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}