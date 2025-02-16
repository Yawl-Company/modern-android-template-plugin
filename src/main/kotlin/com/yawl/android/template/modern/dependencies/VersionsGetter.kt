package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.VersionToml
import com.yawl.android.template.modern.IModernTemplate
import com.yawl.android.template.modern.dependencies.toml.*

fun IModernTemplate.modernAndroidVersions(): List<VersionToml> {
    return buildList {
        addCoreBuildVersions()
        addBuildConfigVersions()
        addTestingVersions()
        addComposeVersions()
        addAndroidKtxVersions()
        addNetworkVersions()
        addKotlin()
        if (this@modernAndroidVersions.room()) {
            addRoom()
        }
        if (this@modernAndroidVersions.hilt()) {
            addHiltVersions()
        }
        if (this@modernAndroidVersions.gradleSecrets()) {
            addSecrets()
        }
    }
}

private fun MutableList<VersionToml>.addCoreBuildVersions() {
    add(vAgp)
    add(vJava)
    add(vKotlin)
    add(vKotlinLanguageVersion)
}

private fun MutableList<VersionToml>.addBuildConfigVersions() {
    add(vCompileSdk)
    add(vTargetSdk)
    add(vMinSdk)
    add(vBuildTools)
}

private fun MutableList<VersionToml>.addTestingVersions() {
    add(vJunit)
    add(vJunitVersion)
    add(vTestRules)
    add(vTestRunner)
    add(vEspressoCore)
}

private fun MutableList<VersionToml>.addComposeVersions() {
    add(vActivityCompose)
    add(vComposeBom)
    add(vAndroidxComposeCompiler)
    add(vAndroidxComposeNavigation)
}

private fun MutableList<VersionToml>.addAndroidKtxVersions() {
    add(vCoreKtx)
    add(vLifecycleRuntimeKtx)
}

private fun MutableList<VersionToml>.addNetworkVersions() {
    add(vOkhttpBom)
    add(vRetrofit)
}

private fun MutableList<VersionToml>.addKotlin() {
    add(vKotlinCoroutines)
    add(vKotlinSerialization)
    add(vKotlinxDatetime)
    add(vKsp)
}

private fun MutableList<VersionToml>.addRoom() {
    add(vRoom)
}

private fun MutableList<VersionToml>.addHiltVersions() {
    add(vHilt)
    add(vHiltCompiler)
}

private fun MutableList<VersionToml>.addSecrets() {
    add(vSecrets)
}