package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData

data class MaTemplateParameters(
    val moduleData: ModuleTemplateData,
    val hilt: Boolean,
    val room: Boolean
)
