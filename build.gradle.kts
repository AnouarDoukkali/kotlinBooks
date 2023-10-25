import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import io.gitlab.arturbosch.detekt.Detekt

plugins {
    alias(libs.plugins.dependencyUpdates)
    alias(libs.plugins.detekt)
    java
}

group = "org.anouar.kotlinBooks"
version = "1.0-SNAPSHOT"

dependencies {
    detektPlugins(libs.detektFormatting)
}

detekt {
    source.setFrom(file(projectDir))
    parallel = true
    autoCorrect = true

    tasks.withType<Detekt> {
        exclude("**/resources/**")
        exclude("**/build/**")
        include("**/*.kt")
        include("**/*.kts")
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)

    return isStable.not()
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    checkForGradleUpdate = true
    gradleReleaseChannel = "current"
}
