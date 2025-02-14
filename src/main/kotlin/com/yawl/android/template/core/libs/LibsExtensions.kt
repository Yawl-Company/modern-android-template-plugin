package com.yawl.android.template.core.libs

fun pluginAlias(
    plugin: Plugin,
    apply: Boolean = false
) = "alias(libs.plugins.${plugin.name}) apply $apply"

fun coreProjectGradleKts(
    plugins: () -> List<Plugin>,
): String {
    val list = plugins().joinToString("\n    ") { plugin ->
        pluginAlias(plugin, false)
    }
    return "plugins {\n    $list\n}"
}