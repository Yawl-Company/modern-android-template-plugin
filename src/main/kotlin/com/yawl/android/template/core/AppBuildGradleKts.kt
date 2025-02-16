package com.yawl.android.template.core

import com.yawl.android.template.core.extension.librariesDependencies
import com.yawl.android.template.core.extension.pluginsSection
import com.yawl.android.template.core.libs.PluginBuildGradle
import com.yawl.android.template.core.libs.LibraryBuildGradle

fun buildAppBuildGradleKts(
    packageName: String,
    plugins: List<PluginBuildGradle>,
    dependencies: List<LibraryBuildGradle>
): String {
    return buildString {
        appendLine(
            plugins.pluginsSection(
                apply = true
            )
        )
        appendLine()

        appendLine(
            """
            android {
                namespace = "$packageName"

                defaultConfig {
                    applicationId = "$packageName"
                    versionCode = 1
                    versionName = "1.0"
                    vectorDrawables {
                        useSupportLibrary = true
                    }
                }

                buildTypes {
                    debug {
                        isMinifyEnabled = false
                        applicationIdSuffix = ".debug"
                    }
                    release {
                        isMinifyEnabled = true
                        isShrinkResources = true
                        proguardFiles(
                            getDefaultProguardFile("proguard-android-optimize.txt"),
                            "proguard-rules.pro"
                        )
                    }
                }

                packaging {
                    resources {
                        excludes += "/META-INF/{AL2.0,LGPL2.1}"
                    }
                }
            }
            """.trimIndent()
        )
        appendLine()

        appendLine(
            dependencies.librariesDependencies()
        )
        appendLine()
    }
}
