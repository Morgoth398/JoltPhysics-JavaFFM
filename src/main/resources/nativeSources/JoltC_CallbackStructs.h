/// MACHINE GENERATED FILE, DO NOT EDIT.
#pragma once

#include "JoltC_Enums.h"
#include "JoltC_Handles.h"

typedef struct JPH_BodyActivationListenerFunctions {
	/// Called whenever a body activates, note this can be called from any thread so make sure your code is thread safe.
	/// At the time of the callback the body inBodyID will be locked and no bodies can be written/activated/deactivated from the callback.
	void (*OnBodyActivated)(JPH_BodyID const* inBodyID, uint64 inBodyUserData);
	/// Called whenever a body deactivates, note this can be called from any thread so make sure your code is thread safe.
	/// At the time of the callback the body inBodyID will be locked and no bodies can be written/activated/deactivated from the callback.
	void (*OnBodyDeactivated)(JPH_BodyID const* inBodyID, uint64 inBodyUserData);
} JPH_BodyActivationListenerFunctions;

typedef struct JPH_ContactListenerFunctions {
	/// Called after detecting a collision between a body pair, but before calling OnContactAdded and before adding the contact constraint.
	/// If the function rejects the contact, the contact will not be processed by the simulation.
	/// This is a rather expensive time to reject a contact point since a lot of the collision detection has happened already, make sure you
	/// filter out the majority of undesired body pairs through the ObjectLayerPairFilter that is registered on the PhysicsSystem.
	///
	/// This function may not be called again the next update if a contact persists and no new contact pairs between sub shapes are found.
	///
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
	///
	/// Body 1 will have a motion type that is larger or equal than body 2's motion type (order from large to small: dynamic -> kinematic -> static). When motion types are equal, they are ordered by BodyID.
	///
	/// The collision result (inCollisionResult) is reported relative to inBaseOffset.
	JPH_ValidateResult (*OnContactValidate)(JPH_Body const* inBody1, JPH_Body const* inBody2, JPH_Vec3 const* inBaseOffset, JPH_CollideShapeResult const* inCollisionResult);
	/// Called whenever a new contact point is detected.
	///
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
	///
	/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
	///
	/// Note that only active bodies will report contacts, as soon as a body goes to sleep the contacts between that body and all other
	/// bodies will receive an OnContactRemoved callback, if this is the case then Body::IsActive() will return false during the callback.
	///
	/// When contacts are added, the constraint solver has not run yet, so the collision impulse is unknown at that point.
	/// The velocities of inBody1 and inBody2 are the velocities before the contact has been resolved, so you can use this to
	/// estimate the collision impulse to e.g. determine the volume of the impact sound to play (see: EstimateCollisionResponse).
	void (*OnContactAdded)(JPH_Body const* inBody1, JPH_Body const* inBody2, JPH_ContactManifold const* inManifold, JPH_ContactSettings* ioSettings);
	/// Called whenever a contact is detected that was also detected last update.
	///
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
	///
	/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
	///
	/// If the structure of the shape of a body changes between simulation steps (e.g. by adding/removing a child shape of a compound shape),
	/// it is possible that the same sub shape ID used to identify the removed child shape is now reused for a different child shape. The physics
	/// system cannot detect this, so may send a 'contact persisted' callback even though the contact is now on a different child shape. You can
	/// detect this by keeping the old shape (before adding/removing a part) around until the next PhysicsSystem::Update (when the OnContactPersisted
	/// callbacks are triggered) and resolving the sub shape ID against both the old and new shape to see if they still refer to the same child shape.
	void (*OnContactPersisted)(JPH_Body const* inBody1, JPH_Body const* inBody2, JPH_ContactManifold const* inManifold, JPH_ContactSettings* ioSettings);
	/// Called whenever a contact was detected last update but is not detected anymore.
	///
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
	///
	/// Beware when trying to access the bodies at the time of callback:
	/// - Some properties of the bodies are being modified from another thread at the same time.
	/// Things that the simulation doesn't modify are safe to read (e.g. user data, if sensor, if added to system etc.).
	/// Things that the simulation does modify (e.g. position, rotation, velocity, bounding box) are not safe to read.
	/// Checking Body::IsActive may return that the body is active but another thread can be in the process of making it go to sleep.
	/// Writing to the bodies is not allowed.
	/// - The body may have been removed and destroyed (you'll receive an OnContactRemoved callback in the PhysicsSystem::Update after the body has been removed). Check that the body still exists.
	///
	/// If you need the properties that are being written, cache what you need in the OnContactAdded and OnContactPersisted callbacks and store it in a separate structure to use during this callback.
	/// Alternatively, you could just record that the contact was removed and process it after PhysicsSystem::Update.
	///
	/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
	///
	/// The sub shape IDs were created in the previous simulation step, so if the structure of a shape changes (e.g. by adding/removing a child shape of a compound shape),
	/// the sub shape ID may not be valid / may not point to the same sub shape anymore.
	/// If you want to know if this is the last contact between the two bodies, use PhysicsSystem::WereBodiesInContact.
	void (*OnContactRemoved)(JPH_SubShapeIDPair const* inSubShapePair);
} JPH_ContactListenerFunctions;

