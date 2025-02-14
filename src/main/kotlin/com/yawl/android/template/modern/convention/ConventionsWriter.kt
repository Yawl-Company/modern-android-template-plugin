package com.yawl.android.template.modern.convention

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.write.buildGradleKtsWriter
import com.yawl.android.template.core.write.settingsGradleKtsWriter
import com.yawl.android.template.modern.convention.android.androidConventionWriter
import com.yawl.android.template.modern.convention.gradleExtension.gradleConventionWriter
import com.yawl.android.template.modern.convention.kotlin.kotlinConventionWriter
import com.yawl.android.template.modern.convention.signing.signingConventionWriter
import com.yawl.android.template.modern.convention.test.testConventionWriter

fun RecipeExecutor.conventionsWriter(
    template: AndroidTemplate
) {
    val moduleName = "build-logic"
    val moduleDirectory = template
        .projectRoot()
        .resolve(moduleName)
    settingsGradleKtsWriter(
        directory = moduleDirectory,
        content = settingsGradle(),
        force = false
    )
    buildGradleKtsWriter(
        directory = moduleDirectory,
        content = buildGradle(),
        force = false
    )
    androidConventionWriter(
        parentDirectory = moduleDirectory
    )
    gradleConventionWriter(
        parentDirectory = moduleDirectory
    )
    kotlinConventionWriter(
        parentDirectory = moduleDirectory
    )
    signingConventionWriter(
        parentDirectory = moduleDirectory
    )
    testConventionWriter(
        parentDirectory = moduleDirectory
    )
}

fun settingsGradle(): String {
    return """
        @file:Suppress("UnstableApiUsage")

        rootProject.name = "build-logic"

        enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                google()
                mavenCentral()
            }
            versionCatalogs {
                create("libs") {
                    from(files("../gradle/libs.versions.toml"))
                }
            }
        }

        include("gradle-extension")

        include("kotlin")
        include("android")
        include("test")
        include("signing")
    """.trimIndent()
}

fun buildGradle(): String {
    return """
        plugins {
            base
        }

        buildscript {
            dependencies {
                classpath(libs.kotlin.gradlePlugin)
            }
        }
    """.trimIndent()
}