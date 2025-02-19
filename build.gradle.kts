plugins {
    id("org.jetbrains.intellij.platform") version "2.2.2-SNAPSHOT"
    alias(libs.plugins.convention.intellij.android)
}

group = "com.yawl"
version = "1.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}
