package com.yawl.android.template.modern.dependencies

import com.yawl.android.template.core.libs.ConventionPluginToml
import com.yawl.android.template.core.libs.PluginToml
import com.yawl.android.template.modern.IModernTemplate
import com.yawl.android.template.modern.dependencies.toml.*


fun IModernTemplate.modernAndroidPlugins(): List<PluginToml> {
    return buildList {
        add(pAndroidApplicationPlugin)
        add(pAndroidLibraryPlugin)
        add(pKotlinComposePlugin)
        add(pKotlinSerializationPlugin)
        add(pKotlinParcelablePlugin)
        add(pKspPlugin)
        if (this@modernAndroidPlugins.hilt()) {
            add(pHiltPlugin)
        }
        if (this@modernAndroidPlugins.room()) {
            add(pRoomPlugin)
        }
        if (this@modernAndroidPlugins.gradleSecrets()) {
            add(pGradleSecretsPlugin)
        }
    }
}

fun IModernTemplate.modernAndroidConventions(): List<ConventionPluginToml> {
    return buildList {
        add(pConventionAndroidApplication)
        add(pConventionAndroidLibrary)
        add(pConventionAndroidCompose)
        if (this@modernAndroidConventions.hilt()) {
            add(pConventionAndroidHilt)
        }
        add(pConventionAndroidUnitTest)
        add(pConventionAndroidUiTest)
        add(pConventionKotlinSerialization)
        add(pConventionKotlinJvm)
        add(pConventionSigning)
    }
}
