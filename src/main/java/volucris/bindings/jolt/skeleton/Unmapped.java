/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Unmapped {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_GET_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_SET_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_GET_PARENT_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_UNMAPPED_SET_PARENT_JOINT_IDX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_UNMAPPED_CREATE = downcallHandle("JPH_SkeletonMapperUnmapped_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_UNMAPPED_CREATE1 = downcallHandle("JPH_SkeletonMapperUnmapped_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_SKELETON_MAPPER_UNMAPPED_DESTROY = downcallHandleVoid("JPH_SkeletonMapperUnmapped_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_UNMAPPED_GET_JOINT_IDX = downcallHandle("JPH_SkeletonMapperUnmapped_GetJointIdx", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_UNMAPPED_SET_JOINT_IDX = downcallHandleVoid("JPH_SkeletonMapperUnmapped_SetJointIdx", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_UNMAPPED_GET_PARENT_JOINT_IDX = downcallHandle("JPH_SkeletonMapperUnmapped_GetParentJointIdx", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_UNMAPPED_SET_PARENT_JOINT_IDX = downcallHandleVoid("JPH_SkeletonMapperUnmapped_SetParentJointIdx", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public Unmapped() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Unmapped(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Unmapped(
	    int inJointIdx,
	    int inParentJointIdx
	) {
	    this(
	        Arena.ofAuto(),
	        inJointIdx,
	        inParentJointIdx
	    );
	}
	
	/// Typed method of [#create1].
	public Unmapped(
		Arena arena,
		int inJointIdx,
		int inParentJointIdx
	) {
		MemorySegment segment = create1(
			inJointIdx,
			inParentJointIdx
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Unmapped(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inJointIdx,
    	int inParentJointIdx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inJointIdx,
    			inParentJointIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Joint index of unmappable joint
    /// ```
    public static int getJointIdx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_GET_JOINT_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIdx].
    public final int getJointIdx() {
    	return getJointIdx(
    		this.segment
    	);
    }
    
    /// ```
    /// Joint index of unmappable joint
    /// ```
    public static void setJointIdx(
    	MemorySegment self,
    	int mJointIdx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_SET_JOINT_IDX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIdx].
    public final void setJointIdx(
    	int mJointIdx
    ) {
    	setJointIdx(
    		this.segment,
    		mJointIdx
    	);
    }
    
    /// ```
    /// Parent joint index of unmappable joint
    /// ```
    public static int getParentJointIdx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_GET_PARENT_JOINT_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getParentJointIdx].
    public final int getParentJointIdx() {
    	return getParentJointIdx(
    		this.segment
    	);
    }
    
    /// ```
    /// Parent joint index of unmappable joint
    /// ```
    public static void setParentJointIdx(
    	MemorySegment self,
    	int mParentJointIdx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_UNMAPPED_SET_PARENT_JOINT_IDX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mParentJointIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setParentJointIdx].
    public final void setParentJointIdx(
    	int mParentJointIdx
    ) {
    	setParentJointIdx(
    		this.segment,
    		mParentJointIdx
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}