package com.yawl.android.template.core.gradle

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.extension.deleteFile
import com.yawl.android.template.core.extension.saveFile
import java.io.File

fun RecipeExecutor.settingsGradleKts(
    directory: File,
    content: String,
    force: Boolean = false
) {
    val name = "settings.gradle.kts"
    // remove groove settings.gradle if exist
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
