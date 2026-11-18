#include <Jolt/Jolt.h>

#include <Jolt/Physics/Body/Body.h>
#include <Jolt/Physics/Collision/BroadPhase/BroadPhaseQuadTree.h>
#include "Jolt/Physics/Body/BodyLockMulti.h"
#include "Jolt/Core/UnorderedSet.h"
#include "Jolt/Math/DynMatrix.h"
#include "Jolt/Physics/PhysicsScene.h"
#include "Jolt/Physics/PhysicsSystem.h"
#include "Jolt/Physics/Body/BodyLock.h"
#include "Jolt/Physics/Character/CharacterBase.h"
#include "Jolt/Physics/Character/CharacterVirtual.h"
#include "Jolt/Physics/Constraints/Constraint.h"
#include "Jolt/Physics/Constraints/PathConstraintPath.h"
#include "Jolt/Physics/Hair/HairSettings.h"
#include "Jolt/Physics/Hair/HairShaders.h"
#include "Jolt/Physics/Ragdoll/Ragdoll.h"
#include "Jolt/Physics/Vehicle/VehicleController.h"
#include "Jolt/Physics/Vehicle/Wheel.h"
#include "Jolt/Skeleton/SkeletonMapper.h"
#include "Jolt/Physics/Vehicle/VehicleConstraint.h"

#include "JoltC_Handwritten.h"

#include <iostream>
#include <cstdarg>
#include <cstdio>

//----------------------------------------------------------------

JPH_CombineFunction * JPH_CombineFunction_Create(JPH_CombineFunctionCallback callback) {
	auto* function = new JPH::VehicleConstraint::CombineFunction(
		[callback](uint inWheelIndex, float& ioLongitudinalFriction, float& ioLateralFriction, const JPH::Body& inBody2, const JPH::SubShapeID& inSubShapeID2){
			callback(
				inWheelIndex,
				&ioLongitudinalFriction,
				&ioLateralFriction,
				reinterpret_cast<JPH_Body const*>(&inBody2),
				reinterpret_cast<JPH_SubShapeID const*>(&inSubShapeID2)
			);
		}
	);

	return reinterpret_cast<JPH_CombineFunction *>(function);
}

void JPH_CombineFunction_Destroy(JPH_CombineFunction *self) {
	delete reinterpret_cast<JPH::VehicleConstraint::CombineFunction*>(self);
}

//----------------------------------------------------------------

static JPH_TraceFunction traceFunction;

static void TraceImpl(const char* inFMT, ...) {
	char buffer[1024];

	va_list args;
	va_start(args, inFMT);
	vsnprintf(buffer, sizeof(buffer), inFMT, args);
	va_end(args);

	if (traceFunction)
	{
		traceFunction(buffer);
	} else
	{
		std::cout << buffer << std::endl;
	}

}

void JPH_SetTraceFunction(JPH_TraceFunction newTraceFunction) {
	traceFunction = newTraceFunction;
	JPH::Trace = TraceImpl;
}

//----------------------------------------------------------------

#ifdef JPH_ENABLE_ASSERTS
static JPH_AssertFailureFunction assertFunction;

static bool AssertFailedImpl(const char *inExpression, const char *inMessage, const char *inFile, uint inLine) {

	if (assertFunction)
	{
		return assertFunction(inExpression, inMessage, inFile, inLine);
	}

	std::cout << inFile << ":" << inLine << ": (" << inExpression << ") " << (inMessage != nullptr? inMessage : "") << std::endl;

	return true;
};
#endif

void JPH_SetAssertFailureFunction(JPH_AssertFailureFunction function) {
	#ifdef JPH_ENABLE_ASSERTS
	assertFunction = function;
	JPH::AssertFailed = AssertFailedImpl;
	#endif
}

//----------------------------------------------------------------

JPH_Body* JPH_Body_GetFixedToWorld(void) {
	return reinterpret_cast<JPH_Body*>(&JPH::Body::sFixedToWorld);
}

//----------------------------------------------------------------

void JPH_QuadTree_Init(JPH_QuadTree* self, JPH_QuadTreeNodeFreeList* inAllocator) {
	reinterpret_cast<JPH::QuadTree*>(self)->Init(
		*reinterpret_cast<JPH::QuadTree::Allocator*>(inAllocator)
	);
}

