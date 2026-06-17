package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

public class NativePointerArray {

	private final MemorySegment segment;

	public NativePointerArray(Arena arena, int count) {
		segment = arena.allocate(UNBOUNDED_ADDRESS, count);
	}

	public NativePointerArray(Arena arena, MemorySegment pointer) {
		segment = arena.allocateFrom(UNBOUNDED_ADDRESS, pointer);
	}
	
	public NativePointerArray(Arena arena, MemorySegment... pointers) {
		segment = arena.allocate(UNBOUNDED_ADDRESS, pointers.length);
		
		for (int i = 0; i < pointers.length; i++)
			set(i, pointers[i]);
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
		MemorySegment.copy(
				pointers.memorySegment(), UNBOUNDED_ADDRESS,
				srcIndex * UNBOUNDED_ADDRESS.byteSize(),
				segment, UNBOUNDED_ADDRESS,
				dstIndex * UNBOUNDED_ADDRESS.byteSize(),
				count
		);
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

	public Collection<String> getStrings(int index, int count) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			list.add(getString(index + i));
		}
		return list;
	}
	
	public String getString(int index) {
		return segment.getAtIndex(UNBOUNDED_ADDRESS, index).getString(0);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
