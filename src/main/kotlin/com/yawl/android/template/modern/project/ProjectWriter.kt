package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.project.content.projectGradle
import com.yawl.android.template.core.write.buildGradleKtsWriter
import com.yawl.android.template.core.write.settingsGradleKtsWriter
import com.yawl.android.template.modern.IMaTemplate
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: IMaTemplate
) {
    val root = template
        .projectRoot()
    val plugins = template
        .libraries()
        .plugins
    buildGradleKtsWriter(
        directory = root,
        content = plugins
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
