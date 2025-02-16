package com.yawl.android.template.core.gradle

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.extension.deleteFile
import com.yawl.android.template.core.extension.saveFile
import java.io.File

fun RecipeExecutor.buildGradleKts(
    directory: File,
    content: String,
    force: Boolean = false
) {
    val name = "build.gradle.kts"
    deleteFile(
        source = directory.resolve(
            name.substringBeforeLast('.')
        )
    )
    saveFile(
        source = directory.resolve(name),
        content = content,
        force = force
    )
}

