package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import java.util.function.Function;

public class NativeStructArray<T extends Struct<T>> {

	private final StructLayout layout;

	private final MemorySegment segment;

	private final Function<MemorySegment, T> factory;

	private final T[] cache;

	@SuppressWarnings("unchecked")
	public NativeStructArray(Arena arena, StructLayout layout, Function<MemorySegment, T> factory, int count) {
		this.segment = arena.allocate(layout, count);
		this.layout = layout;
		this.factory = factory;

		cache = (T[]) new Struct[count];
	}

	@SuppressWarnings("unchecked")
	public NativeStructArray(MemorySegment segment, StructLayout layout, Function<MemorySegment, T> factory) {
		this.segment = segment;
		this.layout = layout;
		this.factory = factory;

		cache = (T[]) new Struct[0];
	}

	@SuppressWarnings("unchecked")
	public NativeStructArray(T element) {
		this.segment = element.memorySegment();
		this.layout = null;
		this.factory = null;

		cache = (T[]) new Struct[] { element };
	}

	public T get(int index) {
		if (cache.length <= index)
			return factory.apply(segment.asSlice(index * layout.byteSize(), layout));

		if (cache[index] == null) {
			cache[index] = factory.apply(segment.asSlice(index * layout.byteSize(), layout));
		}
		return cache[index];
	}

	public NativeStructArray<T> set(int index, T other) {
		get(index).set(other);
		return this;
	}

	public NativeStructArray<T> set(int dstIndex, int srcIndex, int count, NativeStructArray<T> values) {
		for (int i = 0; i < count; i++)
			set(dstIndex + i, values.get(srcIndex + i));
		return this;
	}
	
	public NativeStructArray<T> forElement(int index, Consumer<T> consumer) {
		consumer.accept(get(index));
		return this;
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
