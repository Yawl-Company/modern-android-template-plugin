plugins {
    id("org.jetbrains.intellij.platform") version "2.2.1"
    alias(libs.plugins.convention.intellij.android)
}

group = "com.yawl"
version = "1.0.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}
