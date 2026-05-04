package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class NativeIntArray {

	private final MemorySegment segment;

	public NativeIntArray(Arena arena, int... values) {
		segment = arena.allocateFrom(ValueLayout.JAVA_INT, values);
	}

	public NativeIntArray(Arena arena, int count) {
		segment = arena.allocate(ValueLayout.JAVA_INT, count);
	}

	public NativeIntArray(MemorySegment segment) {
		this.segment = segment;
	}

	public int get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_INT, index);
	}

	public NativeIntArray set(int index, int value) {
		segment.setAtIndex(ValueLayout.JAVA_INT, index, value);
		return this;
	}

	public NativeIntArray set(int dstIndex, int srcIndex, int count, NativeIntArray values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeIntArray fill(int index, int count, int value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}
	
	public NativeIntArray set(int dstIndex, int srcIndex, int count, int... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_INT.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_INT, dstOffset, count);
		return this;
	}

	public int[] get(int dstIndex, int srcIndex, int count, int[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_INT.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_INT, srcOffset, target, dstIndex, count);
		return target;
	}

	public int[] toArray() {
		return segment.toArray(ValueLayout.JAVA_INT);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
