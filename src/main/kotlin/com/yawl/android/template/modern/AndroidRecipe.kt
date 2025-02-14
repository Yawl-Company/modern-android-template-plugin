package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.activity.appModuleWriter
import com.yawl.android.template.modern.convention.conventionsWriter
import com.yawl.android.template.modern.libs.libsVersionsTomlWriter
import com.yawl.android.template.modern.project.projectWriter

fun RecipeExecutor.modernAndroidRecipe(
    template: IMaTemplate
) {
    conventionsWriter(template = template)
    libsVersionsTomlWriter(template = template)
    projectWriter(template = template)
    appModuleWriter(template = template)
}
