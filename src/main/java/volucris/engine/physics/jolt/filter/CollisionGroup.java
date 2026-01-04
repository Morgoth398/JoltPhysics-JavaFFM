package volucris.engine.physics.jolt.filter;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.Jolt;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Two objects collide with each other if:
 * <ul>
 * <li>Both don't have a group filter
 * <li>The first group filter says that the objects can collide
 * <li>Or if there's no filter for the first object, the second group filter
 * says the objects can collide
 * </ul>
 * 
 */
public final class CollisionGroup {

	private static final StructLayout LAYOUT;

	private static final VarHandle GROUP_FILTER;
	private static final VarHandle GROUP_ID;
	private static final VarHandle SUB_GROUP_ID;

	private final MemorySegment jphCollisionGroup;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ADDRESS.withName("groupFilter"),
		        JAVA_INT.withName("groupID"),
		        JAVA_INT.withName("subGroupID")
			).withName("JPH_CollisionGroup");
		//@formatter:on

		GROUP_FILTER = varHandle(LAYOUT, "groupFilter");
		GROUP_ID = varHandle(LAYOUT, "groupId");
		SUB_GROUP_ID = varHandle(LAYOUT, "subGroupId");
	}

	public CollisionGroup() {
		this(Arena.ofAuto());
	}
	
	public CollisionGroup(Arena arena) {
		jphCollisionGroup = arena.allocate(LAYOUT);
	}

	public CollisionGroup(GroupFilter groupFilter, int groupId, int subGroupId) {
		this(groupFilter, groupId, subGroupId, Arena.ofAuto());
	}
	
	public CollisionGroup(GroupFilter groupFilter, int groupId, int subGroupId, Arena arena) {
		jphCollisionGroup = arena.allocate(LAYOUT);

		GROUP_FILTER.set(jphCollisionGroup, groupFilter.memorySegment());
		GROUP_ID.set(jphCollisionGroup, groupId);
		SUB_GROUP_ID.set(jphCollisionGroup, subGroupId);
	}
	
	/**
	 * Get the main group id for this object. 
	 */
	public int getGroupId() {
		return (int) GROUP_ID.get(jphCollisionGroup);
	}
	
	/**
	 * Set the main group id for this object. 
	 */
	public void setGroupId(int groupId) {
		GROUP_ID.set(jphCollisionGroup, groupId);
	}
	
	/**
	 * 
	 */
	public int getSubGroupId() {
		return (int) SUB_GROUP_ID.get(jphCollisionGroup);
	}

	/**
	 * Add this object to a sub group. 
	 */
	public void setSubGroupId(int subGroupId) {
		SUB_GROUP_ID.set(jphCollisionGroup, subGroupId);
	}

	/**
	 * Set the collision group filter. 
	 * <p>
	 * The previous filter will not be destroyed!
	 * 
	 * @param groupFilter The new group filter
	 */
	public void setGroupFilter(GroupFilter groupFilter) {
		GROUP_FILTER.set(jphCollisionGroup, groupFilter.memorySegment());
	}

	/**
	 * Get the collision group filter. 
	 */
	public GroupFilter getGroupFilter() {
		MemorySegment segment = (MemorySegment) GROUP_FILTER.get(jphCollisionGroup);

		if (segment.equals(MemorySegment.NULL))
			return null;

		GroupFilter filter = Jolt.getGroupFilter(segment.address());
		if (filter != null)
			return filter;

		return new GroupFilter(segment, false);
	}

	public MemorySegment memorySegment() {
		return jphCollisionGroup;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
