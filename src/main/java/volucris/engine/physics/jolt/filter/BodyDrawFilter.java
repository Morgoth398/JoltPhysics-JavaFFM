package volucris.engine.physics.jolt.filter;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class function to filter out bodies for debug rendering, returns true if body
 * should be rendered.
 */
public abstract class BodyDrawFilter {

	private static final ArrayList<WeakReference<BodyDrawFilter>> BODY_DRAW_FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_BODY_DRAW_FILTER_SET_PROCS;
	private static final MethodHandle JPH_BODY_DRAW_FILTER_CREATE;
	private static final MethodHandle JPH_BODY_DRAW_FILTER_DESTROY;

	private static final VarHandle SHOULD_DRAW;

	private static final MemorySegment JPH_BODY_DRAW_FILTER_PROCS;

	private static MemorySegment SHOULD_DRAW_ADDR;

	private static int count;

	private final MemorySegment jphbodyDrawFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldDraw")
			).withName("JPH_BodyDrawFilter_Procs");
		//@formatter:on

		SHOULD_DRAW = varHandle(LAYOUT, "ShouldDraw");

		JPH_BODY_DRAW_FILTER_SET_PROCS = downcallHandleVoid("JPH_BodyDrawFilter_SetProcs", ADDRESS);
		JPH_BODY_DRAW_FILTER_CREATE = downcallHandle("JPH_BodyDrawFilter_Create", ADDRESS, ADDRESS);
		JPH_BODY_DRAW_FILTER_DESTROY = downcallHandleVoid("JPH_BodyDrawFilter_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_BODY_DRAW_FILTER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		BODY_DRAW_FILTERS = new ArrayList<WeakReference<BodyDrawFilter>>();
	}

	public BodyDrawFilter() {
		this(Arena.ofAuto());
	}

	public BodyDrawFilter(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_BODY_DRAW_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphbodyDrawFilter = segment.reinterpret(arena, s -> destroy(s));

			BODY_DRAW_FILTERS.add(index, new WeakReference<BodyDrawFilter>(this));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create body draw filter: " + className);
		}
	}

	/**
	 * Filter function.
	 * 
	 * @param body The body
	 * @return true if the body should be rendered.
	 */
	protected abstract boolean shouldDraw(Body body);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_BODY_DRAW_FILTER_SET_PROCS;
			method.invokeExact(JPH_BODY_DRAW_FILTER_PROCS);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set body draw filter procs: " + className);
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(BodyDrawFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		FunctionDescriptor shouldDraw= functionDescrVoid(ADDRESS.withTargetLayout(JAVA_INT), ADDRESS);
		
		MethodHandle shouldDrawHandle = upcallHandleStatic(lookup, BodyDrawFilter.class, "shouldDraw", shouldDraw);
	
		SHOULD_DRAW_ADDR = upcallStub(shouldDrawHandle, shouldDraw, arena);
		
		SHOULD_DRAW.set(JPH_BODY_DRAW_FILTER_PROCS, SHOULD_DRAW_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_BODY_DRAW_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy body draw filter: " + className);
		}
	}

	@SuppressWarnings("unused")
	private static void shouldDraw(MemorySegment userData, MemorySegment body) {
		BodyDrawFilter filter = BODY_DRAW_FILTERS.get(userData.get(JAVA_INT, 0)).get();

		Body bodyObject = Jolt.getBody(body.address());
		if (bodyObject == null && !body.equals(MemorySegment.NULL))
			bodyObject = new Body(body);

		filter.shouldDraw(bodyObject);
	}

	public MemorySegment memorySegment() {
		return jphbodyDrawFilter;
	}

}
