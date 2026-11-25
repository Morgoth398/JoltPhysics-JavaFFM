/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

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

public class BroadPhaseLayerInterfaceFunctions
		implements Struct<BroadPhaseLayerInterfaceFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle GET_NUM_BROAD_PHASE_LAYERS_HANDLE;
	public static final VarHandle GET_BROAD_PHASE_LAYER_HANDLE;

	public static final long GET_NUM_BROAD_PHASE_LAYERS_BYTE_OFFSET;
	public static final long GET_BROAD_PHASE_LAYER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("GetNumBroadPhaseLayers"),
		    UNBOUNDED_ADDRESS.withName("GetBroadPhaseLayer")
		).withName("JPH_BroadPhaseLayerInterfaceFunctions").withByteAlignment(8);
		
		GET_NUM_BROAD_PHASE_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GetNumBroadPhaseLayers"));
		GET_BROAD_PHASE_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GetBroadPhaseLayer"));
		
		GET_NUM_BROAD_PHASE_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GetNumBroadPhaseLayers"));
		GET_BROAD_PHASE_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GetBroadPhaseLayer"));
		//@formatter:on
	}

	public BroadPhaseLayerInterfaceFunctions() {
	    this(Arena.ofAuto());
	}
	
	public BroadPhaseLayerInterfaceFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public BroadPhaseLayerInterfaceFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #getNumBroadPhaseLayers()
    public BroadPhaseLayerInterfaceFunctions getNumBroadPhaseLayers(GetNumBroadPhaseLayersFunction getNumBroadPhaseLayers) {
    	GET_NUM_BROAD_PHASE_LAYERS_HANDLE.set(segment, 0L, getNumBroadPhaseLayers.memorySegment());
    	return this;
    }
    
    /// ```
    /// Return the number of broadphase layers there are
    /// ```
    public @Nullable GetNumBroadPhaseLayersFunction getNumBroadPhaseLayers() {
    	MemorySegment segment = (MemorySegment) GET_NUM_BROAD_PHASE_LAYERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GetNumBroadPhaseLayersFunction.get(segment);
    }
    
    /// @see #getBroadPhaseLayer()
    public BroadPhaseLayerInterfaceFunctions getBroadPhaseLayer(GetBroadPhaseLayerFunction getBroadPhaseLayer) {
    	GET_BROAD_PHASE_LAYER_HANDLE.set(segment, 0L, getBroadPhaseLayer.memorySegment());
    	return this;
    }
    
    /// ```
    /// Convert an object layer to the corresponding broadphase layer
    /// ```
    public @Nullable GetBroadPhaseLayerFunction getBroadPhaseLayer() {
    	MemorySegment segment = (MemorySegment) GET_BROAD_PHASE_LAYER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GetBroadPhaseLayerFunction.get(segment);
    }
    
    @Override
    public BroadPhaseLayerInterfaceFunctions set(BroadPhaseLayerInterfaceFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public BroadPhaseLayerInterfaceFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BroadPhaseLayerInterfaceFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BroadPhaseLayerInterfaceFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BroadPhaseLayerInterfaceFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<BroadPhaseLayerInterfaceFunctions> array(SegmentAllocator allocator, BroadPhaseLayerInterfaceFunctions... structs) {
        NativeStructArray<BroadPhaseLayerInterfaceFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BroadPhaseLayerInterfaceFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BroadPhaseLayerInterfaceFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BroadPhaseLayerInterfaceFunctions(segment)
        );
    }

}