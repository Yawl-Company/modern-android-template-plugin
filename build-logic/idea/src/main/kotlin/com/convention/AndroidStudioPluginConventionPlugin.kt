package com.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.intellij.platform.gradle.extensions.IntelliJPlatformDependenciesExtension
import org.jetbrains.intellij.platform.gradle.extensions.IntelliJPlatformExtension

class AndroidStudioPluginConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(IdeaPluginBaseConventionPlugin::class.java)

            dependencies.extensions
                .configure(IntelliJPlatformDependenciesExtension::class.java) {
                    it.apply {
                        androidStudio(libs.versions.androidStudio)
                        bundledPlugin("org.jetbrains.android")
                    }
                }

            extensions.configure(IntelliJPlatformExtension::class.java) {
                it.apply {
                    buildSearchableOptions.set(false)
                }
            }
        }
    }
}