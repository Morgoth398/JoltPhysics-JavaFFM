/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class ShapeSettings
		permits CompoundShapeSettings,
		ConvexShapeSettings,
		EmptyShapeSettings,
		HeightFieldShapeSettings,
		MeshShapeSettings,
		PlaneShapeSettings,
		OffsetCenterOfMassShapeSettings,
		ScaledShapeSettings,
		RotatedTranslatedShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_SETTINGS_SET_USER_DATA;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SHAPE_SETTINGS_DESTROY = downcallHandleVoid("JPH_ShapeSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_SHAPE_SETTINGS_GET_USER_DATA = downcallHandle("JPH_ShapeSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_SHAPE_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_ShapeSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        //@formatter:on
    }

    public ShapeSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SHAPE_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static long getUserData(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SHAPE_SETTINGS_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUserData}.
     */
    public final long getUserData(
    ) {
        return (long) getUserData(
            this.segment
        );
    }
    
    public static void setUserData(
        MemorySegment settings, 
        long userData
    ) {
        MethodHandle method = JPH_SHAPE_SETTINGS_SET_USER_DATA.get();
        try {
            method.invokeExact(
                settings, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        long userData
    ) {
        setUserData(
            this.segment, 
            userData
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}