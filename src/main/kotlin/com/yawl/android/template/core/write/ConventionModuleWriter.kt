package com.yawl.android.template.core.write

import com.android.tools.idea.wizard.template.RecipeExecutor
import java.io.File

fun RecipeExecutor.conventionModuleWriter(
    parentDirectory: File,
    moduleName: String,
    buildGradleSource: String
) {
    val directory = parentDirectory
        .resolve(moduleName)
    createDirectory(
        at = directory
    )
    buildGradleKtsWriter(
        directory = directory,
        content = buildGradleSource,
        force = false
    )
}