typedef struct JPH_DebugRendererFunctions {
	/// Draw line
	void (*DrawLine)(JPH_Vec3 const* inFrom, JPH_Vec3 const* inTo, JPH_Color* inColor);
	/// Draw a single back face culled triangle
	void (*DrawTriangle)(JPH_Vec3 const* inV1, JPH_Vec3 const* inV2, JPH_Vec3 const* inV3, JPH_Color* inColor, JPH_ECastShadow inCastShadow);
	/// Create a batch of triangles that can be drawn efficiently
	JPH_RefTargetVirtualRef* (*CreateTriangleBatch)(void const* inTriangles, int inTriangleCount);
	JPH_RefTargetVirtualRef* (*CreateTriangleBatch1)(void const* inVertices, int inVertexCount, uint32 const* inIndices, int inIndexCount);
	/// Draw some geometry
	/// @param inModelMatrix is the matrix that transforms the geometry to world space.
	/// @param inWorldSpaceBounds is the bounding box of the geometry after transforming it into world space.
	/// @param inLODScaleSq is the squared scale of the model matrix, it is multiplied with the LOD distances in inGeometry to calculate the real LOD distance (so a number > 1 will force a higher LOD).
	/// @param inModelColor is the color with which to multiply the vertex colors in inGeometry.
	/// @param inGeometry The geometry to draw.
	/// @param inCullMode determines which polygons are culled.
	/// @param inCastShadow determines if this geometry should cast a shadow or not.
	/// @param inDrawMode determines if we draw the geometry solid or in wireframe.
	void (*DrawGeometry)(JPH_Matrix44 const* inModelMatrix, JPH_AABox const* inWorldSpaceBounds, float inLODScaleSq, JPH_Color* inModelColor, JPH_GeometryRef const* inGeometry, JPH_ECullMode inCullMode, JPH_ECastShadow inCastShadow, JPH_EDrawMode inDrawMode);
	/// Draw text
	void (*DrawText3D)(JPH_Vec3 const* inPosition, JPH_StringView const* inString, JPH_Color* inColor, float inHeight);
} JPH_DebugRendererFunctions;

typedef struct JPH_DebugRendererSimpleFunctions {
	/// Draw line
	void (*DrawLine)(JPH_Vec3 const* inFrom, JPH_Vec3 const* inTo, JPH_Color* inColor);
	/// Draw text
	void (*DrawText3D)(JPH_Vec3 const* inPosition, JPH_StringView const* inString, JPH_Color* inColor, float inHeight);
} JPH_DebugRendererSimpleFunctions;

