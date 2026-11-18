<#assign argument = arguments?first>
<#assign resultType = "JPH::Result<${argument.type}>">
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new ${resultType}());
}

${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new ${resultType}(
		*reinterpret_cast<${resultType} const*>(inRHS)
	));
}

void ${opaqueHandle}_Destroy(${opaqueHandle}* self) {
	delete reinterpret_cast<${resultType}*>(self);
}

void ${opaqueHandle}_Clear(${opaqueHandle}* self) {
	reinterpret_cast<${resultType}*>(self)->Clear();
}

bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self) {
	return reinterpret_cast<${resultType} const*>(self)->IsEmpty();
}

bool ${opaqueHandle}_IsValid(${opaqueHandle} const* self) {
	return reinterpret_cast<${resultType} const*>(self)->IsValid();
}

${argument.opaqueHandle} const* ${opaqueHandle}_Get(${opaqueHandle} const* self) {
	return reinterpret_cast<${argument.opaqueHandle} const*>(
		&reinterpret_cast<${resultType} const*>(self)->Get()
	);
}

void ${opaqueHandle}_Set(${opaqueHandle}* self, ${argument.opaqueHandle} const* inResult) {
	reinterpret_cast<${resultType}*>(self)->Set(
		*reinterpret_cast<${argument.type} const*>(inResult)
	);
}

bool ${opaqueHandle}_HasError(${opaqueHandle} const* self) {
	return reinterpret_cast<${resultType} const*>(self)->HasError();
}

char const* ${opaqueHandle}_GetError(${opaqueHandle} const* self) {
	return reinterpret_cast<${resultType} const*>(self)->GetError().c_str();
}

void ${opaqueHandle}_SetError(${opaqueHandle}* self, char const* inError) {
	reinterpret_cast<${resultType}*>(self)->SetError(inError);
}