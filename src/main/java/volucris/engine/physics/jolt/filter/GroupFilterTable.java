package volucris.engine.physics.jolt.filter;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Implementation of GroupFilter that stores a bit table with one bit per sub
 * shape ID pair to determine if they collide or not
 * <p>
 * The collision rules:
 * <ul>
 * <li>If one of the objects is in the cInvalidGroup the objects will collide.
 * <li>If the objects are in different groups they will collide.
 * <li>If they're in the same group but their collision filter is different they
 * will not collide.
 * <li>If they're in the same group and their collision filters match, we'll use
 * the SubGroupID and the table below.
 * </ul>
 * For N = 6 sub groups the table will look like:
 * <p>
 * 
 * <pre>
 * {@code
 *             sub group 1 --->
 * sub group 2 x.....
 *      |      ox....
 *      |      oox...
 *      V      ooox..
 *             oooox.
 *             ooooox
 * }
 * </pre>
 * <ul>
 * <li>'x' means sub group 1 == sub group 2 and we define this to never collide.
 * <li>'o' is a bit that we have to store that defines if the sub groups collide
 * or not.
 * <li>'.' is a bit we don't need to store because the table is symmetric, we
 * take care that group 2 > group 1 by swapping sub group 1 and sub group 2 if
 * needed.
 * </ul>
 * The total number of bits we need to store is (N * (N - 1)) / 2
 */
public final class GroupFilterTable extends GroupFilter {

	private static final MethodHandle JPH_GROUP_FILTER_TABLE_CREATE;
	private static final MethodHandle JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION;
	private static final MethodHandle JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION;
	private static final MethodHandle JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED;

	static {
		//@formatter:off
		JPH_GROUP_FILTER_TABLE_CREATE = downcallHandle("JPH_GroupFilterTable_Create", ADDRESS, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_DisableCollision", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_GroupFilterTable_EnableCollision", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED = downcallHandle("JPH_GroupFilterTable_IsCollisionEnabled", JAVA_BOOLEAN, ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public GroupFilterTable() {
		this(0, Arena.ofAuto());
	}

	public GroupFilterTable(Arena arena) {
		this(0, arena);
	}

	/**
	 * Constructs the table with numSubGroups subgroups, initially all collision
	 * pairs are enabled except when the sub group ID is the same.
	 */
	public GroupFilterTable(int numSubGroups) {
		this(numSubGroups, Arena.ofAuto());
	}

	/**
	 * Constructs the table with numSubGroups subgroups, initially all collision
	 * pairs are enabled except when the sub group ID is the same.
	 */
	public GroupFilterTable(int numSubGroups, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_GROUP_FILTER_TABLE_CREATE;
			segment = (MemorySegment) method.invokeExact(null);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create group filter table: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Disable collision between two sub groups.
	 */
	public void disableCollision(int subGroup1, int subGroup2) {
		try {
			MethodHandle method = JPH_GROUP_FILTER_TABLE_DISABLE_COLLISION;
			method.invokeExact(jphGroupFilter, subGroup1, subGroup2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot disable collision: " + className);
		}
	}

	/**
	 * Enable collision between two sub groups.
	 */
	public void enableCollision(int subGroup1, int subGroup2) {
		try {
			MethodHandle method = JPH_GROUP_FILTER_TABLE_ENABLE_COLLISION;
			method.invokeExact(jphGroupFilter, subGroup1, subGroup2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot enable collision: " + className);
		}
	}

	/**
	 * Check if the collision between two subgroups is enabled.
	 */
	public boolean isCollisionEnabled(int subGroup1, int subGroup2) {
		try {
			MethodHandle method = JPH_GROUP_FILTER_TABLE_IS_COLLISION_ENABLED;
			return (boolean) method.invokeExact(jphGroupFilter, subGroup1, subGroup2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if collision is enabled: " + className);
		}
	}

}