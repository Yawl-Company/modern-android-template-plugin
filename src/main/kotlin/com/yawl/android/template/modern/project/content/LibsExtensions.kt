package com.yawl.android.template.modern.project.content

import com.yawl.android.template.core.libs.PluginToml

fun List<PluginToml>.projectGradle(): String {
    val list = this.joinToString("\n    ") { plugin ->
        "alias(${plugin.alias()}) apply false"
    }
    return "plugins {\n    $list\n}"
}
