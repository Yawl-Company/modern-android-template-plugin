package com.yawl.matemplate

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.defaultPackageNameParameter
import java.io.File

val modernAndroidTemplate
    get() = template {
        name = "Modern Android Template"
        description = "Stub"
        minApi = 24

        constraints = listOf(
            TemplateConstraint.AndroidX,
            TemplateConstraint.Kotlin
        )

        category = Category.Application

        formFactor = FormFactor.Mobile

        screens = listOf(
            WizardUiContext.NewProject
        )

        val packageName = defaultPackageNameParameter

        widgets(
            PackageNameWidget(packageName),
        )

        thumb {
            File("compose-activity-material3").resolve(
                "template_compose_empty_activity_material3.png"
            )
        }

        recipe = { data: TemplateData ->
            modernAndroidRecipe(
                moduleData = data as ModuleTemplateData
            )
        }
    }