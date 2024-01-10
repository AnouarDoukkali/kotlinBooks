import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

tasks.withType<DokkaMultiModuleTask>().configureEach {
    notCompatibleWithConfigurationCache("DokkaMultiModuleTask is not compatible with configuration cache")
    outputDirectory.set(layout.buildDirectory.dir("Documentation"))
    moduleName.set("Kotlin Books Documentation")
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
    tasks.withType<DokkaTaskPartial>().configureEach {
        notCompatibleWithConfigurationCache("DokkaTaskPartial is not compatible with configuration cache")
        outputDirectory.set(layout.buildDirectory.dir("Partial Documentation"))
        when (project.name) {
            "app" -> moduleName.set("Application")
        }
        dokkaSourceSets {
            configureEach {
                documentedVisibilities.set(
                    setOf(
                        DokkaConfiguration.Visibility.INTERNAL,
                        DokkaConfiguration.Visibility.PUBLIC,
                        DokkaConfiguration.Visibility.PRIVATE,
                        DokkaConfiguration.Visibility.PROTECTED,
                    )
                )
                includes.from("README.md")
                skipEmptyPackages.set(true)
                skipDeprecated.set(false)
                suppressInheritedMembers.set(false)
                reportUndocumented.set(false)
                failOnWarning.set(false)
            }
        }
    }
}
