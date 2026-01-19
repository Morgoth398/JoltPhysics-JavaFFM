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

public abstract class CastShapeResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	private final ShapeCastResult result;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CastShapeResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(ShapeCastResult.LAYOUT()));
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, CastShapeResultCallback.class, "castShapeResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CastShapeResultCallback() {
		this(Arena.ofAuto());
	}

	public CastShapeResultCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR, arena);

		result = new ShapeCastResult(arena);
	}

	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void castShapeResultCallback(MemorySegment context, ShapeCastResult result);

	@SuppressWarnings("unused")
	private void castShapeResultCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		castShapeResultCallback(context, this.result);
	}

	public MemorySegment memorySegment() {
		return callbackAddress;
	}

}
