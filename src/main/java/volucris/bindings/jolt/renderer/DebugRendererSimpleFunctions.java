/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

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

public class DebugRendererSimpleFunctions
		implements Struct<DebugRendererSimpleFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DRAW_LINE_HANDLE;
	public static final VarHandle DRAW_TEXT3_D_HANDLE;

	public static final long DRAW_LINE_BYTE_OFFSET;
	public static final long DRAW_TEXT3_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("DrawLine"),
		    UNBOUNDED_ADDRESS.withName("DrawText3D")
		).withName("JPH_DebugRendererSimpleFunctions").withByteAlignment(8);
		
		DRAW_LINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawLine"));
		DRAW_TEXT3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawText3D"));
		
		DRAW_LINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawLine"));
		DRAW_TEXT3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawText3D"));
		//@formatter:on
	}

	public DebugRendererSimpleFunctions() {
	    this(Arena.ofAuto());
	}
	
	public DebugRendererSimpleFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public DebugRendererSimpleFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #drawLine()
    public DebugRendererSimpleFunctions drawLine(DrawLineFunction drawLine) {
    	DRAW_LINE_HANDLE.set(segment, 0L, drawLine.memorySegment());
    	return this;
    }
    
    /// ```
    /// Draw line
    /// ```
    public @Nullable DrawLineFunction drawLine() {
    	MemorySegment segment = (MemorySegment) DRAW_LINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DrawLineFunction.get(segment);
    }
    
    /// @see #drawText3D()
    public DebugRendererSimpleFunctions drawText3D(DrawText3DFunction drawText3D) {
    	DRAW_TEXT3_D_HANDLE.set(segment, 0L, drawText3D.memorySegment());
    	return this;
    }
    
    /// ```
    /// Draw text
    /// ```
    public @Nullable DrawText3DFunction drawText3D() {
    	MemorySegment segment = (MemorySegment) DRAW_TEXT3_D_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DrawText3DFunction.get(segment);
    }
    
    @Override
    public DebugRendererSimpleFunctions set(DebugRendererSimpleFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public DebugRendererSimpleFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DebugRendererSimpleFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DebugRendererSimpleFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new DebugRendererSimpleFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<DebugRendererSimpleFunctions> array(SegmentAllocator allocator, DebugRendererSimpleFunctions... structs) {
        NativeStructArray<DebugRendererSimpleFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new DebugRendererSimpleFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DebugRendererSimpleFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DebugRendererSimpleFunctions(segment)
        );
    }

}