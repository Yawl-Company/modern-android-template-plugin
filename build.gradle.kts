plugins {
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
