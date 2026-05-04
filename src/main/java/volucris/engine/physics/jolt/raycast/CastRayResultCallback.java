package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class CastRayResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK;

	private final MemorySegment callbackAddress;

	private final RayCastResult result;
	
	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CastRayResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(RayCastResult.LAYOUT()));
		
		CALLBACK = upcallHandle(LOOKUP, CastRayResultCallback.class, "castRayResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}
	
	public CastRayResultCallback() {
		callbackAddress = upcallStub(this, CALLBACK, CALLBACK_DESCR);
		
		result = new RayCastResult();
	}
	
	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract void castRayResultCallback(MemorySegment context, RayCastResult result);
	
	@SuppressWarnings("unused")
	private void castRayResultCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		castRayResultCallback(context, this.result);
	}
	
	public MemorySegment memorySegment() {
		return callbackAddress.asReadOnly();
	}
	
}
