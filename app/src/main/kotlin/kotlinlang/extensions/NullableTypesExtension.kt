package kotlinlang.extensions

private class Record(val id: Int?)

// this extension function allows to perform a check even for nullable variables
private fun Record?.isNull(): Boolean = this == null || id == null
