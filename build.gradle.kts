import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    alias(libs.plugins.dependencyUpdates)
    alias(libs.plugins.detekt)
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlin)
}

group = "org.anouar.kotlinBooks"
version = "v1.0.0"
description = "Kotlin Books code examples"

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}
dependencies {
    detektPlugins(libs.bundles.detekt)
}

detekt {
    source.setFrom(file(projectDir))
    parallel = true
    autoCorrect = true
    // baseline = file("$rootDir/config/detekt/baseline.xml")
    tasks.withType<Detekt> {
        exclude("**/resources/**")
        exclude("**/build/**")
        include("**/*.kt")
        include("**/*.kts")
    }
}

tasks.withType<DependencyUpdatesTask> {
    checkForGradleUpdate = true
    gradleReleaseChannel = "current"
    fun isNonStable(version: String): Boolean {
        val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
        val regex = "^[0-9,.v-]+(-r)?$".toRegex()
        val isStable = stableKeyword || regex.matches(version)
        return isStable.not()
    }
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

tasks.dokkaHtmlMultiModule.configure {
    outputDirectory.set(layout.buildDirectory.dir("Documentation"))
    moduleName.set("Kotlin Books Documentation")
}

subprojects {
    val libs = rootProject.libs
    apply(plugin = libs.plugins.dokka.get().pluginId)
    tasks.withType<DokkaTaskPartial>().configureEach {
        outputDirectory.set(layout.buildDirectory.dir("Partial Documentation"))
        when (project.name) {
            "app" -> moduleName.set("Application")
        }
        dokkaSourceSets {
            configureEach {
                documentedVisibilities.set(
                    setOf(
                        Visibility.PUBLIC,
                        Visibility.PRIVATE,
                        Visibility.PROTECTED,
                        Visibility.INTERNAL
                    )
                )
                includes.from("README.md")
                skipEmptyPackages.set(true)
                skipDeprecated.set(false)
                suppressInheritedMembers.set(false)
                reportUndocumented.set(false)
                failOnWarning.set(false)
                jdkVersion.set(libs.versions.java.get().toInt())
            }
        }
    }
}
