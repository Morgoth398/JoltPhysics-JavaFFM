package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * This class contains settings that allow you to override the behavior of a
 * character's collision response.
 */
public class CharacterContactSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle CAN_PUSH_CHARACTER;
	private static final VarHandle CAN_RECEIVE_IMPULSES;

	private final MemorySegment jphCharacterContactSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_BOOLEAN.withName("canPushCharacter"),
				JAVA_BOOLEAN.withName("canReceiveImpulses")
			);
		//@formatter:on

		CAN_PUSH_CHARACTER = varHandle(LAYOUT, "canPushCharacter");
		CAN_RECEIVE_IMPULSES = varHandle(LAYOUT, "canReceiveImpulses");
	}

	public CharacterContactSettings() {
		this(Arena.ofAuto());
	}

	public CharacterContactSettings(Arena arena) {
		jphCharacterContactSettings = arena.allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		if (segment.byteSize() == LAYOUT.byteSize()) {
			MemorySegment.copy(segment, 0, jphCharacterContactSettings, 0, LAYOUT.byteSize());
		} else {
			segment = segment.reinterpret(LAYOUT.byteSize());
			MemorySegment.copy(segment, 0, jphCharacterContactSettings, 0, LAYOUT.byteSize());
		}
	}

	/**
	 * True when the object can push the virtual character.
	 */
	public void canPushCharacter(boolean value) {
		CAN_PUSH_CHARACTER.set(jphCharacterContactSettings, value);
	}

	/**
	 * True when the object can push the virtual character.
	 */
	public boolean canPushCharacter() {
		return (boolean) CAN_PUSH_CHARACTER.get(jphCharacterContactSettings);
	}

	/**
	 * True when the virtual character can apply impulses (push) the body. Note that
	 * this only works against rigid bodies. Other CharacterVirtual objects can only
	 * be moved in their own update, so you must ensure that in their
	 * OnCharacterContactAdded canPushCharacter is true.
	 */
	public void canReceiveImpulses(boolean value) {
		CAN_RECEIVE_IMPULSES.set(jphCharacterContactSettings, value);
	}

	/**
	 * True when the virtual character can apply impulses (push) the body. Note that
	 * this only works against rigid bodies. Other CharacterVirtual objects can only
	 * be moved in their own update, so you must ensure that in their
	 * OnCharacterContactAdded canPushCharacter is true.
	 */
	public boolean canReceiveImpulses() {
		return (boolean) CAN_RECEIVE_IMPULSES.get(jphCharacterContactSettings);
	}

	public MemorySegment memorySegment() {
		return jphCharacterContactSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
