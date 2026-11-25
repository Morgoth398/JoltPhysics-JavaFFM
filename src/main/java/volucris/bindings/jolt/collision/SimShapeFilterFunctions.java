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

public final class SimShapeFilterFunctions
		implements Struct<SimShapeFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_COLLIDE_HANDLE;

	public static final long SHOULD_COLLIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldCollide")
		).withName("JPH_SimShapeFilterFunctions").withByteAlignment(8);
		
		SHOULD_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide"));
		
		SHOULD_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide"));
		//@formatter:on
	}

	public SimShapeFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public SimShapeFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public SimShapeFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldCollide()
    public SimShapeFilterFunctions shouldCollide(SimShapeFilterShouldCollideFunction shouldCollide) {
    	SHOULD_COLLIDE_HANDLE.set(segment, 0L, shouldCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function to determine if two shapes should collide. Returns true if the filter passes.
    /// This overload is called during the simulation (PhysicsSystem::Update) and must be registered with PhysicsSystem::SetSimShapeFilter.
    /// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
    /// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle.
    /// Note that this function is called from multiple threads and must be thread safe. All properties are read only.
    /// @param inBody1 1st body that is colliding
    /// @param inShape1 1st shape that is colliding
    /// @param inSubShapeIDOfShape1 The sub shape ID that will lead from inBody1.GetShape() to inShape1
    /// @param inBody2 2nd body that is colliding
    /// @param inShape2 2nd shape that is colliding
    /// @param inSubShapeIDOfShape2 The sub shape ID that will lead from inBody2.GetShape() to inShape2
    /// ```
    public @Nullable SimShapeFilterShouldCollideFunction shouldCollide() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return SimShapeFilterShouldCollideFunction.get(segment);
    }
    
    @Override
    public SimShapeFilterFunctions set(SimShapeFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public SimShapeFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SimShapeFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SimShapeFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new SimShapeFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<SimShapeFilterFunctions> array(SegmentAllocator allocator, SimShapeFilterFunctions... structs) {
        NativeStructArray<SimShapeFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new SimShapeFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SimShapeFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SimShapeFilterFunctions(segment)
        );
    }

}