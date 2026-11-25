/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

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

public final class CharacterVsCharacterCollisionFunctions
		implements Struct<CharacterVsCharacterCollisionFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COLLIDE_CHARACTER_HANDLE;
	public static final VarHandle CAST_CHARACTER_HANDLE;

	public static final long COLLIDE_CHARACTER_BYTE_OFFSET;
	public static final long CAST_CHARACTER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("CollideCharacter"),
		    UNBOUNDED_ADDRESS.withName("CastCharacter")
		).withName("JPH_CharacterVsCharacterCollisionFunctions").withByteAlignment(8);
		
		COLLIDE_CHARACTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CollideCharacter"));
		CAST_CHARACTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CastCharacter"));
		
		COLLIDE_CHARACTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CollideCharacter"));
		CAST_CHARACTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CastCharacter"));
		//@formatter:on
	}

	public CharacterVsCharacterCollisionFunctions() {
	    this(Arena.ofAuto());
	}
	
	public CharacterVsCharacterCollisionFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CharacterVsCharacterCollisionFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #collideCharacter()
    public CharacterVsCharacterCollisionFunctions collideCharacter(CollideCharacterFunction collideCharacter) {
    	COLLIDE_CHARACTER_HANDLE.set(segment, 0L, collideCharacter.memorySegment());
    	return this;
    }
    
    /// ```
    /// Collide a character against other CharacterVirtuals.
    /// @param inCharacter The character to collide.
    /// @param inCenterOfMassTransform Center of mass transform for this character.
    /// @param inCollideShapeSettings Settings for the collision check.
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
    /// @param ioCollector Collision collector that receives the collision results.
    /// ```
    public @Nullable CollideCharacterFunction collideCharacter() {
    	MemorySegment segment = (MemorySegment) COLLIDE_CHARACTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CollideCharacterFunction.get(segment);
    }
    
    /// @see #castCharacter()
    public CharacterVsCharacterCollisionFunctions castCharacter(CastCharacterFunction castCharacter) {
    	CAST_CHARACTER_HANDLE.set(segment, 0L, castCharacter.memorySegment());
    	return this;
    }
    
    /// ```
    /// Cast a character against other CharacterVirtuals.
    /// @param inCharacter The character to cast.
    /// @param inCenterOfMassTransform Center of mass transform for this character.
    /// @param inDirection Direction and length to cast in.
    /// @param inShapeCastSettings Settings for the shape cast.
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
    /// @param ioCollector Collision collector that receives the collision results.
    /// ```
    public @Nullable CastCharacterFunction castCharacter() {
    	MemorySegment segment = (MemorySegment) CAST_CHARACTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CastCharacterFunction.get(segment);
    }
    
    @Override
    public CharacterVsCharacterCollisionFunctions set(CharacterVsCharacterCollisionFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterVsCharacterCollisionFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterVsCharacterCollisionFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterVsCharacterCollisionFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new CharacterVsCharacterCollisionFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterVsCharacterCollisionFunctions> array(SegmentAllocator allocator, CharacterVsCharacterCollisionFunctions... structs) {
        NativeStructArray<CharacterVsCharacterCollisionFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new CharacterVsCharacterCollisionFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterVsCharacterCollisionFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterVsCharacterCollisionFunctions(segment)
        );
    }

}