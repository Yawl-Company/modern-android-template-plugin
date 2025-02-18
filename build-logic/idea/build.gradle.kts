plugins {
    kotlin("jvm")
    `java-gradle-plugin`
}

group = "com.convention.idea.build-logic"

dependencies {
    implementation(projects.gradleExtension)

    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.intelliJ.gradlePlugin)
}
