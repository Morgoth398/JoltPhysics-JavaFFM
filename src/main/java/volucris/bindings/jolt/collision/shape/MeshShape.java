/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.collision.PhysicsMaterialList;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MeshShape extends Shape {

	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_GROUPS;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_GROUPS;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_OUTLINES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_MATERIAL_LIST;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_MATERIAL_INDEX;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MESH_SHAPE_CREATE = downcallHandle("JPH_MeshShape_Create", UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_CREATE1 = downcallHandle("JPH_MeshShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_AS_SHAPE = downcallHandle("JPH_MeshShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_GROUPS = downcallHandle("JPH_MeshShape_GetDrawTriangleGroups", JAVA_BOOLEAN);
		JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_GROUPS = downcallHandleVoid("JPH_MeshShape_SetDrawTriangleGroups", JAVA_BOOLEAN);
		JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_OUTLINES = downcallHandle("JPH_MeshShape_GetDrawTriangleOutlines", JAVA_BOOLEAN);
		JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_OUTLINES = downcallHandleVoid("JPH_MeshShape_SetDrawTriangleOutlines", JAVA_BOOLEAN);
		JPH_MESH_SHAPE_GET_MATERIAL_LIST = downcallHandle("JPH_MeshShape_GetMaterialList", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_GET_MATERIAL_INDEX = downcallHandle("JPH_MeshShape_GetMaterialIndex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShape_GetTriangleUserData", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MeshShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MeshShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MeshShape(
	    MeshShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public MeshShape(
		Arena arena,
		MeshShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MeshShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_MESH_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean getDrawTriangleGroups() {
    	MethodHandle method = JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_GROUPS.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setDrawTriangleGroups(
    	boolean sDrawTriangleGroups
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_GROUPS.get();
    	try {
    		 method.invokeExact(
    			sDrawTriangleGroups
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean getDrawTriangleOutlines() {
    	MethodHandle method = JPH_MESH_SHAPE_GET_DRAW_TRIANGLE_OUTLINES.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setDrawTriangleOutlines(
    	boolean sDrawTriangleOutlines
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SET_DRAW_TRIANGLE_OUTLINES.get();
    	try {
    		 method.invokeExact(
    			sDrawTriangleOutlines
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the list of all materials
    /// ```
    public static MemorySegment getMaterialList(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_GET_MATERIAL_LIST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialList].
    public final @Nullable PhysicsMaterialList getMaterialList() {
    	MemorySegment segment = getMaterialList(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterialList(segment);
    }
    
    /// ```
    /// Determine which material index a particular sub shape uses (note that if there are no materials this function will return 0 so check the array size)
    /// Note: This could for example be used to create a decorator shape around a mesh shape that overrides the GetMaterial call to replace a material with another material.
    /// ```
    public static int getMaterialIndex(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_GET_MATERIAL_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterialIndex].
    public final int getMaterialIndex(
    	SubShapeID inSubShapeID
    ) {
    	return getMaterialIndex(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    public static int getTriangleUserData(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTriangleUserData].
    public final int getTriangleUserData(
    	SubShapeID inSubShapeID
    ) {
    	return getTriangleUserData(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}