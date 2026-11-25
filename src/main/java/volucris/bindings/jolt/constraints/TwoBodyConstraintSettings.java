/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.Body;

import static volucris.bindings.core.FFMUtils.*;

public sealed class TwoBodyConstraintSettings extends ConstraintSettings
		permits ConeConstraintSettings,
		FixedConstraintSettings,
		GearConstraintSettings,
		HingeConstraintSettings,
		PathConstraintSettings,
		PointConstraintSettings,
		PulleyConstraintSettings,
		RackAndPinionConstraintSettings,
		SixDOFConstraintSettings,
		SliderConstraintSettings,
		SwingTwistConstraintSettings,
		DistanceConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_SETTINGS_CREATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS = downcallHandle("JPH_TwoBodyConstraintSettings_AsConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_TwoBodyConstraintSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TwoBodyConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConstraintSettings(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConstraintSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create an instance of this constraint
    /// You can use Body::sFixedToWorld for inBody1 if you want to attach inBody2 to the world
    /// ```
    public static MemorySegment create(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inBody2
    ) {
    	MethodHandle method = JPH_TWO_BODY_CONSTRAINT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBody1,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create].
    public final @Nullable TwoBodyConstraint create(
    	Body inBody1,
    	Body inBody2
    ) {
    	MemorySegment segment = create(
    		this.segment,
    		inBody1.memorySegment(),
    		inBody2.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TwoBodyConstraint(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}