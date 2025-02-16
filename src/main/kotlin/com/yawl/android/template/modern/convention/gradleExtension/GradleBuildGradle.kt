package com.yawl.android.template.modern.convention.gradleExtension

import com.yawl.android.template.modern.IModernTemplate

internal fun gradleBuildGradle(
    template: IModernTemplate
): String {
    return """
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
        ${if (template.gradleSecrets()) "\n" +
        """
        gradlePlugin {
            plugins {
                create("gradle-secrets") {
                    id = "convention.gradle-secrets"
                    implementationClass = "com.convention.GradleSecretsConventionPlugin"
                }
            }
        }
        """
        else ""}
    """.trimIndent()
}