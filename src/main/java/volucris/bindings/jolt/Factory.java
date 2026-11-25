/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;

import static volucris.bindings.core.FFMUtils.*;

public final class Factory {

	private static final LazyConstant<MethodHandle> JPH_FACTORY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_FACTORY_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_FACTORY_GET_INSTANCE;
	private static final LazyConstant<MethodHandle> JPH_FACTORY_SET_INSTANCE;
	private static final LazyConstant<MethodHandle> JPH_FACTORY_CREATE_OBJECT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_FACTORY_CREATE = downcallHandle("JPH_Factory_Create", UNBOUNDED_ADDRESS);
		JPH_FACTORY_DESTROY = downcallHandleVoid("JPH_Factory_Destroy", UNBOUNDED_ADDRESS);
		JPH_FACTORY_GET_INSTANCE = downcallHandle("JPH_Factory_GetInstance", UNBOUNDED_ADDRESS);
		JPH_FACTORY_SET_INSTANCE = downcallHandleVoid("JPH_Factory_SetInstance", UNBOUNDED_ADDRESS);
		JPH_FACTORY_CREATE_OBJECT = downcallHandle("JPH_Factory_CreateObject", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Factory() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Factory(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Factory(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_FACTORY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_FACTORY_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Singleton factory instance
    /// ```
    public static MemorySegment ngetInstance() {
    	MethodHandle method = JPH_FACTORY_GET_INSTANCE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetInstance].
    public static @Nullable Factory getInstance() {
    	MemorySegment segment = ngetInstance();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new Factory(segment);
    }
    
    /// ```
    /// Singleton factory instance
    /// ```
    public static void setInstance(
    	MemorySegment sInstance
    ) {
    	MethodHandle method = JPH_FACTORY_SET_INSTANCE.get();
    	try {
    		 method.invokeExact(
    			sInstance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInstance].
    public static void setInstance(
    	Factory sInstance
    ) {
    	setInstance(
    		sInstance.memorySegment()
    	);
    }
    
    /// ```
    /// Create an object
    /// ```
    public static MemorySegment createObject(
    	MemorySegment self,
    	MemorySegment inName
    ) {
    	MethodHandle method = JPH_FACTORY_CREATE_OBJECT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createObject].
    public final @Nullable MemorySegment createObject(
    	NativeByteArray inName
    ) {
    	MemorySegment segment = createObject(
    		this.segment,
    		inName.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}