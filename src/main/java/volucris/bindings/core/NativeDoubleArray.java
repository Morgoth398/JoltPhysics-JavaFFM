package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class NativeDoubleArray {

	private final MemorySegment segment;

	public NativeDoubleArray(Arena arena, double... values) {
		segment = arena.allocateFrom(ValueLayout.JAVA_DOUBLE, values);
	}

	public NativeDoubleArray(Arena arena, int count) {
		segment = arena.allocate(ValueLayout.JAVA_DOUBLE, count);
	}

	public NativeDoubleArray(MemorySegment segment) {
		this.segment = segment;
	}

	public double get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_DOUBLE, index);
	}

	public NativeDoubleArray set(int index, double value) {
		segment.setAtIndex(ValueLayout.JAVA_DOUBLE, index, value);
		return this;
	}

	public NativeDoubleArray set(int dstIndex, int srcIndex, int count, NativeDoubleArray values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeDoubleArray fill(int index, int count, double value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}
	
	public NativeDoubleArray set(int dstIndex, int srcIndex, int count, double... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_DOUBLE.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_DOUBLE, dstOffset, count);
		return this;
	}

	public double[] get(int dstIndex, int srcIndex, int count, double[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_DOUBLE.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_DOUBLE, srcOffset, target, dstIndex, count);
		return target;
	}

	public double[] toArray() {
		return segment.toArray(ValueLayout.JAVA_DOUBLE);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
