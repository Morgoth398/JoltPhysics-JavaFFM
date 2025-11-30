package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.constraint.ConstraintEnums.SpringMode;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings for a linear or angular spring.
 */
public final class SpringSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle MODE;
	private static final VarHandle FREQUENCY_OR_STIFFNESS;
	private static final VarHandle DAMPING;

	private final MemorySegment jphSpringSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_INT.withName("mode"),
		        JAVA_FLOAT.withName("frequencyOrStiffness"),
		        JAVA_FLOAT.withName("damping")
			);
		//@formatter:on

		MODE = varHandle(LAYOUT, "mode");
		FREQUENCY_OR_STIFFNESS = varHandle(LAYOUT, "frequencyOrStiffness");
		DAMPING = varHandle(LAYOUT, "damping");
	}

	public SpringSettings() {
		jphSpringSettings = Arena.ofAuto().allocate(LAYOUT);
	}

	public SpringSettings(SpringMode mode, float frequencyOrStiffness, float damping) {
		jphSpringSettings = Arena.ofAuto().allocate(LAYOUT);

		setMode(mode);
		setFrequencyOrStiffness(frequencyOrStiffness);
		setDamping(damping);
	}

	public SpringSettings(MemorySegment segment) {
		jphSpringSettings = segment;
	}

	public void set(MemorySegment segment) {
		if (segment.byteSize() == LAYOUT.byteSize()) {
			MemorySegment.copy(segment, 0, jphSpringSettings, 0, LAYOUT.byteSize());
		} else {
			segment = segment.reinterpret(LAYOUT.byteSize());
			MemorySegment.copy(segment, 0, jphSpringSettings, 0, LAYOUT.byteSize());
		}
	}

	/**
	 * Selects the way in which the spring is defined If the mode is
	 * StiffnessAndDamping then mFrequency becomes the stiffness (k) and mDamping
	 * becomes the damping ratio (c) in the spring equation F = -k * x - c * v.
	 * Otherwise the properties are as documented.
	 */
	public void setMode(SpringMode mode) {
		MODE.set(jphSpringSettings, mode.id());
	}

	/**
	 * @see #setMode(SpringMode)
	 */
	public SpringMode getMode() {
		int value = (int) MODE.get(jphSpringSettings);

		for (SpringMode mode : SpringMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong value for spring mode.");
	}

	/**
	 * <ul>
	 * <li>stiffness
	 * <p>
	 * Valid when mSpringMode = ESpringMode::StiffnessAndDamping. If mStiffness > 0
	 * the constraint will be soft and mStiffness specifies the stiffness (k) in the
	 * spring equation F = -k * x - c * v for a linear or T = -k * theta - c * w for
	 * an angular spring. If mStiffness <= 0, mDamping is ignored and the constraint
	 * will have hard limits (as hard as the time step / the number of velocity /
	 * position solver steps allows).
	 * 
	 * Note that stiffness values are large numbers. To calculate a ballpark value
	 * for the needed stiffness you can use: force = stiffness * delta_spring_length
	 * = mass * gravity <=> stiffness = mass * gravity / delta_spring_length. So if
	 * your object weighs 1500 kg and the spring compresses by 2 meters, you need a
	 * stiffness in the order of 1500 * 9.81 / 2 ~ 7500 N/m.
	 * <li>frequency
	 * <p>
	 * Valid when mSpringMode = ESpringMode::FrequencyAndDamping. If mFrequency > 0
	 * the constraint will be soft and mFrequency specifies the oscillation
	 * frequency in Hz. If mFrequency <= 0, mDamping is ignored and the constraint
	 * will have hard limits (as hard as the time step / the number of velocity /
	 * position solver steps allows).
	 * <ul>
	 */
	public void setFrequencyOrStiffness(float value) {
		FREQUENCY_OR_STIFFNESS.set(jphSpringSettings, value);
	}

	/**
	 * @see #setFrequencyOrStiffness(float)
	 */
	public float getFrequencyOrStiffness() {
		return (float) FREQUENCY_OR_STIFFNESS.get(jphSpringSettings);
	}

	/**
	 * When mSpringMode = ESpringMode::FrequencyAndDamping mDamping is the damping
	 * ratio (0 = no damping, 1 = critical damping). When mSpringMode =
	 * ESpringMode::StiffnessAndDamping mDamping is the damping (c) in the spring
	 * equation F = -k * x - c * v for a linear or T = -k * theta - c * w for an
	 * angular spring. Note that if you set mDamping = 0, you will not get an
	 * infinite oscillation. Because we integrate physics using an explicit Euler
	 * scheme, there is always energy loss. This is done to keep the simulation from
	 * exploding, because with a damping of 0 and even the slightest rounding error,
	 * the oscillation could become bigger and bigger until the simulation explodes.
	 */
	public void setDamping(float damping) {
		DAMPING.set(jphSpringSettings, damping);
	}

	/**
	 * @see #setDamping(float)
	 */
	public float getDamping() {
		return (float) DAMPING.get(jphSpringSettings);
	}

	public MemorySegment memorySegment() {
		return jphSpringSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
