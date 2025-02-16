package com.yawl.android.template.modern.convention.test

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.conventionAndroidUiTest
import com.yawl.android.template.core.libs.usage.conventionAndroidUnitTest

internal fun testBuildGradle(): String {
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
            implementation(libs.android.gradlePlugin)
        }
        """
        )

        val plugins = listOfNotNull(
            conventionAndroidUnitTest to "com.convention.AndroidUnitTestConventionPlugin",
            conventionAndroidUiTest to "com.convention.AndroidUiTestConventionPlugin",
        )

        plugins.takeIf { it.isNotEmpty() }?.let {
            appendLine()
            appendLine(conventionPluginsRegistration(plugins))
        }
    }
}