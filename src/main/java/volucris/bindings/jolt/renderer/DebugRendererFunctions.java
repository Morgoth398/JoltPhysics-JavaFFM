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

public class DebugRendererFunctions
		implements Struct<DebugRendererFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DRAW_LINE_HANDLE;
	public static final VarHandle DRAW_TRIANGLE_HANDLE;
	public static final VarHandle CREATE_TRIANGLE_BATCH_HANDLE;
	public static final VarHandle CREATE_TRIANGLE_BATCH1_HANDLE;
	public static final VarHandle DRAW_GEOMETRY_HANDLE;
	public static final VarHandle DRAW_TEXT3_D_HANDLE;

	public static final long DRAW_LINE_BYTE_OFFSET;
	public static final long DRAW_TRIANGLE_BYTE_OFFSET;
	public static final long CREATE_TRIANGLE_BATCH_BYTE_OFFSET;
	public static final long CREATE_TRIANGLE_BATCH1_BYTE_OFFSET;
	public static final long DRAW_GEOMETRY_BYTE_OFFSET;
	public static final long DRAW_TEXT3_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("DrawLine"),
		    UNBOUNDED_ADDRESS.withName("DrawTriangle"),
		    UNBOUNDED_ADDRESS.withName("CreateTriangleBatch"),
		    UNBOUNDED_ADDRESS.withName("CreateTriangleBatch1"),
		    UNBOUNDED_ADDRESS.withName("DrawGeometry"),
		    UNBOUNDED_ADDRESS.withName("DrawText3D")
		).withName("JPH_DebugRendererFunctions").withByteAlignment(8);
		
		DRAW_LINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawLine"));
		DRAW_TRIANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawTriangle"));
		CREATE_TRIANGLE_BATCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CreateTriangleBatch"));
		CREATE_TRIANGLE_BATCH1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CreateTriangleBatch1"));
		DRAW_GEOMETRY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawGeometry"));
		DRAW_TEXT3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DrawText3D"));
		
		DRAW_LINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawLine"));
		DRAW_TRIANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawTriangle"));
		CREATE_TRIANGLE_BATCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CreateTriangleBatch"));
		CREATE_TRIANGLE_BATCH1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CreateTriangleBatch1"));
		DRAW_GEOMETRY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawGeometry"));
		DRAW_TEXT3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DrawText3D"));
		//@formatter:on
	}

	public DebugRendererFunctions() {
	    this(Arena.ofAuto());
	}
	
	public DebugRendererFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public DebugRendererFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #drawLine()
    public DebugRendererFunctions drawLine(DrawLineFunction drawLine) {
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
    
    /// @see #drawTriangle()
    public DebugRendererFunctions drawTriangle(DrawTriangleFunction drawTriangle) {
    	DRAW_TRIANGLE_HANDLE.set(segment, 0L, drawTriangle.memorySegment());
    	return this;
    }
    
    /// ```
    /// Draw a single back face culled triangle
    /// ```
    public @Nullable DrawTriangleFunction drawTriangle() {
    	MemorySegment segment = (MemorySegment) DRAW_TRIANGLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DrawTriangleFunction.get(segment);
    }
    
    /// @see #createTriangleBatch()
    public DebugRendererFunctions createTriangleBatch(CreateTriangleBatchFunction createTriangleBatch) {
    	CREATE_TRIANGLE_BATCH_HANDLE.set(segment, 0L, createTriangleBatch.memorySegment());
    	return this;
    }
    
    /// ```
    /// Create a batch of triangles that can be drawn efficiently
    /// ```
    public @Nullable CreateTriangleBatchFunction createTriangleBatch() {
    	MemorySegment segment = (MemorySegment) CREATE_TRIANGLE_BATCH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateTriangleBatchFunction.get(segment);
    }
    
    /// @see #createTriangleBatch1()
    public DebugRendererFunctions createTriangleBatch1(CreateTriangleBatchFunction1 createTriangleBatch1) {
    	CREATE_TRIANGLE_BATCH1_HANDLE.set(segment, 0L, createTriangleBatch1.memorySegment());
    	return this;
    }
    
    public @Nullable CreateTriangleBatchFunction1 createTriangleBatch1() {
    	MemorySegment segment = (MemorySegment) CREATE_TRIANGLE_BATCH1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateTriangleBatchFunction1.get(segment);
    }
    
    /// @see #drawGeometry()
    public DebugRendererFunctions drawGeometry(DrawGeometryFunction drawGeometry) {
    	DRAW_GEOMETRY_HANDLE.set(segment, 0L, drawGeometry.memorySegment());
    	return this;
    }
    
    /// ```
    /// Draw some geometry
    /// @param inModelMatrix is the matrix that transforms the geometry to world space.
    /// @param inWorldSpaceBounds is the bounding box of the geometry after transforming it into world space.
    /// @param inLODScaleSq is the squared scale of the model matrix, it is multiplied with the LOD distances in inGeometry to calculate the real LOD distance (so a number > 1 will force a higher LOD).
    /// @param inModelColor is the color with which to multiply the vertex colors in inGeometry.
    /// @param inGeometry The geometry to draw.
    /// @param inCullMode determines which polygons are culled.
    /// @param inCastShadow determines if this geometry should cast a shadow or not.
    /// @param inDrawMode determines if we draw the geometry solid or in wireframe.
    /// ```
    public @Nullable DrawGeometryFunction drawGeometry() {
    	MemorySegment segment = (MemorySegment) DRAW_GEOMETRY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DrawGeometryFunction.get(segment);
    }
    
    /// @see #drawText3D()
    public DebugRendererFunctions drawText3D(DrawText3DFunction drawText3D) {
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
    public DebugRendererFunctions set(DebugRendererFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public DebugRendererFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DebugRendererFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DebugRendererFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new DebugRendererFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<DebugRendererFunctions> array(SegmentAllocator allocator, DebugRendererFunctions... structs) {
        NativeStructArray<DebugRendererFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new DebugRendererFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DebugRendererFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DebugRendererFunctions(segment)
        );
    }

}