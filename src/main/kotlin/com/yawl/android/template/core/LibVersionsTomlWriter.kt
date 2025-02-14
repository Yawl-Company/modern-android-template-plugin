package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.RecipeExecutor

fun RecipeExecutor.libsVersionsTomlWriter(
    template: AndroidTemplate,
    content: String
) {
    val moduleName = "gradle"
    val gradleDir = template
        .projectRoot()
        .resolve(moduleName)
    saveFile(
        source = gradleDir
            .resolve("libs.versions.toml"),
        content = content,
        force = true
    )
}
