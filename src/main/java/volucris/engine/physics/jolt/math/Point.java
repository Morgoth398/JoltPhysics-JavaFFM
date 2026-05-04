package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector2f;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A point on the linear curve.
 */
public final class Point {

	private static final StructLayout LAYOUT;

	private static final VarHandle X;
	private static final VarHandle Y;

	private final MemorySegment jphPoint;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_FLOAT.withName("x"),
				JAVA_FLOAT.withName("y")
			);
		//@formatter:on

		X = varHandle(LAYOUT, "x");
		Y = varHandle(LAYOUT, "y");
	}

	public Point(Arena arena) {
		jphPoint = arena.allocate(LAYOUT);
	}

	public Point() {
		this(Arena.ofAuto());
	}

	public void set(MemorySegment segment) {
		if (segment.byteSize() == LAYOUT.byteSize()) {
			MemorySegment.copy(segment, 0, jphPoint, 0, LAYOUT.byteSize());
		} else {
			segment = segment.reinterpret(LAYOUT.byteSize());
			MemorySegment.copy(segment, 0, jphPoint, 0, LAYOUT.byteSize());
		}
	}

	public void setX(float x) {
		X.set(jphPoint, x);
	}

	public float getX() {
		return (float) X.get(jphPoint);
	}

	public void setY(float y) {
		Y.set(jphPoint, y);
	}

	public float getY() {
		return (float) Y.get(jphPoint);
	}

	public void set(Vector2f point) {
		setX(point.x);
		setY(point.y);
	}

	public Vector2f get(Vector2f target) {
		return target.set(getX(), getY());
	}

	public Vector2f get() {
		return get(new Vector2f());
	}

	public MemorySegment memorySegment() {
		return jphPoint;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
