package com.yawl.matemplate.buildLogic.signing

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.conventionModuleWriter
import java.io.File

fun RecipeExecutor.signingConventionWriter(
    parentDirectory: File
) {
    conventionModuleWriter(
        parentDirectory = parentDirectory,
        moduleName = "signing",
        buildGradleSource = signingBuildGradle()
    )
}
