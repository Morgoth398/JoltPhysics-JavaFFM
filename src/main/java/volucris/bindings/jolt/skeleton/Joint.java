/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StringView;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Joint {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_GET_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_SET_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_GET_PARENT_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_SET_PARENT_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_GET_PARENT_JOINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_JOINT_SET_PARENT_JOINT_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_JOINT_CREATE = downcallHandle("JPH_SkeletonJoint_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_CREATE1 = downcallHandle("JPH_SkeletonJoint_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_JOINT_DESTROY = downcallHandleVoid("JPH_SkeletonJoint_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_GET_NAME = downcallHandleVoid("JPH_SkeletonJoint_GetName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_SET_NAME = downcallHandleVoid("JPH_SkeletonJoint_SetName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_GET_PARENT_NAME = downcallHandleVoid("JPH_SkeletonJoint_GetParentName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_SET_PARENT_NAME = downcallHandleVoid("JPH_SkeletonJoint_SetParentName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_GET_PARENT_JOINT_INDEX = downcallHandle("JPH_SkeletonJoint_GetParentJointIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_JOINT_SET_PARENT_JOINT_INDEX = downcallHandleVoid("JPH_SkeletonJoint_SetParentJointIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public Joint() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Joint(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Joint(
	    StringView inName,
	    StringView inParentName,
	    int inParentJointIndex
	) {
	    this(
	        Arena.ofAuto(),
	        inName,
	        inParentName,
	        inParentJointIndex
	    );
	}
	
	/// Typed method of [#create1].
	public Joint(
		Arena arena,
		StringView inName,
		StringView inParentName,
		int inParentJointIndex
	) {
		MemorySegment segment = create1(
			inName.memorySegment(),
			inParentName.memorySegment(),
			inParentJointIndex
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Joint(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_JOINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inName,
    	MemorySegment inParentName,
    	int inParentJointIndex
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inName,
    			inParentName,
    			inParentJointIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Name of the joint
    /// ```
    public static void getName(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_GET_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getName].
    public final void getName(
    	BasicString2 outResult
    ) {
    	getName(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Name of the joint
    /// ```
    public static void setName(
    	MemorySegment self,
    	MemorySegment mName
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_SET_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setName].
    public final void setName(
    	BasicString2 mName
    ) {
    	setName(
    		this.segment,
    		mName.memorySegment()
    	);
    }
    
    /// ```
    /// Name of parent joint
    /// ```
    public static void getParentName(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_GET_PARENT_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getParentName].
    public final void getParentName(
    	BasicString2 outResult
    ) {
    	getParentName(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Name of parent joint
    /// ```
    public static void setParentName(
    	MemorySegment self,
    	MemorySegment mParentName
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_SET_PARENT_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mParentName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setParentName].
    public final void setParentName(
    	BasicString2 mParentName
    ) {
    	setParentName(
    		this.segment,
    		mParentName.memorySegment()
    	);
    }
    
    /// ```
    /// Index of parent joint (in mJoints) or -1 if it has no parent
    /// ```
    public static int getParentJointIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_GET_PARENT_JOINT_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getParentJointIndex].
    public final int getParentJointIndex() {
    	return getParentJointIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Index of parent joint (in mJoints) or -1 if it has no parent
    /// ```
    public static void setParentJointIndex(
    	MemorySegment self,
    	int mParentJointIndex
    ) {
    	MethodHandle method = JPH_SKELETON_JOINT_SET_PARENT_JOINT_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mParentJointIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setParentJointIndex].
    public final void setParentJointIndex(
    	int mParentJointIndex
    ) {
    	setParentJointIndex(
    		this.segment,
    		mParentJointIndex
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}