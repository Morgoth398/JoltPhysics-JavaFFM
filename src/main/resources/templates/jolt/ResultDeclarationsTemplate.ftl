<#assign argument = arguments?first>
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create();

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* inRHS);

JPH_CAPI void ${opaqueHandle}_Destroy(${opaqueHandle}* self);

JPH_CAPI void ${opaqueHandle}_Clear(${opaqueHandle}* self);

JPH_CAPI bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self);

JPH_CAPI bool ${opaqueHandle}_IsValid(${opaqueHandle} const* self);

JPH_CAPI ${argument.opaqueHandle} const* ${opaqueHandle}_Get(${opaqueHandle} const* self);

JPH_CAPI void ${opaqueHandle}_Set(${opaqueHandle}* self, ${argument.opaqueHandle} const* inResult);

JPH_CAPI bool ${opaqueHandle}_HasError(${opaqueHandle} const* self);

JPH_CAPI char const* ${opaqueHandle}_GetError(${opaqueHandle} const* self);

JPH_CAPI void ${opaqueHandle}_SetError(${opaqueHandle}* self, char const* inError);