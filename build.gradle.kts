import org.jetbrains.intellij.tasks.BuildSearchableOptionsTask

plugins {
    alias(libs.plugins.convention.kotlin.jvm)
    id("org.jetbrains.intellij") version "1.17.4"
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

tasks {
    patchPluginXml {
        sinceBuild.set("231")
        untilBuild.set("")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}

tasks.getByName<BuildSearchableOptionsTask>("buildSearchableOptions") {
    enabled = false
}