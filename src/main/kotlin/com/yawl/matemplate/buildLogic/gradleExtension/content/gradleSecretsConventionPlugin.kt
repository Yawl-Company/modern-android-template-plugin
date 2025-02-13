package com.yawl.matemplate.buildLogic.gradleExtension.content

fun gradleSecretsConventionPlugin(): String {
    return """
        package com.convention

        import org.gradle.api.Plugin
        import org.gradle.api.Project

        class GradleSecretsConventionPlugin: Plugin<Project> {
            override fun apply(target: Project) {
                with(target) {
                    plugins.apply(libs.plugins.gradle.secrets.get().pluginId)
                }
            }
        }
    """.trimIndent()
}