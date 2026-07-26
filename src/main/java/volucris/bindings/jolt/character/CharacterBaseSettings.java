/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Plane;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterBaseSettings
		implements Struct<CharacterBaseSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_SLOPE_ANGLE_HANDLE;
    public static final VarHandle ENHANCED_INTERNAL_EDGE_REMOVAL_HANDLE;
    public static final VarHandle SHAPE_HANDLE;

    public static final long UP_BYTE_OFFSET;
    public static final long SUPPORTING_VOLUME_BYTE_OFFSET;
    public static final long MAX_SLOPE_ANGLE_BYTE_OFFSET;
    public static final long ENHANCED_INTERNAL_EDGE_REMOVAL_BYTE_OFFSET;
    public static final long SHAPE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 up;
    private final Plane supportingVolume;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("up"),
            Plane.LAYOUT.withName("supportingVolume"),
            JAVA_FLOAT.withName("maxSlopeAngle"),
            JAVA_BOOLEAN.withName("enhancedInternalEdgeRemoval"),
            MemoryLayout.paddingLayout(7),
            UNBOUNDED_ADDRESS.withName("shape")
        ).withName("JPH_CharacterBaseSettings").withByteAlignment(8);
        
        MAX_SLOPE_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSlopeAngle"));
        ENHANCED_INTERNAL_EDGE_REMOVAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enhancedInternalEdgeRemoval"));
        SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shape"));
        
        UP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("up"));
        SUPPORTING_VOLUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportingVolume"));
        MAX_SLOPE_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSlopeAngle"));
        ENHANCED_INTERNAL_EDGE_REMOVAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enhancedInternalEdgeRemoval"));
        SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape"));
        //@formatter:on
    }

    public CharacterBaseSettings(MemorySegment segment) {
        this.segment = segment;
    
        up = new Vec3(segment.asSlice(UP_BYTE_OFFSET, Vec3.LAYOUT));
        supportingVolume = new Plane(segment.asSlice(SUPPORTING_VOLUME_BYTE_OFFSET, Plane.LAYOUT));
    }

    /// @see #maxSlopeAngle()
    public CharacterBaseSettings maxSlopeAngle(float maxSlopeAngle) {
    	MAX_SLOPE_ANGLE_HANDLE.set(segment, 0L, maxSlopeAngle);
    	return this;
    }
    
    public float maxSlopeAngle() {
    	return (float) MAX_SLOPE_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enhancedInternalEdgeRemoval()
    public CharacterBaseSettings enhancedInternalEdgeRemoval(boolean enhancedInternalEdgeRemoval) {
    	ENHANCED_INTERNAL_EDGE_REMOVAL_HANDLE.set(segment, 0L, enhancedInternalEdgeRemoval);
    	return this;
    }
    
    public boolean enhancedInternalEdgeRemoval() {
    	return (boolean) ENHANCED_INTERNAL_EDGE_REMOVAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #shape()
    public CharacterBaseSettings shape(Shape shape) {
    	SHAPE_HANDLE.set(segment, 0L, shape.memorySegment());
    	return this;
    }
    
    public @Nullable Shape shape() {
    	MemorySegment segment = (MemorySegment) SHAPE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Shape(segment);
    }
    
    /// @see #up()
    public CharacterBaseSettings up(Consumer<Vec3> consumer) {
    	consumer.accept(up);
    	return this;
    }
    
    /// @see #up()
    public CharacterBaseSettings up(Vec3 other) {
    	up.set(other);
    	return this;
    }
    
    public Vec3 up() {
    	return up;
    }
    
    /// @see #supportingVolume()
    public CharacterBaseSettings supportingVolume(Consumer<Plane> consumer) {
    	consumer.accept(supportingVolume);
    	return this;
    }
    
    /// @see #supportingVolume()
    public CharacterBaseSettings supportingVolume(Plane other) {
    	supportingVolume.set(other);
    	return this;
    }
    
    public Plane supportingVolume() {
    	return supportingVolume;
    }
    
    @Override
    public CharacterBaseSettings set(CharacterBaseSettings other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterBaseSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterBaseSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterBaseSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterBaseSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterBaseSettings> array(Arena arena, CharacterBaseSettings... structs) {
        NativeStructArray<CharacterBaseSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterBaseSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterBaseSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterBaseSettings(segment)
        );
    }
    
}