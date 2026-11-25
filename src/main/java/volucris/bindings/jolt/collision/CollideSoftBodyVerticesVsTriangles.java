/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollideSoftBodyVerticesVsTriangles {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_INV_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_INV_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SCALE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SCALE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_LOCAL_POSITION;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_LOCAL_POSITION;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V0;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V0;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_NORMAL_SIGN;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_NORMAL_SIGN;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_DISTANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_DISTANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SET;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SET;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRIANGLE_THICKNESS;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRIANGLE_THICKNESS;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_START_VERTEX;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_PROCESS_TRIANGLE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_FINISH_VERTEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_CREATE = downcallHandle("JPH_CollideSoftBodyVerticesVsTriangles_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_DESTROY = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRANSFORM = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRANSFORM = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_INV_TRANSFORM = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetInvTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_INV_TRANSFORM = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetInvTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SCALE = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SCALE = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_LOCAL_POSITION = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetLocalPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_LOCAL_POSITION = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetLocalPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V0 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetV0", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V0 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetV0", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V1 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V1 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V2 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V2 = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_POINT = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_GetClosestPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_POINT = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetClosestPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_NORMAL_SIGN = downcallHandle("JPH_CollideSoftBodyVerticesVsTriangles_GetNormalSign", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_NORMAL_SIGN = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetNormalSign", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_DISTANCE_SQ = downcallHandle("JPH_CollideSoftBodyVerticesVsTriangles_GetClosestDistanceSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_DISTANCE_SQ = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetClosestDistanceSq", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SET = downcallHandle("JPH_CollideSoftBodyVerticesVsTriangles_GetSet", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SET = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetSet", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRIANGLE_THICKNESS = downcallHandle("JPH_CollideSoftBodyVerticesVsTriangles_GetTriangleThickness", JAVA_FLOAT);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRIANGLE_THICKNESS = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_SetTriangleThickness", JAVA_FLOAT);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_START_VERTEX = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_StartVertex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_PROCESS_TRIANGLE = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_ProcessTriangle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_FINISH_VERTEX = downcallHandleVoid("JPH_CollideSoftBodyVerticesVsTriangles_FinishVertex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public CollideSoftBodyVerticesVsTriangles(
	    Mat44 inCenterOfMassTransform,
	    Vec3 inScale
	) {
	    this(
	        Arena.ofAuto(),
	        inCenterOfMassTransform,
	        inScale
	    );
	}
	
	/// Typed method of [#create].
	public CollideSoftBodyVerticesVsTriangles(
		Arena arena,
		Mat44 inCenterOfMassTransform,
		Vec3 inScale
	) {
		MemorySegment segment = create(
			inCenterOfMassTransform.memorySegment(),
			inScale.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollideSoftBodyVerticesVsTriangles(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenterOfMassTransform,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransform].
    public final void getTransform(
    	Mat44 outResult
    ) {
    	getTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTransform(
    	MemorySegment self,
    	MemorySegment mTransform
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTransform].
    public final void setTransform(
    	Mat44 mTransform
    ) {
    	setTransform(
    		this.segment,
    		mTransform.memorySegment()
    	);
    }
    
    public static void getInvTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_INV_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvTransform].
    public final void getInvTransform(
    	Mat44 outResult
    ) {
    	getInvTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setInvTransform(
    	MemorySegment self,
    	MemorySegment mInvTransform
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_INV_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvTransform].
    public final void setInvTransform(
    	Mat44 mInvTransform
    ) {
    	setInvTransform(
    		this.segment,
    		mInvTransform.memorySegment()
    	);
    }
    
    public static void getScale(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getScale].
    public final void getScale(
    	Vec3 outResult
    ) {
    	getScale(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setScale(
    	MemorySegment self,
    	MemorySegment mScale
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setScale].
    public final void setScale(
    	Vec3 mScale
    ) {
    	setScale(
    		this.segment,
    		mScale.memorySegment()
    	);
    }
    
    public static void getLocalPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_LOCAL_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalPosition].
    public final void getLocalPosition(
    	Vec3 outResult
    ) {
    	getLocalPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setLocalPosition(
    	MemorySegment self,
    	MemorySegment mLocalPosition
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_LOCAL_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLocalPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLocalPosition].
    public final void setLocalPosition(
    	Vec3 mLocalPosition
    ) {
    	setLocalPosition(
    		this.segment,
    		mLocalPosition.memorySegment()
    	);
    }
    
    public static void getV0(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V0.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV0].
    public final void getV0(
    	Vec3 outResult
    ) {
    	getV0(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV0(
    	MemorySegment self,
    	MemorySegment mV0
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V0.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV0].
    public final void setV0(
    	Vec3 mV0
    ) {
    	setV0(
    		this.segment,
    		mV0.memorySegment()
    	);
    }
    
    public static void getV1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV1].
    public final void getV1(
    	Vec3 outResult
    ) {
    	getV1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV1(
    	MemorySegment self,
    	MemorySegment mV1
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV1].
    public final void setV1(
    	Vec3 mV1
    ) {
    	setV1(
    		this.segment,
    		mV1.memorySegment()
    	);
    }
    
    public static void getV2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV2].
    public final void getV2(
    	Vec3 outResult
    ) {
    	getV2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV2(
    	MemorySegment self,
    	MemorySegment mV2
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV2].
    public final void setV2(
    	Vec3 mV2
    ) {
    	setV2(
    		this.segment,
    		mV2.memorySegment()
    	);
    }
    
    public static void getClosestPoint(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestPoint].
    public final void getClosestPoint(
    	Vec3 outResult
    ) {
    	getClosestPoint(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setClosestPoint(
    	MemorySegment self,
    	MemorySegment mClosestPoint
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mClosestPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setClosestPoint].
    public final void setClosestPoint(
    	Vec3 mClosestPoint
    ) {
    	setClosestPoint(
    		this.segment,
    		mClosestPoint.memorySegment()
    	);
    }
    
    public static float getNormalSign(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_NORMAL_SIGN.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalSign].
    public final float getNormalSign() {
    	return getNormalSign(
    		this.segment
    	);
    }
    
    public static void setNormalSign(
    	MemorySegment self,
    	float mNormalSign
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_NORMAL_SIGN.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalSign
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalSign].
    public final void setNormalSign(
    	float mNormalSign
    ) {
    	setNormalSign(
    		this.segment,
    		mNormalSign
    	);
    }
    
    public static float getClosestDistanceSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_CLOSEST_DISTANCE_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestDistanceSq].
    public final float getClosestDistanceSq() {
    	return getClosestDistanceSq(
    		this.segment
    	);
    }
    
    public static void setClosestDistanceSq(
    	MemorySegment self,
    	float mClosestDistanceSq
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_CLOSEST_DISTANCE_SQ.get();
    	try {
    		 method.invokeExact(
    			self,
    			mClosestDistanceSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setClosestDistanceSq].
    public final void setClosestDistanceSq(
    	float mClosestDistanceSq
    ) {
    	setClosestDistanceSq(
    		this.segment,
    		mClosestDistanceSq
    	);
    }
    
    public static int getSet(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_SET.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSet].
    public final int getSet() {
    	return getSet(
    		this.segment
    	);
    }
    
    public static void setSet(
    	MemorySegment self,
    	int mSet
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSet
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSet].
    public final void setSet(
    	int mSet
    ) {
    	setSet(
    		this.segment,
    		mSet
    	);
    }
    
    /// ```
    /// Triangles are considered to have some thickness. This thickness extends backwards along the negative triangle normal.
    /// Make this value smaller than the smallest 'wall thickness' so that the back side of the triangle doesn't protrude through the other side.
    /// Make this value too small and tunneling is more likely to occur.
    /// ```
    public static float getTriangleThickness() {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_GET_TRIANGLE_THICKNESS.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Triangles are considered to have some thickness. This thickness extends backwards along the negative triangle normal.
    /// Make this value smaller than the smallest 'wall thickness' so that the back side of the triangle doesn't protrude through the other side.
    /// Make this value too small and tunneling is more likely to occur.
    /// ```
    public static void setTriangleThickness(
    	float sTriangleThickness
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_SET_TRIANGLE_THICKNESS.get();
    	try {
    		 method.invokeExact(
    			sTriangleThickness
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void startVertex(
    	MemorySegment self,
    	MemorySegment inVertex
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_START_VERTEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#startVertex].
    public final void startVertex(
    	CollideSoftBodyVertexIterator inVertex
    ) {
    	startVertex(
    		this.segment,
    		inVertex.memorySegment()
    	);
    }
    
    public static void processTriangle(
    	MemorySegment self,
    	MemorySegment inV0,
    	MemorySegment inV1,
    	MemorySegment inV2
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_PROCESS_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV0,
    			inV1,
    			inV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#processTriangle].
    public final void processTriangle(
    	Vec3 inV0,
    	Vec3 inV1,
    	Vec3 inV2
    ) {
    	processTriangle(
    		this.segment,
    		inV0.memorySegment(),
    		inV1.memorySegment(),
    		inV2.memorySegment()
    	);
    }
    
    public static void finishVertex(
    	MemorySegment self,
    	MemorySegment ioVertex,
    	int inCollidingShapeIndex
    ) {
    	MethodHandle method = JPH_COLLIDE_SOFT_BODY_VERTICES_VS_TRIANGLES_FINISH_VERTEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioVertex,
    			inCollidingShapeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#finishVertex].
    public final void finishVertex(
    	CollideSoftBodyVertexIterator ioVertex,
    	int inCollidingShapeIndex
    ) {
    	finishVertex(
    		this.segment,
    		ioVertex.memorySegment(),
    		inCollidingShapeIndex
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}