public ${className}() {
    this(Arena.ofAuto());
}

public ${className}(Arena arena) {
    this(arena.allocate(LAYOUT));
}

public ${className}(MemorySegment segment) {
    this.segment = segment;

    <#list structData as data>
    <#if data.field.count == 0>
    ${data.field.name} = new ${data.field.type}(segment.asSlice(${data.offsetName}, ${data.field.type}.LAYOUT));
    <#else>

    ${data.field.name} = new ${data.field.type}[${data.field.count}];
    for (int i = 0; i < ${data.field.count}; i++) {
        long offset = ${data.offsetName} + i * ${data.field.type}.LAYOUT.byteSize();
        ${data.field.name}[i] = new ${data.field.type}(segment.asSlice(offset, ${data.field.type}.LAYOUT));
    }

    </#if>
    </#list>

    init();
}