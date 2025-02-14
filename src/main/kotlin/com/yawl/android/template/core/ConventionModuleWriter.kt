package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.RecipeExecutor
import java.io.File

fun RecipeExecutor.conventionModuleWriter(
    parentDirectory: File,
    moduleName: String,
    buildGradleSource: String
) {
    val directory = parentDirectory
        .resolve(moduleName)
    createDirectory(
        at = directory
    )
    save(
        source = buildGradleSource,
        to = directory
            .resolve("build.gradle.kts"),
    )
}
