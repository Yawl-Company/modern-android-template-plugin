package com.yawl.android.template.modern.convention.signing

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.*

internal fun signingBuildGradle(): String {
    return buildString {
        appendLine(
        """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(libs.android.gradlePlugin)
        }
        """
        )

        val plugins = listOfNotNull(
            conventionSigning to "com.convention.AndroidApplicationSignConventionPlugin",
        )

        plugins.takeIf { it.isNotEmpty() }?.let {
            appendLine()
            appendLine(conventionPluginsRegistration(plugins))
        }
    }
}