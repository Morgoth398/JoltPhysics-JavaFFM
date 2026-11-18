<#assign argument = arguments?first>
<#assign refType = "JPH::RefConst<${argument.type}>">
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new ${refType}());
}

${opaqueHandle}* ${opaqueHandle}_Create1(${argument.opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new ${refType}(
		reinterpret_cast<${argument.type} const*>(inRHS)
	));
}

${opaqueHandle}* ${opaqueHandle}_Create2(${opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new ${refType}(
		*reinterpret_cast<${refType} const*>(inRHS)
	));
}

void ${opaqueHandle}_Destroy(${opaqueHandle}* self) {
	delete reinterpret_cast<${refType}*>(self);
}

${argument.opaqueHandle} const* ${opaqueHandle}_GetPtr(${opaqueHandle} const* self) {
	return reinterpret_cast<${argument.opaqueHandle} const*>(reinterpret_cast<${refType} const*>(self)->GetPtr());
}

uint64_t ${opaqueHandle}_GetHash(${opaqueHandle} const* self) {
	return reinterpret_cast<${refType} const*>(self)->GetHash();
}