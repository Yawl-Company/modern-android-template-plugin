package com.convention

import com.convention.jvm.KotlinJvmPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class IdeaPluginConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(KotlinJvmPlugin::class.java)
            plugins.apply(libs.plugins.jetbrains.intellij.get().pluginId)
        }
    }
}