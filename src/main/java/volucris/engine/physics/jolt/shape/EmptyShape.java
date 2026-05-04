package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * An empty shape that has no volume and collides with nothing.
 * <p>
 * Possible use cases:
 * <ul>
 * <li>As a placeholder for a shape that will be created later. E.g. if you
 * first need to create a body and only then know what shape it will have.
 * <li>If you need a kinematic body to attach a constraint to, but you don't
 * want the body to collide with anything.
 * </ul>
 * Note that, if possible, you should also put your body in an ObjectLayer that
 * doesn't collide with anything. This ensures that collisions will be filtered
 * out at broad phase level instead of at narrow phase level, this is more
 * efficient.
 */
public final class EmptyShape extends Shape {

	protected EmptyShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	protected EmptyShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected EmptyShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected EmptyShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

}