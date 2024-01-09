plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

dependencies {
    implementation(libs.kotlin)
    implementation(libs.dependencyUpdates)
}

// defining the plugins being built
gradlePlugin {
    plugins {
        create("myPlugins") {
            id = "my-plugin"
            implementationClass = "convention.plugins.MyPlugin"
        }
        create("KotestCustomPlugin") {
            id = "com.anouar.KotestCustomPlugin"
            implementationClass = "convention.plugins.KotestCustomPlugin"
        }
    }
}

tasks.register<Copy>("copyPreCommitHook") {
    description = "Copy pre-commit git hook from the scripts to the .git/hooks folder."
    group = "git hooks"
    outputs.upToDateWhen { false }
    from("$rootDir/bashScripts/pre-commit")
    into("../.git/hooks/")
}
