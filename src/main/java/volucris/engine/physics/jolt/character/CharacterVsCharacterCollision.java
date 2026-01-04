package volucris.engine.physics.jolt.character;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.filter.ShapeFilter;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.raycast.CollideShapeSettings;
import volucris.engine.physics.jolt.raycast.ShapeCastSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Interface class that allows a CharacterVirtual to check collision with other
 * CharacterVirtual instances. Since CharacterVirtual instances are not
 * registered anywhere, it is up to the application to test collision against
 * relevant characters. The characters could be stored in a tree structure to
 * make this more efficient.
 */
public abstract class CharacterVsCharacterCollision {

	private static final ArrayList<WeakReference<CharacterVsCharacterCollision>> COLLISIONS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS;
	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE;
	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY;

	private static final VarHandle COLLIDE_CHARACTER;
	private static final VarHandle CAST_CHARACTER;

	private static final MemorySegment JPH_PROCS;

	private static MemorySegment COLLIDE_CHARACTER_ADDR;
	private static MemorySegment CAST_CHARACTER_ADDR;

	private static int count;

	protected final MemorySegment jphCharacterVsCharacterCollision;
	private final MemorySegment userData;

	private CollideShapeSettings collideShapeSettings;
	private ShapeCastSettings shapeCastSettings;

	private Mat4 matTmp;

	private Vec3 vecTmp;

	private Matrix4f matrix;

