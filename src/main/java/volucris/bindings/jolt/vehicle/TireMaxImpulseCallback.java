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
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class TireMaxImpulseCallback {

    private static final HashMap<Long, WeakReference<TireMaxImpulseCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT, 
            JAVA_FLOAT, 
            JAVA_FLOAT, 
            JAVA_FLOAT, 
            JAVA_FLOAT, 
            JAVA_FLOAT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(TireMaxImpulseCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public TireMaxImpulseCallback() {
        this(Arena.ofAuto());
    }

    public TireMaxImpulseCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment userData, 
        int wheelIndex, 
        MemorySegment outLongitudinalImpulse, 
        MemorySegment outLateralImpulse, 
        float suspensionImpulse, 
        float longitudinalFriction, 
        float lateralFriction, 
        float longitudinalSlip, 
        float lateralSlip, 
        float deltaTime
    ) {
        invoke(
            userData, 
            wheelIndex, 
            new NativeFloatArray(outLongitudinalImpulse), 
            new NativeFloatArray(outLateralImpulse), 
            suspensionImpulse, 
            longitudinalFriction, 
            lateralFriction, 
            longitudinalSlip, 
            lateralSlip, 
            deltaTime
        );
    }

    public abstract void invoke(
        MemorySegment userData, 
        int wheelIndex, 
        NativeFloatArray outLongitudinalImpulse, 
        NativeFloatArray outLateralImpulse, 
        float suspensionImpulse, 
        float longitudinalFriction, 
        float lateralFriction, 
        float longitudinalSlip, 
        float lateralSlip, 
        float deltaTime
    );


    public MemorySegment memorySegment() {
        return segment;
    }

    public static TireMaxImpulseCallback get(MemorySegment segment) {
        WeakReference<TireMaxImpulseCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}