package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.yawl.android.template.core.libs.LibsToml
import java.io.File

interface AndroidTemplate {

    fun template(): ModuleTemplateData

    fun libraries(): LibsToml

    fun projectName(): String

    fun projectRoot(): File

    fun packageName(): String

    fun sourcesRoot(): File

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

    override fun packageName(): String = moduleData
        .packageName

    override fun projectName(): String = moduleData
        .projectTemplateData
        .rootDir
        .name

    override fun libraries(): LibsToml {
        return LibsToml(
            versions = emptyList(),
            plugins = emptyList(),
            libraries = emptyList(),
            conventions = emptyList(),
        )
    }
}
