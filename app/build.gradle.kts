plugins {
    id("KotestImplementation")
    alias(libs.plugins.kotlin)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}
