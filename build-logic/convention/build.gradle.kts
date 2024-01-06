plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.detekt.gradlePlugin)
}

// defining the plugins being built
gradlePlugin {
    plugins {
        register("DetektConventionPlugin") {
            id = "DetektConventionPlugin"
            implementationClass = "convention.plugins.DetektConventionPlugin"
        }
    }
}
