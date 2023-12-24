package kotlinlang.visibility

// internal limit the visibility to the module where the file is located , won't be visible in 'model' module
// you still need to include a module in the build file to access their members
internal fun helloAgain() {
    println("this function is visible in the whole module app only")
}
