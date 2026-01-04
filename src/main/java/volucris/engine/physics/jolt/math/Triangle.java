package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A simple triangle and its material. 
 */
public final class Triangle {

	private static final StructLayout LAYOUT;
	
	private static final VarHandle MATERIAL_INDEX;
	
	private static final long V1_OFFSET;
	private static final long V2_OFFSET;
	private static final long V3_OFFSET;
	
	private final MemorySegment jphTriangle;
	
	private final Vec3 v1;
	private final Vec3 v2;
	private final Vec3 v3;
	
	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				Vec3.LAYOUT().withName("v1"),
				Vec3.LAYOUT().withName("v2"),
				Vec3.LAYOUT().withName("v3"),
				JAVA_INT.withName("materialIndex")
			).withName("JPH_Triangle");
		//@formatter:on
		
		MATERIAL_INDEX = varHandle(LAYOUT, "materialIndex");
		
		V1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v1"));
		V2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v2"));
		V3_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v3"));
	}
	
	public Triangle(Arena arena) {
		jphTriangle = arena.allocate(LAYOUT);
		
		v1 = new Vec3(jphTriangle.asSlice(V1_OFFSET, Vec3.LAYOUT()));
		v2 = new Vec3(jphTriangle.asSlice(V2_OFFSET, Vec3.LAYOUT()));
		v3 = new Vec3(jphTriangle.asSlice(V3_OFFSET, Vec3.LAYOUT()));
	}
	
	public Triangle() {
		this(Arena.ofAuto());
	}
	
	public void setVertex1(float x, float y, float z) {
		v1.set(x, y, z);
	}
	
	public void setVertex1(Vector3f vertex) {
		v1.set(vertex);
	}
	
	public Vector3f getVertex1(Vector3f target) {
		return v1.get(target);
	}
	
	public Vector3f getVertex1() {
		return getVertex1(new Vector3f());
	}
	
	public void setVertex2(float x, float y, float z) {
		v2.set(x, y, z);
	}
	
	public void setVertex2(Vector3f vertex) {
		v2.set(vertex);
	}
	
	public Vector3f getVertex2(Vector3f target) {
		return v2.get(target);
	}
	
	public Vector3f getVertex2() {
		return getVertex2(new Vector3f());
	}
	
	public void setVertex3(float x, float y, float z) {
		v3.set(x, y, y);
	}
	
	public void setVertex3(Vector3f vertex) {
		v3.set(vertex);
	}
	
	public Vector3f getVertex3(Vector3f target) {
		return v3.get(target);
	}
	
	public Vector3f getVertex3() {
		return getVertex3(new Vector3f());
	}
	
	public int getMaterialIndex() {
		return (int) MATERIAL_INDEX.get(jphTriangle);
	}
	
	public void setMaterialIndex(int index) {
		MATERIAL_INDEX.set(jphTriangle, index);
	}
	
	public MemorySegment memorySegment() {
		return jphTriangle;
	}
	
	public static StructLayout LAYOUT() {
		return LAYOUT;
	}
	
}
