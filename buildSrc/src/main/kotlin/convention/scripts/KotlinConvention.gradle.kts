plugins {
    kotlin("jvm")
}

// kotlin {
//     val versionCatalog = versionCatalogs.named("libs")
//     versionCatalog.findVersion("java").ifPresent {
//         jvmToolchain(
//             it.requiredVersion.toIntOrNull() ?: error("java version not set in version catalog")
//         )
//     }
// }
