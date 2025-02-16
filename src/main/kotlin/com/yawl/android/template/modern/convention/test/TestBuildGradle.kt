package com.yawl.android.template.modern.convention.test

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