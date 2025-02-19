package com.yawl.android.template.core.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.extension.saveFile

data class GradleProperties(
    val caching: Boolean,
    val parallel: Boolean,
    val configureondemand: Boolean,
    val configurationCache: Boolean
)

fun RecipeExecutor.gradleProperties(
    template: AndroidTemplate,
    properties: GradleProperties,
) {
    saveFile(
        source = template
            .projectRoot()
            .resolve("gradle.properties"),
        content = gradleProperties(
            properties = properties
        ),
        force = true
    )
}

fun gradleProperties(
    properties: GradleProperties,
): String {
    return buildString {
        appendLine("org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8")
        appendLine("android.useAndroidX=true")
        appendLine("kotlin.code.style=official")
        appendLine("android.nonTransitiveRClass=true")
        if (properties.parallel) {
            appendLine("org.gradle.parallel=true")
        }
        if (properties.caching) {
            appendLine("org.gradle.caching=true")
        }
        if (properties.configureondemand) {
            appendLine("org.gradle.configureondemand=false")
        }
        if (properties.configurationCache) {
            appendLine("org.gradle.configuration-cache=true")
            appendLine("org.gradle.configuration-cache.problems=warn")
        }
    }
}
