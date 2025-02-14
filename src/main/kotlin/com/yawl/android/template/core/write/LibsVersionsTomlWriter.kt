package com.yawl.android.template.core.write

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.extension.saveFile

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
