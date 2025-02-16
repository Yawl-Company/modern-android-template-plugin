package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.extension.projectGradle
import com.yawl.android.template.core.write.buildGradleKtsWriter
import com.yawl.android.template.core.write.settingsGradleKtsWriter
import com.yawl.android.template.modern.IModernTemplate
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: IModernTemplate
) {
    val root = template
        .projectRoot()
    buildGradleKtsWriter(
        directory = root,
        content = template
            .libraries()
            .plugins
            .projectGradle(),
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
