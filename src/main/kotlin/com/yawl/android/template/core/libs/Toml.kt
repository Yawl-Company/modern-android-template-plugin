package com.yawl.android.template.core.libs

import com.yawl.android.template.core.libs.part.Library
import com.yawl.android.template.core.libs.part.Plugin
import com.yawl.android.template.core.libs.part.Version

class LibsToml(
    val versions: List<VersionToml>,
    val libraries: List<LibraryToml>,
    val plugins: List<PluginToml>,
    val conventions: List<ConventionPluginToml>,
) : Declaratable {
    override fun declaration(): String {
        return buildString {
            append("[versions]")
            appendLine()
            versions.forEach { appendLine(it.declaration()) }
            appendLine()
            append("[libraries]")
            appendLine()
            libraries.forEach { appendLine(it.declaration()) }
            appendLine()
            append("[plugins]")
            appendLine()
            plugins.forEach { appendLine(it.declaration()) }
            appendLine()
            conventions.forEach { appendLine(it.declaration()) }
        }
    }
}

abstract class AbstractPluginToml(
    private val name: TomlName,
):  Declaratable, Aliasable, PluginBuildGradle {
    override fun alias(): String {
        return "libs.plugins.${name.alias()}"
    }

    override fun apply(apply: Boolean): String {
        return if (apply) {
            "alias(${alias()})"
        } else {
            "alias(${alias()}) apply false"
        }
    }
}

data class ConventionPluginToml(
    private val name: TomlName,
    private val plugin: Plugin
) : AbstractPluginToml(name = name) {
    override fun declaration(): String {
        val pluginName = name.name()
        val pluginDescription = "{ id = \"${plugin.id}\", version = \"unspecified\" }"
        return "$pluginName = $pluginDescription"
    }
}

data class PluginToml(
    private val name: TomlName,
    private val plugin: Plugin,
    private val version: VersionToml
) : AbstractPluginToml(name = name) {
    override fun declaration(): String {
        val pluginName = name.name()
        val pluginDescription = "{ id = \"${plugin.id}\", version.ref = \"${version.name()}\" }"
        return "$pluginName = $pluginDescription"
    }
}

data class LibraryToml(
    private val name: TomlName,
    private val library: Library,
    private val version: VersionToml
) : Declaratable, Aliasable, LibraryBuildGradle {
    override fun declaration(): String {
        val libraryName = name.name()
        val libraryDescription =
            "{ group = \"${library.group}\", name = \"${library.name}\", version.ref = \"${version.name()}\" }"
        return "$libraryName = $libraryDescription"
    }

    override fun alias(): String {
        return "libs.${name.alias()}"
    }

    override fun implementation(): String {
        return "implementation(${alias()})"
    }
}

data class VersionToml(
    private val name: TomlName,
    private val version: Version
) : Nameable, Declaratable, Aliasable, Valuable<String> {
    override fun name(): String {
        return name.name()
    }

    override fun declaration(): String {
        return "${name()} = \"${version.value}\""
    }

    override fun alias(): String {
        return "libs.versions.${name.alias()}"
    }

    override fun value(): String {
        return version.value
    }
}

data class TomlName(
    private val value: String
) : Nameable, Declaratable, Aliasable {
    override fun name(): String {
        return value
    }

    override fun declaration(): String {
        return value
    }

    override fun alias(): String {
        return value.replace("-", ".")
    }
}

interface Declaratable {
    fun declaration(): String
}

interface Aliasable {
    fun alias(): String
}

interface Nameable {
    fun name(): String
}

interface Valuable<T> {
    fun value(): T
}

interface PluginBuildGradle {
    fun apply(apply: Boolean): String
}

interface LibraryBuildGradle {
    fun implementation(): String
}