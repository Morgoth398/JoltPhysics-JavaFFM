package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.JoltEnums.AllowedDOFs;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Contains the configuration of a character.
 */
public final class CharacterSettings extends CharacterBaseSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CHARACTER_SETTINGS_INIT;

	private static final VarHandle LAYER;
	private static final VarHandle MASS;
	private static final VarHandle FRICTION;
	private static final VarHandle GRAVITY_FACTOR;
	private static final VarHandle ALLOWED_DOFS;

	private static final long BASE_OFFSET;

	private final MemorySegment jphCharacterSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        CharacterBaseSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("layer"),
		        JAVA_FLOAT.withName("mass"),
		        JAVA_FLOAT.withName("friction"),
		        JAVA_FLOAT.withName("gravityFactor"),
		        JAVA_INT.withName("allowedDOFs"),
		        MemoryLayout.paddingLayout(4)
			).withName("CharacterSettings");
		
		JPH_CHARACTER_SETTINGS_INIT = downcallHandleVoid("JPH_CharacterSettings_Init", ADDRESS);
		//@formatter:on

		LAYER = varHandle(LAYOUT, "layer");
		MASS = varHandle(LAYOUT, "mass");
		FRICTION = varHandle(LAYOUT, "friction");
		GRAVITY_FACTOR = varHandle(LAYOUT, "gravityFactor");
		ALLOWED_DOFS = varHandle(LAYOUT, "allowedDOFs");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
	}

	public CharacterSettings() {
		this(Arena.ofAuto());
	}

	public CharacterSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, CharacterBaseSettings.LAYOUT()));

		jphCharacterSettings = segment;

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_CHARACTER_SETTINGS_INIT;
			method.invokeExact(jphCharacterSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize character settings: " + className);
		}
	}

	/**
	 * Layer that this character will be added to.
	 */
	public void setLayer(int layer) {
		LAYER.set(jphCharacterSettings, layer);
	}

	/**
	 * Layer that this character will be added to.
	 */
	public int getLayer() {
		return (int) LAYER.get(jphCharacterSettings);
	}

	/**
	 * Mass of the character.
	 */
	public void setMass(float mass) {
		MASS.set(jphCharacterSettings, mass);
	}

	/**
	 * Mass of the character.
	 */
	public float getMass() {
		return (float) MASS.get(jphCharacterSettings);
	}

	/**
	 * Friction for the character.
	 */
	public void setFriction(float friction) {
		FRICTION.set(jphCharacterSettings, friction);
	}

	/**
	 * Friction for the character.
	 */
	public float getFriction() {
		return (float) FRICTION.get(jphCharacterSettings);
	}

	/**
	 * Value to multiply gravity with for this character.
	 */
	public void setGravityFactor(float gravityFactor) {
		GRAVITY_FACTOR.set(jphCharacterSettings);
	}

	/**
	 * Value to multiply gravity with for this character.
	 */
	public float getGravityFactor() {
		return (float) GRAVITY_FACTOR.get(jphCharacterSettings);
	}

	/**
	 * Allowed degrees of freedom for this character.
	 */
	public void setAllowedDofs(AllowedDOFs dofs) {
		ALLOWED_DOFS.set(jphCharacterSettings, dofs.id());
	}

	/**
	 * Allowed degrees of freedom for this character.
	 */
	public void setAllowedDofs(AllowedDOFs... dofs) {
		int mask = 0;

		for (AllowedDOFs dof : dofs)
			mask |= dof.id();

		ALLOWED_DOFS.set(jphCharacterSettings, mask);
	}

	public MemorySegment memorySegment() {
		return jphCharacterSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}