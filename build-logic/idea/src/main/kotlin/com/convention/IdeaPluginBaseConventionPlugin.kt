package com.convention

import com.convention.jvm.KotlinJvmPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.intellij.platform.gradle.extensions.IntelliJPlatformExtension

class IdeaPluginBaseConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(KotlinJvmPlugin::class.java)
            plugins.apply(libs.plugins.intelliJ.platform.get().pluginId)

            extensions.configure(IntelliJPlatformExtension::class.java) {
                it.apply {
                    pluginConfiguration.apply {
                        version.set(libs.versions.intelliJ)

                        ideaVersion.apply {
                            sinceBuild.set(libs.versions.intelliJSinceBuild)
                            untilBuild.set(provider { null })
                        }
                    }

                    signing.apply {
                        certificateChain.set(
                            providers.environmentVariable("CERTIFICATE_CHAIN")
                        )
                        privateKey.set(
                            providers.environmentVariable("PRIVATE_KEY")
                        )
                        password.set(
                            providers.environmentVariable("PRIVATE_KEY_PASSWORD")
                        )
                    }


                    publishing.apply {
                        token.set(
                            providers.environmentVariable("PUBLISH_TOKEN")
                        )
                    }
                }
            }
        }
    }
}