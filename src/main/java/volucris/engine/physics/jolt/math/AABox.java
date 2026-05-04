package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;

import org.joml.Vector3f;

import volucris.engine.graphics.BoundingBox;

import java.lang.foreign.MemoryLayout.PathElement;

/**
 * Axis aligned box. 
 */
public final class AABox {

	private static final StructLayout LAYOUT;
	
	private static final long MIN_OFFSET;
	private static final long MAX_OFFSET;
	
	private final MemorySegment jphAABox;
	
	private final Vec3 min;
	private final Vec3 max;
	
	private Vector3f tmp;
	private Vector3f tmp2;
	
	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				Vec3.LAYOUT().withName("min"),
				Vec3.LAYOUT().withName("max")
			).withName("JPH_AABox");
		//@formatter:on
		
		MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min"));
		MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max"));
	}
	
	public AABox() {
		this(Arena.ofAuto());
	}
	
	public AABox(Arena arena) {
		jphAABox = arena.allocate(LAYOUT);
		
		min = new Vec3(jphAABox.asSlice(MIN_OFFSET, Vec3.LAYOUT()));
		max = new Vec3(jphAABox.asSlice(MAX_OFFSET, Vec3.LAYOUT()));
		
		tmp = new Vector3f();
		tmp2 = new Vector3f();
	}
	
	public void setMin(Vector3f min) {
		this.min.set(min);
	}
	
	public Vector3f getMin(Vector3f target) {
		return min.get(target);
	}
	
	public Vector3f getMin() {
		return getMin(new Vector3f());
	}
	
	public void setMax(Vector3f max) {
		this.max.set(max);
	}
	
	public Vector3f getMax(Vector3f target) {
		return max.get(target);
	}
	
	public Vector3f getMax() {
		return getMax(new Vector3f());
	}
	
	public void set(BoundingBox boundingBox) {
		min.set(boundingBox.getMinCorner(tmp));
		max.set(boundingBox.getMaxCorner(tmp2));
	}
	
	public BoundingBox get(BoundingBox target) {
		target.set(min.get(tmp), max.get(tmp2));
		return target;
	}
	
	public BoundingBox get() {
		return get(new BoundingBox());
	}
	
	public MemorySegment memorySegment() {
		return jphAABox;
	}
	
	public static StructLayout LAYOUT() {
		return LAYOUT;
	}
	
}
