package com.yawl.matemplate.buildLogic.signing

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import java.io.File

fun RecipeExecutor.signingConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "signing",
        buildGradleSource = signingBuildGradle()
    )
}
