package kotlinlang.special

import io.github.oshai.kotlinlogging.KotlinLogging

private val log = KotlinLogging.logger {}
fun ok() {
    log.info { "ok hello" }
}
