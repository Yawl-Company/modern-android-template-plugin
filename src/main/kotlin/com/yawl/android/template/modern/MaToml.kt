package com.yawl.android.template.modern

import com.yawl.android.template.core.libs.ConventionPlugin
import com.yawl.android.template.core.libs.Library
import com.yawl.android.template.core.libs.Plugin
import com.yawl.android.template.core.libs.Version
import com.yawl.android.template.core.libs.LibsVersionsTomlName

// build core
val agp = Version(LibsVersionsTomlName("agp"), "8.7.3")
val java = Version(LibsVersionsTomlName("java"), "17")
val kotlin = Version(LibsVersionsTomlName("kotlin"), "2.1.0")
val kotlinLanguageVersion = Version(LibsVersionsTomlName("kotlinLanguageVersion"), "1.9")

// build configuration
val compileSdk = Version(LibsVersionsTomlName("compileSdk"), "35")
val targetSdk = Version(LibsVersionsTomlName("targetSdk"), "35")
val minSdk = Version(LibsVersionsTomlName("minSdk"), "24")
val buildTools = Version(LibsVersionsTomlName("buildTools"), "34.0.0")

// testing
val junit = Version(LibsVersionsTomlName("junit"), "4.13.2")
val junitVersion = Version(LibsVersionsTomlName("junitVersion"), "1.2.1")
val testRules = Version(LibsVersionsTomlName("testRules"), "1.6.1")
val testRunner = Version(LibsVersionsTomlName("testRunner"), "1.6.2")
val espressoCore = Version(LibsVersionsTomlName("espressoCore"), "3.6.1")

// compose
val activityCompose = Version(LibsVersionsTomlName("activityCompose"), "1.10.0")
val composeBom = Version(LibsVersionsTomlName("composeBom"), "2025.02.00")
val androidxComposeCompiler = Version(LibsVersionsTomlName("androidxComposeCompiler"), "1.5.12")
val androidxComposeNavigation = Version(LibsVersionsTomlName("androidxComposeNavigation"), "2.8.7")

// android-ktx
val coreKtx = Version(LibsVersionsTomlName("coreKtx"), "1.15.0")
val lifecycleRuntimeKtx = Version(LibsVersionsTomlName("lifecycleRuntimeKtx"), "2.8.7")

// network
val okhttpBom = Version(LibsVersionsTomlName("okhttpBom"), "4.12.0")
val retrofit = Version(LibsVersionsTomlName("retrofit"), "2.11.0")

// other
val kotlinCoroutines = Version(LibsVersionsTomlName("kotlinCoroutines"), "1.9.0")
val kotlinSerialization = Version(LibsVersionsTomlName("kotlinSerialization"), "1.7.3")
val kotlinxDatetime = Version(LibsVersionsTomlName("kotlinxDatetime"), "0.5.0")
val ksp = Version(LibsVersionsTomlName("ksp"), "2.1.0-1.0.29")
val room = Version(LibsVersionsTomlName("room"), "2.6.1")
val hilt = Version(LibsVersionsTomlName("hilt"), "2.53")
val hiltCompiler = Version(LibsVersionsTomlName("hilt-compiler"), "1.2.0")

// build
val secrets = Version(LibsVersionsTomlName("secrets"), "2.0.1")

fun IMaTemplate.modernAndroidVersions(): List<Version> {
    return listOf(
        agp,
        java,
        kotlin,
        kotlinLanguageVersion,
        compileSdk,
        targetSdk,
        minSdk,
        buildTools,
        junit,
        junitVersion,
        testRules,
        testRunner,
        espressoCore,
        activityCompose,
        composeBom,
        androidxComposeCompiler,
        androidxComposeNavigation,
        coreKtx,
        lifecycleRuntimeKtx,
        okhttpBom,
        retrofit,
        kotlinCoroutines,
        kotlinSerialization,
        kotlinxDatetime,
        ksp,
        room,
        hilt,
        hiltCompiler,
        secrets
    )
}

