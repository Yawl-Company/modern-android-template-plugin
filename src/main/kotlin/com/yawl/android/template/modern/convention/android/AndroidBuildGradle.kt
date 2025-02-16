package com.yawl.android.template.modern.convention.android

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.*
import com.yawl.android.template.modern.IModernTemplate

internal fun androidBuildGradle(
    template: IModernTemplate
): String {
    return buildString {
        appendLine(
            """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(projects.kotlin)
            implementation(projects.gradleExtension)
            implementation(libs.android.gradlePlugin)
            implementation(libs.ksp.gradlePlugin)${
                if (template.room()) "\n" +
                        "implementation(libs.room.gradlePlugin)"
                else ""
            }
        }
        """
        )

        val plugins = listOfNotNull(
            conventionAndroidApplication to "com.convention.AndroidApplicationConventionPlugin",
            conventionAndroidLibrary to "com.convention.AndroidLibraryConventionPlugin",
            conventionAndroidCompose to "com.convention.compose.AndroidComposeConventionPlugin",
            template.hilt().takeIf { it }?.let {
                conventionAndroidHilt to "com.convention.compose.HiltConventionPlugin"
            },
            template.room().takeIf { it }?.let {
                conventionRoom to "com.convention.compose.AndroidRoomConventionPlugin"
            },
        )

        plugins.takeIf { it.isNotEmpty() }?.let {
            appendLine()
            appendLine(conventionPluginsRegistration(plugins))
        }
    }
}
