package com.yawl.android.template.modern.convention.android

import com.yawl.android.template.modern.IModernTemplate

internal fun androidBuildGradle(template: IModernTemplate): String {
    return """
        plugins {
            kotlin("jvm")
            `java-gradle-plugin`
        }

        group = "com.convention.android.build-logic"

        dependencies {
            implementation(projects.kotlin)
            implementation(projects.gradleExtension)
            implementation(libs.android.gradlePlugin)
            implementation(libs.ksp.gradlePlugin)
            ${
        if (template.room()) """
                    implementation(libs.room.gradlePlugin)
                """ else ""
    }
        }

        gradlePlugin {
            plugins {
                create("android-lib") {
                    id = "convention.kotlin-android-library"
                    implementationClass = "com.convention.AndroidLibraryConventionPlugin"
                }

                create("android-app") {
                    id = "convention.kotlin-android-app"
                    implementationClass = "com.convention.AndroidApplicationConventionPlugin"
                }

                create("android-compose") {
                    id = "convention.android-compose"
                    implementationClass = "com.convention.compose.AndroidComposeConventionPlugin"
                }

                ${
        if (template.hilt()) """
                    create("hilt") {
                        id = "convention.hilt"
                        implementationClass = "com.convention.HiltConventionPlugin"
                    }
                """ else ""
    }

                ${
        if (template.room()) """
                    create("room") {
                        id = "convention.room"
                        implementationClass = "com.convention.AndroidRoomConventionPlugin"
                    }
                """ else ""
    }
            }
        }
    """.trimIndent()
}