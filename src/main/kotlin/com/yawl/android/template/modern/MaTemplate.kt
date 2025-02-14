package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.ModuleTemplateData
import java.io.File

data class MaTemplate(
    val moduleData: ModuleTemplateData,
    val hilt: Boolean,
    val room: Boolean
) {
    fun root(): File = moduleData
        .rootDir

}