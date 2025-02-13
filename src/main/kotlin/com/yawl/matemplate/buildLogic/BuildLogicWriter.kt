package com.yawl.matemplate.buildLogic

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.matemplate.buildLogic.android.androidConventionWriter
import com.yawl.matemplate.buildLogic.gradleExtension.gradleConventionWriter
import com.yawl.matemplate.buildLogic.kotlin.kotlinConventionWriter
import com.yawl.matemplate.buildLogic.signing.signingConventionWriter
import com.yawl.matemplate.buildLogic.test.testConventionWriter

fun RecipeExecutor.buildLogicWriter(
    moduleData: ModuleTemplateData
) {
    val projectData = moduleData.projectTemplateData
    val rootDir = projectData.rootDir
    val moduleName = "build-logic"
    val moduleDirectory = rootDir.resolve(moduleName)
    save(
        source = settingsGradle(),
        to = moduleDirectory
            .resolve("settings.gradle.kts"),
    )
    save(
        source = buildGradle(),
        to = moduleDirectory
            .resolve("build.gradle.kts"),
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