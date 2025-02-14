package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.MaTemplate

fun RecipeExecutor.appCoreWriter(
    template: MaTemplate
) {
    val module = template.moduleData
    val projectData = module.projectTemplateData
    val rootDir = projectData.rootDir
    val projectName = rootDir.name
    val packageName = module.packageName
    saveFile(
        source = rootDir
            .resolve("build.gradle.kts"),
        content = packageGradleKts(),
        force = true
    )
    saveFile(
        source = rootDir
            .resolve("settings.gradle.kts"),
        content = packageSettingsGradleKts(
            projectName = projectName
        ),
        force = true
    )
    saveFile(
        source = rootDir
            .resolve("app/build.gradle.kts"),
        content = appSrcBuildGradleKts(
            packageName = packageName
        ),
        force = true
    )
}
