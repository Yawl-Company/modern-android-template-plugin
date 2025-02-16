package com.yawl.android.template.modern.convention.kotlin

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.conventionKotlinJvm
import com.yawl.android.template.core.libs.usage.conventionKotlinJvmAndroid
import com.yawl.android.template.core.libs.usage.conventionKotlinSerialization
import com.yawl.android.template.core.libs.usage.conventionKsp

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

        appendLine()

        appendLine(
            conventionPluginsRegistration(
                listOfNotNull(
                    conventionKotlinJvm to "com.convention.jvm.KotlinJvmPlugin",
                    conventionKotlinJvmAndroid to "com.convention.jvm.KotlinJvmAndroidPlugin",
                    conventionKsp to "com.convention.KspConventionPlugin",
                    conventionKotlinSerialization to "com.convention.KotlinSerializationPlugin",
                )
            )
        )
    }
}