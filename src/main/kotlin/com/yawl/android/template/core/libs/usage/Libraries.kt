package com.yawl.android.template.core.libs.usage

import com.yawl.android.template.core.libs.part.Library

// gradle
val kotlinGradlePlugin = Library("org.jetbrains.kotlin", "kotlin-gradle-plugin")
val androidGradlePlugin = Library("com.android.tools.build", "gradle")
val kspGradlePlugin = Library("com.google.devtools.ksp", "com.google.devtools.ksp.gradle.plugin")
val roomGradlePlugin = Library("androidx.room", "room-gradle-plugin")

// android-ktx
val androidxCoreKtx = Library("androidx.core", "core-ktx")
val androidxLifecycleRuntimeKtx = Library("androidx.lifecycle", "lifecycle-runtime-ktx")
val androidxLifecycleViewModelKtx = Library("androidx.lifecycle", "lifecycle-viewmodel-ktx")
val androidxHiltCompiler = Library("androidx.hilt", "hilt-compiler")
val androidxHiltNavigationCompose = Library("androidx.hilt", "hilt-navigation-compose")

// compose
val androidxComposeBom = Library("androidx.compose", "compose-bom")
val androidxComposeRuntime = Library("androidx.compose.runtime", "runtime")
val androidxActivityCompose = Library("androidx.activity", "activity-compose")
val androidxComposeUi = Library("androidx.compose.ui", "ui")
val androidxComposeUiGraphics = Library("androidx.compose.ui", "ui-graphics")
val androidxComposeUiTooling = Library("androidx.compose.ui", "ui-tooling")
val androidxComposeUiToolingPreview = Library("androidx.compose.ui", "ui-tooling-preview")
val androidxComposeNavigation = Library("androidx.navigation", "navigation-compose")

// compose material
val androidxComposeMaterial3 = Library("androidx.compose.material3", "material3")

// testing
val junit = Library("junit", "junit")
val androidxJUnit = Library("androidx.test.ext", "junit")
val androidxTestRules = Library("androidx.test", "rules")
val androidxTestRunner = Library("androidx.test", "runner")
val androidxEspressoCore = Library("androidx.test.espresso", "espresso-core")
val androidxUiTestJunit4 = Library("androidx.compose.ui", "ui-test-junit4")
val androidxUiTestManifest = Library("androidx.compose.ui", "ui-test-manifest")

// network
val okhttpBom = Library("com.squareup.okhttp3", "okhttp-bom")
val okhttp = Library("com.squareup.okhttp3", "okhttp")
val okhttpLogging = Library("com.squareup.okhttp3", "logging-interceptor")
val retrofit = Library("com.squareup.retrofit2", "retrofit")
val retrofitConverterJson = Library("com.squareup.retrofit2", "converter-kotlinx-serialization")

// cache
val roomRuntime = Library("androidx.room", "room-runtime")
val roomKtx = Library("androidx.room", "room-ktx")
val roomCompiler = Library("androidx.room", "room-compiler")

// di
val hiltCompiler = Library("com.google.dagger", "hilt-compiler")
val hiltAndroid = Library("com.google.dagger", "hilt-android")
val javaxInject = Library("javax.inject", "javax.inject")

// other
val kotlinCoroutinesCore = Library("org.jetbrains.kotlinx", "kotlinx-coroutines-core")
val kotlinCoroutinesAndroid = Library("org.jetbrains.kotlinx", "kotlinx-coroutines-android")
val kotlinSerializationJson = Library("org.jetbrains.kotlinx", "kotlinx-serialization-json")
val kotlinxDatetime = Library("org.jetbrains.kotlinx", "kotlinx-datetime")
