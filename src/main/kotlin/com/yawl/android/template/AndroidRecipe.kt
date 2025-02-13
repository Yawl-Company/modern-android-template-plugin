package com.yawl.android.template

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.yawl.android.template.activity.main
import com.yawl.android.template.app.appBuild
import com.yawl.android.template.buildLogic.buildLogicWriter
import com.yawl.android.template.libs.libsTomlFile

fun RecipeExecutor.modernAndroidRecipe(
    moduleData: ModuleTemplateData
) {
    addAllKotlinDependencies(data = moduleData)
    buildLogicWriter(moduleData = moduleData)
    libsTomlFile(moduleData = moduleData)
    appBuild(moduleData = moduleData)
    main(moduleData = moduleData)
}
