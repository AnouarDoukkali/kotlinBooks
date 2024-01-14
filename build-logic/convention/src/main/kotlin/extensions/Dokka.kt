package extensions

import configuration.Config.dokka
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.withType
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial

internal fun Project.configureDokka() {
    tasks.withType<DokkaMultiModuleTask>().configureEach {
        notCompatibleWithConfigurationCache(dokka.configCacheCompatibility)
        outputDirectory.set(layout.buildDirectory.dir(dokka.rootModuleDocFolderName))
        moduleName.set(dokka.rootModuleName)
    }
    tasks.withType<DokkaTask>().configureEach {
        notCompatibleWithConfigurationCache(dokka.configCacheCompatibility)
    }
    subprojects {
        tasks.withType<DokkaTaskPartial>().configureEach {
            notCompatibleWithConfigurationCache(dokka.configCacheCompatibility)
            outputDirectory.set(layout.buildDirectory.dir(dokka.subModulesDocFolderName))
            dokkaSourceSets {
                configureEach {
                    documentedVisibilities.set(
                        dokka.elenmentsVisibility
                    )
                    with(dokka.packageDocumentationFileName) {
                        val file = file(this)
                        if (!file.exists()) {
                            file.createNewFile()
                        }
                        includes.from(file)
                    }

                    skipEmptyPackages.set(dokka.skipEmptyPackages)
                    skipDeprecated.set(dokka.skipDeprecated)
                    suppressInheritedMembers.set(dokka.suppressInheritedMembers)
                    reportUndocumented.set(dokka.reportUndocumented)
                    failOnWarning.set(dokka.failOnWarning)
                }
            }
        }
    }
}
