/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

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

public final class PhysicsStepListenerFunctions
		implements Struct<PhysicsStepListenerFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_STEP_HANDLE;

	public static final long ON_STEP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("OnStep")
		).withName("JPH_PhysicsStepListenerFunctions").withByteAlignment(8);
		
		ON_STEP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnStep"));
		
		ON_STEP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnStep"));
		//@formatter:on
	}

	public PhysicsStepListenerFunctions() {
	    this(Arena.ofAuto());
	}
	
	public PhysicsStepListenerFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public PhysicsStepListenerFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onStep()
    public PhysicsStepListenerFunctions onStep(OnStepFunction onStep) {
    	ON_STEP_HANDLE.set(segment, 0L, onStep.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called before every simulation step (received inCollisionSteps times for every PhysicsSystem::Update(...) call)
    /// This is called while all body and constraint mutexes are locked. You can read/write bodies and constraints but not add/remove them.
    /// Multiple listeners can be executed in parallel and it is the responsibility of the listener to avoid race conditions.
    /// The best way to do this is to have each step listener operate on a subset of the bodies and constraints
    /// and making sure that these bodies and constraints are not touched by any other step listener.
    /// Note that this function is not called if there aren't any active bodies or when the physics system is updated with 0 delta time.
    /// ```
    public @Nullable OnStepFunction onStep() {
    	MemorySegment segment = (MemorySegment) ON_STEP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnStepFunction.get(segment);
    }
    
    @Override
    public PhysicsStepListenerFunctions set(PhysicsStepListenerFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public PhysicsStepListenerFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PhysicsStepListenerFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PhysicsStepListenerFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new PhysicsStepListenerFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<PhysicsStepListenerFunctions> array(SegmentAllocator allocator, PhysicsStepListenerFunctions... structs) {
        NativeStructArray<PhysicsStepListenerFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new PhysicsStepListenerFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PhysicsStepListenerFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PhysicsStepListenerFunctions(segment)
        );
    }

}