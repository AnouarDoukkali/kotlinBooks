import io.github.oshai.kotlinlogging.KotlinLogging

internal val logger = KotlinLogging.logger {}

fun main() {
    logger.debug { "Hello, World!" }
}
