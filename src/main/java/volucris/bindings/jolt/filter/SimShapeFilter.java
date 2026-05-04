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
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class SimShapeFilter {

    private static final HashMap<Long, WeakReference<SimShapeFilter>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor SHOULD_COLLIDE_DESCRIPTION;
    public static final MethodHandle SHOULD_COLLIDE_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment SHOULD_COLLIDE_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SIM_SHAPE_FILTER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("shouldCollide")
        ).withName("JPH_SimShapeFilter_Procs").withByteAlignment(8);

        JPH_SIM_SHAPE_FILTER_SET_PROCS = downcallHandleVoid("JPH_SimShapeFilter_SetProcs", UNBOUNDED_ADDRESS);
        JPH_SIM_SHAPE_FILTER_CREATE = downcallHandle("JPH_SimShapeFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIM_SHAPE_FILTER_DESTROY = downcallHandleVoid("JPH_SimShapeFilter_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            SHOULD_COLLIDE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            SHOULD_COLLIDE_HANDLE = lookup.findStatic(SimShapeFilter.class, "shouldCollide", SHOULD_COLLIDE_DESCRIPTION.toMethodType());

            SHOULD_COLLIDE_ADDRESS = linker.upcallStub(SHOULD_COLLIDE_HANDLE, SHOULD_COLLIDE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("shouldCollide")), SHOULD_COLLIDE_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public SimShapeFilter() {
        this(Arena.ofAuto());
    }

    public SimShapeFilter(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_SIM_SHAPE_FILTER_SET_PROCS.get();
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
        MethodHandle method = JPH_SIM_SHAPE_FILTER_CREATE.get();
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
        MethodHandle method = JPH_SIM_SHAPE_FILTER_DESTROY.get();
        try {
            method.invokeExact(
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static boolean shouldCollide(
        MemorySegment userData, 
        MemorySegment body1, 
        MemorySegment shape1, 
        MemorySegment subShapeIDOfShape1, 
        MemorySegment body2, 
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        SimShapeFilter callback = CACHE.get(userData.address()).get();

        return (boolean) callback.shouldCollide(
            body1, 
            shape1, 
            subShapeIDOfShape1, 
            body2, 
            shape2, 
            subShapeIDOfShape2
        );
    }

    public boolean shouldCollide(
        MemorySegment body1, 
        MemorySegment shape1, 
        MemorySegment subShapeIDOfShape1, 
        MemorySegment body2, 
        MemorySegment shape2, 
        MemorySegment subShapeIDOfShape2
    ) {
        return (boolean) shouldCollide(
            new Body(body1), 
            new Shape(shape1), 
            new NativeIntArray(subShapeIDOfShape1), 
            new Body(body2), 
            new Shape(shape2), 
            new NativeIntArray(subShapeIDOfShape2)
        );
    }

    public abstract boolean shouldCollide(
        Body body1, 
        Shape shape1, 
        NativeIntArray subShapeIDOfShape1, 
        Body body2, 
        Shape shape2, 
        NativeIntArray subShapeIDOfShape2
    );


}