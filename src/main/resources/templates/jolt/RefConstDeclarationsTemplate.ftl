<#assign argument = arguments?first>
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create();

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create1(${argument.opaqueHandle} const* inRHS);

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create2(${opaqueHandle} const* inRHS);

JPH_CAPI void ${opaqueHandle}_Destroy(${opaqueHandle}* self);

JPH_CAPI ${argument.opaqueHandle} const* ${opaqueHandle}_GetPtr(${opaqueHandle} const* self);

JPH_CAPI uint64_t ${opaqueHandle}_GetHash(${opaqueHandle} const* self);