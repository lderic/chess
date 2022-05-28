package com.lderic.chess.server.common.player

import com.lderic.chess.server.common.piece.Board

interface Room {
    val board: Board

    val name: String

    val first: Player?

    val second: Player?

    val observers: List<Player>

    val state: RoomState

    fun join(player: Player)

    fun leave(player: Player)

    fun start()

    fun changeBoard(board: Board)

    enum class RoomState {
        WAITING,
        CAN_START,
        STARTED
    }
}