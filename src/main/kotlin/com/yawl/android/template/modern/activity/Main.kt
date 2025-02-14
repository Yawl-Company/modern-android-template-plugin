package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.saveFile
import com.yawl.android.template.modern.activity.content.mainActivity
import com.yawl.android.template.modern.activity.content.appSrcBuildGradleKts

fun RecipeExecutor.appModuleWriter(
    template: AndroidTemplate
) {
    val root = template
        .projectRoot()
    val packageName = template
        .packageName()
    val activityPath = template
        .sourcesRoot()
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
