package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.buildGradleKtsWriter
import com.yawl.android.template.core.libs.coreProjectGradleKts
import com.yawl.android.template.core.settingsGradleKtsWriter
import com.yawl.android.template.modern.IMaTemplate
import com.yawl.android.template.modern.project.content.maTemplatePlugins
import com.yawl.android.template.modern.project.content.projectSettingsGradleKts

fun RecipeExecutor.projectWriter(
    template: IMaTemplate
) {
    val root = template.projectRoot()
    buildGradleKtsWriter(
        directory = root,
        content = coreProjectGradleKts {
            maTemplatePlugins(template)
        },
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
