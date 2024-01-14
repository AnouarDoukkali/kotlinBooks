package configuration

import org.gradle.api.JavaVersion
import org.jetbrains.dokka.DokkaConfiguration.Visibility

internal object Config {
    // override default configuration here
    val jvm = DefaultConfig().JvmConfig()
    val detekt = DefaultConfig().DetektConfig()
    val dokka = DefaultConfig().DokkaConfig()
}

class DefaultConfig {

    private val rootDir = System.getProperty("user.dir")

    inner class JvmConfig(
        val javaVersion: JavaVersion = JavaVersion.VERSION_21,
        val kotlinJvm: String = JavaVersion.VERSION_21.toString()
    )

    inner class DetektConfig(
        val configFile: String = "$rootDir/config/detekt/detekt.yml",
        val source: Set<String> = setOf(rootDir, "$rootDir/build-logic", "$rootDir/buildSrc"),
        val baseline: String = " $rootDir/config/detekt/baseline.xml",
        val parallel: Boolean = true,
        val autoCorrect: Boolean = true,
        val exclude: List<String> = listOf("**/resources/**", "**/build/**"),
        val include: List<String> = listOf("**/*.kt", "**/*.kts", "**/**/*.kt")
    )

    inner class DokkaConfig(
        val rootModuleName: String = "Kotlin Books Documentation",
        val rootModuleDocFolderName: String = "Documentation",
        val subModulesDocFolderName: String = "Partial Documentation",
        val configCacheCompatibility: String = "DokkaMultiModuleTask is not compatible with configuration cache",
        val elenmentsVisibility: Set<Visibility> = setOf(
            Visibility.INTERNAL,
            Visibility.PUBLIC,
            Visibility.PRIVATE,
            Visibility.PROTECTED,
        ),
        val packageDocumentationFileName: String = "README.md",
        val skipEmptyPackages: Boolean = true,
        val skipDeprecated: Boolean = false,
        val suppressInheritedMembers: Boolean = false,
        val reportUndocumented: Boolean = false,
        val failOnWarning: Boolean = false
    )
}
