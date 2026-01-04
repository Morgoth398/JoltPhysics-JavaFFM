package volucris.engine.physics.jolt.filter;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Abstract class that checks if two CollisionGroups collide.
 */
public sealed class GroupFilter permits GroupFilterTable {

	private static final MethodHandle JPH_GROUP_FILTER_DESTROY;
	private static final MethodHandle JPH_GROUP_FILTER_CAN_COLLIDE;

	protected final MemorySegment jphGroupFilter;

	static {
		//@formatter:off
		JPH_GROUP_FILTER_DESTROY = downcallHandleVoid("JPH_GroupFilter_Destroy", ADDRESS);
		JPH_GROUP_FILTER_CAN_COLLIDE = downcallHandle("JPH_GroupFilter_CanCollide", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected GroupFilter(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	protected GroupFilter(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	public GroupFilter(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	public GroupFilter(MemorySegment segment, Arena arena, boolean owns) {
		if (owns)
			jphGroupFilter = segment.reinterpret(arena, s -> destroy(s));
		else
			jphGroupFilter = segment;

		Jolt.addGroupFilter(segment.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_GROUP_FILTER_DESTROY;
			method.invokeExact(segment);

			Jolt.removeGroupFilter(segment.address());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy group filter.");
		}
	}

	/**
	 * Check if two groups collide.
	 */
	public boolean canCollide(CollisionGroup group1, CollisionGroup group2) {
		try {
			MemorySegment group1Addr = group1.memorySegment();
			MemorySegment group2Addr = group2.memorySegment();

			MethodHandle method = JPH_GROUP_FILTER_CAN_COLLIDE;
			return (boolean) method.invokeExact(jphGroupFilter, group1Addr, group2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call cannCollide.");
		}
	}

	public MemorySegment memorySegment() {
		return jphGroupFilter;
	}

}