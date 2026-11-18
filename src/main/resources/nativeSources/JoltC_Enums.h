/// MACHINE GENERATED FILE, DO NOT EDIT.
#pragma once

typedef enum JPH_EBackFaceMode {
	/// Ignore collision with back facing surfaces/triangles
	JPH_EBackFaceMode_IgnoreBackFaces = 0,
	/// Collide with back facing surfaces/triangles
	JPH_EBackFaceMode_CollideWithBackFaces = 1
} JPH_EBackFaceMode;

typedef enum JPH_EShapeType {
	/// Used by ConvexShape, all shapes that use the generic convex vs convex collision detection system (box, sphere, capsule, tapered capsule, cylinder, triangle)
	JPH_EShapeType_Convex = 0,
	/// Used by CompoundShape
	JPH_EShapeType_Compound = 1,
	/// Used by DecoratedShape
	JPH_EShapeType_Decorated = 2,
	/// Used by MeshShape
	JPH_EShapeType_Mesh = 3,
	/// Used by HeightFieldShape
	JPH_EShapeType_HeightField = 4,
	/// Used by SoftBodyShape
	JPH_EShapeType_SoftBody = 5,
	JPH_EShapeType_User1 = 6,
	JPH_EShapeType_User2 = 7,
	JPH_EShapeType_User3 = 8,
	JPH_EShapeType_User4 = 9,
	/// Used by PlaneShape
	JPH_EShapeType_Plane = 10,
	/// Used by EmptyShape
	JPH_EShapeType_Empty = 11
} JPH_EShapeType;

typedef enum JPH_EShapeSubType {
	JPH_EShapeSubType_Sphere = 0,
	JPH_EShapeSubType_Box = 1,
	JPH_EShapeSubType_Triangle = 2,
	JPH_EShapeSubType_Capsule = 3,
	JPH_EShapeSubType_TaperedCapsule = 4,
	JPH_EShapeSubType_Cylinder = 5,
	JPH_EShapeSubType_ConvexHull = 6,
	JPH_EShapeSubType_StaticCompound = 7,
	JPH_EShapeSubType_MutableCompound = 8,
	JPH_EShapeSubType_RotatedTranslated = 9,
	JPH_EShapeSubType_Scaled = 10,
	JPH_EShapeSubType_OffsetCenterOfMass = 11,
	JPH_EShapeSubType_Mesh = 12,
	JPH_EShapeSubType_HeightField = 13,
	JPH_EShapeSubType_SoftBody = 14,
	JPH_EShapeSubType_User1 = 15,
	JPH_EShapeSubType_User2 = 16,
	JPH_EShapeSubType_User3 = 17,
	JPH_EShapeSubType_User4 = 18,
	JPH_EShapeSubType_User5 = 19,
	JPH_EShapeSubType_User6 = 20,
	JPH_EShapeSubType_User7 = 21,
	JPH_EShapeSubType_User8 = 22,
	JPH_EShapeSubType_UserConvex1 = 23,
	JPH_EShapeSubType_UserConvex2 = 24,
	JPH_EShapeSubType_UserConvex3 = 25,
	JPH_EShapeSubType_UserConvex4 = 26,
	JPH_EShapeSubType_UserConvex5 = 27,
	JPH_EShapeSubType_UserConvex6 = 28,
	JPH_EShapeSubType_UserConvex7 = 29,
	JPH_EShapeSubType_UserConvex8 = 30,
	JPH_EShapeSubType_Plane = 31,
	JPH_EShapeSubType_TaperedCylinder = 32,
	JPH_EShapeSubType_Empty = 33
} JPH_EShapeSubType;

typedef enum JPH_EAllowedDOFs {
	/// No degrees of freedom are allowed. Note that this is not valid and will crash. Use a static body instead.
	JPH_EAllowedDOFs_None = 0,
	/// All degrees of freedom are allowed
	JPH_EAllowedDOFs_All = 63,
	/// Body can move in world space X axis
	JPH_EAllowedDOFs_TranslationX = 1,
	/// Body can move in world space Y axis
	JPH_EAllowedDOFs_TranslationY = 2,
	/// Body can move in world space Z axis
	JPH_EAllowedDOFs_TranslationZ = 4,
	/// Body can rotate around world space X axis
	JPH_EAllowedDOFs_RotationX = 8,
	/// Body can rotate around world space Y axis
	JPH_EAllowedDOFs_RotationY = 16,
	/// Body can rotate around world space Z axis
	JPH_EAllowedDOFs_RotationZ = 32,
	/// Body can only move in X and Y axis and rotate around Z axis
	JPH_EAllowedDOFs_Plane2D = 35
} JPH_EAllowedDOFs;

