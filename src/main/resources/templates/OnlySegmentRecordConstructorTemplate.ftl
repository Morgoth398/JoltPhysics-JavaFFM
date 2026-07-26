public ${className}(MemorySegment segment) {
    this.segment = segment;

    <#list data as item>
    <#if item.array()>   
    ${item.field.name} = new ${item.field.elementType}[${item.dimensions[0]}];
    for (int i = 0; i < ${item.dimensions[0]}; i++) {
        long offset = ${item.offsetField.name} + i * ${item.field.elementType}.LAYOUT.byteSize();
        ${item.field.name}[i] = new ${item.field.elementType}(segment.asSlice(offset, ${item.field.elementType}.LAYOUT));
    }

    <#else>
    ${item.field.name} = new ${item.field.type}(segment.asSlice(${item.offsetField.name}, ${item.field.type}.LAYOUT));
    </#if>
    </#list>
}