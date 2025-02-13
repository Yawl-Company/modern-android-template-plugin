package com.yawl.matemplate.buildLogic.gradleExtension

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import com.yawl.matemplate.buildLogic.gradleExtension.content.gradleSecretsConventionPlugin
import com.yawl.matemplate.buildLogic.gradleExtension.content.versionCatalog
import java.io.File

fun RecipeExecutor.gradleConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "gradle-extension",
        buildGradleSource = gradleBuildGradle(),
        content = { directory ->
            save(
                source = gradleSecretsConventionPlugin(),
                to = directory
                    .resolve("GradleSecretsConventionPlugin.kt")
            )
            save(
                source = versionCatalog(),
                to = directory
                    .resolve("VersionCatalog.kt")
            )
        }
    )
}