typedef struct JPH_CharacterContactListenerFunctions {
	/// Callback to adjust the velocity of a body as seen by the character. Can be adjusted to e.g. implement a conveyor belt or an inertial dampener system of a sci-fi space ship.
	/// Note that inBody2 is locked during the callback so you can read its properties freely.
	void (*OnAdjustBodyVelocity)(JPH_CharacterVirtual const* inCharacter, JPH_Body const* inBody2, JPH_Vec3* ioLinearVelocity, JPH_Vec3* ioAngularVelocity);
	/// Checks if a character can collide with specified body. Return true if the contact is valid.
	bool (*OnContactValidate)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact);
	/// Called whenever the character collides with a body for the first time.
	/// @param inCharacter Character that is being solved
	/// @param inContact Contact that we're colliding against
	/// @param ioSettings Settings returned by the contact callback to indicate how the character should behave
	void (*OnContactAdded)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact, JPH_CharacterContactSettings* ioSettings);
	/// Called whenever the character persists colliding with a body.
	/// @param inCharacter Character that is being solved
	/// @param inContact Contact that we're colliding against
	/// @param ioSettings Settings returned by the contact callback to indicate how the character should behave
	void (*OnContactPersisted)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact, JPH_CharacterContactSettings* ioSettings);
	/// Called whenever the character loses contact with a body.
	/// Note that there is no guarantee that the body or its sub shape still exists at this point. The body may have been deleted since the last update.
	/// @param inCharacter Character that is being solved
	/// @param inBodyID2 Body ID of body that is being hit
	/// @param inSubShapeID2 Sub shape ID of shape that is being hit
	void (*OnContactRemoved)(JPH_CharacterVirtual const* inCharacter, JPH_BodyID const* inBodyID2, JPH_SubShapeID const* inSubShapeID2);
	/// Same as OnContactValidate but when colliding with a CharacterVirtual
	bool (*OnCharacterContactValidate)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact);
	/// Same as OnContactAdded but when colliding with a CharacterVirtual
	void (*OnCharacterContactAdded)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact, JPH_CharacterContactSettings* ioSettings);
	/// Same as OnContactPersisted but when colliding with a CharacterVirtual
	void (*OnCharacterContactPersisted)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterContact const* inContact, JPH_CharacterContactSettings* ioSettings);
	/// Same as OnContactRemoved but when colliding with a CharacterVirtual
	/// Note that inOtherCharacterID can be the ID of a character that has been deleted. This happens if the character was in contact with this character during the last update, but has been deleted since.
	void (*OnCharacterContactRemoved)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterID const* inOtherCharacterID, JPH_SubShapeID const* inSubShapeID2);
	/// Called whenever a contact is being used by the solver. Allows the listener to override the resulting character velocity (e.g. by preventing sliding along certain surfaces).
	/// @param inCharacter Character that is being solved
	/// @param inBodyID2 Body ID of body that is being hit
	/// @param inSubShapeID2 Sub shape ID of shape that is being hit
	/// @param inContactPosition World space contact position
	/// @param inContactNormal World space contact normal
	/// @param inContactVelocity World space velocity of contact point (e.g. for a moving platform)
	/// @param inContactMaterial Material of contact point
	/// @param inCharacterVelocity World space velocity of the character prior to hitting this contact
	/// @param ioNewCharacterVelocity Contains the calculated world space velocity of the character after hitting this contact, this velocity slides along the surface of the contact. Can be modified by the listener to provide an alternative velocity.
	void (*OnContactSolve)(JPH_CharacterVirtual const* inCharacter, JPH_BodyID const* inBodyID2, JPH_SubShapeID const* inSubShapeID2, JPH_Vec3 const* inContactPosition, JPH_Vec3 const* inContactNormal, JPH_Vec3 const* inContactVelocity, JPH_PhysicsMaterial const* inContactMaterial, JPH_Vec3 const* inCharacterVelocity, JPH_Vec3* ioNewCharacterVelocity);
	/// Same as OnContactSolve but when colliding with a CharacterVirtual
	void (*OnCharacterContactSolve)(JPH_CharacterVirtual const* inCharacter, JPH_CharacterVirtual const* inOtherCharacter, JPH_SubShapeID const* inSubShapeID2, JPH_Vec3 const* inContactPosition, JPH_Vec3 const* inContactNormal, JPH_Vec3 const* inContactVelocity, JPH_PhysicsMaterial const* inContactMaterial, JPH_Vec3 const* inCharacterVelocity, JPH_Vec3* ioNewCharacterVelocity);
} JPH_CharacterContactListenerFunctions;

typedef struct JPH_CharacterVsCharacterCollisionFunctions {
	/// Collide a character against other CharacterVirtuals.
	/// @param inCharacter The character to collide.
	/// @param inCenterOfMassTransform Center of mass transform for this character.
	/// @param inCollideShapeSettings Settings for the collision check.
	/// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
	/// @param ioCollector Collision collector that receives the collision results.
	void (*CollideCharacter)(JPH_CharacterVirtual const* inCharacter, JPH_Matrix44 const* inCenterOfMassTransform, JPH_CollideShapeSettings const* inCollideShapeSettings, JPH_Vec3 const* inBaseOffset, JPH_CollideShapeCollector* ioCollector);
	/// Cast a character against other CharacterVirtuals.
	/// @param inCharacter The character to cast.
	/// @param inCenterOfMassTransform Center of mass transform for this character.
	/// @param inDirection Direction and length to cast in.
	/// @param inShapeCastSettings Settings for the shape cast.
	/// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
	/// @param ioCollector Collision collector that receives the collision results.
	void (*CastCharacter)(JPH_CharacterVirtual const* inCharacter, JPH_Matrix44 const* inCenterOfMassTransform, JPH_Vec3 const* inDirection, JPH_ShapeCastSettings const* inShapeCastSettings, JPH_Vec3 const* inBaseOffset, JPH_CastShapeCollector* ioCollector);
} JPH_CharacterVsCharacterCollisionFunctions;

