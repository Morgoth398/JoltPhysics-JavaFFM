/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.StringView;

import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsMaterialSimple extends PhysicsMaterial {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_SIMPLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_SIMPLE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_SIMPLE_AS_PHYSICS_MATERIAL;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_MATERIAL_SIMPLE_CREATE = downcallHandle("JPH_PhysicsMaterialSimple_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_SIMPLE_CREATE1 = downcallHandle("JPH_PhysicsMaterialSimple_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_MATERIAL_SIMPLE_AS_PHYSICS_MATERIAL = downcallHandle("JPH_PhysicsMaterialSimple_AsPhysicsMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsMaterialSimple() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsMaterialSimple(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asPhysicsMaterial(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PhysicsMaterialSimple(
	    StringView inName,
	    Color inColor
	) {
	    this(
	        Arena.ofAuto(),
	        inName,
	        inColor
	    );
	}
	
	/// Typed method of [#create1].
	public PhysicsMaterialSimple(
		Arena arena,
		StringView inName,
		Color inColor
	) {
		MemorySegment segment = create1(
			inName.memorySegment(),
			inColor.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asPhysicsMaterial(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PhysicsMaterialSimple(MemorySegment segment) {
		this.segment = segment;
		super(asPhysicsMaterial(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_SIMPLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inName,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_SIMPLE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inName,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asPhysicsMaterial(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_MATERIAL_SIMPLE_AS_PHYSICS_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}