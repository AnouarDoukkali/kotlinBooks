package convention.plugins


import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class DetektConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("io.gitlab.arturbosch.detekt")

            val extension = extensions.getByType<DetektExtension>()
            extension.apply {
                source.setFrom(file("$rootDir/config/detekt/config.yml"))
                parallel = true
                autoCorrect = true
            }
            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            dependencies {
                "detektPlugins"(libs.findBundle("detekt").get())
            }
        }
    }
}