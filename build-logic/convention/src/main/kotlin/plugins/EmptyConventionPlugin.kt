package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class EmptyConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
        }
    }
}
