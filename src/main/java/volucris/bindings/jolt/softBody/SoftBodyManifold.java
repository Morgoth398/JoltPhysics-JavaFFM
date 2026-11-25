/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyManifold {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_HAS_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_LOCAL_CONTACT_POINT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_NUM_SENSOR_CONTACTS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_MANIFOLD_GET_SENSOR_CONTACT_BODY_ID;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_MANIFOLD_DESTROY = downcallHandleVoid("JPH_SoftBodyManifold_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_VERTICES = downcallHandle("JPH_SoftBodyManifold_GetVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_HAS_CONTACT = downcallHandle("JPH_SoftBodyManifold_HasContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_LOCAL_CONTACT_POINT = downcallHandleVoid("JPH_SoftBodyManifold_GetLocalContactPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_NORMAL = downcallHandleVoid("JPH_SoftBodyManifold_GetContactNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_BODY_ID = downcallHandleVoid("JPH_SoftBodyManifold_GetContactBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_NUM_SENSOR_CONTACTS = downcallHandle("JPH_SoftBodyManifold_GetNumSensorContacts", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_MANIFOLD_GET_SENSOR_CONTACT_BODY_ID = downcallHandleVoid("JPH_SoftBodyManifold_GetSensorContactBodyID", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodyManifold(MemorySegment segment) {
		this.segment = segment;
	}

    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the vertices of the soft body for iterating
    /// ```
    public static MemorySegment getVertices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_VERTICES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertices].
    public final @Nullable VertexArray getVertices() {
    	MemorySegment segment = getVertices(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VertexArray(segment);
    }
    
    /// ```
    /// Check if a vertex has collided with something in this update
    /// ```
    public static boolean hasContact(
    	MemorySegment self,
    	MemorySegment inVertex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_HAS_CONTACT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inVertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasContact].
    public final boolean hasContact(
    	Vertex inVertex
    ) {
    	return hasContact(
    		this.segment,
    		inVertex.memorySegment()
    	);
    }
    
    /// ```
    /// Get the local space contact point (multiply by GetCenterOfMassTransform() of the soft body to get world space)
    /// ```
    public static void getLocalContactPoint(
    	MemorySegment self,
    	MemorySegment inVertex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_LOCAL_CONTACT_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalContactPoint].
    public final void getLocalContactPoint(
    	Vertex inVertex,
    	Vec3 outResult
    ) {
    	getLocalContactPoint(
    		this.segment,
    		inVertex.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the contact normal for the vertex (assumes there is a contact).
    /// ```
    public static void getContactNormal(
    	MemorySegment self,
    	MemorySegment inVertex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactNormal].
    public final void getContactNormal(
    	Vertex inVertex,
    	Vec3 outResult
    ) {
    	getContactNormal(
    		this.segment,
    		inVertex.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the body with which the vertex has collided in this update
    /// ```
    public static void getContactBodyID(
    	MemorySegment self,
    	MemorySegment inVertex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_CONTACT_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactBodyID].
    public final void getContactBodyID(
    	Vertex inVertex,
    	BodyID outResult
    ) {
    	getContactBodyID(
    		this.segment,
    		inVertex.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the number of sensors that are in contact with the soft body
    /// ```
    public static int getNumSensorContacts(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_NUM_SENSOR_CONTACTS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumSensorContacts].
    public final int getNumSensorContacts() {
    	return getNumSensorContacts(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the i-th sensor that is in contact with the soft body
    /// ```
    public static void getSensorContactBodyID(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_MANIFOLD_GET_SENSOR_CONTACT_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSensorContactBodyID].
    public final void getSensorContactBodyID(
    	int inIndex,
    	BodyID outResult
    ) {
    	getSensorContactBodyID(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}