typedef enum JPH_EMotionQuality {
	/// Update the body in discrete steps. Body will tunnel through thin objects if its velocity is high enough.
	/// This is the cheapest way of simulating a body.
	JPH_EMotionQuality_Discrete = 0,
	/// Update the body using linear casting. When stepping the body, its collision shape is cast from
	/// start to destination using the starting rotation. The body will not be able to tunnel through thin
	/// objects at high velocity, but tunneling is still possible if the body is long and thin and has high
	/// angular velocity. Time is stolen from the object (which means it will move up to the first collision
	/// and will not bounce off the surface until the next integration step). This will make the body appear
	/// to go slower when it collides with high velocity. In order to not get stuck, the body is always
	/// allowed to move by a fraction of it's inner radius, which may eventually lead it to pass through geometry.
	///
	/// Note that if you're using a collision listener, you can receive contact added/persisted notifications of contacts
	/// that may in the end not happen. This happens between bodies that are using casting: If bodies A and B collide at t1
	/// and B and C collide at t2 where t2  t1 and A and C don't collide. In this case you may receive an incorrect contact
	/// point added callback between A and B (which will be removed the next frame).
	JPH_EMotionQuality_LinearCast = 1
} JPH_EMotionQuality;

typedef enum JPH_EMotionType {
	/// Non movable
	JPH_EMotionType_Static = 0,
	/// Movable using velocities only, does not respond to forces
	JPH_EMotionType_Kinematic = 1,
	/// Responds to forces as a normal physics object
	JPH_EMotionType_Dynamic = 2
} JPH_EMotionType;

typedef enum JPH_EBodyType {
	/// Rigid body consisting of a rigid shape
	JPH_EBodyType_RigidBody = 0,
	/// Soft body consisting of a deformable shape
	JPH_EBodyType_SoftBody = 1
} JPH_EBodyType;

typedef enum JPH_ECanSleep {
	/// Object cannot go to sleep
	JPH_ECanSleep_CannotSleep = 0,
	/// Object can go to sleep
	JPH_ECanSleep_CanSleep = 1
} JPH_ECanSleep;

typedef enum JPH_ESpringMode {
	/// Frequency and damping are specified.
	JPH_ESpringMode_FrequencyAndDamping = 0,
	/// Stiffness and damping are specified.
	JPH_ESpringMode_StiffnessAndDamping = 1,
	/// Stiffness and damping divided by mass / inertia are specified (also known as acceleration mode). This makes it easier to tune the spring and makes it mass independent.
	JPH_ESpringMode_MassNormalizedStiffnessAndDamping = 2
} JPH_ESpringMode;

typedef enum JPH_EStateRecorderState {
	/// Save nothing
	JPH_EStateRecorderState_None = 0,
	/// Save global physics system state (delta time, gravity, etc.)
	JPH_EStateRecorderState_Global = 1,
	/// Save the state of bodies
	JPH_EStateRecorderState_Bodies = 2,
	/// Save the state of contacts
	JPH_EStateRecorderState_Contacts = 4,
	/// Save the state of constraints
	JPH_EStateRecorderState_Constraints = 8,
	/// Save all state
	JPH_EStateRecorderState_All = 15
} JPH_EStateRecorderState;

typedef enum JPH_EOverrideMassProperties {
	/// Tells the system to calculate the mass and inertia based on density
	JPH_EOverrideMassProperties_CalculateMassAndInertia = 0,
	/// Tells the system to take the mass from mMassPropertiesOverride and to calculate the inertia based on density of the shapes and to scale it to the provided mass
	JPH_EOverrideMassProperties_CalculateInertia = 1,
	/// Tells the system to take the mass and inertia from mMassPropertiesOverride
	JPH_EOverrideMassProperties_MassAndInertiaProvided = 2
} JPH_EOverrideMassProperties;

