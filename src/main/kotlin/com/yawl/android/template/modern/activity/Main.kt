package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor

fun RecipeExecutor.main(
    moduleData: ModuleTemplateData
) {
    val (_, srcOut) = moduleData
    val packageName = moduleData.packageName
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