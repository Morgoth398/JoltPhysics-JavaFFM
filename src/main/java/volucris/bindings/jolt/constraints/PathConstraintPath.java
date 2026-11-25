/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class PathConstraintPath extends PathConstraintPathRefTarget
		permits PathConstraintPathHermite {

	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_GET_PATH_MAX_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_GET_CLOSEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_GET_POINT_ON_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_SET_IS_LOOPING;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_IS_LOOPING;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_DRAW_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_PATH_CONSTRAINT_PATH_AS_REF_TARGET = downcallHandle("JPH_PathConstraintPath_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_GET_PATH_MAX_FRACTION = downcallHandle("JPH_PathConstraintPath_GetPathMaxFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_GET_CLOSEST_POINT = downcallHandle("JPH_PathConstraintPath_GetClosestPoint", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_PATH_GET_POINT_ON_PATH = downcallHandleVoid("JPH_PathConstraintPath_GetPointOnPath", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_SET_IS_LOOPING = downcallHandleVoid("JPH_PathConstraintPath_SetIsLooping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PATH_CONSTRAINT_PATH_IS_LOOPING = downcallHandle("JPH_PathConstraintPath_IsLooping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_DRAW_PATH = downcallHandleVoid("JPH_PathConstraintPath_DrawPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_SAVE_BINARY_STATE = downcallHandleVoid("JPH_PathConstraintPath_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_PathConstraintPath_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_DESTROY = downcallHandleVoid("JPH_PathConstraintPath_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PathConstraintPath(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Gets the max fraction along the path. I.e. sort of the length of the path.
    /// ```
    public static float getPathMaxFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_GET_PATH_MAX_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPathMaxFraction].
    public final float getPathMaxFraction() {
    	return getPathMaxFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the globally closest point on the curve (Could be slow!)
    /// @param inPosition Position to find closest point for
    /// @param inFractionHint Last known fraction along the path (can be used to speed up the search)
    /// @return Fraction of closest point along the path
    /// ```
    public static float getClosestPoint(
    	MemorySegment self,
    	MemorySegment inPosition,
    	float inFractionHint
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_GET_CLOSEST_POINT.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inPosition,
    			inFractionHint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestPoint].
    public final float getClosestPoint(
    	Vec3 inPosition,
    	float inFractionHint
    ) {
    	return getClosestPoint(
    		this.segment,
    		inPosition.memorySegment(),
    		inFractionHint
    	);
    }
    
    /// ```
    /// Given the fraction along the path, get the point, tangent and normal.
    /// @param inFraction Fraction along the path [0, GetPathMaxFraction()].
    /// @param outPathPosition Returns the closest position to inSearchPosition on the path.
    /// @param outPathTangent Returns the tangent to the path at outPathPosition (the vector that follows the direction of the path)
    /// @param outPathNormal Return the normal to the path at outPathPosition (a vector that's perpendicular to outPathTangent)
    /// @param outPathBinormal Returns the binormal to the path at outPathPosition (a vector so that normal cross tangent = binormal)
    /// ```
    public static void getPointOnPath(
    	MemorySegment self,
    	float inFraction,
    	MemorySegment outPathPosition,
    	MemorySegment outPathTangent,
    	MemorySegment outPathNormal,
    	MemorySegment outPathBinormal
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_GET_POINT_ON_PATH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFraction,
    			outPathPosition,
    			outPathTangent,
    			outPathNormal,
    			outPathBinormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointOnPath].
    public final void getPointOnPath(
    	float inFraction,
    	Vec3 outPathPosition,
    	Vec3 outPathTangent,
    	Vec3 outPathNormal,
    	Vec3 outPathBinormal
    ) {
    	getPointOnPath(
    		this.segment,
    		inFraction,
    		outPathPosition.memorySegment(),
    		outPathTangent.memorySegment(),
    		outPathNormal.memorySegment(),
    		outPathBinormal.memorySegment()
    	);
    }
    
    /// ```
    /// If the path is looping or not. If a path is looping, the first and last point are automatically connected to each other. They should not be the same points.
    /// ```
    public static void setIsLooping(
    	MemorySegment self,
    	boolean inIsLooping
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_SET_IS_LOOPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIsLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsLooping].
    public final void setIsLooping(
    	boolean inIsLooping
    ) {
    	setIsLooping(
    		this.segment,
    		inIsLooping
    	);
    }
    
    public static boolean isLooping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_IS_LOOPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isLooping].
    public final boolean isLooping() {
    	return isLooping(
    		this.segment
    	);
    }
    
    /// ```
    /// Draw the path relative to inBaseTransform. Used for debug purposes.
    /// ```
    public static void drawPath(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inBaseTransform
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_DRAW_PATH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inBaseTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawPath].
    public final void drawPath(
    	DebugRenderer inRenderer,
    	Mat44 inBaseTransform
    ) {
    	drawPath(
    		this.segment,
    		inRenderer.memorySegment(),
    		inBaseTransform.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the contents of the path in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_SAVE_BINARY_STATE.get();
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
    /// Creates a Shape of the correct type and restores its contents from the binary stream inStream.
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_S_RESTORE_FROM_BINARY_STATE.get();
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
    	PathConstraintPathResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_DESTROY.get();
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