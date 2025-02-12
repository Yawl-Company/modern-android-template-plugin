package com.yawl.matemplate

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies

fun RecipeExecutor.modernAndroidRecipe(
    moduleData: ModuleTemplateData,
    packageName: String,
) {
    addAllKotlinDependencies(moduleData)
}