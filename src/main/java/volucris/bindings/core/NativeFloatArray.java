package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class NativeFloatArray {

	private final MemorySegment segment;

	public NativeFloatArray(Arena arena, float... values) {
		segment = arena.allocateFrom(ValueLayout.JAVA_FLOAT, values);
	}

	public NativeFloatArray(Arena arena, int count) {
		segment = arena.allocate(ValueLayout.JAVA_FLOAT, count);
	}

	public NativeFloatArray(MemorySegment segment) {
		this.segment = segment;
	}

	public float get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_FLOAT, index);
	}

	public NativeFloatArray set(int index, float value) {
		segment.setAtIndex(ValueLayout.JAVA_FLOAT, index, value);
		return this;
	}

	public NativeFloatArray set(int dstIndex, int srcIndex, int count, NativeFloatArray values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeFloatArray fill(int index, int count, float value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}
	
	public NativeFloatArray set(int dstIndex, int srcIndex, int count, float... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_FLOAT.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_FLOAT, dstOffset, count);
		return this;
	}

	public float[] get(int dstIndex, int srcIndex, int count, float[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_FLOAT.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_FLOAT, srcOffset, target, dstIndex, count);
		return target;
	}

	public float[] toArray() {
		return segment.toArray(ValueLayout.JAVA_FLOAT);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
