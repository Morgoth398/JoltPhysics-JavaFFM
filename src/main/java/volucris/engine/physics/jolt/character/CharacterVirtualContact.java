package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.body.BodyEnums.MotionType;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

public class CharacterVirtualContact {

	private final static StructLayout LAYOUT;

	private static final VarHandle HASH;
	private static final VarHandle BODY_B;
	private static final VarHandle CHARACTER_ID_B;
	private static final VarHandle SUB_SHAPE_ID_B;
	private static final VarHandle DISTANCE;
	private static final VarHandle FRACTION;
	private static final VarHandle MOTION_TYPE_B;
	private static final VarHandle IS_SENSOR_B;
	private static final VarHandle CHARACTER_B;
	private static final VarHandle USER_DATA;
	private static final VarHandle MATERIAL;
	private static final VarHandle HAD_COLLISION;
	private static final VarHandle WAS_DISCARDED;
	private static final VarHandle CAN_PUSH_CHARACTER;

	private static final long POSITION_OFFSET;
	private static final long LINEAR_VELOCITY_OFFSET;
	private static final long CONTACT_NORMAL_OFFSET;
	private static final long SURFACE_NORMAL_OFFSET;

	private final MemorySegment jphCharacterVirtualContact;

	private final Vec3 position;
	private final Vec3 linearVelocity;
	private final Vec3 contactNormal;
	private final Vec3 surfaceNormal;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_LONG.withName("hash"),
		        JAVA_INT.withName("bodyB"),
		        JAVA_INT.withName("characterIDB"),
		        JAVA_INT.withName("subShapeIDB"),
		        Vec3.LAYOUT().withName("position"),
		        Vec3.LAYOUT().withName("linearVelocity"),
		        Vec3.LAYOUT().withName("contactNormal"),
		        Vec3.LAYOUT().withName("surfaceNormal"),
		        JAVA_FLOAT.withName("distance"),
		        JAVA_FLOAT.withName("fraction"),
		        JAVA_INT.withName("motionTypeB"),
		        JAVA_BOOLEAN.withName("isSensorB"),
		        MemoryLayout.paddingLayout(7),
		        ADDRESS.withName("characterB"),
		        JAVA_LONG.withName("userData"),
		        ADDRESS.withName("material"),
		        JAVA_BOOLEAN.withName("hadCollision"),
		        JAVA_BOOLEAN.withName("wasDiscarded"),
		        JAVA_BOOLEAN.withName("canPushCharacter"),
		        MemoryLayout.paddingLayout(5)
			);
		//@formatter:on

		HASH = varHandle(LAYOUT, "hash");
		BODY_B = varHandle(LAYOUT, "bodyB");
		CHARACTER_ID_B = varHandle(LAYOUT, "characterIDB");
		SUB_SHAPE_ID_B = varHandle(LAYOUT, "subShapeIDB");
		DISTANCE = varHandle(LAYOUT, "distance");
		FRACTION = varHandle(LAYOUT, "fraction");
		MOTION_TYPE_B = varHandle(LAYOUT, "motionTypeB");
		IS_SENSOR_B = varHandle(LAYOUT, "isSensorB");
		CHARACTER_B = varHandle(LAYOUT, "characterB");
		USER_DATA = varHandle(LAYOUT, "userData");
		MATERIAL = varHandle(LAYOUT, "material");
		HAD_COLLISION = varHandle(LAYOUT, "hadCollision");
		WAS_DISCARDED = varHandle(LAYOUT, "wasDiscarded");
		CAN_PUSH_CHARACTER = varHandle(LAYOUT, "canPushCharacter");

		POSITION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
		LINEAR_VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearVelocity"));
		CONTACT_NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactNormal"));
		SURFACE_NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceNormal"));
	}

	public CharacterVirtualContact() {
		this(Arena.ofAuto());
	}

	public CharacterVirtualContact(Arena arena) {
		jphCharacterVirtualContact = arena.allocate(LAYOUT);

		position = new Vec3(jphCharacterVirtualContact.asSlice(POSITION_OFFSET, Vec3.LAYOUT()));
		linearVelocity = new Vec3(jphCharacterVirtualContact.asSlice(LINEAR_VELOCITY_OFFSET, Vec3.LAYOUT()));
		contactNormal = new Vec3(jphCharacterVirtualContact.asSlice(CONTACT_NORMAL_OFFSET, Vec3.LAYOUT()));
		surfaceNormal = new Vec3(jphCharacterVirtualContact.asSlice(SURFACE_NORMAL_OFFSET, Vec3.LAYOUT()));
	}

	public long getHash() {
		return (long) HASH.get(jphCharacterVirtualContact);
	}

	public int getBodyIdB() {
		return (int) BODY_B.get(jphCharacterVirtualContact);
	}

	public int getCharacterIdB() {
		return (int) CHARACTER_ID_B.get(jphCharacterVirtualContact);
	}

	public int getSubShapeIdB() {
		return (int) SUB_SHAPE_ID_B.get(jphCharacterVirtualContact);
	}

	public Vector3f getPosition(Vector3f target) {
		return position.get(target);
	}

	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}

	public Vector3f getLinearVelocity(Vector3f target) {
		return linearVelocity.get(target);
	}

	public Vector3f getLinearVelocity() {
		return getLinearVelocity(new Vector3f());
	}

	public Vector3f getContactNormal(Vector3f target) {
		return contactNormal.get(target);
	}

	public Vector3f getContactNormal() {
		return getContactNormal(new Vector3f());
	}

	public Vector3f getSurfaceNormal(Vector3f target) {
		return surfaceNormal.get(target);
	}

	public Vector3f getSurfaceNormal() {
		return getSurfaceNormal(new Vector3f());
	}

	public float getDistance() {
		return (float) DISTANCE.get(jphCharacterVirtualContact);
	}

	public float getFraction() {
		return (float) FRACTION.get(jphCharacterVirtualContact);
	}

	public MotionType getMotionTypeB() {
		int value = (int) MOTION_TYPE_B.get(jphCharacterVirtualContact);

		for (MotionType type : MotionType.values()) {
			if (value == type.id())
				return type;
		}

		throw new JoltRuntimeException("Wrong motion type");
	}

	public boolean isSensorB() {
		return (boolean) IS_SENSOR_B.get(jphCharacterVirtualContact);
	}

	public CharacterVirtual getCharacterB() {
		MemorySegment segment = (MemorySegment) CHARACTER_B.get(jphCharacterVirtualContact);

		if (segment.equals(MemorySegment.NULL))
			return null;

		CharacterVirtual character = Jolt.getCharacterVirtual(segment.address());
		if (character != null)
			return character;

		return new CharacterVirtual(segment);
	}

	public long getUserData() {
		return (long) USER_DATA.get(jphCharacterVirtualContact);
	}

	public PhysicsMaterial getMaterial() {
		MemorySegment segment = (MemorySegment) MATERIAL.get(jphCharacterVirtualContact);

		if (segment.equals(MemorySegment.NULL))
			return null;

		PhysicsMaterial material = Jolt.getMaterial(segment.address());
		if (material != null)
			return material;

		return new PhysicsMaterial(segment);
	}

	public boolean hadCollision() {
		return (boolean) HAD_COLLISION.get(jphCharacterVirtualContact);
	}

	public boolean wasDiscarded() {
		return (boolean) WAS_DISCARDED.get(jphCharacterVirtualContact);
	}

	public boolean canPushCharacter() {
		return (boolean) CAN_PUSH_CHARACTER.get(jphCharacterVirtualContact);
	}

	public MemorySegment memorySegment() {
		return jphCharacterVirtualContact;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
