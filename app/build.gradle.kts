plugins {
    id("org.jetbrains.dokka")
    kotlin("jvm")
    application
}

application {
    mainClass.set("MainKt")
}

// tasks.withType<DokkaTaskPartial>().configureEach {
//     notCompatibleWithConfigurationCache("Dokka is not compatible with configuration cache")
//     outputDirectory.set(layout.buildDirectory.dir("Partial Documentation"))
//     when (project.name) {
//         "app" -> moduleName.set("Application")
//     }
//     dokkaSourceSets {
//         configureEach {
//             documentedVisibilities.set(
//                 setOf(
//                     DokkaConfiguration.Visibility.INTERNAL,
//                     DokkaConfiguration.Visibility.PUBLIC,
//                     DokkaConfiguration.Visibility.PRIVATE,
//                     DokkaConfiguration.Visibility.PROTECTED,
//                 )
//             )
//             includes.from("README.md")
//             skipEmptyPackages.set(false)
//             skipDeprecated.set(false)
//             suppressInheritedMembers.set(false)
//             reportUndocumented.set(false)
//             failOnWarning.set(false)
//         }
//     }
// }
