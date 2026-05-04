package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class NativeShortArray {

	private final MemorySegment segment;

	public NativeShortArray(Arena arena, short... values) {
		segment = arena.allocateFrom(ValueLayout.JAVA_SHORT, values);
	}

	public NativeShortArray(Arena arena, int count) {
		segment = arena.allocate(ValueLayout.JAVA_SHORT, count);
	}

	public NativeShortArray(MemorySegment segment) {
		this.segment = segment;
	}

	public short get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_SHORT, index);
	}

	public NativeShortArray set(int index, short value) {
		segment.setAtIndex(ValueLayout.JAVA_SHORT, index, value);
		return this;
	}

	public NativeShortArray set(int dstIndex, int srcIndex, int count, NativeShortArray values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeShortArray fill(int index, int count, short value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}
	
	public NativeShortArray set(int dstIndex, int srcIndex, int count, short... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_SHORT.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_SHORT, dstOffset, count);
		return this;
	}

	public short[] get(int dstIndex, int srcIndex, int count, short[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_SHORT.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_SHORT, srcOffset, target, dstIndex, count);
		return target;
	}

	public short[] toArray() {
		return segment.toArray(ValueLayout.JAVA_SHORT);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
