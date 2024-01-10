import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.versionCatalogs
import io.gitlab.arturbosch.detekt.Detekt

plugins {
    id("io.gitlab.arturbosch.detekt")
}

versionCatalogs.named("libs").findBundle("detekt").ifPresent { detekt ->
    dependencies {
        detektPlugins(detekt)
    }
}

detekt {
    source.setFrom(file(projectDir))
    parallel = true
    autoCorrect = true
    // baseline = file("$rootDir/config/detekt/baseline.xml")
    tasks.withType<Detekt> {
        exclude("**/resources/**")
        exclude("**/build/**")
        include("**/*.kt")
        include("**/*.kts")
    }
}
