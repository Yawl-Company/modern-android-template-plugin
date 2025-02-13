package com.yawl.android.template.buildLogic.signing

internal fun signingBuildGradle(): String {
    return """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(libs.android.gradlePlugin)
        }

        gradlePlugin {
            plugins {
                create("signing") {
                    id = "convention.signing"
                    implementationClass = "com.convention.AndroidApplicationSignConventionPlugin"
                }
            }
        }
    """.trimIndent()
}