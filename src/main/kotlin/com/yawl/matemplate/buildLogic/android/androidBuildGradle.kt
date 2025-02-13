package com.yawl.matemplate.buildLogic.android

internal fun androidBuildGradle(): String {
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
            implementation(libs.room.gradlePlugin)
            // workaround for https://github.com/gradle/gradle/issues/15383
            implementation(files((libs as Any).javaClass.superclass.protectionDomain.codeSource.location))
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
                    implementationClass = "com.convention.AndroidComposeConventionPlugin"
                }

                create("hilt") {
                    id = "convention.hilt"
                    implementationClass = "com.convention.HiltConventionPlugin"
                }

                create("room") {
                    id = "convention.room"
                    implementationClass = "com.convention.AndroidRoomConventionPlugin"
                }
            }
        }
    """.trimIndent()
}
