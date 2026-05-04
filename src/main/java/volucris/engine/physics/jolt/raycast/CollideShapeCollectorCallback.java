package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class CollideShapeCollectorCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	private final CollideShapeResult result;
	
	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CollideShapeCollectorCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(CollideShapeResult.LAYOUT()));
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, CollideShapeCollectorCallback.class, "collideShapeCollectorCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CollideShapeCollectorCallback() {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR);
		
		result = new CollideShapeResult();
	}
	
	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void collideShapeCollectorCallback(MemorySegment context, CollideShapeResult result);

	@SuppressWarnings("unused")
	private void collideShapeCollectorCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		collideShapeCollectorCallback(context, this.result);
	}
	
	public MemorySegment memorySegment() {
		return callbackAddress;
	}
	
}
