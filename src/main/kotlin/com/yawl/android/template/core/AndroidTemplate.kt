package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.yawl.android.template.core.libs.LibsToml
import com.yawl.android.template.core.project.GradleProperties
import java.io.File

interface AndroidTemplate {

    fun template(): ModuleTemplateData

    fun libraries(): LibsToml

    fun projectName(): String

    fun projectRoot(): File

    fun packageName(): String

    fun sourcesRoot(): File

    fun resourcesRoot(): File

    fun gradleProperties(): GradleProperties

}

abstract class AbstractAndroidTemplate(
    private val moduleData: ModuleTemplateData
) : AndroidTemplate {
    override fun template(): ModuleTemplateData {
        return moduleData
    }

    override fun projectRoot(): File = moduleData
        .projectTemplateData
        .rootDir

    override fun sourcesRoot(): File = moduleData
        .srcDir

    override fun resourcesRoot(): File = moduleData
        .resDir

    override fun packageName(): String = moduleData
        .packageName

    override fun projectName(): String = moduleData
        .projectTemplateData
        .rootDir
        .name
}
