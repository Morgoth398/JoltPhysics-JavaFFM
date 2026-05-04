package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class for character class.
 */
public sealed class CharacterBase permits Character, CharacterVirtual {

	private static final MethodHandle JPH_CHARACTER_BASE_DESTROY;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE;
	private static final MethodHandle JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_UP;
	private static final MethodHandle JPH_CHARACTER_BASE_SET_UP;
	private static final MethodHandle JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_SHAPE;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_STATE;
	private static final MethodHandle JPH_CHARACTER_BASE_IS_SUPPORTED;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_POSITION;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_NORMAL;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_MATERIAL;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_BODY_ID;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID;
	private static final MethodHandle JPH_CHARACTER_BASE_GET_GROUND_USER_DATA;

	protected final MemorySegment jphCharacter;

	protected Arena arena;

	protected Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_CHARACTER_BASE_DESTROY = downcallHandleVoid("JPH_CharacterBase_Destroy", ADDRESS);
		JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE = downcallHandle("JPH_CharacterBase_GetCosMaxSlopeAngle", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE = downcallHandleVoid("JPH_CharacterBase_SetMaxSlopeAngle", ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_BASE_GET_UP = downcallHandleVoid("JPH_CharacterBase_GetUp", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_SET_UP = downcallHandleVoid("JPH_CharacterBase_SetUp", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP = downcallHandle("JPH_CharacterBase_IsSlopeTooSteep", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_SHAPE = downcallHandle("JPH_CharacterBase_GetShape", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_STATE = downcallHandle("JPH_CharacterBase_GetGroundState", JAVA_INT, ADDRESS);
		JPH_CHARACTER_BASE_IS_SUPPORTED = downcallHandle("JPH_CharacterBase_IsSupported", JAVA_BOOLEAN, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_POSITION = downcallHandleVoid("JPH_CharacterBase_GetGroundPosition", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_NORMAL = downcallHandleVoid("JPH_CharacterBase_GetGroundNormal", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterBase_GetGroundVelocity", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_MATERIAL = downcallHandle("JPH_CharacterBase_GetGroundMaterial", ADDRESS, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_BODY_ID = downcallHandle("JPH_CharacterBase_GetGroundBodyId", JAVA_INT, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID = downcallHandle("JPH_CharacterBase_GetGroundSubShapeId", JAVA_INT, ADDRESS);
		JPH_CHARACTER_BASE_GET_GROUND_USER_DATA = downcallHandle("JPH_CharacterBase_GetGroundUserData", JAVA_LONG, ADDRESS);
		//@formatter:on
	}

	protected CharacterBase(MemorySegment segment, boolean owns) {
		arena = Arena.ofAuto();

		if (owns)
			jphCharacter = segment.reinterpret(arena, s -> destroy(s));
		else
			jphCharacter = segment;

		vecTmp = new Vec3(arena);

	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_DESTROY;
			method.invokeExact(segment);

			Jolt.removeCharacterVirtual(segment.address());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy character base.");
		}
	}

	public float getCosMaxSlopeAngle() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_COS_MAX_SLOPE_ANGLE;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get cos max slope angle.");
		}
	}

	/**
	 * Set the maximum angle of slope that character can still walk on (radians)
	 */
	public void setMaxSlopeAngle(float maxSlopeAngle) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_SET_MAX_SLOPE_ANGLE;
			method.invokeExact(jphCharacter, maxSlopeAngle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max slope angle.");
		}
	}

	public Vector3f getUp(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_UP;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get up.");
		}
	}

	public Vector3f getUp() {
		return getUp(new Vector3f());
	}

	/**
	 * Set the up vector for the character.
	 */
	public void setUp(Vector3f up) {
		try {
			vecTmp.set(up);

			MethodHandle method = JPH_CHARACTER_BASE_SET_UP;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set up.");
		}
	}

	/**
	 * Check if the normal of the ground surface is too steep to walk on.
	 */
	public boolean isSlopeTooSteep(Vector3f value) {
		try {
			vecTmp.set(value);

			MethodHandle method = JPH_CHARACTER_BASE_IS_SLOPE_TOO_STEEP;
			return (boolean) method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if slope is too steep.");
		}
	}

	/**
	 * Get the current shape that the character is using.
	 */
	public Shape getShape() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphCharacter);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, false);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get shape.");
		}
	}

	/**
	 * Current ground state.
	 */
	public GroundState getGroundState() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_STATE;
			int value = (int) method.invokeExact(jphCharacter);

			for (GroundState state : GroundState.values()) {
				if (value == state.id())
					return state;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground state.");
		}
	}

	/**
	 * Returns true if the player is supported by normal or steep ground.
	 */
	public boolean isSupported() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_IS_SUPPORTED;
			return (boolean) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if is supported.");
		}
	}

	/**
	 * Get the contact point with the ground.
	 */
	public Vector3f getGroundPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground position.");
		}
	}

	/**
	 * Get the contact point with the ground.
	 */
	public Vector3f getGroundPosition() {
		return getGroundPosition(new Vector3f());
	}

	/**
	 * Get the contact normal with the ground.
	 */
	public Vector3f getGroundNormal(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_NORMAL;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground normal.");
		}
	}

	/**
	 * Get the contact normal with the ground.
	 */
	public Vector3f getGroundNormal() {
		return getGroundNormal(new Vector3f());
	}

	/**
	 * Velocity in world space of ground.
	 */
	public Vector3f getGroundVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_VELOCITY;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground velocity.");
		}
	}

	/**
	 * Velocity in world space of ground.
	 */
	public Vector3f getGroundVelocity() {
		return getGroundVelocity(new Vector3f());
	}

	/**
	 * Material that the character is standing on.
	 */
	public PhysicsMaterial getGroundMaterial() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_MATERIAL;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphCharacter);

			if (segment.equals(MemorySegment.NULL))
				return null;

			PhysicsMaterial material = Jolt.getMaterial(segment.address());
			if (material != null)
				return material;

			return new PhysicsMaterial(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground material.");
		}
	}

	/**
	 * BodyID of the object the character is standing on. Note may have been
	 * removed!
	 */
	public int getGroundBodyId() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_BODY_ID;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground body id.");
		}
	}

	/**
	 * Sub part of the body that we're standing on.
	 */
	public int getGroundSubShapeId() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_SUB_SHAPE_ID;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground sub shape id.");
		}
	}

	/**
	 * User data value of the body that we're standing on.
	 */
	public long getGroundUserData() {
		try {
			MethodHandle method = JPH_CHARACTER_BASE_GET_GROUND_USER_DATA;
			return (long) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ground user data.");
		}
	}

}