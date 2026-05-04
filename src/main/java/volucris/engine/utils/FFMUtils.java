package volucris.engine.utils;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.VarHandle;

public final class FFMUtils {

	private static final Linker LINKER = Linker.nativeLinker();
	private static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup();

	private FFMUtils() {

	}

	public static MethodHandle downcallHandleVoid(String name, MemoryLayout... argLayouts) {
		return LINKER.downcallHandle(SYMBOL_LOOKUP.findOrThrow(name), FunctionDescriptor.ofVoid(argLayouts));
	}

	public static MethodHandle downcallHandle(String name, MemoryLayout resLayout, MemoryLayout... argLayouts) {
		return LINKER.downcallHandle(SYMBOL_LOOKUP.findOrThrow(name), FunctionDescriptor.of(resLayout, argLayouts));
	}

	public static VarHandle varHandle(MemoryLayout layout, String name) {
		return MethodHandles.insertCoordinates(layout.varHandle(PathElement.groupElement(name)), 1, 0L);
	}

	public static VarHandle varHandle(MemoryLayout layout, String name1, String name2) {
		return MethodHandles.insertCoordinates(
				layout.varHandle(PathElement.groupElement(name1), PathElement.groupElement(name2)), 1, 0L);
	}

	public static VarHandle varHandle(MemoryLayout layout, String name, int sequenceIndex) {
		return MethodHandles.insertCoordinates(
				layout.varHandle(PathElement.groupElement(name), PathElement.sequenceElement(sequenceIndex)), 1, 0L);
	}

	public static MethodHandle upcallHandleVoid(Lookup lookup, Class<?> clazz, String name,
			MemoryLayout... argLayouts) {
		try {
			return lookup.findVirtual(clazz, name, FunctionDescriptor.ofVoid(argLayouts).toMethodType());
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to create upcall handle.");
		}
	}

	public static MethodHandle upcallHandleStatic(Lookup lookup, Class<?> clazz, String name,
			FunctionDescriptor descr) {
		try {
			return lookup.findStatic(clazz, name, descr.toMethodType());
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to create upcall handle.");
		}
	}

	public static MethodHandle upcallHandle(Lookup lookup, Class<?> clazz, String name, FunctionDescriptor descr) {
		try {
			return lookup.findVirtual(clazz, name, descr.toMethodType());
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to create upcall handle.");
		}
	}

	public static MethodHandle upcallHandle(Lookup lookup, Class<?> clazz, String name, MemoryLayout resLayout,
			MemoryLayout... argLayouts) {
		try {
			return lookup.findVirtual(clazz, name, FunctionDescriptor.of(resLayout, argLayouts).toMethodType());
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to create upcall handle.");
		}
	}

	public static FunctionDescriptor functionDescrVoid(MemoryLayout... argLayouts) {
		return FunctionDescriptor.ofVoid(argLayouts);
	}

	public static FunctionDescriptor functionDescr(MemoryLayout resLayout, MemoryLayout... argLayouts) {
		return FunctionDescriptor.of(resLayout, argLayouts);
	}

	public static MemorySegment upcallStub(Object object, MethodHandle method, FunctionDescriptor descriptor) {
		return LINKER.upcallStub(method.bindTo(object), descriptor, Arena.ofAuto());
	}

	public static MemorySegment upcallStub(Object object, MethodHandle method, FunctionDescriptor descriptor,
			Arena arena) {
		return LINKER.upcallStub(method.bindTo(object), descriptor, arena);
	}

	public static MemorySegment upcallStub(MethodHandle method, FunctionDescriptor descriptor) {
		return LINKER.upcallStub(method, descriptor, Arena.ofAuto());
	}

	public static MemorySegment upcallStub(MethodHandle method, FunctionDescriptor descriptor, Arena arena) {
		return LINKER.upcallStub(method, descriptor, arena);
	}
	
}
