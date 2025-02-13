package com.yawl.android.template

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import com.yawl.android.template.modern.modernAndroidTemplate

class AndroidStudioTemplateProvider : WizardTemplateProvider() {
    override fun getTemplates(): List<Template> {
        return listOf(modernAndroidTemplate)
    }
}