fun IMaTemplate.modernAndroidLibraries(): List<Library> {
    return listOf(
        // Build core
        Library(
            LibsVersionsTomlName("kotlin-gradlePlugin"),
            "org.jetbrains.kotlin",
            "kotlin-gradle-plugin",
            kotlin
        ),
        Library(
            LibsVersionsTomlName("android-gradlePlugin"),
            "com.android.tools.build",
            "gradle",
            agp
        ),
        Library(
            LibsVersionsTomlName("ksp-gradlePlugin"),
            "com.google.devtools.ksp",
            "com.google.devtools.ksp.gradle.plugin",
            ksp
        ),
        Library(
            LibsVersionsTomlName("room-gradlePlugin"),
            "androidx.room",
            "room-gradle-plugin",
            room
        ),
        // Android KTX
        Library(
            LibsVersionsTomlName("androidx-core-ktx"),
            "androidx.core",
            "core-ktx",
            coreKtx
        ),
        Library(
            LibsVersionsTomlName("androidx-lifecycle-runtime-ktx"),
            "androidx.lifecycle",
            "lifecycle-runtime-ktx",
            lifecycleRuntimeKtx
        ),
        Library(
            LibsVersionsTomlName("androidx-lifecycle-viewmodel-ktx"),
            "androidx.lifecycle",
            "lifecycle-viewmodel-ktx",
            lifecycleRuntimeKtx
        ),
        Library(
            LibsVersionsTomlName("androidx-hilt-compiler"),
            "androidx.hilt",
            "hilt-compiler",
            hiltCompiler
        ),
        Library(
            LibsVersionsTomlName("androidx-hilt-navigation-compose"),
            "androidx.hilt",
            "hilt-navigation-compose",
            hiltCompiler
        ),
        // Compose
        Library(
            LibsVersionsTomlName("androidx-compose-bom"),
            "androidx.compose",
            "compose-bom",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-compose-runtime"),
            "androidx.compose.runtime",
            "runtime",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-activity-compose"),
            "androidx.activity",
            "activity-compose",
            activityCompose
        ),
        Library(
            LibsVersionsTomlName("androidx-ui"),
            "androidx.compose.ui",
            "ui",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-ui-graphics"),
            "androidx.compose.ui",
            "ui-graphics",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-ui-tooling-base"),
            "androidx.compose.ui",
            "ui-tooling",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-ui-tooling-preview"),
            "androidx.compose.ui",
            "ui-tooling-preview",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-navigation-compose"),
            "androidx.navigation",
            "navigation-compose",
            androidxComposeNavigation
        ),
        // Compose Material
        Library(
            LibsVersionsTomlName("androidx-compose-material3"),
            "androidx.compose.material3",
            "material3",
            composeBom
        ),
        // Testing
        Library(
            LibsVersionsTomlName("junit"),
            "junit",
            "junit",
            junit
        ),
        Library(
            LibsVersionsTomlName("androidx-junit"),
            "androidx.test.ext",
            "junit",
            junitVersion
        ),
        Library(
            LibsVersionsTomlName("androidx-test-rules"),
            "androidx.test",
            "rules",
            testRules
        ),
        Library(
            LibsVersionsTomlName("androidx-test-runner"),
            "androidx.test",
            "runner",
            testRunner
        ),
        Library(
            LibsVersionsTomlName("androidx-espresso-core"),
            "androidx.test.espresso",
            "espresso-core",
            espressoCore
        ),
        Library(
            LibsVersionsTomlName("androidx-ui-test-junit4"),
            "androidx.compose.ui",
            "ui-test-junit4",
            composeBom
        ),
        Library(
            LibsVersionsTomlName("androidx-ui-test-manifest"),
            "androidx.compose.ui",
            "ui-test-manifest",
            composeBom
        ),
        // Networking
        Library(
            LibsVersionsTomlName("okhttp-bom"),
            "com.squareup.okhttp3",
            "okhttp-bom",
            okhttpBom
        ),
        Library(
            LibsVersionsTomlName("okhttp-core"),
            "com.squareup.okhttp3",
            "okhttp",
            okhttpBom
        ),
        Library(
            LibsVersionsTomlName("okhttp-logging"),
            "com.squareup.okhttp3",
            "logging-interceptor",
            okhttpBom
        ),
        Library(
            LibsVersionsTomlName("retrofit-core"),
            "com.squareup.retrofit2",
            "retrofit",
            retrofit
        ),
        Library(
            LibsVersionsTomlName("retrofit-converter-json"),
            "com.squareup.retrofit2",
            "converter-kotlinx-serialization",
            retrofit
        ),
        // Caching
        Library(
            LibsVersionsTomlName("room-runtime"),
            "androidx.room",
            "room-runtime",
            room
        ),
        Library(
            LibsVersionsTomlName("room-ktx"),
            "androidx.room",
            "room-ktx",
            room
        ),
        Library(
            LibsVersionsTomlName("room-compiler"),
            "androidx.room",
            "room-compiler",
            room
        ),
        // Dependency Injection
        Library(
            LibsVersionsTomlName("hilt-compiler"),
            "com.google.dagger",
            "hilt-compiler",
            hilt
        ),
        Library(
            LibsVersionsTomlName("hilt-android"),
            "com.google.dagger",
            "hilt-android",
            hilt
        ),
        Library(
            LibsVersionsTomlName("javax-inject"),
            "javax.inject",
            "javax.inject",
            Version(LibsVersionsTomlName("javax-inject"), "1")
        ),
        // Other
        Library(
            LibsVersionsTomlName("kotlin-coroutines-core"),
            "org.jetbrains.kotlinx",
            "kotlinx-coroutines-core",
            kotlinCoroutines
        ),
        Library(
            LibsVersionsTomlName("kotlin-coroutines-android"),
            "org.jetbrains.kotlinx",
            "kotlinx-coroutines-android",
            kotlinCoroutines
        ),
        Library(
            LibsVersionsTomlName("kotlin-serialization-json"),
            "org.jetbrains.kotlinx",
            "kotlinx-serialization-json",
            kotlinSerialization
        ),
        Library(
            LibsVersionsTomlName("kotlinx-datetime"),
            "org.jetbrains.kotlinx",
            "kotlinx-datetime",
            kotlinxDatetime
        )
    )
}

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