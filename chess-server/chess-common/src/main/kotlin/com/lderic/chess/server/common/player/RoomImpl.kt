package com.lderic.chess.server.common.player

import com.lderic.chess.server.common.piece.Board
import com.lderic.chess.server.common.player.Player
import com.lderic.chess.server.common.player.Room

class RoomImpl(override val name: String) : Room {
    override val board: Board
        get() = TODO("Not yet implemented")
    override val first: Player?
        get() = TODO("Not yet implemented")
    override val second: Player?
        get() = TODO("Not yet implemented")
    override val observers: List<Player>
        get() = TODO("Not yet implemented")
    override val state: Room.RoomState
        get() = TODO("Not yet implemented")

    override fun join(player: Player) {
        TODO("Not yet implemented")
    }

    override fun leave(player: Player) {
        TODO("Not yet implemented")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun changeBoard(board: Board) {
        TODO("Not yet implemented")
    }
}