package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.buildGradleKtsWriter
import com.yawl.android.template.core.settingsGradleKtsWriter
import com.yawl.android.template.modern.project.content.projectGradleKts
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: AndroidTemplate
) {
    val root = template.projectRoot()
    buildGradleKtsWriter(
        directory = root,
        content = projectGradleKts(),
        force = true
    )
    settingsGradleKtsWriter(
        directory = root,
        content = projectSettingsGradleKts(
            projectName = template.projectName()
        ),
        force = true
    )
}
