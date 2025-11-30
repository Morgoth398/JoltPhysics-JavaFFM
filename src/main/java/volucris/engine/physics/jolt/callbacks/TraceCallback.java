package volucris.engine.physics.jolt.callbacks;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class TraceCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor TRACE_CALLBACK_DESCR;

	private static final MethodHandle TRACE_CALLBACK_HANDLE;

	private final MemorySegment traceCallbackAddress;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(TraceCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		TRACE_CALLBACK_DESCR = functionDescrVoid(ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE)));
		
		TRACE_CALLBACK_HANDLE = upcallHandle(LOOKUP, TraceCallback.class, "traceCallback", TRACE_CALLBACK_DESCR);
		//@formatter:on
	}
	
	public TraceCallback() {
		traceCallbackAddress = upcallStub(this, TRACE_CALLBACK_HANDLE, TRACE_CALLBACK_DESCR);
	}
	
	public abstract void traceCallback(MemorySegment message) ;
	
	public MemorySegment memorySegment() {
		return traceCallbackAddress.asReadOnly();
	}
	
}