typedef enum JPH_EActivation {
	/// Activate the body, making it part of the simulation
	JPH_EActivation_Activate = 0,
	/// Leave activation state as it is (will not deactivate an active body)
	JPH_EActivation_DontActivate = 1
} JPH_EActivation;

typedef enum JPH_ESoftBodyConstraintColor {
	JPH_ESoftBodyConstraintColor_ConstraintType = 0,
	/// Draw different types of constraints in different colors
	JPH_ESoftBodyConstraintColor_ConstraintGroup = 1,
	/// Draw constraints in the same group in the same color, non-parallel group will be red
	JPH_ESoftBodyConstraintColor_ConstraintOrder = 2
} JPH_ESoftBodyConstraintColor;

typedef enum JPH_EActiveEdgeMode {
	/// Do not collide with inactive edges. For physics simulation, this gives less ghost collisions.
	JPH_EActiveEdgeMode_CollideOnlyWithActive = 0,
	/// Collide with all edges. Use this when you're interested in all collisions.
	JPH_EActiveEdgeMode_CollideWithAll = 1
} JPH_EActiveEdgeMode;

typedef enum JPH_ECollectFacesMode {
	/// mShape1/2Face is desired
	JPH_ECollectFacesMode_CollectFaces = 0,
	/// mShape1/2Face is not desired
	JPH_ECollectFacesMode_NoFaces = 1
} JPH_ECollectFacesMode;

typedef enum JPH_ValidateResult {
	/// Accept this and any further contact points for this body pair
	JPH_ValidateResult_AcceptAllContactsForThisBodyPair = 0,
	/// Accept this contact only (and continue calling this callback for every contact manifold for the same body pair)
	JPH_ValidateResult_AcceptContact = 1,
	/// Reject this contact only (but process any other contact manifolds for the same body pair)
	JPH_ValidateResult_RejectContact = 2,
	/// Rejects this and any further contact points for this body pair
	JPH_ValidateResult_RejectAllContactsForThisBodyPair = 3
} JPH_ValidateResult;

typedef enum JPH_EConstraintType {
	JPH_EConstraintType_Constraint = 0,
	JPH_EConstraintType_TwoBodyConstraint = 1
} JPH_EConstraintType;

typedef enum JPH_EConstraintSubType {
	JPH_EConstraintSubType_Fixed = 0,
	JPH_EConstraintSubType_Point = 1,
	JPH_EConstraintSubType_Hinge = 2,
	JPH_EConstraintSubType_Slider = 3,
	JPH_EConstraintSubType_Distance = 4,
	JPH_EConstraintSubType_Cone = 5,
	JPH_EConstraintSubType_SwingTwist = 6,
	JPH_EConstraintSubType_SixDOF = 7,
	JPH_EConstraintSubType_Path = 8,
	JPH_EConstraintSubType_Vehicle = 9,
	JPH_EConstraintSubType_RackAndPinion = 10,
	JPH_EConstraintSubType_Gear = 11,
	JPH_EConstraintSubType_Pulley = 12,
	/// User defined constraint types start here
	JPH_EConstraintSubType_User1 = 13,
	JPH_EConstraintSubType_User2 = 14,
	JPH_EConstraintSubType_User3 = 15,
	JPH_EConstraintSubType_User4 = 16
} JPH_EConstraintSubType;

typedef enum JPH_EConstraintSpace {
	/// All constraint properties are specified in local space to center of mass of the bodies that are being constrained (so e.g. 'constraint position 1' will be local to body 1 COM, 'constraint position 2' will be local to body 2 COM). Note that this means you need to subtract Shape::GetCenterOfMass() from positions!
	JPH_EConstraintSpace_LocalToBodyCOM = 0,
	/// All constraint properties are specified in world space
	JPH_EConstraintSpace_WorldSpace = 1
} JPH_EConstraintSpace;

