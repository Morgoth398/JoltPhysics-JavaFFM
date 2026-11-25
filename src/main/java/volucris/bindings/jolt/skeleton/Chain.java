/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.IntArray;

import static volucris.bindings.core.FFMUtils.*;

public final class Chain {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES2;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_CHAIN_CREATE = downcallHandle("JPH_SkeletonMapperChain_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_CHAIN_DESTROY = downcallHandleVoid("JPH_SkeletonMapperChain_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES1 = downcallHandleVoid("JPH_SkeletonMapperChain_GetJointIndices1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES1 = downcallHandleVoid("JPH_SkeletonMapperChain_SetJointIndices1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES2 = downcallHandleVoid("JPH_SkeletonMapperChain_GetJointIndices2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES2 = downcallHandleVoid("JPH_SkeletonMapperChain_SetJointIndices2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Chain() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Chain(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Chain(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Joint chain from skeleton 1
    /// ```
    public static void getJointIndices1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIndices1].
    public final void getJointIndices1(
    	IntArray outResult
    ) {
    	getJointIndices1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Joint chain from skeleton 1
    /// ```
    public static void setJointIndices1(
    	MemorySegment self,
    	MemorySegment mJointIndices1
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIndices1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIndices1].
    public final void setJointIndices1(
    	IntArray mJointIndices1
    ) {
    	setJointIndices1(
    		this.segment,
    		mJointIndices1.memorySegment()
    	);
    }
    
    /// ```
    /// Corresponding joint chain from skeleton 2
    /// ```
    public static void getJointIndices2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_GET_JOINT_INDICES2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIndices2].
    public final void getJointIndices2(
    	IntArray outResult
    ) {
    	getJointIndices2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Corresponding joint chain from skeleton 2
    /// ```
    public static void setJointIndices2(
    	MemorySegment self,
    	MemorySegment mJointIndices2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_CHAIN_SET_JOINT_INDICES2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIndices2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIndices2].
    public final void setJointIndices2(
    	IntArray mJointIndices2
    ) {
    	setJointIndices2(
    		this.segment,
    		mJointIndices2.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}