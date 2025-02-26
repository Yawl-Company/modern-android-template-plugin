package com.yawl.android.template.modern.dependencies.toml

import com.yawl.android.template.core.libs.LibraryToml
import com.yawl.android.template.core.libs.TomlName
import com.yawl.android.template.core.libs.usage.*

val lKotlinGradlePluginToml = LibraryToml(
    TomlName("kotlin-gradlePlugin"),
    kotlinGradlePlugin,
    vKotlin
)

val lAndroidGradlePluginToml = LibraryToml(
    TomlName("android-gradlePlugin"),
    androidGradlePlugin,
    vAgp
)

val lKspGradlePluginToml = LibraryToml(
    TomlName("ksp-gradlePlugin"),
    kspGradlePlugin,
    vKsp
)

val lRoomGradlePluginToml = LibraryToml(
    TomlName("room-gradlePlugin"),
    roomGradlePlugin,
    vRoom
)

val lCoreKtxToml = LibraryToml(
    TomlName("androidx-core-ktx"),
    androidxCoreKtx,
    vCoreKtx
)

val lLifecycleRuntimeKtxToml = LibraryToml(
    TomlName("androidx-lifecycle-runtime-ktx"),
    androidxLifecycleRuntimeKtx,
    vLifecycleRuntimeKtx
)

val lLifecycleViewModelKtxToml = LibraryToml(
    TomlName("androidx-lifecycle-viewmodel-ktx"),
    androidxLifecycleViewModelKtx,
    vLifecycleRuntimeKtx
)

val lHiltCompilerToml = LibraryToml(
    TomlName("androidx-hilt-compiler"),
    androidxHiltCompiler,
    vHiltCompiler
)

val lHiltNavigationComposeToml = LibraryToml(
    TomlName("androidx-hilt-navigation-compose"),
    androidxHiltNavigationCompose,
    vHiltCompiler
)

val lComposeBomToml = LibraryToml(
    TomlName("androidx-compose-bom"),
    androidxComposeBom,
    vComposeBom
)

val lComposeRuntimeToml = LibraryToml(
    TomlName("androidx-compose-runtime"),
    androidxComposeRuntime,
    vComposeBom
)

val lActivityComposeToml = LibraryToml(
    TomlName("androidx-activity-compose"),
    androidxActivityCompose,
    vActivityCompose
)

val lComposeUiToml = LibraryToml(
    TomlName("androidx-compose-ui"),
    androidxComposeUi,
    vAndroidxComposeCompiler
)

val lComposeUiGraphicsToml = LibraryToml(
    TomlName("androidx-compose-ui-graphics"),
    androidxComposeUiGraphics,
    vAndroidxComposeCompiler
)

val lComposeUiToolingToml = LibraryToml(
    TomlName("androidx-compose-ui-tooling-base"),
    androidxComposeUiTooling,
    vAndroidxComposeCompiler
)

val lComposeUiToolingPreviewToml = LibraryToml(
    TomlName("androidx-compose-ui-tooling-preview"),
    androidxComposeUiToolingPreview,
    vAndroidxComposeCompiler
)

val lComposeNavigationToml = LibraryToml(
    TomlName("androidx-compose-navigation"),
    androidxComposeNavigation,
    vAndroidxComposeNavigation
)

val lJunitToml = LibraryToml(
    TomlName("junit"),
    junit,
    vJunit
)

val lAndroidJUnitToml = LibraryToml(
    TomlName("androidx-junit"),
    androidxJUnit,
    vJunitVersion
)

val lTestRulesToml = LibraryToml(
    TomlName("androidx-test-rules"),
    androidxTestRules,
    vTestRules
)

val lTestRunnerToml = LibraryToml(
    TomlName("androidx-test-runner"),
    androidxTestRunner,
    vTestRunner
)

val lEspressoCoreToml = LibraryToml(
    TomlName("androidx-espresso-core"),
    androidxEspressoCore,
    vEspressoCore
)

val lUiTestJUnit4Toml = LibraryToml(
    TomlName("androidx-ui-test-junit4"),
    androidxUiTestJunit4,
    vAndroidxComposeCompiler
)

val lUiTestManifestToml = LibraryToml(
    TomlName("androidx-ui-test-manifest"),
    androidxUiTestManifest,
    vAndroidxComposeCompiler
)

val lOkhttpBomToml = LibraryToml(
    TomlName("okhttp-bom"),
    okhttpBom,
    vOkhttpBom
)

val lOkhttpToml = LibraryToml(
    TomlName("okhttp"),
    okhttp,
    vOkhttpBom
)

val lOkhttpLoggingToml = LibraryToml(
    TomlName("okhttp-logging"),
    okhttpLogging,
    vOkhttpBom
)

val lRetrofitToml = LibraryToml(
    TomlName("retrofit"),
    retrofit,
    vRetrofit
)

val lRetrofitConverterJsonToml = LibraryToml(
    TomlName("retrofit-converter-json"),
    retrofitConverterJson,
    vRetrofit
)

val lRoomRuntimeToml = LibraryToml(
    TomlName("room-runtime"),
    roomRuntime,
    vRoom
)

val lRoomKtxToml = LibraryToml(
    TomlName("room-ktx"),
    roomKtx,
    vRoom
)

val lRoomCompilerToml = LibraryToml(
    TomlName("room-compiler"),
    roomCompiler,
    vRoom
)

val lDaggerHiltAndroidToml = LibraryToml(
    TomlName("hilt-android"),
    hiltAndroid,
    vHilt
)

val lDaggerHiltCompilerToml = LibraryToml(
    TomlName("hilt-compiler"),
    hiltCompiler,
    vHilt
)

val lJavaxInjectToml = LibraryToml(
    TomlName("javax-inject"),
    javaxInject,
    vJavax
)

val lCoroutinesCoreToml = LibraryToml(
    TomlName("kotlin-coroutines-core"),
    kotlinCoroutinesCore,
    vKotlinCoroutines
)

val lCoroutinesAndroidToml = LibraryToml(
    TomlName("kotlin-coroutines-android"),
    kotlinCoroutinesAndroid,
    vKotlinCoroutines
)

val lKotlinSerializationJsonToml = LibraryToml(
    TomlName("kotlin-serialization-json"),
    kotlinSerializationJson,
    vKotlinSerialization
)

val lKotlinxDatetimeToml = LibraryToml(
    TomlName("kotlinx-datetime"),
    kotlinxDatetime,
    vKotlinxDatetime
)
