package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class CollidePointCollectorCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	private final CollidePointResult result;
	
	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CollidePointCollectorCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(CollidePointResult.LAYOUT()));
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, CollidePointCollectorCallback.class, "collidePointCollectorCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CollidePointCollectorCallback() {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR);
		
		result = new CollidePointResult();
	}

	protected abstract void collidePointCollectorCallback(MemorySegment context, CollidePointResult result);

	@SuppressWarnings("unused")
	private void collidePointCollectorCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		collidePointCollectorCallback(context, this.result);
	}
	
	public MemorySegment memorySegment() {
		return callbackAddress;
	}
	
}
