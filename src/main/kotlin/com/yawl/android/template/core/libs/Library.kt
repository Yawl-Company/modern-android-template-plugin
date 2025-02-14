package com.yawl.android.template.core.libs

class LibsToml(
    val versions: List<Version>,
    val libraries: List<Library>,
    val plugins: List<Plugin>,
): LibsTomlDeclaratable {
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
    private val alias: LibsTomlAlias,
    private val id: String,
    private val version: Version
): LibsTomlDeclaratable {
    override fun declaration(): String {
        val pluginAlias = alias.value
        val pluginDescription = "{ id = \"$id\", version.ref = \"${version.name}\" }"
        return "$pluginAlias = $pluginDescription"
    }
}

data class Library(
    private val alias: LibsTomlAlias,
    private val group: String,
    private val name: String,
    private val version: Version
): LibsTomlDeclaratable {
    override fun declaration(): String {
        val libraryAlias = alias.value
        val libraryDescription = "{ group = \"$group\", name = \"$name\", version.ref = \"${version.name}\" }"
        return "$libraryAlias = $libraryDescription"
    }
}

data class LibsTomlAlias(
    val value: String
) {
    init {
        require(value.matches(Regex("^[a-z]+(-[a-z]+)+$"))) {
            "Invalid alias format"
        }
    }

    override fun toString(): String {
        return value.replace("-", ".")
    }
}

data class Version(
    val name: String,
    val value: String
): LibsTomlDeclaratable {
    override fun declaration(): String {
        return "$name = \"$value\""
    }
}

interface LibsTomlDeclaratable {
    fun declaration(): String
}
