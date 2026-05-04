/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BodyLockWrite
		implements Struct<BodyLockWrite> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LOCK_INTERFACE;
    public static final VarHandle MUTEX;
    public static final VarHandle BODY;

    public static final long LOCK_INTERFACE_OFFSET;
    public static final long MUTEX_OFFSET;
    public static final long BODY_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("lockInterface"),
            UNBOUNDED_ADDRESS.withName("mutex"),
            UNBOUNDED_ADDRESS.withName("body")
        ).withName("JPH_BodyLockWrite").withByteAlignment(8);
        
        LOCK_INTERFACE = LAYOUT.varHandle(PathElement.groupElement("lockInterface"));
        MUTEX = LAYOUT.varHandle(PathElement.groupElement("mutex"));
        BODY = LAYOUT.varHandle(PathElement.groupElement("body"));
        
        LOCK_INTERFACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lockInterface"));
        MUTEX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mutex"));
        BODY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("body"));
        //@formatter:on
    }

    public BodyLockWrite() {
        this(Arena.ofAuto());
    }
    
    public BodyLockWrite(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyLockWrite(MemorySegment segment) {
        this.segment = segment;
    
    }

    public BodyLockWrite lockInterface(BodyLockInterface lockInterface) {
        LOCK_INTERFACE.set(segment, 0L, lockInterface.memorySegment());
        return this;
    }
    
    public @Nullable BodyLockInterface lockInterface() {
        MemorySegment segment = (MemorySegment) LOCK_INTERFACE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyLockInterface(segment);
    }
    
    public BodyLockWrite mutex(SharedMutex mutex) {
        MUTEX.set(segment, 0L, mutex.memorySegment());
        return this;
    }
    
    public @Nullable SharedMutex mutex() {
        MemorySegment segment = (MemorySegment) MUTEX.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new SharedMutex(segment);
    }
    
    public BodyLockWrite body(Body body) {
        BODY.set(segment, 0L, body.memorySegment());
        return this;
    }
    
    public @Nullable Body body() {
        MemorySegment segment = (MemorySegment) BODY.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    @Override
    public BodyLockWrite set(BodyLockWrite other) {
        return set(other.segment);
    }
    
    @Override
    public BodyLockWrite set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyLockWrite> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyLockWrite> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyLockWrite(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyLockWrite> array(Arena arena, BodyLockWrite... structs) {
        NativeStructArray<BodyLockWrite> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyLockWrite(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyLockWrite> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyLockWrite(segment)
        );
    }
    
}