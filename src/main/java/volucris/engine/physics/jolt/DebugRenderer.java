package volucris.engine.physics.jolt;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.graphics.BoundingBox;
import volucris.engine.graphics.Color;
import volucris.engine.physics.jolt.JoltEnums.CastShadow;
import volucris.engine.physics.jolt.JoltEnums.DrawMode;
import volucris.engine.physics.jolt.math.AABox;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Simple triangle renderer for debugging purposes.
 * <p>
 * Inherit from this class to provide your own implementation.
 * <p>
 * Implement the following virtual functions:
 * <ul>
 * <li>DrawLine
 * <li>DrawTriangle
 * <li>DrawText3D
 * <li>CreateTriangleBatch
 * <li>DrawGeometry
 * </ul>
 * Make sure you call Initialize() from the constructor of your implementation.
 * <p>
 * The CreateTriangleBatch is used to prepare a batch of triangles to be drawn
 * by a single DrawGeometry call, which means that Jolt can render a complex
 * scene much more efficiently than when each triangle in that scene would have
 * been drawn through DrawTriangle.
 * <p>
 * Note that an implementation that implements CreateTriangleBatch and
 * DrawGeometry is provided by DebugRendererSimple which can be used to start
 * quickly.
 * <p>
 */
public abstract class DebugRenderer {

	private static final ArrayList<WeakReference<DebugRenderer>> RENDERERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_DEBUG_RENDERER_SET_PROCS;
	private static final MethodHandle JPH_DEBUG_RENDERER_CREATE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DESTROY;
	private static final MethodHandle JPH_DEBUG_RENDERER_NEXT_FRAME;
	private static final MethodHandle JPH_DEBUG_RENDERER_SET_CAMERA_POS;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_LINE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_WIRE_BOX;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_MARKER;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_ARROW;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_PLANE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_TRIANGLE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_BOX;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_BOX2;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_SPHERE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_CAPSULE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_CYLINDER;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_OPEN_CONE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_PIE;
	private static final MethodHandle JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER;

	private static final VarHandle DRAW_LINE;
	private static final VarHandle DRAW_TRIANGLE;
	private static final VarHandle DRAW_TEXT_3D;

	private static final MemorySegment DEBUG_RENDERER_PROCS;

	private static MemorySegment DRAW_LINE_ADDR;
	private static MemorySegment DRAW_TRIANGLE_ADDR;
	private static MemorySegment DRAW_TEXT_3D_ADDR;

	private static int count;

	private final MemorySegment jphDebugRenderer;
	private final MemorySegment userData;

	private Color color;

	private Vector3f vector1;
	private Vector3f vector2;
	private Vector3f vector3;

	private Mat4 matTmp;

