package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.app.buildAppBuildGradleKts
import com.yawl.android.template.core.gradle.buildGradleKts
import com.yawl.android.template.modern.app.content.mainActivity
import com.yawl.android.template.modern.dependencies.toml.*
import com.android.tools.idea.wizard.template.impl.activities.common.generateManifest

fun RecipeExecutor.setupAppModule(
    template: AndroidTemplate
) {
    val activityName = "MainActivity"
    val moduleData = template.template()
    generateManifest(
        moduleData = moduleData,
        activityClass = activityName,
        activityThemeName = moduleData
            .themesData
            .main
            .name,
        packageName = template.packageName(),
        isLauncher = true,
        hasNoActionBar = true,
        generateActivityTitle = true
    )
    setupLauncherActivity(
        template = template,
        activityName = activityName
    )
    setupAppBuildGradle(
        template = template
    )
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

fun RecipeExecutor.setupLauncherActivity(
    template: AndroidTemplate,
    activityName: String
) {
    val activityPath = template
        .sourcesRoot()
        .resolve("$activityName.kt")
    save(
        source = mainActivity(
            packageName = template
                .packageName()
        ),
        to = activityPath
    )
    open(activityPath)
}