//----------------------------------------------------------------

JPH_BodyLockMultiRead* JPH_BodyLockMultiRead_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyIDArray const* bodyIDs) {
	auto const* ids = reinterpret_cast<JPH::Array<JPH::BodyID> const*>(bodyIDs);

	return reinterpret_cast<JPH_BodyLockMultiRead*>(new JPH::BodyLockMultiRead(
		*reinterpret_cast<JPH::BodyLockInterface const*>(lockInterface),
		ids->data(),
		static_cast<int>(ids->size())
	));
}

void JPH_BodyLockMultiRead_Destroy(JPH_BodyLockMultiRead* self) {
	delete reinterpret_cast<JPH::BodyLockMultiRead*>(self);
}

void JPH_BodyLockMultiRead_ReleaseLocks(JPH_BodyLockMultiRead* self) {
	reinterpret_cast<JPH::BodyLockMultiRead*>(self)->ReleaseLocks();
}

int JPH_BodyLockMultiRead_GetNumBodies(JPH_BodyLockMultiRead const* self) {
	return reinterpret_cast<JPH::BodyLockMultiRead const*>(self)->GetNumBodies();
}

JPH_Body const* JPH_BodyLockMultiRead_GetBody(JPH_BodyLockMultiRead const* self, int bodyIndex) {
	return reinterpret_cast<JPH_Body const*>(
		reinterpret_cast<JPH::BodyLockMultiRead const*>(self)->GetBody(bodyIndex)
	);
}

JPH_BodyLockMultiWrite* JPH_BodyLockMultiWrite_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyIDArray const* bodyIDs) {
	auto const* ids = reinterpret_cast<JPH::Array<JPH::BodyID> const*>(bodyIDs);

	return reinterpret_cast<JPH_BodyLockMultiWrite*>(new JPH::BodyLockMultiWrite(
		*reinterpret_cast<JPH::BodyLockInterface const*>(lockInterface),
		ids->data(),
		static_cast<int>(ids->size())
	));
}

void JPH_BodyLockMultiWrite_Destroy(JPH_BodyLockMultiWrite* self) {
	delete reinterpret_cast<JPH::BodyLockMultiWrite*>(self);
}

void JPH_BodyLockMultiWrite_ReleaseLocks(JPH_BodyLockMultiWrite* self) {
	reinterpret_cast<JPH::BodyLockMultiWrite*>(self)->ReleaseLocks();
}

int JPH_BodyLockMultiWrite_GetNumBodies(JPH_BodyLockMultiWrite const* self) {
	return reinterpret_cast<JPH::BodyLockMultiWrite const*>(self)->GetNumBodies();
}

JPH_Body* JPH_BodyLockMultiWrite_GetBody(JPH_BodyLockMultiWrite const* self, int bodyIndex) {
	return reinterpret_cast<JPH_Body*>(
		reinterpret_cast<JPH::BodyLockMultiWrite const*>(self)->GetBody(bodyIndex)
	);
}

void JPH_BodyLockInterface_UnlockRead(JPH_BodyLockInterface const* self, JPH_SharedMutex* inMutex) {
	reinterpret_cast<JPH::BodyLockInterface const*>(self)->UnlockRead(
		reinterpret_cast<JPH::SharedMutex*>(inMutex)
	);
}

void JPH_BodyLockInterface_UnlockWrite(JPH_BodyLockInterface const* self, JPH_SharedMutex* inMutex) {
	reinterpret_cast<JPH::BodyLockInterface const*>(self)->UnlockWrite(
		reinterpret_cast<JPH::SharedMutex*>(inMutex)
	);
}

JPH_BodyLockRead* JPH_BodyLockRead_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyID const* bodyID) {
	return reinterpret_cast<JPH_BodyLockRead*>(new JPH::BodyLockRead(
		*reinterpret_cast<JPH::BodyLockInterface const*>(lockInterface),
		*reinterpret_cast<JPH::BodyID const*>(bodyID)
	));
}

void JPH_BodyLockRead_Destroy(JPH_BodyLockRead* self) {
	delete reinterpret_cast<JPH::BodyLockRead*>(self);
}

