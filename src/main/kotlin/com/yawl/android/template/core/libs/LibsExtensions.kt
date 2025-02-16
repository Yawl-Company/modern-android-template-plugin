package com.yawl.android.template.core.libs

fun List<PluginToml>.projectGradle(): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { plugin -> plugin.apply(false) }
    return "plugins {$spaces$list\n}"
}
