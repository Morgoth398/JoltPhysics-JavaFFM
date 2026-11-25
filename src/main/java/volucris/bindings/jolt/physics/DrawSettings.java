/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DrawSettings {

	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SUPPORT_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SUPPORT_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORTING_FACE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORTING_FACE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_WIREFRAME;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_WIREFRAME;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_COLOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_COLOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_BOUNDING_BOX;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_BOUNDING_BOX;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_MASS_AND_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_MASS_AND_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SLEEP_STATS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SLEEP_STATS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTEX_VELOCITIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTEX_VELOCITIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_BEND_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_BEND_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_LRACONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_LRACONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_RODS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_RODS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_STATES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_STATES;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_PREDICTED_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_PREDICTED_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_CONSTRAINT_COLOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_CONSTRAINT_COLOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_MANAGER_DRAW_SETTINGS_CREATE = downcallHandle("JPH_BodyManagerDrawSettings_Create", UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_DESTROY = downcallHandleVoid("JPH_BodyManagerDrawSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORT_FUNCTION = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawGetSupportFunction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORT_FUNCTION = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawGetSupportFunction", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SUPPORT_DIRECTION = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSupportDirection", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SUPPORT_DIRECTION = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSupportDirection", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORTING_FACE = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawGetSupportingFace", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawGetSupportingFace", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawShape", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_WIREFRAME = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawShapeWireframe", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_WIREFRAME = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawShapeWireframe", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_COLOR = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawShapeColor", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_COLOR = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawShapeColor", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_BOUNDING_BOX = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawBoundingBox", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_BOUNDING_BOX = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawBoundingBox", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_CENTER_OF_MASS_TRANSFORM = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawCenterOfMassTransform", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawCenterOfMassTransform", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_WORLD_TRANSFORM = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawWorldTransform", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_WORLD_TRANSFORM = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawWorldTransform", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_VELOCITY = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawVelocity", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_VELOCITY = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawVelocity", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_MASS_AND_INERTIA = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawMassAndInertia", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_MASS_AND_INERTIA = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawMassAndInertia", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SLEEP_STATS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSleepStats", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SLEEP_STATS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSleepStats", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTICES = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyVertices", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTICES = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyVertices", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTEX_VELOCITIES = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyVertexVelocities", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTEX_VELOCITIES = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyVertexVelocities", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyEdgeConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyEdgeConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_BEND_CONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyBendConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_BEND_CONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyBendConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyVolumeConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyVolumeConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodySkinConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodySkinConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_LRACONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyLRAConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_LRACONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyLRAConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_RODS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyRods", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_RODS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyRods", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_STATES = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyRodStates", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_STATES = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyRodStates", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyRodBendTwistConstraints", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyRodBendTwistConstraints", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_PREDICTED_BOUNDS = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyPredictedBounds", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_PREDICTED_BOUNDS = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyPredictedBounds", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_CONSTRAINT_COLOR = downcallHandle("JPH_BodyManagerDrawSettings_GetDrawSoftBodyConstraintColor", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_CONSTRAINT_COLOR = downcallHandleVoid("JPH_BodyManagerDrawSettings_SetDrawSoftBodyConstraintColor", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public DrawSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment ncreate() {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate].
    public final @Nullable DrawSettings create() {
    	MemorySegment segment = ncreate();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new DrawSettings(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the GetSupport() function, used for convex collision detection
    /// ```
    public static boolean getDrawGetSupportFunction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORT_FUNCTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawGetSupportFunction].
    public final boolean getDrawGetSupportFunction() {
    	return getDrawGetSupportFunction(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the GetSupport() function, used for convex collision detection
    /// ```
    public static void setDrawGetSupportFunction(
    	MemorySegment self,
    	boolean mDrawGetSupportFunction
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORT_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawGetSupportFunction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawGetSupportFunction].
    public final void setDrawGetSupportFunction(
    	boolean mDrawGetSupportFunction
    ) {
    	setDrawGetSupportFunction(
    		this.segment,
    		mDrawGetSupportFunction
    	);
    }
    
    /// ```
    /// When drawing the support function, also draw which direction mapped to a specific support point
    /// ```
    public static boolean getDrawSupportDirection(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SUPPORT_DIRECTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSupportDirection].
    public final boolean getDrawSupportDirection() {
    	return getDrawSupportDirection(
    		this.segment
    	);
    }
    
    /// ```
    /// When drawing the support function, also draw which direction mapped to a specific support point
    /// ```
    public static void setDrawSupportDirection(
    	MemorySegment self,
    	boolean mDrawSupportDirection
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SUPPORT_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSupportDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSupportDirection].
    public final void setDrawSupportDirection(
    	boolean mDrawSupportDirection
    ) {
    	setDrawSupportDirection(
    		this.segment,
    		mDrawSupportDirection
    	);
    }
    
    /// ```
    /// Draw the faces that were found colliding during collision detection
    /// ```
    public static boolean getDrawGetSupportingFace(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_GET_SUPPORTING_FACE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawGetSupportingFace].
    public final boolean getDrawGetSupportingFace() {
    	return getDrawGetSupportingFace(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the faces that were found colliding during collision detection
    /// ```
    public static void setDrawGetSupportingFace(
    	MemorySegment self,
    	boolean mDrawGetSupportingFace
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_GET_SUPPORTING_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawGetSupportingFace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawGetSupportingFace].
    public final void setDrawGetSupportingFace(
    	boolean mDrawGetSupportingFace
    ) {
    	setDrawGetSupportingFace(
    		this.segment,
    		mDrawGetSupportingFace
    	);
    }
    
    /// ```
    /// Draw the shapes of all bodies
    /// ```
    public static boolean getDrawShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawShape].
    public final boolean getDrawShape() {
    	return getDrawShape(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the shapes of all bodies
    /// ```
    public static void setDrawShape(
    	MemorySegment self,
    	boolean mDrawShape
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawShape].
    public final void setDrawShape(
    	boolean mDrawShape
    ) {
    	setDrawShape(
    		this.segment,
    		mDrawShape
    	);
    }
    
    /// ```
    /// When mDrawShape is true and this is true, the shapes will be drawn in wireframe instead of solid.
    /// ```
    public static boolean getDrawShapeWireframe(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_WIREFRAME.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawShapeWireframe].
    public final boolean getDrawShapeWireframe() {
    	return getDrawShapeWireframe(
    		this.segment
    	);
    }
    
    /// ```
    /// When mDrawShape is true and this is true, the shapes will be drawn in wireframe instead of solid.
    /// ```
    public static void setDrawShapeWireframe(
    	MemorySegment self,
    	boolean mDrawShapeWireframe
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_WIREFRAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawShapeWireframe
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawShapeWireframe].
    public final void setDrawShapeWireframe(
    	boolean mDrawShapeWireframe
    ) {
    	setDrawShapeWireframe(
    		this.segment,
    		mDrawShapeWireframe
    	);
    }
    
    /// ```
    /// Coloring scheme to use for shapes
    /// ```
    public static int getDrawShapeColor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SHAPE_COLOR.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawShapeColor].
    public final int getDrawShapeColor() {
    	return getDrawShapeColor(
    		this.segment
    	);
    }
    
    /// ```
    /// Coloring scheme to use for shapes
    /// ```
    public static void setDrawShapeColor(
    	MemorySegment self,
    	int mDrawShapeColor
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SHAPE_COLOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawShapeColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawShapeColor].
    public final void setDrawShapeColor(
    	int mDrawShapeColor
    ) {
    	setDrawShapeColor(
    		this.segment,
    		mDrawShapeColor
    	);
    }
    
    /// ```
    /// Draw a bounding box per body
    /// ```
    public static boolean getDrawBoundingBox(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_BOUNDING_BOX.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawBoundingBox].
    public final boolean getDrawBoundingBox() {
    	return getDrawBoundingBox(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw a bounding box per body
    /// ```
    public static void setDrawBoundingBox(
    	MemorySegment self,
    	boolean mDrawBoundingBox
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_BOUNDING_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawBoundingBox
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawBoundingBox].
    public final void setDrawBoundingBox(
    	boolean mDrawBoundingBox
    ) {
    	setDrawBoundingBox(
    		this.segment,
    		mDrawBoundingBox
    	);
    }
    
    /// ```
    /// Draw the center of mass for each body
    /// ```
    public static boolean getDrawCenterOfMassTransform(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawCenterOfMassTransform].
    public final boolean getDrawCenterOfMassTransform() {
    	return getDrawCenterOfMassTransform(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the center of mass for each body
    /// ```
    public static void setDrawCenterOfMassTransform(
    	MemorySegment self,
    	boolean mDrawCenterOfMassTransform
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawCenterOfMassTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawCenterOfMassTransform].
    public final void setDrawCenterOfMassTransform(
    	boolean mDrawCenterOfMassTransform
    ) {
    	setDrawCenterOfMassTransform(
    		this.segment,
    		mDrawCenterOfMassTransform
    	);
    }
    
    /// ```
    /// Draw the world transform (which can be different than the center of mass) for each body
    /// ```
    public static boolean getDrawWorldTransform(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_WORLD_TRANSFORM.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawWorldTransform].
    public final boolean getDrawWorldTransform() {
    	return getDrawWorldTransform(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the world transform (which can be different than the center of mass) for each body
    /// ```
    public static void setDrawWorldTransform(
    	MemorySegment self,
    	boolean mDrawWorldTransform
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawWorldTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawWorldTransform].
    public final void setDrawWorldTransform(
    	boolean mDrawWorldTransform
    ) {
    	setDrawWorldTransform(
    		this.segment,
    		mDrawWorldTransform
    	);
    }
    
    /// ```
    /// Draw the velocity vector for each body
    /// ```
    public static boolean getDrawVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_VELOCITY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawVelocity].
    public final boolean getDrawVelocity() {
    	return getDrawVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the velocity vector for each body
    /// ```
    public static void setDrawVelocity(
    	MemorySegment self,
    	boolean mDrawVelocity
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawVelocity].
    public final void setDrawVelocity(
    	boolean mDrawVelocity
    ) {
    	setDrawVelocity(
    		this.segment,
    		mDrawVelocity
    	);
    }
    
    /// ```
    /// Draw the mass and inertia (as the box equivalent) for each body
    /// ```
    public static boolean getDrawMassAndInertia(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_MASS_AND_INERTIA.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawMassAndInertia].
    public final boolean getDrawMassAndInertia() {
    	return getDrawMassAndInertia(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the mass and inertia (as the box equivalent) for each body
    /// ```
    public static void setDrawMassAndInertia(
    	MemorySegment self,
    	boolean mDrawMassAndInertia
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_MASS_AND_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawMassAndInertia
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawMassAndInertia].
    public final void setDrawMassAndInertia(
    	boolean mDrawMassAndInertia
    ) {
    	setDrawMassAndInertia(
    		this.segment,
    		mDrawMassAndInertia
    	);
    }
    
    /// ```
    /// Draw stats regarding the sleeping algorithm of each body
    /// ```
    public static boolean getDrawSleepStats(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SLEEP_STATS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSleepStats].
    public final boolean getDrawSleepStats() {
    	return getDrawSleepStats(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw stats regarding the sleeping algorithm of each body
    /// ```
    public static void setDrawSleepStats(
    	MemorySegment self,
    	boolean mDrawSleepStats
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SLEEP_STATS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSleepStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSleepStats].
    public final void setDrawSleepStats(
    	boolean mDrawSleepStats
    ) {
    	setDrawSleepStats(
    		this.segment,
    		mDrawSleepStats
    	);
    }
    
    /// ```
    /// Draw the vertices of soft bodies
    /// ```
    public static boolean getDrawSoftBodyVertices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTICES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyVertices].
    public final boolean getDrawSoftBodyVertices() {
    	return getDrawSoftBodyVertices(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the vertices of soft bodies
    /// ```
    public static void setDrawSoftBodyVertices(
    	MemorySegment self,
    	boolean mDrawSoftBodyVertices
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyVertices].
    public final void setDrawSoftBodyVertices(
    	boolean mDrawSoftBodyVertices
    ) {
    	setDrawSoftBodyVertices(
    		this.segment,
    		mDrawSoftBodyVertices
    	);
    }
    
    /// ```
    /// Draw the velocities of the vertices of soft bodies
    /// ```
    public static boolean getDrawSoftBodyVertexVelocities(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VERTEX_VELOCITIES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyVertexVelocities].
    public final boolean getDrawSoftBodyVertexVelocities() {
    	return getDrawSoftBodyVertexVelocities(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the velocities of the vertices of soft bodies
    /// ```
    public static void setDrawSoftBodyVertexVelocities(
    	MemorySegment self,
    	boolean mDrawSoftBodyVertexVelocities
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VERTEX_VELOCITIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyVertexVelocities
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyVertexVelocities].
    public final void setDrawSoftBodyVertexVelocities(
    	boolean mDrawSoftBodyVertexVelocities
    ) {
    	setDrawSoftBodyVertexVelocities(
    		this.segment,
    		mDrawSoftBodyVertexVelocities
    	);
    }
    
    /// ```
    /// Draw the edge constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodyEdgeConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyEdgeConstraints].
    public final boolean getDrawSoftBodyEdgeConstraints() {
    	return getDrawSoftBodyEdgeConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the edge constraints of soft bodies
    /// ```
    public static void setDrawSoftBodyEdgeConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodyEdgeConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_EDGE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyEdgeConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyEdgeConstraints].
    public final void setDrawSoftBodyEdgeConstraints(
    	boolean mDrawSoftBodyEdgeConstraints
    ) {
    	setDrawSoftBodyEdgeConstraints(
    		this.segment,
    		mDrawSoftBodyEdgeConstraints
    	);
    }
    
    /// ```
    /// Draw the bend constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodyBendConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_BEND_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyBendConstraints].
    public final boolean getDrawSoftBodyBendConstraints() {
    	return getDrawSoftBodyBendConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the bend constraints of soft bodies
    /// ```
    public static void setDrawSoftBodyBendConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodyBendConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_BEND_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyBendConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyBendConstraints].
    public final void setDrawSoftBodyBendConstraints(
    	boolean mDrawSoftBodyBendConstraints
    ) {
    	setDrawSoftBodyBendConstraints(
    		this.segment,
    		mDrawSoftBodyBendConstraints
    	);
    }
    
    /// ```
    /// Draw the volume constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodyVolumeConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyVolumeConstraints].
    public final boolean getDrawSoftBodyVolumeConstraints() {
    	return getDrawSoftBodyVolumeConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the volume constraints of soft bodies
    /// ```
    public static void setDrawSoftBodyVolumeConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodyVolumeConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyVolumeConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyVolumeConstraints].
    public final void setDrawSoftBodyVolumeConstraints(
    	boolean mDrawSoftBodyVolumeConstraints
    ) {
    	setDrawSoftBodyVolumeConstraints(
    		this.segment,
    		mDrawSoftBodyVolumeConstraints
    	);
    }
    
    /// ```
    /// Draw the skin constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodySkinConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodySkinConstraints].
    public final boolean getDrawSoftBodySkinConstraints() {
    	return getDrawSoftBodySkinConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the skin constraints of soft bodies
    /// ```
    public static void setDrawSoftBodySkinConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodySkinConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_SKIN_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodySkinConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodySkinConstraints].
    public final void setDrawSoftBodySkinConstraints(
    	boolean mDrawSoftBodySkinConstraints
    ) {
    	setDrawSoftBodySkinConstraints(
    		this.segment,
    		mDrawSoftBodySkinConstraints
    	);
    }
    
    /// ```
    /// Draw the LRA constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodyLRAConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_LRACONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyLRAConstraints].
    public final boolean getDrawSoftBodyLRAConstraints() {
    	return getDrawSoftBodyLRAConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the LRA constraints of soft bodies
    /// ```
    public static void setDrawSoftBodyLRAConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodyLRAConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_LRACONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyLRAConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyLRAConstraints].
    public final void setDrawSoftBodyLRAConstraints(
    	boolean mDrawSoftBodyLRAConstraints
    ) {
    	setDrawSoftBodyLRAConstraints(
    		this.segment,
    		mDrawSoftBodyLRAConstraints
    	);
    }
    
    /// ```
    /// Draw the rods of soft bodies
    /// ```
    public static boolean getDrawSoftBodyRods(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_RODS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyRods].
    public final boolean getDrawSoftBodyRods() {
    	return getDrawSoftBodyRods(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the rods of soft bodies
    /// ```
    public static void setDrawSoftBodyRods(
    	MemorySegment self,
    	boolean mDrawSoftBodyRods
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_RODS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyRods
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyRods].
    public final void setDrawSoftBodyRods(
    	boolean mDrawSoftBodyRods
    ) {
    	setDrawSoftBodyRods(
    		this.segment,
    		mDrawSoftBodyRods
    	);
    }
    
    /// ```
    /// Draw the rod states (orientation and angular velocity) of soft bodies
    /// ```
    public static boolean getDrawSoftBodyRodStates(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_STATES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyRodStates].
    public final boolean getDrawSoftBodyRodStates() {
    	return getDrawSoftBodyRodStates(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the rod states (orientation and angular velocity) of soft bodies
    /// ```
    public static void setDrawSoftBodyRodStates(
    	MemorySegment self,
    	boolean mDrawSoftBodyRodStates
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_STATES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyRodStates
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyRodStates].
    public final void setDrawSoftBodyRodStates(
    	boolean mDrawSoftBodyRodStates
    ) {
    	setDrawSoftBodyRodStates(
    		this.segment,
    		mDrawSoftBodyRodStates
    	);
    }
    
    /// ```
    /// Draw the rod bend twist constraints of soft bodies
    /// ```
    public static boolean getDrawSoftBodyRodBendTwistConstraints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyRodBendTwistConstraints].
    public final boolean getDrawSoftBodyRodBendTwistConstraints() {
    	return getDrawSoftBodyRodBendTwistConstraints(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the rod bend twist constraints of soft bodies
    /// ```
    public static void setDrawSoftBodyRodBendTwistConstraints(
    	MemorySegment self,
    	boolean mDrawSoftBodyRodBendTwistConstraints
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_ROD_BEND_TWIST_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyRodBendTwistConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyRodBendTwistConstraints].
    public final void setDrawSoftBodyRodBendTwistConstraints(
    	boolean mDrawSoftBodyRodBendTwistConstraints
    ) {
    	setDrawSoftBodyRodBendTwistConstraints(
    		this.segment,
    		mDrawSoftBodyRodBendTwistConstraints
    	);
    }
    
    /// ```
    /// Draw the predicted bounds of soft bodies
    /// ```
    public static boolean getDrawSoftBodyPredictedBounds(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_PREDICTED_BOUNDS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyPredictedBounds].
    public final boolean getDrawSoftBodyPredictedBounds() {
    	return getDrawSoftBodyPredictedBounds(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the predicted bounds of soft bodies
    /// ```
    public static void setDrawSoftBodyPredictedBounds(
    	MemorySegment self,
    	boolean mDrawSoftBodyPredictedBounds
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_PREDICTED_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyPredictedBounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyPredictedBounds].
    public final void setDrawSoftBodyPredictedBounds(
    	boolean mDrawSoftBodyPredictedBounds
    ) {
    	setDrawSoftBodyPredictedBounds(
    		this.segment,
    		mDrawSoftBodyPredictedBounds
    	);
    }
    
    /// ```
    /// Coloring scheme to use for soft body constraints
    /// ```
    public static int getDrawSoftBodyConstraintColor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_GET_DRAW_SOFT_BODY_CONSTRAINT_COLOR.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawSoftBodyConstraintColor].
    public final int getDrawSoftBodyConstraintColor() {
    	return getDrawSoftBodyConstraintColor(
    		this.segment
    	);
    }
    
    /// ```
    /// Coloring scheme to use for soft body constraints
    /// ```
    public static void setDrawSoftBodyConstraintColor(
    	MemorySegment self,
    	int mDrawSoftBodyConstraintColor
    ) {
    	MethodHandle method = JPH_BODY_MANAGER_DRAW_SETTINGS_SET_DRAW_SOFT_BODY_CONSTRAINT_COLOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrawSoftBodyConstraintColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawSoftBodyConstraintColor].
    public final void setDrawSoftBodyConstraintColor(
    	int mDrawSoftBodyConstraintColor
    ) {
    	setDrawSoftBodyConstraintColor(
    		this.segment,
    		mDrawSoftBodyConstraintColor
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}