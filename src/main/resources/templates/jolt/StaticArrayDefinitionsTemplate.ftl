<#assign elementType = arguments[0]>
<#assign capacity = arguments[1]>
<#assign arrayType = "JPH::StaticArray<${elementType.type}, ${capacity.type}>">
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}());
}

${opaqueHandle}* ${opaqueHandle}_Create1(${opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}(
		*reinterpret_cast<${arrayType} const*>(inRHS)
	));
}

void ${opaqueHandle}_Destroy(${opaqueHandle}* self) {
	delete reinterpret_cast<${arrayType}*>(self);
}

void ${opaqueHandle}_Clear(${opaqueHandle}* self) {
	reinterpret_cast<${arrayType}*>(self)->clear();
}

void ${opaqueHandle}_PushBack(${opaqueHandle}* self, ${elementType.opaqueHandle} const* inElement) {
	reinterpret_cast<${arrayType}*>(self)->push_back(
		*reinterpret_cast<${elementType.type} const*>(inElement)
	);
}

void ${opaqueHandle}_PopBack(${opaqueHandle}* self) {
	reinterpret_cast<${arrayType}*>(self)->pop_back();
}

bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->empty();
}

uint32_t ${opaqueHandle}_GetSize(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->size();
}

uint32_t ${opaqueHandle}_GetCapacity(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->capacity();
}

void ${opaqueHandle}_Resize(${opaqueHandle}* self, uint32_t inNewSize) {
	reinterpret_cast<${arrayType}*>(self)->resize(inNewSize);
}

${elementType.opaqueHandle}* ${opaqueHandle}_GetData(${opaqueHandle}* self) {
	return reinterpret_cast<${elementType.opaqueHandle}*>(reinterpret_cast<${arrayType}*>(self)->data());
}

${elementType.opaqueHandle} const* ${opaqueHandle}_GetDataConst(${opaqueHandle} const* self) {
	return reinterpret_cast<${elementType.opaqueHandle} const*>(reinterpret_cast<${arrayType} const*>(self)->data());
}

${elementType.opaqueHandle}* ${opaqueHandle}_At(${opaqueHandle}* self, uint32_t inIdx) {
	return reinterpret_cast<${elementType.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->at(inIdx));
}

${elementType.opaqueHandle} const* ${opaqueHandle}_AtConst(${opaqueHandle} const* self, uint32_t inIdx) {
	return reinterpret_cast<${elementType.opaqueHandle} const*>(&reinterpret_cast<${arrayType} const*>(self)->at(inIdx));
}

${elementType.opaqueHandle}* ${opaqueHandle}_Front(${opaqueHandle}* self) {
	return reinterpret_cast<${elementType.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->front());
}

${elementType.opaqueHandle}* ${opaqueHandle}_Back(${opaqueHandle}* self) {
	return reinterpret_cast<${elementType.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->back());
}

void ${opaqueHandle}_Erase(${opaqueHandle}* self, uint32_t inIdx) {
	auto* array = reinterpret_cast<${arrayType}*>(self);
	array->erase(array->begin() + inIdx);
}

void ${opaqueHandle}_EraseRange(${opaqueHandle}* self, uint32_t inFirstIdx, uint32_t inLastIdx) {
	auto* array = reinterpret_cast<${arrayType}*>(self);
	array->erase(array->begin() + inFirstIdx, array->begin() + inLastIdx);
}

uint64_t ${opaqueHandle}_GetHash(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->GetHash();
}