typedef struct JPH_SoftBodyContactListenerFunctions {
	/// Called whenever the soft body's aabox overlaps with another body's aabox (so receiving this callback doesn't tell if any of the vertices will collide).
	/// This callback can be used to change the behavior of the collision response for all vertices in the soft body or to completely reject the contact.
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions!
	/// @param inSoftBody The soft body that collided. It is safe to access this as the soft body is only updated on the current thread.
	/// @param inOtherBody The other body that collided. Note that accessing the position/orientation/velocity of inOtherBody may result in a race condition as other threads may be modifying the body at the same time.
	/// @param ioSettings The settings for all contact points that are generated by this collision.
	/// @return Whether the contact should be processed or not.
	JPH_SoftBodyValidateResult (*OnSoftBodyContactValidate)(JPH_Body const* inSoftBody, JPH_Body const* inOtherBody, JPH_SoftBodyContactSettings* ioSettings);
	/// Called after all contact points for a soft body have been handled.
	/// Note that this callback is called when all bodies are locked, so don't use any locking functions!
	/// You will receive a single callback for a soft body per simulation step for performance reasons, this callback will apply to all vertices in the soft body.
	/// @param inSoftBody The soft body that collided. It is safe to access this as the soft body is only updated on the current thread.
	/// @param inManifold The manifold that describes which vertices collide and with what body they collide. Other bodies may be modified by other threads during this callback.
	void (*OnSoftBodyContactAdded)(JPH_Body const* inSoftBody, JPH_SoftBodyManifold const* inManifold);
} JPH_SoftBodyContactListenerFunctions;

typedef struct JPH_BroadPhaseLayerInterfaceFunctions {
	/// Return the number of broadphase layers there are
	uint (*GetNumBroadPhaseLayers)(void);
	/// Convert an object layer to the corresponding broadphase layer
	JPH_BroadPhaseLayer* (*GetBroadPhaseLayer)(ObjectLayer inLayer);
} JPH_BroadPhaseLayerInterfaceFunctions;

typedef struct JPH_ObjectLayerPairFilterFunctions {
	/// Returns true if two layers can collide
	bool (*ShouldCollide)(ObjectLayer inLayer1, ObjectLayer inLayer2);
} JPH_ObjectLayerPairFilterFunctions;

typedef struct JPH_ObjectVsBroadPhaseLayerFilterFunctions {
	/// Returns true if an object layer should collide with a broadphase layer
	bool (*ShouldCollide)(ObjectLayer inLayer1, JPH_BroadPhaseLayer* inLayer2);
} JPH_ObjectVsBroadPhaseLayerFilterFunctions;

typedef struct JPH_BodyFilterFunctions {
	/// Filter function. Returns true if we should collide with inBodyID
	bool (*ShouldCollide)(JPH_BodyID const* inBodyID);
	/// Filter function. Returns true if we should collide with inBody (this is called after the body is locked and makes it possible to filter based on body members)
	bool (*ShouldCollideLocked)(JPH_Body const* inBody);
} JPH_BodyFilterFunctions;

typedef struct JPH_BodyDrawFilterFunctions {
	/// Filter function. Returns true if inBody should be rendered
	bool (*ShouldDraw)(JPH_Body const* inBody);
} JPH_BodyDrawFilterFunctions;

typedef struct JPH_ShapeFilterFunctions {
	/// Filter function to determine if we should collide with a shape. Returns true if the filter passes.
	/// This overload is called when the query doesn't have a source shape (e.g. ray cast / collide point)
	/// @param inShape2 Shape we're colliding against
	/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
	bool (*ShouldCollide)(JPH_Shape const* inShape2, JPH_SubShapeID const* inSubShapeIDOfShape2);
	/// Filter function to determine if two shapes should collide. Returns true if the filter passes.
	/// This overload is called when querying a shape vs a shape (e.g. collide object / cast object).
	/// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
	/// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle. You can filter out individual triangles in the CollisionCollector::AddHit function by their sub shape ID.
	/// @param inShape1 1st shape that is colliding
	/// @param inSubShapeIDOfShape1 The sub shape ID that will lead from the root shape to inShape1 (i.e. the shape that is used to collide or cast against shape 2)
	/// @param inShape2 2nd shape that is colliding
	/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
	bool (*ShouldCollide1)(JPH_Shape const* inShape1, JPH_SubShapeID const* inSubShapeIDOfShape1, JPH_Shape const* inShape2, JPH_SubShapeID const* inSubShapeIDOfShape2);
} JPH_ShapeFilterFunctions;

