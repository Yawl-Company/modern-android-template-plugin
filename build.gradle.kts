import com.convention.libs

plugins {
    alias(libs.plugins.convention.kotlin.jvm)
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "com.yawl"
version = "1.0.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        androidStudio("2024.1.2.13")
        bundledPlugin("org.jetbrains.android")
    }
}


intellijPlatform {
    pluginConfiguration {
        version = libs.versions.intelliJ.get()

        ideaVersion {
            sinceBuild = libs.versions.intelliJSinceBuild
            untilBuild = provider { null }
        }
    }

    signing {
        certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN")
        privateKey = providers.environmentVariable("PRIVATE_KEY")
        password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
    }

    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
    }

    buildSearchableOptions = false
}
