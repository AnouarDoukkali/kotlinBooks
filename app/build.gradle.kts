plugins {
    alias(libs.plugins.kotlin)
    application
}

dependencies {
    testImplementation(libs.kotest.runner)
    testImplementation(libs.kotest.assertion)
    testImplementation(libs.kotest.properties)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}
