package extensions

import configuration.Config
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

internal fun Project.configureDetekt(extension: DetektExtension) =
    extension.apply {
        parallel = Config.detekt.parallel
        autoCorrect = Config.detekt.autoCorrect
        config.setFrom(Config.detekt.configFile)
        source.setFrom(Config.detekt.source)
        tasks.withType<Detekt> {
            exclude(Config.detekt.exclude)
            include(Config.detekt.include)
        }
        dependencies {
            add("detektPlugins", versionCatalog().findBundle("detekt").get())
        }
    }
