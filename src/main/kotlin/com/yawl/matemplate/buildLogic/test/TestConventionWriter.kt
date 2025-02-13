package com.yawl.matemplate.buildLogic.test

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.testConventionWriter(
    parentDirectory: File
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = "test",
        buildGradleSource = testBuildGradle()
    )
}
