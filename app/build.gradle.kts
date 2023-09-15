plugins {
    alias(libs.plugins.kotlin)
    application
}

kotlin {
    jvmToolchain(20)
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}
