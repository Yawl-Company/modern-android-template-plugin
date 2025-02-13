package com.yawl.android.template.buildLogic.android.content

fun androidBaseConventionPlugin(): String {
    return """
        package com.convention

        import com.android.build.gradle.BaseExtension
        import org.gradle.api.JavaVersion
        import org.gradle.api.Plugin
        import org.gradle.api.Project

        class AndroidBaseConventionPlugin : Plugin<Project> {
            override fun apply(target: Project) {
                with(target) {
                    extensions.configure(BaseExtension::class.java) { base ->
                        with(base) {
                            buildToolsVersion(libs.versions.buildTools.get())
                            compileSdkVersion(libs.versions.compileSdk.get().toInt())

                            defaultConfig {
                                it.minSdk = libs.versions.minSdk.get().toInt()
                                it.targetSdk = libs.versions.targetSdk.get().toInt()
                            }

                            compileOptions {
                                it.sourceCompatibility = JavaVersion.VERSION_17
                                it.targetCompatibility = JavaVersion.VERSION_17
                            }

                            lintOptions { lint ->
                                with(lint) {
                                    isAbortOnError = false
                                    isWarningsAsErrors = true
                                    textReport = true
                                    isQuiet = true
                                    isCheckReleaseBuilds = false
                                }
                            }

                            with(buildFeatures) {
                                aidl = false
                                compose = false
                                buildConfig = false
                                prefab = false
                                renderScript = false
                                resValues = false
                                shaders = false
                                viewBinding = false
                            }
                        }
                    }
                }
            }
        }
    """.trimIndent()
}