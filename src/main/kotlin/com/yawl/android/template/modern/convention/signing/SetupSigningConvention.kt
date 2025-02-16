package com.yawl.android.template.modern.convention.signing

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.convention.createModule
import com.yawl.android.template.modern.convention.signing.content.androidAppSignConventionPlugin
import java.io.File

fun RecipeExecutor.setupSigningConvention(
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
