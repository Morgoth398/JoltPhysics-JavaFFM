/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ObjectVsBroadPhaseLayerFilterFunctions
		implements Struct<ObjectVsBroadPhaseLayerFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_COLLIDE_HANDLE;

	public static final long SHOULD_COLLIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldCollide")
		).withName("JPH_ObjectVsBroadPhaseLayerFilterFunctions").withByteAlignment(8);
		
		SHOULD_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide"));
		
		SHOULD_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide"));
		//@formatter:on
	}

	public ObjectVsBroadPhaseLayerFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public ObjectVsBroadPhaseLayerFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public ObjectVsBroadPhaseLayerFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldCollide()
    public ObjectVsBroadPhaseLayerFilterFunctions shouldCollide(ObjectVsBroadPhaseLayerFilterShouldCollideFunction shouldCollide) {
    	SHOULD_COLLIDE_HANDLE.set(segment, 0L, shouldCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Returns true if an object layer should collide with a broadphase layer
    /// ```
    public @Nullable ObjectVsBroadPhaseLayerFilterShouldCollideFunction shouldCollide() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ObjectVsBroadPhaseLayerFilterShouldCollideFunction.get(segment);
    }
    
    @Override
    public ObjectVsBroadPhaseLayerFilterFunctions set(ObjectVsBroadPhaseLayerFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public ObjectVsBroadPhaseLayerFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ObjectVsBroadPhaseLayerFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ObjectVsBroadPhaseLayerFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ObjectVsBroadPhaseLayerFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<ObjectVsBroadPhaseLayerFilterFunctions> array(SegmentAllocator allocator, ObjectVsBroadPhaseLayerFilterFunctions... structs) {
        NativeStructArray<ObjectVsBroadPhaseLayerFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ObjectVsBroadPhaseLayerFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ObjectVsBroadPhaseLayerFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ObjectVsBroadPhaseLayerFilterFunctions(segment)
        );
    }

}