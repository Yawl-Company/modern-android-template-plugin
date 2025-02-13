package com.yawl.android.template.buildLogic.kotlin.content

fun kspConventionPlugin(): String {
    return """
        package com.convention

        import org.gradle.api.Plugin
        import org.gradle.api.Project

        class KspConventionPlugin : Plugin<Project> {
            override fun apply(target: Project) {
                with(target) {
                    plugins.apply(libs.plugins.ksp.get().pluginId)
                }
            }
        }
    """.trimIndent()
}