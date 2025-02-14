package com.yawl.android.template.core

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.intellij.openapi.vfs.LocalFileSystem
import java.io.File

fun RecipeExecutor.deleteFile(
    source: File
) {
    LocalFileSystem
        .getInstance()
        .findFileByIoFile(source)
        ?.delete(this)
}

fun RecipeExecutor.saveFile(
    source: File,
    content: String,
    force: Boolean = false
) {
    if (force) {
        deleteFile(source = source)
    }
    save(
        source = content,
        to = source
    )
}
