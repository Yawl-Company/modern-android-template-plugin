package com.yawl.android.template.modern.libs

import com.android.tools.idea.wizard.template.RecipeExecutor
import com.yawl.android.template.core.AndroidTemplate
import com.yawl.android.template.core.libsVersionsTomlWriter

fun RecipeExecutor.libsWriter(
    template: AndroidTemplate
) {
    libsVersionsTomlWriter(
        template = template,
        content = template
            .libraries()
            .declaration()
    )
}
