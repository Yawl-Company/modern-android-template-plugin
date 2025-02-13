package com.yawl.android.template.modern.buildLogic

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.createModule(
    parentDirectory: File,
    moduleName: String,
    buildGradleSource: String,
    content: (directory: File) -> Unit = {},
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = moduleName,
        buildGradleSource = buildGradleSource
    )
    createSourcesDirectory(
        parentDirectory = parentDirectory
            .resolve(moduleName),
        putContent = content
    )
}