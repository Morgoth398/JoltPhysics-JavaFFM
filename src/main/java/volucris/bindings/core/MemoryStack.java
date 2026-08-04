package volucris.bindings.core;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySegment.Scope;

/// A thread-confined, stack-discipline memory allocator backed by a single pre-allocated [MemorySegment].
/// 
/// For every allocation a slice of the backing memory is returned. This memory is zero initialized.
/// 
/// Each thread that calls [#stackPush()] obtains its own MemoryStack instance.
/// Allocations bump a single offset downward through the backing segment.
/// There is no per-allocation bookkeeping and no individual deallocation.
/// Instead, allocations are released in bulk by popping the frame they were allocated in.
/// 
/// ```
/// try (Arena arena = MemoryStack.stackPush()) {
/// 	MemorySegment segment = arena.allocate(10);
/// 	...
/// } // All allocations made since stackPush() are released here
/// ```
/// 
/// Even if the memory is not actually freed (only a pointer is changed internally) the memory allocated
/// within a frame **must not** be used outside of this frame.
/// 
/// Frames may be nested arbitrarily up to the count specified on construction (with the default being 8).
/// Each frame must be LIFO-nested, which `try-with-resources` naturally enforces.
/// 
/// ### Thread confinement
/// A MemoryStack instance is intended to be used exclusively by the thread that owns it. 
/// This **is not enforced by the JVM** as the backing memory is allocated by an automatic arena.
/// Segments obtained from this stack must never be retained, read, or written from any thread other than
/// the one that allocated them.
/// 
/// ### Deviation from the [Arena] contract
/// For closing an arena using [#close()] the spec states:
/// ```
/// If this method completes normally, then this.scope().isAlive() == false .
/// Implementations are allowed to throw UnsupportedOperationException if an
/// explicit close operation is not supported.
/// ```
/// The memory stack does not fulfill this requirement. Calling [#close()] only pops the current frame
/// and does not invalidate the backing memory. This mirrors how the automatic arena itself is not closeable.
/// 
/// If [#close()] is called with no open frame, an [UnsupportedOperationException] is thrown.
/// 
/// ### Capacity
/// Both the byte capacity and the maximum frame nesting depth are fixed at construction and do not grow.
/// Exceeding the byte capacity throws an [OutOfMemoryError] and exceeding the frame depth throws a runtime exception.
public class MemoryStack implements Arena {

	private static final int DEFAULT_STACK_SIZE = 1024 * 1024;
	private static final int DEFAULT_STACK_FRAMES = 8;

	private static final ThreadLocal<MemoryStack> TL = ThreadLocal.withInitial(() -> {
		return new MemoryStack(DEFAULT_STACK_SIZE, DEFAULT_STACK_FRAMES);
	});

	private final Arena arena;

	private final MemorySegment memory;

	private final long[] frameMarks;

	private long pointer;

	private int frameIndex;

	/// Creates a new `MemoryStack` with the given size.
	/// 
	/// @param stackSize The maximum number of bytes that may be allocated on the stack
	/// @param stackFrames The amount of frames this stack can hold
	public MemoryStack(int stackSize, int stackFrames) {
		this.arena = Arena.ofAuto();

		this.memory = arena.allocate(stackSize);

		this.frameMarks = new long[stackFrames];

		this.pointer = memory.byteSize();
	}

	public static MemoryStack stackPush() {
		return TL.get().push();
	}

	private MemoryStack push() {
		if (frameIndex == frameMarks.length) {
			throw new RuntimeException(
					"Out of frame stack space (" + frameMarks.length + ")"
			);
		}

		frameMarks[frameIndex++] = pointer;
		return this;
	}

	private MemoryStack pop() {
		pointer = frameMarks[--frameIndex];
		return this;
	}

	@Override
	public MemorySegment allocate(long byteSize, long byteAlignment) {
		if (Long.bitCount(byteAlignment) != 1) {
			throw new IllegalArgumentException("Alignment must be a power-of-two.");
		}

		long pointer = (this.pointer - byteSize) & -byteAlignment;

		if (pointer < 0) {
			throw new OutOfMemoryError("Memory stack is out of space.");
		}

		this.pointer = pointer;

		return memory.asSlice(pointer, byteSize, byteAlignment).fill((byte) 0);
	}

	@Override
	public Scope scope() {
		return arena.scope();
	}

	@Override
	public void close() {
		if (frameIndex == 0) {
			throw new UnsupportedOperationException("The memory stack has no open frames to pop.");
		}

		pop();
	}

}