void JPH_BodyLockRead_ReleaseLock(JPH_BodyLockRead* self) {
	reinterpret_cast<JPH::BodyLockRead*>(self)->ReleaseLock();
}

bool JPH_BodyLockRead_Succeeded(JPH_BodyLockRead const* self) {
	return reinterpret_cast<JPH::BodyLockRead const*>(self)->Succeeded();
}

bool JPH_BodyLockRead_SucceededAndIsInBroadPhase(JPH_BodyLockRead const* self) {
	return reinterpret_cast<JPH::BodyLockRead const*>(self)->SucceededAndIsInBroadPhase();
}

JPH_Body const* JPH_BodyLockRead_GetBody(JPH_BodyLockRead const* self) {
	return reinterpret_cast<JPH_Body const*>(
		&reinterpret_cast<JPH::BodyLockRead const*>(self)->GetBody()
	);
}

JPH_BodyLockWrite* JPH_BodyLockWrite_Create(JPH_BodyLockInterface const* lockInterface, JPH_BodyID const* bodyID) {
	return reinterpret_cast<JPH_BodyLockWrite*>(new JPH::BodyLockWrite(
		*reinterpret_cast<JPH::BodyLockInterface const*>(lockInterface),
		*reinterpret_cast<JPH::BodyID const*>(bodyID)
	));
}

void JPH_BodyLockWrite_Destroy(JPH_BodyLockWrite* self) {
	delete reinterpret_cast<JPH::BodyLockWrite*>(self);
}

void JPH_BodyLockWrite_ReleaseLock(JPH_BodyLockWrite* self) {
	reinterpret_cast<JPH::BodyLockWrite*>(self)->ReleaseLock();
}

bool JPH_BodyLockWrite_Succeeded(JPH_BodyLockWrite const* self) {
	return reinterpret_cast<JPH::BodyLockWrite const*>(self)->Succeeded();
}

bool JPH_BodyLockWrite_SucceededAndIsInBroadPhase(JPH_BodyLockWrite const* self) {
	return reinterpret_cast<JPH::BodyLockWrite const*>(self)->SucceededAndIsInBroadPhase();
}

JPH_Body* JPH_BodyLockWrite_GetBody(JPH_BodyLockWrite const* self) {
	return reinterpret_cast<JPH_Body*>(
		&reinterpret_cast<JPH::BodyLockWrite const*>(self)->GetBody()
	);
}

void JPH_CharacterBase_Destroy(JPH_CharacterBase* self) {
	delete reinterpret_cast<JPH::CharacterBase*>(self);
}

void JPH_CharacterBaseSettings_Destroy(JPH_CharacterBaseSettings* self) {
	delete reinterpret_cast<JPH::CharacterBaseSettings*>(self);
}

void JPH_Constraint_Destroy(JPH_Constraint* self) {
	delete reinterpret_cast<JPH::Constraint*>(self);
}

void JPH_ConstraintSettings_Destroy(JPH_ConstraintSettings *self) {
	delete reinterpret_cast<JPH::ConstraintSettings*>(self);
}

void JPH_DynMatrix_Set(JPH_DynMatrix* self, uint inRow, uint inCol, float element) {
	(*reinterpret_cast<JPH::DynMatrix*>(self))(inRow, inCol) = element;
}

float JPH_DynMatrix_Get(JPH_DynMatrix* self, uint inRow, uint inCol) {
	return (*reinterpret_cast<JPH::DynMatrix*>(self))(inRow, inCol);
}

void JPH_HairSettings_Destroy(JPH_HairSettings* self) {
	delete reinterpret_cast<JPH::HairSettings*>(self);
}

void JPH_HairShaders_Destroy(JPH_HairShaders* self) {
	delete reinterpret_cast<JPH::HairShaders*>(self);
}

uint32 JPH_IndexedTriangle_GetIdx(JPH_IndexedTriangle const* self, int index) {
	return reinterpret_cast<JPH::IndexedTriangle const*>(self)->mIdx[index];
}

void JPH_IndexedTriangle_SetIdx(JPH_IndexedTriangle* self, int index, uint32 idx) {
	reinterpret_cast<JPH::IndexedTriangle*>(self)->mIdx[index] = idx;
}

