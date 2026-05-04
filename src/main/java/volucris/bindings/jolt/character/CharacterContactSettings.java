/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class CharacterContactSettings
		implements Struct<CharacterContactSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CAN_PUSH_CHARACTER;
    public static final VarHandle CAN_RECEIVE_IMPULSES;

    public static final long CAN_PUSH_CHARACTER_OFFSET;
    public static final long CAN_RECEIVE_IMPULSES_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BOOLEAN.withName("canPushCharacter"),
            JAVA_BOOLEAN.withName("canReceiveImpulses")
        ).withName("JPH_CharacterContactSettings").withByteAlignment(1);
        
        CAN_PUSH_CHARACTER = LAYOUT.varHandle(PathElement.groupElement("canPushCharacter"));
        CAN_RECEIVE_IMPULSES = LAYOUT.varHandle(PathElement.groupElement("canReceiveImpulses"));
        
        CAN_PUSH_CHARACTER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("canPushCharacter"));
        CAN_RECEIVE_IMPULSES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("canReceiveImpulses"));
        //@formatter:on
    }

    public CharacterContactSettings() {
        this(Arena.ofAuto());
    }
    
    public CharacterContactSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CharacterContactSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public CharacterContactSettings canPushCharacter(boolean canPushCharacter) {
        CAN_PUSH_CHARACTER.set(segment, 0L, canPushCharacter);
        return this;
    }
    
    public boolean canPushCharacter() {
        return (boolean) CAN_PUSH_CHARACTER.get(segment, 0L);
    }
    
    public CharacterContactSettings canReceiveImpulses(boolean canReceiveImpulses) {
        CAN_RECEIVE_IMPULSES.set(segment, 0L, canReceiveImpulses);
        return this;
    }
    
    public boolean canReceiveImpulses() {
        return (boolean) CAN_RECEIVE_IMPULSES.get(segment, 0L);
    }
    
    @Override
    public CharacterContactSettings set(CharacterContactSettings other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterContactSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterContactSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterContactSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterContactSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterContactSettings> array(Arena arena, CharacterContactSettings... structs) {
        NativeStructArray<CharacterContactSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterContactSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterContactSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterContactSettings(segment)
        );
    }
    
}