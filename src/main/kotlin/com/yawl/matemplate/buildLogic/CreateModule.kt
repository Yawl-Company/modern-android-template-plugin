package com.yawl.matemplate.buildLogic

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.createModule(
    parentDirectory: File,
    moduleName: String,
    buildGradleSource: String
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = moduleName,
        buildGradleSource = buildGradleSource
    )
    createSourcesDirectory(
        parentDirectory = parentDirectory
            .resolve(moduleName)
    )
}