typedef struct JPH_GroupFilterFunctions {
	/// Check if two groups collide
	bool (*CanCollide)(JPH_CollisionGroup const* inGroup1, JPH_CollisionGroup const* inGroup2);
	/// Saves the contents of the group filter in binary form to inStream.
	void (*SaveBinaryState)(JPH_StreamOut* inStream);
} JPH_GroupFilterFunctions;

typedef struct JPH_BroadPhaseLayerFilterFunctions {
	/// Function to filter out broadphase layers when doing collision query test (return true to allow testing against objects with this layer)
	bool (*ShouldCollide)(JPH_BroadPhaseLayer* inLayer);
} JPH_BroadPhaseLayerFilterFunctions;

typedef struct JPH_ObjectLayerFilterFunctions {
	/// Function to filter out object layers when doing collision query test (return true to allow testing against objects with this layer)
	bool (*ShouldCollide)(ObjectLayer inLayer);
} JPH_ObjectLayerFilterFunctions;

typedef struct JPH_JobSystemFunctions {
	/// Get maximum number of concurrently executing jobs
	int (*GetMaxConcurrency)(void);
	/// Create a new job, the job is started immediately if inNumDependencies == 0 otherwise it starts when
	/// RemoveDependency causes the dependency counter to reach 0.
	JPH_JobSystemJobHandle* (*CreateJob)(char const* inName, JPH_Color* inColor, JPH_JobFunction const* inJobFunction, uint32 inNumDependencies);
	/// Create a number of similar jobs, the jobs are started immediately if inNumDependencies == 0 otherwise they start when
	/// RemoveDependency causes the dependency counter to reach 0.
	void (*CreateJobs)(char const* inName, JPH_Color* inColor, JPH_JobFunction const* inJobFunction, void* outJobs, uint32 inNumJobs, uint32 inNumDependencies);
	/// Create a new barrier, used to wait on jobs
	JPH_JobSystemBarrier* (*CreateBarrier)(void);
	/// Destroy a barrier when it is no longer used. The barrier should be empty at this point.
	void (*DestroyBarrier)(JPH_JobSystemBarrier* inBarrier);
	/// Wait for a set of jobs to be finished, note that only 1 thread can be waiting on a barrier at a time
	void (*WaitForJobs)(JPH_JobSystemBarrier* inBarrier);
	/// Adds a job to the job queue
	void (*QueueJob)(JPH_JobSystemJob* inJob);
	/// Adds a number of jobs at once to the job queue
	void (*QueueJobs)(JPH_JobSystemJob** inJobs, uint inNumJobs);
	/// Frees a job
	void (*FreeJob)(JPH_JobSystemJob* inJob);
} JPH_JobSystemFunctions;

typedef struct JPH_PhysicsStepListenerFunctions {
	/// Called before every simulation step (received inCollisionSteps times for every PhysicsSystem::Update(...) call)
	/// This is called while all body and constraint mutexes are locked. You can read/write bodies and constraints but not add/remove them.
	/// Multiple listeners can be executed in parallel and it is the responsibility of the listener to avoid race conditions.
	/// The best way to do this is to have each step listener operate on a subset of the bodies and constraints
	/// and making sure that these bodies and constraints are not touched by any other step listener.
	/// Note that this function is not called if there aren't any active bodies or when the physics system is updated with 0 delta time.
	void (*OnStep)(JPH_PhysicsStepListenerContext const* inContext);
} JPH_PhysicsStepListenerFunctions;

typedef struct JPH_RefTargetVirtualFunctions {
	/// Virtual add reference
	void (*AddRef)(void);
	/// Virtual release reference
	void (*Release)(void);
} JPH_RefTargetVirtualFunctions;

