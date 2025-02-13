package com.yawl.matemplate.app

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.core.rewriteFile

fun RecipeExecutor.appBuild(
    moduleData: ModuleTemplateData
) {
    val projectData = moduleData.projectTemplateData
    val rootDir = projectData.rootDir
    val packageName = rootDir.name
    rewriteFile(
        source = rootDir
            .resolve("build.gradle.kts"),
        content = packageGradleKts()
    )
    rewriteFile(
        source = rootDir
            .resolve("settings.gradle.kts"),
        content = packageSettingsGradleKts(
            projectName = packageName
        )
    )
}
