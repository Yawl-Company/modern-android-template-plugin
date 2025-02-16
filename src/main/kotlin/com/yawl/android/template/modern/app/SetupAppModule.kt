package com.yawl.android.template.modern.app

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.androidTVActivity.res.values.themesXml
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
    setupAppManifest(
        template = template,
        activityName = activityName
    )
    setupAppTheme(
        template = template
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

fun RecipeExecutor.setupAppManifest(
    template: AndroidTemplate,
    activityName: String,
) {
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
}

fun RecipeExecutor.setupAppTheme(
    template: AndroidTemplate
) {
    mergeXml(
        source = themesXml(
            themeName = template
                .template()
                .themesData
                .main
                .name
        ),
        to = template
            .resourcesRoot()
            .resolve("values/themes.xml")
    )
}
