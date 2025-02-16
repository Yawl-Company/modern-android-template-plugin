package com.yawl.android.template.modern.project

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.buildProjectSettingsGradleKts
import com.yawl.android.template.core.extension.pluginsSection
import com.yawl.android.template.core.write.buildGradleKtsWriter
import com.yawl.android.template.core.write.settingsGradleKtsWriter
import com.yawl.android.template.modern.IModernTemplate

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
            .pluginsSection(apply = false),
        force = true
    )
    settingsGradleKtsWriter(
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
