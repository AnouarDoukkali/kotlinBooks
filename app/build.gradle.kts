plugins {
    alias(libs.plugins.dokka)
    id("KotlinConvention")
    application
}

kotlin {
    sourceSets {
        val main by getting {
            dependencies {
                implementation(kotlin("reflect"))
                implementation(libs.bundles.logging)
            }
        }
        val test by getting {
            dependencies {
                implementation(libs.bundles.kotest)
            }
        }
    }
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
    application {
        mainClass.set("MainKt")
    }
}
