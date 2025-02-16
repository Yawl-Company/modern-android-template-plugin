package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.write.libsVersionsTomlWriter
import com.yawl.android.template.modern.app.setupAppModule
import com.yawl.android.template.modern.convention.conventionsWriter
import com.yawl.android.template.modern.project.setupProject

fun RecipeExecutor.modernAndroidRecipe(
    template: IModernTemplate
) {
    libsVersionsTomlWriter(template = template)
    conventionsWriter(template = template)
    setupProject(template = template)
    setupAppModule(template = template)
}
