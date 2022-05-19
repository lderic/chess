package com.lderic.chess.server.common.api.player

import io.ktor.server.websocket.*

interface Player {
    val session: DefaultWebSocketServerSession

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

    companion object {
        val None = object: Player {
            override val session: DefaultWebSocketServerSession
                get() = throw UnsupportedOperationException()

            override val name: String
                get() = throw UnsupportedOperationException()

            override val state: PlayerState
                get() = throw UnsupportedOperationException()

            override val room: Room
                get() = throw UnsupportedOperationException()

            override val playerType: PlayerType
                get() = throw UnsupportedOperationException()
        }
    }
}
