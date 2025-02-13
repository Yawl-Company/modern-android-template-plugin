package com.yawl.matemplate.buildLogic.kotlin

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import java.io.File

fun RecipeExecutor.kotlinConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "kotlin",
        buildGradleSource = kotlinBuildGradle()
    )
}
