/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

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

public final class ShapeCastSettings
		implements Struct<ShapeCastSettings> {

    private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle BACK_FACE_MODE_TRIANGLES_HANDLE;
    public static final VarHandle BACK_FACE_MODE_CONVEX_HANDLE;
    public static final VarHandle USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_HANDLE;
    public static final VarHandle RETURN_DEEPEST_POINT_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long BACK_FACE_MODE_TRIANGLES_BYTE_OFFSET;
    public static final long BACK_FACE_MODE_CONVEX_BYTE_OFFSET;
    public static final long USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_BYTE_OFFSET;
    public static final long RETURN_DEEPEST_POINT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final CollideSettingsBase base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            CollideSettingsBase.LAYOUT.withName("base"),
            JAVA_INT.withName("backFaceModeTriangles"),
            JAVA_INT.withName("backFaceModeConvex"),
            JAVA_BOOLEAN.withName("useShrunkenShapeAndConvexRadius"),
            JAVA_BOOLEAN.withName("returnDeepestPoint"),
            MemoryLayout.paddingLayout(2)
        ).withName("JPH_ShapeCastSettings").withByteAlignment(4);
        
        JPH_SHAPE_CAST_SETTINGS_INIT = downcallHandleVoid("JPH_ShapeCastSettings_Init", UNBOUNDED_ADDRESS);
        
        BACK_FACE_MODE_TRIANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("backFaceModeTriangles"));
        BACK_FACE_MODE_CONVEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("backFaceModeConvex"));
        USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useShrunkenShapeAndConvexRadius"));
        RETURN_DEEPEST_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("returnDeepestPoint"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        BACK_FACE_MODE_TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceModeTriangles"));
        BACK_FACE_MODE_CONVEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backFaceModeConvex"));
        USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useShrunkenShapeAndConvexRadius"));
        RETURN_DEEPEST_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("returnDeepestPoint"));
        //@formatter:on
    }

    public ShapeCastSettings() {
        this(Arena.ofAuto());
    }
    
    public ShapeCastSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeCastSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new CollideSettingsBase(segment.asSlice(BASE_BYTE_OFFSET, CollideSettingsBase.LAYOUT));
    
        init();
    }

    public static void init(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_INIT.get();
    	try {
    		 method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#init].
    public final void init() {
    	init(
    		this.segment
    	);
    }
    
    /// @see #backFaceModeTriangles()
    public ShapeCastSettings backFaceModeTriangles(int backFaceModeTriangles) {
    	BACK_FACE_MODE_TRIANGLES_HANDLE.set(segment, 0L, backFaceModeTriangles);
    	return this;
    }
    
    /// ```
    /// How backfacing triangles should be treated (should we report moving from back to front for triangle based shapes, e.g. for MeshShape/HeightFieldShape?)
    /// ```
    public int backFaceModeTriangles() {
    	return (int) BACK_FACE_MODE_TRIANGLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #backFaceModeConvex()
    public ShapeCastSettings backFaceModeConvex(int backFaceModeConvex) {
    	BACK_FACE_MODE_CONVEX_HANDLE.set(segment, 0L, backFaceModeConvex);
    	return this;
    }
    
    /// ```
    /// How backfacing convex objects should be treated (should we report starting inside an object and moving out?)
    /// ```
    public int backFaceModeConvex() {
    	return (int) BACK_FACE_MODE_CONVEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #useShrunkenShapeAndConvexRadius()
    public ShapeCastSettings useShrunkenShapeAndConvexRadius(boolean useShrunkenShapeAndConvexRadius) {
    	USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_HANDLE.set(segment, 0L, useShrunkenShapeAndConvexRadius);
    	return this;
    }
    
    /// ```
    /// Indicates if we want to shrink the shape by the convex radius and then expand it again. This speeds up collision detection and gives a more accurate normal at the cost of a more 'rounded' shape.
    /// ```
    public boolean useShrunkenShapeAndConvexRadius() {
    	return (boolean) USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #returnDeepestPoint()
    public ShapeCastSettings returnDeepestPoint(boolean returnDeepestPoint) {
    	RETURN_DEEPEST_POINT_HANDLE.set(segment, 0L, returnDeepestPoint);
    	return this;
    }
    
    /// ```
    /// When true, and the shape is intersecting at the beginning of the cast (fraction = 0) then this will calculate the deepest penetration point (costing additional CPU time)
    /// ```
    public boolean returnDeepestPoint() {
    	return (boolean) RETURN_DEEPEST_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public ShapeCastSettings base(Consumer<CollideSettingsBase> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public ShapeCastSettings base(CollideSettingsBase other) {
    	base.set(other);
    	return this;
    }
    
    public CollideSettingsBase base() {
    	return base;
    }
    
    @Override
    public ShapeCastSettings set(ShapeCastSettings other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeCastSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeCastSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeCastSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeCastSettings> array(Arena arena, ShapeCastSettings... structs) {
        NativeStructArray<ShapeCastSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeCastSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeCastSettings(segment)
        );
    }
    
}