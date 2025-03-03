package com.yawl.android.template.modern.convention

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.gradle.buildGradleKts
import java.io.File

fun RecipeExecutor.createModule(
    parentDirectory: File,
    moduleName: String,
    buildGradleSource: String,
    content: (directory: File) -> Unit = {},
) {
    val directory = parentDirectory
        .resolve(moduleName)
    createDirectory(
        at = directory
    )
    buildGradleKts(
        directory = directory,
        content = buildGradleSource,
        force = false
    )
    createSourcesDirectory(
        parentDirectory = parentDirectory
            .resolve(moduleName),
        putContent = content
    )
}