package com.yawl.matemplate

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.yawl.matemplate.activity.main
import com.yawl.matemplate.app.appBuild
import com.yawl.matemplate.buildLogic.buildLogicWriter
import com.yawl.matemplate.libs.libsTomlFile

fun RecipeExecutor.modernAndroidRecipe(
    moduleData: ModuleTemplateData
) {
    addAllKotlinDependencies(data = moduleData)
    buildLogicWriter(moduleData = moduleData)
    libsTomlFile(moduleData = moduleData)
    appBuild(moduleData = moduleData)
    main(moduleData = moduleData)
}
