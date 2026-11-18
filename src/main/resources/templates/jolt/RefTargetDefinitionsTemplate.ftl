<#assign argument = arguments?first>
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new JPH::RefTarget<${argument.type}>());
}

${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* in) {
	return reinterpret_cast<${opaqueHandle}*>(new JPH::RefTarget<${argument.type}>(
		*reinterpret_cast<JPH::RefTarget<${argument.type}> const*>(in)
	));
}

uint32_t ${opaqueHandle}_GetRefCount(${opaqueHandle} const* self) {
	return reinterpret_cast<JPH::RefTarget<${argument.type}> const*>(self)->GetRefCount();
}

void ${opaqueHandle}_AddRef(${opaqueHandle} const* self) {
	reinterpret_cast<JPH::RefTarget<${argument.type}> const*>(self)->AddRef();
}

void ${opaqueHandle}_Release(${opaqueHandle} const* self) {
	reinterpret_cast<JPH::RefTarget<${argument.type}> const*>(self)->Release();
}

void ${opaqueHandle}_SetEmbedded(${opaqueHandle} const* self) {
	reinterpret_cast<JPH::RefTarget<${argument.type}> const*>(self)->SetEmbedded();
}