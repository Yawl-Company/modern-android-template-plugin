package com.yawl.android.template.core.extension

import com.yawl.android.template.core.libs.LibraryBuildGradle
import com.yawl.android.template.core.libs.PluginBuildGradle

fun List<PluginBuildGradle>.pluginsSection(apply: Boolean): String {
    val list = this.map { plugin -> plugin.apply(apply) }
    return list.section("plugins")
}

fun List<LibraryBuildGradle>.librariesDependencies(): String {
    val list = this.map { library -> library.implementation() }
    return list.section("dependencies")
}

fun List<String>.section(name: String): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces)
    return "$name {$spaces$list\n}"
}
