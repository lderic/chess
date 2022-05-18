package com.lderic.chess.common.api

interface Room {
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