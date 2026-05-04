package volucris.engine.physics.jolt.callbacks;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import org.tinylog.Logger;

public final class TraceCallbackImpl extends TraceCallback {
	
	public TraceCallbackImpl() {
		
	}
	
	public TraceCallbackImpl(Arena arena) {
		super(arena);
	}
	
	@Override
	public void traceCallback(MemorySegment message) {
		String string = message.getString(0);
		Logger.debug("Jolt: {}", string);
	}
}
