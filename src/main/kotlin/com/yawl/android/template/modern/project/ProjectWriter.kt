package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.project.content.projectGradleKts
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: AndroidTemplate
) {
    val root = template.projectRoot()
    val projectName = template.projectName()
    saveFile(
        source = root.resolve(
            "build.gradle.kts"
        ),
        content = projectGradleKts(),
        force = true
    )
    saveFile(
        source = root.resolve(
            "settings.gradle.kts"
        ),
        content = projectSettingsGradleKts(
            projectName = projectName
        ),
        force = true
    )
}
