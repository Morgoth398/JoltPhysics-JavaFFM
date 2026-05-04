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

public abstract class CollidePointResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK;

	private final MemorySegment callbackAddress;

	private final CollidePointResult result;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CollidePointResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(CollidePointResult.LAYOUT()));
		
		CALLBACK = upcallHandle(LOOKUP, CollidePointResultCallback.class, "collidePointResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CollidePointResultCallback() {
		this(Arena.ofAuto());
	}

	public CollidePointResultCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK, CALLBACK_DESCR, arena);

		result = new CollidePointResult(arena);
	}

	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract void collidePointResultCallback(MemorySegment context, CollidePointResult result);

	@SuppressWarnings("unused")
	private void collidePointResultCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		collidePointResultCallback(context, this.result);
	}

	public MemorySegment memorySegment() {
		return callbackAddress;
	}

}
