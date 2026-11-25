/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.MemoryStack;

import static volucris.bindings.core.FFMUtils.*;

public final class StringView {

	private static final LazyConstant<MethodHandle> JPH_STRING_VIEW_CREATE;
	private static final LazyConstant<MethodHandle> JPH_STRING_VIEW_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_STRING_VIEW_CREATE = downcallHandle("JPH_StringView_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_STRING_VIEW_DESTROY = downcallHandleVoid("JPH_StringView_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public StringView(
	    String inString
	) {
	    this(
	        Arena.ofAuto(),
	        inString
	    );
	}
	
	/// Typed method of [#create].
	public StringView(
		Arena arena,
		String inString
	) {
		MemorySegment segment = create(
			arena.allocateFrom(inString)
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public StringView(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment inString
    ) {
    	MethodHandle method = JPH_STRING_VIEW_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inString
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_STRING_VIEW_DESTROY.get();
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