package com.yawl.android.template.modern.dependencies.toml

import com.yawl.android.template.core.libs.ConventionPluginToml
import com.yawl.android.template.core.libs.TomlName
import com.yawl.android.template.core.libs.PluginToml
import com.yawl.android.template.core.libs.usage.*

val pAndroidApplicationPlugin = PluginToml(
    TomlName("android-application"),
    androidApplicationPlugin,
    vAgp
)

val pAndroidLibraryPlugin = PluginToml(
    TomlName("android-library"),
    androidLibraryPlugin,
    vAgp
)

val pKotlinComposePlugin = PluginToml(
    TomlName("kotlin-compose"),
    kotlinComposePlugin,
    vKotlin
)

val pKotlinSerializationPlugin = PluginToml(
    TomlName("kotlin-serialization"),
    kotlinSerializationPlugin,
    vKotlin
)

val pKotlinParcelablePlugin = PluginToml(
    TomlName("kotlin-parcelable"),
    kotlinParcelablePlugin,
    vKotlin
)

val pKspPlugin = PluginToml(
    TomlName("ksp"),
    kspPlugin,
    vKsp
)

val pRoomPlugin = PluginToml(
    TomlName("room"),
    roomPlugin,
    vRoom
)

val pHiltPlugin = PluginToml(
    TomlName("hilt"),
    hiltPlugin,
    vHilt
)

val pGradleSecretsPlugin = PluginToml(
    TomlName("gradle-secrets"),
    gradleSecretsPlugin,
    vSecrets
)

val pConventionAndroidApplication = ConventionPluginToml(
    TomlName("convention-android-application"),
    conventionAndroidApplication
)

val pConventionAndroidLibrary = ConventionPluginToml(
    TomlName("convention-android-library"),
    conventionAndroidLibrary
)

val pConventionAndroidCompose = ConventionPluginToml(
    TomlName("convention-android-compose"),
    conventionAndroidCompose
)

val pConventionAndroidHilt = ConventionPluginToml(
    TomlName("convention-android-hilt"),
    conventionAndroidHilt
)

val pConventionAndroidUnitTest = ConventionPluginToml(
    TomlName("convention-android-unit-test"),
    conventionAndroidUnitTest
)

val pConventionAndroidUiTest = ConventionPluginToml(
    TomlName("convention-android-ui-test"),
    conventionAndroidUiTest
)

val pConventionKotlinSerialization = ConventionPluginToml(
    TomlName("convention-kotlin-serialization"),
    conventionKotlinSerialization
)

val pConventionKotlinJvm = ConventionPluginToml(
    TomlName("convention-kotlin-jvm"),
    conventionKotlinJvm
)

val pConventionSigning = ConventionPluginToml(
    TomlName("convention-signing"),
    conventionSigning
)