package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.yawl.android.template.core.AbstractAndroidTemplate
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.libs.LibsToml

class MaTemplate(
    moduleData: ModuleTemplateData,
    private val hilt: Boolean,
    private val room: Boolean,
    private val gradleSecrets: Boolean
) : AbstractAndroidTemplate(moduleData), IMaTemplate {
    override fun hilt() = hilt

    override fun room() = room

    override fun gradleSecrets() = gradleSecrets

    override fun libraries(): LibsToml {
        return LibsToml(
            versions = emptyList(),
            plugins = emptyList(),
            libraries = emptyList()
        )
    }
}

interface IMaTemplate : AndroidTemplate {
    fun hilt(): Boolean

    fun room(): Boolean

    fun gradleSecrets(): Boolean
}
