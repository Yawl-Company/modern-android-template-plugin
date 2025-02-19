package com.convention

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidStudioPluginConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply(IdeaPluginBaseConventionPlugin::class.java)
        }
    }
}