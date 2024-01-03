// enableFeaturePreview("STABLE_CONFIGURATION_CACHE") --give warning when building the file
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "kotlinBooks"
include("app")
include("model")
include("view")
