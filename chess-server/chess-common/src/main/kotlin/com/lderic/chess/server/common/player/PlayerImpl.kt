package com.lderic.chess.server.common.player

import com.lderic.chess.server.common.net.SessionHandler
import com.lderic.chess.server.common.player.Player
import com.lderic.chess.server.common.player.Room
import io.ktor.server.websocket.*

class PlayerImpl(
    override val name: String,
    override val sessionHandler: SessionHandler,
) : Player {
    override var room: Room? = null
        private set

    override var state: Player.PlayerState = Player.PlayerState.IDLE
        private set

    override var playerType: Player.PlayerType = Player.PlayerType.NONE
        private set

}