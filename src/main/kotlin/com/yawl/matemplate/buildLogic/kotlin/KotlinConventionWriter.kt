package com.yawl.matemplate.buildLogic.kotlin

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.kotlinConventionWriter(
    parentDirectory: File
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = "kotlin",
        buildGradleSource = kotlinBuildGradle()
    )
}
