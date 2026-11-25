/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class LRA {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MIN_VERTEX_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE = downcallHandle("JPH_SoftBodySharedSettingsLRA_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsLRA_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsLRA_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MAX_DISTANCE = downcallHandle("JPH_SoftBodySharedSettingsLRA_GetMaxDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_SET_MAX_DISTANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsLRA_SetMaxDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MIN_VERTEX_INDEX = downcallHandle("JPH_SoftBodySharedSettingsLRA_GetMinVertexIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public LRA() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public LRA(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public LRA(
	    int inVertex1,
	    int inVertex2,
	    float inMaxDistance
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inMaxDistance
	    );
	}
	
	/// Typed method of [#create1].
	public LRA(
		Arena arena,
		int inVertex1,
		int inVertex2,
		float inMaxDistance
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inMaxDistance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public LRA(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	float inMaxDistance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inMaxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The maximum distance between the vertices, calculated by CalculateLRALengths
    /// ```
    public static float getMaxDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxDistance].
    public final float getMaxDistance() {
    	return getMaxDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// The maximum distance between the vertices, calculated by CalculateLRALengths
    /// ```
    public static void setMaxDistance(
    	MemorySegment self,
    	float mMaxDistance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_SET_MAX_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxDistance].
    public final void setMaxDistance(
    	float mMaxDistance
    ) {
    	setMaxDistance(
    		this.segment,
    		mMaxDistance
    	);
    }
    
    /// ```
    /// Return the lowest vertex index of this constraint
    /// ```
    public static int getMinVertexIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_LRA_GET_MIN_VERTEX_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinVertexIndex].
    public final int getMinVertexIndex() {
    	return getMinVertexIndex(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}