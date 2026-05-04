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

public abstract class CollideShapeBodyResultCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor CALLBACK_DESCR;

	private static final MethodHandle CALLBACK_HANDLE;

	private final MemorySegment callbackAddress;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(CollideShapeBodyResultCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		CALLBACK_DESCR = functionDescrVoid(ADDRESS, JAVA_INT);
		
		CALLBACK_HANDLE = upcallHandle(LOOKUP, CollideShapeBodyResultCallback.class, "collideShapeBodyResultCallback", CALLBACK_DESCR);
		//@formatter:on
	}

	public CollideShapeBodyResultCallback() {
		this(Arena.ofAuto());
	}
	
	public CollideShapeBodyResultCallback(Arena arena) {
		callbackAddress = upcallStub(this, CALLBACK_HANDLE, CALLBACK_DESCR, arena);
	}
	
	/**
	 * Do not store a reference to the objects. They will be reused internally.
	 */
	protected abstract void collideShapeBodyResultCallback(MemorySegment context, int bodyId);

	public MemorySegment memorySegment() {
		return callbackAddress;
	}
	
}
