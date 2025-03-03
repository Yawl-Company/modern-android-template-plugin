package com.yawl.android.template.core.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.extension.saveFile

fun RecipeExecutor.setupLibsVersionsToml(
    template: AndroidTemplate
) {
    val moduleName = "gradle"
    val gradleDir = template
        .projectRoot()
        .resolve(moduleName)
    saveFile(
        source = gradleDir
            .resolve("libs.versions.toml"),
        content = template
            .libraries()
            .declaration(),
        force = true
    )
}
