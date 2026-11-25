/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw some geometry
/// @param inModelMatrix is the matrix that transforms the geometry to world space.
/// @param inWorldSpaceBounds is the bounding box of the geometry after transforming it into world space.
/// @param inLODScaleSq is the squared scale of the model matrix, it is multiplied with the LOD distances in inGeometry to calculate the real LOD distance (so a number > 1 will force a higher LOD).
/// @param inModelColor is the color with which to multiply the vertex colors in inGeometry.
/// @param inGeometry The geometry to draw.
/// @param inCullMode determines which polygons are culled.
/// @param inCastShadow determines if this geometry should cast a shadow or not.
/// @param inDrawMode determines if we draw the geometry solid or in wireframe.
/// ```
public abstract class DrawGeometryFunction {

    private static final Map<Long, WeakReference<DrawGeometryFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawGeometryFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawGeometryFunction() {
        this(Arena.ofAuto());
    }

    public DrawGeometryFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inModelMatrix,
        MemorySegment inWorldSpaceBounds,
        float inLODScaleSq,
        MemorySegment inModelColor,
        MemorySegment inGeometry,
        int inCullMode,
        int inCastShadow,
        int inDrawMode
    ) {
        invoke(
            new Mat44(inModelMatrix),
            new AABox(inWorldSpaceBounds),
            inLODScaleSq,
            new Color(inModelColor),
            new GeometryRef(inGeometry),
            inCullMode,
            inCastShadow,
            inDrawMode
        );
    }

    public void invoke(
        Mat44 inModelMatrix,
        AABox inWorldSpaceBounds,
        float inLODScaleSq,
        Color inModelColor,
        GeometryRef inGeometry,
        int inCullMode,
        int inCastShadow,
        int inDrawMode
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawGeometryFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawGeometryFunction get(MemorySegment segment) {
        WeakReference<DrawGeometryFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}