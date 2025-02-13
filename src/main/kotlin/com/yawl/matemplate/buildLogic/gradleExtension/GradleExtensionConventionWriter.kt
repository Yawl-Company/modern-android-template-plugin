package com.yawl.matemplate.buildLogic.gradleExtension

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.gradleConventionWriter(
    parentDirectory: File
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = "gradle-extension",
        buildGradleSource = gradleBuildGradle()
    )
}
