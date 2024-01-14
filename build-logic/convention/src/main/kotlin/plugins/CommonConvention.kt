package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.kotlin.dsl.register

internal class CommonConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("anouar.plugins.DetektConvention")
                apply("anouar.plugins.DokkaConvention")
                apply("anouar.plugins.KotlinJvmConvention")
            }

            tasks.register<Copy>("copyPreCommitHook") {
                description = "Copy pre-commit git hook from the scripts to the .git/hooks folder."
                group = "git hooks"
                outputs.upToDateWhen { false }
                from("$rootDir/bashScripts/pre-commit")
                into("../.git/hooks/")
            }
        }
    }
}
