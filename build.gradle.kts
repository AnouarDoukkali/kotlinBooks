plugins {
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.dokka) apply false
    alias(libs.plugins.detekt) apply false
    id("anouar.plugins.CommonConvention")
}

group = "org.anouar.kotlinBooks"
version = "v0.1.0"
description = "Kotlin Books code examples"
