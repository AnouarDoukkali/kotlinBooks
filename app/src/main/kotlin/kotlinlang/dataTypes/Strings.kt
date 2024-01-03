package kotlinlang.dataTypes

private fun stringTemplates() {
    val name = "anouar"
    println("hello $name $!") // replace $name by its content, but nothing happen for $!
    println("hello \$name ") // here the $ sign is actually a part of the string and should be printed.
    println("printing special characters  quote:\" dollar:\$ ") // printing special characters using backslashes '\'
    println("""   "we can escape single quotes inside triple quotes"  """)
}

private fun trimIndent(): String {
    return """
        this is    
        a multiline   
        string   
    """.trimIndent() // remove the common indentation in all lines
}
