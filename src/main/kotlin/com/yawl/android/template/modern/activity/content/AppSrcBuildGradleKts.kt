package com.yawl.android.template.modern.activity.content

fun appSrcBuildGradleKts(
    packageName: String,
): String {
    return """
        plugins {
            alias(libs.plugins.convention.android.application)
            alias(libs.plugins.convention.android.compose)
            alias(libs.plugins.convention.android.unit.test)
            alias(libs.plugins.convention.android.ui.test)
            alias(libs.plugins.convention.signing)
        }

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

        dependencies {
            implementation(libs.androidx.lifecycle.runtime.ktx)
            implementation(libs.androidx.activity.compose)
            implementation(libs.androidx.ui)
            implementation(libs.androidx.ui.graphics)
        }
    """.trimIndent()
}