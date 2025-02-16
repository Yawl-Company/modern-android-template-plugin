package com.yawl.android.template.modern.convention.gradleExtension

import com.yawl.android.template.core.convention.conventionPluginsRegistration
import com.yawl.android.template.core.libs.usage.*
import com.yawl.android.template.modern.IModernTemplate

internal fun gradleBuildGradle(
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
            compileOnly(gradleApi())
            // workaround for https://github.com/gradle/gradle/issues/15383
            api(files((libs as Any).javaClass.superclass.protectionDomain.codeSource.location))
        }
        """
        )

        appendLine()

        appendLine(
            conventionPluginsRegistration(
                listOfNotNull(
                    template.gradleSecrets().takeIf { it }?.let {
                        conventionGradleSecrets to "com.convention.GradleSecretsConventionPlugin"
                    },
                )
            )
        )
    }
}