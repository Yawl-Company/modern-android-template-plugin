package com.yawl.android.template.core.libs

class LibsToml(
    val versions: List<Version>,
    val libraries: List<Library>,
    val plugins: List<Plugin>,
) : Declaratable {
    override fun declaration(): String {
        return buildString {
            append("[versions]")
            versions.forEach { appendLine(it) }
            appendLine()
            append("[libraries]")
            libraries.forEach { appendLine(it) }
            appendLine()
            append("[plugins]")
            plugins.forEach { appendLine(it) }
            appendLine()
        }
    }
}

data class Plugin(
    private val toml: LibsVersionsTomlName,
    private val id: String,
    private val version: Version
) : Declaratable, Aliasable {
    override fun declaration(): String {
        val pluginAlias = alias()
        val versionAlias = version.alias()
        val pluginDescription = "{ id = \"$id\", version.ref = \"$versionAlias\" }"
        return "$pluginAlias = $pluginDescription"
    }

    override fun alias(): String {
        return "libs.plugins.${toml.alias()}"
    }
}

data class Library(
    private val toml: LibsVersionsTomlName,
    private val group: String,
    private val name: String,
    private val version: Version
) : Declaratable, Aliasable {
    override fun declaration(): String {
        val libraryName = toml.name()
        val versionName = version.name()
        val libraryDescription = "{ group = \"$group\", name = \"$name\", version.ref = \"$versionName\" }"
        return "$libraryName = $libraryDescription"
    }

    override fun alias(): String {
        throw IllegalStateException("No alias for library")
    }
}

data class Version(
    private val name: LibsVersionsTomlName,
    private val value: String
) : Nameable, Declaratable, Aliasable {
    override fun name(): String {
        return name.name()
    }

    override fun declaration(): String {
        return "$name = \"$value\""
    }

    override fun alias(): String {
        return "libs.versions.${name.alias()}"
    }
}

data class LibsVersionsTomlName(
    private val value: String
) : Nameable, Declaratable, Aliasable {
    init {
        require(value.matches(Regex("^[a-z]+(-[a-z]+)+$"))) {
            "Invalid alias format"
        }
    }

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