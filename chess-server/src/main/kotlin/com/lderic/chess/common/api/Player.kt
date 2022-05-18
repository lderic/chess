package com.lderic.chess.common.api

import io.ktor.server.websocket.*

interface Player {
    val session: WebSocketServerSession

    val name: String

    val state: PlayerState

    val room: Room

    val playerType: PlayerType

    fun isIdle(): Boolean {
        return state == PlayerState.IDLE
    }

    enum class PlayerState {
        IDLE,
        WAITING,
        PLAYING
    }

    enum class PlayerType {
        FIRST, SECOND, OBSERVER, NONE
    }
}