typedef struct JPH_SimShapeFilterFunctions {
	/// Filter function to determine if two shapes should collide. Returns true if the filter passes.
	/// This overload is called during the simulation (PhysicsSystem::Update) and must be registered with PhysicsSystem::SetSimShapeFilter.
	/// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
	/// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle.
	/// Note that this function is called from multiple threads and must be thread safe. All properties are read only.
	/// @param inBody1 1st body that is colliding
	/// @param inShape1 1st shape that is colliding
	/// @param inSubShapeIDOfShape1 The sub shape ID that will lead from inBody1.GetShape() to inShape1
	/// @param inBody2 2nd body that is colliding
	/// @param inShape2 2nd shape that is colliding
	/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from inBody2.GetShape() to inShape2
	bool (*ShouldCollide)(JPH_Body const* inBody1, JPH_Shape const* inShape1, JPH_SubShapeID const* inSubShapeIDOfShape1, JPH_Body const* inBody2, JPH_Shape const* inShape2, JPH_SubShapeID const* inSubShapeIDOfShape2);
} JPH_SimShapeFilterFunctions;

typedef struct JPH_TempAllocatorFunctions {
	/// Allocates inSize bytes of memory, returned memory address must be JPH_RVECTOR_ALIGNMENT byte aligned
	void* (*Allocate)(uint inSize);
	/// Frees inSize bytes of memory located at inAddress
	void (*Free)(void* inAddress, uint inSize);
} JPH_TempAllocatorFunctions;

typedef struct JPH_VehicleCollisionTesterFunctions {
	/// Do a collision test with the world
	/// @param inPhysicsSystem The physics system that should be tested against
	/// @param inVehicleConstraint The vehicle constraint
	/// @param inWheelIndex Index of the wheel that we're testing collision for
	/// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
	/// @param inDirection Direction for the test (unit vector, world space)
	/// @param inVehicleBodyID This body should be filtered out during collision detection to avoid self collisions
	/// @param outBody Body that the wheel collided with
	/// @param outSubShapeID Sub shape ID that the wheel collided with
	/// @param outContactPosition Contact point between wheel and floor, in world space
	/// @param outContactNormal Contact normal between wheel and floor, pointing away from the floor
	/// @param outSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
	/// @return True when collision found, false if not
	bool (*Collide)(JPH_PhysicsSystem* inPhysicsSystem, JPH_VehicleConstraint const* inVehicleConstraint, uint inWheelIndex, JPH_Vec3 const* inOrigin, JPH_Vec3 const* inDirection, JPH_BodyID const* inVehicleBodyID, JPH_Body** outBody, JPH_SubShapeID* outSubShapeID, JPH_Vec3* outContactPosition, JPH_Vec3* outContactNormal, float* outSuspensionLength);
	/// Do a cheap contact properties prediction based on the contact properties from the last collision test (provided as input parameters)
	/// @param inPhysicsSystem The physics system that should be tested against
	/// @param inVehicleConstraint The vehicle constraint
	/// @param inWheelIndex Index of the wheel that we're testing collision for
	/// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
	/// @param inDirection Direction for the test (unit vector, world space)
	/// @param inVehicleBodyID The body ID for the vehicle itself
	/// @param ioBody Body that the wheel previously collided with
	/// @param ioSubShapeID Sub shape ID that the wheel collided with during the last check
	/// @param ioContactPosition Contact point between wheel and floor during the last check, in world space
	/// @param ioContactNormal Contact normal between wheel and floor during the last check, pointing away from the floor
	/// @param ioSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
	void (*PredictContactProperties)(JPH_PhysicsSystem* inPhysicsSystem, JPH_VehicleConstraint const* inVehicleConstraint, uint inWheelIndex, JPH_Vec3 const* inOrigin, JPH_Vec3 const* inDirection, JPH_BodyID const* inVehicleBodyID, JPH_Body** ioBody, JPH_SubShapeID* ioSubShapeID, JPH_Vec3* ioContactPosition, JPH_Vec3* ioContactNormal, float* ioSuspensionLength);
} JPH_VehicleCollisionTesterFunctions;

typedef struct JPH_StateRecorderFilterFunctions {
	/// If the state of a specific body should be saved
	bool (*ShouldSaveBody)(JPH_Body const* inBody);
	/// If the state of a specific constraint should be saved
	bool (*ShouldSaveConstraint)(JPH_Constraint const* inConstraint);
	/// If the state of a specific contact should be saved
	bool (*ShouldSaveContact)(JPH_BodyID const* inBody1, JPH_BodyID const* inBody2);
	/// If the state of a specific contact should be restored
	bool (*ShouldRestoreContact)(JPH_BodyID const* inBody1, JPH_BodyID const* inBody2);
} JPH_StateRecorderFilterFunctions;

