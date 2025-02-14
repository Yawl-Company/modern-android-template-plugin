package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.ConventionPlugin
import com.yawl.android.template.core.libs.LibsVersionsTomlName
import com.yawl.android.template.core.libs.Plugin
import com.yawl.android.template.modern.*

fun IMaTemplate.modernAndroidPlugins(): List<Plugin> {
    return listOf(
        Plugin(
            LibsVersionsTomlName("android-application"),
            "com.android.application",
            agp
        ),
        Plugin(
            LibsVersionsTomlName("android-library"),
            "com.android.library",
            agp
        ),
        Plugin(
            LibsVersionsTomlName("kotlin-compose"),
            "org.jetbrains.kotlin.plugin.compose",
            kotlin
        ),
        Plugin(
            LibsVersionsTomlName("kotlin-serialization"),
            "org.jetbrains.kotlin.plugin.serialization",
            kotlin
        ),
        Plugin(
            LibsVersionsTomlName("kotlin-parcelable"),
            "org.jetbrains.kotlin.plugin.parcelize",
            kotlin
        ),
        Plugin(
            LibsVersionsTomlName("ksp"),
            "com.google.devtools.ksp",
            ksp
        ),
        Plugin(
            LibsVersionsTomlName("room"),
            "androidx.room",
            room
        ),
        Plugin(
            LibsVersionsTomlName("hilt"),
            "com.google.dagger.hilt.android",
            hilt
        ),
        Plugin(
            LibsVersionsTomlName("gradle-secrets"),
            "com.google.android.libraries.mapsplatform.secrets-gradle-plugin",
            secrets
        )
    )
}

fun IMaTemplate.modernAndroidConventionPlugins(): List<ConventionPlugin> {
    return listOf(
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-application"),
            "convention.kotlin-android-app"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-library"),
            "convention.kotlin-android-library"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-compose"),
            "convention.android-compose"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-hilt"),
            "convention.hilt"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-unit-test"),
            "convention.unit"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-android-ui-test"),
            "convention.ui"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-kotlin-serialization"),
            "convention.serialization"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-kotlin-jvm"),
            "convention.kotlin-jvm"
        ),
        ConventionPlugin(
            LibsVersionsTomlName("convention-signing"),
            "convention.signing"
        )
    )
}