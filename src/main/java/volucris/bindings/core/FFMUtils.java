package volucris.bindings.core;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.AddressLayout;

public final class FFMUtils {

	public static final AddressLayout UNBOUNDED_ADDRESS = ADDRESS
			.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));

	private static final Linker LINKER = Linker.nativeLinker();
	private static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup();

	private FFMUtils() {

	}

	public static LazyConstant<MemorySegment> symbol(String name) {
		return LazyConstant.of(() -> {
			return SYMBOL_LOOKUP.findOrThrow(name);
		});
	}

	public static LazyConstant<Integer> intSymbol(String name) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			return symbol.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0);
		});
	}

	public static LazyConstant<Long> longSymbol(String name) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			return symbol.reinterpret(JAVA_LONG.byteSize()).get(JAVA_LONG, 0);
		});
	}

	public static LazyConstant<Float> floatSymbol(String name) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			return symbol.reinterpret(JAVA_FLOAT.byteSize()).get(JAVA_FLOAT, 0);
		});
	}

	public static LazyConstant<Double> doubleSymbol(String name) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			return symbol.reinterpret(JAVA_DOUBLE.byteSize()).get(JAVA_DOUBLE, 0);
		});
	}

	public static LazyConstant<String> stringSymbol(String name) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			return symbol.reinterpret(Long.MAX_VALUE).getString(0);
		});
	}

	public static LazyConstant<Boolean> booleanSymbol(String name, boolean intAsBoolean) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);
			if (intAsBoolean) {
				return symbol.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0) == 1;
			} else {
				return symbol.reinterpret(JAVA_BOOLEAN.byteSize()).get(JAVA_BOOLEAN, 0);
			}
		});
	}

	public static LazyConstant<MethodHandle> downcallHandleVoid(String name, MemoryLayout... argLayouts) {
		return downcallHandleVoid(false, name, argLayouts);
	}

	public static LazyConstant<MethodHandle> downcallHandleVoid(boolean functionPointer, String name,
			MemoryLayout... argLayouts) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);

			MemorySegment address = functionPointer
					? symbol.reinterpret(ValueLayout.ADDRESS.byteSize()).get(ValueLayout.ADDRESS, 0)
					: symbol;
			return LINKER.downcallHandle(address, FunctionDescriptor.ofVoid(argLayouts));
		});
	}

	public static LazyConstant<MethodHandle> downcallHandle(String name, MemoryLayout resLayout,
			MemoryLayout... argLayouts) {
		return downcallHandle(false, name, resLayout, argLayouts);
	}

	public static LazyConstant<MethodHandle> downcallHandle(boolean functionPointer, String name,
			MemoryLayout resLayout, MemoryLayout... argLayouts) {
		return LazyConstant.of(() -> {
			MemorySegment symbol = SYMBOL_LOOKUP.findOrThrow(name);

			MemorySegment address = functionPointer
					? symbol.reinterpret(ValueLayout.ADDRESS.byteSize()).get(ValueLayout.ADDRESS, 0)
					: symbol;
			return LINKER.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
		});
	}

}
