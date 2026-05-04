package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Collection;

import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

public class NativePointerArray {

	private final MemorySegment segment;

	public NativePointerArray(Arena arena, int count) {
		segment = arena.allocate(UNBOUNDED_ADDRESS, count);
	}

	public MemorySegment get(int index) {
		return segment.getAtIndex(UNBOUNDED_ADDRESS, index);
	}

	public NativePointerArray(MemorySegment segment) {
		this.segment = segment;
	}

	public NativePointerArray set(int index, MemorySegment value) {
		segment.setAtIndex(UNBOUNDED_ADDRESS, index, value);
		return this;
	}

	public NativePointerArray set(int dstIndex, int srcIndex, int count, NativePointerArray pointers) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, pointers.get(srcIndex + i));
		return this;
	}
	
	public NativePointerArray setStrings(Arena arena, int index, Collection<String> strings) {
		for (String string : strings)
			setString(arena, index++, string);
		return this;
	}
	
	public NativePointerArray setString(Arena arena, int index, String value) {
		segment.setAtIndex(UNBOUNDED_ADDRESS, index, arena.allocateFrom(value));
		return this;
	}

	public String getString(int index) {
		return segment.getAtIndex(UNBOUNDED_ADDRESS, index).getString(0);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
