package kotlinlang.special

import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *Logger object
 */
object Logger {
    private val logging = KotlinLogging.logger {}

    /**
     *Log function
     */
    fun log(vararg items: Any?) {
        logging.info { "logger: ${items.joinToString()}" }
    }

    /**
     *generate random name
     */
    fun name(): String = listOf("Bob", "Alice", "Carol").random()

    /**
     *generate random number
     */
    fun number(): Int = listOf(1, 2, 3).random()
}
