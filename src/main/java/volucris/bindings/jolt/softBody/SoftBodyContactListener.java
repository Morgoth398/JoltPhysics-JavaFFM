/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyContactListener {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_LISTENER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CONTACT_LISTENER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_CONTACT_LISTENER_CREATE = downcallHandle("JPH_SoftBodyContactListener_Create", UNBOUNDED_ADDRESS, SoftBodyContactListenerFunctions.LAYOUT);
		JPH_SOFT_BODY_CONTACT_LISTENER_DESTROY = downcallHandleVoid("JPH_SoftBodyContactListener_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodyContactListener(
	    SoftBodyContactListenerFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#softBodyContactListener_Create].
	public SoftBodyContactListener(
		Arena arena,
		SoftBodyContactListenerFunctions functions
	) {
		MemorySegment segment = softBodyContactListener_Create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> softBodyContactListener_Destroy(s));
	}

	public SoftBodyContactListener(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment softBodyContactListener_Create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_LISTENER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void softBodyContactListener_Destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_CONTACT_LISTENER_DESTROY.get();
    	try {
    		 method.invokeExact(
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