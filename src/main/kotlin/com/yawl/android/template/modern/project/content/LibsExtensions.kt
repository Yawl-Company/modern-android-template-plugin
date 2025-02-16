package com.yawl.android.template.modern.project.content

import com.yawl.android.template.core.libs.PluginToml

fun List<PluginToml>.projectGradle(): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { plugin -> plugin.apply(false) }
    return "plugins {$spaces$list\n}"
}