typedef enum JPH_EPhysicsUpdateError {
	/// No errors
	JPH_EPhysicsUpdateError_None = 0,
	/// The manifold cache is full, this means that the total number of contacts between bodies is too high. Some contacts were ignored. Increase inMaxContactConstraints in PhysicsSystem::Init.
	JPH_EPhysicsUpdateError_ManifoldCacheFull = 1,
	/// The body pair cache is full, this means that too many bodies contacted. Some contacts were ignored. Increase inMaxBodyPairs in PhysicsSystem::Init.
	JPH_EPhysicsUpdateError_BodyPairCacheFull = 2,
	/// The contact constraints buffer is full. Some contacts were ignored. Increase inMaxContactConstraints in PhysicsSystem::Init.
	JPH_EPhysicsUpdateError_ContactConstraintsFull = 4
} JPH_EPhysicsUpdateError;

typedef enum JPH_EMotorState {
	/// Motor is off
	JPH_EMotorState_Off = 0,
	/// Motor will drive to target velocity limited only by max force/torque that the motor can apply
	JPH_EMotorState_Velocity = 1,
	/// Motor will drive to target position using: force = stiffness * (target_position - current_position) - damping * current_velocity
	JPH_EMotorState_Position = 2,
	/// Motor will drive both to target position and velocity using: force = stiffness * (target_position - current_position) + damping * (target_velocity - current_velocity)
	JPH_EMotorState_PositionAndVelocity = 3
} JPH_EMotorState;

typedef enum JPH_ETransmissionMode {
	/// Automatically shift gear up and down
	JPH_ETransmissionMode_Auto = 0,
	/// Manual gear shift (call SetTransmissionInput)
	JPH_ETransmissionMode_Manual = 1
} JPH_ETransmissionMode;

typedef enum JPH_ESwingType {
	/// Swing is limited by a cone shape, note that this cone starts to deform for larger swing angles. Cone limits only support limits that are symmetric around 0.
	JPH_ESwingType_Cone = 0,
	/// Swing is limited by a pyramid shape, note that this pyramid starts to deform for larger swing angles.
	JPH_ESwingType_Pyramid = 1
} JPH_ESwingType;

typedef enum JPH_EPathRotationConstraintType {
	/// Do not constrain the rotation of the body at all
	JPH_EPathRotationConstraintType_Free = 0,
	/// Only allow rotation around the tangent vector (following the path)
	JPH_EPathRotationConstraintType_ConstrainAroundTangent = 1,
	/// Only allow rotation around the normal vector (perpendicular to the path)
	JPH_EPathRotationConstraintType_ConstrainAroundNormal = 2,
	/// Only allow rotation around the binormal vector (perpendicular to the path)
	JPH_EPathRotationConstraintType_ConstrainAroundBinormal = 3,
	/// Fully constrain the rotation of body 2 to the path (following the tangent and normal of the path)
	JPH_EPathRotationConstraintType_ConstrainToPath = 4,
	/// Fully constrain the rotation of the body 2 to the rotation of body 1
	JPH_EPathRotationConstraintType_FullyConstrained = 5
} JPH_EPathRotationConstraintType;

typedef enum JPH_SoftBodyValidateResult {
	/// Accept this contact
	JPH_SoftBodyValidateResult_AcceptContact = 0,
	/// Reject this contact
	JPH_SoftBodyValidateResult_RejectContact = 1
} JPH_SoftBodyValidateResult;

typedef enum JPH_EShapeColor {
	/// Random color per instance
	JPH_EShapeColor_InstanceColor = 0,
	/// Convex = green, scaled = yellow, compound = orange, mesh = red
	JPH_EShapeColor_ShapeTypeColor = 1,
	/// Static = grey, keyframed = green, dynamic = random color per instance
	JPH_EShapeColor_MotionTypeColor = 2,
	/// Static = grey, keyframed = green, dynamic = yellow, sleeping = red
	JPH_EShapeColor_SleepColor = 3,
	/// Static = grey, active = random color per island, sleeping = light grey
	JPH_EShapeColor_IslandColor = 4,
	/// Color as defined by the PhysicsMaterial of the shape
	JPH_EShapeColor_MaterialColor = 5
} JPH_EShapeColor;

