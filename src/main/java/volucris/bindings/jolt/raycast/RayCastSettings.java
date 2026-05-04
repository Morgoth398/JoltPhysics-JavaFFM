/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

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
public final class RayCastSettings
		implements Struct<RayCastSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BACK_FACE_MODE_TRIANGLES;
    public static final VarHandle BACK_FACE_MODE_CONVEX;
    public static final VarHandle TREAT_CONVEX_AS_SOLID;

    public static final long BACK_FACE_MODE_TRIANGLES_OFFSET;
    public static final long BACK_FACE_MODE_CONVEX_OFFSET;
    public static final long TREAT_CONVEX_AS_SOLID_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("backFaceModeTriangles"),
            JAVA_INT.withName("backFaceModeConvex"),
            JAVA_BOOLEAN.withName("treatConvexAsSolid"),
            MemoryLayout.paddingLayout(3)
        ).withName("JPH_RayCastSettings").withByteAlignment(4);
        
        BACK_FACE_MODE_TRIANGLES = LAYOUT.varHandle(PathElement.groupElement("backFaceModeTriangles"));
        BACK_FACE_MODE_CONVEX = LAYOUT.varHandle(PathElement.groupElement("backFaceModeConvex"));
        TREAT_CONVEX_AS_SOLID = LAYOUT.varHandle(PathElement.groupElement("treatConvexAsSolid"));
        
        BACK_FACE_MODE_TRIANGLES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceModeTriangles"));
        BACK_FACE_MODE_CONVEX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceModeConvex"));
        TREAT_CONVEX_AS_SOLID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("treatConvexAsSolid"));
        //@formatter:on
    }

    public RayCastSettings() {
        this(Arena.ofAuto());
    }
    
    public RayCastSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RayCastSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public RayCastSettings backFaceModeTriangles(int backFaceModeTriangles) {
        BACK_FACE_MODE_TRIANGLES.set(segment, 0L, backFaceModeTriangles);
        return this;
    }
    
    public int backFaceModeTriangles() {
        return (int) BACK_FACE_MODE_TRIANGLES.get(segment, 0L);
    }
    
    public RayCastSettings backFaceModeConvex(int backFaceModeConvex) {
        BACK_FACE_MODE_CONVEX.set(segment, 0L, backFaceModeConvex);
        return this;
    }
    
    public int backFaceModeConvex() {
        return (int) BACK_FACE_MODE_CONVEX.get(segment, 0L);
    }
    
    public RayCastSettings treatConvexAsSolid(boolean treatConvexAsSolid) {
        TREAT_CONVEX_AS_SOLID.set(segment, 0L, treatConvexAsSolid);
        return this;
    }
    
    public boolean treatConvexAsSolid() {
        return (boolean) TREAT_CONVEX_AS_SOLID.get(segment, 0L);
    }
    
    @Override
    public RayCastSettings set(RayCastSettings other) {
        return set(other.segment);
    }
    
    @Override
    public RayCastSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RayCastSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RayCastSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<RayCastSettings> array(Arena arena, RayCastSettings... structs) {
        NativeStructArray<RayCastSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RayCastSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RayCastSettings(segment)
        );
    }
    
}