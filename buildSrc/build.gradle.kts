plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

// defining the plugins being built
gradlePlugin {
    plugins {
        create("myPlugins") {
            id = "my-plugin"
            implementationClass = "convention.plugins.MyPlugin"
        }
        create("kotestImplementation") {
            id = "com.anouar.kotestImplementation"
            implementationClass = "com.anouar.convention.plugins.KotestImplementation"
        }
    }
}
