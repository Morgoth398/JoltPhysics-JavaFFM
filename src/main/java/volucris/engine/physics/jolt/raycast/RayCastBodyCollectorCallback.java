package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

public abstract class RayCastBodyCollectorCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	private final BroadPhaseCastResult result;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(RayCastBodyCollectorCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(BroadPhaseCastResult.LAYOUT()));
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, RayCastBodyCollectorCallback.class, "rayCastBodyCollectorCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public RayCastBodyCollectorCallback() {
		this(Arena.ofAuto());
	}

	public RayCastBodyCollectorCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR, arena);

		result = new BroadPhaseCastResult(arena);
	}

	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void rayCastBodyCollectorCallback(MemorySegment context, BroadPhaseCastResult result);

	@SuppressWarnings("unused")
	private void rayCastBodyCollectorCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		rayCastBodyCollectorCallback(context, this.result);
	}

	public MemorySegment memorySegment() {
		return callbackAddress;
	}

}
