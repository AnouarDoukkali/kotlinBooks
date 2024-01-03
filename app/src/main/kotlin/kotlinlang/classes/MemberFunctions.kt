package kotlinlang.classes

// a function that belongs to a class is called member function

private class HedgeHog {
    private fun memberFunction() {
        println("this is a member function")
    }

    fun accessMember() {
        this.memberFunction() // reference to a member function in the same class
    }
}

// Top-level functions exist by themselves and are not part of a class
private fun topLevelFunction() = println("this is a top level function")
