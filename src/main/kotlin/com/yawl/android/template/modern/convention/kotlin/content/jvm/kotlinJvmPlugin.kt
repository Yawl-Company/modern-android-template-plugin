package com.yawl.android.template.modern.convention.kotlin.content.jvm

fun kotlinJvmPlugin(): String {
    return """
        package com.convention.jvm

        import com.convention.libs
        import org.gradle.api.Plugin
        import org.gradle.api.Project
        import org.gradle.api.tasks.compile.JavaCompile
        import org.gradle.jvm.toolchain.JavaLanguageVersion
        import org.jetbrains.kotlin.gradle.dsl.JvmTarget
        import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

        class KotlinJvmPlugin : Plugin<Project> {
            override fun apply(project: Project) {
                with(project) {
                    plugins.apply(KotlinJvmBasePlugin::class.java)
                    val javaTarget = JavaLanguageVersion.of(libs.versions.java.get()).toString()

                    tasks.withType(JavaCompile::class.java) {
                        it.sourceCompatibility = javaTarget
                        it.targetCompatibility = javaTarget
                    }

                    tasks.withType(KotlinCompile::class.java).configureEach {
                        it.compilerOptions {
                            jvmTarget.set(JvmTarget.fromTarget(javaTarget))
                        }
                    }
                }
            }
        }
    """.trimIndent()
}