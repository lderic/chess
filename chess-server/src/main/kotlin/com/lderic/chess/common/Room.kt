package com.lderic.chess.common

class Room(
    val name: String
) {
    var first: Player? = null
    var second: Player? = null

    val watcher = mutableListOf<Player>()

    val players: HashMap<String, Player> = hashMapOf()

    @Synchronized
    fun addPlayer(player: Player) {
        if (players.contains(player.name)) return

        players[player.name] = player
        first ?: run {
            first = player
            return
        }
        second ?: run {
            second = player
            return
        }
        watcher.add(player)
    }

    @Synchronized
    fun quitPlayer(name: String) {
        players.remove(name)
        when (name) {
            first?.name -> {
                first = null
                return
            }
            second?.name -> {
                second = null
                return
            }
        }
        watcher.removeIf {
            it.name == name
        }
    }
}