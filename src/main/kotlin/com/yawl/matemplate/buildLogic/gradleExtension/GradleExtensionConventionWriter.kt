package com.yawl.matemplate.buildLogic.gradleExtension

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import java.io.File

fun RecipeExecutor.gradleConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "gradle-extension",
        buildGradleSource = gradleBuildGradle()
    )
}
