package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

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
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(CollidePointResult.LAYOUT()));
		
		CALLBACK = upcallHandle(LOOKUP, CollidePointResultCallback.class, "collidePointResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}
	
	public CollidePointResultCallback() {
		callbackAddress = upcallStub(this, CALLBACK, CALLBACK_DESCR);
		
		result = new CollidePointResult();
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
		return callbackAddress.asReadOnly();
	}
	
}
