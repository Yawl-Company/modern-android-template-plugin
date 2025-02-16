package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.buildAppBuildGradleKts
import com.yawl.android.template.core.write.buildGradleKtsWriter
import com.yawl.android.template.modern.app.content.mainActivity
import com.yawl.android.template.modern.dependencies.toml.pConventionAndroidApplication

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
        content = buildAppBuildGradleKts(
            packageName = template
                .packageName(),
            plugins = listOf(
                pConventionAndroidApplication,
            ),
            dependencies = listOf(

            )
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
