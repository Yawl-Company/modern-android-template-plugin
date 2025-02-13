package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.yawl.android.template.modern.activity.main
import com.yawl.android.template.modern.app.appBuild
import com.yawl.android.template.modern.buildLogic.buildLogicWriter
import com.yawl.android.template.modern.libs.libsTomlFile

fun RecipeExecutor.modernAndroidRecipe(
    moduleData: ModuleTemplateData
) {
    addAllKotlinDependencies(data = moduleData)
    buildLogicWriter(moduleData = moduleData)
    libsTomlFile(moduleData = moduleData)
    appBuild(moduleData = moduleData)
    main(moduleData = moduleData)
}
