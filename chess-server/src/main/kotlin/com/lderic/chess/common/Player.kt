package com.lderic.chess.common

import io.ktor.server.websocket.*

class Player(
    val session: WebSocketServerSession,
    val name: String
) {

}