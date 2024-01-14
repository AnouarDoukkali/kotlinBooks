package plugins

import extensions.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinJvmConvention : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
            }
            configureKotlinJvm()
        }
    }
}