	private AABox boxTmp;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;
	private Vec3 vecTmp3;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("DrawLine"),
				ADDRESS.withName("DrawTriangle"),
				ADDRESS.withName("DrawText3D")
			);
		
		JPH_DEBUG_RENDERER_SET_PROCS = downcallHandleVoid("JPH_DebugRenderer_SetProcs", ADDRESS);
		JPH_DEBUG_RENDERER_CREATE = downcallHandle("JPH_DebugRenderer_Create", ADDRESS, ADDRESS);
		JPH_DEBUG_RENDERER_DESTROY = downcallHandleVoid("JPH_DebugRenderer_Destroy", ADDRESS);
		JPH_DEBUG_RENDERER_NEXT_FRAME = downcallHandleVoid("JPH_DebugRenderer_NextFrame", ADDRESS);
		JPH_DEBUG_RENDERER_SET_CAMERA_POS = downcallHandleVoid("JPH_DebugRenderer_SetCameraPos", ADDRESS, ADDRESS);
		JPH_DEBUG_RENDERER_DRAW_LINE = downcallHandleVoid("JPH_DebugRenderer_DrawLine", ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox", ADDRESS, ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2 = downcallHandleVoid("JPH_DebugRenderer_DrawWireBox2", ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_MARKER = downcallHandleVoid("JPH_DebugRenderer_DrawMarker", ADDRESS, ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_ARROW = downcallHandleVoid("JPH_DebugRenderer_DrawArrow", ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM = downcallHandleVoid("JPH_DebugRenderer_DrawCoordinateSystem", ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_PLANE = downcallHandleVoid("JPH_DebugRenderer_DrawPlane", ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE = downcallHandleVoid("JPH_DebugRenderer_DrawWireTriangle", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireSphere", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawWireUnitSphere", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_TRIANGLE = downcallHandleVoid("JPH_DebugRenderer_DrawTriangle", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_BOX = downcallHandleVoid("JPH_DebugRenderer_DrawBox", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_BOX2 = downcallHandleVoid("JPH_DebugRenderer_DrawBox2", ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawSphere", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE = downcallHandleVoid("JPH_DebugRenderer_DrawUnitSphere", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_CAPSULE = downcallHandleVoid("JPH_DebugRenderer_DrawCapsule", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawCylinder", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_OPEN_CONE = downcallHandleVoid("JPH_DebugRenderer_DrawOpenCone", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingConeLimits", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS = downcallHandleVoid("JPH_DebugRenderer_DrawSwingPyramidLimits", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_PIE = downcallHandleVoid("JPH_DebugRenderer_DrawPie", ADDRESS, ADDRESS, JAVA_FLOAT, ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER = downcallHandleVoid("JPH_DebugRenderer_DrawTaperedCylinder", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT);
		//@formatter:on

		DRAW_LINE = varHandle(LAYOUT, "DrawLine");
		DRAW_TRIANGLE = varHandle(LAYOUT, "DrawTriangle");
		DRAW_TEXT_3D = varHandle(LAYOUT, "DrawText3D");

		Arena arena = Arena.ofAuto();
		DEBUG_RENDERER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		RENDERERS = new ArrayList<WeakReference<DebugRenderer>>();
	}

	public DebugRenderer() {
		try {
			int index = count++;

			Arena arena = Arena.ofAuto();

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_DEBUG_RENDERER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);
			jphDebugRenderer = segment.reinterpret(arena, s -> destroy(s));

			RENDERERS.add(index, new WeakReference<DebugRenderer>(this));

			vector1 = new Vector3f();
			vector2 = new Vector3f();
			vector3 = new Vector3f();

			vecTmp = new Vec3(arena);
			vecTmp2 = new Vec3(arena);
			vecTmp3 = new Vec3(arena);

			matTmp = new Mat4(arena);

			boxTmp = new AABox(arena);

			color = new Color();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create debug renderer.");
		}
	}

	protected abstract void drawLineImpl(Vector3f from, Vector3f to, Color color);

	protected abstract void drawTriangleImpl(Vector3f v1, Vector3f v2, Vector3f v3, Color color, CastShadow castShadow);

	protected abstract void drawText3DImpl(Vector3f position, String str, Color color, float height);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_DEBUG_RENDERER_SET_PROCS;
			method.invokeExact(DEBUG_RENDERER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set debug renderer procs.");
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(DebugRenderer.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}

		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		AddressLayout VEC3_ADDRESS = ADDRESS.withTargetLayout(Vec3.LAYOUT());
		
		FunctionDescriptor drawLine = functionDescrVoid(INT_ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS, JAVA_INT);
		FunctionDescriptor drawTriangle = functionDescrVoid(INT_ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS, VEC3_ADDRESS, JAVA_INT, JAVA_INT);
		FunctionDescriptor drawText3D = functionDescrVoid(INT_ADDRESS, VEC3_ADDRESS, ADDRESS, JAVA_INT, JAVA_FLOAT);

		MethodHandle drawLineHandle = upcallHandleStatic(lookup, DebugRenderer.class, "drawLine", drawLine);
		MethodHandle drawTrianglehandle = upcallHandleStatic(lookup, DebugRenderer.class, "drawTriangle", drawTriangle);
		MethodHandle drawText3DHandle = upcallHandleStatic(lookup, DebugRenderer.class, "drawText3D", drawText3D);

		DRAW_LINE_ADDR = upcallStub(drawLineHandle, drawLine, arena);
		DRAW_TRIANGLE_ADDR = upcallStub(drawTrianglehandle, drawTriangle, arena);
		DRAW_TEXT_3D_ADDR = upcallStub(drawText3DHandle, drawText3D, arena);

		DRAW_LINE.set(DEBUG_RENDERER_PROCS, DRAW_LINE_ADDR);
		DRAW_TRIANGLE.set(DEBUG_RENDERER_PROCS, DRAW_TRIANGLE_ADDR);
		DRAW_TEXT_3D.set(DEBUG_RENDERER_PROCS, DRAW_TEXT_3D_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_DEBUG_RENDERER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy debug renderer.");
		}
	}

	public void nextFrame() {
		try {
			MethodHandle method = JPH_DEBUG_RENDERER_NEXT_FRAME;
			method.invokeExact(jphDebugRenderer);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call next frame.");
		}
	}

	public void setCameraPos(Vector3f position) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_DEBUG_RENDERER_SET_CAMERA_POS;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set camera pos.");
		}
	}

	public void drawLine(Vector3f from, Vector3f to, Color color) {
		try {
			vecTmp.set(from);
			vecTmp2.set(to);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_LINE;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), vecTmp2.memorySegment(), color.toInt());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw line.");
		}
	}

	public void drawWireBox(BoundingBox box, Color color) {
		try {
			boxTmp.set(box);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX;
			method.invokeExact(jphDebugRenderer, boxTmp.memorySegment(), color.toInt());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw wire box.");
		}
	}

	public void drawWireBox(Matrix4f matrix, BoundingBox box, Color color) {
		try {
			matTmp.set(matrix);
			boxTmp.set(box);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_BOX2;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), boxTmp.memorySegment(), color.toInt());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw wire box.");
		}
	}

	public void drawMarker(Vector3f position, Color color, float size) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_MARKER;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), color.toInt(), size);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw marker.");
		}
	}

	public void drawArrow(Vector3f from, Vector3f to, Color color, float size) {
		try {
			vecTmp.set(from);
			vecTmp2.set(to);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_ARROW;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), vecTmp2.memorySegment(), color.toInt(), size);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw arrow.");
		}
	}

	public void drawCoordinateSystem(Matrix4f matrix, float size) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_COORDINATE_SYSTEM;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), size);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw coordinate system.");
		}
	}

	public void drawPlane(int point, Vector3f normal, Color color, float size) {
		try {
			vecTmp.set(normal);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PLANE;
			method.invokeExact(jphDebugRenderer, point, vecTmp.memorySegment(), color.toInt(), size);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call drawPlane.");
		}
	}

	public void drawWireTriangle(Vector3f v1, Vector3f v2, Vector3f v3, Color color) {
		try {
			vecTmp.set(v1);
			vecTmp2.set(v2);
			vecTmp3.set(v3);

			MemorySegment v1Addr = vecTmp.memorySegment();
			MemorySegment v2Addr = vecTmp2.memorySegment();
			MemorySegment v3Addr = vecTmp3.memorySegment();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_TRIANGLE;
			method.invokeExact(jphDebugRenderer, v1Addr, v2Addr, v3Addr, color.toInt());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw wire triangle.");
		}
	}

	public void drawWireSphere(Vector3f center, float radius, Color color, int level) {
		try {
			vecTmp.set(center);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_SPHERE;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), radius, color.toInt(), level);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw wire sphere.");
		}
	}

	public void drawWireUnitSphere(Matrix4f matrix, Color color, int level) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_WIRE_UNIT_SPHERE;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), color.toInt(), level);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw wire unit sphere.");
		}
	}

	public void drawTriangle(Vector3f v1, Vector3f v2, Vector3f v3, Color color, CastShadow castShadow) {
		try {
			vecTmp.set(v1);
			vecTmp2.set(v2);
			vecTmp3.set(v3);

			MemorySegment v1Addr = vecTmp.memorySegment();
			MemorySegment v2Addr = vecTmp2.memorySegment();
			MemorySegment v3Addr = vecTmp3.memorySegment();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_TRIANGLE;
			method.invokeExact(jphDebugRenderer, v1Addr, v2Addr, v3Addr, color.toInt(), castShadow.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw triangle.");
		}
	}

	public void drawBox(BoundingBox box, Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			boxTmp.set(box);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX;
			method.invokeExact(jphDebugRenderer, boxTmp.memorySegment(), color.toInt(), castShadow.id(), drawMode.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw box.");
		}
	}

	public void drawBox(Matrix4f matrix, BoundingBox box, Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			matTmp.set(matrix);
			boxTmp.set(box);

			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment boxAddr = boxTmp.memorySegment();

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_BOX2;
			method.invokeExact(jphDebugRenderer, matAddr, boxAddr, color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw box.");
		}
	}

	public void drawSphere(Vector3f center, float radius, Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			vecTmp.set(center);

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SPHERE;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), radius, color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw sphere.");
		}
	}

	public void drawUnitSphere(Matrix4f matrix, Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_UNIT_SPHERE;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw unit sphere.");
		}
	}

	public void drawCapsule(Matrix4f matrix, float halfHeightOfCylinder, float radius, Color color,
			CastShadow castShadow, DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			float height = halfHeightOfCylinder;

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CAPSULE;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), height, radius, color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw capsule.");
		}
	}

	public void drawCylinder(Matrix4f matrix, float halfHeight, float radius, Color color, CastShadow castShadow,
			DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			float height = halfHeight;

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_CYLINDER;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), height, radius, color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw cylinder.");
		}
	}

	public void drawOpenCone(Vector3f top, Vector3f axis, Vector3f perpendicular, float halfAngle, float length,
			Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			vecTmp.set(top);
			vecTmp2.set(axis);
			vecTmp3.set(perpendicular);

			MemorySegment renderer = jphDebugRenderer;
			MemorySegment topAddr = vecTmp.memorySegment();
			MemorySegment axisAddr = vecTmp2.memorySegment();
			MemorySegment perpAddr = vecTmp3.memorySegment();

			int shadow = castShadow.id();
			int mode = drawMode.id();

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_OPEN_CONE;
			method.invokeExact(renderer, topAddr, axisAddr, perpAddr, halfAngle, length, color.toInt(), shadow, mode);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw open cone.");
		}
	}

	public void drawSwingConeLimits(Matrix4f matrix, float swingYHalfAngle, float swingZHalfAngle, float edgeLength,
			Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_CONE_LIMITS;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), swingYHalfAngle, swingZHalfAngle, edgeLength,
					color.toInt(), castShadow.id(), drawMode.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw swing cone limits.");
		}
	}

	public void drawSwingPyramidLimits(Matrix4f matrix, float minSwingYAngle, float maxSwingYAngle,
			float minSwingZAngle, float maxSwingZAngle, float edgeLength, Color color, CastShadow castShadow,
			DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_SWING_PYRAMID_LIMITS;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), minSwingYAngle, maxSwingYAngle, minSwingZAngle,
					maxSwingZAngle, edgeLength, color.toInt(), castShadow.id(), drawMode.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw swing pyramid limits.");
		}
	}

	public void drawPie(Vector3f center, float radius, Vector3f normal, Vector3f axis, float minAngle, float maxAngle,
			Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			vecTmp.set(center);
			vecTmp2.set(normal);
			vecTmp3.set(axis);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_PIE;
			method.invokeExact(jphDebugRenderer, vecTmp.memorySegment(), radius, vecTmp2.memorySegment(),
					vecTmp3.memorySegment(), minAngle, maxAngle, color.toInt(), castShadow.id(), drawMode.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw pie.");
		}
	}

	public void drawTaperedCylinder(Matrix4f matrix, float top, float bottom, float topRadius, float bottomRadius,
			Color color, CastShadow castShadow, DrawMode drawMode) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_DEBUG_RENDERER_DRAW_TAPERED_CYLINDER;
			method.invokeExact(jphDebugRenderer, matTmp.memorySegment(), top, bottom, topRadius, bottomRadius,
					color.toInt(), castShadow.id(), drawMode.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot draw tapered cylinder.");
		}
	}

	@SuppressWarnings("unused")
	private static void drawLine(MemorySegment userData, MemorySegment from, MemorySegment to, int color) {
		DebugRenderer renderer = RENDERERS.get(userData.get(JAVA_INT, 0)).get();

		renderer.vecTmp.set(from);
		Vector3f fromVector = renderer.vecTmp.get(renderer.vector1);
		renderer.vecTmp.set(to);
		Vector3f toVector = renderer.vecTmp.get(renderer.vector2);

		renderer.drawLineImpl(fromVector, toVector, renderer.color.set(color, true));
	}

	@SuppressWarnings("unused")
	private static void drawTriangle(MemorySegment userData, MemorySegment v1, MemorySegment v2, MemorySegment v3,
			int color, int castShadow) {
		DebugRenderer renderer = RENDERERS.get(userData.get(JAVA_INT, 0)).get();

		renderer.vecTmp.set(v1);
		Vector3f vertex1 = renderer.vecTmp.get(renderer.vector1);
		renderer.vecTmp.set(v2);
		Vector3f vertex2 = renderer.vecTmp.get(renderer.vector2);
		renderer.vecTmp.set(v3);
		Vector3f vertex3 = renderer.vecTmp.get(renderer.vector3);

		Color colorObject = renderer.color.set(color, true);

		CastShadow shadow = castShadow == CastShadow.OFF.id() ? CastShadow.OFF : CastShadow.ON;

		renderer.drawTriangleImpl(vertex1, vertex2, vertex3, colorObject, shadow);
	}

	@SuppressWarnings("unused")
	private static void drawText3D(MemorySegment userData, MemorySegment position, MemorySegment str, int color,
			float height) {
		DebugRenderer renderer = RENDERERS.get(userData.get(JAVA_INT, 0)).get();

		renderer.vecTmp.set(position);
		Vector3f pos = renderer.vecTmp.get(renderer.vector1);

		String string = str.reinterpret(Integer.MAX_VALUE).getString(0);

		Color colorObject = renderer.color.set(color, true);

		renderer.drawText3DImpl(pos, string, colorObject, height);
	}

	public MemorySegment memorySegment() {
		return jphDebugRenderer;
	}

}