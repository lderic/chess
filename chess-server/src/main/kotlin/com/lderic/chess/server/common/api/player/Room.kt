package com.lderic.chess.server.common.api.player

import com.lderic.chess.server.common.api.piece.Board

interface Room {
    val board: Board

    val first: Player

    val second: Player

    val observers: List<Player>

    val state: RoomState

    fun join(player: Player)

    fun leave(player: Player)

    fun start()

    enum class RoomState {
        WAITING,
        CAN_START,
        STARTED
    }
}