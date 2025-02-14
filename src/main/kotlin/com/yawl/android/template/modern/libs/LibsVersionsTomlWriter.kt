package com.yawl.android.template.modern.libs

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.IMaTemplate
import com.yawl.android.template.modern.libs.content.libsToml

fun RecipeExecutor.libsVersionsTomlWriter(
    template: IMaTemplate
) {
    val moduleName = "gradle"
    val gradleDir = template
        .projectRoot()
        .resolve(moduleName)
    saveFile(
        source = gradleDir
            .resolve("libs.versions.toml"),
        content = libsToml(),
        force = true
    )
}
