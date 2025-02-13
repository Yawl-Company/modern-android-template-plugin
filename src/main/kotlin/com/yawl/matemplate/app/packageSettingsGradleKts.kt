package com.yawl.matemplate.app

fun packageSettingsGradleKts(
    projectName: String
): String {
    return """
        @file:Suppress("UnstableApiUsage")

        rootProject.name = "$projectName"

        enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

        pluginManagement {
            repositories {
                google {
                    content {
                        includeGroupByRegex("com\\.android.*")
                        includeGroupByRegex("com\\.google.*")
                        includeGroupByRegex("androidx.*")
                    }
                }
                mavenCentral()
                gradlePluginPortal()
            }
        }

        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                google()
                mavenCentral()
            }
        }

        includeBuild("build-logic")

        include(":app")

    """.trimIndent()
}