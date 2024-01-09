// a pre-compiled script that include another pre-compiled script

plugins {
    id("KotestAssertionsConvention")
}
val versionCatalog = versionCatalogs.named("libs")
dependencies {
    versionCatalog.findLibrary("kotest.properties").ifPresent { properties ->
        testImplementation(properties)
    }
}
