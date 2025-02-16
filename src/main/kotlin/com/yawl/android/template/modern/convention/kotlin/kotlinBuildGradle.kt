package com.yawl.android.template.modern.convention.kotlin

internal fun kotlinBuildGradle(): String {
    return """
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

        gradlePlugin {
            plugins {
                create("kotlin-jvm") {
                    id = "convention.kotlin-jvm"
                    implementationClass = "com.convention.jvm.KotlinJvmPlugin"
                }

                create("kotlin-jvm-android") {
                    id = "convention.kotlin-jvm-android"
                    implementationClass = "com.convention.jvm.KotlinJvmAndroidPlugin"
                }

                create("ksp") {
                    id = "convention.ksp"
                    implementationClass = "com.convention.KspConventionPlugin"
                }

                create("serialization") {
                    id = "convention.serialization"
                    implementationClass = "com.convention.KotlinSerializationConventionPlugin"
                }
            }
        }
    """.trimIndent()
}