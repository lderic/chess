package com.lderic.chess.server.common.player

import com.lderic.chess.server.common.player.Room
import com.lderic.chess.server.common.player.RoomManager

object DefaultRoomManager: RoomManager {
    private val rooms = mutableMapOf<String, Room>()

    override val roomList: List<Room>
        get() = rooms.values.toList()

    override val roomCount: Int
        get() = rooms.size

    @Synchronized
    override fun createRoom(roomName: String): Room? {
        if (rooms.containsKey(roomName)) {
            return null
        }
        val room = RoomImpl(roomName)
        rooms[roomName] = room
        return room
    }

    @Synchronized
    override fun getRoom(roomName: String): Room? {
        return rooms[roomName]
    }

    @Synchronized
    override fun isExist(roomName: String): Boolean {
        return rooms.containsKey(roomName)
    }

    @Synchronized
    override fun removeRoom(roomName: String) {
        rooms.remove(roomName)
    }
}