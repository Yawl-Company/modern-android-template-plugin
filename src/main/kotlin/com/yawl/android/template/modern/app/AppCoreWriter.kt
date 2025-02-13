package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.core.rewriteFile

fun RecipeExecutor.appCoreWriter(
    moduleData: ModuleTemplateData
) {
    val projectData = moduleData.projectTemplateData
    val rootDir = projectData.rootDir
    val projectName = rootDir.name
    val packageName = moduleData.packageName
    rewriteFile(
        source = rootDir
            .resolve("build.gradle.kts"),
        content = packageGradleKts()
    )
    rewriteFile(
        source = rootDir
            .resolve("settings.gradle.kts"),
        content = packageSettingsGradleKts(
            projectName = projectName
        )
    )
    rewriteFile(
        source = rootDir
            .resolve("app/build.gradle.kts"),
        content = appSrcBuildGradleKts(
            packageName = packageName
        )
    )
}
