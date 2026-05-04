package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * 
 */
public final class ContactSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle COMBINED_FRICTION;
	private static final VarHandle COMBINED_RESTITUTION;
	private static final VarHandle INV_MASS_SCALE_1;
	private static final VarHandle INV_INERTIA_SCALE_1;
	private static final VarHandle INV_MASS_SCALE_2;
	private static final VarHandle INV_INERTIA_SCALE_2;
	private static final VarHandle IS_SENSOR;

	private static final long RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET;
	private static final long RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET;

	private final MemorySegment jphContactSettings;

	private final Vec3 relativeLinearSurfaceVelocity;
	private final Vec3 relativeAngularSurfaceVelocity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_FLOAT.withName("combinedFriction"),
		        JAVA_FLOAT.withName("combinedRestitution"),
		        JAVA_FLOAT.withName("invMassScale1"),
		        JAVA_FLOAT.withName("invInertiaScale1"),
		        JAVA_FLOAT.withName("invMassScale2"),
		        JAVA_FLOAT.withName("invInertiaScale2"),
		        JAVA_INT.withName("isSensor"),
		        Vec3.LAYOUT().withName("relativeLinearSurfaceVelocity"),
		        Vec3.LAYOUT().withName("relativeAngularSurfaceVelocity")
			);
		//@formatter:on

		COMBINED_FRICTION = varHandle(LAYOUT, "combinedFriction");
		COMBINED_RESTITUTION = varHandle(LAYOUT, "combinedRestitution");
		INV_MASS_SCALE_1 = varHandle(LAYOUT, "invMassScale1");
		INV_INERTIA_SCALE_1 = varHandle(LAYOUT, "invInertiaScale1");
		INV_MASS_SCALE_2 = varHandle(LAYOUT, "invMassScale2");
		INV_INERTIA_SCALE_2 = varHandle(LAYOUT, "invInertiaScale2");
		IS_SENSOR = varHandle(LAYOUT, "isSensor");

		RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET = LAYOUT
				.byteOffset(PathElement.groupElement("relativeLinearSurfaceVelocity"));
		RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET = LAYOUT
				.byteOffset(PathElement.groupElement("relativeAngularSurfaceVelocity"));
	}

	public ContactSettings() {
		this(Arena.ofAuto());
	}

	public ContactSettings(Arena arena) {
		jphContactSettings = arena.allocate(LAYOUT);

		long offset = RELATIVE_LINEAR_SURFACE_VELOCITY_OFFSET;
		relativeLinearSurfaceVelocity = new Vec3(jphContactSettings.asSlice(offset, Vec3.LAYOUT()));

		offset = RELATIVE_ANGULAR_SURFACE_VELOCITY_OFFSET;
		relativeAngularSurfaceVelocity = new Vec3(jphContactSettings.asSlice(offset, Vec3.LAYOUT()));
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphContactSettings, 0, LAYOUT.byteSize());
	}

	/**
	 * Combined friction for the body pair (see: PhysicsSystem::SetCombineFriction)
	 */
	public float getCombinedFriction() {
		return (float) COMBINED_FRICTION.get(jphContactSettings);
	}

	/**
	 * Combined restitution for the body pair (see:
	 * PhysicsSystem::SetCombineRestitution)
	 */
	public float getCombinedRestitution() {
		return (float) COMBINED_RESTITUTION.get(jphContactSettings);
	}

	/**
	 * Scale factor for the inverse mass of body 1 (0 = infinite mass, 1 = use
	 * original mass, 2 = body has half the mass). For the same contact pair, you
	 * should strive to keep the value the same over time.
	 */
	public float getInvMassScale1() {
		return (float) INV_MASS_SCALE_1.get(jphContactSettings);
	}

	/**
	 * Scale factor for the inverse inertia of body 1 (usually same as
	 * mInvMassScale1)
	 */
	public float getInvInertiaScale1() {
		return (float) INV_INERTIA_SCALE_1.get(jphContactSettings);
	}

	/**
	 * Scale factor for the inverse mass of body 2 (0 = infinite mass, 1 = use
	 * original mass, 2 = body has half the mass). For the same contact pair, you
	 * should strive to keep the value the same over time.
	 */
	public float getInvMassScale2() {
		return (float) INV_MASS_SCALE_2.get(jphContactSettings);
	}

	/**
	 * Scale factor for the inverse inertia of body 2 (usually same as
	 * mInvMassScale2)
	 */
	public float getInvInertiaScale2() {
		return (float) INV_INERTIA_SCALE_2.get(jphContactSettings);
	}

	/**
	 * If the contact should be treated as a sensor vs body contact (no collision
	 * response)
	 */
	public boolean isSensor() {
		int value = (int) IS_SENSOR.get(jphContactSettings);
		return value == 1;
	}

	/**
	 * Relative linear surface velocity between the bodies (world space surface
	 * velocity of body 2 - world space surface velocity of body 1), can be used to
	 * create a conveyor belt effect.
	 */
	public Vector3f getRelativeLinearSurfaceVelocity(Vector3f target) {
		return relativeLinearSurfaceVelocity.get(target);
	}

	/**
	 * @see #getRelativeAngularSurfaceVelocity(Vector3f)
	 */
	public Vector3f getRelativeLinearSurfaceVelocity() {
		return getRelativeLinearSurfaceVelocity(new Vector3f());
	}

	/**
	 * Relative angular surface velocity between the bodies (world space angular
	 * surface velocity of body 2 - world space angular surface velocity of body 1).
	 * Note that this angular velocity is relative to the center of mass of body 1,
	 * so if you want it relative to body 2's center of mass you need to add body 2
	 * angular velocity x (body 1 world space center of mass - body 2 world space
	 * center of mass) to mRelativeLinearSurfaceVelocity.
	 */
	public Vector3f getRelativeAngularSurfaceVelocity(Vector3f target) {
		return relativeAngularSurfaceVelocity.get(target);
	}

	/**
	 * @see #getRelativeAngularSurfaceVelocity(Vector3f)
	 */
	public Vector3f getRelativeAngularSurfaceVelocity() {
		return getRelativeAngularSurfaceVelocity(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphContactSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
