package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.write.libsVersionsTomlWriter
import com.yawl.android.template.modern.app.setupAppModule
import com.yawl.android.template.modern.convention.conventionsWriter
import com.yawl.android.template.modern.project.projectWriter

fun RecipeExecutor.modernAndroidRecipe(
    template: IModernTemplate
) {
    libsVersionsTomlWriter(template = template)
    conventionsWriter(template = template)
    projectWriter(template = template)
    setupAppModule(template = template)
}
