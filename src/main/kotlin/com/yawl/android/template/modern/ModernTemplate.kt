package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.yawl.android.template.core.AbstractAndroidTemplate
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.libs.LibsToml
import com.yawl.android.template.modern.dependencies.*

class ModernTemplate(
    moduleData: ModuleTemplateData,
    private val hilt: Boolean,
    private val room: Boolean,
    private val retrofit: Boolean,
    private val gradleSecrets: Boolean
) : AbstractAndroidTemplate(moduleData), IModernTemplate {
    override fun hilt() = hilt

    override fun room() = room

    override fun retrofit() = retrofit

    override fun gradleSecrets() = gradleSecrets

    override fun libraries(): LibsToml {
        return LibsToml(
            versions = modernAndroidVersions(),
            plugins = modernAndroidPlugins(),
            libraries = modernAndroidLibraries(),
            conventions = modernAndroidConventions()
        )
    }
}

interface IModernTemplate : AndroidTemplate {
    fun hilt(): Boolean

    fun room(): Boolean

    fun retrofit(): Boolean

    fun gradleSecrets(): Boolean
}
