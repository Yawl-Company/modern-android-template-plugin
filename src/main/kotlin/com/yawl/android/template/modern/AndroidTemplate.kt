package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.defaultPackageNameParameter
import java.io.File

val modernAndroidTemplate
    get() = template {
        name = "Modern Android Template"

        description = "Kickstart your development"

        minApi = 24

        constraints = listOf(
            TemplateConstraint.AndroidX,
            TemplateConstraint.Kotlin,
            TemplateConstraint.Compose
        )

        category = Category.Application

        formFactor = FormFactor.Mobile

        screens = listOf(
            WizardUiContext.NewProject,
            WizardUiContext.NewProjectExtraDetail
        )

        val packageName = defaultPackageNameParameter

        val useRoom = booleanParameter {
            name = "Add Room support"
            default = true
        }

        val useHilt = booleanParameter {
            name = "Use Hilt support"
            default = true
        }

        widgets(
            PackageNameWidget(packageName),
            CheckBoxWidget(useRoom),
            CheckBoxWidget(useHilt),
        )

        thumb {
            File("compose-activity-material3").resolve(
                "template_compose_empty_activity_material3.png"
            )
        }

        recipe = { data: TemplateData ->
            modernAndroidRecipe(
                template = MaTemplate(
                    moduleData = data as ModuleTemplateData,
                    hilt = useHilt.value,
                    room = useRoom.value
                ),
            )
        }
    }