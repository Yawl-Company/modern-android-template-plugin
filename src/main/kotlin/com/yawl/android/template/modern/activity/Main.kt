package com.yawl.android.template.modern.activity

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.buildGradleKtsWriter
import com.yawl.android.template.modern.activity.content.mainActivity
import com.yawl.android.template.modern.activity.content.appSrcBuildGradleKts

fun RecipeExecutor.appModuleWriter(
    template: AndroidTemplate
) {
    appBuildGradleWriter(template = template)
    appMainActivityWriter(template = template)
}

fun RecipeExecutor.appBuildGradleWriter(
    template: AndroidTemplate,
) {
    buildGradleKtsWriter(
        directory = template
            .projectRoot()
            .resolve("app"),
        content = appSrcBuildGradleKts(
            packageName = template
                .projectName()
        ),
        force = true
    )
}

fun RecipeExecutor.appMainActivityWriter(
    template: AndroidTemplate
) {
    val activityPath = template
        .sourcesRoot()
        .resolve("MainActivity.kt")
    save(
        source = mainActivity(
            packageName = template
                .packageName()
        ),
        to = activityPath
    )
    open(activityPath)
}
