package com.yawl.matemplate.buildLogic.test

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import java.io.File

fun RecipeExecutor.testConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "test",
        buildGradleSource = testBuildGradle()
    )
}
