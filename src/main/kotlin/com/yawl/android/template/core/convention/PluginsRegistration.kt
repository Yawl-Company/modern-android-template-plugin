package com.yawl.android.template.core.convention

import com.yawl.android.template.core.libs.part.Plugin

fun conventionPluginsRegistration(
    plugins: List<Pair<Plugin, String>>
): String {
    return buildString {
        appendLine("gradlePlugin {")
        appendLine("    plugins {")

        plugins.forEachIndexed { index, (plugin, implementationClass) ->
            appendLine(
                """
                create("${plugin.id}") {
                    id = "${plugin.id}"
                    implementationClass = "$implementationClass"
                }
                """.trimIndent()
            )

            if (index < plugins.lastIndex) {
                appendLine()
            }
        }

        appendLine("    }")
        appendLine("}")
    }
}