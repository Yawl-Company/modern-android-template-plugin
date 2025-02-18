import org.jetbrains.intellij.tasks.BuildSearchableOptionsTask

plugins {
    alias(libs.plugins.convention.intellij)
}

group = "com.yawl"
version = "1.0"

repositories {
    mavenCentral()
}

intellij {
    type.set("AI")
    version.set("2023.1.1.26")

    plugins.set(
        listOf(
            "android",
            "java",
            "Kotlin"
        )
    )
}

tasks.getByName<BuildSearchableOptionsTask>("buildSearchableOptions") {
    enabled = false
}