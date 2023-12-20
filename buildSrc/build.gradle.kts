plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}
// necessary to access version catalog directly in pre-compiled scripts
dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

// defining the plugins being built
gradlePlugin {
    plugins {
        create("myPlugins") {
            id = "my-plugin"
            implementationClass = "com.anouar.convention.plugins.MyPlugin"
        }
        create("KotestCustomPlugin") {
            id = "com.anouar.KotestCustomPlugin"
            implementationClass = "com.anouar.convention.plugins.KotestCustomPlugin"
        }
    }
}
