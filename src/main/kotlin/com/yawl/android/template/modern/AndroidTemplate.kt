package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.defaultPackageNameParameter
import com.yawl.android.template.modern.dependencies.toml.vMinSdk
import java.io.File

val modernAndroidTemplate
    get() = template {
        name = "Modern Android Template"

        description = "Kickstart your development"

        minApi = vMinSdk
            .value()
            .toIntOrNull() ?: 24

        constraints = listOf(
            TemplateConstraint.AndroidX,
            TemplateConstraint.Kotlin,
            TemplateConstraint.Compose
        )

        category = Category.Compose

        formFactor = FormFactor.Mobile

        screens = listOf(
            WizardUiContext.NewProject,
            WizardUiContext.NewProjectExtraDetail
        )

        val packageName = defaultPackageNameParameter

        val useRoom = booleanParameter {
            name = "Use Room"
            default = false
        }

        val useHilt = booleanParameter {
            name = "Use Hilt"
            default = false
        }

        val useRetrofit = booleanParameter {
            name = "Use Retrofit with OkHttp"
            default = false
        }

        val useGradleSecrets = booleanParameter {
            name = "Use Gradle Secrets"
            default = false
        }

        widgets(
            PackageNameWidget(packageName),
            CheckBoxWidget(useHilt),
            CheckBoxWidget(useRoom),
            CheckBoxWidget(useRetrofit),
            CheckBoxWidget(useGradleSecrets)
        )

        thumb {
            File("compose-activity-material3").resolve(
                "template_compose_empty_activity_material3.png"
            )
        }

        recipe = { data: TemplateData ->
            modernAndroidRecipe(
                template = ModernTemplate(
                    moduleData = data as ModuleTemplateData,
                    hilt = useHilt.value,
                    room = useRoom.value,
                    retrofit = useRetrofit.value,
                    gradleSecrets = useGradleSecrets.value
                ),
            )
        }
    }