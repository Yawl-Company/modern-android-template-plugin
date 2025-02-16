package com.yawl.android.template.core.libs.inuse

import com.yawl.android.template.core.libs.part.Plugin

val androidApplicationPlugin = Plugin("com.android.application")
val androidLibraryPlugin = Plugin("com.android.library")
val kotlinComposePlugin = Plugin("org.jetbrains.kotlin.plugin.compose")
val kotlinSerializationPlugin = Plugin("org.jetbrains.kotlin.plugin.serialization")
val kotlinParcelablePlugin = Plugin("org.jetbrains.kotlin.plugin.parcelize")
val kspPlugin = Plugin("com.google.devtools.ksp")
val roomPlugin = Plugin("androidx.room")
val hiltPlugin = Plugin("com.google.dagger.hilt.android")
val gradleSecretsPlugin = Plugin("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")

val conventionAndroidApplication = Plugin("convention.kotlin-android-app")
val conventionAndroidLibrary = Plugin("convention.kotlin-android-library")
val conventionAndroidCompose = Plugin("convention.android-compose")
val conventionAndroidUnitTest = Plugin("convention.unit")
val conventionAndroidUiTest = Plugin("convention.ui")
val conventionAndroidHilt = Plugin("convention.hilt")
val conventionKotlinSerialization = Plugin("convention.serialization")
val conventionKotlinJvm = Plugin("convention.kotlin-jvm")
val conventionSigning = Plugin("convention.signing")
