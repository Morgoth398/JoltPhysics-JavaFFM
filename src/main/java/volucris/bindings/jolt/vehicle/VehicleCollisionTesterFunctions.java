/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

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

public class VehicleCollisionTesterFunctions
		implements Struct<VehicleCollisionTesterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COLLIDE_HANDLE;
	public static final VarHandle PREDICT_CONTACT_PROPERTIES_HANDLE;

	public static final long COLLIDE_BYTE_OFFSET;
	public static final long PREDICT_CONTACT_PROPERTIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("Collide"),
		    UNBOUNDED_ADDRESS.withName("PredictContactProperties")
		).withName("JPH_VehicleCollisionTesterFunctions").withByteAlignment(8);
		
		COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Collide"));
		PREDICT_CONTACT_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PredictContactProperties"));
		
		COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Collide"));
		PREDICT_CONTACT_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PredictContactProperties"));
		//@formatter:on
	}

	public VehicleCollisionTesterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public VehicleCollisionTesterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VehicleCollisionTesterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #collide()
    public VehicleCollisionTesterFunctions collide(CollideFunction collide) {
    	COLLIDE_HANDLE.set(segment, 0L, collide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Do a collision test with the world
    /// @param inPhysicsSystem The physics system that should be tested against
    /// @param inVehicleConstraint The vehicle constraint
    /// @param inWheelIndex Index of the wheel that we're testing collision for
    /// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
    /// @param inDirection Direction for the test (unit vector, world space)
    /// @param inVehicleBodyID This body should be filtered out during collision detection to avoid self collisions
    /// @param outBody Body that the wheel collided with
    /// @param outSubShapeID Sub shape ID that the wheel collided with
    /// @param outContactPosition Contact point between wheel and floor, in world space
    /// @param outContactNormal Contact normal between wheel and floor, pointing away from the floor
    /// @param outSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
    /// @return True when collision found, false if not
    /// ```
    public @Nullable CollideFunction collide() {
    	MemorySegment segment = (MemorySegment) COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CollideFunction.get(segment);
    }
    
    /// @see #predictContactProperties()
    public VehicleCollisionTesterFunctions predictContactProperties(PredictContactPropertiesFunction predictContactProperties) {
    	PREDICT_CONTACT_PROPERTIES_HANDLE.set(segment, 0L, predictContactProperties.memorySegment());
    	return this;
    }
    
    /// ```
    /// Do a cheap contact properties prediction based on the contact properties from the last collision test (provided as input parameters)
    /// @param inPhysicsSystem The physics system that should be tested against
    /// @param inVehicleConstraint The vehicle constraint
    /// @param inWheelIndex Index of the wheel that we're testing collision for
    /// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
    /// @param inDirection Direction for the test (unit vector, world space)
    /// @param inVehicleBodyID The body ID for the vehicle itself
    /// @param ioBody Body that the wheel previously collided with
    /// @param ioSubShapeID Sub shape ID that the wheel collided with during the last check
    /// @param ioContactPosition Contact point between wheel and floor during the last check, in world space
    /// @param ioContactNormal Contact normal between wheel and floor during the last check, pointing away from the floor
    /// @param ioSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
    /// ```
    public @Nullable PredictContactPropertiesFunction predictContactProperties() {
    	MemorySegment segment = (MemorySegment) PREDICT_CONTACT_PROPERTIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return PredictContactPropertiesFunction.get(segment);
    }
    
    @Override
    public VehicleCollisionTesterFunctions set(VehicleCollisionTesterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleCollisionTesterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleCollisionTesterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleCollisionTesterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VehicleCollisionTesterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleCollisionTesterFunctions> array(SegmentAllocator allocator, VehicleCollisionTesterFunctions... structs) {
        NativeStructArray<VehicleCollisionTesterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VehicleCollisionTesterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleCollisionTesterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleCollisionTesterFunctions(segment)
        );
    }

}