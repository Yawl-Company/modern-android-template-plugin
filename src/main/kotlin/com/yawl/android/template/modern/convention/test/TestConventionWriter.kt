package com.yawl.android.template.modern.convention.test

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.convention.createModule
import com.yawl.android.template.modern.convention.test.content.androidUiTestConventionPlugin
import com.yawl.android.template.modern.convention.test.content.androidUnitTestConventionPlugin
import java.io.File

fun RecipeExecutor.testConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "test",
        buildGradleSource = testBuildGradle(),
        content = { directory ->
            save(
                source = androidUiTestConventionPlugin(),
                to = directory
                    .resolve("AndroidUiTestConventionPlugin.kt")
            )
            save(
                source = androidUnitTestConventionPlugin(),
                to = directory
                    .resolve("AndroidUnitTestConventionPlugin.kt")
            )
        }
    )
}
