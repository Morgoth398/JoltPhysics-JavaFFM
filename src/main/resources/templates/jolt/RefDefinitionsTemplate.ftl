<#assign argument = arguments?first>
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new JPH::Ref<${argument.type}>());
}

${opaqueHandle}* ${opaqueHandle}_Create1(${argument.opaqueHandle}* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new JPH::Ref<${argument.type}>(
		reinterpret_cast<${argument.type}*>(inRHS)
	));
}

${opaqueHandle}* ${opaqueHandle}_Create2(${opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new JPH::Ref<${argument.type}>(
		*reinterpret_cast<JPH::Ref<${argument.type}> const*>(inRHS)
	));	
}

void ${opaqueHandle}_Destroy(${opaqueHandle}* self) {
	delete reinterpret_cast<JPH::Ref<${argument.type}>*>(self);
}

${argument.opaqueHandle}* ${opaqueHandle}_GetPtr(${opaqueHandle} const* self) {
	return reinterpret_cast<${argument.opaqueHandle}*>(reinterpret_cast<JPH::Ref<${argument.type}> const*>(self)->GetPtr());
}

uint64_t ${opaqueHandle}_GetHash(${opaqueHandle} const* self) {
	return reinterpret_cast<JPH::Ref<${argument.type}> const*>(self)->GetHash();
}