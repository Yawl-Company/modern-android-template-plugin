package com.yawl.matemplate.buildLogic.android

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import java.io.File

fun RecipeExecutor.androidConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "android",
        buildGradleSource = androidBuildGradle()
    )
}
