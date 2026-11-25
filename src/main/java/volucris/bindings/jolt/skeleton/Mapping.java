/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Mapping {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX2;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX2;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_GET_JOINT1_TO2;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_SET_JOINT1_TO2;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_GET_JOINT2_TO1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAPPING_SET_JOINT2_TO1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_MAPPING_CREATE = downcallHandle("JPH_SkeletonMapperMapping_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_CREATE1 = downcallHandle("JPH_SkeletonMapperMapping_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_DESTROY = downcallHandleVoid("JPH_SkeletonMapperMapping_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX1 = downcallHandle("JPH_SkeletonMapperMapping_GetJointIdx1", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX1 = downcallHandleVoid("JPH_SkeletonMapperMapping_SetJointIdx1", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX2 = downcallHandle("JPH_SkeletonMapperMapping_GetJointIdx2", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX2 = downcallHandleVoid("JPH_SkeletonMapperMapping_SetJointIdx2", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_MAPPING_GET_JOINT1_TO2 = downcallHandleVoid("JPH_SkeletonMapperMapping_GetJoint1To2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_SET_JOINT1_TO2 = downcallHandleVoid("JPH_SkeletonMapperMapping_SetJoint1To2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_GET_JOINT2_TO1 = downcallHandleVoid("JPH_SkeletonMapperMapping_GetJoint2To1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAPPING_SET_JOINT2_TO1 = downcallHandleVoid("JPH_SkeletonMapperMapping_SetJoint2To1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Mapping() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Mapping(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mapping(
	    int inJointIdx1,
	    int inJointIdx2,
	    Mat44 inJoint1To2
	) {
	    this(
	        Arena.ofAuto(),
	        inJointIdx1,
	        inJointIdx2,
	        inJoint1To2
	    );
	}
	
	/// Typed method of [#create1].
	public Mapping(
		Arena arena,
		int inJointIdx1,
		int inJointIdx2,
		Mat44 inJoint1To2
	) {
		MemorySegment segment = create1(
			inJointIdx1,
			inJointIdx2,
			inJoint1To2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mapping(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inJointIdx1,
    	int inJointIdx2,
    	MemorySegment inJoint1To2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inJointIdx1,
    			inJointIdx2,
    			inJoint1To2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index of joint from skeleton 1
    /// ```
    public static int getJointIdx1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX1.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIdx1].
    public final int getJointIdx1() {
    	return getJointIdx1(
    		this.segment
    	);
    }
    
    /// ```
    /// Index of joint from skeleton 1
    /// ```
    public static void setJointIdx1(
    	MemorySegment self,
    	int mJointIdx1
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIdx1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIdx1].
    public final void setJointIdx1(
    	int mJointIdx1
    ) {
    	setJointIdx1(
    		this.segment,
    		mJointIdx1
    	);
    }
    
    /// ```
    /// Corresponding index of joint from skeleton 2
    /// ```
    public static int getJointIdx2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_GET_JOINT_IDX2.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIdx2].
    public final int getJointIdx2() {
    	return getJointIdx2(
    		this.segment
    	);
    }
    
    /// ```
    /// Corresponding index of joint from skeleton 2
    /// ```
    public static void setJointIdx2(
    	MemorySegment self,
    	int mJointIdx2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_SET_JOINT_IDX2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIdx2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIdx2].
    public final void setJointIdx2(
    	int mJointIdx2
    ) {
    	setJointIdx2(
    		this.segment,
    		mJointIdx2
    	);
    }
    
    /// ```
    /// Transforms this joint from skeleton 1 to 2
    /// ```
    public static void getJoint1To2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_GET_JOINT1_TO2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint1To2].
    public final void getJoint1To2(
    	Mat44 outResult
    ) {
    	getJoint1To2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transforms this joint from skeleton 1 to 2
    /// ```
    public static void setJoint1To2(
    	MemorySegment self,
    	MemorySegment mJoint1To2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_SET_JOINT1_TO2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJoint1To2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJoint1To2].
    public final void setJoint1To2(
    	Mat44 mJoint1To2
    ) {
    	setJoint1To2(
    		this.segment,
    		mJoint1To2.memorySegment()
    	);
    }
    
    /// ```
    /// Inverse of the transform above
    /// ```
    public static void getJoint2To1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_GET_JOINT2_TO1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint2To1].
    public final void getJoint2To1(
    	Mat44 outResult
    ) {
    	getJoint2To1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Inverse of the transform above
    /// ```
    public static void setJoint2To1(
    	MemorySegment self,
    	MemorySegment mJoint2To1
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAPPING_SET_JOINT2_TO1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJoint2To1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJoint2To1].
    public final void setJoint2To1(
    	Mat44 mJoint2To1
    ) {
    	setJoint2To1(
    		this.segment,
    		mJoint2To1.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}