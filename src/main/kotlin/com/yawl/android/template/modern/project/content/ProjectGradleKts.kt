package com.yawl.android.template.modern.project.content

import com.yawl.android.template.core.libs.Plugin
import com.yawl.android.template.modern.IMaTemplate

fun maTemplatePlugins(template: IMaTemplate) =
    listOfNotNull(
        Plugin("android.application"),
        Plugin("android.library"),
        Plugin("kotlin.compose"),
        Plugin("ksp"),
        Plugin("kotlin.serialization"),
        Plugin("gradle.secrets"),
        template.hilt().takeIf { it }?.let { Plugin("hilt") },
        template.room().takeIf { it }?.let { Plugin("room") }
    )