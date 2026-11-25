/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class BodyLockInterfaceLocking extends BodyLockInterface {

	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCKING_AS_BODY_LOCK_INTERFACE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_LOCK_INTERFACE_LOCKING_AS_BODY_LOCK_INTERFACE = downcallHandle("JPH_BodyLockInterfaceLocking_AsBodyLockInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyLockInterfaceLocking(MemorySegment segment) {
		this.segment = segment;
		super(asBodyLockInterface(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBodyLockInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCKING_AS_BODY_LOCK_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}