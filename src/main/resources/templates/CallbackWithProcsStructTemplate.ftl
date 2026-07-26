/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package ${clazz.packageName};

<#list clazz.imports as import>
import ${import};
</#list>

<#list clazz.staticImports as import>
import static ${import};
</#list>

public abstract class ${clazz.description.name}${clazz.classHeader} {

    private static final HashMap${"<"}Long, WeakReference${"<"}${clazz.description.name}${">"}${">"} CACHE;

    public static final StructLayout LAYOUT;

    <#list infos as info>
    public static final FunctionDescriptor ${info.constantsName}_DESCRIPTION;
    public static final MethodHandle ${info.constantsName}_HANDLE;
    </#list>

    private static final MemorySegment PROCS;
    <#list infos as info>
    private static final MemorySegment ${info.constantsName}_ADDRESS;
    </#list>

    <#list clazz.fields as field>
    <#if field.blankLineBefore>

    </#if>
    ${field.modifiers?join(" ")} ${field.type} ${field.name}<#if field.value?has_content> = ${field.value}</#if>;
    <#if field.blankLineAfter>

    </#if>
    </#list> 

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            <#list infos as info>
            UNBOUNDED_ADDRESS.withName("${info.fieldName}")<#sep>,</#sep>
            </#list>
        ).withName("${structName}").withByteAlignment(8);

        <#list clazz.staticBlock.elements as element>
        ${element}
        </#list>

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = arena.allocate(LAYOUT);

        try {
            <#list infos as info>
            <#if info.hasReturnType()>
            ${info.constantsName}_DESCRIPTION = FunctionDescriptor.of(
                ${info.returnTypeLayout}, 
            <#else>
            ${info.constantsName}_DESCRIPTION = FunctionDescriptor.ofVoid(
            </#if>
                <#list info.valueLayouts as layout>
                ${layout}<#sep>,</#sep>
                </#list>
            );

            ${info.constantsName}_HANDLE = lookup.findStatic(${clazz.description.name}.class, "${info.name}", ${info.constantsName}_DESCRIPTION.toMethodType());

            ${info.constantsName}_ADDRESS = linker.upcallStub(${info.constantsName}_HANDLE, ${info.constantsName}_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("${info.fieldName}")), ${info.constantsName}_ADDRESS);
            
            </#list>
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public ${clazz.description.name}() {
        this(Arena.ofAuto());
    }

    public ${clazz.description.name}(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    <#list clazz.methods as method>
    <#list method.source as line>
    ${line}
    </#list>
    <#sep>
    
    </#sep>
    </#list>

    <#list infos as info>
    <#assign filteredParameters = info.parameters?filter(p -> !p.name?contains("userData"))>

    public static<#if !info.hasReturnType()> void<#else><#if info.returnType.isPrimitive()> ${info.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list info.parameters as parameter>
        <#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>, </#sep>
        </#list>
    ) {
        ${clazz.description.name} callback = CACHE.get(userData.address()).get();

        <#if info.hasReturnType() && info.returnType.isPrimitive()>
        return (${info.returnType.type}) callback.${info.name}(
        <#elseif info.hasReturnType() && !info.returnType.isPrimitive()>
        MemorySegment segment = callback.${info.name}(
        <#else>
        callback.${info.name}(
        </#if>
            <#list filteredParameters as parameter>
            ${parameter.name}<#sep>, </#sep>
            </#list>
        );
    }

    <#if info.addTypedMethod>
    public<#if !info.hasReturnType()> void<#else><#if info.returnType.isPrimitive()> ${info.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list filteredParameters as parameter>
        <#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        <#if info.hasReturnType()>
        return ${info.name}(
        <#else>
        ${info.name}(
        </#if>
            <#list filteredParameters as parameter>
            <#if parameter.isPrimitive() || parameter.isRawSegment()>
		    ${parameter.name}<#sep>,</#sep>
            <#elseif parameter.isFunctionPointer()>
            ${parameter.type}.get(${parameter.name})<#sep>,</#sep>
            <#elseif parameter.isString()>
            ${parameter.name}.getString(0)<#sep>,</#sep>
            <#elseif parameter.isStructArray()>
            ${parameter.type}.array(${parameter.name})<#sep>,</#sep>
            <#else>
            new ${parameter.type}(${parameter.name})<#sep>,</#sep>
            </#if>
            </#list>
        )<#if info.hasReturnType() && !(info.returnType.isPrimitive() || info.returnType.isRawSegment())>.memorySegment()</#if>;
    }

    public<#if !info.hasReturnType()> void<#else> <#if info.returnType.isStructArray()>NativeStructArray<${info.returnType.type}><#else>${info.returnType.type}</#if></#if> ${info.name}(
        <#list filteredParameters as parameter>
        <#if parameter.isStructArray()>NativeStructArray<${parameter.type}> <#else>${parameter.type} </#if>${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ${clazz.description.name}."
        );
    };
    <#else>
    public<#if !info.hasReturnType()> void<#else><#if info.returnType.isPrimitive()> ${info.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list filteredParameters as parameter>
        <#if parameter.isPrimitive()>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>,</#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ${clazz.description.name}."
        );
    }
    </#if>
    </#list>

}