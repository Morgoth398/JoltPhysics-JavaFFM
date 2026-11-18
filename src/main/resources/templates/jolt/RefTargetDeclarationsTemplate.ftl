<#assign argument = arguments?first>
JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create();

JPH_CAPI ${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* in);

/// Get current refcount of this object
JPH_CAPI uint32_t ${opaqueHandle}_GetRefCount(${opaqueHandle} const* self);

/// Add a reference to this object
JPH_CAPI void ${opaqueHandle}_AddRef(${opaqueHandle} const* self);

/// Release a reference to this object
JPH_CAPI void ${opaqueHandle}_Release(${opaqueHandle} const* self);

/// Mark this class as embedded, this means the type can be used in a compound or constructed on the stack.
/// The Release function will never destruct the object, it is assumed the destructor will be called by whoever allocated
/// the object and at that point in time it is checked that no references are left to the structure.
JPH_CAPI void ${opaqueHandle}_SetEmbedded(${opaqueHandle} const* self);