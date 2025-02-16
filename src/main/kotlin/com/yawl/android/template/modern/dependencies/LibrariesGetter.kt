package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.LibraryToml
import com.yawl.android.template.modern.IModernTemplate
import com.yawl.android.template.modern.dependencies.toml.*

fun IModernTemplate.modernAndroidLibraries(): List<LibraryToml> {
    return buildList {
        addBuildPlugins()
        if (this@modernAndroidLibraries.room()) {
            addRoomLibraries()
        }
        if (this@modernAndroidLibraries.hilt()) {
            addHiltLibraries()
        }
        addComposeLibraries()
        addAndroidKtxLibraries()
        addNetworkLibraries()
        addTestingLibraries()
        addOtherLibraries()
    }
}

private fun MutableList<LibraryToml>.addBuildPlugins() {
    add(lKotlinGradlePluginToml)
    add(lAndroidGradlePluginToml)
    add(lKspGradlePluginToml)
}

private fun MutableList<LibraryToml>.addComposeLibraries() {
    add(lComposeBomToml)
    add(lComposeRuntimeToml)
    add(lActivityComposeToml)
    add(lComposeUiToml)
    add(lComposeUiGraphicsToml)
    add(lComposeUiToolingToml)
    add(lComposeUiToolingPreviewToml)
    add(lComposeNavigationToml)
}

private fun MutableList<LibraryToml>.addAndroidKtxLibraries() {
    add(lCoreKtxToml)
    add(lLifecycleRuntimeKtxToml)
    add(lLifecycleViewModelKtxToml)
}

private fun MutableList<LibraryToml>.addNetworkLibraries() {
    add(lOkhttpBomToml)
    add(lOkhttpToml)
    add(lOkhttpLoggingToml)
    add(lRetrofitToml)
    add(lRetrofitConverterJsonToml)
}

private fun MutableList<LibraryToml>.addTestingLibraries() {
    add(lJunitToml)
    add(lAndroidJUnitToml)
    add(lTestRulesToml)
    add(lTestRunnerToml)
    add(lEspressoCoreToml)
    add(lUiTestJUnit4Toml)
    add(lUiTestManifestToml)
}

private fun MutableList<LibraryToml>.addHiltLibraries() {
    add(lDaggerHiltAndroidToml)
    add(lDaggerHiltCompilerToml)
    add(lJavaxInjectToml)
}

private fun MutableList<LibraryToml>.addRoomLibraries() {
    add(lRoomGradlePluginToml)
    add(lRoomRuntimeToml)
    add(lRoomKtxToml)
    add(lRoomCompilerToml)
}

private fun MutableList<LibraryToml>.addOtherLibraries() {
    add(lCoroutinesCoreToml)
    add(lCoroutinesAndroidToml)
    add(lKotlinSerializationJsonToml)
    add(lKotlinxDatetimeToml)
}