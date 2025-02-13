package com.yawl.matemplate.buildLogic.android

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.androidConventionWriter(
    parentDirectory: File
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = "android",
        buildGradleSource = androidBuildGradle()
    )
}
