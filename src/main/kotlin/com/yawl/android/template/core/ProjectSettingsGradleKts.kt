package com.yawl.android.template.core

fun buildProjectSettingsGradleKts(
    suppressUnstableApiUsage: Boolean,
    enableTypesafeProjectAccessors: Boolean,
    projectName: String,
    includeBuild: Boolean
): String {
    return buildString {
        if (suppressUnstableApiUsage) {
            appendLine("@file:Suppress(\"UnstableApiUsage\")")
            appendLine()
        }
        appendLine("rootProject.name = \"$projectName\"")
        appendLine()
        if (enableTypesafeProjectAccessors) {
            appendLine("enableFeaturePreview(\"TYPESAFE_PROJECT_ACCESSORS\")")
            appendLine()
        }
        appendLine(
            """
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
            """.trimIndent()
        )
        appendLine()
        appendLine(
            """
            dependencyResolutionManagement {
                repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                repositories {
                    google()
                    mavenCentral()
                }
            }
            """.trimIndent()
        )
        appendLine()
        if (includeBuild) {
            appendLine("includeBuild(\"build-logic\")")
            appendLine()
        }
        appendLine("include(\":app\")")
        appendLine()
    }
}
