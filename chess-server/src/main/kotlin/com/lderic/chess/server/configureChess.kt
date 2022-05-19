package com.lderic.chess

import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.websocket.*

fun Application.configureChess() {
    routing {
        webSocket {

        }
    }
}