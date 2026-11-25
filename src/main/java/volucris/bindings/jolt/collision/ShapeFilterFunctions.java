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

public final class ShapeFilterFunctions
		implements Struct<ShapeFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_COLLIDE_HANDLE;
	public static final VarHandle SHOULD_COLLIDE1_HANDLE;

	public static final long SHOULD_COLLIDE_BYTE_OFFSET;
	public static final long SHOULD_COLLIDE1_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldCollide"),
		    UNBOUNDED_ADDRESS.withName("ShouldCollide1")
		).withName("JPH_ShapeFilterFunctions").withByteAlignment(8);
		
		SHOULD_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide"));
		SHOULD_COLLIDE1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide1"));
		
		SHOULD_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide"));
		SHOULD_COLLIDE1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide1"));
		//@formatter:on
	}

	public ShapeFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public ShapeFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public ShapeFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldCollide()
    public ShapeFilterFunctions shouldCollide(ShapeFilterShouldCollideFunction shouldCollide) {
    	SHOULD_COLLIDE_HANDLE.set(segment, 0L, shouldCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function to determine if we should collide with a shape. Returns true if the filter passes.
    /// This overload is called when the query doesn't have a source shape (e.g. ray cast / collide point)
    /// @param inShape2 Shape we're colliding against
    /// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
    /// ```
    public @Nullable ShapeFilterShouldCollideFunction shouldCollide() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShapeFilterShouldCollideFunction.get(segment);
    }
    
    /// @see #shouldCollide1()
    public ShapeFilterFunctions shouldCollide1(ShapeFilterShouldCollideFunction1 shouldCollide1) {
    	SHOULD_COLLIDE1_HANDLE.set(segment, 0L, shouldCollide1.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function to determine if two shapes should collide. Returns true if the filter passes.
    /// This overload is called when querying a shape vs a shape (e.g. collide object / cast object).
    /// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
    /// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle. You can filter out individual triangles in the CollisionCollector::AddHit function by their sub shape ID.
    /// @param inShape1 1st shape that is colliding
    /// @param inSubShapeIDOfShape1 The sub shape ID that will lead from the root shape to inShape1 (i.e. the shape that is used to collide or cast against shape 2)
    /// @param inShape2 2nd shape that is colliding
    /// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
    /// ```
    public @Nullable ShapeFilterShouldCollideFunction1 shouldCollide1() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShapeFilterShouldCollideFunction1.get(segment);
    }
    
    @Override
    public ShapeFilterFunctions set(ShapeFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ShapeFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeFilterFunctions> array(SegmentAllocator allocator, ShapeFilterFunctions... structs) {
        NativeStructArray<ShapeFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ShapeFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeFilterFunctions(segment)
        );
    }

}