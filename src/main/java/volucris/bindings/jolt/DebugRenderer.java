/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import volucris.bindings.jolt.math.AABox;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class DebugRenderer {

    private static final HashMap<Long, WeakReference<DebugRenderer>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor DRAW_LINE_DESCRIPTION;
    public static final MethodHandle DRAW_LINE_HANDLE;
    public static final FunctionDescriptor DRAW_TRIANGLE_DESCRIPTION;
    public static final MethodHandle DRAW_TRIANGLE_HANDLE;
    public static final FunctionDescriptor DRAW_TEXT3_D_DESCRIPTION;
    public static final MethodHandle DRAW_TEXT3_D_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment DRAW_LINE_ADDRESS;
    private static final MemorySegment DRAW_TRIANGLE_ADDRESS;
    private static final MemorySegment DRAW_TEXT3_D_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_NEXT_FRAME;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_SET_CAMERA_POS;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_BOX;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_MARKER;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_ARROW;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_PLANE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_BOX;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_BOX2;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SPHERE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_CAPSULE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_CYLINDER;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_OPEN_CONE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_PIE;
    private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("drawLine"), 
            UNBOUNDED_ADDRESS.withName("drawTriangle"), 
            UNBOUNDED_ADDRESS.withName("drawText3D")
        ).withName("JPH_DebugRenderer_Procs").withByteAlignment(8);

        JPH_DEBUG_RENDERER_SET_PROCS = downcallHandleVoid("JPH_DebugRenderer_SetProcs", UNBOUNDED_ADDRESS);
        JPH_DEBUG_RENDERER_CREATE = downcallHandle("JPH_DebugRenderer_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DEBUG_RENDERER_DESTROY = downcallHandleVoid("JPH_DebugRenderer_Destroy", UNBOUNDED_ADDRESS);
        JPH_DEBUG_RENDERER_NEXT_FRAME = downcallHandleVoid("JPH_DebugRenderer_NextFrame", UNBOUNDED_ADDRESS);
        JPH_DEBUG_RENDERER_SET_CAMERA_POS = downcallHandleVoid("JPH_DebugRenderer_SetCameraPos", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DEBUG_RENDERER_DRAW_WIRE_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2 = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_MARKER = downcallHandleVoid("JPH_DebugRenderer_DrawMarker", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_DEBUG_RENDERER_DRAW_ARROW = downcallHandleVoid("JPH_DebugRenderer_DrawArrow", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM = downcallHandleVoid("JPH_DebugRenderer_DrawCoordinateSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_DEBUG_RENDERER_DRAW_PLANE = downcallHandleVoid("JPH_DebugRenderer_DrawPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE = downcallHandleVoid("JPH_DebugRenderer_DrawWireTriangle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireUnitSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_BOX2 = downcallHandleVoid("JPH_DebugRenderer_DrawBox2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawUnitSphere", UNBOUNDED_ADDRESS, Mat4.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_CAPSULE = downcallHandleVoid("JPH_DebugRenderer_DrawCapsule", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawCylinder", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_OPEN_CONE = downcallHandleVoid("JPH_DebugRenderer_DrawOpenCone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingConeLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingPyramidLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_PIE = downcallHandleVoid("JPH_DebugRenderer_DrawPie", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawTaperedCylinder", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            DRAW_LINE_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT
            );

            DRAW_LINE_HANDLE = lookup.findStatic(DebugRenderer.class, "drawLine", DRAW_LINE_DESCRIPTION.toMethodType());

            DRAW_LINE_ADDRESS = linker.upcallStub(DRAW_LINE_HANDLE, DRAW_LINE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("drawLine")), DRAW_LINE_ADDRESS);
            
            DRAW_TRIANGLE_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT
            );

            DRAW_TRIANGLE_HANDLE = lookup.findStatic(DebugRenderer.class, "drawTriangle", DRAW_TRIANGLE_DESCRIPTION.toMethodType());

            DRAW_TRIANGLE_ADDRESS = linker.upcallStub(DRAW_TRIANGLE_HANDLE, DRAW_TRIANGLE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("drawTriangle")), DRAW_TRIANGLE_ADDRESS);
            
            DRAW_TEXT3_D_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_FLOAT
            );

            DRAW_TEXT3_D_HANDLE = lookup.findStatic(DebugRenderer.class, "drawText3D", DRAW_TEXT3_D_DESCRIPTION.toMethodType());

            DRAW_TEXT3_D_ADDRESS = linker.upcallStub(DRAW_TEXT3_D_HANDLE, DRAW_TEXT3_D_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("drawText3D")), DRAW_TEXT3_D_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public DebugRenderer() {
        this(Arena.ofAuto());
    }

    public DebugRenderer(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_SET_PROCS.get();
        try {
            method.invokeExact(
                procs
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create(
        MemorySegment userData
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment renderer
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DESTROY.get();
        try {
            method.invokeExact(
                renderer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void nextFrame(
        MemorySegment renderer
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_NEXT_FRAME.get();
        try {
            method.invokeExact(
                renderer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #nextFrame}.
     */
    public final void nextFrame(
    ) {
        nextFrame(
            this.segment
        );
    }
    
    public static void setCameraPos(
        MemorySegment renderer, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_SET_CAMERA_POS.get();
        try {
            method.invokeExact(
                renderer, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCameraPos}.
     */
    public final void setCameraPos(
        Vec3 position
    ) {
        setCameraPos(
            this.segment, 
            position.memorySegment()
        );
    }
    
    public static void drawWireBox(
        MemorySegment renderer, 
        MemorySegment box, 
        int color
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX.get();
        try {
            method.invokeExact(
                renderer, 
                box, 
                color
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawWireBox}.
     */
    public final void drawWireBox(
        AABox box, 
        int color
    ) {
        drawWireBox(
            this.segment, 
            box.memorySegment(), 
            color
        );
    }
    
    public static void drawWireBox2(
        MemorySegment renderer, 
        MemorySegment matrix, 
        MemorySegment box, 
        int color
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                box, 
                color
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawWireBox2}.
     */
    public final void drawWireBox2(
        Mat4 matrix, 
        AABox box, 
        int color
    ) {
        drawWireBox2(
            this.segment, 
            matrix.memorySegment(), 
            box.memorySegment(), 
            color
        );
    }
    
    public static void drawMarker(
        MemorySegment renderer, 
        MemorySegment position, 
        int color, 
        float size
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_MARKER.get();
        try {
            method.invokeExact(
                renderer, 
                position, 
                color, 
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawMarker}.
     */
    public final void drawMarker(
        Vec3 position, 
        int color, 
        float size
    ) {
        drawMarker(
            this.segment, 
            position.memorySegment(), 
            color, 
            size
        );
    }
    
    public static void drawArrow(
        MemorySegment renderer, 
        MemorySegment from, 
        MemorySegment to, 
        int color, 
        float size
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_ARROW.get();
        try {
            method.invokeExact(
                renderer, 
                from, 
                to, 
                color, 
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawArrow}.
     */
    public final void drawArrow(
        Vec3 from, 
        Vec3 to, 
        int color, 
        float size
    ) {
        drawArrow(
            this.segment, 
            from.memorySegment(), 
            to.memorySegment(), 
            color, 
            size
        );
    }
    
    public static void drawCoordinateSystem(
        MemorySegment renderer, 
        MemorySegment matrix, 
        float size
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawCoordinateSystem}.
     */
    public final void drawCoordinateSystem(
        Mat4 matrix, 
        float size
    ) {
        drawCoordinateSystem(
            this.segment, 
            matrix.memorySegment(), 
            size
        );
    }
    
    public static void drawPlane(
        MemorySegment renderer, 
        MemorySegment point, 
        MemorySegment normal, 
        int color, 
        float size
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PLANE.get();
        try {
            method.invokeExact(
                renderer, 
                point, 
                normal, 
                color, 
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawPlane}.
     */
    public final void drawPlane(
        Vec3 point, 
        Vec3 normal, 
        int color, 
        float size
    ) {
        drawPlane(
            this.segment, 
            point.memorySegment(), 
            normal.memorySegment(), 
            color, 
            size
        );
    }
    
    public static void drawWireTriangle(
        MemorySegment renderer, 
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment v3, 
        int color
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE.get();
        try {
            method.invokeExact(
                renderer, 
                v1, 
                v2, 
                v3, 
                color
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawWireTriangle}.
     */
    public final void drawWireTriangle(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 v3, 
        int color
    ) {
        drawWireTriangle(
            this.segment, 
            v1.memorySegment(), 
            v2.memorySegment(), 
            v3.memorySegment(), 
            color
        );
    }
    
    public static void drawWireSphere(
        MemorySegment renderer, 
        MemorySegment center, 
        float radius, 
        int color, 
        int level
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE.get();
        try {
            method.invokeExact(
                renderer, 
                center, 
                radius, 
                color, 
                level
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawWireSphere}.
     */
    public final void drawWireSphere(
        Vec3 center, 
        float radius, 
        int color, 
        int level
    ) {
        drawWireSphere(
            this.segment, 
            center.memorySegment(), 
            radius, 
            color, 
            level
        );
    }
    
    public static void drawWireUnitSphere(
        MemorySegment renderer, 
        MemorySegment matrix, 
        int color, 
        int level
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                color, 
                level
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawWireUnitSphere}.
     */
    public final void drawWireUnitSphere(
        Mat4 matrix, 
        int color, 
        int level
    ) {
        drawWireUnitSphere(
            this.segment, 
            matrix.memorySegment(), 
            color, 
            level
        );
    }
    
    public static void drawBox(
        MemorySegment renderer, 
        MemorySegment box, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX.get();
        try {
            method.invokeExact(
                renderer, 
                box, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawBox}.
     */
    public final void drawBox(
        AABox box, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawBox(
            this.segment, 
            box.memorySegment(), 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawBox2(
        MemorySegment renderer, 
        MemorySegment matrix, 
        MemorySegment box, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX2.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                box, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawBox2}.
     */
    public final void drawBox2(
        Mat4 matrix, 
        AABox box, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawBox2(
            this.segment, 
            matrix.memorySegment(), 
            box.memorySegment(), 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawSphere(
        MemorySegment renderer, 
        MemorySegment center, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SPHERE.get();
        try {
            method.invokeExact(
                renderer, 
                center, 
                radius, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawSphere}.
     */
    public final void drawSphere(
        Vec3 center, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawSphere(
            this.segment, 
            center.memorySegment(), 
            radius, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawUnitSphere(
        MemorySegment renderer, 
        MemorySegment matrix, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawUnitSphere}.
     */
    public final void drawUnitSphere(
        Mat4 matrix, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawUnitSphere(
            this.segment, 
            matrix.memorySegment(), 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawCapsule(
        MemorySegment renderer, 
        MemorySegment matrix, 
        float halfHeightOfCylinder, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CAPSULE.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                halfHeightOfCylinder, 
                radius, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawCapsule}.
     */
    public final void drawCapsule(
        Mat4 matrix, 
        float halfHeightOfCylinder, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawCapsule(
            this.segment, 
            matrix.memorySegment(), 
            halfHeightOfCylinder, 
            radius, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawCylinder(
        MemorySegment renderer, 
        MemorySegment matrix, 
        float halfHeight, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CYLINDER.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                halfHeight, 
                radius, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawCylinder}.
     */
    public final void drawCylinder(
        Mat4 matrix, 
        float halfHeight, 
        float radius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawCylinder(
            this.segment, 
            matrix.memorySegment(), 
            halfHeight, 
            radius, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawOpenCone(
        MemorySegment renderer, 
        MemorySegment top, 
        MemorySegment axis, 
        MemorySegment perpendicular, 
        float halfAngle, 
        float length, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_OPEN_CONE.get();
        try {
            method.invokeExact(
                renderer, 
                top, 
                axis, 
                perpendicular, 
                halfAngle, 
                length, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawOpenCone}.
     */
    public final void drawOpenCone(
        Vec3 top, 
        Vec3 axis, 
        Vec3 perpendicular, 
        float halfAngle, 
        float length, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawOpenCone(
            this.segment, 
            top.memorySegment(), 
            axis.memorySegment(), 
            perpendicular.memorySegment(), 
            halfAngle, 
            length, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawSwingConeLimits(
        MemorySegment renderer, 
        MemorySegment matrix, 
        float swingYHalfAngle, 
        float swingZHalfAngle, 
        float edgeLength, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                swingYHalfAngle, 
                swingZHalfAngle, 
                edgeLength, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawSwingConeLimits}.
     */
    public final void drawSwingConeLimits(
        Mat4 matrix, 
        float swingYHalfAngle, 
        float swingZHalfAngle, 
        float edgeLength, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawSwingConeLimits(
            this.segment, 
            matrix.memorySegment(), 
            swingYHalfAngle, 
            swingZHalfAngle, 
            edgeLength, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawSwingPyramidLimits(
        MemorySegment renderer, 
        MemorySegment matrix, 
        float minSwingYAngle, 
        float maxSwingYAngle, 
        float minSwingZAngle, 
        float maxSwingZAngle, 
        float edgeLength, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS.get();
        try {
            method.invokeExact(
                renderer, 
                matrix, 
                minSwingYAngle, 
                maxSwingYAngle, 
                minSwingZAngle, 
                maxSwingZAngle, 
                edgeLength, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawSwingPyramidLimits}.
     */
    public final void drawSwingPyramidLimits(
        Mat4 matrix, 
        float minSwingYAngle, 
        float maxSwingYAngle, 
        float minSwingZAngle, 
        float maxSwingZAngle, 
        float edgeLength, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawSwingPyramidLimits(
            this.segment, 
            matrix.memorySegment(), 
            minSwingYAngle, 
            maxSwingYAngle, 
            minSwingZAngle, 
            maxSwingZAngle, 
            edgeLength, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawPie(
        MemorySegment renderer, 
        MemorySegment center, 
        float radius, 
        MemorySegment normal, 
        MemorySegment axis, 
        float minAngle, 
        float maxAngle, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PIE.get();
        try {
            method.invokeExact(
                renderer, 
                center, 
                radius, 
                normal, 
                axis, 
                minAngle, 
                maxAngle, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawPie}.
     */
    public final void drawPie(
        Vec3 center, 
        float radius, 
        Vec3 normal, 
        Vec3 axis, 
        float minAngle, 
        float maxAngle, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawPie(
            this.segment, 
            center.memorySegment(), 
            radius, 
            normal.memorySegment(), 
            axis.memorySegment(), 
            minAngle, 
            maxAngle, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public static void drawTaperedCylinder(
        MemorySegment renderer, 
        MemorySegment inMatrix, 
        float top, 
        float bottom, 
        float topRadius, 
        float bottomRadius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        MethodHandle method = JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER.get();
        try {
            method.invokeExact(
                renderer, 
                inMatrix, 
                top, 
                bottom, 
                topRadius, 
                bottomRadius, 
                color, 
                castShadow, 
                drawMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawTaperedCylinder}.
     */
    public final void drawTaperedCylinder(
        Mat4 inMatrix, 
        float top, 
        float bottom, 
        float topRadius, 
        float bottomRadius, 
        int color, 
        int castShadow, 
        int drawMode
    ) {
        drawTaperedCylinder(
            this.segment, 
            inMatrix.memorySegment(), 
            top, 
            bottom, 
            topRadius, 
            bottomRadius, 
            color, 
            castShadow, 
            drawMode
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static void drawLine(
        MemorySegment userData, 
        MemorySegment from, 
        MemorySegment to, 
        int color
    ) {
        DebugRenderer callback = CACHE.get(userData.address()).get();

        callback.drawLine(
            from, 
            to, 
            color
        );
    }

    public void drawLine(
        MemorySegment from, 
        MemorySegment to, 
        int color
    ) {
        drawLine(
            new Vec3(from), 
            new Vec3(to), 
            color
        );
    }

    public abstract void drawLine(
        Vec3 from, 
        Vec3 to, 
        int color
    );


    public static void drawTriangle(
        MemorySegment userData, 
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment v3, 
        int color, 
        int castShadow
    ) {
        DebugRenderer callback = CACHE.get(userData.address()).get();

        callback.drawTriangle(
            v1, 
            v2, 
            v3, 
            color, 
            castShadow
        );
    }

    public void drawTriangle(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment v3, 
        int color, 
        int castShadow
    ) {
        drawTriangle(
            new Vec3(v1), 
            new Vec3(v2), 
            new Vec3(v3), 
            color, 
            castShadow
        );
    }

    public abstract void drawTriangle(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 v3, 
        int color, 
        int castShadow
    );


    public static void drawText3D(
        MemorySegment userData, 
        MemorySegment position, 
        MemorySegment str, 
        int color, 
        float height
    ) {
        DebugRenderer callback = CACHE.get(userData.address()).get();

        callback.drawText3D(
            position, 
            str, 
            color, 
            height
        );
    }

    public void drawText3D(
        MemorySegment position, 
        MemorySegment str, 
        int color, 
        float height
    ) {
        drawText3D(
            new Vec3(position), 
            str.getString(0), 
            color, 
            height
        );
    }

    public abstract void drawText3D(
        Vec3 position, 
        String str, 
        int color, 
        float height
    );


}