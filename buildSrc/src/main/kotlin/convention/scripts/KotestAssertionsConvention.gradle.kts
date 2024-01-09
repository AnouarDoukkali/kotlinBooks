plugins {
    kotlin("jvm")
}

val versionCatalog = versionCatalogs.named("libs")

dependencies {
    versionCatalog.findLibrary("kotest.runner").ifPresent { runner ->
        testImplementation(runner)
    }
    versionCatalog.findLibrary("kotest.assertion").ifPresent { assertion ->
        testImplementation(assertion)
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
