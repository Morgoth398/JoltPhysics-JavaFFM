/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyCreationSettings;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettingsRef;

import static volucris.bindings.core.FFMUtils.*;

public final class Part extends BodyCreationSettings {

	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_PART_AS_BODY_CREATION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_PART_GET_TO_PARENT;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_PART_SET_TO_PARENT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAGDOLL_SETTINGS_PART_CREATE = downcallHandle("JPH_RagdollSettingsPart_Create", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_PART_AS_BODY_CREATION_SETTINGS = downcallHandle("JPH_RagdollSettingsPart_AsBodyCreationSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_PART_GET_TO_PARENT = downcallHandleVoid("JPH_RagdollSettingsPart_GetToParent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_PART_SET_TO_PARENT = downcallHandleVoid("JPH_RagdollSettingsPart_SetToParent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Part() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Part(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBodyCreationSettings(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Part(MemorySegment segment) {
		this.segment = segment;
		super(asBodyCreationSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBodyCreationSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_PART_AS_BODY_CREATION_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getToParent(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_PART_GET_TO_PARENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getToParent].
    public final void getToParent(
    	TwoBodyConstraintSettingsRef outResult
    ) {
    	getToParent(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setToParent(
    	MemorySegment self,
    	MemorySegment mToParent
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_PART_SET_TO_PARENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mToParent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setToParent].
    public final void setToParent(
    	TwoBodyConstraintSettingsRef mToParent
    ) {
    	setToParent(
    		this.segment,
    		mToParent.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}