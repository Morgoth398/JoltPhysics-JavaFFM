package volucris.engine.physics.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * 
 */
public final class SkeletonJoint {

	private static final StructLayout LAYOUT;
	
	private static final VarHandle NAME;
	private static final VarHandle PARENT_NAME;
	private static final VarHandle PARENT_JOINT_INDEX;
	
	private final MemorySegment jphSkeletonJoint;
	
	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("name"),
		        ADDRESS.withName("parentName"),
		        ADDRESS.withName("parentJointIndex"),
		        MemoryLayout.paddingLayout(4)
			);
		//@formatter:on
		
		NAME = varHandle(LAYOUT, "name");
		PARENT_NAME = varHandle(LAYOUT, "parentName");
		PARENT_JOINT_INDEX = varHandle(LAYOUT, "parentJointIndex");
	}
	
	public SkeletonJoint() {
		jphSkeletonJoint = Arena.ofAuto().allocate(LAYOUT);
	}
	
	/**
	 * Name of the joint. 
	 */
	public String getName() {
		MemorySegment segment = (MemorySegment) NAME.get(jphSkeletonJoint);
		return segment.reinterpret(Integer.MAX_VALUE).getString(0);
	}
	
	/**
	 * Name of parent joint. 
	 */
	public String getParentName() {
		MemorySegment segment = (MemorySegment) PARENT_NAME.get(jphSkeletonJoint);
		return segment.reinterpret(Integer.MAX_VALUE).getString(0);
	}
	
	/**
	 * Index of parent joint (in mJoints) or -1 if it has no parent. 
	 */
	public int getParentJointIndex() {
		return (int) PARENT_JOINT_INDEX.get(jphSkeletonJoint);
	}
	
	public MemorySegment memorySegment() {
		return jphSkeletonJoint;
	}
	
	public static StructLayout LAYOUT() {
		return LAYOUT;
	}
	
}
