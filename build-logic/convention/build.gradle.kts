plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.kotlin)
    compileOnly(libs.detekt)
    compileOnly(libs.dokka)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("EmtpyConventionPlugin") {
            id = "anouar.plugins.EmptyConventionPlugin"
            implementationClass = "plugins.EmptyConventionPlugin"
        }
        register("KotlinJvmConvention") {
            id = "anouar.plugins.KotlinJvmConvention"
            implementationClass = "plugins.KotlinJvmConvention"
        }
        register("DetektConvention") {
            id = "anouar.plugins.DetektConvention"
            implementationClass = "plugins.DetektConvention"
        }
        register("DokkaConvention") {
            id = "anouar.plugins.DokkaConvention"
            implementationClass = "plugins.DokkaConvention"
        }
        register("CommonConvention") {
            id = "anouar.plugins.CommonConvention"
            implementationClass = "plugins.CommonConvention"
        }
    }
}
