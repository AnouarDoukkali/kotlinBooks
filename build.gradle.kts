plugins {
    id("KotlinConvention")
    id("DependencyUpdateConvention")
    id("DetektConvention")
    id("DokkaConvention")
}

group = "org.anouar.kotlinBooks"
version = "v1.0.0"
description = "Kotlin Books code examples"

kotlin {
    jvmToolchain(21)
}
