/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.StringView;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Skeleton extends SkeletonRefTarget {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINTS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT_COUNT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_ADD_JOINT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_ADD_JOINT1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_GET_JOINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_CREATE = downcallHandle("JPH_Skeleton_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_AS_REF_TARGET = downcallHandle("JPH_Skeleton_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_GET_JOINTS = downcallHandle("JPH_Skeleton_GetJoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_GET_JOINTS1 = downcallHandle("JPH_Skeleton_GetJoints1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_GET_JOINT_COUNT = downcallHandle("JPH_Skeleton_GetJointCount", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SKELETON_GET_JOINT = downcallHandle("JPH_Skeleton_GetJoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_GET_JOINT1 = downcallHandle("JPH_Skeleton_GetJoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_ADD_JOINT = downcallHandle("JPH_Skeleton_AddJoint", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_ADD_JOINT1 = downcallHandle("JPH_Skeleton_AddJoint1", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_GET_JOINT_INDEX = downcallHandle("JPH_Skeleton_GetJointIndex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES = downcallHandleVoid("JPH_Skeleton_CalculateParentJointIndices", UNBOUNDED_ADDRESS);
		JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED = downcallHandle("JPH_Skeleton_AreJointsCorrectlyOrdered", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETON_SAVE_BINARY_STATE = downcallHandleVoid("JPH_Skeleton_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_Skeleton_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_DESTROY = downcallHandleVoid("JPH_Skeleton_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Skeleton() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Skeleton(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Skeleton(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @name Access to the joints
    /// @{
    /// ```
    public static MemorySegment getJoints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoints].
    public final @Nullable JointArray getJoints() {
    	MemorySegment segment = getJoints(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointArray(segment);
    }
    
    public static MemorySegment getJoints1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINTS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoints1].
    public final @Nullable JointArray getJoints1() {
    	MemorySegment segment = getJoints1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointArray(segment);
    }
    
    public static int getJointCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINT_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointCount].
    public final int getJointCount() {
    	return getJointCount(
    		this.segment
    	);
    }
    
    public static MemorySegment getJoint(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint].
    public final @Nullable Joint getJoint(
    	int inJoint
    ) {
    	MemorySegment segment = getJoint(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Joint(segment);
    }
    
    public static MemorySegment getJoint1(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINT1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint1].
    public final @Nullable Joint getJoint1(
    	int inJoint
    ) {
    	MemorySegment segment = getJoint1(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Joint(segment);
    }
    
    public static int addJoint(
    	MemorySegment self,
    	MemorySegment inName,
    	MemorySegment inParentName
    ) {
    	MethodHandle method = JPH_SKELETON_ADD_JOINT.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inName,
    			inParentName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addJoint].
    public final int addJoint(
    	StringView inName,
    	StringView inParentName
    ) {
    	return addJoint(
    		this.segment,
    		inName.memorySegment(),
    		inParentName.memorySegment()
    	);
    }
    
    public static int addJoint1(
    	MemorySegment self,
    	MemorySegment inName,
    	int inParentIndex
    ) {
    	MethodHandle method = JPH_SKELETON_ADD_JOINT1.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inName,
    			inParentIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addJoint1].
    public final int addJoint1(
    	StringView inName,
    	int inParentIndex
    ) {
    	return addJoint1(
    		this.segment,
    		inName.memorySegment(),
    		inParentIndex
    	);
    }
    
    /// ```
    /// Find joint by name
    /// ```
    public static int getJointIndex(
    	MemorySegment self,
    	MemorySegment inName
    ) {
    	MethodHandle method = JPH_SKELETON_GET_JOINT_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIndex].
    public final int getJointIndex(
    	StringView inName
    ) {
    	return getJointIndex(
    		this.segment,
    		inName.memorySegment()
    	);
    }
    
    /// ```
    /// Fill in parent joint indices based on name
    /// ```
    public static void calculateParentJointIndices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateParentJointIndices].
    public final void calculateParentJointIndices() {
    	calculateParentJointIndices(
    		this.segment
    	);
    }
    
    /// ```
    /// Many of the algorithms that use the Skeleton class require that parent joints are in the mJoints array before their children.
    /// This function returns true if this is the case, false if not.
    /// ```
    public static boolean areJointsCorrectlyOrdered(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#areJointsCorrectlyOrdered].
    public final boolean areJointsCorrectlyOrdered() {
    	return areJointsCorrectlyOrdered(
    		this.segment
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SKELETON_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restore the state of this object from inStream.
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public static void sRestoreFromBinaryState(
    	StreamIn inStream,
    	SkeletonResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}