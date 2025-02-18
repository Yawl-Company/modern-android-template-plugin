package com.convention

import org.gradle.api.Plugin
import org.gradle.api.Project

class IdeaPluginConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(libs.plugins.convention.kotlin.jvm.get().pluginId)
            plugins.apply(libs.plugins.jetbrains.intellij.get().pluginId)
        }
    }
}