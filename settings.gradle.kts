// enableFeaturePreview("STABLE_CONFIGURATION_CACHE") --give warning when building the file
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }
    includeBuild("build-logic")
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

rootProject.name = "kotlinBooks"
include("app")
include("unit")
include("unitTest")
include("app:unitTest")
findProject(":app:unitTest")?.name = "unitTest"
