package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class RayCastBodyResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK;

	private final MemorySegment callbackAddress;

	private final BroadPhaseCastResult result;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(RayCastBodyResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(BroadPhaseCastResult.LAYOUT()));
		
		CALLBACK = upcallHandle(LOOKUP, RayCastBodyResultCallback.class, "rayCastBodyResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public RayCastBodyResultCallback() {
		this(Arena.ofAuto());
	}

	public RayCastBodyResultCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK, CALLBACK_DESCR, arena);

		result = new BroadPhaseCastResult(arena);
	}

	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract void rayCastBodyResultCallback(MemorySegment context, BroadPhaseCastResult result);

	@SuppressWarnings("unused")
	private void rayCastBodyResultCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		rayCastBodyResultCallback(context, this.result);
	}

	public MemorySegment memorySegment() {
		return callbackAddress;
	}

}
