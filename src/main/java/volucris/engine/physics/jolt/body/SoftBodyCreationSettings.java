package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class SoftBodyCreationSettings {

	private static final MethodHandle JPH_SOFT_BODY_CREATION_SETTINGS_CREATE;
	private static final MethodHandle JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY;

	private final MemorySegment jphSoftBodyCreationSettings;

	static {
		//@formatter:off
		JPH_SOFT_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_SoftBodyCreationSettings_Create", ADDRESS);
		JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodyCreationSettings_Destroy", ADDRESS);
		//@formatter:on
	}

	public SoftBodyCreationSettings() {
		this(Arena.ofAuto());
	}
	
	public SoftBodyCreationSettings(Arena arena) {
		try {
			MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphSoftBodyCreationSettings = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create SoftBodyCreationSettings.");
		}
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy soft body creation settings.");
		}
	}

	public MemorySegment memorySegment() {
		return jphSoftBodyCreationSettings;
	}

}