void JPH_PathConstraintPath_Destroy(JPH_PathConstraintPath* self) {
	delete reinterpret_cast<JPH::PathConstraintPath*>(self);
}

void JPH_PhysicsMaterial_Destroy(JPH_PhysicsMaterial* self) {
	delete reinterpret_cast<JPH::PhysicsMaterial*>(self);
}

void JPH_PhysicsScene_Destroy(JPH_PhysicsScene* self) {
	delete reinterpret_cast<JPH::PhysicsScene*>(self);
}

void JPH_Ragdoll_Destroy(JPH_Ragdoll* self) {
	delete reinterpret_cast<JPH::Ragdoll*>(self);
}

void JPH_RagdollSettings_Destroy(JPH_RagdollSettings* self) {
	delete reinterpret_cast<JPH::RagdollSettings*>(self);
}

void JPH_Shape_Destroy(JPH_Shape* self) {
	delete reinterpret_cast<JPH::Shape*>(self);
}

void JPH_ShapeSettings_Destroy(JPH_ShapeSettings* self) {
	delete reinterpret_cast<JPH::ShapeSettings*>(self);
}

void JPH_Skeleton_Destroy(JPH_Skeleton* self) {
	delete reinterpret_cast<JPH::Skeleton*>(self);
}

void JPH_SkeletonMapper_Destroy(JPH_SkeletonMapper* self) {
	delete reinterpret_cast<JPH::SkeletonMapper*>(self);
}

void JPH_SoftBodySharedSettings_Destroy(JPH_SoftBodySharedSettings* self) {
	delete reinterpret_cast<JPH::SoftBodySharedSettings*>(self);
}

void JPH_VehicleControllerSettings_Destroy(JPH_VehicleControllerSettings* self) {
	delete reinterpret_cast<JPH::VehicleControllerSettings*>(self);
}

void JPH_WheelSettings_Destroy(JPH_WheelSettings* self) {
	delete reinterpret_cast<JPH::WheelSettings*>(self);
}

void JPH_DebugRendererGeometry_Destroy(JPH_Geometry *self) {
	delete reinterpret_cast<JPH::DebugRenderer::Geometry*>(self);
}

void JPH_SkeletalAnimation_Destroy(JPH_SkeletalAnimation *self) {
	delete reinterpret_cast<JPH::SkeletalAnimation*>(self);
}

//----------------------------------------------------------------

JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create() {
	return reinterpret_cast<JPH_CharacterVirtualArray*>(new JPH::Array<JPH::CharacterVirtual*>());
}

JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create1(size_t inLength) {
	return reinterpret_cast<JPH_CharacterVirtualArray*>(new JPH::Array<JPH::CharacterVirtual*>(inLength));
}

JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create2(size_t inLength, JPH_CharacterVirtual* inValue) {
	return reinterpret_cast<JPH_CharacterVirtualArray*>(new JPH::Array<JPH::CharacterVirtual*>(
		inLength,
		reinterpret_cast<JPH::CharacterVirtual*>(inValue)
	));
}

JPH_CharacterVirtualArray* JPH_CharacterVirtualArray_Create3(JPH_CharacterVirtualArray const* inRHS) {
	return reinterpret_cast<JPH_CharacterVirtualArray*>(new JPH::Array<JPH::CharacterVirtual*>(
		*reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(inRHS)
	));
}

void JPH_CharacterVirtualArray_Destroy(JPH_CharacterVirtualArray* self) {
	delete reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self);
}

void JPH_CharacterVirtualArray_Assign(JPH_CharacterVirtualArray* self, JPH_CharacterVirtualArray const* inRHS) {
	*reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self) = *reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(inRHS);
}

void JPH_CharacterVirtualArray_AssignRange(JPH_CharacterVirtualArray* self, JPH_CharacterVirtual* const* inData, size_t inCount) {
	auto const* first = reinterpret_cast<JPH::CharacterVirtual* const*>(inData);
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->assign(first, first + inCount);
}

void JPH_CharacterVirtualArray_Swap(JPH_CharacterVirtualArray* self, JPH_CharacterVirtualArray* inRHS) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->swap(
		*reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(inRHS)
	);
}

