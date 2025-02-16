package com.yawl.android.template.modern.convention.kotlin

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.*

internal fun kotlinBuildGradle(): String {
    return buildString {
        appendLine(
        """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(projects.gradleExtension)
            implementation(libs.kotlin.gradlePlugin)
            implementation(libs.ksp.gradlePlugin)
        }
        """
        )

        val plugins = listOfNotNull(
            conventionKotlinJvm to "com.convention.jvm.KotlinJvmPlugin",
            conventionKotlinJvmAndroid to "com.convention.jvm.KotlinJvmAndroidPlugin",
            conventionKsp to "com.convention.KspConventionPlugin",
            conventionKotlinSerialization to "com.convention.KotlinSerializationPlugin",
        )

        plugins.takeIf { it.isNotEmpty() }?.let {
            appendLine()
            appendLine(conventionPluginsRegistration(plugins))
        }
    }
}