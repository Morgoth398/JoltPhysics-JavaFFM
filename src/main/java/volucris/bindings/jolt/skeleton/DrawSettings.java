/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DrawSettings {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_ORIENTATIONS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_ORIENTATIONS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_NAMES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_NAMES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_POSE_DRAW_SETTINGS_CREATE = downcallHandle("JPH_SkeletonPoseDrawSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW_SETTINGS_DESTROY = downcallHandleVoid("JPH_SkeletonPoseDrawSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINTS = downcallHandle("JPH_SkeletonPoseDrawSettings_GetDrawJoints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINTS = downcallHandleVoid("JPH_SkeletonPoseDrawSettings_SetDrawJoints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_ORIENTATIONS = downcallHandle("JPH_SkeletonPoseDrawSettings_GetDrawJointOrientations", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_ORIENTATIONS = downcallHandleVoid("JPH_SkeletonPoseDrawSettings_SetDrawJointOrientations", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_NAMES = downcallHandle("JPH_SkeletonPoseDrawSettings_GetDrawJointNames", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_NAMES = downcallHandleVoid("JPH_SkeletonPoseDrawSettings_SetDrawJointNames", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		//@formatter:on
	}

	public DrawSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DrawSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DrawSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean getDrawJoints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawJoints].
    public final boolean getDrawJoints() {
    	return getDrawJoints(
    		this.segment
    	);
    }
    
    public static void setDrawJoints(
    	MemorySegment self,
    	boolean mDrawJoints
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawJoints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawJoints].
    public final void setDrawJoints(
    	boolean mDrawJoints
    ) {
    	setDrawJoints(
    		this.segment,
    		mDrawJoints
    	);
    }
    
    public static boolean getDrawJointOrientations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_ORIENTATIONS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawJointOrientations].
    public final boolean getDrawJointOrientations() {
    	return getDrawJointOrientations(
    		this.segment
    	);
    }
    
    public static void setDrawJointOrientations(
    	MemorySegment self,
    	boolean mDrawJointOrientations
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_ORIENTATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawJointOrientations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawJointOrientations].
    public final void setDrawJointOrientations(
    	boolean mDrawJointOrientations
    ) {
    	setDrawJointOrientations(
    		this.segment,
    		mDrawJointOrientations
    	);
    }
    
    public static boolean getDrawJointNames(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_GET_DRAW_JOINT_NAMES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawJointNames].
    public final boolean getDrawJointNames() {
    	return getDrawJointNames(
    		this.segment
    	);
    }
    
    public static void setDrawJointNames(
    	MemorySegment self,
    	boolean mDrawJointNames
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW_SETTINGS_SET_DRAW_JOINT_NAMES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawJointNames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawJointNames].
    public final void setDrawJointNames(
    	boolean mDrawJointNames
    ) {
    	setDrawJointNames(
    		this.segment,
    		mDrawJointNames
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}