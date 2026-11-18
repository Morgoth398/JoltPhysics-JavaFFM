#pragma once

#include "JoltC_Base.h"

typedef void (*JPH_CombineFunctionCallback)(
    uint inWheelIndex,
    float* ioLongitudinalFriction,
    float* ioLateralFriction,
    JPH_Body const* body2,
    JPH_SubShapeID const* inSubShapeID2
);

JPH_CAPI JPH_CombineFunction* JPH_CombineFunction_Create(JPH_CombineFunctionCallback callback);

JPH_CAPI void JPH_CombineFunction_Destroy(JPH_CombineFunction* self);

//----------------------------------------------------------------

typedef void (*JPH_TraceFunction)(const char* message);

JPH_CAPI void JPH_SetTraceFunction(JPH_TraceFunction traceFunction);

//----------------------------------------------------------------

typedef bool (*JPH_AssertFailureFunction)(const char* expression, const char* message, const char* file, uint32_t line);

JPH_CAPI void JPH_SetAssertFailureFunction(JPH_AssertFailureFunction function);

//----------------------------------------------------------------

JPH_CAPI JPH_Body* JPH_Body_GetFixedToWorld(void);

//----------------------------------------------------------------

/// Initialization
JPH_CAPI void JPH_QuadTree_Init(JPH_QuadTree* self, JPH_QuadTreeNodeFreeList* inAllocator);

//----------------------------------------------------------------

/// Constructor will lock the bodies
JPH_CAPI JPH_BodyLockMultiRead* JPH_BodyLockMultiRead_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyIDArray const* bodyIDs);
/// Destructor will unlock the bodies
JPH_CAPI void JPH_BodyLockMultiRead_Destroy(JPH_BodyLockMultiRead* self);
/// Explicitly release the locks on all bodies (normally this is done in the destructor)
JPH_CAPI void JPH_BodyLockMultiRead_ReleaseLocks(JPH_BodyLockMultiRead* self);
/// Returns the number of bodies that were locked
JPH_CAPI int JPH_BodyLockMultiRead_GetNumBodies(JPH_BodyLockMultiRead const* self);
/// Access the body (returns null if body was not properly locked)
JPH_CAPI JPH_Body const* JPH_BodyLockMultiRead_GetBody(JPH_BodyLockMultiRead const* self, int bodyIndex);

/// Constructor will lock the bodies
JPH_CAPI JPH_BodyLockMultiWrite* JPH_BodyLockMultiWrite_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyIDArray const* bodyIDs);
/// Destructor will unlock the bodies
JPH_CAPI void JPH_BodyLockMultiWrite_Destroy(JPH_BodyLockMultiWrite* self);
/// Explicitly release the locks on all bodies (normally this is done in the destructor)
JPH_CAPI void JPH_BodyLockMultiWrite_ReleaseLocks(JPH_BodyLockMultiWrite* self);
/// Returns the number of bodies that were locked
JPH_CAPI int JPH_BodyLockMultiWrite_GetNumBodies(JPH_BodyLockMultiWrite const* self);
/// Access the body (returns null if body was not properly locked)
JPH_CAPI JPH_Body* JPH_BodyLockMultiWrite_GetBody(JPH_BodyLockMultiWrite const* self, int bodyIndex);

JPH_CAPI void JPH_BodyLockInterface_UnlockRead(JPH_BodyLockInterface const* self, JPH_SharedMutex* inMutex);

JPH_CAPI void JPH_BodyLockInterface_UnlockWrite(JPH_BodyLockInterface const* self, JPH_SharedMutex* inMutex);

/// Constructor will lock the body.
JPH_CAPI JPH_BodyLockRead* JPH_BodyLockRead_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyID const* bodyID);
/// Destructor will unlock the body.
JPH_CAPI void JPH_BodyLockRead_Destroy(JPH_BodyLockRead* self);
/// Explicitly release the lock (normally this is done in the destructor)
JPH_CAPI void JPH_BodyLockRead_ReleaseLock(JPH_BodyLockRead* self);
/// Test if the lock was successful (if the body ID was valid)
JPH_CAPI bool JPH_BodyLockRead_Succeeded(JPH_BodyLockRead const* self);
/// Test if the lock was successful (if the body ID was valid) and the body is still in the broad phase.
JPH_CAPI bool JPH_BodyLockRead_SucceededAndIsInBroadPhase(JPH_BodyLockRead const* self);
/// Access the body.
JPH_CAPI JPH_Body const* JPH_BodyLockRead_GetBody(JPH_BodyLockRead const* self);

