package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.yawl.android.template.core.AbstractAndroidTemplate
import com.yawl.android.template.core.AndroidTemplate

class MaTemplate(
    moduleData: ModuleTemplateData,
    private val hilt: Boolean,
    private val room: Boolean,
    private val gradleSecrets: Boolean
) : AbstractAndroidTemplate(moduleData), IMaTemplate {
    override fun hilt() = hilt

    override fun room() = room

    override fun gradleSecrets() = gradleSecrets
}

interface IMaTemplate : AndroidTemplate {
    fun hilt(): Boolean

    fun room(): Boolean

    fun gradleSecrets(): Boolean
}
