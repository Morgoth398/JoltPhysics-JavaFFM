/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class InvBind {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_JOINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_JOINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_INV_BIND;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_INV_BIND;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE = downcallHandle("JPH_SoftBodySharedSettingsInvBind_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE1 = downcallHandle("JPH_SoftBodySharedSettingsInvBind_Create1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBind_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_JOINT_INDEX = downcallHandle("JPH_SoftBodySharedSettingsInvBind_GetJointIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_JOINT_INDEX = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBind_SetJointIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_INV_BIND = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBind_GetInvBind", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_INV_BIND = downcallHandleVoid("JPH_SoftBodySharedSettingsInvBind_SetInvBind", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public InvBind() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public InvBind(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBind(
	    int inJointIndex,
	    Mat44 inInvBind
	) {
	    this(
	        Arena.ofAuto(),
	        inJointIndex,
	        inInvBind
	    );
	}
	
	/// Typed method of [#create1].
	public InvBind(
		Arena arena,
		int inJointIndex,
		Mat44 inInvBind
	) {
		MemorySegment segment = create1(
			inJointIndex,
			inInvBind.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public InvBind(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inJointIndex,
    	MemorySegment inInvBind
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inJointIndex,
    			inInvBind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Joint index to which this is attached
    /// ```
    public static int getJointIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_JOINT_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointIndex].
    public final int getJointIndex() {
    	return getJointIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Joint index to which this is attached
    /// ```
    public static void setJointIndex(
    	MemorySegment self,
    	int mJointIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_JOINT_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointIndex].
    public final void setJointIndex(
    	int mJointIndex
    ) {
    	setJointIndex(
    		this.segment,
    		mJointIndex
    	);
    }
    
    /// ```
    /// The inverse bind matrix, this takes a vertex in its bind pose (Vertex::mPosition) to joint local space
    /// ```
    public static void getInvBind(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_GET_INV_BIND.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvBind].
    public final void getInvBind(
    	Mat44 outResult
    ) {
    	getInvBind(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The inverse bind matrix, this takes a vertex in its bind pose (Vertex::mPosition) to joint local space
    /// ```
    public static void setInvBind(
    	MemorySegment self,
    	MemorySegment mInvBind
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_INV_BIND_SET_INV_BIND.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvBind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvBind].
    public final void setInvBind(
    	Mat44 mInvBind
    ) {
    	setInvBind(
    		this.segment,
    		mInvBind.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}