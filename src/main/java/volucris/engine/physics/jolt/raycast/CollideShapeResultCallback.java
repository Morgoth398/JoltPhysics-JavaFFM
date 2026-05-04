package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class CollideShapeResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK;

	private final MemorySegment callbackAddress;

	private final CollideShapeResult result;
	
	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CollideShapeResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, ADDRESS.withTargetLayout(CollideShapeResult.LAYOUT()));
		
		CALLBACK = upcallHandle(LOOKUP, CollideShapeResultCallback.class, "collideShapeResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}
	
	public CollideShapeResultCallback() {
		this(Arena.ofAuto());
	}
	
	public CollideShapeResultCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK, CALLBACK_DESCR, arena);
		
		result = new CollideShapeResult(arena);
	}
	
	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	public abstract void collideShapeResultCallback(MemorySegment context, CollideShapeResult result);
	
	@SuppressWarnings("unused")
	private void collideShapeResultCallback(MemorySegment context, MemorySegment result) {
		this.result.set(result);
		collideShapeResultCallback(context, this.result);
	}
	
	public MemorySegment memorySegment() {
		return callbackAddress;
	}
	
}
