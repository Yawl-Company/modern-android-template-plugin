package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.activity.main
import com.yawl.android.template.modern.app.appCoreWriter
import com.yawl.android.template.modern.buildLogic.buildLogicWriter
import com.yawl.android.template.modern.libs.libsVersionsTomlWriter

fun RecipeExecutor.modernAndroidRecipe(
    parameters: MaTemplateParameters
) {
    val moduleData = parameters.moduleData
    val rootDir = moduleData.rootDir
    buildLogicWriter(rootDir)
    libsVersionsTomlWriter(rootDir)
    appCoreWriter(moduleData = moduleData)
    main(moduleData = moduleData)
}
