package com.yawl.android.template.modern.convention.android

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.IModernTemplate
import com.yawl.android.template.modern.convention.createModule
import com.yawl.android.template.modern.convention.android.content.*
import java.io.File

fun RecipeExecutor.setupAndroidConvention(
    template: IModernTemplate,
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "android",
        buildGradleSource = androidBuildGradle(
            template = template
        ),
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
            if (template.room()) {
                save(
                    source = androidRoomConventionPlugin(),
                    to = directory
                        .resolve("AndroidRoomConventionPlugin.kt")
                )
            }
            if (template.hilt()) {
                save(
                    source = hiltConventionPlugin(),
                    to = directory
                        .resolve("HiltConventionPlugin.kt")
                )
            }
        }
    )
}
