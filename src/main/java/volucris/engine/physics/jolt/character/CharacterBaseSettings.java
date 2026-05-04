package volucris.engine.physics.jolt.character;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.shape.Plane;
import volucris.engine.physics.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Base class for configuration of a character.
 */
public sealed class CharacterBaseSettings permits CharacterSettings, CharacterVirtualSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle MAX_SLOPE_ANGLE;
	private static final VarHandle ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final VarHandle SHAPE;

	private static final long UP_OFFSET;
	private static final long SUPPORTING_VOLUME_OFFSET;

	private final MemorySegment jphCharacterBaseSettings;

	private final Plane supportingVolume;

	private final Vec3 up;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        Vec3.LAYOUT().withName("up"),
		        Plane.LAYOUT().withName("supportingVolume"),
		        JAVA_FLOAT.withName("maxSlopeAngle"),
		        JAVA_BOOLEAN.withName("enhancedInternalEdgeRemoval"),
		        MemoryLayout.paddingLayout(7),
		        ADDRESS.withName("shape")
			);
		//@formatter:on

		MAX_SLOPE_ANGLE = varHandle(LAYOUT, "maxSlopeAngle");
		ENHANCED_INTERNAL_EDGE_REMOVAL = varHandle(LAYOUT, "enhancedInternalEdgeRemoval");
		SHAPE = varHandle(LAYOUT, "shape");

		UP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("up"));
		SUPPORTING_VOLUME_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportingVolume"));
	}

	protected CharacterBaseSettings(MemorySegment segment) {
		jphCharacterBaseSettings = segment;

		supportingVolume = new Plane(segment.asSlice(SUPPORTING_VOLUME_OFFSET, Plane.LAYOUT()));

		up = new Vec3(segment.asSlice(UP_OFFSET, Plane.LAYOUT()));
	}

	/**
	 * Plane, defined in local space relative to the character. Every contact behind
	 * this plane can support the character, every contact in front of this plane is
	 * treated as only colliding with the player. Default: Accept any contact.
	 */
	public Plane getSupportingVolume() {
		return supportingVolume;
	}

	/**
	 * @see #getSupportingVolume()
	 */
	public void setSupportingVolume(Plane volume) {
		supportingVolume.set(volume.memorySegment());
	}

	/**
	 * Vector indicating the up direction of the character.
	 */
	public void setUp(float x, float y, float z) {
		up.set(x, y, z);
	}

	/**
	 * Vector indicating the up direction of the character.
	 */
	public void setUp(Vector3f up) {
		this.up.set(up);
	}

	/**
	 * Vector indicating the up direction of the character.
	 */
	public Vector3f getUp(Vector3f target) {
		return up.get(target);
	}

	/**
	 * Vector indicating the up direction of the character.
	 */
	public Vector3f getUp() {
		return getUp(new Vector3f());
	}

	/**
	 * Maximum angle of slope that character can still walk on (radians).
	 */
	public void setMaxSlopeAngle(float angle) {
		MAX_SLOPE_ANGLE.set(jphCharacterBaseSettings, angle);
	}

	/**
	 * Maximum angle of slope that character can still walk on (radians).
	 */
	public float getMaxSlopeAngle() {
		return (float) MAX_SLOPE_ANGLE.get(jphCharacterBaseSettings);
	}

	/**
	 * 
	 */
	public void enhancedInternalEdgeRemoval(boolean value) {
		ENHANCED_INTERNAL_EDGE_REMOVAL.set(jphCharacterBaseSettings, value);
	}

	/**
	 * Set to indicate that extra effort should be made to try to remove ghost
	 * contacts (collisions with internal edges of a mesh). This is more expensive
	 * but makes bodies move smoother over a mesh with convex edges.
	 */
	public boolean enhancedInternalEdgeRemoval() {
		return (boolean) ENHANCED_INTERNAL_EDGE_REMOVAL.get(jphCharacterBaseSettings);
	}

	/**
	 * Initial shape that represents the character's volume. Usually this is a
	 * capsule, make sure the shape is made so that the bottom of the shape is at
	 * (0, 0, 0).
	 */
	public void setShape(Shape shape) {
		SHAPE.set(jphCharacterBaseSettings, shape);
	}

	public Shape getShape() {
		MemorySegment segment = (MemorySegment) SHAPE.get(jphCharacterBaseSettings);

		if (segment.equals(MemorySegment.NULL))
			return null;

		Shape shape = Jolt.getShape(segment.address());
		if (shape != null)
			return shape;

		return new Shape(segment, false);
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
