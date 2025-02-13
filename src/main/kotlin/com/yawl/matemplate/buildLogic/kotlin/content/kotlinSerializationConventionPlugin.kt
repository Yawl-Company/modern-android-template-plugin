package com.yawl.matemplate.buildLogic.kotlin.content

fun kotlinSerializationConventionPlugin(): String {
    return """
        package com.convention

        import org.gradle.api.Plugin
        import org.gradle.api.Project

        class KotlinSerializationConventionPlugin : Plugin<Project> {
            override fun apply(target: Project) {
                with(target) {
                    plugins.apply(libs.plugins.kotlin.serialization.get().pluginId)

                    dependencies.add("implementation", libs.kotlin.serialization.json.get())
                }
            }
        }
    """.trimIndent()
}