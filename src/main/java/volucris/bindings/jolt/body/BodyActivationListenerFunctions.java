/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

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

public final class BodyActivationListenerFunctions
		implements Struct<BodyActivationListenerFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_BODY_ACTIVATED_HANDLE;
	public static final VarHandle ON_BODY_DEACTIVATED_HANDLE;

	public static final long ON_BODY_ACTIVATED_BYTE_OFFSET;
	public static final long ON_BODY_DEACTIVATED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("OnBodyActivated"),
		    UNBOUNDED_ADDRESS.withName("OnBodyDeactivated")
		).withName("JPH_BodyActivationListenerFunctions").withByteAlignment(8);
		
		ON_BODY_ACTIVATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnBodyActivated"));
		ON_BODY_DEACTIVATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnBodyDeactivated"));
		
		ON_BODY_ACTIVATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnBodyActivated"));
		ON_BODY_DEACTIVATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnBodyDeactivated"));
		//@formatter:on
	}

	public BodyActivationListenerFunctions() {
	    this(Arena.ofAuto());
	}
	
	public BodyActivationListenerFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public BodyActivationListenerFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onBodyActivated()
    public BodyActivationListenerFunctions onBodyActivated(OnBodyActivatedFunction onBodyActivated) {
    	ON_BODY_ACTIVATED_HANDLE.set(segment, 0L, onBodyActivated.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a body activates, note this can be called from any thread so make sure your code is thread safe.
    /// At the time of the callback the body inBodyID will be locked and no bodies can be written/activated/deactivated from the callback.
    /// ```
    public @Nullable OnBodyActivatedFunction onBodyActivated() {
    	MemorySegment segment = (MemorySegment) ON_BODY_ACTIVATED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnBodyActivatedFunction.get(segment);
    }
    
    /// @see #onBodyDeactivated()
    public BodyActivationListenerFunctions onBodyDeactivated(OnBodyDeactivatedFunction onBodyDeactivated) {
    	ON_BODY_DEACTIVATED_HANDLE.set(segment, 0L, onBodyDeactivated.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a body deactivates, note this can be called from any thread so make sure your code is thread safe.
    /// At the time of the callback the body inBodyID will be locked and no bodies can be written/activated/deactivated from the callback.
    /// ```
    public @Nullable OnBodyDeactivatedFunction onBodyDeactivated() {
    	MemorySegment segment = (MemorySegment) ON_BODY_DEACTIVATED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnBodyDeactivatedFunction.get(segment);
    }
    
    @Override
    public BodyActivationListenerFunctions set(BodyActivationListenerFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public BodyActivationListenerFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyActivationListenerFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyActivationListenerFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyActivationListenerFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyActivationListenerFunctions> array(SegmentAllocator allocator, BodyActivationListenerFunctions... structs) {
        NativeStructArray<BodyActivationListenerFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyActivationListenerFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyActivationListenerFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyActivationListenerFunctions(segment)
        );
    }

}