	private Vector3f vector1;
	private Vector3f vector2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("CollideCharacter"),
				ADDRESS.withName("CastCharacter")
			).withName("JPH_CharacterVsCharacterCollision_Procs");
		
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS = downcallHandleVoid("JPH_CharacterVsCharacterCollision_SetProcs", ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE = downcallHandle("JPH_CharacterVsCharacterCollision_Create", ADDRESS, ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY = downcallHandleVoid("JPH_CharacterVsCharacterCollision_Destroy", ADDRESS);
		//@formatter:on

		COLLIDE_CHARACTER = varHandle(LAYOUT, "CollideCharacter");
		CAST_CHARACTER = varHandle(LAYOUT, "CastCharacter");

		JPH_PROCS = Arena.ofAuto().allocate(LAYOUT);

		fillProcs();
		setProcs();

		COLLISIONS = new ArrayList<WeakReference<CharacterVsCharacterCollision>>();
	}

	protected CharacterVsCharacterCollision(MemorySegment segment, Arena arena) {
		jphCharacterVsCharacterCollision = segment.reinterpret(arena, s -> destroy(s));

		userData = MemorySegment.NULL;
	}

	public CharacterVsCharacterCollision() {
		this(Arena.ofAuto());
	}
	
	public CharacterVsCharacterCollision(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphCharacterVsCharacterCollision = segment.reinterpret(arena, s -> destroy(s));

			collideShapeSettings = new CollideShapeSettings(arena);
			shapeCastSettings = new ShapeCastSettings(arena);

			matTmp = new Mat4(arena);
			vecTmp = new Vec3(arena);

			matrix = new Matrix4f();

			vector1 = new Vector3f();
			vector2 = new Vector3f();

			COLLISIONS.add(index, new WeakReference<CharacterVsCharacterCollision>(this));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape filter.");
		}
	}

	/**
	 * Collide a character against other CharacterVirtuals.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character             The character to collide
	 * @param centerOfMassTransform Center of mass transform for this character.
	 * @param collideShapeSettings  Settings for the collision check.
	 * @param baseOffset            All hit results will be returned relative to
	 *                              this offset, can be zero to get results in world
	 *                              position, but when you're testing far from the
	 *                              origin you get better precision by picking a
	 *                              position that's closer e.g. GetPosition() since
	 *                              floats are most accurate near the origin
	 */
	protected abstract void collideCharacter(CharacterVirtual character, Matrix4f centerOfMassTransform,
			CollideShapeSettings collideShapeSettings, Vector3f baseOffset);

	/**
	 * Cast a character against other CharacterVirtuals.
	 * <p>
	 * Do not store a reference to the objects. They will be reused internally.
	 * 
	 * @param character             The character to cast.
	 * @param centerOfMassTransform Center of mass transform for this character.
	 * @param direction             Direction and length to cast in.
	 * @param shapeCastSettings     Settings for the shape cast.
	 * @param baseOffset            All hit results will be returned relative to
	 *                              this offset, can be zero to get results in world
	 *                              position, but when you're testing far from the
	 *                              origin you get better precision by picking a
	 *                              position that's closer e.g. GetPosition() since
	 *                              floats are most accurate near the origin
	 */
	protected abstract void castCharacter(CharacterVirtual character, Matrix4f centerOfMassTransform,
			Vector3f direction, ShapeCastSettings shapeCastSettings, Vector3f baseOffset);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS;
			method.invokeExact(JPH_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set shape filter procs.");
		}
	}

	private static void fillProcs() {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(ShapeFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		AddressLayout MAT4_ADDRESS = ADDRESS.withTargetLayout(Mat4.LAYOUT());
		AddressLayout VEC3_ADDRESS = ADDRESS.withTargetLayout(Vec3.LAYOUT());
		
		FunctionDescriptor collideCharacter = functionDescrVoid(
				INT_ADDRESS, ADDRESS, MAT4_ADDRESS, 
				ADDRESS.withTargetLayout(CollideShapeSettings.LAYOUT()), 
				VEC3_ADDRESS);
		FunctionDescriptor castCharacter = functionDescrVoid(
				INT_ADDRESS, ADDRESS, MAT4_ADDRESS, VEC3_ADDRESS,
				ADDRESS.withTargetLayout(ShapeCastSettings.LAYOUT()), 
				VEC3_ADDRESS);
		
		Class<CharacterVsCharacterCollision> clazz = CharacterVsCharacterCollision.class;
		MethodHandle collideCharacterHandle = upcallHandleStatic(lookup, clazz, "collideCharacter", collideCharacter);
		MethodHandle castCharacterHandle = upcallHandleStatic(lookup, clazz, "castCharacter", castCharacter);
		
		COLLIDE_CHARACTER_ADDR = upcallStub(collideCharacterHandle, collideCharacter);
		CAST_CHARACTER_ADDR = upcallStub(castCharacterHandle, castCharacter);
		
		COLLIDE_CHARACTER.set(JPH_PROCS, COLLIDE_CHARACTER_ADDR);
		CAST_CHARACTER.set(JPH_PROCS, CAST_CHARACTER_ADDR);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy character vs character collision.");
		}
	}

	@SuppressWarnings("unused")
	private static void collideCharacter(MemorySegment userData, MemorySegment character,
			MemorySegment centerOfMassTransform, MemorySegment settings, MemorySegment baseOffset) {

		CharacterVsCharacterCollision collision = COLLISIONS.get(userData.get(JAVA_INT, 0)).get();

		if (collision == null)
			return;
		
		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		collision.matTmp.set(centerOfMassTransform);
		Matrix4f transform = collision.matTmp.get(collision.matrix);

		collision.collideShapeSettings.set(settings);

		collision.vecTmp.set(baseOffset);
		Vector3f offset = collision.vecTmp.get(collision.vector1);

		collision.collideCharacter(characterVirtual, transform, collision.collideShapeSettings, offset);
	}

	@SuppressWarnings("unused")
	private static void castCharacter(MemorySegment userData, MemorySegment character,
			MemorySegment centerOfMassTransform, MemorySegment direction, MemorySegment settings,
			MemorySegment baseOffset) {

		CharacterVsCharacterCollision collision = COLLISIONS.get(userData.get(JAVA_INT, 0)).get();

		if (collision == null)
			return;
		
		CharacterVirtual characterVirtual = Jolt.getCharacterVirtual(character.address());
		if (characterVirtual == null && !character.equals(MemorySegment.NULL))
			characterVirtual = new CharacterVirtual(character);

		collision.matTmp.set(centerOfMassTransform);
		Matrix4f transform = collision.matTmp.get(collision.matrix);

		collision.shapeCastSettings.set(settings);

		collision.vecTmp.set(direction);
		Vector3f dir = collision.vecTmp.get(collision.vector1);
		
		collision.vecTmp.set(baseOffset);
		Vector3f offset = collision.vecTmp.get(collision.vector2);
		
		collision.castCharacter(characterVirtual, transform, dir, collision.shapeCastSettings, offset);
	}

	public MemorySegment memorySegment() {
		return jphCharacterVsCharacterCollision;
	}

}