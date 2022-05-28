package com.lderic.chess.server.common.player

import io.ktor.server.websocket.*

object DefaultPlayerManager : PlayerManager {
    private val players = mutableMapOf<String, Player>()

    override val playerList: List<Player>
        get() = players.values.toList()

    override val playerCount: Int
        get() = players.size

    @Synchronized
    override fun getPlayer(playerName: String): Player? {
        return players[playerName]
    }

    @Synchronized
    override fun isExist(playerName: String): Boolean {
        return players.containsKey(playerName)
    }

    @Synchronized
    override fun createPlayer(playerName: String, session: DefaultWebSocketServerSession): Player? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        if (players.containsKey(playerName)) {
//            return null
//        }
//        val player = PlayerImpl(playerName, session)
//        players[playerName] = player
//        return player
    }

    @Synchronized
    override fun removePlayer(playerName: String) {
        players.remove(playerName)
    }
}