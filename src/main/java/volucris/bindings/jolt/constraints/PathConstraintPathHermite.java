/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class PathConstraintPathHermite extends PathConstraintPath {

	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_HERMITE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_HERMITE_AS_PATH_CONSTRAINT_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_PATH_HERMITE_ADD_POINT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PATH_CONSTRAINT_PATH_HERMITE_CREATE = downcallHandle("JPH_PathConstraintPathHermite_Create", UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_HERMITE_AS_PATH_CONSTRAINT_PATH = downcallHandle("JPH_PathConstraintPathHermite_AsPathConstraintPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_PATH_HERMITE_ADD_POINT = downcallHandleVoid("JPH_PathConstraintPathHermite_AddPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PathConstraintPathHermite() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PathConstraintPathHermite(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asPathConstraintPath(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PathConstraintPathHermite(MemorySegment segment) {
		this.segment = segment;
		super(asPathConstraintPath(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_HERMITE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asPathConstraintPath(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_HERMITE_AS_PATH_CONSTRAINT_PATH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Adds a point to the path
    /// ```
    public static void addPoint(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inTangent,
    	MemorySegment inNormal
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_PATH_HERMITE_ADD_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inTangent,
    			inNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addPoint].
    public final void addPoint(
    	Vec3 inPosition,
    	Vec3 inTangent,
    	Vec3 inNormal
    ) {
    	addPoint(
    		this.segment,
    		inPosition.memorySegment(),
    		inTangent.memorySegment(),
    		inNormal.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}