void JPH_CharacterVirtualArray_Clear(JPH_CharacterVirtualArray* self) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->clear();
}

void JPH_CharacterVirtualArray_Reserve(JPH_CharacterVirtualArray* self, size_t inNewCapacity) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->reserve(inNewCapacity);
}

void JPH_CharacterVirtualArray_Resize(JPH_CharacterVirtualArray* self, size_t inNewSize) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->resize(inNewSize);
}

void JPH_CharacterVirtualArray_Resize1(JPH_CharacterVirtualArray* self, size_t inNewSize, JPH_CharacterVirtual* inValue) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->resize(
		inNewSize,
		reinterpret_cast<JPH::CharacterVirtual*>(inValue)
	);
}

void JPH_CharacterVirtualArray_ShrinkToFit(JPH_CharacterVirtualArray* self) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->shrink_to_fit();
}

void JPH_CharacterVirtualArray_PushBack(JPH_CharacterVirtualArray* self, JPH_CharacterVirtual* inValue) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->push_back(
		reinterpret_cast<JPH::CharacterVirtual*>(inValue)
	);
}

void JPH_CharacterVirtualArray_PopBack(JPH_CharacterVirtualArray* self) {
	reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->pop_back();
}

void JPH_CharacterVirtualArray_Insert(JPH_CharacterVirtualArray* self, size_t inIndex, JPH_CharacterVirtual* inValue) {
	auto* array = reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self);
	array->insert(array->begin() + inIndex, reinterpret_cast<JPH::CharacterVirtual*>(inValue));
}

void JPH_CharacterVirtualArray_Erase(JPH_CharacterVirtualArray* self, size_t inIndex) {
	auto* array = reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self);
	array->erase(array->begin() + inIndex);
}

void JPH_CharacterVirtualArray_EraseRange(JPH_CharacterVirtualArray* self, size_t inFirstIndex, size_t inLastIndex) {
	auto* array = reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self);
	array->erase(array->begin() + inFirstIndex, array->begin() + inLastIndex);
}

size_t JPH_CharacterVirtualArray_GetSize(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->size();
}

size_t JPH_CharacterVirtualArray_GetCapacity(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->capacity();
}

bool JPH_CharacterVirtualArray_IsEmpty(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->empty();
}

JPH_CharacterVirtual* JPH_CharacterVirtualArray_Get(JPH_CharacterVirtualArray const* self, size_t inIndex) {
	return reinterpret_cast<JPH_CharacterVirtual*>(
		reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->at(inIndex)
	);
}

JPH_CharacterVirtual* JPH_CharacterVirtualArray_Front(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH_CharacterVirtual*>(
		reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->front()
	);
}

JPH_CharacterVirtual* JPH_CharacterVirtualArray_Back(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH_CharacterVirtual*>(
		reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->back()
	);
}

JPH_CharacterVirtual** JPH_CharacterVirtualArray_GetData(JPH_CharacterVirtualArray* self) {
	return reinterpret_cast<JPH_CharacterVirtual**>(
		reinterpret_cast<JPH::Array<JPH::CharacterVirtual*>*>(self)->data()
	);
}

JPH_CharacterVirtual* const* JPH_CharacterVirtualArray_GetDataConst(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH_CharacterVirtual* const*>(
		reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->data()
	);
}

uint64_t JPH_CharacterVirtualArray_GetHash(JPH_CharacterVirtualArray const* self) {
	return reinterpret_cast<JPH::Array<JPH::CharacterVirtual*> const*>(self)->GetHash();
}

//----------------------------------------------------------------

JPH_VisitedShapes* JPH_VisitedShapes_Create()
{
	return reinterpret_cast<JPH_VisitedShapes *>(new JPH::Shape::VisitedShapes());
}

void JPH_VisitedShapes_Destroy(JPH_VisitedShapes* self)
{
	delete reinterpret_cast<JPH::Shape::VisitedShapes*>(self);
}

//----------------------------------------------------------------

JPH_StringView * JPH_StringView_Create(const char *inString) {
	return reinterpret_cast<JPH_StringView *>(new std::string_view(inString));
}

void JPH_StringView_Destroy(JPH_StringView* self) {
	delete reinterpret_cast<std::string_view*>(self);
}
