package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class NativeLongArray {

	private final MemorySegment segment;

	public NativeLongArray(Arena arena, long... values) {
		segment = arena.allocateFrom(ValueLayout.JAVA_LONG, values);
	}

	public NativeLongArray(Arena arena, int count) {
		segment = arena.allocate(ValueLayout.JAVA_LONG, count);
	}

	public NativeLongArray(MemorySegment segment) {
		this.segment = segment;
	}

	public long get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_LONG, index);
	}

	public NativeLongArray set(int index, long value) {
		segment.setAtIndex(ValueLayout.JAVA_LONG, index, value);
		return this;
	}

	public NativeLongArray set(int dstIndex, int srcIndex, int count, NativeLongArray values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeLongArray fill(int index, int count, long value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}
	
	public NativeLongArray set(int dstIndex, int srcIndex, int count, long... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_LONG.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_LONG, dstOffset, count);
		return this;
	}

	public long[] get(int dstIndex, int srcIndex, int count, long[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_LONG.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_LONG, srcOffset, target, dstIndex, count);
		return target;
	}

	public long[] toArray() {
		return segment.toArray(ValueLayout.JAVA_LONG);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
