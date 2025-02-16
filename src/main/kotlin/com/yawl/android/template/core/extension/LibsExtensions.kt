package com.yawl.android.template.core.extension

import com.yawl.android.template.core.libs.LibraryBuildGradle
import com.yawl.android.template.core.libs.PluginBuildGradle

fun List<PluginBuildGradle>.pluginsSection(apply: Boolean): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { plugin -> plugin.apply(apply) }
    return "plugins {$spaces$list\n}"
}

fun List<LibraryBuildGradle>.librariesDependencies(): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { library -> library.implementation() }
    return "dependencies {$spaces$list\n}"
}