typedef enum JPH_ESupportMode {
	/// Return the shape excluding the convex radius, Support::GetConvexRadius will return the convex radius if there is one, but adding this radius may not result in the most accurate/efficient representation of shapes with sharp edges
	JPH_ESupportMode_ExcludeConvexRadius = 0,
	/// Return the shape including the convex radius, Support::GetSupport includes the convex radius if there is one, Support::GetConvexRadius will return 0
	JPH_ESupportMode_IncludeConvexRadius = 1,
	/// Use both Support::GetSupport add Support::GetConvexRadius to get a support point that matches the original shape as accurately/efficiently as possible
	JPH_ESupportMode_Default = 2
} JPH_ESupportMode;

typedef enum JPH_EResult {
	/// Hull building finished successfully
	JPH_EResult_Success = 0,
	/// Hull building finished successfully, but the desired accuracy was not reached because the max vertices limit was reached
	JPH_EResult_MaxVerticesReached = 1
} JPH_EResult;

typedef enum JPH_EGroundState {
	/// Character is on the ground and can move freely.
	JPH_EGroundState_OnGround = 0,
	/// Character is on a slope that is too steep and can't climb up any further. The caller should start applying downward velocity if sliding from the slope is desired.
	JPH_EGroundState_OnSteepGround = 1,
	/// Character is touching an object, but is not supported by it and should fall. The GetGroundXXX functions will return information about the touched object.
	JPH_EGroundState_NotSupported = 2,
	/// Character is in the air and is not touching anything.
	JPH_EGroundState_InAir = 3
} JPH_EGroundState;

typedef enum JPH_ECullMode {
	/// Don't draw backfacing polygons
	JPH_ECullMode_CullBackFace = 0,
	/// Don't draw front facing polygons
	JPH_ECullMode_CullFrontFace = 1,
	/// Don't do culling and draw both sides
	JPH_ECullMode_Off = 2
} JPH_ECullMode;

typedef enum JPH_EDrawMode {
	/// Draw as a solid shape
	JPH_EDrawMode_Solid = 0,
	/// Draw as wireframe
	JPH_EDrawMode_Wireframe = 1
} JPH_EDrawMode;

typedef enum JPH_ECastShadow {
	/// This shape should cast a shadow
	JPH_ECastShadow_On = 0,
	/// This shape should not cast a shadow
	JPH_ECastShadow_Off = 1
} JPH_ECastShadow;

typedef enum JPH_ELRAType {
	/// Don't create a LRA constraint
	JPH_ELRAType_None = 0,
	/// Create a LRA constraint based on Euclidean distance between the closest kinematic vertex and this vertex
	JPH_ELRAType_EuclideanDistance = 1,
	/// Create a LRA constraint based on the geodesic distance between the closest kinematic vertex and this vertex (follows the edge constraints)
	JPH_ELRAType_GeodesicDistance = 2
} JPH_ELRAType;

typedef enum JPH_EBendType {
	/// No bend constraints will be created
	JPH_EBendType_None = 0,
	/// A simple distance constraint
	JPH_EBendType_Distance = 1,
	/// A dihedral bend constraint (most expensive, but also supports triangles that are initially not in the same plane)
	JPH_EBendType_Dihedral = 2
} JPH_EBendType;

typedef enum JPH_EStatus {
	/// No work was done because other threads were still working on a batch that cannot run concurrently
	JPH_EStatus_NoWork = 1,
	/// Work was done to progress the update
	JPH_EStatus_DidWork = 2,
	/// All work is done
	JPH_EStatus_Done = 4
} JPH_EStatus;

typedef enum JPH_EBuildQuality {
	/// Favor runtime performance, takes more time to build the MeshShape but performs better
	JPH_EBuildQuality_FavorRuntimePerformance = 0,
	/// Favor build speed, build the tree faster but the MeshShape will be slower
	JPH_EBuildQuality_FavorBuildSpeed = 1
} JPH_EBuildQuality;

typedef enum JPH_EAxis {
	JPH_EAxis_TranslationX = 0,
	JPH_EAxis_TranslationY = 1,
	JPH_EAxis_TranslationZ = 2,
	JPH_EAxis_RotationX = 3,
	JPH_EAxis_RotationY = 4,
	JPH_EAxis_RotationZ = 5,
	JPH_EAxis_Num = 6,
	JPH_EAxis_NumTranslation = 3
} JPH_EAxis;
