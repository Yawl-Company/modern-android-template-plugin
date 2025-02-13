package com.yawl.android.template.modern.buildLogic.kotlin

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.modern.buildLogic.createModule
import com.yawl.android.template.modern.buildLogic.kotlin.content.android.kotlinAndroidBaseConventionPlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.jvm.kotlinJvmAndroidPlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.jvm.kotlinJvmBasePlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.jvm.kotlinJvmPlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.kotlinBaseConventionPlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.kotlinSerializationConventionPlugin
import com.yawl.android.template.modern.buildLogic.kotlin.content.kspConventionPlugin
import java.io.File

fun RecipeExecutor.kotlinConventionWriter(
    parentDirectory: File
) {
    createModule(
        parentDirectory = parentDirectory,
        moduleName = "kotlin",
        buildGradleSource = kotlinBuildGradle(),
        content = { directory ->
            save(
                source = kotlinBaseConventionPlugin(),
                to = directory
                    .resolve("KotlinBaseConventionPlugin.kt")
            )
            save(
                source = kotlinSerializationConventionPlugin(),
                to = directory
                    .resolve("KotlinSerializationConventionPlugin.kt")
            )
            save(
                source = kspConventionPlugin(),
                to = directory
                    .resolve("KspConventionPlugin.kt")
            )
            val jvmDir = directory.resolve("jvm")
            createDirectory(
                at = jvmDir
            )
            save(
                source = kotlinJvmBasePlugin(),
                to = jvmDir
                    .resolve("KotlinJvmBasePlugin.kt")
            )
            save(
                source = kotlinJvmPlugin(),
                to = jvmDir
                    .resolve("KotlinJvmPlugin.kt")
            )
            save(
                source = kotlinJvmAndroidPlugin(),
                to = jvmDir
                    .resolve("KotlinJvmAndroidPlugin.kt")
            )
            val androidDir = directory
                .resolve("android")
            createDirectory(
                at = androidDir
            )
            save(
                source = kotlinAndroidBaseConventionPlugin(),
                to = androidDir
                    .resolve("KotlinAndroidBaseConventionPlugin.kt")
            )
        }
    )
}
