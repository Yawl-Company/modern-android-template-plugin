package com.yawl.android.template.core.extension

import com.yawl.android.template.core.libs.LibraryToml
import com.yawl.android.template.core.libs.PluginToml

fun List<PluginToml>.pluginsSection(apply: Boolean): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { plugin -> plugin.apply(apply) }
    return "plugins {$spaces$list\n}"
}

fun List<LibraryToml>.librariesDependencies(): String {
    val spaces = "\n    "
    val list = this.joinToString(spaces) { library -> library.implementation() }
    return "dependencies {$spaces$list\n}"
}

