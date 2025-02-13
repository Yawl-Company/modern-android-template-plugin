package com.yawl.matemplate

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.yawl.matemplate.buildLogic.buildLogicWriter

fun RecipeExecutor.modernAndroidRecipe(
    moduleData: ModuleTemplateData
) {
    addAllKotlinDependencies(data = moduleData)
    buildLogicWriter(moduleData = moduleData)
}
