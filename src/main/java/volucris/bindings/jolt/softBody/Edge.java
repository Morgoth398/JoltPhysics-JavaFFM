/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Edge {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_REST_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_REST_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_COMPLIANCE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_MIN_VERTEX_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE = downcallHandle("JPH_SoftBodySharedSettingsEdge_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsEdge_Create1", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsEdge_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_REST_LENGTH = downcallHandle("JPH_SoftBodySharedSettingsEdge_GetRestLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_REST_LENGTH = downcallHandleVoid("JPH_SoftBodySharedSettingsEdge_SetRestLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_COMPLIANCE = downcallHandle("JPH_SoftBodySharedSettingsEdge_GetCompliance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_COMPLIANCE = downcallHandleVoid("JPH_SoftBodySharedSettingsEdge_SetCompliance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_MIN_VERTEX_INDEX = downcallHandle("JPH_SoftBodySharedSettingsEdge_GetMinVertexIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Edge() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Edge(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Edge(
	    int inVertex1,
	    int inVertex2,
	    float inCompliance
	) {
	    this(
	        Arena.ofAuto(),
	        inVertex1,
	        inVertex2,
	        inCompliance
	    );
	}
	
	/// Typed method of [#create1].
	public Edge(
		Arena arena,
		int inVertex1,
		int inVertex2,
		float inCompliance
	) {
		MemorySegment segment = create1(
			inVertex1,
			inVertex2,
			inCompliance
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Edge(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inVertex1,
    	int inVertex2,
    	float inCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertex1,
    			inVertex2,
    			inCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Rest length of the spring, calculated by CalculateEdgeLengths
    /// ```
    public static float getRestLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_REST_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestLength].
    public final float getRestLength() {
    	return getRestLength(
    		this.segment
    	);
    }
    
    /// ```
    /// Rest length of the spring, calculated by CalculateEdgeLengths
    /// ```
    public static void setRestLength(
    	MemorySegment self,
    	float mRestLength
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_REST_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRestLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestLength].
    public final void setRestLength(
    	float mRestLength
    ) {
    	setRestLength(
    		this.segment,
    		mRestLength
    	);
    }
    
    /// ```
    /// Inverse of the stiffness of the spring
    /// ```
    public static float getCompliance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_COMPLIANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompliance].
    public final float getCompliance() {
    	return getCompliance(
    		this.segment
    	);
    }
    
    /// ```
    /// Inverse of the stiffness of the spring
    /// ```
    public static void setCompliance(
    	MemorySegment self,
    	float mCompliance
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_SET_COMPLIANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCompliance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCompliance].
    public final void setCompliance(
    	float mCompliance
    ) {
    	setCompliance(
    		this.segment,
    		mCompliance
    	);
    }
    
    /// ```
    /// Return the lowest vertex index of this constraint
    /// ```
    public static int getMinVertexIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_EDGE_GET_MIN_VERTEX_INDEX.get();
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