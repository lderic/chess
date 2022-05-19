package com.lderic.chess.server.common.api.player

import io.ktor.server.websocket.*

interface PlayerManager {
    fun getPlayer(playerName: String): Player

    fun isExist(playerName: String): Boolean

    fun createPlayer(playerName: String, session: DefaultWebSocketServerSession): Player

    fun removePlayer(playerName: String)

    fun playerCount(): Int
}