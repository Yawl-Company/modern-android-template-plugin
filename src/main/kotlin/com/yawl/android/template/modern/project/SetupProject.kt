package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.project.buildProjectSettingsGradleKts
import com.yawl.android.template.core.extension.pluginsSection
import com.yawl.android.template.core.gradle.buildGradleKts
import com.yawl.android.template.core.gradle.settingsGradleKts
import com.yawl.android.template.modern.IModernTemplate

fun RecipeExecutor.setupProject(
    template: IModernTemplate
) {
    val root = template
        .projectRoot()
    buildGradleKts(
        directory = root,
        content = template
            .libraries()
            .plugins
            .pluginsSection(apply = false),
        force = true
    )
    settingsGradleKts(
        directory = root,
        content = buildProjectSettingsGradleKts(
            projectName = template.projectName(),
            suppressUnstableApiUsage = true,
            enableTypesafeProjectAccessors = true,
            includeBuild = true
        ),
        force = true
    )
}
