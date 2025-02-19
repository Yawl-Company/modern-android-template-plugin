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
        create("intellij-android") {
            id = "convention.intellij-android"
            implementationClass = "com.convention.AndroidStudioPluginConventionPlugin"
        }
    }
}
