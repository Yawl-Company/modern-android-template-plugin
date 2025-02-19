package com.yawl.android.template.modern

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.defaultPackageNameParameter
import com.yawl.android.template.core.project.GradleProperties
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


        val gradleParallel = booleanParameter {
            name = "Enable Parallel Execution"
            default = true
        }

        val gradleCaching = booleanParameter {
            name = "Enable Build Caching"
            default = true
        }

        val gradleConfigureOnDemand = booleanParameter {
            name = "Enable Configure on Demand"
            default = false
        }

        val gradleConfigurationCache = booleanParameter {
            name = "Enable Configuration Cache"
            default = true
        }

        widgets(
            PackageNameWidget(packageName),
            LabelWidget(""),
            LabelWidget("Enable or disable features as needed:"),
            CheckBoxWidget(useHilt),
            CheckBoxWidget(useRoom),
            CheckBoxWidget(useRetrofit),
            CheckBoxWidget(useGradleSecrets),
            LabelWidget(""),
            LabelWidget("Enable or disable Gradle properties:"),
            CheckBoxWidget(gradleParallel),
            CheckBoxWidget(gradleCaching),
            CheckBoxWidget(gradleConfigureOnDemand),
            CheckBoxWidget(gradleConfigurationCache),
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
                    gradleSecrets = useGradleSecrets.value,
                    gradleProperties = GradleProperties(
                        caching = gradleCaching.value,
                        parallel = gradleParallel.value,
                        configurationCache = gradleConfigurationCache.value,
                        configureondemand = gradleConfigureOnDemand.value
                    )
                ),
            )
        }
    }