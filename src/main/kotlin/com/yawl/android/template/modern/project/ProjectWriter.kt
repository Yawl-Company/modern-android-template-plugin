package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.MaTemplate
import com.yawl.android.template.modern.project.content.projectGradleKts
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: MaTemplate
) {
    val root = template.root()
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
