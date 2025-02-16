package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.project.setupLibsVersionsToml
import com.yawl.android.template.modern.app.setupAppModule
import com.yawl.android.template.modern.convention.setupConventions
import com.yawl.android.template.modern.project.setupProject

fun RecipeExecutor.modernAndroidRecipe(
    template: IModernTemplate
) {
    setupLibsVersionsToml(template = template)
    setupConventions(template = template)
    setupProject(template = template)
    setupAppModule(template = template)
}
