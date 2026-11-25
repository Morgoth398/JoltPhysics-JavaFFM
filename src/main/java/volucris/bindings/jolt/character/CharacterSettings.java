/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterSettings extends CharacterBaseSettings {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_AS_CHARACTER_BASE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_GET_LAYER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_SET_LAYER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_GET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_SET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_GET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_SET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_GET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_SET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_GET_ALLOWED_DOFS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_SETTINGS_SET_ALLOWED_DOFS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_SETTINGS_CREATE = downcallHandle("JPH_CharacterSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_CREATE1 = downcallHandle("JPH_CharacterSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_AS_CHARACTER_BASE_SETTINGS = downcallHandle("JPH_CharacterSettings_AsCharacterBaseSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_GET_LAYER = downcallHandle("JPH_CharacterSettings_GetLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_SET_LAYER = downcallHandleVoid("JPH_CharacterSettings_SetLayer", UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_CHARACTER_SETTINGS_GET_MASS = downcallHandle("JPH_CharacterSettings_GetMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_SET_MASS = downcallHandleVoid("JPH_CharacterSettings_SetMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_SETTINGS_GET_FRICTION = downcallHandle("JPH_CharacterSettings_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_CharacterSettings_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_CharacterSettings_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_CharacterSettings_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_SETTINGS_GET_ALLOWED_DOFS = downcallHandle("JPH_CharacterSettings_GetAllowedDOFs", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_SETTINGS_SET_ALLOWED_DOFS = downcallHandleVoid("JPH_CharacterSettings_SetAllowedDOFs", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public CharacterSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBaseSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterSettings(
	    CharacterSettings param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterSettings(
		Arena arena,
		CharacterSettings param0
	) {
		MemorySegment segment = create1(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBaseSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterBaseSettings(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterBaseSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_AS_CHARACTER_BASE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Layer that this character will be added to
    /// ```
    public static short getLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_GET_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLayer].
    public final short getLayer() {
    	return getLayer(
    		this.segment
    	);
    }
    
    /// ```
    /// Layer that this character will be added to
    /// ```
    public static void setLayer(
    	MemorySegment self,
    	short mLayer
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_SET_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLayer].
    public final void setLayer(
    	short mLayer
    ) {
    	setLayer(
    		this.segment,
    		mLayer
    	);
    }
    
    /// ```
    /// Mass of the character
    /// ```
    public static float getMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_GET_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMass].
    public final float getMass() {
    	return getMass(
    		this.segment
    	);
    }
    
    /// ```
    /// Mass of the character
    /// ```
    public static void setMass(
    	MemorySegment self,
    	float mMass
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_SET_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMass].
    public final void setMass(
    	float mMass
    ) {
    	setMass(
    		this.segment,
    		mMass
    	);
    }
    
    /// ```
    /// Friction for the character
    /// ```
    public static float getFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_GET_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFriction].
    public final float getFriction() {
    	return getFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction for the character
    /// ```
    public static void setFriction(
    	MemorySegment self,
    	float mFriction
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_SET_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFriction].
    public final void setFriction(
    	float mFriction
    ) {
    	setFriction(
    		this.segment,
    		mFriction
    	);
    }
    
    /// ```
    /// Value to multiply gravity with for this character
    /// ```
    public static float getGravityFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_GET_GRAVITY_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityFactor].
    public final float getGravityFactor() {
    	return getGravityFactor(
    		this.segment
    	);
    }
    
    /// ```
    /// Value to multiply gravity with for this character
    /// ```
    public static void setGravityFactor(
    	MemorySegment self,
    	float mGravityFactor
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_SET_GRAVITY_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mGravityFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravityFactor].
    public final void setGravityFactor(
    	float mGravityFactor
    ) {
    	setGravityFactor(
    		this.segment,
    		mGravityFactor
    	);
    }
    
    /// ```
    /// Allowed degrees of freedom for this character
    /// ```
    public static int getAllowedDOFs(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_GET_ALLOWED_DOFS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowedDOFs].
    public final int getAllowedDOFs() {
    	return getAllowedDOFs(
    		this.segment
    	);
    }
    
    /// ```
    /// Allowed degrees of freedom for this character
    /// ```
    public static void setAllowedDOFs(
    	MemorySegment self,
    	int mAllowedDOFs
    ) {
    	MethodHandle method = JPH_CHARACTER_SETTINGS_SET_ALLOWED_DOFS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAllowedDOFs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowedDOFs].
    public final void setAllowedDOFs(
    	int mAllowedDOFs
    ) {
    	setAllowedDOFs(
    		this.segment,
    		mAllowedDOFs
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}