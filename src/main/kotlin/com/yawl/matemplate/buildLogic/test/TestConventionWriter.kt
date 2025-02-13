package com.yawl.matemplate.buildLogic.test

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.createModule
import com.yawl.matemplate.buildLogic.test.content.androidUiTestConventionPlugin
import com.yawl.matemplate.buildLogic.test.content.androidUnitTestConventionPlugin
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
