package volucris.bindings.jolt;

import java.lang.invoke.MethodHandle;

import volucris.bindings.core.NativeLibraryLoader;
import volucris.bindings.jolt.callbacks.AssertFailureFunc;
import volucris.bindings.jolt.callbacks.TraceFunc;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class Jolt {

	public static final float DEFAULT_COLLISION_TOLERANCE = 1.0e-4f;
	public static final float DEFAULT_PENETRATION_TOLERANCE = 1.0e-4f;
	public static final float DEFAULT_CONVEX_RADIUS = 0.05f;
	public static final float CAPSULE_PROJECTION_SLOP = 0.02f;
	public static final int MAX_PHYSICS_JOBS = 2048;
	public static final int MAX_PHYSICS_BARRIERS = 8;
	
	private static final LazyConstant<MethodHandle> JPH_INIT;
	private static final LazyConstant<MethodHandle> JPH_SHUTDOWN;
	private static final LazyConstant<MethodHandle> JPH_SET_TRACE_HANDLER;
	private static final LazyConstant<MethodHandle> JPH_SET_ASSERT_FAILURE_HANDLER;

	static {
		JPH_INIT = downcallHandle("JPH_Init", JAVA_BOOLEAN);
		JPH_SHUTDOWN = downcallHandleVoid("JPH_Shutdown");
		JPH_SET_TRACE_HANDLER = downcallHandleVoid("JPH_SetTraceHandler", ADDRESS);
		JPH_SET_ASSERT_FAILURE_HANDLER = downcallHandleVoid("JPH_SetAssertFailureHandler", ADDRESS);
	}

	private Jolt() {

	}
	
	public static void loadNativeLibrary() {
		loadNativeLibrary(false);
	}
	
	public static void loadNativeLibrary(boolean debug) {
		NativeLibraryLoader.loadLibrary("natives/jolt", "jolt", debug);
	}
	
	public static boolean init() {
		try {
			return (boolean) JPH_INIT.get().invokeExact();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void shutdown() {
		try {
			JPH_SHUTDOWN.get().invokeExact();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void setTraceCallback(TraceFunc traceCallback) {
		try {
			JPH_SET_TRACE_HANDLER.get().invokeExact(traceCallback.memorySegment());
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static void setAssertFailureCallback(AssertFailureFunc assertFailureCallback) {
		try {
			JPH_SET_ASSERT_FAILURE_HANDLER.get().invokeExact(assertFailureCallback.memorySegment());
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
}
