package com.convention

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project

val Project.libs: LibrariesForLibs
    get() = extensions.getByType(LibrariesForLibs::class.java)
