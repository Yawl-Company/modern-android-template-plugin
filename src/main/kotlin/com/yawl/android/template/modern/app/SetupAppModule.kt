package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.app.buildAppBuildGradleKts
import com.yawl.android.template.core.gradle.buildGradleKts
import com.yawl.android.template.modern.app.content.mainActivity
import com.yawl.android.template.modern.dependencies.toml.*

fun RecipeExecutor.setupAppModule(
    template: AndroidTemplate
) {
    setupAppBuildGradle(template = template)
    setupAppMainActivity(template = template)
}

fun RecipeExecutor.setupAppBuildGradle(
    template: AndroidTemplate,
) {
    buildGradleKts(
        directory = template
            .projectRoot()
            .resolve("app"),
        content = buildAppBuildGradleKts(
            packageName = template
                .packageName(),
            plugins = listOf(
                pConventionAndroidApplication,
                pConventionAndroidCompose,
                pConventionAndroidUnitTest,
                pConventionAndroidUiTest,
                pConventionSigning
            ),
            dependencies = listOf(
                lLifecycleRuntimeKtxToml,
                lActivityComposeToml,
                lComposeUiToml,
                lComposeUiGraphicsToml
            )
        ),
        force = true
    )
}

fun RecipeExecutor.setupAppMainActivity(
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
