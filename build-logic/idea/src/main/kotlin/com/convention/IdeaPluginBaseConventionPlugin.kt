package com.convention

import com.convention.jvm.KotlinJvmPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.intellij.tasks.PatchPluginXmlTask
import org.jetbrains.intellij.tasks.PublishPluginTask
import org.jetbrains.intellij.tasks.SignPluginTask

class IdeaPluginBaseConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(KotlinJvmPlugin::class.java)
            plugins.apply(libs.plugins.jetbrains.intellij.get().pluginId)

            tasks.withType(PatchPluginXmlTask::class.java).configureEach {
                it.apply {
                    sinceBuild.set(libs.versions.intelliJSinceBuild)
                    untilBuild.set(
                        libs.versions.intelliJUntilBuild
                            .get()
                            .takeIf { version ->
                                version != "0"
                            } ?: ""
                    )
                }
            }

            tasks.withType(SignPluginTask::class.java).configureEach {
                it.apply {
                    certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
                    privateKey.set(System.getenv("PRIVATE_KEY"))
                    password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
                }
            }

            tasks.withType(PublishPluginTask::class.java).configureEach {
                it.apply {
                    token.set(System.getenv("PUBLISH_TOKEN"))
                }
            }
        }
    }
}