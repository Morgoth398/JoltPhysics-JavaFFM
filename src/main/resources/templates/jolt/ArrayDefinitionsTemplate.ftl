<#assign argument = arguments?first>
<#assign arrayType = "JPH::Array<${argument.type}>">
${opaqueHandle}* ${opaqueHandle}_Create() {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}());
}

${opaqueHandle}* ${opaqueHandle}_Create1(size_t inLength) {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}(inLength));
}

${opaqueHandle}* ${opaqueHandle}_Create2(size_t inLength, ${argument.opaqueHandle} const* inValue) {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}(
		inLength,
		*reinterpret_cast<${argument.type} const*>(inValue)
	));
}

${opaqueHandle}* ${opaqueHandle}_Create3(${opaqueHandle} const* inRHS) {
	return reinterpret_cast<${opaqueHandle}*>(new ${arrayType}(
		*reinterpret_cast<${arrayType} const*>(inRHS)
	));
}

void ${opaqueHandle}_Destroy(${opaqueHandle}* self) {
	delete reinterpret_cast<${arrayType}*>(self);
}

void ${opaqueHandle}_Assign(${opaqueHandle}* self, ${opaqueHandle} const* inRHS) {
	*reinterpret_cast<${arrayType}*>(self) = *reinterpret_cast<${arrayType} const*>(inRHS);
}

void ${opaqueHandle}_AssignRange(${opaqueHandle}* self, ${argument.opaqueHandle} const* inData, size_t inCount) {
	auto const* first = reinterpret_cast<${argument.type} const*>(inData);
	reinterpret_cast<${arrayType}*>(self)->assign(first, first + inCount);
}

void ${opaqueHandle}_Swap(${opaqueHandle}* self, ${opaqueHandle}* inRHS) {
	reinterpret_cast<${arrayType}*>(self)->swap(*reinterpret_cast<${arrayType}*>(inRHS));
}

void ${opaqueHandle}_Clear(${opaqueHandle}* self) {
	reinterpret_cast<${arrayType}*>(self)->clear();
}

void ${opaqueHandle}_Reserve(${opaqueHandle}* self, size_t inNewCapacity) {
	reinterpret_cast<${arrayType}*>(self)->reserve(inNewCapacity);
}

void ${opaqueHandle}_Resize(${opaqueHandle}* self, size_t inNewSize) {
	reinterpret_cast<${arrayType}*>(self)->resize(inNewSize);
}

void ${opaqueHandle}_Resize1(${opaqueHandle}* self, size_t inNewSize, ${argument.opaqueHandle} const* inValue) {
	reinterpret_cast<${arrayType}*>(self)->resize(
		inNewSize,
		*reinterpret_cast<${argument.type} const*>(inValue)
	);
}

void ${opaqueHandle}_ShrinkToFit(${opaqueHandle}* self) {
	reinterpret_cast<${arrayType}*>(self)->shrink_to_fit();
}

void ${opaqueHandle}_PushBack(${opaqueHandle}* self, ${argument.opaqueHandle} const* inValue) {
	reinterpret_cast<${arrayType}*>(self)->push_back(
		*reinterpret_cast<${argument.type} const*>(inValue)
	);
}

void ${opaqueHandle}_PopBack(${opaqueHandle}* self) {
	reinterpret_cast<${arrayType}*>(self)->pop_back();
}

void ${opaqueHandle}_Insert(${opaqueHandle}* self, size_t inIndex, ${argument.opaqueHandle} const* inValue) {
	auto* array = reinterpret_cast<${arrayType}*>(self);
	array->insert(array->begin() + inIndex, *reinterpret_cast<${argument.type} const*>(inValue));
}

void ${opaqueHandle}_Erase(${opaqueHandle}* self, size_t inIndex) {
	auto* array = reinterpret_cast<${arrayType}*>(self);
	array->erase(array->begin() + inIndex);
}

void ${opaqueHandle}_EraseRange(${opaqueHandle}* self, size_t inFirstIndex, size_t inLastIndex) {
	auto* array = reinterpret_cast<${arrayType}*>(self);
	array->erase(array->begin() + inFirstIndex, array->begin() + inLastIndex);
}

size_t ${opaqueHandle}_GetSize(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->size();
}

size_t ${opaqueHandle}_GetCapacity(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->capacity();
}

bool ${opaqueHandle}_IsEmpty(${opaqueHandle} const* self) {
	return reinterpret_cast<${arrayType} const*>(self)->empty();
}

${argument.opaqueHandle}* ${opaqueHandle}_Get(${opaqueHandle}* self, size_t inIndex) {
	return reinterpret_cast<${argument.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->at(inIndex));
}

${argument.opaqueHandle} const* ${opaqueHandle}_GetConst(${opaqueHandle} const* self, size_t inIndex) {
	return reinterpret_cast<${argument.opaqueHandle} const*>(&reinterpret_cast<${arrayType} const*>(self)->at(inIndex));
}

${argument.opaqueHandle}* ${opaqueHandle}_Front(${opaqueHandle}* self) {
	return reinterpret_cast<${argument.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->front());
}

${argument.opaqueHandle}* ${opaqueHandle}_Back(${opaqueHandle}* self) {
	return reinterpret_cast<${argument.opaqueHandle}*>(&reinterpret_cast<${arrayType}*>(self)->back());
}

void* ${opaqueHandle}_GetData(${opaqueHandle}* self) {
	return reinterpret_cast<void*>(reinterpret_cast<${arrayType}*>(self)->data());
}

void const* ${opaqueHandle}_GetDataConst(${opaqueHandle} const* self) {
	return reinterpret_cast<void const*>(reinterpret_cast<${arrayType} const*>(self)->data());
}