/// Constructor will lock the body.
JPH_CAPI JPH_BodyLockWrite* JPH_BodyLockWrite_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyID const* bodyID);
/// Destructor will unlock the body.
JPH_CAPI void JPH_BodyLockWrite_Destroy(JPH_BodyLockWrite* self);
/// Explicitly release the lock (normally this is done in the destructor)
JPH_CAPI void JPH_BodyLockWrite_ReleaseLock(JPH_BodyLockWrite* self);
/// Test if the lock was successful (if the body ID was valid)
JPH_CAPI bool JPH_BodyLockWrite_Succeeded(JPH_BodyLockWrite const* self);
/// Test if the lock was successful (if the body ID was valid) and the body is still in the broad phase.
JPH_CAPI bool JPH_BodyLockWrite_SucceededAndIsInBroadPhase(JPH_BodyLockWrite const* self);
/// Access the body.
JPH_CAPI JPH_Body* JPH_BodyLockWrite_GetBody(JPH_BodyLockWrite const* self);

//----------------------------------------------------------------

JPH_CAPI void JPH_CharacterBase_Destroy(JPH_CharacterBase* self);

JPH_CAPI void JPH_CharacterBaseSettings_Destroy(JPH_CharacterBaseSettings* self);

JPH_CAPI void JPH_Constraint_Destroy(JPH_Constraint* self);

JPH_CAPI void JPH_ConstraintSettings_Destroy(JPH_ConstraintSettings* self);

JPH_CAPI void JPH_DynMatrix_Set(JPH_DynMatrix* self, uint inRow, uint inCol, float element);

JPH_CAPI float JPH_DynMatrix_Get(JPH_DynMatrix* self, uint inRow, uint inCol);

JPH_CAPI void JPH_HairSettings_Destroy(JPH_HairSettings* self);

JPH_CAPI void JPH_HairShaders_Destroy(JPH_HairShaders* self);

JPH_CAPI uint32 JPH_IndexedTriangle_GetIdx(JPH_IndexedTriangle const* self, int index);

JPH_CAPI void JPH_IndexedTriangle_SetIdx(JPH_IndexedTriangle* self, int index, uint32 idx);

JPH_CAPI void JPH_PathConstraintPath_Destroy(JPH_PathConstraintPath* self);

JPH_CAPI void JPH_PhysicsMaterial_Destroy(JPH_PhysicsMaterial* self);

JPH_CAPI void JPH_PhysicsScene_Destroy(JPH_PhysicsScene* self);

JPH_CAPI void JPH_Ragdoll_Destroy(JPH_Ragdoll* self);

JPH_CAPI void JPH_RagdollSettings_Destroy(JPH_RagdollSettings* self);

JPH_CAPI void JPH_Shape_Destroy(JPH_Shape* self);

JPH_CAPI void JPH_ShapeSettings_Destroy(JPH_ShapeSettings* self);

JPH_CAPI void JPH_Skeleton_Destroy(JPH_Skeleton* self);

JPH_CAPI void JPH_SkeletonMapper_Destroy(JPH_SkeletonMapper* self);

JPH_CAPI void JPH_SoftBodySharedSettings_Destroy(JPH_SoftBodySharedSettings* self);

JPH_CAPI void JPH_VehicleControllerSettings_Destroy(JPH_VehicleControllerSettings* self);

JPH_CAPI void JPH_WheelSettings_Destroy(JPH_WheelSettings* self);

JPH_CAPI void JPH_DebugRendererGeometry_Destroy(JPH_Geometry* self);

JPH_CAPI void JPH_SkeletalAnimation_Destroy(JPH_SkeletalAnimation* self);

//----------------------------------------------------------------

