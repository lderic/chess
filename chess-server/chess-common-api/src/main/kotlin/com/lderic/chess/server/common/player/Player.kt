package com.lderic.chess.server.common.player

import com.lderic.chess.server.common.net.SessionHandler
import io.ktor.server.websocket.*

interface Player {
    val sessionHandler: SessionHandler

    val name: String

    val state: PlayerState

    val room: Room?

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
