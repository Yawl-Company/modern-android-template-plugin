package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.ConventionPluginToml
import com.yawl.android.template.core.libs.LibraryToml
import com.yawl.android.template.core.libs.PluginToml
import com.yawl.android.template.core.libs.VersionToml

fun modernAndroidVersions(): List<VersionToml> {
    return listOf(
        vAgp,
        vJava,
        vKotlin,
        vKotlinLanguageVersion,
        vCompileSdk,
        vTargetSdk,
        vMinSdk,
        vBuildTools,
        vJunit,
        vJunitVersion,
        vTestRules,
        vTestRunner,
        vEspressoCore,
        vActivityCompose,
        vComposeBom,
        vAndroidxComposeCompiler,
        vAndroidxComposeNavigation,
        vCoreKtx,
        vLifecycleRuntimeKtx,
        vOkhttpBom,
        vRetrofit,
        vKotlinCoroutines,
        vKotlinSerialization,
        vKotlinxDatetime,
        vKsp,
        vRoom,
        vHilt,
        vHiltCompiler,
        vJavax,
        vSecrets
    )
}

fun modernAndroidLibraries(): List<LibraryToml> {
    return listOf(
        lKotlinGradlePluginToml,
        lAndroidGradlePluginToml,
        lKspGradlePluginToml,
        lRoomGradlePluginToml,
        lCoreKtxToml,
        lLifecycleRuntimeKtxToml,
        lLifecycleViewModelKtxToml,
        lHiltCompilerToml,
        lHiltNavigationComposeToml,
        lComposeBomToml,
        lComposeRuntimeToml,
        lActivityComposeToml,
        lComposeUiToml,
        lComposeUiGraphicsToml,
        lComposeUiToolingToml,
        lComposeUiToolingPreviewToml,
        lComposeNavigationToml,
        lJunitToml,
        lAndroidJUnitToml,
        lTestRulesToml,
        lTestRunnerToml,
        lEspressoCoreToml,
        lUiTestJUnit4Toml,
        lUiTestManifestToml,
        lOkhttpBomToml,
        lOkhttpToml,
        lOkhttpLoggingToml,
        lRetrofitToml,
        lRetrofitConverterJsonToml,
        lRoomRuntimeToml,
        lRoomKtxToml,
        lRoomCompilerToml,
        lDaggerHiltAndroidToml,
        lDaggerHiltCompilerToml,
        lJavaxInjectToml,
        lCoroutinesCoreToml,
        lCoroutinesAndroidToml,
        lKotlinSerializationJsonToml,
        lKotlinxDatetimeToml
    )
}

fun modernAndroidPlugins(): List<PluginToml> {
    return listOf(
        pAndroidApplicationPlugin,
        pAndroidLibraryPlugin,
        pKotlinComposePlugin,
        pKotlinSerializationPlugin,
        pKotlinParcelablePlugin,
        pKspPlugin,
        pRoomPlugin,
        pHiltPlugin,
        pGradleSecretsPlugin
    )
}

fun modernAndroidConventions(): List<ConventionPluginToml> {
    return listOf(
        pConventionAndroidApplication,
        pConventionAndroidLibrary,
        pConventionAndroidCompose,
        pConventionAndroidHilt,
        pConventionAndroidUnitTest,
        pConventionAndroidUiTest,
        pConventionKotlinSerialization,
        pConventionKotlinJvm,
        pConventionSigning
    )
}
