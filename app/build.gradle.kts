plugins {
    id("com.anouar.kotestImplementation")
    alias(libs.plugins.kotlin)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}
