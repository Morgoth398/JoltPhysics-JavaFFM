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
            UNBOUNDED_ADDRESS.withName("${info.name}")<#sep>, </#sep>
            </#list>
        ).withName("${structName}").withByteAlignment(8);

        <#list clazz.staticBlock.elements as element>
        ${element}
        </#list>

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            <#list infos as info>
            <#if info.hasReturnType>
            ${info.constantsName}_DESCRIPTION = FunctionDescriptor.of(
                ${info.returnTypeLayout}, 
            <#else>
            ${info.constantsName}_DESCRIPTION = FunctionDescriptor.ofVoid(
            </#if>
                <#list info.valueLayouts as layout>
                ${layout}<#sep>, </#sep>
                </#list>
            );

            ${info.constantsName}_HANDLE = lookup.findStatic(${clazz.description.name}.class, "${info.name}", ${info.constantsName}_DESCRIPTION.toMethodType());

            ${info.constantsName}_ADDRESS = linker.upcallStub(${info.constantsName}_HANDLE, ${info.constantsName}_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("${info.name}")), ${info.constantsName}_ADDRESS);
            
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
    <#assign method = info.method>

    public static<#if !info.hasReturnType> void<#else><#if method.returnType.isPrimitive> ${method.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list method.parameters as parameter>
        <#if parameter.isPrimitive>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>, </#sep>
        </#list>
    ) {
        ${clazz.description.name} callback = CACHE.get(userData.address()).get();

        <#if info.hasReturnType && method.returnType.isPrimitive>
        return (${method.returnType.type}) callback.${info.name}(
        <#elseif info.hasReturnType && !method.returnType.isPrimitive>
        MemorySegment segment = callback.${info.name}(
        <#else>
        callback.${info.name}(
        </#if>
            <#list method.parameters?filter(p -> !p.name?contains("userData")) as parameter>
            ${parameter.name}<#sep>, </#sep>
            </#list>
        );
    }

    <#if info.description.addTypedMethod>
    public<#if !info.hasReturnType> void<#else><#if method.returnType.isPrimitive> ${method.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list method.parameters?filter(p -> !p.name?contains("userData")) as parameter>
        <#if parameter.isPrimitive>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>, </#sep>
        </#list>
    ) {
        <#if info.hasReturnType && method.returnType.isPrimitive>
        return (${method.returnType.type}) ${info.name}(
        <#elseif info.hasReturnType && !method.returnType.isPrimitive>
        MemorySegment segment = ${info.name}(
        <#else>
        ${info.name}(
        </#if>
            <#list method.parameters?filter(p -> !p.name?contains("userData")) as parameter>
            <#if parameter.isPrimitive || parameter.isRawSegment>
            ${parameter.name}<#sep>, </#sep>
            <#elseif parameter.isFunctionPointer>
            ${parameter.type}.get(${parameter.name})<#sep>, </#sep>
            <#elseif parameter.isString>
            ${parameter.name}.getString(0)<#sep>, </#sep>
            <#elseif parameter.isStructArray>
            ${parameter.typeName}.array(${parameter.name})<#sep>, </#sep>
            <#else>
            new ${parameter.type}(${parameter.name})<#sep>, </#sep>
            </#if>
            </#list>
        );
        <#if info.hasReturnType && !method.returnType.isPrimitive>

        if (segment.equals(MemorySegment.NULL))
            return null;

        <#if method.returnType.isStructArray>
        return ${method.returnType.typeName}.array(segment);
        <#elseif method.returnType.isRawSegment>
        return segment;
        <#elseif method.returnType.isString>
        return segment.getString(0);
        <#elseif method.returnType.isFunctionPointer>
        return ${method.returnType.type}.get(segment);
        <#else>
        return new ${method.returnType.type}(segment);
        </#if>
        </#if>
    }

    public<#if !info.hasReturnType> void<#else> ${method.returnType.type}</#if> ${info.name}(
        <#list method.parameters?filter(p -> !p.name?contains("userData")) as parameter>
        ${parameter.type} ${parameter.name}<#sep>, </#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for ${info.name}."
        );
    }

    <#else>
    public<#if !info.hasReturnType> void<#else><#if method.returnType.isPrimitive> ${method.returnType.type}<#else> MemorySegment</#if></#if> ${info.name}(
        <#list method.parameters?filter(p -> !p.name?contains("userData")) as parameter>
        <#if parameter.isPrimitive>${parameter.type}<#else>MemorySegment</#if> ${parameter.name}<#sep>, </#sep>
        </#list>
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for ${info.name}."
        );
    }
    </#if>
    </#list>

}