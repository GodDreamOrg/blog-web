<#assign base=request.contextPath />

<script>
    var base = '${base}';
</script>

<script src="${base}/js/jquery.min.js"></script>

<#macro drawNote note>
    <#if note.childList??>
    <a href="javascript:;">
    ${note.name}
        <span class="arrow "></span>
    </a>
    <ul class="sub-menu">
        <#list note.childList as child>
            <li>
                <@drawNote note=child></@drawNote>
            </li>
        </#list>
    </ul>
    <#else>
    <a href="${base}/${note.url}">
    ${note.name}
    </a>
    </#if>
</#macro>

<#macro drawTree noteList>
    <#list noteList as note>
        <#if note.childList??>
        <li class="">
            <a href="javascript:;">
                <i class="icon-cogs"></i>
                <span class="title">${note.name}</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <#list note.childList as child>
                    <li>
                        <@drawNote note=child></@drawNote>
                    </li>
                </#list>
            </ul>
        </li>
        <#else>
        <li class="">
            <a href="${base}/${note.url}">
                <i class="icon-cogs"></i>
                <span class="title">${note.name}</span>
            </a>
        </li>
        </#if>
    </#list>
</#macro>