/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Locked {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_GET_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_SET_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_GET_PARENT_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_SET_PARENT_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_GET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCKED_SET_TRANSLATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_LOCKED_CREATE = downcallHandle("JPH_SkeletonMapperLocked_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCKED_DESTROY = downcallHandleVoid("JPH_SkeletonMapperLocked_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCKED_GET_JOINT_IDX = downcallHandle("JPH_SkeletonMapperLocked_GetJointIdx", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCKED_SET_JOINT_IDX = downcallHandleVoid("JPH_SkeletonMapperLocked_SetJointIdx", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_LOCKED_GET_PARENT_JOINT_IDX = downcallHandle("JPH_SkeletonMapperLocked_GetParentJointIdx", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCKED_SET_PARENT_JOINT_IDX = downcallHandleVoid("JPH_SkeletonMapperLocked_SetParentJointIdx", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_LOCKED_GET_TRANSLATION = downcallHandleVoid("JPH_SkeletonMapperLocked_GetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCKED_SET_TRANSLATION = downcallHandleVoid("JPH_SkeletonMapperLocked_SetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Locked() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Locked(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Locked(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Joint index of joint with locked translation (in skeleton 2)
    /// ```
    public static int getJointIdx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_GET_JOINT_IDX.get();
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
    /// Joint index of joint with locked translation (in skeleton 2)
    /// ```
    public static void setJointIdx(
    	MemorySegment self,
    	int mJointIdx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_SET_JOINT_IDX.get();
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
    /// Parent joint index of joint with locked translation (in skeleton 2)
    /// ```
    public static int getParentJointIdx(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_GET_PARENT_JOINT_IDX.get();
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
    /// Parent joint index of joint with locked translation (in skeleton 2)
    /// ```
    public static void setParentJointIdx(
    	MemorySegment self,
    	int mParentJointIdx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_SET_PARENT_JOINT_IDX.get();
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
    
    /// ```
    /// Translation of neutral pose
    /// ```
    public static void getTranslation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_GET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTranslation].
    public final void getTranslation(
    	Vec3 outResult
    ) {
    	getTranslation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Translation of neutral pose
    /// ```
    public static void setTranslation(
    	MemorySegment self,
    	MemorySegment mTranslation
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCKED_SET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTranslation].
    public final void setTranslation(
    	Vec3 mTranslation
    ) {
    	setTranslation(
    		this.segment,
    		mTranslation.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}