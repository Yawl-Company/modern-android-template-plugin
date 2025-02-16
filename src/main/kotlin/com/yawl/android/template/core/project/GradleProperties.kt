package com.yawl.android.template.core.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.extension.saveFile

fun RecipeExecutor.gradleProperties(
    template: AndroidTemplate,
    caching: Boolean,
    parallel: Boolean,
    configureondemand: Boolean,
    configurationCache: Boolean,
) {
    saveFile(
        source = template
            .projectRoot()
            .resolve("gradle.properties"),
        content = gradleProperties(
            caching = caching,
            parallel = parallel,
            configureondemand = configureondemand,
            configurationCache = configurationCache
        ),
        force = true
    )
}

fun gradleProperties(
    caching: Boolean,
    parallel: Boolean,
    configureondemand: Boolean,
    configurationCache: Boolean
): String {
    return buildString {
        appendLine("org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8")
        appendLine("android.useAndroidX=true")
        appendLine("kotlin.code.style=official")
        appendLine("android.nonTransitiveRClass=true")
        if (parallel) {
            appendLine("org.gradle.parallel=true")
        }
        if (caching) {
            appendLine("org.gradle.caching=true")
        }
        if (configureondemand) {
            appendLine("org.gradle.configureondemand=false")
        }
        if (configurationCache) {
            appendLine("org.gradle.configuration-cache=true")
            appendLine("org.gradle.configuration-cache.problems=warn")
        }
    }
}
