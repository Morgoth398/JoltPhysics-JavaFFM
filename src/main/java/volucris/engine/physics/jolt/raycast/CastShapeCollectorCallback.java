package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class CastShapeCollectorCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	private final ShapeCastResult result;
	
	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CastShapeCollectorCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(ShapeCastResult.LAYOUT()));
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, CastShapeCollectorCallback.class, "castShapeCollectorCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CastShapeCollectorCallback() {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR);
		
		result = new ShapeCastResult();
	}

	protected abstract void castShapeCollectorCallback(MemorySegment context, ShapeCastResult result);

	@SuppressWarnings("unused")
	private void castShapeCollectorCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		castShapeCollectorCallback(context, this.result);
	}
	
	public MemorySegment memorySegment() {
		return callbackAddress;
	}
	
}
