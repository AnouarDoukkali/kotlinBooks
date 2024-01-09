import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    alias(libs.plugins.detekt)
    alias(libs.plugins.dokka)
    id("KotlinConvention")
    id("DependencyUpdateConvention")
}

group = "org.anouar.kotlinBooks"
version = "v1.0.0"
description = "Kotlin Books code examples"

kotlin {
    jvmToolchain(21)
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
