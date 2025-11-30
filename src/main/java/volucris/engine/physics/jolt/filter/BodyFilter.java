package volucris.engine.physics.jolt.filter;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class function to filter out bodies, returns true if test should collide with
 * body.
 */
public abstract class BodyFilter {

	private static final ArrayList<WeakReference<BodyFilter>> BODY_FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_BODY_FILTER_SET_PROCS;
	private static final MethodHandle JPH_BODY_FILTER_CREATE;
	private static final MethodHandle JPH_BODY_FILTER_DESTROY;

	private static final VarHandle SHOULD_COLLIDE;
	private static final VarHandle SHOULD_COLLIDE_LOCKED;

	private static final MemorySegment JPH_BODY_FILTER_PROCS;

	private static MemorySegment SHOULD_COLLIDE_ADDR;
	private static MemorySegment SHOULD_COLLIDE_LOCKED_ADDR;

	private static int count;

	private final MemorySegment jphBodyFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldCollide"),
				ADDRESS.withName("ShouldCollideLocked")
			).withName("JPH_BodyFilter_Procs");
		//@formatter:on

		SHOULD_COLLIDE = varHandle(LAYOUT, "ShouldCollide");
		SHOULD_COLLIDE_LOCKED = varHandle(LAYOUT, "ShouldCollideLocked");

		JPH_BODY_FILTER_SET_PROCS = downcallHandleVoid("JPH_BodyFilter_SetProcs", ADDRESS);
		JPH_BODY_FILTER_CREATE = downcallHandle("JPH_BodyFilter_Create", ADDRESS, ADDRESS);
		JPH_BODY_FILTER_DESTROY = downcallHandleVoid("JPH_BodyFilter_Destroy", ADDRESS);

		JPH_BODY_FILTER_PROCS = Arena.ofAuto().allocate(LAYOUT);

		fillProcs();
		setProcs();

		BODY_FILTERS = new ArrayList<WeakReference<BodyFilter>>();
	}

	public BodyFilter() {
		try {
			int index = count++;

			Arena arena = Arena.ofAuto();

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_BODY_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphBodyFilter = segment.reinterpret(arena, s -> destroy(s));

			BODY_FILTERS.add(index, new WeakReference<BodyFilter>(this));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create body filter.");
		}
	}

	/**
	 * Filter function
	 * 
	 * @param bodyId
	 * @return true if we should collide with bodyID.
	 */
	protected abstract boolean shouldCollide(int bodyId);

	/**
	 * Filter function (This is called after the body is locked and makes it
	 * possible to filter based on body members)
	 * 
	 * @param body The body
	 * @return true if we should collide with inBody
	 */
	protected abstract boolean shouldCollideLocked(Body body);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_BODY_FILTER_SET_PROCS;
			method.invokeExact(JPH_BODY_FILTER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set body filter procs.");
		}
	}

	private static void fillProcs() {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(BodyFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor shouldCollide = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, JAVA_INT);
		FunctionDescriptor shouldCollideLocked = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS);
		
		MethodHandle shouldCollideHandle = upcallHandleStatic(lookup, BodyFilter.class, "shouldCollide", shouldCollide);
		MethodHandle shouldCollideLockedHandle = upcallHandleStatic(lookup, BodyFilter.class, "shouldCollideLocked", shouldCollideLocked);
	
		SHOULD_COLLIDE_ADDR = upcallStub(shouldCollideHandle, shouldCollide);
		SHOULD_COLLIDE_LOCKED_ADDR = upcallStub(shouldCollideLockedHandle, shouldCollideLocked);
		
		SHOULD_COLLIDE.set(JPH_BODY_FILTER_PROCS, SHOULD_COLLIDE_ADDR);
		SHOULD_COLLIDE_LOCKED.set(JPH_BODY_FILTER_PROCS, SHOULD_COLLIDE_LOCKED_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_BODY_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy body filter.");
		}
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, int bodyId) {
		BodyFilter filter = BODY_FILTERS.get(userData.get(JAVA_INT, 0)).get();
		return filter.shouldCollide(bodyId);
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollideLocked(MemorySegment userData, MemorySegment body) {
		BodyFilter filter = BODY_FILTERS.get(userData.get(JAVA_INT, 0)).get();

		Body bodyObject = Jolt.getBody(body.address());
		if (bodyObject == null)
			bodyObject = new Body(body);

		return filter.shouldCollideLocked(bodyObject);
	}

	public MemorySegment memorySegment() {
		return jphBodyFilter;
	}

}
