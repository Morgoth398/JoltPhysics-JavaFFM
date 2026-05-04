package volucris.engine.physics.jolt.callbacks;

import java.lang.foreign.MemorySegment;

import org.tinylog.Logger;

public final class AssertFailureCallbackImpl extends AssertFailureCallback {
	@Override
	public boolean assertFailureCallback(MemorySegment expression, MemorySegment message, MemorySegment file,
			int line) {

		String messageString = message.getString(0);
		String fileString = file.getString(0);

		Logger.error("Jolt: Assertion failure at {}:{}: {}", fileString, line, messageString);

		return true;
	}
}
