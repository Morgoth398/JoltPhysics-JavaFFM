package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Triangle with 32-bit indices and material index.
 */
public final class IndexedTriangle {

	private static final StructLayout LAYOUT;

	private static final VarHandle INDEX_1;
	private static final VarHandle INDEX_2;
	private static final VarHandle INDEX_3;
	private static final VarHandle MATERIAL_INDEX;
	private static final VarHandle USER_DATA;

	private final MemorySegment jphIndexedTriangle;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("i1"),
		        JAVA_INT.withName("i2"),
		        JAVA_INT.withName("i3"),
		        JAVA_INT.withName("materialIndex"),
		        JAVA_INT.withName("userData")
			).withName("JPH_IndexedTriangle");
		//@formatter:on

		INDEX_1 = varHandle(LAYOUT, "i1");
		INDEX_2 = varHandle(LAYOUT, "i2");
		INDEX_3 = varHandle(LAYOUT, "i3");
		MATERIAL_INDEX = varHandle(LAYOUT, "materialIndex");
		USER_DATA = varHandle(LAYOUT, "userData");
	}

	public IndexedTriangle(Arena arena) {
		jphIndexedTriangle = arena.allocate(LAYOUT);
	}

	public IndexedTriangle() {
		jphIndexedTriangle = Arena.ofAuto().allocate(LAYOUT);
	}

	public void setIndex1(int index) {
		INDEX_1.set(jphIndexedTriangle, index);
	}

	public int getIndex1() {
		return (int) INDEX_1.get(jphIndexedTriangle);
	}

	public void setIndex2(int index) {
		INDEX_2.set(jphIndexedTriangle, index);
	}

	public int getIndex2() {
		return (int) INDEX_2.get(jphIndexedTriangle);
	}

	public void setIndex3(int index) {
		INDEX_3.set(jphIndexedTriangle, index);
	}

	public int getIndex3() {
		return (int) INDEX_3.get(jphIndexedTriangle);
	}

	public void setMaterialIndex(int index) {
		MATERIAL_INDEX.set(jphIndexedTriangle, index);
	}

	public int getMaterialIndex() {
		return (int) MATERIAL_INDEX.get(jphIndexedTriangle);
	}

	public void setUserData(int userData) {
		USER_DATA.set(jphIndexedTriangle, userData);
	}

	public int getUserData() {
		return (int) USER_DATA.get(jphIndexedTriangle);
	}

	public MemorySegment memorySegment() {
		return jphIndexedTriangle;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
