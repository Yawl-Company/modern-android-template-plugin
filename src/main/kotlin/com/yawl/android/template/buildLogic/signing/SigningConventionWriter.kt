package com.yawl.android.template.buildLogic.signing

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.buildLogic.createModule
import com.yawl.android.template.buildLogic.signing.content.androidAppSignConventionPlugin
import java.io.File

fun RecipeExecutor.signingConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "signing",
        buildGradleSource = signingBuildGradle(),
        content = { directory ->
            save(
                source = androidAppSignConventionPlugin(),
                to = directory
                    .resolve("AndroidApplicationSignConventionPlugin.kt")
            )
        }
    )
}
