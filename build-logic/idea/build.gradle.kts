plugins {
    kotlin("jvm")
    `java-gradle-plugin`
}

group = "com.convention.idea.build-logic"

dependencies {
    implementation(projects.gradleExtension)
    implementation(projects.kotlin)

    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.intelliJ.gradlePlugin)
}

gradlePlugin {
    plugins {
        create("intellij-plugin") {
            id = "convention.intellij-plugin"
            implementationClass = "com.convention.IdeaPluginConventionPlugin"
        }
    }
}
