/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CombineFunctionCallback {

    private static final Map<Long, WeakReference<CombineFunctionCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CombineFunctionCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CombineFunctionCallback() {
        this(Arena.ofAuto());
    }

    public CombineFunctionCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        int inWheelIndex,
        MemorySegment ioLongitudinalFriction,
        MemorySegment ioLateralFriction,
        MemorySegment body2,
        MemorySegment inSubShapeID2
    ) {
        invoke(
            inWheelIndex,
            new NativeFloatArray(ioLongitudinalFriction),
            new NativeFloatArray(ioLateralFriction),
            new Body(body2),
            new SubShapeID(inSubShapeID2)
        );
    }

    public void invoke(
        int inWheelIndex,
        NativeFloatArray ioLongitudinalFriction,
        NativeFloatArray ioLateralFriction,
        Body body2,
        SubShapeID inSubShapeID2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CombineFunctionCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CombineFunctionCallback get(MemorySegment segment) {
        WeakReference<CombineFunctionCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}