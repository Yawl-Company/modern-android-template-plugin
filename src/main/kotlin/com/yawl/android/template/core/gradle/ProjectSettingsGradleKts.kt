package com.yawl.android.template.core.gradle

fun buildProjectSettingsGradleKts(
    suppressUnstableApiUsage: Boolean,
    enableTypesafeProjectAccessors: Boolean,
    projectName: String,
    includeBuild: Boolean
): String {
    return buildString {
        if (suppressUnstableApiUsage) {
            appendLine("@file:Suppress(\"UnstableApiUsage\")\n")
        }

        appendLine("rootProject.name = \"$projectName\"\n")

        if (enableTypesafeProjectAccessors) {
            appendLine("enableFeaturePreview(\"TYPESAFE_PROJECT_ACCESSORS\")\n")
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
            appendLine("includeBuild(\"build-logic\")\n")
        }

        appendLine("include(\":app\")\n")
    }
}
