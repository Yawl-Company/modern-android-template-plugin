package com.yawl.matemplate.buildLogic

import com.android.tools.idea.wizard.template.RecipeExecutor
import java.io.File

fun RecipeExecutor.createSourcesDirectory(
    parentDirectory: File,
) {
    val conventionDirectory = "src/main/kotlin/com/convention"
    createDirectory(
        at = parentDirectory
            .resolve(relative = conventionDirectory)
    )
}