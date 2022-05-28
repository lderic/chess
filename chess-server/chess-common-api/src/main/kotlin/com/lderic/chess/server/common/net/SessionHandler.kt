package com.lderic.chess.server.common.net

import io.ktor.server.websocket.*

interface SessionHandler {
    val session: DefaultWebSocketServerSession

    val onReceive: suspend (String) -> Unit

    suspend fun send(message: String)
}