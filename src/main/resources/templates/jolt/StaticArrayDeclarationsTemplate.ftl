<#assign elementType = arguments[0]>
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create();

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* inRHS);

JPH_CAPI void ${opaqueHandle}_Destroy(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Clear(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_PushBack(${opaqueHandle}* self, ${elementType.opaqueHandle} const* inElement);

JPH_CAPI void ${opaqueHandle}_PopBack(${opaqueHandle}* self);

JPH_CAPI bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self);

JPH_CAPI uint32_t ${opaqueHandle}_GetSize(${opaqueHandle} const* self);

JPH_CAPI uint32_t ${opaqueHandle}_GetCapacity(${opaqueHandle} const* self);

JPH_CAPI void ${opaqueHandle}_Resize(${opaqueHandle}* self, uint32_t inNewSize);

JPH_CAPI ${elementType.opaqueHandle}* ${opaqueHandle}_GetData(${opaqueHandle}* self);

JPH_CAPI ${elementType.opaqueHandle} const* ${opaqueHandle}_GetDataConst(${opaqueHandle} const* self);

JPH_CAPI ${elementType.opaqueHandle}* ${opaqueHandle}_At(${opaqueHandle}* self, uint32_t inIdx);

JPH_CAPI ${elementType.opaqueHandle} const* ${opaqueHandle}_AtConst(${opaqueHandle} const* self, uint32_t inIdx);

JPH_CAPI ${elementType.opaqueHandle}* ${opaqueHandle}_Front(${opaqueHandle}* self);

JPH_CAPI ${elementType.opaqueHandle}* ${opaqueHandle}_Back(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Erase(${opaqueHandle}* self, uint32_t inIdx);

JPH_CAPI void ${opaqueHandle}_EraseRange(${opaqueHandle}* self, uint32_t inFirstIdx, uint32_t inLastIdx);

JPH_CAPI uint64_t ${opaqueHandle}_GetHash(${opaqueHandle} const* self);