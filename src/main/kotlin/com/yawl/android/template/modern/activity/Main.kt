package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.MaTemplate
import com.yawl.android.template.modern.activity.content.mainActivity

fun RecipeExecutor.appModuleWriter(
    template: MaTemplate
) {
    val activityPath = template
        .sources()
        .resolve("MainActivity.kt")
    val packageName = template
        .packageName()
    save(
        source = mainActivity(
            packageName = packageName
        ),
        to = activityPath
    )
    open(activityPath)
}
