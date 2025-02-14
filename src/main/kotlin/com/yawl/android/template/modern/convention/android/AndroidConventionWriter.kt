package com.yawl.android.template.modern.convention.android

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.convention.createModule
import com.yawl.android.template.modern.convention.android.content.*
import java.io.File

fun RecipeExecutor.androidConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "android",
        buildGradleSource = androidBuildGradle(),
        content = { directory ->
            save(
                source = androidApplicationConventionPlugin(),
                to = directory
                    .resolve("AndroidApplicationConventionPlugin.kt")
            )
            save(
                source = androidBaseConventionPlugin(),
                to = directory
                    .resolve("AndroidBaseConventionPlugin.kt")
            )
            save(
                source = androidLibraryConventionPlugin(),
                to = directory
                    .resolve("AndroidLibraryConventionPlugin.kt")
            )
            save(
                source = androidComposeConventionPlugin(),
                to = directory
                    .resolve("AndroidComposeConventionPlugin.kt")
            )
            save(
                source = androidRoomConventionPlugin(),
                to = directory
                    .resolve("AndroidRoomConventionPlugin.kt")
            )
            save(
                source = hiltConventionPlugin(),
                to = directory
                    .resolve("HiltConventionPlugin.kt")
            )
        }
    )
}
