package com.lderic.chess.server.common.player

interface RoomManager {
    val roomList: List<Room>

    val roomCount: Int

    fun createRoom(roomName: String): Room?

    fun getRoom(roomName: String): Room?

    fun isExist(roomName: String): Boolean

    fun removeRoom(roomName: String)
}