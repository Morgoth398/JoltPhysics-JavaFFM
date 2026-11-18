<#assign argument = arguments?first>
/// Default constructor.
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create();

/// Constructor with length.
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create1(size_t inLength);

/// Constructor with length and value.
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create2(size_t inLength, ${argument.opaqueHandle} const* inValue);

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create3(${opaqueHandle} const* inRHS);

/// Destruct all elements.
JPH_CAPI void ${opaqueHandle}_Destroy(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Assign(${opaqueHandle}* self, ${opaqueHandle} const* inRHS);

JPH_CAPI void ${opaqueHandle}_AssignRange(${opaqueHandle}* self, ${argument.opaqueHandle} const* inData, size_t inCount);

/// Swap the contents of two arrays. 
JPH_CAPI void ${opaqueHandle}_Swap(${opaqueHandle}* self, ${opaqueHandle}* inRHS);

JPH_CAPI void ${opaqueHandle}_Clear(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Reserve(${opaqueHandle}* self, size_t inNewCapacity);

JPH_CAPI void ${opaqueHandle}_Resize(${opaqueHandle}* self, size_t inNewSize);

JPH_CAPI void ${opaqueHandle}_Resize1(${opaqueHandle}* self, size_t inNewSize, ${argument.opaqueHandle} const* inValue);

/// Reduce the capacity of the array to match its size.
JPH_CAPI void ${opaqueHandle}_ShrinkToFit(${opaqueHandle}* self);

/// Add element to the back of the array. 
JPH_CAPI void ${opaqueHandle}_PushBack(${opaqueHandle}* self, ${argument.opaqueHandle} const* inValue);

/// Remove element from the back of the array.
JPH_CAPI void ${opaqueHandle}_PopBack(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Insert(${opaqueHandle}* self, size_t inIndex, ${argument.opaqueHandle} const* inValue);

/// Remove one element from the array.
JPH_CAPI void ${opaqueHandle}_Erase(${opaqueHandle}* self, size_t inIndex);

/// Remove multiple element from the array.
JPH_CAPI void ${opaqueHandle}_EraseRange(${opaqueHandle}* self, size_t inFirstIndex, size_t inLastIndex);

/// Returns amount of elements in the array.
JPH_CAPI size_t ${opaqueHandle}_GetSize(${opaqueHandle} const* self);

/// Returns maximum amount of elements the array can hold.
JPH_CAPI size_t ${opaqueHandle}_GetCapacity(${opaqueHandle} const* self);

/// Returns true if there are no elements in the array.
JPH_CAPI bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self);

JPH_CAPI ${argument.opaqueHandle}* ${opaqueHandle}_Get(${opaqueHandle}* self, size_t inIndex);

JPH_CAPI ${argument.opaqueHandle} const* ${opaqueHandle}_GetConst(${opaqueHandle} const* self, size_t inIndex);

/// First element in the array.
JPH_CAPI ${argument.opaqueHandle}* ${opaqueHandle}_Front(${opaqueHandle}* self);

/// Last element in the array.
JPH_CAPI ${argument.opaqueHandle}* ${opaqueHandle}_Back(${opaqueHandle}* self);

JPH_CAPI void* ${opaqueHandle}_GetData(${opaqueHandle}* self);

JPH_CAPI void const* ${opaqueHandle}_GetDataConst(${opaqueHandle} const* self);