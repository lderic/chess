package com.lderic.chess

import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    val server = embeddedServer(Netty, port = 18888, host = "0.0.0.0") {
        configureChess()
    }

    server.start(wait = true)
}