package com.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.intellij.IntelliJPluginExtension
import org.jetbrains.intellij.tasks.BuildSearchableOptionsTask

class AndroidStudioPluginConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(IdeaPluginBaseConventionPlugin::class.java)

            extensions.configure(IntelliJPluginExtension::class.java) { intelliJ ->
                intelliJ.apply {
                    type.set("AI")
                    version.set("2023.1.1.26")
                    plugins.set(
                        listOf(
                            "android",
                            "java",
                            "Kotlin"
                        )
                    )
                }
            }

            tasks.withType(BuildSearchableOptionsTask::class.java).configureEach {
                it.apply {
                    enabled = false
                }
            }
        }
    }
}