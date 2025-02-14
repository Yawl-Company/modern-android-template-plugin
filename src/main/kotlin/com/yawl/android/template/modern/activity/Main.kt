package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.MaTemplate

fun RecipeExecutor.appModuleWriter(
    template: MaTemplate,
) {
    val module = template.moduleData
    val (_, srcOut) = module
    val packageName = module.packageName
    val activityPath = srcOut
        .resolve("MainActivity.kt")
    save(
        source = mainActivity(
            packageName = packageName
        ),
        to = activityPath
    )
    open(activityPath)
}