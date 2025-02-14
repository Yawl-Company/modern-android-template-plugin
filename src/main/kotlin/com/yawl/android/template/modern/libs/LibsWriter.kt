package com.yawl.android.template.modern.libs

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.libsVersionsTomlWriter
import com.yawl.android.template.modern.IMaTemplate
import com.yawl.android.template.modern.libs.content.libsToml

fun RecipeExecutor.libsWriter(
    template: IMaTemplate
) {
    libsVersionsTomlWriter(
        template = template,
        content = libsToml()
    )
}
