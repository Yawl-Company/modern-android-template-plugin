package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.activity.main
import com.yawl.android.template.modern.app.appBuild
import com.yawl.android.template.modern.buildLogic.buildLogicWriter
import com.yawl.android.template.modern.libs.libsTomlFile

fun RecipeExecutor.modernAndroidRecipe(
    parameters: MaTemplateParameters
) {
    val moduleData = parameters.moduleData
    buildLogicWriter(moduleData = moduleData)
    libsTomlFile(moduleData = moduleData)
    appBuild(moduleData = moduleData)
    main(moduleData = moduleData)
}
