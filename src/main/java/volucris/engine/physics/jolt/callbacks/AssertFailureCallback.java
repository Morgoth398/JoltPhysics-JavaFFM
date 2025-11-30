package volucris.engine.physics.jolt.callbacks;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public abstract class AssertFailureCallback {

	private static final Lookup LOOKUP;

	private static final FunctionDescriptor ASSERT_FAILURE_CALLBACK_DESCR;

	private static final MethodHandle ASSERT_FAILURE_CALLBACK_HANDLE;

	private final MemorySegment assertFailureCallbackAddress;

	static {
		//@formatter:off
		try {
			LOOKUP = MethodHandles.privateLookupIn(AssertFailureCallback.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout UNBOUNDED_ADDRESS = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));
		
		ASSERT_FAILURE_CALLBACK_DESCR = functionDescr(JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		
		ASSERT_FAILURE_CALLBACK_HANDLE = upcallHandle(LOOKUP, AssertFailureCallback.class, "assertFailureCallback", ASSERT_FAILURE_CALLBACK_DESCR);
	}

	public AssertFailureCallback() {
		assertFailureCallbackAddress = upcallStub(this, ASSERT_FAILURE_CALLBACK_HANDLE, ASSERT_FAILURE_CALLBACK_DESCR);
	}

	public abstract boolean assertFailureCallback(MemorySegment expression, MemorySegment message, MemorySegment file, int line);
	//@formatter:on

	public MemorySegment memorySegment() {
		return assertFailureCallbackAddress.asReadOnly();
	}

}
