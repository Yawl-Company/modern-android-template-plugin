package com.yawl.android.template.modern.libs

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.rewriteFile
import com.yawl.android.template.modern.MaTemplate

fun RecipeExecutor.libsVersionsTomlWriter(
    template: MaTemplate
) {
    val moduleName = "gradle"
    val gradleDir = template
        .root()
        .resolve(moduleName)
    rewriteFile(
        source = gradleDir
            .resolve("libs.versions.toml"),
        content = libsToml()
    )
}

fun libsToml(): String {
    return """
        [versions]
        # build core
        agp = "8.7.3"
        java = "17"
        kotlin = "2.1.0"
        kotlinLanguageVersion = "1.9"

        # build configuration
        compileSdk = "35"
        targetSdk = "35"
        minSdk = "24"
        buildTools = "34.0.0"

        # testing
        junit = "4.13.2"
        junitVersion = "1.2.1"
        testRules = "1.6.1"
        testRunner = "1.6.2"
        espressoCore = "3.6.1"

        # compose
        activityCompose = "1.10.0"
        composeBom = "2025.02.00"
        androidxComposeCompiler = "1.5.12"
        androidxComposeNavigation = "2.8.7"

        # android-ktx
        coreKtx = "1.15.0"
        lifecycleRuntimeKtx = "2.8.7"

        # network
        okhttpBom = "4.12.0"
        retrofit = "2.11.0"

        # other
        kotlinCoroutines = "1.9.0"
        kotlinSerialization = "1.7.3"
        kotlinxDatetime = "0.5.0"
        ksp = "2.1.0-1.0.29"
        room = "2.6.1"
        hilt = "2.53"
        hilt-compiler = "1.2.0"

        # build
        secrets = "2.0.1"

        [libraries]
        kotlin-gradlePlugin = { group = "org.jetbrains.kotlin", name = "kotlin-gradle-plugin", version.ref = "kotlin" }
        android-gradlePlugin = { group = "com.android.tools.build", name = "gradle", version.ref = "agp" }
        ksp-gradlePlugin = { group = "com.google.devtools.ksp", name = "com.google.devtools.ksp.gradle.plugin", version.ref = "ksp" }
        room-gradlePlugin = { group = "androidx.room", name = "room-gradle-plugin", version.ref = "room" }

        # android-ktx
        androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
        androidx-lifecycle-runtime-ktx = { group = "androidx.lifecycle", name = "lifecycle-runtime-ktx", version.ref = "lifecycleRuntimeKtx" }
        androidx-lifecycle-viewmodel-ktx = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-ktx", version.ref = "lifecycleRuntimeKtx" }
        androidx-hilt-compiler = { group = "androidx.hilt", name = "hilt-compiler", version.ref = "hilt-compiler" }
        androidx-hilt-navigation-compose = { group = "androidx.hilt", name = "hilt-navigation-compose", version.ref = "hilt-compiler" }

        # compose
        androidx-compose-bom = { group = "androidx.compose", name = "compose-bom", version.ref = "composeBom" }
        androidx-compose-runtime = { group = "androidx.compose.runtime", name = "runtime" }
        androidx-activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activityCompose" }
        androidx-ui = { group = "androidx.compose.ui", name = "ui" }
        androidx-ui-graphics = { group = "androidx.compose.ui", name = "ui-graphics" }
        androidx-ui-tooling-base = { group = "androidx.compose.ui", name = "ui-tooling" }
        androidx-ui-tooling-preview = { group = "androidx.compose.ui", name = "ui-tooling-preview" }
        androidx-navigation-compose = { group = "androidx.navigation", name = "navigation-compose", version.ref = "androidxComposeNavigation" }

        # compose material
        androidx-compose-material3 = { group = "androidx.compose.material3", name = "material3" }

        # testing
        junit = { group = "junit", name = "junit", version.ref = "junit" }
        androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
        androidx-test-rules = { group = "androidx.test", name = "rules", version.ref = "testRules" }
        androidx-test-runner = { group = "androidx.test", name = "runner", version.ref = "testRunner" }
        androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
        androidx-ui-test-junit4 = { group = "androidx.compose.ui", name = "ui-test-junit4" }
        androidx-ui-test-manifest = { group = "androidx.compose.ui", name = "ui-test-manifest" }

        # network
        okhttp-bom = { group = "com.squareup.okhttp3", name = "okhttp-bom", version.ref = "okhttpBom" }
        okhttp-core = { group = "com.squareup.okhttp3", name = "okhttp" }
        okhttp-logging = { group = "com.squareup.okhttp3", name = "logging-interceptor" }
        retrofit-core = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }
        retrofit-converter-json = { group = "com.squareup.retrofit2", name = "converter-kotlinx-serialization", version.ref = "retrofit" }

        # cache
        room-runtime = { group = "androidx.room", name = "room-runtime", version.ref = "room" }
        room-ktx = { group = "androidx.room", name = "room-ktx", version.ref = "room" }
        room-compiler = { group = "androidx.room", name = "room-compiler", version.ref = "room" }

        # di
        hilt-compiler = { group = "com.google.dagger", name = "hilt-compiler", version.ref = "hilt" }
        hilt-android = { group = "com.google.dagger", name = "hilt-android", version.ref = "hilt" }
        javax-inject = { group = "javax.inject", name = "javax.inject", version = "1" }

        # other
        kotlin-coroutines-core = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-core", version.ref = "kotlinCoroutines" }
        kotlin-coroutines-android = { group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-android", version.ref = "kotlinCoroutines" }
        kotlin-serialization-json = { group = "org.jetbrains.kotlinx", name = "kotlinx-serialization-json", version.ref = "kotlinSerialization" }
        kotlinx-datetime = { group = "org.jetbrains.kotlinx", name = "kotlinx-datetime", version.ref = "kotlinxDatetime" }

        [plugins]
        android-application = { id = "com.android.application", version.ref = "agp" }
        android-library = { id = "com.android.library", version.ref = "agp" }
        kotlin-compose = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }
        kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }
        kotlin-parcelable = { id = "org.jetbrains.kotlin.plugin.parcelize", version.ref = "kotlin" }
        ksp = { id = "com.google.devtools.ksp", version.ref = "ksp" }
        room = { id = "androidx.room", version.ref = "room" }
        hilt = { id = "com.google.dagger.hilt.android", version.ref = "hilt" }
        gradle-secrets = { id = "com.google.android.libraries.mapsplatform.secrets-gradle-plugin", version.ref = "secrets" }

        convention-android-application = { id = "convention.kotlin-android-app", version = "unspecified" }
        convention-android-library = { id = "convention.kotlin-android-library", version = "unspecified" }
        convention-android-compose = { id = "convention.android-compose", version = "unspecified" }
        convention-android-unit-test = { id = "convention.unit", version = "unspecified" }
        convention-android-ui-test = { id = "convention.ui", version = "unspecified" }
        convention-android-hilt = { id = "convention.hilt", version = "unspecified" }
        convention-kotlin-serialization = { id = "convention.serialization", version = "unspecified" }
        convention-kotlin-jvm = { id = "convention.kotlin-jvm", version = "unspecified" }
        convention-signing = { id = "convention.signing", version = "unspecified" }
    """.trimIndent()
}