/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettings;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettingsRefConst;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConnectedConstraint {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY2;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE = downcallHandle("JPH_PhysicsSceneConnectedConstraint_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE1 = downcallHandle("JPH_PhysicsSceneConnectedConstraint_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_DESTROY = downcallHandleVoid("JPH_PhysicsSceneConnectedConstraint_Destroy", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_PhysicsSceneConnectedConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_SETTINGS = downcallHandleVoid("JPH_PhysicsSceneConnectedConstraint_SetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY1 = downcallHandle("JPH_PhysicsSceneConnectedConstraint_GetBody1", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY1 = downcallHandleVoid("JPH_PhysicsSceneConnectedConstraint_SetBody1", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY2 = downcallHandle("JPH_PhysicsSceneConnectedConstraint_GetBody2", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY2 = downcallHandleVoid("JPH_PhysicsSceneConnectedConstraint_SetBody2", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public ConnectedConstraint() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ConnectedConstraint(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ConnectedConstraint(
	    TwoBodyConstraintSettings inSettings,
	    int inBody1,
	    int inBody2
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inBody1,
	        inBody2
	    );
	}
	
	/// Typed method of [#create1].
	public ConnectedConstraint(
		Arena arena,
		TwoBodyConstraintSettings inSettings,
		int inBody1,
		int inBody2
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			inBody1,
			inBody2
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ConnectedConstraint(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	int inBody1,
    	int inBody2
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inBody1,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constraint settings
    /// ```
    public static void getSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final void getSettings(
    	TwoBodyConstraintSettingsRefConst outResult
    ) {
    	getSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Constraint settings
    /// ```
    public static void setSettings(
    	MemorySegment self,
    	MemorySegment mSettings
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSettings].
    public final void setSettings(
    	TwoBodyConstraintSettingsRefConst mSettings
    ) {
    	setSettings(
    		this.segment,
    		mSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Index of first body (in mBodies)
    /// ```
    public static int getBody1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY1.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody1].
    public final int getBody1() {
    	return getBody1(
    		this.segment
    	);
    }
    
    /// ```
    /// Index of first body (in mBodies)
    /// ```
    public static void setBody1(
    	MemorySegment self,
    	int mBody1
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBody1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBody1].
    public final void setBody1(
    	int mBody1
    ) {
    	setBody1(
    		this.segment,
    		mBody1
    	);
    }
    
    /// ```
    /// Index of second body (in mBodies)
    /// ```
    public static int getBody2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_GET_BODY2.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody2].
    public final int getBody2() {
    	return getBody2(
    		this.segment
    	);
    }
    
    /// ```
    /// Index of second body (in mBodies)
    /// ```
    public static void setBody2(
    	MemorySegment self,
    	int mBody2
    ) {
    	MethodHandle method = JPH_PHYSICS_SCENE_CONNECTED_CONSTRAINT_SET_BODY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBody2].
    public final void setBody2(
    	int mBody2
    ) {
    	setBody2(
    		this.segment,
    		mBody2
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}