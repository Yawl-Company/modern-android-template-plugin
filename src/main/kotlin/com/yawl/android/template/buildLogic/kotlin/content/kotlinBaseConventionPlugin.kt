package com.yawl.android.template.buildLogic.kotlin.content

fun kotlinBaseConventionPlugin(): String {
    return """
        package com.convention

        import org.gradle.api.Plugin
        import org.gradle.api.Project
        import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
        import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

        class KotlinBaseConventionPlugin : Plugin<Project> {
            override fun apply(project: Project) {
                with(project) {
                    val kotlinVersion = KotlinVersion.fromVersion(
                        libs.versions.kotlinLanguageVersion.get()
                    )
                    tasks.withType(KotlinCompile::class.java).configureEach {
                        it.compilerOptions {
                            languageVersion.set(kotlinVersion)
                            apiVersion.set(kotlinVersion)

                            freeCompilerArgs.set(
                                mutableListOf(
                                    "-opt-in=kotlin.RequiresOptIn",
                                )
                            )
                        }
                    }
                }
            }
        }
    """.trimIndent()
}