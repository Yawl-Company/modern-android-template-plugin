package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.LibsVersionsTomlName
import com.yawl.android.template.core.libs.Version
import com.yawl.android.template.modern.IMaTemplate

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
val javax = Version(LibsVersionsTomlName("javax-inject"), "1")

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
        javax,
        secrets
    )
}
