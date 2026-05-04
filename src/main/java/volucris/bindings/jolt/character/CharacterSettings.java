/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CharacterSettings
		implements Struct<CharacterSettings> {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle LAYER;
    public static final VarHandle MASS;
    public static final VarHandle FRICTION;
    public static final VarHandle GRAVITY_FACTOR;
    public static final VarHandle ALLOWED_DOFS;

    public static final long BASE_OFFSET;
    public static final long LAYER_OFFSET;
    public static final long MASS_OFFSET;
    public static final long FRICTION_OFFSET;
    public static final long GRAVITY_FACTOR_OFFSET;
    public static final long ALLOWED_DOFS_OFFSET;

    private final MemorySegment segment;

    private final CharacterBaseSettings base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            CharacterBaseSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("layer"),
            JAVA_FLOAT.withName("mass"),
            JAVA_FLOAT.withName("friction"),
            JAVA_FLOAT.withName("gravityFactor"),
            JAVA_INT.withName("allowedDOFs"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_CharacterSettings").withByteAlignment(8);
        
        JPH_CHARACTER_SETTINGS_INIT = downcallHandleVoid("JPH_CharacterSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYER = LAYOUT.varHandle(PathElement.groupElement("layer"));
        MASS = LAYOUT.varHandle(PathElement.groupElement("mass"));
        FRICTION = LAYOUT.varHandle(PathElement.groupElement("friction"));
        GRAVITY_FACTOR = LAYOUT.varHandle(PathElement.groupElement("gravityFactor"));
        ALLOWED_DOFS = LAYOUT.varHandle(PathElement.groupElement("allowedDOFs"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        LAYER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layer"));
        MASS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mass"));
        FRICTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("friction"));
        GRAVITY_FACTOR_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gravityFactor"));
        ALLOWED_DOFS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowedDOFs"));
        //@formatter:on
    }

    public CharacterSettings() {
        this(Arena.ofAuto());
    }
    
    public CharacterSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CharacterSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new CharacterBaseSettings(segment.asSlice(BASE_OFFSET, CharacterBaseSettings.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CHARACTER_SETTINGS_INIT.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #init}.
     */
    public final void init(
    ) {
        init(
            this.segment
        );
    }
    
    public CharacterSettings layer(int layer) {
        LAYER.set(segment, 0L, layer);
        return this;
    }
    
    public int layer() {
        return (int) LAYER.get(segment, 0L);
    }
    
    public CharacterSettings mass(float mass) {
        MASS.set(segment, 0L, mass);
        return this;
    }
    
    public float mass() {
        return (float) MASS.get(segment, 0L);
    }
    
    public CharacterSettings friction(float friction) {
        FRICTION.set(segment, 0L, friction);
        return this;
    }
    
    public float friction() {
        return (float) FRICTION.get(segment, 0L);
    }
    
    public CharacterSettings gravityFactor(float gravityFactor) {
        GRAVITY_FACTOR.set(segment, 0L, gravityFactor);
        return this;
    }
    
    public float gravityFactor() {
        return (float) GRAVITY_FACTOR.get(segment, 0L);
    }
    
    public CharacterSettings allowedDOFs(int allowedDOFs) {
        ALLOWED_DOFS.set(segment, 0L, allowedDOFs);
        return this;
    }
    
    public int allowedDOFs() {
        return (int) ALLOWED_DOFS.get(segment, 0L);
    }
    
    public CharacterSettings base(Consumer<CharacterBaseSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public CharacterSettings base(CharacterBaseSettings other) {
        base.set(other);
        return this;
    }
    
    public CharacterBaseSettings base() {
        return base;
    }
    
    @Override
    public CharacterSettings set(CharacterSettings other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterSettings> array(Arena arena, CharacterSettings... structs) {
        NativeStructArray<CharacterSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CharacterSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterSettings(segment)
        );
    }
    
}