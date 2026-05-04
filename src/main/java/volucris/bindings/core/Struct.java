package volucris.bindings.core;

import java.lang.foreign.MemorySegment;

public interface Struct<T extends Struct<T>> {

	public T set(T other);

	public T set(MemorySegment src);

	public MemorySegment memorySegment();

}
