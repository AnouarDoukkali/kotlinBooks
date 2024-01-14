package plugins

import extensions.configureDokka
import org.gradle.api.Plugin
import org.gradle.api.Project

class DokkaConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.dokka")
            }
            configureDokka()
        }
    }
}
