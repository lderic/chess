package com.lderic.chess.server.common.player

import io.ktor.server.websocket.*

interface PlayerManager {
    val playerList: List<Player>

    val playerCount: Int

    fun getPlayer(playerName: String): Player?

    fun isExist(playerName: String): Boolean

    fun createPlayer(playerName: String, session: DefaultWebSocketServerSession): Player?

    fun removePlayer(playerName: String)
}