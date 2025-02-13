package com.yawl.matemplate.buildLogic.android.content

fun androidLibraryConventionPlugin(): String {
    return """
        package com.convention

        import com.convention.android.KotlinAndroidBaseConventionPlugin
        import org.gradle.api.Plugin
        import org.gradle.api.Project

        class AndroidLibraryConventionPlugin : Plugin<Project> {
            override fun apply(target: Project) {
                with(target) {
                    plugins.apply(libs.plugins.android.library.get().pluginId)
                    plugins.apply(AndroidBaseConventionPlugin::class.java)
                    plugins.apply(KotlinAndroidBaseConventionPlugin::class.java)
                }
            }
        }
    """.trimIndent()
}