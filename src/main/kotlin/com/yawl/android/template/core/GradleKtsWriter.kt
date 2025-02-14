package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.RecipeExecutor
import java.io.File

fun RecipeExecutor.buildGradleKtsWriter(
    directory: File,
    content: String,
    force: Boolean = false
) {
    val name = "build.gradle.kts"
    saveFile(
        source = directory.resolve(name),
        content = content,
        force = force
    )
}

fun RecipeExecutor.settingsGradleKtsWriter(
    directory: File,
    content: String,
    force: Boolean = false
) {
    val name = "settings.gradle.kts"
    saveFile(
        source = directory.resolve(name),
        content = content,
        force = force
    )
}