JPH_CAPI JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create();
JPH_CAPI JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create1(size_t inLength);
JPH_CAPI JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create2(size_t inLength, JPH_CharacterVirtual* inValue);
JPH_CAPI JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create3(JPH_CharacterVirtualArray const* inRHS);
JPH_CAPI void JPH_CharacterVirtualArray_Destroy(JPH_CharacterVirtualArray* self);

JPH_CAPI void JPH_CharacterVirtualArray_Assign(JPH_CharacterVirtualArray* self, JPH_CharacterVirtualArray const* inRHS);
JPH_CAPI void JPH_CharacterVirtualArray_AssignRange(JPH_CharacterVirtualArray* self, JPH_CharacterVirtual* const* inData, size_t inCount);
JPH_CAPI void JPH_CharacterVirtualArray_Swap(JPH_CharacterVirtualArray* self, JPH_CharacterVirtualArray* inRHS);
JPH_CAPI void JPH_CharacterVirtualArray_Clear(JPH_CharacterVirtualArray* self);
JPH_CAPI void JPH_CharacterVirtualArray_Reserve(JPH_CharacterVirtualArray* self, size_t inNewCapacity);
JPH_CAPI void JPH_CharacterVirtualArray_Resize(JPH_CharacterVirtualArray* self, size_t inNewSize);
JPH_CAPI void JPH_CharacterVirtualArray_Resize1(JPH_CharacterVirtualArray* self, size_t inNewSize, JPH_CharacterVirtual* inValue);
JPH_CAPI void JPH_CharacterVirtualArray_ShrinkToFit(JPH_CharacterVirtualArray* self);

JPH_CAPI void JPH_CharacterVirtualArray_PushBack(JPH_CharacterVirtualArray* self, JPH_CharacterVirtual* inValue);
JPH_CAPI void JPH_CharacterVirtualArray_PopBack(JPH_CharacterVirtualArray* self);
JPH_CAPI void JPH_CharacterVirtualArray_Insert(JPH_CharacterVirtualArray* self, size_t inIndex, JPH_CharacterVirtual* inValue);
JPH_CAPI void JPH_CharacterVirtualArray_Erase(JPH_CharacterVirtualArray* self, size_t inIndex);
JPH_CAPI void JPH_CharacterVirtualArray_EraseRange(JPH_CharacterVirtualArray* self, size_t inFirstIndex, size_t inLastIndex);

JPH_CAPI size_t JPH_CharacterVirtualArray_GetSize(JPH_CharacterVirtualArray const* self);
JPH_CAPI size_t JPH_CharacterVirtualArray_GetCapacity(JPH_CharacterVirtualArray const* self);
JPH_CAPI bool JPH_CharacterVirtualArray_IsEmpty(JPH_CharacterVirtualArray const* self);

JPH_CAPI JPH_CharacterVirtual* JPH_CharacterVirtualArray_Get(JPH_CharacterVirtualArray const* self, size_t inIndex);
JPH_CAPI JPH_CharacterVirtual* JPH_CharacterVirtualArray_Front(JPH_CharacterVirtualArray const* self);
JPH_CAPI JPH_CharacterVirtual* JPH_CharacterVirtualArray_Back(JPH_CharacterVirtualArray const* self);
JPH_CAPI JPH_CharacterVirtual** JPH_CharacterVirtualArray_GetData(JPH_CharacterVirtualArray* self);
JPH_CAPI JPH_CharacterVirtual* const* JPH_CharacterVirtualArray_GetDataConst(JPH_CharacterVirtualArray const* self);

JPH_CAPI uint64_t JPH_CharacterVirtualArray_GetHash(JPH_CharacterVirtualArray const* self);

//----------------------------------------------------------------

JPH_CAPI JPH_VisitedShapes* JPH_VisitedShapes_Create();

JPH_CAPI void JPH_VisitedShapes_Destroy(JPH_VisitedShapes* self);

//----------------------------------------------------------------

JPH_CAPI JPH_StringView* JPH_StringView_Create(const char* inString);

JPH_CAPI void JPH_StringView_Destroy(JPH_StringView* self);

//----------------------------------------------------------------