/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class BroadPhaseLayerInterfaceMask extends BroadPhaseLayerInterface {

	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_AS_BROAD_PHASE_LAYER_INTERFACE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_SHOULD_COLLIDE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceMask_Create", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_AS_BROAD_PHASE_LAYER_INTERFACE = downcallHandle("JPH_BroadPhaseLayerInterfaceMask_AsBroadPhaseLayerInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceMask_ConfigureLayer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_SHOULD_COLLIDE = downcallHandle("JPH_BroadPhaseLayerInterfaceMask_ShouldCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_SHORT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BroadPhaseLayerInterfaceMask(
	    int inNumBroadPhaseLayers
	) {
	    this(
	        Arena.ofAuto(),
	        inNumBroadPhaseLayers
	    );
	}
	
	/// Typed method of [#create].
	public BroadPhaseLayerInterfaceMask(
		Arena arena,
		int inNumBroadPhaseLayers
	) {
		MemorySegment segment = create(
			inNumBroadPhaseLayers
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBroadPhaseLayerInterface(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BroadPhaseLayerInterfaceMask(MemorySegment segment) {
		this.segment = segment;
		super(asBroadPhaseLayerInterface(segment));
	}

    public static MemorySegment create(
    	int inNumBroadPhaseLayers
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNumBroadPhaseLayers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBroadPhaseLayerInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_AS_BROAD_PHASE_LAYER_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void configureLayer(
    	MemorySegment self,
    	MemorySegment inBroadPhaseLayer,
    	int inGroupsToInclude,
    	int inGroupsToExclude
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBroadPhaseLayer,
    			inGroupsToInclude,
    			inGroupsToExclude
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configureLayer].
    public final void configureLayer(
    	BroadPhaseLayer inBroadPhaseLayer,
    	int inGroupsToInclude,
    	int inGroupsToExclude
    ) {
    	configureLayer(
    		this.segment,
    		inBroadPhaseLayer.memorySegment(),
    		inGroupsToInclude,
    		inGroupsToExclude
    	);
    }
    
    /// ```
    /// Returns true if an object layer should collide with a broadphase layer, this function is being called from ObjectVsBroadPhaseLayerFilterMask
    /// ```
    public static boolean shouldCollide(
    	MemorySegment self,
    	short inLayer1,
    	MemorySegment inLayer2
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_SHOULD_COLLIDE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inLayer1,
    			inLayer2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shouldCollide].
    public final boolean shouldCollide(
    	short inLayer1,
    	BroadPhaseLayer inLayer2
    ) {
    	return shouldCollide(
    		this.segment,
    		inLayer1,
    		inLayer2.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}