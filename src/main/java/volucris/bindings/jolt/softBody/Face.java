/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Face {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_GET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_SET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_FACE_IS_DEGENERATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE = downcallHandle("JPH_SoftBodySharedSettingsFace_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsFace_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsFace_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_GET_MATERIAL_INDEX = downcallHandle("JPH_SoftBodySharedSettingsFace_GetMaterialIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_SET_MATERIAL_INDEX = downcallHandleVoid("JPH_SoftBodySharedSettingsFace_SetMaterialIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_FACE_IS_DEGENERATE = downcallHandle("JPH_SoftBodySharedSettingsFace_IsDegenerate", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Face() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Face(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Face(
	    int inVertex1,
	    int inVertex2,
	    int inVertex3,
	    int inMaterialIndex
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inVertex3,
	        inMaterialIndex
	    );
	}
	
	/// Typed method of [#create1].
	public Face(
		Arena arena,
		int inVertex1,
		int inVertex2,
		int inVertex3,
		int inMaterialIndex
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inVertex3,
			inMaterialIndex
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Face(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	int inVertex3,
    	int inMaterialIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inVertex3,
    			inMaterialIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index of the material of the face in SoftBodySharedSettings::mMaterials
    /// ```
    public static int getMaterialIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_GET_MATERIAL_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialIndex].
    public final int getMaterialIndex() {
    	return getMaterialIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Index of the material of the face in SoftBodySharedSettings::mMaterials
    /// ```
    public static void setMaterialIndex(
    	MemorySegment self,
    	int mMaterialIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_SET_MATERIAL_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterialIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterialIndex].
    public final void setMaterialIndex(
    	int mMaterialIndex
    ) {
    	setMaterialIndex(
    		this.segment,
    		mMaterialIndex
    	);
    }
    
    /// ```
    /// Check if this is a degenerate face (a face which points to the same vertex twice)
    /// ```
    public static boolean isDegenerate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_FACE_IS_DEGENERATE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isDegenerate].
    public final boolean isDegenerate() {
    	return isDegenerate(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}