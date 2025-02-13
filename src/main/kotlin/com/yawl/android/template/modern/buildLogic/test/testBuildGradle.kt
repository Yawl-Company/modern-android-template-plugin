package com.yawl.android.template.modern.buildLogic.test

internal fun testBuildGradle(): String {
    return """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(projects.gradleExtension)
            implementation(libs.android.gradlePlugin)
            // workaround for https://github.com/gradle/gradle/issues/15383
            implementation(files((libs as Any).javaClass.superclass.protectionDomain.codeSource.location))
        }

        gradlePlugin {
            plugins {
                create("unit") {
                    id = "convention.unit"
                    implementationClass = "com.convention.AndroidUnitTestConventionPlugin"
                }
                create("ui") {
                    id = "convention.ui"
                    implementationClass = "com.convention.AndroidUiTestConventionPlugin"
                }
            }
        }
    """.trimIndent()
}