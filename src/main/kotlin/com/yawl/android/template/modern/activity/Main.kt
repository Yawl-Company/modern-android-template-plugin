package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.MaTemplate
import com.yawl.android.template.modern.activity.content.mainActivity
import com.yawl.android.template.modern.activity.content.appSrcBuildGradleKts

fun RecipeExecutor.appModuleWriter(
    template: MaTemplate
) {
    val root = template
        .root()
    val packageName = template
        .packageName()
    val activityPath = template
        .sources()
        .resolve("MainActivity.kt")
    saveFile(
        source = root.resolve(
            "app/build.gradle.kts"
        ),
        content = appSrcBuildGradleKts(
            packageName = packageName
        ),
        force = true
    )
    save(
        source = mainActivity(
            packageName = packageName
        ),
        to = activityPath
    )
    open(activityPath)
}
