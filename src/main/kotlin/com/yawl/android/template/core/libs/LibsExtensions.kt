package com.yawl.android.template.core.libs

fun List<Plugin>.projectGradle(): String {
    val list = this.joinToString("\n    ") { plugin ->
        "alias(${plugin.alias()}) apply false"
    }
    return "plugins {\n    $list\n}"
}
