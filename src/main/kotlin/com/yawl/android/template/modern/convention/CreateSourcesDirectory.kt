package com.yawl.android.template.modern.convention

import com.android.tools.idea.wizard.template.RecipeExecutor
import java.io.File

fun RecipeExecutor.createSourcesDirectory(
    parentDirectory: File,
    putContent: (directory: File) -> Unit = {}
) {
    val directory = parentDirectory
        .resolve("src/main/kotlin/com/convention")
    createDirectory(at = directory)
    putContent(directory)
}
