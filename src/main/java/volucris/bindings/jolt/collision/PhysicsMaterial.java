/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static volucris.bindings.core.FFMUtils.*;

public sealed class PhysicsMaterial extends PhysicsMaterialRefTarget
		permits PhysicsMaterialSimple {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_GET_DEFAULT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_SET_DEFAULT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_MATERIAL_CREATE = downcallHandle("JPH_PhysicsMaterial_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_AS_REF_TARGET = downcallHandle("JPH_PhysicsMaterial_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_GET_DEFAULT = downcallHandleVoid("JPH_PhysicsMaterial_GetDefault", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_SET_DEFAULT = downcallHandleVoid("JPH_PhysicsMaterial_SetDefault", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME = downcallHandle("JPH_PhysicsMaterial_GetDebugName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR = downcallHandleVoid("JPH_PhysicsMaterial_GetDebugColor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_SAVE_BINARY_STATE = downcallHandleVoid("JPH_PhysicsMaterial_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_PhysicsMaterial_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_DESTROY = downcallHandleVoid("JPH_PhysicsMaterial_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsMaterial() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsMaterial(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsMaterial(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Default material that is used when a shape has no materials defined
    /// ```
    public static void getDefault(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEFAULT.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDefault].
    public static void getDefault(
    	PhysicsMaterialRefConst outResult
    ) {
    	getDefault(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Default material that is used when a shape has no materials defined
    /// ```
    public static void setDefault(
    	MemorySegment sDefault
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_SET_DEFAULT.get();
    	try {
    		 method.invokeExact(
    			sDefault
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDefault].
    public static void setDefault(
    	PhysicsMaterialRefConst sDefault
    ) {
    	setDefault(
    		sDefault.memorySegment()
    	);
    }
    
    public static MemorySegment getDebugName(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDebugName].
    public final @Nullable NativeByteArray getDebugName() {
    	MemorySegment segment = getDebugName(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static void getDebugColor(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDebugColor].
    public final void getDebugColor(
    	Color outResult
    ) {
    	getDebugColor(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the contents of the material in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Creates a PhysicsMaterial of the correct type and restores its contents from the binary stream inStream.
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public static void sRestoreFromBinaryState(
    	StreamIn inStream,
    	PhysicsMaterialResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}