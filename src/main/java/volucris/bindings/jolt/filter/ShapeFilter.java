/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.filter;

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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class ShapeFilter {

    private static final HashMap<Long, WeakReference<ShapeFilter>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor SHOULD_COLLIDE_DESCRIPTION;
    public static final MethodHandle SHOULD_COLLIDE_HANDLE;
    public static final FunctionDescriptor SHOULD_COLLIDE2_DESCRIPTION;
    public static final MethodHandle SHOULD_COLLIDE2_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment SHOULD_COLLIDE_ADDRESS;
    private static final MemorySegment SHOULD_COLLIDE2_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_GET_BODY_ID2;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_SET_BODY_ID2;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("shouldCollide"), 
            UNBOUNDED_ADDRESS.withName("shouldCollide2")
        ).withName("JPH_ShapeFilter_Procs").withByteAlignment(8);

        JPH_SHAPE_FILTER_SET_PROCS = downcallHandleVoid("JPH_ShapeFilter_SetProcs", UNBOUNDED_ADDRESS);
        JPH_SHAPE_FILTER_CREATE = downcallHandle("JPH_ShapeFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_FILTER_DESTROY = downcallHandleVoid("JPH_ShapeFilter_Destroy", UNBOUNDED_ADDRESS);
        JPH_SHAPE_FILTER_GET_BODY_ID2 = downcallHandle("JPH_ShapeFilter_GetBodyID2", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_FILTER_SET_BODY_ID2 = downcallHandleVoid("JPH_ShapeFilter_SetBodyID2", UNBOUNDED_ADDRESS, JAVA_INT);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            SHOULD_COLLIDE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            SHOULD_COLLIDE_HANDLE = lookup.findStatic(ShapeFilter.class, "shouldCollide", SHOULD_COLLIDE_DESCRIPTION.toMethodType());

            SHOULD_COLLIDE_ADDRESS = linker.upcallStub(SHOULD_COLLIDE_HANDLE, SHOULD_COLLIDE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("shouldCollide")), SHOULD_COLLIDE_ADDRESS);
            
            SHOULD_COLLIDE2_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            SHOULD_COLLIDE2_HANDLE = lookup.findStatic(ShapeFilter.class, "shouldCollide2", SHOULD_COLLIDE2_DESCRIPTION.toMethodType());

            SHOULD_COLLIDE2_ADDRESS = linker.upcallStub(SHOULD_COLLIDE2_HANDLE, SHOULD_COLLIDE2_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("shouldCollide2")), SHOULD_COLLIDE2_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public ShapeFilter() {
        this(Arena.ofAuto());
    }

    public ShapeFilter(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_SHAPE_FILTER_SET_PROCS.get();
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
        MethodHandle method = JPH_SHAPE_FILTER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment filter
    ) {
        MethodHandle method = JPH_SHAPE_FILTER_DESTROY.get();
        try {
            method.invokeExact(
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getBodyID2(
        MemorySegment filter
    ) {
        MethodHandle method = JPH_SHAPE_FILTER_GET_BODY_ID2.get();
        try {
            return (int) method.invokeExact(
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyID2}.
     */
    public final int getBodyID2(
    ) {
        return (int) getBodyID2(
            this.segment
        );
    }
    
    public static void setBodyID2(
        MemorySegment filter, 
        int id
    ) {
        MethodHandle method = JPH_SHAPE_FILTER_SET_BODY_ID2.get();
        try {
            method.invokeExact(
                filter, 
                id
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setBodyID2}.
     */
    public final void setBodyID2(
        int id
    ) {
        setBodyID2(
            this.segment, 
            id
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static boolean shouldCollide(
        MemorySegment userData, 
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        ShapeFilter callback = CACHE.get(userData.address()).get();

        return (boolean) callback.shouldCollide(
            shape2, 
            subShapeIDOfShape2
        );
    }

    public boolean shouldCollide(
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        return (boolean) shouldCollide(
            new Shape(shape2), 
            new NativeIntArray(subShapeIDOfShape2)
        );
    }

    public abstract boolean shouldCollide(
        Shape shape2, 
        NativeIntArray subShapeIDOfShape2
    );


    public static boolean shouldCollide2(
        MemorySegment userData, 
        MemorySegment shape1, 
        MemorySegment subShapeIDOfShape1, 
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        ShapeFilter callback = CACHE.get(userData.address()).get();

        return (boolean) callback.shouldCollide2(
            shape1, 
            subShapeIDOfShape1, 
            shape2, 
            subShapeIDOfShape2
        );
    }

    public boolean shouldCollide2(
        MemorySegment shape1, 
        MemorySegment subShapeIDOfShape1, 
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        return (boolean) shouldCollide2(
            new Shape(shape1), 
            new NativeIntArray(subShapeIDOfShape1), 
            new Shape(shape2), 
            new NativeIntArray(subShapeIDOfShape2)
        );
    }

    public abstract boolean shouldCollide2(
        Shape shape1, 
        NativeIntArray subShapeIDOfShape1, 
        Shape shape2, 
        NativeIntArray subShapeIDOfShape2
    );


}