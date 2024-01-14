package extensions

import configuration.Config.jvm
import org.gradle.api.Project
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureKotlinJvm() {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = jvm.kotlinJvm
            val warningsAsErrors: String? by project
            allWarningsAsErrors = warningsAsErrors.toBoolean()
        }
    }
}
