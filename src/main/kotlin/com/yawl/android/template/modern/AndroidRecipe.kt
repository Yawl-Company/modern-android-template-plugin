package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.activity.appModuleWriter
import com.yawl.android.template.modern.app.appCoreWriter
import com.yawl.android.template.modern.buildLogic.buildLogicWriter
import com.yawl.android.template.modern.libs.libsVersionsTomlWriter

fun RecipeExecutor.modernAndroidRecipe(
    template: MaTemplate
) {
    buildLogicWriter(template = template)
    libsVersionsTomlWriter(template = template)
    appCoreWriter(template = template)
    appModuleWriter(template = template)
}
